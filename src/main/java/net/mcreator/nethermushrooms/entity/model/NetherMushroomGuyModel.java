package net.mcreator.nethermushrooms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nethermushrooms.entity.NetherMushroomGuyEntity;

public class NetherMushroomGuyModel extends GeoModel<NetherMushroomGuyEntity> {
	@Override
	public ResourceLocation getAnimationResource(NetherMushroomGuyEntity entity) {
		return new ResourceLocation("nethermushrooms", "animations/red_mushroom.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(NetherMushroomGuyEntity entity) {
		return new ResourceLocation("nethermushrooms", "geo/red_mushroom.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(NetherMushroomGuyEntity entity) {
		return new ResourceLocation("nethermushrooms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
