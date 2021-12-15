package com.probgtech.afterdark.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import com.probgtech.afterdark.Afterdark;
import com.probgtech.afterdark.utils.Messaging;

public class AfterdarkCommand implements CommandExecutor {

	public Afterdark plugin;

	public AfterdarkCommand(Afterdark p) {
		plugin = p;
	}

	public boolean onCommand(CommandSender sender, Command command, String commandLabel, String[] args) {
		if (command.getName().equalsIgnoreCase("afterdark")){
				try {
					return handleCommand(sender, args);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return true;
	}

	private boolean handleCommand(CommandSender sender, String[] args) throws ClassNotFoundException {
		if (args.length == 0) {
			Messaging.sendMessage(sender, ChatColor.YELLOW
					+ "/afterdark help -" + ChatColor.BLUE
					+ " Shows the help page!");
			return true;
		}
		if (args.length == 1) {
			if (args[0].equalsIgnoreCase("help")) {
				Messaging.sendMessage(sender, ChatColor.BLACK + "["
						+ ChatColor.LIGHT_PURPLE + "*" + ChatColor.BLACK + "]"
						+ ChatColor.GOLD + "---" + ChatColor.BLACK + "["
						+ ChatColor.DARK_PURPLE + "After" + ChatColor.DARK_AQUA
						+ "Dark" + ChatColor.DARK_GREEN + " Help"
						+ ChatColor.BLACK + "]" + ChatColor.GOLD + "---"
						+ ChatColor.BLACK + "[" + ChatColor.LIGHT_PURPLE + "*"
						+ ChatColor.BLACK + "]");
				Messaging.sendMessage(sender, ChatColor.BLACK + "["
						+ ChatColor.LIGHT_PURPLE + "*" + ChatColor.BLACK + "]"
						+ ChatColor.DARK_AQUA + " Place a sign");
				Messaging.sendMessage(sender, ChatColor.BLACK + "["
						+ ChatColor.LIGHT_PURPLE + "*" + ChatColor.BLACK + "]"
						+ ChatColor.DARK_AQUA
						+ " Line 1 of sign must contain 'AfterDark'");
				Messaging.sendMessage(sender, ChatColor.BLACK + "["
						+ ChatColor.LIGHT_PURPLE + "*" + ChatColor.BLACK + "]"
						+ ChatColor.DARK_AQUA
						+ " Line 2 of sign must contain 'Build'");
				Messaging.sendMessage(sender, ChatColor.BLACK + "["
						+ ChatColor.LIGHT_PURPLE + "*" + ChatColor.BLACK + "]"
						+ ChatColor.DARK_AQUA + " Right-Click sign");
				Messaging.sendMessage(sender, ChatColor.BLACK + "["
						+ ChatColor.LIGHT_PURPLE + "*" + ChatColor.BLACK + "]"
						+ ChatColor.DARK_AQUA + " Cost 1000 Septims");
			}
		}
		return false;
	}
}