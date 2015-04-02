package me.iquintennn.BLANK.module.modules;

import java.util.ArrayList;

import me.iquintennn.BLANK.Utils.Wrapper;
import me.iquintennn.BLANK.module.Category;
import me.iquintennn.BLANK.module.Module;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;

import org.lwjgl.input.Keyboard;

public class XRay extends Module{

	public XRay() {
		super("XRay", Keyboard.KEY_X, Category.WORLD);
	}

	
	public static ArrayList<Block> xrayBlocks = new ArrayList<Block>();

	
	@Override
	public void onEnable()
	{
		XRay.xrayBlocks.add(Block.getBlockFromName("coal_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("iron_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("gold_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("redstone_ore"));
		XRay.xrayBlocks.add(Block.getBlockById(74));// Redstone ore glowing
		XRay.xrayBlocks.add(Block.getBlockFromName("lapis_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("diamond_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("emerald_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("quartz_ore"));
		XRay.xrayBlocks.add(Block.getBlockFromName("glowstone"));
		XRay.xrayBlocks.add(Block.getBlockById(8));// Water
		XRay.xrayBlocks.add(Block.getBlockById(9));// Water flowing
		XRay.xrayBlocks.add(Block.getBlockById(10));// Lava
		XRay.xrayBlocks.add(Block.getBlockById(11));// Lava flowing
		XRay.xrayBlocks.add(Block.getBlockFromName("crafting_table"));
		XRay.xrayBlocks.add(Block.getBlockById(61));// Furnace
		XRay.xrayBlocks.add(Block.getBlockById(62));// Furnace on
		XRay.xrayBlocks.add(Block.getBlockFromName("torch"));
		XRay.xrayBlocks.add(Block.getBlockFromName("ladder"));
		XRay.xrayBlocks.add(Block.getBlockFromName("tnt"));
		XRay.xrayBlocks.add(Block.getBlockFromName("coal_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("iron_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("gold_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("diamond_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("emerald_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("redstone_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("lapis_block"));
		XRay.xrayBlocks.add(Block.getBlockFromName("fire"));
		XRay.xrayBlocks.add(Block.getBlockFromName("mossy_cobblestone"));
		XRay.xrayBlocks.add(Block.getBlockFromName("mob_spawner"));
		XRay.xrayBlocks.add(Block.getBlockFromName("enchanting_table"));
		XRay.xrayBlocks.add(Block.getBlockFromName("bookshelf"));
		XRay.xrayBlocks.add(Block.getBlockFromName("command_block"));
		Block.isXRayEnabled = true;
		Minecraft.getMinecraft().renderGlobal.loadRenderers();
		Wrapper.mc.gameSettings.gammaSetting = 10f;
	}
	
	@Override
	public void onDisable()
	{
		Block.isXRayEnabled = false;
		Minecraft.getMinecraft().renderGlobal.loadRenderers();
		Wrapper.mc.gameSettings.gammaSetting = 1f;
	}
	
	public static boolean isXrayBlock(Block blockToCheck)
	{
		if(xrayBlocks.contains(blockToCheck)) {
			return true;
		}
		return false;
	}
}
	
