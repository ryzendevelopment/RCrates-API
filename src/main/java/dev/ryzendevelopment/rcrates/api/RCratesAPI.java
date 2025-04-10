package dev.ryzendevelopment.rcrates.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;
import java.util.Map;

public class RCratesAPI {
    public RCratesAPI(JavaPlugin plugin) {
        Plugin crates = plugin.getServer().getPluginManager().getPlugin("RCrates");
        if (crates == null) throw new IllegalArgumentException("RCrates is not loaded"); 
    }

    List<String> getAllCrates() {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    boolean getCrate(String crateName) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    void openCrate(Player player, String crateName) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    List<ItemStack> getCrateRewards(String crateName) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    Map<Integer, Double> getCrateChancesRewards(String crateName) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    Map<Integer, ItemStack> getCrateSlotRewards(String crateName) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    boolean addCrate(String crateName, Map<Integer, ItemStack> rewards) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    boolean removeCrate(String crateName) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    void giveKey(Player player, String crateName, int quantity) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    void giveCrate(Player player, String crateName, int quantity) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    boolean hasKey(Player player, ItemStack item) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }

    boolean hasCrate(Player player, ItemStack item) {
        throw new IllegalArgumentException("RCrates is not loaded");
    }
}