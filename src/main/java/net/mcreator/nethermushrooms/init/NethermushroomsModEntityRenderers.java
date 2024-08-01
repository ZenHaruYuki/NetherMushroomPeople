
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nethermushrooms.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.nethermushrooms.client.renderer.WarpedSporeRenderer;
import net.mcreator.nethermushrooms.client.renderer.NetherMushroomGuyRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NethermushroomsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(NethermushroomsModEntities.NETHER_MUSHROOM_GUY.get(), NetherMushroomGuyRenderer::new);
		event.registerEntityRenderer(NethermushroomsModEntities.WARPED_SPORE.get(), WarpedSporeRenderer::new);
	}
}
