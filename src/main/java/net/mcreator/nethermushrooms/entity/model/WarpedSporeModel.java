package net.mcreator.nethermushrooms.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.nethermushrooms.entity.WarpedSporeEntity;

public class WarpedSporeModel extends GeoModel<WarpedSporeEntity> {
	@Override
	public ResourceLocation getAnimationResource(WarpedSporeEntity entity) {
		return new ResourceLocation("nethermushrooms", "animations/warpedspore.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WarpedSporeEntity entity) {
		return new ResourceLocation("nethermushrooms", "geo/warpedspore.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WarpedSporeEntity entity) {
		return new ResourceLocation("nethermushrooms", "textures/entities/" + entity.getTexture() + ".png");
	}

}
