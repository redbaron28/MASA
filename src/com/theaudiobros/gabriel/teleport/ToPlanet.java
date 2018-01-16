package com.theaudiobros.gabriel.teleport;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;

import java.util.Set;

public class ToPlanet {

    public static World planet(String Planet){
        return Bukkit.getWorld(Planet);
    }

    public static void playerToPlanet(Player player, String Planet, Location location){

        int locationY = 150;
        Location loc = null;

        boolean ground = false;

        while (ground == false) {

            loc = new Location(planet(Planet), location.getBlockX(), locationY, location.getBlockZ());

            if (loc.getBlock().getType() != Material.AIR) {
                ground = true;
            } else locationY--;

        }

        player.teleport(new Location(planet(Planet), location.getBlockX(), locationY, location.getBlockZ()));
    }

    public static void shipToPlanet(Player player, String Planet){

        int locationX = player.getTargetBlock((Set<Material>) null,100).getLocation().getBlockX();
        int locationToY = 150;
        int locationY = player.getTargetBlock((Set<Material>) null, 100).getLocation().getBlockY();
        int locationZ = player.getTargetBlock((Set<Material>) null,100).getLocation().getBlockZ();
        Location loc = null;




        boolean ground = false;

        while (ground == false) {

            loc = new Location(planet(Planet), locationX, locationToY, locationZ);

            if (loc.getBlock().getType() != Material.AIR) {
                ground = true;
            } else locationToY--;

        }




    }

}
