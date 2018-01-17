package com.theaudiobros.commands;

import com.theaudiobros.SchematicUtil.SchematicHandler;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class loadSchem implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        if(!(args[0].toString() == null)) {
            Location location = player.getLocation();

            SchematicHandler.schemHandle(location, args[0]);
            player.sendMessage("Schem Loaded");
        }



        return false;
    }

}
