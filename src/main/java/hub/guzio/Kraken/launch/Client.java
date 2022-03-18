package hub.guzio.Kraken.launch;

import net.fabricmc.api.ClientModInitializer;

public class Client implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		Main.LOGGER.info("Loading textures...");
		Main.babySquidEntity.registerClient();
		Main.babyGlowsquidEntity.registerClient();
		Main.LOGGER.info("Loaded!");
	}
}
