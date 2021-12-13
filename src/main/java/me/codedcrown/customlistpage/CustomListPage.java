package me.codedcrown.customlistpage;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

import java.util.Collection;

public final class CustomListPage extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getLogger().info("CustomListPage е стартиран успешно!");
    }

    @Override
    public void onDisable() {
        this.getLogger().info("CustomListPage е изключен успешно!");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("list")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                int onlinePlayers = Bukkit.getOnlinePlayers().size();
                if (player.hasPermission("list.use")) {
                    player.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "---------------------------------------");
                    player.sendMessage(ChatColor.GRAY + "➥ " + ChatColor.WHITE + "Онлайн играчи " + ChatColor.GRAY + "➜ " + ChatColor.LIGHT_PURPLE + onlinePlayers);
                    player.sendMessage(ChatColor.GRAY + "" + ChatColor.STRIKETHROUGH + "---------------------------------------");
                }
            }
        }
        return false;
    }
}
