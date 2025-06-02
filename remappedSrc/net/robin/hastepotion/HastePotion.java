package net.robin.hastepotion;

import net.fabricmc.api.ModInitializer;

import net.robin.hastepotion.common.registry.modPotions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HastePotion implements ModInitializer {
	public static final String MOD_ID = "hastepotion";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Initializing Haste Potion");

		modPotions.registerPotions();
	}
}