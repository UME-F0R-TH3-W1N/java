package com.turtywurty.foodmod.init;

import java.util.ArrayList;
import java.util.List;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.objects.items.ItemBase;
import com.turtywurty.foodmod.objects.items.ItemLemonSeed;
import com.turtywurty.foodmod.objects.items.ItemModDrink;
import com.turtywurty.foodmod.objects.items.ItemModFood;

import net.minecraft.item.Item;

public class ItemInit 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item TOMATO = new ItemModFood("tomato", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item LEMON = new ItemModFood("lemon", 2, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item LIME = new ItemModFood("lime", 2, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item KIWI = new ItemModFood("kiwi", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item BANANA = new ItemModFood("banana", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item LETTUCE = new ItemModFood("lettuce", 4, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item ALMONDS = new ItemModFood("almonds", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item ASPARAGUS = new ItemModFood("asparagus", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item AVOCADO = new ItemModFood("avocado", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item BACON = new ItemModFood("bacon", 5, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item BAGEL = new ItemModFood("bagel", 4, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item BEER = new ItemModDrink("beer", 2, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item BIG_MAC = new ItemModFood("big_mac", 10, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item BROCCOLI = new ItemModFood("broccoli", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item BURRITO = new ItemModFood("burrito", 6, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item CELERY = new ItemModFood("celery", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item CHEESE = new ItemModFood("cheese", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item CHOCOLATE = new ItemModFood("chocolate", 3, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item COFFEE = new ItemModDrink("coffee", 4, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item COOKED_BURGER = new ItemModFood("cooked_burger", 6, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item RAW_BURGER = new ItemModFood("raw_burger", 5, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item DOUGHNUT = new ItemModFood("doughnut", 5, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item FRIED_EGG = new ItemModFood("fried_egg", 5, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item FRIES = new ItemModFood("fries", 7, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item GRAPES = new ItemModFood("grapes", 5, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item GREEN_BEANS = new ItemModFood("green_beans", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item HASH_BROWN = new ItemModFood("hash_brown", 5, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item HONEY = new ItemModDrink("honey", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item HOT_DOG = new ItemModFood("hot_dog", 9, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item ICE_CREAM = new ItemModFood("ice_cream", 7, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item KETCHUP = new ItemModFood("ketchup", 11, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item PIZZA = new ItemModFood("pizza", 11, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item MILKSHAKE = new ItemModDrink("milkshake", 5, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item PRUNES = new ItemModFood("prunes", 3, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item RAW_SAUSAGE = new ItemModFood("raw_sausage", 5, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item SAUSAGE = new ItemModFood("sausage", 10, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item TOAST = new ItemModFood("toast", 7, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item SUSHI = new ItemModFood("sushi", 8, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item RAW_VENISON = new ItemModFood("raw_venison", 5, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item COOKED_VENISON = new ItemModFood("cooked_venison", 14, 0.3f, true).setCreativeTab(Main.FOODMODTAB);
	public static final Item PEACH = new ItemModFood("peach", 2, 0.3f, false).setCreativeTab(Main.FOODMODTAB);
	public static final Item LEMON_SEED = new ItemLemonSeed("lemon_seed").setCreativeTab(Main.FOODMODTAB);
}
