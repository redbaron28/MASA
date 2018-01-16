package com.theaudiobros.gabriel.generateworld;

import org.bukkit.Bukkit;
import org.bukkit.Difficulty;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPreLoginEvent;

public class JoinGenerateListener implements Listener{


    @EventHandler
    public void onPlayerJoin(PlayerPreLoginEvent event){

        if(Bukkit.getWorld("Mars") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Mars", "Mars", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("EarthMoon") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("EarthMoon", "EarthMoon", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Mercury") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Mercury", "Mercury", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Venus") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Venus", "Venus", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Jupiter") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Jupiter", "Jupiter", Difficulty.HARD, true, true);
        if(Bukkit.getWorld("Saturn") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Saturn", "Saturn", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Uranus") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Uranus", "Uranus", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Pluto") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Pluto", "Pluto", Difficulty.HARD, true, false);
        if(Bukkit.getWorld("Neptune") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("Neptune", "Neptune", Difficulty.HARD, true, false);
        /* *if(Bukkit.getWorld("AstroidBelt") == null)
            com.theaudiobros.gabriel.generateworld.Generate.loadWorld("AstroidBelt", "AstroidBelt", Difficulty.HARD, true, false); * */
        if(Bukkit.getWorld("EarthMoon") != null && Bukkit.getWorld("Pluto") != null && Bukkit.getWorld("Neptune") != null && Bukkit.getWorld("Uranus") != null && Bukkit.getWorld("Saturn") != null && Bukkit.getWorld("Mars") != null && Bukkit.getWorld("Jupiter") != null && Bukkit.getWorld("Mercury") != null && Bukkit.getWorld("Venus") != null){
            //event.getHandlers().unregister(this);
        }
    }



}
