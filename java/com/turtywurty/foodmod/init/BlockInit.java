package com.turtywurty.foodmod.init;

import java.util.ArrayList;
import java.util.List;

import com.turtywurty.foodmod.Main;
import com.turtywurty.foodmod.objects.blocks.BlenderBlock;
import com.turtywurty.foodmod.objects.blocks.LemonCropBlock;
import com.turtywurty.foodmod.objects.blocks.ChairBlock;
import com.turtywurty.foodmod.objects.blocks.MicrowaveBlock;
import com.turtywurty.foodmod.objects.blocks.PlateBlock;
import com.turtywurty.foodmod.objects.items.ItemModFood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class BlockInit 
	{
		public static final List<Block> BLOCKS = new ArrayList<Block>();
	
		//Custom Model Blocks
		public static final Block BLENDER_BLOCK = new BlenderBlock("blender_block", Material.IRON);
		public static final Block MICROWAVE_BLOCK = new MicrowaveBlock("microwave_block", Material.IRON);
		public static final Block PLATE_BLOCK = new PlateBlock("plate_block", Material.IRON);
		public static final Block CHAIR_BLOCK = new ChairBlock("chair_block", Material.WOOD);
		public static final Block CROP_LEMON_BLOCK = new LemonCropBlock("crop_lemon_block");
	
		//Blocks
		
	}