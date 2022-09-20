package de.dieserbenni.basiccb;

import org.bukkit.plugin.java.JavaPlugin;

public final class BasicCb extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("hilfe").setExecutor(new HelpCommand());


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
