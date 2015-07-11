package me.bman7842.hyperlizedchat.main.commands;

import me.bman7842.hyperlizedchat.main.events.ChatEvent;
import me.bman7842.hyperlizedchat.main.utils.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by brand_000 on 7/11/2015.
 */
public class ToggleChat implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("lockchat")) {
            if (!p.hasPermission("hypechat.admin")) {
                Messages.sendNoPerms(p.getUniqueId());
                return false;
            }

            if (ChatEvent.isChatEnabled()) {
                ChatEvent.setChatEnabled(false);
                Messages.sendAlertMessage(p.getUniqueId(), "You have successfully disabled the chat!");
                return true;
            } else {
                ChatEvent.setChatEnabled(true);
                Messages.sendAlertMessage(p.getUniqueId(), "You have successfully enabled the chat!");
                return true;
            }
        }

        return false;
    }

}
