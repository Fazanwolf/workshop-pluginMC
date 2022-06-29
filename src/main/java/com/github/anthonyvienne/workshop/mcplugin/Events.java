package com.github.anthonyvienne.workshop.mcplugin;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Events implements Listener {
    public void onPlayerJoin(PlayerJoinEvent p)
    {
        System.out.println("[+] " + p.getPlayer().getName() + " - " + Bukkit.getServer().getOnlinePlayers().toString() + "/" + Bukkit.getServer().getMaxPlayers());
    }

    public void onPlayerQuit(PlayerQuitEvent p)
    {
        System.out.println("[-] " + p.getPlayer().getName() + " - " + Bukkit.getServer().getOnlinePlayers().toString() + "/" + Bukkit.getServer().getMaxPlayers());
    }
}
