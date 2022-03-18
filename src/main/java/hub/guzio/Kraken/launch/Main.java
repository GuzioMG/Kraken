package hub.guzio.Kraken.launch;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import hub.guzio.Kraken.entity.BabyGlowsquid.BabyGlowsquidRegistrar;
import hub.guzio.Kraken.entity.BabySquid.BabySquidRegistrar;

public class Main implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String ID = "kraken";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	public static final BabySquidRegistrar babySquidEntity = new BabySquidRegistrar();
	public static final BabyGlowsquidRegistrar babyGlowsquidEntity = new BabyGlowsquidRegistrar();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Starting...");
		babySquidEntity.register();
		babyGlowsquidEntity.register();

		LOGGER.info("Done!");
	}
}
