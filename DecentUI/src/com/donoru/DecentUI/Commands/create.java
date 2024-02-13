package com.donoru.DecentUI.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import com.donoru.DecentUI.DecentUI.*;

import java.io.File;

public class create implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (!(sender instanceof Player)) {
			return true;
		}

		Player player = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("dui")) {
			if (args.length > 0) {
				if (args[0].equals("create")) {
					if (args.length == 3) {
						if (args[2].matches("[0-9]+") && Integer.parseInt(args[2]) <= 6) {
							player.sendMessage("UI '" + args[1] + "' created with " + args[2] + " rows.");
							if (true) {
								return true;
							}
							File config = new File("", args[1] + ".yml");

						} else {
							player.sendMessage("Rows must be a number 6 or lower.");
						}
					} else {
						player.sendMessage("Usage: /dui create <name> <rows>");
					}
				}
			}
		}

		return true;
	}

}
