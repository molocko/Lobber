package io.BM;

import dev.EX.Funcs;
import io.BM.Events.onDamage;
import io.BM.Events.onJoin;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.logging.Logger;


public class Main extends JavaPlugin {
    public static Main instance;
    Logger log = getLogger();

    public void onEnable() {
        Funcs.atEnable(this, "Lobber");

        Funcs.regEvent(this, new onJoin());
        Funcs.regEvent(this, new onDamage());









    }

    public static Main getInstance() {
        return instance;
    }

}