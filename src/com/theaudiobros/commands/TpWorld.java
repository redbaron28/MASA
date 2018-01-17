package com.theaudiobros.commands;

import com.theaudiobros.rocketship.gui.inventory;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TpWorld implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {


        if(sender instanceof Player) {
            Player player = (Player) sender;

            inventory.open(player, "000000000000000");

            if (args[0].equalsIgnoreCase("mars")) {
                player.teleport(Bukkit.getWorld("Mars").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("earthmoon")) {
                player.teleport(Bukkit.getWorld("EarthMoon").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("mercury")) {
                player.teleport(Bukkit.getWorld("Mercury").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("overworld")) {
                player.teleport(Bukkit.getWorld("world").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("venus")) {
                player.teleport(Bukkit.getWorld("Venus").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("jupiter")) {
                player.teleport(Bukkit.getWorld("Jupiter").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("saturn")) {
                player.teleport(Bukkit.getWorld("Saturn").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("uranus")) {
                player.teleport(Bukkit.getWorld("Uranus").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("pluto")) {
                player.teleport(Bukkit.getWorld("Pluto").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } else if (args[0].equalsIgnoreCase("neptune")) {
                player.teleport(Bukkit.getWorld("Neptune").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            }/*  * else if (args[0].equalsIgnoreCase("astroidbelt")) {
                player.teleport(Bukkit.getWorld("AstroidBelt").getSpawnLocation());
                player.sendMessage("Teleported you to " + player.getWorld().getName());

            } * */else {
                player.sendMessage("/tpworld <Earthmoon/Mars/Mercury/Overworld/Jupiter/Saturn/Uranus/Pluto/Neptune/AstroidBelt>");

            }

        }


        return false;
    }
}
