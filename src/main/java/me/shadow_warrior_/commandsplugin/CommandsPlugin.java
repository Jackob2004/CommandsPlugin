package me.shadow_warrior_.commandsplugin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public final class CommandsPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("die")){  //checking to see what command was run you can do it like this (label.equalsIgnoreCase("die")

            if (sender instanceof Player){ //Check to see if a Player ran the command or something else
                Player p = (Player) sender;
                p.setHealth(0.0);
                p.sendMessage(ChatColor.RED + "You have opted to die");
            } else if (sender instanceof ConsoleCommandSender) {
                System.out.println("The command was run in the console");

            }
        }



        return true; //if you set it to false then you will get /die message after using that command
    }
}
