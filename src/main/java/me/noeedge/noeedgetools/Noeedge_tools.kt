package me.noeedge.noeedgetools

import org.bukkit.plugin.java.JavaPlugin

class Noeedge_tools : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        logger.info("Loaded Successfully!")
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
