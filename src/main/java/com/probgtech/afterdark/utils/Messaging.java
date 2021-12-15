package com.probgtech.afterdark.utils;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import com.probgtech.afterdark.Afterdark;

public class Messaging
{

        private static String pluginName;
        private static String logName;
        private static String prefix;
        private static String Afterdark;

        private static final Logger log = Logger.getLogger("Minecraft");
        private static Afterdark plugin;

        public Messaging(Afterdark p)
        {
                plugin = p;
                pluginName = "Afterdark";
                logName = "[" + pluginName + "]";
                Afterdark = ChatColor.DARK_PURPLE + "After" + ChatColor.DARK_AQUA + "Dark";
                prefix = ChatColor.DARK_GRAY + "[" + Afterdark + ChatColor.DARK_GRAY + "] ";
        }

        public static void logInfo(String message)
        {
                log.info(logName + message);
        }

        public static void logSevere(String message)
        {
                log.severe(logName + message);
        }

        public static void logWarning(String message)
        {
                log.warning(logName + message);
        }

        public static void enableMessage()
        {
                logInfo(" v" + plugin.v + " enabled.");
        }

        public static void disableMessage()
        {
                logInfo(" v" + plugin.v + " disabled.");
        }

        public static void debugMessage()
        {
                logInfo(" DEBUG: We got here!");
        }

        public static void sendMessage(CommandSender sender, String message)
        {
                sender.sendMessage(message);
        }

        public static void broadcast(String message)
        {
                Bukkit.getServer().broadcastMessage(prefix + message);
        }
        
        public static void dontHavePermission(CommandSender sender)
        {
                sender.sendMessage(ChatColor.DARK_RED + "You do not have permission!");
        }
}