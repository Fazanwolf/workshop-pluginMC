package com.github.anthonyvienne.workshop.mcplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class WorkshopPlugin extends JavaPlugin {

    @Override
    public void onDisable() {
        System.out.println("Disable...");
        super.onDisable();
    }

    @Override
    public void onEnable() {
        System.out.println("Enabled...");
        super.onEnable();
    }
}
