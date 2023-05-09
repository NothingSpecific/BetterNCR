package mc.libre.nobodyspecial.betterncr;

import org.bukkit.Bukkit;
import org.bukkit.Server;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BetterNCR extends JavaPlugin {
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new PlayerChatRewriter(this), this);
	}
	@Override
	public void onDisable() {
		// No need to do anything here, since there's no cleanup that needs to happen
    }
}
