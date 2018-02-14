package com.turtywurty.foodmod.objects.items;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.init.BlockInit;
import com.turtywurty.foodmod.init.ItemInit;
import com.turtywurty.foodmod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeeds;

public class ItemLemonSeed extends ItemSeeds implements IHasModel
{
	public ItemLemonSeed(String name) 
	{
		super(BlockInit.CROP_LEMON_BLOCK, Blocks.FARMLAND);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.FOODMODTAB);
		
		ItemInit.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}