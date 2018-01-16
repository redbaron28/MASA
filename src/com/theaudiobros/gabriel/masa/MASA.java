package com.theaudiobros.gabriel.masa;

import com.theaudiobros.gabriel.commands.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.Plugin;
import org.bukkit.generator.ChunkGenerator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MASA extends JavaPlugin{

    private static Plugin plugin;

    public static Plugin getPlugin() {

        return plugin;

    }

    private static MASA instance;

    public static MASA getInstance() {
        return instance;
    }

    public void onEnable(){

        plugin = this;
        instance = this;

        getCommand("tpworld").setExecutor(new TpWorld());
        getCommand("unloadworld").setExecutor(new UnloadWorld());
        getCommand("loadSchem").setExecutor(new loadSchem());

        registerEvents(this, new com.theaudiobros.gabriel.generateworld.JoinGenerateListener(), new com.theaudiobros.gabriel.rocketship.SignCheck(), new com.theaudiobros.gabriel.rocketship.ClickSign(), new com.theaudiobros.gabriel.rocketship.gui.Interact(), new com.theaudiobros.gabriel.SchematicUtil.loadEvent());


        boolean loadedSchematics = false;

        List<String> schematicNames = new ArrayList<>();
        schematicNames.add("ab_mb.schematic");
        schematicNames.add("JupiterRobot.schematic");
        schematicNames.add("JupiterTempleV1.schematic");
        schematicNames.add("MarsDungeon1.schematic");
        schematicNames.add("MarsMiner.schematic");
        schematicNames.add("MarsUFO.schematic");
        schematicNames.add("MercuryDungeon.schematic");
        schematicNames.add("MercuryPit.schematic");
        schematicNames.add("MoonFlag.schematic");
        schematicNames.add("NeptuneWalker.schematic");
        schematicNames.add("SaturnUFO.schematic");
        schematicNames.add("UranusWorm.schematic");
        schematicNames.add("VenusGrave.schematic");
        schematicNames.add("VenusHouse.schematic");
        schematicNames.add("VenusPillar.schematic");

        Bukkit.getLogger().info("Creating Schematics...");

        while(loadedSchematics == false){
            if(schematicNames.isEmpty()){
                loadedSchematics = true;
                Bukkit.getLogger().info(ChatColor.GREEN + "Schematics Loaded!");
            } else {


                Bukkit.getLogger().info("/schematics/" + schematicNames.get(0));
                Bukkit.getLogger().info(getDataFolder() + "@/schematics/" + schematicNames.get(0));

                com.theaudiobros.gabriel.SchematicUtil.copy.copy(getClass().getResourceAsStream("com/theaudiobros/gabriel/schematics/" + schematicNames.get(0)), getDataFolder() + File.separator + "schematics" + File.separator + schematicNames.get(0));


            }
        }



        //SpigotPluginUpdater spu = new SpigotPluginUpdater(this, "http://5000magicman.000webhostapp.com/plugins/MysticUniverse/plugin.html");
        //spu.enableOut();
        //if(spu.needsUpdate())
            //spu.update();

    }

    public void onDisable(){

        plugin = null;
        instance = null;


    }

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String GenId) {
        return new com.theaudiobros.gabriel.mars.MarsChunkGenerator();
    }


    public static void registerEvents(org.bukkit.plugin.Plugin plugin, Listener... listeners) {

        for (Listener listener : listeners) {

            Bukkit.getServer().getPluginManager().registerEvents(listener, plugin);

        }
    }
}
