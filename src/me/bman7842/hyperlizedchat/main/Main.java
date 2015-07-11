package me.bman7842.hyperlizedchat.main;

import me.bman7842.hyperlizedchat.main.commands.ClearChat;
import me.bman7842.hyperlizedchat.main.commands.ToggleChat;
import me.bman7842.hyperlizedchat.main.events.ChatEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by brand_000 on 7/11/2015.
 */
public class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new ChatEvent(), this);

        getCommand("cc").setExecutor(new ClearChat());
        getCommand("lockchat").setExecutor(new ToggleChat());
    }

}
