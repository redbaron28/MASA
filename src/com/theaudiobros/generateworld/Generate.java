package com.theaudiobros.generateworld;

import com.theaudiobros.astroidBelt.AstroidChunkGenerator;
import com.theaudiobros.mars.MarsChunkGenerator;
import com.theaudiobros.moon.earth.EarthMoonChunkGenerator;
import com.theaudiobros.jupiter.JupiterChunkGenerator;
import com.theaudiobros.mercury.MercuryChunkGenerator;
import com.theaudiobros.neptune.NeptuneChunkGenerator;
import com.theaudiobros.pluto.PlutoChunkGenerator;
import com.theaudiobros.saturn.SaturnChunkGenerator;
import com.theaudiobros.uranus.UranusChunkGenerator;
import com.theaudiobros.venus.VenusChunkGenerator;
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
                creator.generator(new MarsChunkGenerator());
                break;
            }
            case "Mercury": {
                creator.generator(new MercuryChunkGenerator());
                break;
            }
            case "Venus": {
                creator.generator(new VenusChunkGenerator());
                break;
            }
            case "Jupiter": {
                creator.generator(new JupiterChunkGenerator());
                break;
            }
            case "Saturn": {
                creator.generator(new SaturnChunkGenerator());
                break;
            }
            case "Uranus": {
                creator.generator(new UranusChunkGenerator());
                break;
            }
            case "Pluto": {
                creator.generator(new PlutoChunkGenerator());
                break;
            }
            case "Neptune": {
                creator.generator(new NeptuneChunkGenerator());
                break;
            }
            case "AstroidBelt": {
                creator.generator(new AstroidChunkGenerator());
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
