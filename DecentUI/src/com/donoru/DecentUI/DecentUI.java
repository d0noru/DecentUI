package com.donoru.DecentUI;

import com.donoru.DecentUI.Commands.Commands;
import com.donoru.DecentUI.Events.Events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class DecentUI extends JavaPlugin {

    @Override
    public void onEnable() {
        Commands commands = new Commands();
        getCommand("lobby").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new Events(), this);
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "[Bedwars]: Plugin is disabled");
    }

}
