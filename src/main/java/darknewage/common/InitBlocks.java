package darknewage.common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import cpw.mods.fml.common.registry.GameRegistry;

import darknewage.common.blocks.BaseBlock;
import darknewage.common.blocks.BlockFluidPlasma;
import darknewage.common.blocks.FluidPlasma;

import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class InitBlocks
{
	public static Fluid plasmaFluid;
	public static Block blockPlasma;

	public static Block blockCeramic;

	public static void init()
	{
		// Plasma
		plasmaFluid = new FluidPlasma("plasma").setUnlocalizedName("plasmaFluid");
		FluidRegistry.registerFluid(plasmaFluid);

		blockPlasma = new BlockFluidPlasma(plasmaFluid, Material.lava).setBlockName("plasmaFluidBlock");
		GameRegistry.registerBlock(blockPlasma, "blockPlasma");

		blockCeramic = new BaseBlock(Material.rock).setBlockName("blockCeramic").setResistance(15.0F).setHardness(1.0F);
		GameRegistry.registerBlock(blockCeramic, "BlockCeramic");
	}

}
