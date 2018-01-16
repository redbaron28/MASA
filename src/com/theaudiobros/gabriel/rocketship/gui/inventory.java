package com.theaudiobros.gabriel.rocketship.gui;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class inventory {

    public static void open(Player player, String rocketUUID){
        Inventory inv = Bukkit.createInventory(null, 54, ChatColor.AQUA + "Milky Way Galaxy " + ChatColor.RESET + rocketUUID);

        ItemStack sun = new ItemStack(Material.CONCRETE, 1, (byte) 4);
        ItemMeta sunMeta = sun.getItemMeta();
        sunMeta.setDisplayName(ChatColor.YELLOW + "Sun");
        sunMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: N/A"));
        sun.setItemMeta(sunMeta);
        inv.setItem(0, sun);
        inv.setItem(1, sun);
        inv.setItem(9, sun);
        inv.setItem(10, sun);

        ItemStack moon = new ItemStack(Material.CONCRETE, 1, (byte) 8);
        ItemMeta moonMeta = moon.getItemMeta();
        moonMeta.setDisplayName(ChatColor.GRAY + "Moon");
        moonMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 1"));
        moon.setItemMeta(moonMeta);
        inv.setItem(4, moon);

        ItemStack mars = new ItemStack(Material.RED_SANDSTONE, 1);
        ItemMeta marsMeta = mars.getItemMeta();
        marsMeta.setDisplayName(ChatColor.RED + "Mars");
        marsMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 1"));
        mars.setItemMeta(marsMeta);
        inv.setItem(39, mars);

        ItemStack earth = new ItemStack(Material.GRASS, 1);
        ItemMeta earthMeta = earth.getItemMeta();
        earthMeta.setDisplayName(ChatColor.GREEN + "Earth");
        earthMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 1"));
        earth.setItemMeta(earthMeta);
        inv.setItem(14, earth);

        ItemStack mercury = new ItemStack(Material.CONCRETE, 1, (byte) 7);
        ItemMeta mercuryMeta = mercury.getItemMeta();
        mercuryMeta.setDisplayName(ChatColor.DARK_GRAY + "Mercury");
        mercuryMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 2"));
        mercury.setItemMeta(mercuryMeta);
        inv.setItem(21, mercury);

        ItemStack venus = new ItemStack(Material.CONCRETE, 1, (byte) 0);
        ItemMeta venusMeta = venus.getItemMeta();
        venusMeta.setDisplayName(ChatColor.LIGHT_PURPLE + "Venus");
        venusMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 2"));
        venus.setItemMeta(venusMeta);
        inv.setItem(28, venus);

        ItemStack jupiter = new ItemStack(Material.SANDSTONE, 1, (byte) 0);
        ItemMeta jupiterMeta = jupiter.getItemMeta();
        jupiterMeta.setDisplayName(ChatColor.WHITE + "Jupiter");
        jupiterMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 3"));
        jupiter.setItemMeta(jupiterMeta);
        inv.setItem(32, jupiter);

        ItemStack saturn = new ItemStack(Material.ENDER_STONE, 1, (byte) 0);
        ItemMeta saturnMeta = saturn.getItemMeta();
        saturnMeta.setDisplayName(ChatColor.DARK_PURPLE + "Saturn");
        saturnMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 3"));
        saturn.setItemMeta(saturnMeta);
        inv.setItem(16, saturn);

        ItemStack uranus = new ItemStack(Material.CONCRETE, 1, (byte) 3);
        ItemMeta uranusMeta = uranus.getItemMeta();
        uranusMeta.setDisplayName(ChatColor.AQUA + "Uranus");
        uranusMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 4"));
        uranus.setItemMeta(uranusMeta);
        inv.setItem(34, uranus);

        ItemStack neptune = new ItemStack(Material.STAINED_CLAY, 1, (byte) 3);
        ItemMeta neptuneMeta = neptune.getItemMeta();
        neptuneMeta.setDisplayName(ChatColor.BLUE + "Neptune");
        neptuneMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 4"));
        neptune.setItemMeta(neptuneMeta);
        inv.setItem(50, neptune);

        ItemStack pluto = new ItemStack(Material.STAINED_CLAY, 1, (byte) 11);
        ItemMeta plutoMeta = pluto.getItemMeta();
        plutoMeta.setDisplayName(ChatColor.DARK_BLUE + "Pluto");
        plutoMeta.setLore(Arrays.asList(ChatColor.DARK_PURPLE + "Required Tier: 5"));
        pluto.setItemMeta(plutoMeta);
        inv.setItem(53, pluto);




        player.openInventory(inv);

    }


}
