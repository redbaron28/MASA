package com.theaudiobros.gabriel.moon.earth;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class BedrockPopulator extends BlockPopulator{

    @Override
    public void populate(World world, Random rand, Chunk chunk) {
        for (int x=0; x<16; x++) {
            for (int z=0;z<16;z++) {
                int realX = x + chunk.getX() * 16; //find the world location of chunk location x
                int realZ = z + chunk.getZ() * 16;
                world.getBlockAt(realX, 0, realZ).setType(Material.BEDROCK);
            }
        }
    }

}
