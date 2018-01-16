package com.theaudiobros.gabriel.SchematicUtil;

import java.io.File;
import java.io.IOException;

import com.theaudiobros.gabriel.masa.MASA;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import com.sk89q.worldedit.EditSession;
import com.sk89q.worldedit.MaxChangedBlocksException;
import com.sk89q.worldedit.Vector;
import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.schematic.MCEditSchematicFormat;

import net.md_5.bungee.api.ChatColor;

import com.sk89q.worldedit.data.DataException;

public class SchematicHandler {

    @SuppressWarnings("deprecation")
    public static void schemHandle(Location loc, String filename){
        WorldEditPlugin we = (WorldEditPlugin) Bukkit.getPluginManager().getPlugin("WorldEdit");
        File schematic = new File(MASA.getPlugin().getDataFolder() + "/schematics/" + filename);
        if(!schematic.exists()){
            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&3[&2CustomStructures&3] &cA fatal error has occured! Please check the console for errors."));
            Bukkit.getLogger().warning("Error: The schematic " + filename + " does not exist!");
            Bukkit.getLogger().warning("If this is your first time using this plugin you need to put a schematic in the schematic folder.");
            Bukkit.getLogger().warning("Then add it into the config.");
            Bukkit.getLogger().warning("If you need help look at the wiki: https://github.com/ryandw11/CustomStructures/wiki or contact Ryandw11 on spigot!");
            Bukkit.getLogger().warning("The plugin will now disable to prevent damage to the server.");
            Bukkit.getPluginManager().disablePlugin(MASA.getPlugin());
            return;
        }
        EditSession session = we.getWorldEdit().getEditSessionFactory().getEditSession(new BukkitWorld(loc.getWorld()), 1000000);
        try {
            MCEditSchematicFormat.getFormat(schematic).load(schematic).paste(session, new Vector(loc.getX(), loc.getY(), loc.getZ()), false);
        } catch (MaxChangedBlocksException | DataException | IOException e2) {

        }
    }

}
