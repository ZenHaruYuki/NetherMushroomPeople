
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nethermushrooms.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.nethermushrooms.potion.FungalInfectionMobEffect;
import net.mcreator.nethermushrooms.NethermushroomsMod;

public class NethermushroomsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NethermushroomsMod.MODID);
	public static final RegistryObject<MobEffect> FUNGAL_INFECTION = REGISTRY.register("fungal_infection", () -> new FungalInfectionMobEffect());
}
