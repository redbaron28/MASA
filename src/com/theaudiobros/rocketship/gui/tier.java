package com.theaudiobros.rocketship.gui;

import com.theaudiobros.rocketship.AddBlocks;
import com.theaudiobros.rocketship.CheckDirection;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Sign;

public class tier {

    public static boolean one(Sign sign, World world){
        if(CheckDirection.CheckDirection(sign.getLocation()) == "x++")
            if(AddBlocks.threeXThreeXOne(sign.getLocation(), Material.IRON_BLOCK, world))
                if(AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY()+1, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                    if(AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY()+2, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                        //if(AddBlocks.setGetSign(sign, world))
                        if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ()), Material.GLASS, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ() + 1), Material.IRON_BLOCK, world))
                            if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 1, sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 1, sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ() - 1), Material.GLASS, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 1, sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ() + 1), Material.GLASS, world))
                                if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 2, sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ()), Material.GLASS, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 2, sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 2, sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ() + 1), Material.IRON_BLOCK, world))
                                    if (AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() + 4, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                        if (AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() + 5, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                            if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() + 1), Material.IRON_BLOCK, world))
                                                if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world))
                                                    if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 2, sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world))
                                                        if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 2, sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() + 1), Material.IRON_BLOCK, world))
                                                            if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 1, sign.getLocation().getBlockY(), sign.getLocation().getBlockZ()), Material.GOLD_BLOCK, world))
                                                                if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 1, sign.getLocation().getBlockY() + 8, sign.getLocation().getBlockZ()), Material.END_ROD, world))
                                                                    if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() + 1, sign.getLocation().getBlockY() + 7, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                                                        return true;

        else if(CheckDirection.CheckDirection(sign.getLocation()) == "x--")
                                                                        if(AddBlocks.threeXThreeXOne(sign.getLocation(), Material.IRON_BLOCK, world))
                                                                            if(AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY()-1, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                                                                if(AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY()-2, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                                                                    //if(AddBlocks.setGetSign(sign, world))
                                                                                    if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ()), Material.GLASS, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world))
                                                                                        if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 1, sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 1, sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ() - 1), Material.GLASS, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 1, sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ() + 1), Material.GLASS, world))
                                                                                            if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 2, sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ()), Material.GLASS, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 2, sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world) && AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 2, sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ() + 1), Material.IRON_BLOCK, world))
                                                                                                if (AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() - 4, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                                                                                    if (AddBlocks.threeXThreeXOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY() - 5, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                                                                                        if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() + 1), Material.IRON_BLOCK, world))
                                                                                                            if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX(), sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world))
                                                                                                                if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 2, sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world))
                                                                                                                    if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 2, sign.getLocation().getBlockY(), sign.getLocation().getBlockZ() - 1), Material.IRON_BLOCK, world))
                                                                                                                        if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 1, sign.getLocation().getBlockY(), sign.getLocation().getBlockZ()), Material.GOLD_BLOCK, world))
                                                                                                                            if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 1, sign.getLocation().getBlockY() - 8, sign.getLocation().getBlockZ()), Material.END_ROD, world))
                                                                                                                                if (AddBlocks.setGetOne(new Location(sign.getLocation().getWorld(), sign.getLocation().getBlockX() - 1, sign.getLocation().getBlockY() - 7, sign.getLocation().getBlockZ()), Material.IRON_BLOCK, world))
                                                                                                                                    return true;



        return false;
    }

    public static boolean two(Sign sign, World world){




        return false;
    }

}
