package com.arrayprolc.soundscapes.core;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.arrayprolc.soundscapes.scapes.ScapeAir;
import com.arrayprolc.soundscapes.scapes.ScapeClickInventory;

public class SoundscapesCore extends JavaPlugin {
	
	@Override
	public void onEnable(){
		
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){ public void run() { Bukkit.getPluginManager().callEvent(new UpdateEvent()); } }, 0, 1);
		
		getServer().getPluginManager().registerEvents(new ScapeClickInventory(), this);
		getServer().getPluginManager().registerEvents(new ScapeAir(), this);
		
	}

}
