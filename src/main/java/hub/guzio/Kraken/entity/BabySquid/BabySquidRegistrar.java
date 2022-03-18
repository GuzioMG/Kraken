package hub.guzio.Kraken.entity.BabySquid;

import hub.guzio.Kraken.entity._shared.Registrar;
import net.minecraft.entity.EntityType;

public class BabySquidRegistrar extends Registrar<BabySquidEntity>{

    public BabySquidRegistrar() {
        super("squid");
    }

    @Override
    protected void register() {
    }

    @Override
    protected void registerClient() {
    }

    @Override
    protected EntityType<? extends BabySquidEntity> getSelf() {
        return null;
    }
    
}
