package com.theaudiobros.generateworld;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPreLoginEvent;

public class JoinGenerateListener implements Listener{


    @EventHandler
    public void onPlayerJoin(PlayerPreLoginEvent event){

        if(Bukkit.getWorld("Mars") == null)
            Generate.loadWorld("Mars", "Mars", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("EarthMoon") == null)
            Generate.loadWorld("EarthMoon", "EarthMoon", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Mercury") == null)
            Generate.loadWorld("Mercury", "Mercury", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Venus") == null)
            Generate.loadWorld("Venus", "Venus", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Jupiter") == null)
            Generate.loadWorld("Jupiter", "Jupiter", Difficulty.HARD, true, true);
        if(Bukkit.getWorld("Saturn") == null)
            Generate.loadWorld("Saturn", "Saturn", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Uranus") == null)
            Generate.loadWorld("Uranus", "Uranus", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Pluto") == null)
            Generate.loadWorld("Pluto", "Pluto", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Neptune") == null)
            Generate.loadWorld("Neptune", "Neptune", Difficulty.HARD, true, false);
        /* *if(Bukkit.getWorld("AstroidBelt") == null)
            Generate.loadWorld("AstroidBelt", "AstroidBelt", Difficulty.HARD, true, false); * */
        if(Bukkit.getWorld("EarthMoon") != null && Bukkit.getWorld("Pluto") != null && Bukkit.getWorld("Neptune") != null && Bukkit.getWorld("Uranus") != null && Bukkit.getWorld("Saturn") != null && Bukkit.getWorld("Mars") != null && Bukkit.getWorld("Jupiter") != null && Bukkit.getWorld("Mercury") != null && Bukkit.getWorld("Venus") != null){
            //event.getHandlers().unregister(this);
        }
    }



}
