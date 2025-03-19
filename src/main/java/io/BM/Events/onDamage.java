package io.BM.Events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class onDamage implements Listener {
    @EventHandler
    public void damage(EntityDamageEvent e){
        e.setCancelled(true);
    }


}
