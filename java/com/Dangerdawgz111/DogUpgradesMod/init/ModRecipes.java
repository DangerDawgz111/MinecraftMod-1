package com.Dangerdawgz111.DogUpgradesMod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes 
{
	public static void init() 
	{
		GameRegistry.addSmelting(ModBlocks.RUBY_ORE, new ItemStack(ModItems.RUBY), 1.5f);
		GameRegistry.addSmelting(ModBlocks.SAPPHIRE_ORE, new ItemStack(ModItems.SAPPHIRE), 2.0f);
		GameRegistry.addSmelting(ModItems.SUPER_BEEF_RAW, new ItemStack(ModItems.SUPER_BEEF_COOKED), 5.0f);
	}
}
