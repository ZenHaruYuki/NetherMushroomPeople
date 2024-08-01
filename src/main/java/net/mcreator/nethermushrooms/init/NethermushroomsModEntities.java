
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nethermushrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.nethermushrooms.entity.WarpedSporeEntity;
import net.mcreator.nethermushrooms.entity.NetherMushroomGuyEntity;
import net.mcreator.nethermushrooms.NethermushroomsMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NethermushroomsModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NethermushroomsMod.MODID);
	public static final RegistryObject<EntityType<NetherMushroomGuyEntity>> NETHER_MUSHROOM_GUY = register("nether_mushroom_guy",
			EntityType.Builder.<NetherMushroomGuyEntity>of(NetherMushroomGuyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(NetherMushroomGuyEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<WarpedSporeEntity>> WARPED_SPORE = register("warped_spore", EntityType.Builder.<WarpedSporeEntity>of(WarpedSporeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(WarpedSporeEntity::new).fireImmune().sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			NetherMushroomGuyEntity.init();
			WarpedSporeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(NETHER_MUSHROOM_GUY.get(), NetherMushroomGuyEntity.createAttributes().build());
		event.put(WARPED_SPORE.get(), WarpedSporeEntity.createAttributes().build());
	}
}
