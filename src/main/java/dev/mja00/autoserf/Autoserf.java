package dev.mja00.autoserf;

import co.aikar.timings.TimingsManager;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Team;

import java.util.Set;

public final class Autoserf extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Registering events");
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);
        getLogger().info("Autoserfs ready");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
