package com.theaudiobros.rocketship;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import java.util.UUID;

public class SignCheck implements Listener{

    @EventHandler(priority = EventPriority.HIGHEST)
    public void signCreate(SignChangeEvent event){
        if(event.getLine(0).equalsIgnoreCase("[Rocket]"))
            if(event.getLine(1).equalsIgnoreCase("tier1")){
                setSign("tier1", event);
            } else if(event.getLine(1).equalsIgnoreCase("tier2")){
                setSign("tier2", event);
            }
    }

    public void setSign(String tier, SignChangeEvent event){

        if(tier.equalsIgnoreCase("tier1")){
            event.setLine(0, ChatColor.WHITE + "[Rocket]");
            event.setLine(1, ChatColor.RED + "Tier 1");
            String uuid = UUID.randomUUID().toString().replace("-", "").substring(0, 15);
            event.setLine(2, uuid);
            Info.createInfo(uuid, "0", tier, "PLACEHOLDER");
            event.setLine(3, ChatColor.YELLOW + "Fuel: " + fuelFinder(uuid));
        }
        else if(tier.equalsIgnoreCase("tier2")){
            event.setLine(0, ChatColor.WHITE + "[Rocket]");
            event.setLine(1, ChatColor.AQUA + "Tier 2");
        }


    }

    public String fuelFinder(String rocketUUID){
        String fuel = Info.getInfo(rocketUUID, "fuel");
        return fuel;
    }



}
