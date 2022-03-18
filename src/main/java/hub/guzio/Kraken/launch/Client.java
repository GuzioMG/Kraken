package hub.guzio.Kraken.launch;

import net.fabricmc.api.ClientModInitializer;
import hub.guzio.Kraken.entity.BabyGlowsquid;
import hub.guzio.Kraken.entity.BabySquid;

public class Client implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		Main.LOGGER.info("Loading textures...");
		BabySquid.register(true);
		BabyGlowsquid.register(true);
		Main.LOGGER.info("Loaded!");
	}
}
