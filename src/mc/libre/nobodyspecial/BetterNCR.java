package mc.libre.nobodyspecial;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterNCR extends JavaPlugin {
	public static Server server = null;
    @Override
    public void onEnable() {
    	server = getServer();
    	server.getPluginManager().registerEvents(new ChatListener(), this);
    }
    @Override
    public void onDisable() {

    }
}
