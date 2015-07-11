package me.bman7842.hyperlizedchat.main.utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

import java.util.UUID;

/**
 * Created by brand_000 on 7/11/2015.
 */
public class Messages {

    public static void sendAlertMessage(UUID player, String msg) {
        Bukkit.getPlayer(player).sendMessage(ChatColor.GREEN + "" + ChatColor.BOLD + "ALERT> " + ChatColor.GRAY + msg);
    }

    public static void sendErrorMessage(UUID player, String msg) {
        Bukkit.getPlayer(player).sendMessage(ChatColor.RED + "" + ChatColor.BOLD + "ERROR> " + ChatColor.GRAY + msg);
    }

    public static void sendNoPerms(UUID player) {
        sendErrorMessage(player, "You don't have permission to run this command!");
    }
}
