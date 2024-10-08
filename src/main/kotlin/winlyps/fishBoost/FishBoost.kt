package winlyps.fishBoost

import org.bukkit.plugin.java.JavaPlugin

class FishBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(FishBoostListener(this), this)
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}