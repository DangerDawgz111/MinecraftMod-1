package com.Dangerdawgz111.DogUpgradesMod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SteelBlock extends BlockBase
{
	public SteelBlock(String name, Material material) 
	{
		super(name, material);		
		setSoundType(SoundType.METAL);
		setHardness(7.5F);
		setResistance(80.0F);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(0.0F);
		//setLightOpacity(0);
		//setBlockUnbreakable();
	}
}
