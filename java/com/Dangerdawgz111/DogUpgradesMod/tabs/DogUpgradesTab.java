package com.Dangerdawgz111.DogUpgradesMod.tabs;

import com.Dangerdawgz111.DogUpgradesMod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class DogUpgradesTab extends CreativeTabs
{

	public DogUpgradesTab(String label) {
		super("DogUpgradesTab");
		this.setBackgroundImageName("DogUpgrades.png");
	}
		public ItemStack getTabIconItem()
		{
			return new ItemStack(ModItems.STEEL);
		}
}
