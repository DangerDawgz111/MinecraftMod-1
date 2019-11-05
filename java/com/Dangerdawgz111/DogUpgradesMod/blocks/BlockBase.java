package com.Dangerdawgz111.DogUpgradesMod.blocks;

import com.Dangerdawgz111.DogUpgradesMod.Main;
import com.Dangerdawgz111.DogUpgradesMod.init.ModBlocks;
import com.Dangerdawgz111.DogUpgradesMod.init.ModItems;
import com.Dangerdawgz111.DogUpgradesMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DogUpgradesTab);	
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
	}
	
}
