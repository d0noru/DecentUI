package com.donoru.DecentUI;

import com.donoru.DecentUI.Commands.create;
import com.donoru.DecentUI.Events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class DecentUI extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("dui").setExecutor(new create());
        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[DecentUI]: Plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[DecentUI]: Plugin is disabled");
    }

    public void plugin() {
        Plugin plugin;
    }

    public void createConfig(String name) {
        File config = new File(getDataFolder(), name = ".yml");

        if (!config.exists()) {

        }
    }

}
