package com.theaudiobros.mars;

import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class GravityListener implements Listener{

    public void onPlayerWorldChange(PlayerChangedWorldEvent event){
        Player player = event.getPlayer();
        if(player.getWorld().getName() == "Mars") {
            player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2400, 2));
        } else {
            player.removePotionEffect(PotionEffectType.JUMP);
        }
    }

    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();
        player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 2400, 2));
    }

    public void onPlayQuit(PlayerQuitEvent event){
        Player player = event.getPlayer();
        player.removePotionEffect(PotionEffectType.JUMP);
    }

}
