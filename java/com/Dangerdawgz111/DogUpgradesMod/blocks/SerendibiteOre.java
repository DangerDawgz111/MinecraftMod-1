package com.Dangerdawgz111.DogUpgradesMod.blocks;

import java.util.Random;

import com.Dangerdawgz111.DogUpgradesMod.init.ModItems;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class SerendibiteOre extends BlockBase 
{
	public SerendibiteOre(String name, Material material) 	
	{
		super(name, material);		
		setSoundType(SoundType.STONE);
		setHardness(5.0F);
		setResistance(25.0F);
		setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune)	
	{
		return ModItems.SERENDIBITE;
	}
	
	@Override
	public int quantityDropped(Random rand)	
	{
		int max = 2;
		int min = 1;
		return rand.nextInt(max) + min;
	}
}