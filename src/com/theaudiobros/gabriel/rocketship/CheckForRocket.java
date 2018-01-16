package com.theaudiobros.gabriel.rocketship;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;

public class CheckForRocket {

    public static boolean tier1(World world, Location location){

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();


        if(GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.GOLD_BLOCK){
            Bukkit.broadcastMessage(GetBlockAt.getBlockAtLoc(world, x, y+1, z).toString());
            if(GetBlockAt.getBlockAtLoc(world, x, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+2, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+6, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+7, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z+1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y, z+1) == Material.IRON_BLOCK
                    ){
                return true;
            }
        } else if(GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.GOLD_BLOCK){
            if(GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y+4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z-1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z-1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+7, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x-2, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+2, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+2, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-2, y+4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+6, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+6, z-1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-2, y, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.IRON_BLOCK)
                return true;
        } else if(GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.GOLD_BLOCK){
            if(GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y+7, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+8, z+1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z+2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+2) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z+2) == Material.IRON_BLOCK)
                return true;
        } else if(GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 2, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 6, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z-1) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 8, z-1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z-2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z-2) == Material.IRON_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z-2) == Material.IRON_BLOCK)
                return true;
        }
        return false;
    }

    public static boolean tier2(World world, Location location){

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();


        if(GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.GOLD_BLOCK){
            Bukkit.broadcastMessage(GetBlockAt.getBlockAtLoc(world, x, y+1, z).toString());
            if(GetBlockAt.getBlockAtLoc(world, x, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+2, z-1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+6, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z-1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+7, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z-1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z+1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z+1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.REDSTONE_BLOCK  && GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.REDSTONE_BLOCK  && GetBlockAt.getBlockAtLoc(world, x+2, y, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y, z+1) == Material.REDSTONE_BLOCK
                    ){
                return true;
            }
        } else if(GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.GOLD_BLOCK){
            if(GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z-1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y+4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z-1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z-1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z-1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+7, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x-2, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+2, z+1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+2, z-1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-2, y+4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+6, z+1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+6, z-1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-2, y, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y, z+1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.REDSTONE_BLOCK)
                return true;
        } else if(GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.GOLD_BLOCK){
            if(GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z+1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y+7, z+1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+8, z+1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+2, z+2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+2) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+4, z+2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+5, z+2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z+2) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+2) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+2) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z+2) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z+2) == Material.REDSTONE_BLOCK)
                return true;
        } else if(GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 2, z-1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z-1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 3, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 4, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 5, z-1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z-1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 6, z-1) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z-1) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z-1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 8, z-1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z-2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z-2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z-2) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z-2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z-2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z-2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z-2) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z-2) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z-2) == Material.REDSTONE_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z-2) == Material.REDSTONE_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z-2) == Material.REDSTONE_BLOCK)
                return true;
        }
        return false;
    }
    public static boolean tier3(World world, Location location) {

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();


        if (GetBlockAt.getBlockAtLoc(world, x + 1, y, z) == Material.GOLD_BLOCK) {
            Bukkit.broadcastMessage(GetBlockAt.getBlockAtLoc(world, x, y + 1, z).toString());
            if (GetBlockAt.getBlockAtLoc(world, x, y + 1, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 2, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 3, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 6, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 7, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 1, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 1, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 2, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 2, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 3, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 3, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 2, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 6, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 6, z + 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y, z + 1) == Material.GOLD_BLOCK
                    ) {
                return true;
            }
        } else if (GetBlockAt.getBlockAtLoc(world, x - 1, y, z) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z - 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z - 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 7, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 1, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 1, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 2, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 2, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 3, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 3, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 2, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 6, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 6, z - 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 2, y, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z + 1) == Material.GOLD_BLOCK)
                return true;
        } else if (GetBlockAt.getBlockAtLoc(world, x, y, z + 1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z + 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 1) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z + 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z + 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 8, z + 1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z + 2) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z + 2) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z + 2) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z + 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z + 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z + 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z + 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z + 2) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y, z + 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y, z + 2) == Material.GOLD_BLOCK)
                return true;
        } else if (GetBlockAt.getBlockAtLoc(world, x, y, z - 1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z - 1) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z - 1) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z - 1) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z - 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 8, z - 1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z - 2) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z - 2) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z - 2) == Material.GOLD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z - 2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z - 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z - 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z - 2) == Material.GOLD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y, z) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y, z - 2) == Material.GOLD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y, z - 2) == Material.GOLD_BLOCK)
                return true;
        }
        return false;
    } public static boolean tier4(World world, Location location) {

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();


        if (GetBlockAt.getBlockAtLoc(world, x + 1, y, z) == Material.GOLD_BLOCK) {
            Bukkit.broadcastMessage(GetBlockAt.getBlockAtLoc(world, x, y + 1, z).toString());
            if (GetBlockAt.getBlockAtLoc(world, x, y + 1, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 2, z - 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 3, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 6, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z - 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z + 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 7, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x + 1, y + 8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 1, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 1, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 2, z - 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 2, z + 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 3, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 3, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 2, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 2, y + 6, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y + 6, z + 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 2, y, z + 1) == Material.DIAMOND_BLOCK
                    ) {
                return true;
            }
        } else if (GetBlockAt.getBlockAtLoc(world, x - 1, y, z) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z - 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z - 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z + 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z - 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z - 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 7, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x - 1, y + 8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 1, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 1, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 2, z + 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 2, z - 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 3, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 3, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 2, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 2, y + 6, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y + 6, z - 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 2, y, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 2, y, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z + 1) == Material.DIAMOND_BLOCK)
                return true;
        } else if (GetBlockAt.getBlockAtLoc(world, x, y, z + 1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z + 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z + 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z + 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 1) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z + 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z + 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z + 1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 8, z + 1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z + 2) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z + 2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z + 2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z + 2) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z + 2) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z + 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z + 2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z + 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z + 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z + 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z + 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z + 2) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x + 1, y, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y, z + 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y, z + 2) == Material.DIAMOND_BLOCK)
                return true;
        } else if (GetBlockAt.getBlockAtLoc(world, x, y, z - 1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z - 1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z - 1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z - 1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z - 1) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z - 1) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z - 1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z - 1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z - 1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 8, z - 1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 1, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 1, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 1, z - 2) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 2, z - 2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 2, z - 2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 2, z - 2) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 3, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 3, z - 2) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 4, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 4, z - 2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x + 1, y + 4, z - 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 5, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 5, z - 2) == Material.IRON_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 5, z - 2) == Material.IRON_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x - 1, y + 6, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y + 6, z - 2) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x - 1, y, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x - 1, y, z - 2) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x + 1, y, z - 2) == Material.DIAMOND_BLOCK)
                return true;
        }
        return false;
    } public static boolean tier5(World world, Location location){

        int x = location.getBlockX();
        int y = location.getBlockY();
        int z = location.getBlockZ();


        if(GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.GOLD_BLOCK){
            Bukkit.broadcastMessage(GetBlockAt.getBlockAtLoc(world, x, y+1, z).toString());
            if(GetBlockAt.getBlockAtLoc(world, x, y+1, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+2, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x, y+3, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+4, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x, y+5, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x, y+6, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z-1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z-1) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+7, z) == Material.END_BRICKS && GetBlockAt.getBlockAtLoc(world, x+1, y+8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+1, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+2, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+3, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+2, y+4, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+2, y+5, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y+6, z+1) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.EMERALD_BLOCK  && GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.EMERALD_BLOCK  && GetBlockAt.getBlockAtLoc(world, x+2, y, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+2, y, z+1) == Material.EMERALD_BLOCK
                    ){
                return true;
            }
        } else if(GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.GOLD_BLOCK){
            if(GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z-1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z-1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x, y+4, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z-1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z-1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z-1) == Material.DIAMOND_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.DIAMOND_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z-1) == Material.DIAMOND_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+7, z) == Material.END_BRICKS && GetBlockAt.getBlockAtLoc(world, x-1, y+8, z) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x-2, y+1, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+1, z-1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+2, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+2, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+3, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+3, z-1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+4, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-2, y+4, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+5, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-2, y+5, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-2, y+6, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y+6, z-1) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-2, y, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-2, y, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.EMERALD_BLOCK)
                return true;
        } else if(GetBlockAt.getBlockAtLoc(world, x, y, z+1) == Material.GOLD_BLOCK){
            if(GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+4, z+1) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z+1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+1) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y+7, z+1) == Material.END_BRICKS && GetBlockAt.getBlockAtLoc(world, x, y+8, z+1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z+2) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+2, z+2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+2, z+2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z+2) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+3, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+3, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z+2) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+4, z+2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+4, z+2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z+2) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+5, z+2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y+5, z+2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z+2) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x+1, y+6, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+6, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z+2) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z+2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z+2) == Material.EMERALD_BLOCK)
                return true;
        } else if(GetBlockAt.getBlockAtLoc(world, x, y, z-1) == Material.GOLD_BLOCK) {
            if (GetBlockAt.getBlockAtLoc(world, x-1, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 4, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 2, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 2, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 3, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z-1) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 4, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 4, z) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 5, z-1) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 5, z) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z-1) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y + 6, z-1) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z-1) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x, y + 7, z-1) == Material.END_BRICKS && GetBlockAt.getBlockAtLoc(world, x, y + 8, z-1) == Material.END_ROD

                    && GetBlockAt.getBlockAtLoc(world, x-1, y+1, z - 2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y+1, z-2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y+1, z-2) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+2, z-2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 2, z-2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y + 2, z-2) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+3, z-2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 3, z-2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 3, z-2) == Material.EMERALD_BLOCK
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+4, z-2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 4, z-2) == Material.GLASS && GetBlockAt.getBlockAtLoc(world, x+1, y + 4, z-2) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+5, z-2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x, y + 5, z-2) == Material.OBSIDIAN && GetBlockAt.getBlockAtLoc(world, x+1, y + 5, z-2) == Material.OBSIDIAN
                    && GetBlockAt.getBlockAtLoc(world, x-1, y+6, z-2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x, y + 6, z-2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y + 6, z-2) == Material.EMERALD_BLOCK

                    && GetBlockAt.getBlockAtLoc(world, x-1, y, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x-1, y, z-2) == Material.EMERALD_BLOCK && GetBlockAt.getBlockAtLoc(world, x+1, y, z-2) == Material.EMERALD_BLOCK)
                return true;
        }
        return false;
    }
}



