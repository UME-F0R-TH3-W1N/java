package com.turtywurty.foodmod.objects.blocks;

import com.turtywurty.foodmod.init.ItemInit;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LemonCropBlock extends BlockCrops
{
	public LemonCropBlock(String name) 
	{
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	@Override
	protected Item getSeed() 
	{
		return ItemInit.LEMON_SEED;
	}
	
	@Override
	protected Item getCrop() 
	{
		return ItemInit.LEMON;
	}

}
