package mc.libre.nobodyspecial;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class ChatListener implements Listener {
	/*
	 * Event priority must be as high as possible to prevent it from intercepting the event before all other plugins have a chance to handle it
	 */
    @EventHandler(priority=EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent e){
    		if(e.isCancelled())
    			return; // Avoid sending chat events if the event has been cancelled by another plugin
    					// This allows mutes to still work properly
    		
    		e.setCancelled(true); // Prevent the original message from being sent to clients
    		
            for(Player player : e.getRecipients()) {	// Send only to intended recipients
            											// to prevent private messaged from accidentally becoming global
            											// when used with certain plugins
            	player.sendMessage(String.format(e.getFormat(), e.getPlayer().getDisplayName(), e.getMessage()));
            }
            BetterNCR.server.getConsoleSender().sendMessage(String.format(e.getFormat(), e.getPlayer().getDisplayName(), e.getMessage()));
            return;
    }
}
