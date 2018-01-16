package com.theaudiobros.gabriel.masa;

import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import java.io.File;

public class Chat {

    public static String getPrefix(){

        Plugin plugin = MASA.getPlugin();

        File file = new File(plugin.getDataFolder(), File.separator + "config.yml");
        FileConfiguration configData = YamlConfiguration.loadConfiguration(file);

        return configData.getString("prefix");

    }

    public static void sendMessage(Player player, String message){
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', getPrefix()) + message);
    }

}
