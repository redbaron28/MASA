package com.theaudiobros.uranus;

import com.theaudiobros.mars.BedrockPopulator;
import com.theaudiobros.masa.MASA;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.util.noise.SimplexOctaveGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UranusChunkGenerator extends ChunkGenerator {

    @Override
    public ChunkData generateChunkData(World world, Random rand, int ChunkX, int ChunkZ, BiomeGrid biome) {

        ChunkData data = this.createChunkData(world);

        SimplexOctaveGenerator gen1 = new SimplexOctaveGenerator(world, 8);
        SimplexOctaveGenerator gen2 = new SimplexOctaveGenerator(world, 8);
        SimplexOctaveGenerator gen3 = new SimplexOctaveGenerator(world, 8);
        gen1.setScale(1 / 64.0);
        gen2.setScale(1 / 64.0);
        gen3.setScale(1 / 64.0);

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {

                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk
                double frequency = 0.5; // the reciprocal of the distance between points
                double amplitude = 0.5; // The distance between largest min and max values
                int multitude = 10; //how much we multiply the value between -1 and 1. It will determine how "steep" the hills will be.
                int sea_level = 64;

                double maxHeight = gen1.noise(realX, realZ, frequency, amplitude) * multitude + sea_level;
                for (int y = 0; y < maxHeight; y++) {
                    data.setBlock(x, y, z, Material.CONCRETE.getId(), (byte) 3);
                }
            }
        }

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {

                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk
                double frequency = 0.5; // the reciprocal of the distance between points
                double amplitude = 0.5; // The distance between largest min and max values
                int multitude = -16; //how much we multiply the value between -1 and 1. It will determine how "steep" the hills will be.
                int sea_level = 64;

                double maxHeight = gen2.noise(realX, realZ, frequency, amplitude) * multitude + sea_level;
                for (int y = 0; y < maxHeight; y++) {
                    data.setBlock(x, y, z, Material.CONCRETE.getId(), (byte) 3);
                }
            }
        }

        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {

                int realX = x + ChunkX * 16; //used so that the noise function gives us
                int realZ = z + ChunkZ * 16; //different values each chunk
                double frequency = 0.5; // the reciprocal of the distance between points
                double amplitude = 0.5; // The distance between largest min and max values
                int multitude = 8; //how much we multiply the value between -1 and 1. It will determine how "steep" the hills will be.
                int sea_level = 60;

                double maxHeight = gen3.noise(realX, realZ, frequency, amplitude) * multitude + sea_level;
                for (int y = 0; y < maxHeight; y++) {
                    data.setBlock(x, y, z, Material.CONCRETE.getId(), (byte) 3);
                }
            }
        }


        return data;
    }


    @Override
    public List<BlockPopulator> getDefaultPopulators(World world) {
        ArrayList<BlockPopulator> pops = new ArrayList<BlockPopulator>();
        pops.add(new BedrockPopulator());
        pops.add(new OrePopulator(MASA.getInstance()));
        return pops;
    }

}
