package com.Dangerdawgz111.DogUpgradesMod.blocks;

import java.util.Random;

import com.Dangerdawgz111.DogUpgradesMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SapphireOre extends BlockBase 
{
	public SapphireOre(String name, Material material) 
	{
		super(name, material);		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(40.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)
	{
		return ModItems.SAPPHIRE;
	}
	
	@Override
	public int quantityDropped(Random rand)
	{
		int max = 1;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}