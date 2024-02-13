package com.donoru.DecentUI;

import com.donoru.DecentUI.Events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class DecentUI extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Events(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[DecentUI]: Plugin is enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[DecentUI]: Plugin is disabled");
    }

}
