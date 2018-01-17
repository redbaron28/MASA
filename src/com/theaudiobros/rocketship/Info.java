package com.theaudiobros.rocketship;

import com.theaudiobros.masa.MASA;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.block.Sign;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;

public class Info {

    static Plugin plugin = MASA.getPlugin();
    static FileConfiguration config;

    public static String getInfoHandler(String rocketUUID){
        File rocketDataFolder = new File(plugin.getDataFolder(), File.separator + "rockets");
        File file = new File(rocketDataFolder, File.separator + rocketUUID + ".yml");
        FileConfiguration rocketData = YamlConfiguration.loadConfiguration(file);
        return rocketData.getString("info");
    }

    public static void createInfo(String rocketUUID, String fuel, String tier, String user){
        File rocketDataFolder = new File(plugin.getDataFolder(), File.separator + "rockets");
        File file = new File(rocketDataFolder, File.separator + rocketUUID + ".yml");
        FileConfiguration rocketData = YamlConfiguration.loadConfiguration(file);

       // if(file.exists())
          //  rocketUUID = null;

        try {
            file.createNewFile();
            rocketData.set("info", user + ":" + rocketUUID + ":" + tier + ":" + fuel);
            rocketData.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Bukkit.broadcastMessage("File Created");

    }

    public static String getInfo(String rocketUUID, String data){
        File rocketDataFolder = new File(plugin.getDataFolder(), File.separator + "rockets");
        File file = new File(rocketDataFolder, File.separator + rocketUUID + ".yml");
        FileConfiguration rocketData = YamlConfiguration.loadConfiguration(file);
        String info = getInfoHandler(rocketUUID);

        String[] rawData = info.split(":");
        if(data.equalsIgnoreCase("user"))
            return rawData[0];
        else if(data.equalsIgnoreCase("uuid"))
            return rawData[1];
        else if(data.equalsIgnoreCase("tier"))
            return rawData[2];
        else if(data.equalsIgnoreCase("fuel"))
            return rawData[3];

        return null;
    }

    public static void setInfo(String rocketUUID, String data, String value){

        File rocketDataFolder = new File(plugin.getDataFolder(), File.separator + "rockets");
        File file = new File(rocketDataFolder, File.separator + rocketUUID + ".yml");
        FileConfiguration rocketData = YamlConfiguration.loadConfiguration(file);
        String info = getInfoHandler(rocketUUID);


        String[] rawData = info.split(":");
        if(data.equalsIgnoreCase("user")){
            rocketData.set("info", value + ":" + rawData[1] + ":" + rawData[2]  + ":" + rawData[3]);
            try {
                rocketData.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(data.equalsIgnoreCase("uuid")){
            rocketData.set("info", rawData[0] + ":" + value + ":" + rawData[2]  + ":" + rawData[3]);
            try {
                rocketData.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(data.equalsIgnoreCase("tier")){
            rocketData.set("info", rawData[0] + ":" + rawData[1] + ":" + value  + ":" + rawData[3]);
            try {
                rocketData.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if(data.equalsIgnoreCase("fuel")){
            rocketData.set("info", rawData[0] + ":" + rawData[1] + ":" + rawData[2]  + ":" + value);
            try {
                rocketData.save(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static void removeFuel(String rocketUUID, int value){
        String data = "fuel";

        String fuelS = Info.getInfo(rocketUUID, "fuel");
        int fuel = Integer.parseInt(fuelS);
        fuel = fuel - value;
        String fuelBS = String.valueOf(fuel);

        setInfo(rocketUUID, data, fuelBS);

    }

    public static void updateFuel(Sign sign){
        sign.setLine(3, ChatColor.YELLOW + "Fuel: " + Info.getInfo(sign.getLine(2), "fuel"));
        sign.update();

    }

}
