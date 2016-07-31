package com.arrayprolc.soundscapes.scapes;

import java.util.Random;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ScapeClickInventory implements Listener {
	
	@EventHandler
	public void click(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
		if(e.getClick() == ClickType.RIGHT){
			p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 2);
			return;
		}
		
		if(e.getClick() == ClickType.SHIFT_LEFT){
			p.playSound(p.getLocation(), Sound.FIRE_IGNITE, 100, 1);
		}
		if(new Random().nextInt(5) == 0){
			p.playSound(p.getLocation(), Sound.WOOD_CLICK, 100, 1);
		}else{
			p.playSound(p.getLocation(), Sound.NOTE_STICKS, 100, 1);
		}
		
	}

}
