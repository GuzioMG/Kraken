package hub.guzio.Kraken.entity.BabyGlowsquid;

import hub.guzio.Kraken.entity._shared.Registrar;
import net.minecraft.entity.EntityType;

public class BabyGlowsquidRegistrar extends Registrar<BabyGlowsquidEntity>{

    public BabyGlowsquidRegistrar() {
        super("glowsquid");
    }

    @Override
    protected void register() {
    }

    @Override
    protected void registerClient() {
    }

    @Override
    protected EntityType<? extends BabyGlowsquidEntity> getSelf() {
        return null;
    }
    
}
