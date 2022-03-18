package hub.guzio.Kraken.launch;

import hub.guzio.Kraken.entity.BabyGlowsquid.BabyGlowsquidRegistrar;
import hub.guzio.Kraken.entity.BabySquid.BabySquidRegistrar;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.model.EntityModelLayer;

@Environment(EnvType.CLIENT)
public class Client implements ClientModInitializer {

	public static final EntityModelLayer MODEL_BGS_LAYER = new EntityModelLayer(BabyGlowsquidRegistrar.getInstance().getID(), "main");
	public static final EntityModelLayer MODEL_BS_LAYER = new EntityModelLayer(BabySquidRegistrar.getInstance().getID(), "main");

	@Override
	public void onInitializeClient() {
		Main.LOGGER.info("Loading textures...");
		Main.babySquidEntity.registerClient();
		Main.babyGlowsquidEntity.registerClient();
		Main.LOGGER.info("Loaded!");
	}
}