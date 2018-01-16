package com.theaudiobros.gabriel.rocketship;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;

import java.util.ArrayList;

public class AddBlocks {


    public AddBlocks(){

    }

    public static boolean threeXThreeXOne(Location sign, Material material, World world){

        World world2 = sign.getWorld();
        Material material2 = Material.AIR;

        if(CheckDirection.CheckDirection(sign) == "x++"){
            int xXplus = sign.getBlockX();
            int yXplus = sign.getBlockY()+1;
            int zXplus = sign.getBlockZ()-1;
            if(GetBlockAt.getBlockAtLoc(world2, xXplus, yXplus, zXplus) == material) {
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                xXplus = xXplus - 2;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                xXplus = xXplus - 2;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                return true;
            }
        } else if(CheckDirection.CheckDirection(sign) == "x--"){
            int xXplus = sign.getBlockX();
            int yXplus = sign.getBlockY()+1;
            int zXplus = sign.getBlockZ()+1;
            if(GetBlockAt.getBlockAtLoc(world2, xXplus, yXplus, zXplus) == material) {
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                xXplus = xXplus + 2;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                xXplus = xXplus + 2;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                return true;
            }
        } else if(CheckDirection.CheckDirection(sign) == "z++"){
            int xXplus = sign.getBlockX()+1;
            int yXplus = sign.getBlockY()+1;
            int zXplus = sign.getBlockZ();
            if(GetBlockAt.getBlockAtLoc(world2, xXplus, yXplus, zXplus) == material) {
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 2;
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 2;
                xXplus = xXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                return true;
            }
        } else if(CheckDirection.CheckDirection(sign) == "z--"){
            int xXplus = sign.getBlockX()-1;
            int yXplus = sign.getBlockY()+1;
            int zXplus = sign.getBlockZ();
            if(GetBlockAt.getBlockAtLoc(world2, xXplus, yXplus, zXplus) == material) {
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 2;
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus + 2;
                xXplus = xXplus + 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                zXplus = zXplus - 1;
                GetBlockAt.setBlockAtLoc(world, xXplus, yXplus, zXplus, material);
                GetBlockAt.setBlockAtLoc(world2, xXplus, yXplus, zXplus, material2);
                return true;
            }
        }

        return false;
    }


    public static boolean setGetOne(Location block, Material material, World world){
        World world2 = block.getWorld();
        Material material2 = Material.AIR;
        if(GetBlockAt.getBlockAtLoc(block) == material){
            GetBlockAt.setBlockAtLoc(new Location(world, block.getBlockX(), block.getBlockY(), block.getBlockZ()), material);
            GetBlockAt.setBlockAtLoc(new Location(world2, block.getBlockX(), block.getBlockY(), block.getBlockZ()), material2);
            return true;
        }

        return false;
    }

    public static boolean setGetSign(Sign sign, World world){

        World world2 = sign.getWorld();
        Material material2 = Material.AIR;

        GetBlockAt.setBlockAtLoc(new Location(world, sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ()), Material.SIGN);

        Sign signFrom = sign;
        Sign signTo = (Sign) world.getBlockAt(new Location(world, sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ()));

        signTo.setLine(0, signFrom.getLine(0));
        signTo.setLine(1, signFrom.getLine(1));
        signTo.setLine(2, signFrom.getLine(2));
        signTo.setLine(3, signFrom.getLine(3));
        signTo.update();

        GetBlockAt.setBlockAtLoc(new Location(world2, sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ()), material2);
        return true;
    }


    public static boolean setGetOneBlock(World rocketTo, int x, int y, int z, Material material, World rocketFrom){
        Material air = Material.AIR;
        if(GetBlockAt.getBlockAtLoc(rocketFrom, x, y, z) == material) {
            GetBlockAt.setBlockAtLoc(rocketTo, x, y, z, material);
            GetBlockAt.setBlockAtLoc(rocketFrom, x, y, z, air);
            return true;
        }
        return false;
    }

}
