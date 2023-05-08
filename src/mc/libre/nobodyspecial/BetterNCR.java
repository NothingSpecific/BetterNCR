package mc.libre.nobodyspecial;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterNCR extends JavaPlugin {
    @Override
    public void onEnable() {
    	getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }
    @Override
    public void onDisable() {

    }
}
