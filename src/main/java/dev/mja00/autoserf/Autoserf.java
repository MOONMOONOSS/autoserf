package dev.mja00.autoserf;

import org.bukkit.plugin.java.JavaPlugin;

public final class Autoserf extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new JoinEvent(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
