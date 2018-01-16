package com.theaudiobros.gabriel.rocketship.gui;

import com.theaudiobros.gabriel.masa.Chat;
import com.theaudiobros.gabriel.rocketship.Info;
import com.theaudiobros.gabriel.teleport.ToPlanet;
import org.bukkit.*;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;

import java.util.Set;

public class Interact implements Listener{

    @EventHandler(priority = EventPriority.HIGHEST)
    public void playerClick(InventoryClickEvent event){
        Player player = (Player) event.getWhoClicked();
        Inventory inv = event.getInventory();

        if(ChatColor.stripColor(inv.getTitle()).contains("Milky Way Galaxy")) {

            event.setCancelled(true);
//            String[] nametemp = inv.getTitle().split("\\s+");
//            String rocketUUIDtemp = ChatColor.stripColor(nametemp[3]);
//
//            if(Integer.parseInt(Info.getInfo(rocketUUIDtemp, "tier")) >= 5){


            if (event.getCurrentItem() == null || event.getCurrentItem().getType() == Material.AIR)
                return;
            if(event.getCurrentItem().getItemMeta().getDisplayName().contains("Sun")){
                Chat.sendMessage(player, "This is coming soon!");
            } else if(event.getCurrentItem().getItemMeta().getDisplayName().contains("Moon")){
                String[] name = inv.getTitle().split("\\s+");
                String rocketUUID = ChatColor.stripColor(name[3]);
                if(Integer.parseInt(Info.getInfo(rocketUUID, "fuel")) >= 5){
                    int fuelLeft = Integer.parseInt(Info.getInfo(rocketUUID, "fuel")) - 5;
                    String fuelLS = String.valueOf(fuelLeft);
                    Info.setInfo(rocketUUID, "fuel", fuelLS);
                    player.closeInventory();

                    Location sLoc = player.getTargetBlock((Set<Material>) null,50).getLocation();
                    Sign sign = (Sign) sLoc.getBlock().getState();
                    Info.updateFuel(sign);

                    if(tier.one(sign, Bukkit.getWorld("EarthMoon"))){
                        ToPlanet.playerToPlanet(player, "EarthMoon", player.getLocation());
                    }




                } else {
                    player.closeInventory();
                    Chat.sendMessage(player, "Please add more fuel to you rocket, you need at least 5.");
                }
            } else if(event.getCurrentItem().getItemMeta().getDisplayName().contains("Mercury")){
                String[] name = inv.getTitle().split("\\s+");
                String rocketUUID = ChatColor.stripColor(name[3]);
                if(Integer.parseInt(Info.getInfo(rocketUUID, "fuel")) >= 5){
                    int fuelLeft = Integer.parseInt(Info.getInfo(rocketUUID, "fuel")) - 5;
                    String fuelLS = String.valueOf(fuelLeft);
                    Info.setInfo(rocketUUID, "fuel", fuelLS);
                    player.closeInventory();

                    Location sLoc = player.getTargetBlock((Set<Material>) null,50).getLocation();
                    Sign sign = (Sign) sLoc.getBlock().getState();
                    Info.updateFuel(sign);

                    if(tier.one(sign, Bukkit.getWorld("Mercury"))){
                        ToPlanet.playerToPlanet(player, "Mercury", player.getLocation());
                    }




                }  else {
                    player.closeInventory();
                    Chat.sendMessage(player, "Please add more fuel to you rocket, you need at least 5.");
                }
            } else if(event.getCurrentItem().getItemMeta().getDisplayName().contains("Earth")){
                String[] name = inv.getTitle().split("\\s+");
                String rocketUUID = ChatColor.stripColor(name[3]);
                if(Integer.parseInt(Info.getInfo(rocketUUID, "fuel")) >= 5){
                    int fuelLeft = Integer.parseInt(Info.getInfo(rocketUUID, "fuel")) - 5;
                    String fuelLS = String.valueOf(fuelLeft);
                    Info.setInfo(rocketUUID, "fuel", fuelLS);
                    player.closeInventory();

                    Location sLoc = player.getTargetBlock((Set<Material>) null,50).getLocation();
                    Sign sign = (Sign) sLoc.getBlock().getState();
                    Info.updateFuel(sign);

                    if(tier.one(sign, Bukkit.getWorld("world"))){
                        ToPlanet.playerToPlanet(player, "world", player.getLocation());
                    }




                }  else {
                    player.closeInventory();
                    Chat.sendMessage(player, "Please add more fuel to you rocket, you need at least 5.");
                }
            } else {
                Chat.sendMessage(player, "Not a real planet1");
            }
        } else {
            event.setCancelled(false);
        }
    }

}
