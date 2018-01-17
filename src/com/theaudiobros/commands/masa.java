package com.theaudiobros.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

public class masa implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(args[0].toString() == "feedback") {
         if (args[1].toString() == null) {
             player.sendMessage("You must enter a message");
         }
            else {
                File feedback = new File(com.theaudiobros.masa.MASA.getPlugin().getDataFolder(), File.separator + "feedback");
                File file = new File(feedback, File.separator + player.getName() + Calendar.getInstance().toString() + ".yml");
                FileConfiguration feedbackdata = YamlConfiguration.loadConfiguration(file);
                 Bukkit.broadcastMessage("File Created");


                 feedbackdata.set("info", player + ":" + args.toString());
                                           
                 try {
                    file.createNewFile();
                    feedbackdata.save(file);
                 } catch (IOException e) {
                    e.printStackTrace();
                 }

            }
        }
        return false;
    }

}
