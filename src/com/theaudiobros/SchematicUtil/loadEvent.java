package com.theaudiobros.SchematicUtil;

import org.bukkit.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.Random;

public class loadEvent implements Listener{

    @EventHandler(priority = EventPriority.HIGHEST)
    public void chunkLoad(ChunkLoadEvent event){

        Chunk chunk = event.getChunk();
        if(event.isNewChunk()) {
            Random rand = new Random();
            int num2 = rand.nextInt(100);
            if (num2 == 85) {
                if (chunk.getWorld().getName() == "Mars") {
                    World world = Bukkit.getWorld("Mars");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    int num = rand.nextInt(3);

                    if(num == 1) {
                        SchematicHandler.schemHandle(loc, "MarsDungeon1.schematic");

                    } else if(num == 2) {
                        SchematicHandler.schemHandle(loc, "MarsMiner.schematic");

                    } else if (num == 0){
                        SchematicHandler.schemHandle(new Location(world, x, 200, z), "MarsUFO.schematic");

                    }
                } else if (chunk.getWorld().getName() == "EarthMoon") {
                    World world = Bukkit.getWorld("EarthMoon");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    int num = rand.nextInt(2);

                    if(num == 0) {
                        SchematicHandler.schemHandle(loc, "ab_mb.schematic");

                    } else if(num == 1) {
                        SchematicHandler.schemHandle(loc, "MoonFlag.schematic");

                    }
                } else if (chunk.getWorld().getName() == "Mercury") {
                    World world = Bukkit.getWorld("Mercury");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    int num = rand.nextInt(2);

                    if(num == 0) {
                        SchematicHandler.schemHandle(loc, "MercuryDungeon.schematic");

                    } else if(num == 1) {
                        SchematicHandler.schemHandle(loc, "MercuryPit.schematic");

                    }
                } else if (chunk.getWorld().getName() == "Jupiter") {
                    World world = Bukkit.getWorld("Jupiter");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    int num = rand.nextInt(2);

                    if(num == 0) {
                        SchematicHandler.schemHandle(loc, "JupiterRobot.schematic");

                    } else if(num == 1) {
                        SchematicHandler.schemHandle(loc, "JupiterTempleV1.schematic");

                    }
                } else if (chunk.getWorld().getName() == "Neptune") {
                    World world = Bukkit.getWorld("Neptune");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    SchematicHandler.schemHandle(loc, "NeptuneWalker.schematic");
                } else if (chunk.getWorld().getName() == "Saturn") {
                    World world = Bukkit.getWorld("Saturn");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    SchematicHandler.schemHandle(loc, "SaturnUFO.schematic");
                } else if (chunk.getWorld().getName() == "Uranus") {
                    World world = Bukkit.getWorld("Uranus");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    SchematicHandler.schemHandle(loc, "UranusWorm.schematic");

                }if (chunk.getWorld().getName() == "Venus") {
                    World world = Bukkit.getWorld("Venus");
                    int x = chunk.getX() * 16;
                    int z = chunk.getZ() * 16;
                    int y = 150;
                    Location loc = null;

                    boolean isOnLand = false;

                    while (isOnLand == false) {

                        loc = new Location(world, x, y, z);

                        if (loc.getBlock().getType() != Material.AIR) {
                            isOnLand = true;
                        } else y--;

                    }
                    int num = rand.nextInt(3);

                    if(num == 1) {
                        SchematicHandler.schemHandle(loc, "VenusGrave.schematic");

                    } else if(num == 2) {
                        SchematicHandler.schemHandle(loc, "VenusHouse.schematic");

                    } else if (num == 0){
                        SchematicHandler.schemHandle(new Location(world, x, 200, z), "VenusPillar.schematic");

                    }
                }
            }
        }
    }

}
