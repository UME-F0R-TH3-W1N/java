package com.turtywurty.foodmod.objects.items;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.init.ItemInit;
import com.turtywurty.foodmod.util.interfaces.IHasModel;

import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class ItemModDrink extends ItemFood implements IHasModel
{

	public ItemModDrink(String name, int amount, float saturation, boolean isWolfFood) 
	{
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		ItemInit.ITEMS.add(this);
	}
	
	 public EnumAction getItemUseAction(ItemStack stack)
	    {
	        return EnumAction.DRINK;
	    }
	
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
