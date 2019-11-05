package com.Dangerdawgz111.DogUpgradesMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Dangerdawgz111.DogUpgradesMod.Main;
import com.Dangerdawgz111.DogUpgradesMod.blocks.AmazoniteBlock;
import com.Dangerdawgz111.DogUpgradesMod.blocks.AmazoniteOre;
import com.Dangerdawgz111.DogUpgradesMod.blocks.BlockBase;
import com.Dangerdawgz111.DogUpgradesMod.blocks.BlockDoorBase;
import com.Dangerdawgz111.DogUpgradesMod.blocks.MoonstoneBlock;
import com.Dangerdawgz111.DogUpgradesMod.blocks.MoonstoneOre;
import com.Dangerdawgz111.DogUpgradesMod.blocks.RubyBlock;
import com.Dangerdawgz111.DogUpgradesMod.blocks.RubyOre;
import com.Dangerdawgz111.DogUpgradesMod.blocks.SapphireBlock;
import com.Dangerdawgz111.DogUpgradesMod.blocks.SapphireOre;
import com.Dangerdawgz111.DogUpgradesMod.blocks.SerendibiteBlock;
import com.Dangerdawgz111.DogUpgradesMod.blocks.SerendibiteOre;
import com.Dangerdawgz111.DogUpgradesMod.blocks.SteelBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks 
{
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	//Blocks
	public static final Block RUBY_BLOCK = new RubyBlock("ruby_block", Material.IRON);
	public static final Block SAPPHIRE_BLOCK = new SapphireBlock("sapphire_block", Material.IRON);
	public static final Block MOONSTONE_BLOCK = new MoonstoneBlock("moonstone_block", Material.IRON);
	public static final Block SERENDIBITE_BLOCK = new SerendibiteBlock("serendibite_block", Material.IRON);
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block", Material.IRON);
	
	//Ores
	public static final Block RUBY_ORE = new RubyOre("ruby_ore", Material.ROCK);
	public static final Block SAPPHIRE_ORE = new SapphireOre("sapphire_ore", Material.ROCK);
	public static final Block MOONSTONE_ORE = new MoonstoneOre("moonstone_ore", Material.ROCK);
	public static final Block SERENDIBITE_ORE = new SerendibiteOre("serendibite_ore", Material.ROCK);
	public static final Block AMAZONITE_ORE = new AmazoniteOre("amazonite_ore", Material.ROCK);
	
	//Doors
	public static final Block STEEL_DOOR = new BlockDoorBase("steel_door", Material.IRON, Main.DogUpgradesTab);
}