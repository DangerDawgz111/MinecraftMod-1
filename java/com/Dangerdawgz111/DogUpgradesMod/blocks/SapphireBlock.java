package com.Dangerdawgz111.DogUpgradesMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SapphireBlock extends BlockBase 
{

	public SapphireBlock(String name, Material material) 
	{
		super(name, material);		
		setSoundType(SoundType.METAL);
		setHardness(5.0F);
		setResistance(50.0F);
		setHarvestLevel("pickaxe", 3);
		setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}

}

