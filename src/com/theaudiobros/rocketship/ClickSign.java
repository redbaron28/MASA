package com.theaudiobros.rocketship;

import com.theaudiobros.masa.MASA;
import com.theaudiobros.rocketship.gui.inventory;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import java.io.File;

public class ClickSign implements Listener {

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerClickSign(PlayerInteractEvent event){
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
            if(!(event.getPlayer().getInventory().getItemInHand().getType() == Material.COAL_BLOCK)){
                if(event.getClickedBlock().getState() instanceof Sign) {
                    Sign sign = (Sign) event.getClickedBlock().getState();
                    //if (sign.getLine(0) == ChatColor.stripColor("[Rocket]")){
                        //if(sign.getLine(1) == ChatColor.stripColor("Tier 1")){
                            File file = new File(MASA.getPlugin().getDataFolder() + File.separator + "rockets" + File.separator + sign.getLine(2) + ".yml");
                            if(file.exists() == true) {
                                if (CheckForRocket.tier1(event.getPlayer().getWorld(), sign.getLocation())) {
                                    inventory.open(event.getPlayer(), sign.getLine(2));
                                }
                            }


                        //}


                    //}





                }
            }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void addFuel(PlayerInteractEvent event){
        if(event.getAction() == Action.RIGHT_CLICK_BLOCK)
            if(event.getClickedBlock().getState() instanceof Sign) {
                Sign sign = (Sign) event.getClickedBlock().getState();
                File file = new File(MASA.getPlugin().getDataFolder() + File.separator + "rockets" + File.separator + sign.getLine(2) + ".yml");
                if(event.getPlayer().getInventory().getItemInHand().getTypeId() == 173){
                    if (file.exists() == true){
                        String fuelS = Info.getInfo(sign.getLine(2), "fuel");
                        int fuel = Integer.parseInt(fuelS);
                        fuel++;
                        String fuelBS = String.valueOf(fuel);
                        Info.setInfo(sign.getLine(2), "fuel", fuelBS);
                        sign.setLine(3, ChatColor.YELLOW + "Fuel: " + Info.getInfo(sign.getLine(2), "fuel"));
                        sign.update();
                        Player player = event.getPlayer();
                        player.getInventory().getItemInHand().setAmount(player.getInventory().getItemInHand().getAmount()-1);

                    }
                }
            }
    }

}
