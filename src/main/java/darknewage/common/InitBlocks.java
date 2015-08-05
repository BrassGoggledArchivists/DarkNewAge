package darknewage.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import net.minecraftforge.fluids.Fluid;

import darknewage.common.blocks.BaseBlock;

public class InitBlocks
{
	public static Fluid plasmaFluid;
	public static Block blockPlasma;

	public static Block blockConcrete;

	public static Block blockSteel, blockSteelPlating;

	public static void init()
	{
		/*
		 * // Plasma plasmaFluid = new
		 * FluidPlasma("plasma").setUnlocalizedName("plasmaFluid");
		 * FluidRegistry.registerFluid(plasmaFluid);
		 * 
		 * blockPlasma = new BlockFluidPlasma(plasmaFluid,
		 * Material.lava).setBlockName("plasmaFluidBlock");
		 * GameRegistry.registerBlock(blockPlasma, "blockPlasma");
		 * 
		 * blockCeramic = new
		 * BaseBlock(Material.rock).setBlockName("blockCeramic").setResistance(
		 * 15.0F).setHardness(1.0F); GameRegistry.registerBlock(blockCeramic,
		 * "BlockCeramic");
		 */

		blockConcrete = new BaseBlock(Material.rock).setBlockName("blockCeramic").setResistance(15.0F).setHardness(1.0F);
		GameRegistry.registerBlock(blockConcrete, "BlockConcrete");

		blockSteel = new BaseBlock(Material.iron).setBlockName("blockSteel").setResistance(15.0F).setHardness(1.0F);
		GameRegistry.registerBlock(blockSteel, "BlockSteel");

		blockSteelPlating = new BaseBlock(Material.iron).setBlockName("blockSteelPlating").setResistance(15.0F).setHardness(1.0F);
		GameRegistry.registerBlock(blockSteelPlating, "BlockSteelPlating");

	}

}
