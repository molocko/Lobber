package io.BM.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class onJoin implements Listener {
    @EventHandler
    public void join(PlayerJoinEvent e){
        e.setJoinMessage("");
        Player p = e.getPlayer();
        p.teleport(p.getWorld().getSpawnLocation().add(.5,0,.5));
    }
}
