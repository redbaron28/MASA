package com.theaudiobros.gabriel.mars;

import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.generator.BlockPopulator;

import java.util.Random;

public class MagmaPopulator extends BlockPopulator {

    @Override
    public void populate(World world, Random rand, Chunk chunk) {
        for (int x = 0; x < 16; x++) {
            for (int z = 0; z < 16; z++) {
                int realX = x + chunk.getX() * 16; //find the world location of chunk location x
                int realZ = z + chunk.getZ() * 16;
                int y = rand.nextInt(1000);
                if(y < 10)
                world.getBlockAt(realX, y, realZ).setType(Material.MAGMA);
            }
        }
    }

}
