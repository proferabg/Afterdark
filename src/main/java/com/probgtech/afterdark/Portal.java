package com.probgtech.afterdark;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;

public class Portal {

	public enum Dir {
		NORTH, EAST, WEST, SOUTH
	}

	static Material CB = Material.COAL_BLOCK;
	static Material Air = Material.AIR;
	Material Fire = Material.FIRE;
	
	public Portal(int x, int y, int z, Dir dir) {
		//TODO Start portals
	}

	public static Portal checkCreation(Block block) {
		World world = block.getWorld();
		int x = block.getX();
		int y = block.getY();
		int z = block.getZ();
		if(world.getBlockAt(x, y, z).getType().equals(CB)
			&& world.getBlockAt(x+1, y, z).getType().equals(CB) 
			&& world.getBlockAt(x+2, y, z).getType().equals(CB)
			&& world.getBlockAt(x+2, y+1, z).getType().equals(CB)
			&& world.getBlockAt(x+2, y+2, z).getType().equals(CB)
			&& world.getBlockAt(x+2, y+3, z).getType().equals(CB)
			&& world.getBlockAt(x+2, y+4, z).getType().equals(CB)
			&& world.getBlockAt(x+1, y+4, z).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z).getType().equals(CB)
    		&& world.getBlockAt(x-1, y, z).getType().equals(CB)
    		&& world.getBlockAt(x-1, y+1, z).getType().equals(CB)
    		&& world.getBlockAt(x-1, y+2, z).getType().equals(CB)
    		&& world.getBlockAt(x-1, y+3, z).getType().equals(CB)
    		&& world.getBlockAt(x-1, y+4, z).getType().equals(CB)
    		&& world.getBlockAt(x, y+1, z).getType().equals(Air)
    		&& world.getBlockAt(x, y+2, z).getType().equals(Air)
    		&& world.getBlockAt(x, y+3, z).getType().equals(Air)
    		&& world.getBlockAt(x+1, y+1, z).getType().equals(Air)
    		&& world.getBlockAt(x+1, y+2, z).getType().equals(Air)
    		&& world.getBlockAt(x+1, y+3, z).getType().equals(Air)){
				return new Portal(x,y,z,Dir.EAST);
		}
		else if(world.getBlockAt(x, y, z).getType().equals(CB) 
			&& world.getBlockAt(x-1, y, z).getType().equals(CB) 
			&& world.getBlockAt(x-2, y, z).getType().equals(CB)
			&& world.getBlockAt(x-2, y+1, z).getType().equals(CB)
			&& world.getBlockAt(x-2, y+2, z).getType().equals(CB)
			&& world.getBlockAt(x-2, y+3, z).getType().equals(CB)
			&& world.getBlockAt(x-2, y+4, z).getType().equals(CB)
			&& world.getBlockAt(x-1, y+4, z).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z).getType().equals(CB)
    		&& world.getBlockAt(x+1, y, z).getType().equals(CB)
    		&& world.getBlockAt(x+1, y+1, z).getType().equals(CB)
    		&& world.getBlockAt(x+1, y+2, z).getType().equals(CB)
    		&& world.getBlockAt(x+1, y+3, z).getType().equals(CB)
    		&& world.getBlockAt(x+1, y+4, z).getType().equals(CB)
    		&& world.getBlockAt(x, y+1, z).getType().equals(Air)
    		&& world.getBlockAt(x, y+2, z).getType().equals(Air)
    		&& world.getBlockAt(x, y+3, z).getType().equals(Air)
    		&& world.getBlockAt(x-1, y+1, z).getType().equals(Air)
    		&& world.getBlockAt(x-1, y+2, z).getType().equals(Air)
    		&& world.getBlockAt(x-1, y+3, z).getType().equals(Air)){
			return new Portal(x,y,z,Dir.WEST);
		}
		else if(world.getBlockAt(x, y, z).getType().equals(CB) 
			&& world.getBlockAt(x, y, z+1).getType().equals(CB) 
			&& world.getBlockAt(x, y, z+2).getType().equals(CB)
			&& world.getBlockAt(x, y+1, z+2).getType().equals(CB)
			&& world.getBlockAt(x, y+2, z+2).getType().equals(CB)
			&& world.getBlockAt(x, y+3, z+2).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z+2).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z+1).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z).getType().equals(CB)
        	&& world.getBlockAt(x, y, z-1).getType().equals(CB)
        	&& world.getBlockAt(x, y+1, z-1).getType().equals(CB)
        	&& world.getBlockAt(x, y+2, z-1).getType().equals(CB)
        	&& world.getBlockAt(x, y+3, z-1).getType().equals(CB)
        	&& world.getBlockAt(x, y+4, z-1).getType().equals(CB)
        	&& world.getBlockAt(x, y+1, z).getType().equals(Air)
        	&& world.getBlockAt(x, y+2, z).getType().equals(Air)
        	&& world.getBlockAt(x, y+3, z).getType().equals(Air)
        	&& world.getBlockAt(x, y+1, z+1).getType().equals(Air)
        	&& world.getBlockAt(x, y+2, z+1).getType().equals(Air)
        	&& world.getBlockAt(x, y+3, z+1).getType().equals(Air)){
			return new Portal(x,y,z,Dir.SOUTH);
		}
		else if(world.getBlockAt(x, y, z).getType().equals(CB) 
			&& world.getBlockAt(x, y, z-1).getType().equals(CB) 
			&& world.getBlockAt(x, y, z-2).getType().equals(CB)
			&& world.getBlockAt(x, y+1, z-2).getType().equals(CB)
			&& world.getBlockAt(x, y+2, z-2).getType().equals(CB)
			&& world.getBlockAt(x, y+3, z-2).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z-2).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z-1).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z).getType().equals(CB)
			&& world.getBlockAt(x, y, z+1).getType().equals(CB)
			&& world.getBlockAt(x, y+1, z+1).getType().equals(CB)
			&& world.getBlockAt(x, y+2, z+1).getType().equals(CB)
			&& world.getBlockAt(x, y+3, z+1).getType().equals(CB)
			&& world.getBlockAt(x, y+4, z+1).getType().equals(CB)
			&& world.getBlockAt(x, y+1, z).getType().equals(Air)
			&& world.getBlockAt(x, y+2, z).getType().equals(Air)
			&& world.getBlockAt(x, y+3, z).getType().equals(Air)
			&& world.getBlockAt(x, y+1, z-1).getType().equals(Air)
			&& world.getBlockAt(x, y+2, z-1).getType().equals(Air)
			&& world.getBlockAt(x, y+3, z-1).getType().equals(Air)){
			return new Portal(x,y,z,Dir.NORTH);
				
		}
		return null;
	}
	
	//player.sendMessage(ChatColor.GREEN + "You have created an AfterDark Portal");

}
