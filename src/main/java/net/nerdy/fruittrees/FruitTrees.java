package net.nerdy.fruittrees;

import net.nerdy.fruittrees.Commands.Commands;
import net.nerdy.fruittrees.Trees.Items.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class FruitTrees extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Planting Fruit Trees...");

        ItemManager.init();
        getCommand("giveAppleSappling").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        System.out.println("Harvesting Fruit Trees...");
        // Plugin shutdown logic
    }
}
