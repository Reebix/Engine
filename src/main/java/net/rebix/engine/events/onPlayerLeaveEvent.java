package net.rebix.engine.events;

import net.rebix.engine.api.playernametag.PlayerSetNameTag;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.Collections;

public class onPlayerLeaveEvent implements Listener {
    @EventHandler
    public void PlayerLeaveEvent(PlayerQuitEvent event){
        new PlayerSetNameTag(event.getPlayer(), Collections.singletonList(event.getPlayer().getDisplayName())).RemoveNameTag(event.getPlayer());
    }
}
