package com.theaudiobros.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class UnloadWorld implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(!(args[0].toString() == null)) {
            Bukkit.unloadWorld(args[0].toString(), true);
            player.sendMessage(args[0].toString() + " has been unloaded!");
        }



        return false;
    }

}
