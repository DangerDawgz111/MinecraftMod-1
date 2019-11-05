package com.Dangerdawgz111.DogUpgradesMod.items.tools;

import com.Dangerdawgz111.DogUpgradesMod.Main;
import com.Dangerdawgz111.DogUpgradesMod.init.ModItems;
import com.Dangerdawgz111.DogUpgradesMod.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{
	public ToolHoe(String name, ToolMaterial material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DogUpgradesTab);
		
		ModItems.ITEMS.add(this);
	}
	
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
