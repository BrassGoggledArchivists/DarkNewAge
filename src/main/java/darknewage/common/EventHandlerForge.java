package darknewage.common;

import net.minecraft.entity.player.EntityPlayer;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;

import net.minecraftforge.event.entity.EntityEvent.EntityConstructing;

public class EventHandlerForge
{
	@SubscribeEvent
	public void entityConstructing(EntityConstructing event)
	{
		if (event.entity instanceof EntityPlayer)
			EntityPlayerExtended.register((EntityPlayer) event.entity);
	}
}
