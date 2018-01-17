package com.theaudiobros.mars;

import com.theaudiobros.masa.MASA;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MarsChunkGenerator extends ChunkGenerator{


    @Override
    public ChunkData generateChunkData(World world, Random rand, int ChunkX, int ChunkZ, BiomeGrid biome) {

        ChunkData data = this.createChunkData(world);

        SimplexOctaveGenerator gen1 = new SimplexOctaveGenerator(world,8);
        SimplexOctaveGenerator gen2 = new SimplexOctaveGenerator(world,8);
        SimplexOctaveGenerator gen3 = new SimplexOctaveGenerator(world,8);
        gen1.setScale(1/64.0);
        gen2.setScale(1/64.0);
        gen3.setScale(1/64.0);

        /* *
        SimplexOctaveGenerator gen1 = new SimplexOctaveGenerator(world,8);
        gen1.setScale(1/32.0); //how "scaled" the noise generator should be.

        byte[][] chunk = new byte[world.getMaxHeight() / 16][];

        for (int x=0; x<16; x++) {
            for (int z=0; z<16; z++) {
                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk

                for (int y=64;y<128;y++) {
                    double density = gen1.noise(realX,y, realZ, 0.5, 0.5); //note 3d noise is VERY slow, I recommend using 2d noise to limit the number of 3d noise values that must be calculated.
                    double threshold = 0.0; //the noise function returns values between -1 and 1.
                    if (density > threshold) {
                        setBlock(x,y,z,chunk,Material.STONE);
                    }
                }
            }
        }
* */
        for (int x=0; x<16; x++) {
            for (int z=0; z<16; z++) {

                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk
                double frequency = 0.5; // the reciprocal of the distance between points
                double amplitude = 0.5; // The distance between largest min and max values
                int multitude = 40; //how much we multiply the value between -1 and 1. It will determine how "steep" the hills will be.
                int sea_level = 64;

                double maxHeight = gen1.noise(realX, realZ, frequency, amplitude) * multitude + sea_level;
                for (int y=0;y<maxHeight;y++) {
                    data.setBlock(x, y, z, Material.STAINED_CLAY.getId(), (byte) 1);
                }
            }
        }

        for (int x=0; x<16; x++) {
            for (int z=0; z<16; z++) {

                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk
                double frequency = 0.5; // the reciprocal of the distance between points
                double amplitude = 0.5; // The distance between largest min and max values
                int multitude = -16; //how much we multiply the value between -1 and 1. It will determine how "steep" the hills will be.
                int sea_level = 64;

                double maxHeight = gen2.noise(realX, realZ, frequency, amplitude) * multitude + sea_level;
                for (int y=0;y<maxHeight;y++) {
                    data.setBlock(x, y, z, Material.STAINED_CLAY.getId(), (byte) 1);
                }
            }
        }

        for (int x=0; x<16; x++) {
            for (int z=0; z<16; z++) {

                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk
                double frequency = 0.5; // the reciprocal of the distance between points
                double amplitude = 0.5; // The distance between largest min and max values
                int multitude = -1; //how much we multiply the value between -1 and 1. It will determine how "steep" the hills will be.
                int sea_level = 64;

                double maxHeight = gen3.noise(realX, realZ, frequency, amplitude) * multitude + sea_level;
                for (int y=0;y<maxHeight;y++) {
                    data.setBlock(x, y, z, Material.STAINED_CLAY.getId(), (byte) 1);

                }
            }
        }


        return data;
    }






    @Override
    public List<BlockPopulator> getDefaultPopulators(World world) {
        ArrayList<BlockPopulator> pops = new ArrayList<BlockPopulator>();
        pops.add(new BedrockPopulator());
        pops.add(new MagmaPopulator());
        pops.add(new OrePopulator(MASA.getInstance()));
        return pops;
    }

}