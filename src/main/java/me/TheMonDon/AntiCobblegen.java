package me.TheMonDon;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFormEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiCobblegen extends JavaPlugin implements Listener, CommandExecutor {

    @Override
    public void onEnable() {
        Bukkit.getLogger().info("---------------------------");
        Bukkit.getLogger().info("     AntiCobblegen v1.2    ");
        Bukkit.getLogger().info("---------------------------");
        getServer().getPluginManager().registerEvents(this, this);
        getCommand("anticobblegen").setExecutor(this);
    }

    @EventHandler
    public void onForm(BlockFormEvent form){
        if (form.getNewState().getType() == Material.COBBLESTONE) {
            form.setCancelled(true);
        }
    }

    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
        sender.sendMessage(ChatColor.AQUA.toString() + ChatColor.BOLD.toString() + "AntiCobblegen");
        sender.sendMessage(ChatColor.AQUA.toString() + "Version" + ChatColor.WHITE + ": " + ChatColor.GRAY + "v1.2");
        sender.sendMessage(ChatColor.AQUA.toString() + "Developer" + ChatColor.WHITE + ": " + ChatColor.GRAY + "TheMonDon");
        return true;
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().info("---------------------------");
        Bukkit.getLogger().info("     AntiCobblegen v1.2    ");
        Bukkit.getLogger().info("---------------------------");
    }
}