package net.mcreator.nethermushrooms.procedures;

import net.minecraft.world.entity.Entity;

public class WarpedSporePlayerCollidesWithThisEntityProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.clearFire();
	}
}
