package com.arrayprolc.soundscapes.scapes;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import com.arrayprolc.soundscapes.core.UpdateEvent;

public class ScapeAir implements Listener {
	
	@EventHandler
	public void tick(UpdateEvent e){
		Bukkit.broadcastMessage("hi");
	}

}
