package net.rebix.engine;

import net.rebix.engine.api.ScrollableInventory;
import net.rebix.engine.api.packets.EntityHider;
import net.rebix.engine.util.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TestCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {

        ScrollableInventory scrollable_inventory = new ScrollableInventory().create((Player) sender,"test",6*9,null,null);
        List<ItemStack> contents = new ArrayList<>();
        int index;
        for(index = 1; index < 63; ++index){
            contents.add(new ItemBuilder(Material.STONE).setAmount(index).build());
        }
        scrollable_inventory.setContents(contents);
        scrollable_inventory.reloadInventory();
        return false;
    }
}
