package net.nerdy.fruittrees.Trees.Items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager {

    public static ItemStack appleTreeSapling;

    public static void init() {
        createAppleTree();
    }

    private static void createAppleTree() {
        ItemStack item = new ItemStack(Material.OAK_SAPLING, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setLocalizedName("Apple Tree Sapling");

        List lore = new ArrayList<>();
        lore.add("&2When Notch gives you Apples,");
        lore.add("&2You plant an Apple Tree!");
        meta.lore(lore);

        item.setItemMeta(meta);
        appleTreeSapling = item;
    }
}
