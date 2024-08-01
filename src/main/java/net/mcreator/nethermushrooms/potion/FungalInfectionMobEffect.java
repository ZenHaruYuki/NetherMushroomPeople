
package net.mcreator.nethermushrooms.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class FungalInfectionMobEffect extends MobEffect {
	public FungalInfectionMobEffect() {
		super(MobEffectCategory.HARMFUL, -16751002);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
