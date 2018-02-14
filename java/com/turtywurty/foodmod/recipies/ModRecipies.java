package com.turtywurty.foodmod.recipies;

import com.turtywurty.foodmod.init.ItemInit;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipies 
{
	public static void init()
	{
		GameRegistry.addSmelting(ItemInit.RAW_SAUSAGE, new ItemStack(ItemInit.SAUSAGE), 0.7f);
		GameRegistry.addSmelting(ItemInit.RAW_VENISON, new ItemStack(ItemInit.COOKED_VENISON), 0.9f);
		GameRegistry.addSmelting(Items.COOKED_PORKCHOP, new ItemStack(ItemInit.BACON), 0.7f);
		GameRegistry.addSmelting(ItemInit.RAW_BURGER, new ItemStack(ItemInit.COOKED_BURGER), 0.7f);
	}
}
