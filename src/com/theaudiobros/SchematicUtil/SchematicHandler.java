package com.theaudiobros.SchematicUtil;

import java.io.File;
import java.io.IOException;

import com.sk89q.worldedit.*;
import com.sk89q.worldedit.schematic.SchematicFormat;
import com.sk89q.worldedit.session.ClipboardHolder;
import com.sk89q.worldedit.util.Direction;
import com.theaudiobros.masa.MASA;
import org.bukkit.Bukkit;
import org.bukkit.Location;

import com.sk89q.worldedit.bukkit.BukkitWorld;
import com.sk89q.worldedit.bukkit.WorldEditPlugin;
import com.sk89q.worldedit.schematic.MCEditSchematicFormat;

import net.md_5.bungee.api.ChatColor;

import com.sk89q.worldedit.data.DataException;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

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
// TODO Make Rocket a scematic and save the file as rocket UUID (based from sign not player)
//    @SuppressWarnings("deprecation")
//    public static void createRocket(Sign sign, String schematicName) {
//        try {
//            File schematic = new File(MASA.getPlugin().getDataFolder(), "/rocket_Schematics/" + schematicName);
//            File dir = new File(MASA.getPlugin().getDataFolder(), "/rocket_Schematics/");
//            if (!dir.exists())
//                dir.mkdirs();
//
//            WorldEditPlugin wep = (WorldEditPlugin) Bukkit.getServer().getPluginManager().getPlugin("WorldEdit");
//            WorldEdit we = wep.getWorldEdit();
//
//            LocalPlayer localPlayer = wep.wrapPlayer(player);
//            LocalSession localSession = we.getSession(localPlayer);
//            ClipboardHolder selection = localSession.getClipboard();
//            EditSession editSession = localSession.createEditSession(localPlayer);
//
//            Vector min = selection.getClipboard().getMinimumPoint();
//            Vector max = selection.getClipboard().getMaximumPoint();
//
//            Block block = sign.getBlock();
//            if(block.getFace(sign.getBlock()) == BlockFace.NORTH){
//
//            } else if(block.getFace(sign.getBlock()) == BlockFace.SOUTH){
//
//            } else if(block.getFace(sign.getBlock()) == BlockFace.WEST){
//
//            } else if(block.getFace(sign.getBlock()) == BlockFace.EAST){
//
//            } else {
//                //TODO Error
//            }
//
//
//            editSession.enableQueue();
//            CuboidClipboard clipboard = new CuboidClipboard(max.subtract(min).add(new Vector(1, 1, 1)), min);
//            clipboard.copy(editSession);
//            SchematicFormat.MCEDIT.save(clipboard, schematic);
//            editSession.flushQueue();
//
//        } catch (IOException | DataException ex) {
//            ex.printStackTrace();
//        } catch (EmptyClipboardException ex) {
//            ex.printStackTrace();
//        }
//    }

}
