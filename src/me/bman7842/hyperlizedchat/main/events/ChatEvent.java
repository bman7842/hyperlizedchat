package me.bman7842.hyperlizedchat.main.events;

import me.bman7842.hyperlizedchat.main.utils.Messages;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

/**
 * Created by brand_000 on 7/11/2015.
 */
public class ChatEvent implements Listener {

    private static boolean chatEnabled = true;
    public static void setChatEnabled(boolean val) {
        chatEnabled = val;
    }
    public static boolean isChatEnabled() {
        return chatEnabled;
    }

    @EventHandler
    public void onChatEvent(AsyncPlayerChatEvent event) {
        if (!chatEnabled && !event.getPlayer().hasPermission("hypechat.exemptlock")) {
            event.setCancelled(true);
            Messages.sendAlertMessage(event.getPlayer().getUniqueId(), "The chat is currently disabled!");
            return;
        }
    }
}
