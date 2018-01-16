package com.theaudiobros.gabriel.rocketship;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;

public class CheckDirection {

    public static String CheckDirection(Location location) {

        Location xPlus = new Location(location.getWorld(), location.getBlockX() + 2, location.getBlockY() + 1, location.getBlockZ());
        Location xMin = new Location(location.getWorld(), location.getBlockX() - 2, location.getBlockY() + 1, location.getBlockZ());
        Location zPlus = new Location(location.getWorld(), location.getBlockX(), location.getBlockY() + 1, location.getBlockZ() + 2);
        Location zMin = new Location(location.getWorld(), location.getBlockX(), location.getBlockY() + 1, location.getBlockZ() - 2);

        Bukkit.broadcastMessage(GetBlockAt.getBlockAtLoc(xPlus).toString());

        if (GetBlockAt.getBlockAtLoc(xPlus) == Material.IRON_BLOCK) {
            Bukkit.broadcastMessage("x++");
            return "x++";
        } else if (GetBlockAt.getBlockAtLoc(xMin) == Material.IRON_BLOCK) {
            Bukkit.broadcastMessage("x--");
            return "x--";
        } else if(GetBlockAt.getBlockAtLoc(zPlus) == Material.IRON_BLOCK) {
            Bukkit.broadcastMessage("z++");
            return "z++";
        } else if(GetBlockAt.getBlockAtLoc(zMin) == Material.IRON_BLOCK) {
            Bukkit.broadcastMessage("z--");
            return "z--";
        } else {
            Bukkit.broadcastMessage("null");
            return null;
        }
    }

}
