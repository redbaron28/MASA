package com.theaudiobros.gabriel.generateworld;

import com.theaudiobros.gabriel.moon.earth.EarthMoonChunkGenerator;
import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.World;
import org.bukkit.WorldCreator;

public class Generate {

    public static World loadWorld(String name, String generator, Difficulty difficulty,
                                  boolean pvpEnabled, boolean Storm) {
        World world = Bukkit.getWorld(name);

        if (world != null) {
            Bukkit.unloadWorld(world, false);
            world = null;
        }

        WorldCreator creator = new WorldCreator(name);
        creator.environment(World.Environment.NORMAL);
        creator.generateStructures(false);
        switch(generator) {
            case "EarthMoon": {
                creator.generator(new EarthMoonChunkGenerator());
                break;
            }
            case "Mars": {
                creator.generator(new com.theaudiobros.gabriel.mars.MarsChunkGenerator());
                break;
            }
            case "Mercury": {
                creator.generator(new com.theaudiobros.gabriel.mercury.MercuryChunkGenerator());
                break;
            }
            case "Venus": {
                creator.generator(new com.theaudiobros.gabriel.venus.VenusChunkGenerator());
                break;
            }
            case "Jupiter": {
                creator.generator(new com.theaudiobros.gabriel.jupiter.JupiterChunkGenerator());
                break;
            }
            case "Saturn": {
                creator.generator(new com.theaudiobros.gabriel.saturn.SaturnChunkGenerator());
                break;
            }
            case "Uranus": {
                creator.generator(new com.theaudiobros.gabriel.uranus.UranusChunkGenerator());
                break;
            }
            case "Pluto": {
                creator.generator(new com.theaudiobros.gabriel.pluto.PlutoChunkGenerator());
                break;
            }
            case "Neptune": {
                creator.generator(new com.theaudiobros.gabriel.neptune.NeptuneChunkGenerator());
                break;
            }
            case "AstroidBelt": {
                creator.generator(new com.theaudiobros.gabriel.astroidBelt.AstroidChunkGenerator());
                break;
            }
        }
        world = creator.createWorld();
        world.setDifficulty(difficulty);
        world.setSpawnFlags(false, false);
        world.setPVP(pvpEnabled);
        world.setThundering(Storm);
        world.setKeepSpawnInMemory(false);
        world.setWeatherDuration(0);
        world.setStorm(Storm);

        world.setAutoSave(true);

        creator.createWorld();

        return world;
    }

}
