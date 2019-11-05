package com.Dangerdawgz111.DogUpgradesMod.blocks;

import java.util.Random;

import com.Dangerdawgz111.DogUpgradesMod.Main;
import com.Dangerdawgz111.DogUpgradesMod.blocks.itemblocks.ItemBlockDoor;
import com.Dangerdawgz111.DogUpgradesMod.init.ModBlocks;
import com.Dangerdawgz111.DogUpgradesMod.init.ModItems;
import com.Dangerdawgz111.DogUpgradesMod.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class BlockDoorBase extends BlockDoor implements IHasModel
{

	public BlockDoorBase(String name, Material materialIn, CreativeTabs tab) 
	{
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.DogUpgradesTab);	
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlockDoor(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) 
	{		
		return Item.getItemFromBlock(this);
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) 
	{		
		return ItemStack(this);
	}
	
	@Override
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "Inventory");
	}

	private ItemStack ItemStack(BlockDoorBase blockDoorBase) {
		return null;
	}
}
