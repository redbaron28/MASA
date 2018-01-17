package com.theaudiobros.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class masa implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(args[0].toString() == "feedback") {
         if (args[1].toString == null);
             player.sendMessage("You must enter a message")
            else (File feedback = new File(plugin.getDataFolder(), File.separator + "feedback";
                  File file = new File(feedback, File.separator + feedbackmessage + ".yml");
                  FileConfiguration feedbackdata = YamlConfiguration.loadConfiguration(file);

        Bukkit.broadcastMessage("File Created");
        feedbackdata.set("info", player + ":" + feedbackmessage);
                                           
        try {
            file.createNewFile();
            feedbackdata.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

                     
        }
        return false;
    }

}
