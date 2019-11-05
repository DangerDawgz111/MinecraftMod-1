package com.Dangerdawgz111.DogUpgradesMod.world;

import java.util.Random;

import com.Dangerdawgz111.DogUpgradesMod.init.ModBlocks;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator
{
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
	{
		if(world.provider.getDimension() == 0)
		{
			gererateOverworld(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
		}
	}
	
	private void gererateOverworld(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) 
	{
		generateOre(ModBlocks.RUBY_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 20, 40, random.nextInt(7) + 6, 14);
		generateOre(ModBlocks.SAPPHIRE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 16, 18, random.nextInt(7) + 3, 12);
		generateOre(ModBlocks.MOONSTONE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 11, 14, random.nextInt(7) + 4, 9);
		generateOre(ModBlocks.SERENDIBITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 5, 9, random.nextInt(7) + 3, 5);
		generateOre(ModBlocks.AMAZONITE_ORE.getDefaultState(), world, random, chunkX * 16, chunkZ * 16, 13, 18, random.nextInt(7) + 8, 15);
	}
	
	private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int size, int chances)
	{
		int deltaY = maxY - minY;
		
		for(int i = 0; i < chances; i++)
		{
			BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));
			
			WorldGenMinable generator = new WorldGenMinable(ore, size);
			generator.generate(world, random, pos);
		}
	}
}


