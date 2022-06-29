package com.github.anthonyvienne.workshop.mcplugin.command;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class EpitechCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, org.bukkit.command.Command command, String label, String[] args) {
        sender.sendMessage("Marvin -42");
        command.setPermission("");
/*        if (command.getLabel().equals("/help"))
            System.out.println("Vous donne -42 de la part de Marvin :)");*/
        return false;
    }

}
