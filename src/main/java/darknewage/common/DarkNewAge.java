package darknewage.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;

@Mod(modid = "darknewage", name = "Dark New Age", version = "Beta R1.0", dependencies = "after:BuildCraft|Core; after:TConstruct; after:ForgeMultipart; after:MineFactoryReloaded")
public class DarkNewAge
{

	// @SidedProxy(clientSide = "boilerplate.client.ClientProxy", serverSide =
	// "boilerplate.common.CommonProxy")
	// public static CommonProxy proxy;

	@Instance("darknewage")
	public static DarkNewAge instance;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		Configuration config = new Configuration(event.getSuggestedConfigurationFile());
		config.load();

		config.save();
		MinecraftForge.EVENT_BUS.register(new EventHandlerForge());
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		InitBlocks.init();
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}

	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
	}
}
