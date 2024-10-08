package winlyps.fishBoost

import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerFishEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class FishBoostListener(private val plugin: FishBoost) : Listener {

    @EventHandler
    fun onPlayerFish(event: PlayerFishEvent) {
        if (event.state == PlayerFishEvent.State.CAUGHT_FISH) {
            val player = event.player
            player.addPotionEffect(PotionEffect(PotionEffectType.LUCK, 20 * 20, 0))
        }
    }
}