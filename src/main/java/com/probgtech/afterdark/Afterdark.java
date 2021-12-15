package com.probgtech.afterdark;

import org.bstats.bukkit.Metrics;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.configuration.file.FileConfiguration;

import com.probgtech.afterdark.commands.AfterdarkCommand;
import com.probgtech.afterdark.utils.Messaging;
import com.probgtech.afterdark.worldgen.AfterdarkGenerator;
import com.probgtech.afterdark.listeners.PortalListener;

public class Afterdark extends JavaPlugin {
	
	public String v;

    FileConfiguration cfg;
    
    
	@Override
    public void onEnable(){
        v = this.getDescription().getVersion();

        new Messaging(this);
        getCommand("afterdark").setExecutor(new AfterdarkCommand(this));
    	Messaging.enableMessage();
    	

        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new PortalListener(), this);
    	
        //get config
      	cfg = getConfig();
      	cfg.options().copyDefaults(true);
      	saveConfig();
        
        //metrics
        new Metrics(this, 13604);
    }
    
    public void onDisable(){
        Messaging.disableMessage();
        saveConfig();
    }
	
	public ChunkGenerator getDefaultWorldGenerator(String worldName, String id){
		return new AfterdarkGenerator(this);
	}
}
