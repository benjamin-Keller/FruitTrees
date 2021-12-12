package net.nerdy.fruittrees.Commands;

import net.nerdy.fruittrees.Trees.Items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Commands implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can use that command!");
            return true;
        }

        Player player = (Player) sender;

        if (command.getName().equalsIgnoreCase("giveAppleSappling")) {
            sender.sendMessage("Giving player an Apple Sappling...");
            player.getInventory().addItem(ItemManager.appleTreeSapling);
        }

        return true;
    }
}
