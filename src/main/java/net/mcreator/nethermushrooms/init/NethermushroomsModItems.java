
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nethermushrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

import net.mcreator.nethermushrooms.NethermushroomsMod;

public class NethermushroomsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NethermushroomsMod.MODID);
	public static final RegistryObject<Item> NETHER_MUSHROOM_GUY_SPAWN_EGG = REGISTRY.register("nether_mushroom_guy_spawn_egg", () -> new ForgeSpawnEggItem(NethermushroomsModEntities.NETHER_MUSHROOM_GUY, -10092544, -10092493, new Item.Properties()));
	public static final RegistryObject<Item> WARPED_SPORE_SPAWN_EGG = REGISTRY.register("warped_spore_spawn_egg", () -> new ForgeSpawnEggItem(NethermushroomsModEntities.WARPED_SPORE, -16764109, -6711040, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
