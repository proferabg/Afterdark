package com.probgtech.afterdark.listeners;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.probgtech.afterdark.Portal;

public class PortalListener implements Listener {
	
	Material CB = Material.COAL_BLOCK;

//TODO: CHange to fire lit event (For fire charges)
	@SuppressWarnings({ "unused", "deprecation" })
	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent e){
		Player player = e.getPlayer();
		World world = player.getWorld();
		Block block = e.getClickedBlock();
		Action action = e.getAction();
		if(action == Action.RIGHT_CLICK_BLOCK) {
		if (e.getClickedBlock().getType() == CB) {
			if(player.getInventory().getItemInHand().getType().equals(Material.FLINT_AND_STEEL)){
				Portal p = Portal.checkCreation(block);
				
//				else {
//					player.sendMessage(ChatColor.RED + "The portal was not created!");
//					player.sendMessage(ChatColor.RED + "X: " + x + " Y: " + y + " Z: " + z);
//					
//				}
        	}
        }
		}
    }
}