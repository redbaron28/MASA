package com.theaudiobros.rocketship;


import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class GetBlockAt {

    public static Material getBlockAtLoc(World world, int x, int y, int z){
        Block block = world.getBlockAt(new Location(world, x, y, z));
        Material blockMat = block.getType();
        return blockMat;
    }

    public static Material getBlockAtLoc(Location location){
        Block block = location.getWorld().getBlockAt(location);
        Material blockMat = block.getType();
        return blockMat;
    }

    public static void setBlockAtLoc(Location location, Material material){
        Block block = location.getBlock();
        block.setType(material);
    }

    public static void setBlockAtLoc(World world, int x, int y, int z, Material material){
        Block block = new Location(world, x, y, z).getBlock();
        block.setType(material);
    }

}
