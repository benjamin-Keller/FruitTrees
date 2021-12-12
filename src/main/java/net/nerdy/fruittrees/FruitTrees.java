package net.nerdy.fruittrees;

import org.bukkit.plugin.java.JavaPlugin;

public final class FruitTrees extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Planting Fruit Trees...");
    }

    @Override
    public void onDisable() {
        System.out.println("Harvesting Fruit Trees...");
        // Plugin shutdown logic
    }
}
