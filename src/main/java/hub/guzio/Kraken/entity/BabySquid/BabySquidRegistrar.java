package hub.guzio.Kraken.entity.BabySquid;

import hub.guzio.Kraken.entity._shared.Registrar;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public class BabySquidRegistrar extends Registrar<BabySquidEntity>{

    private static BabySquidRegistrar i;
    private EntityType<BabySquidEntity> self;

    public BabySquidRegistrar() {
        super("squid");
        i = this;
    }

    @Override
    public void register() {
        self = Registry.register(Registry.ENTITY_TYPE, getID(),
            FabricEntityTypeBuilder
                .create(SpawnGroup.WATER_AMBIENT, BabySquidEntity::new)
                .dimensions(EntityDimensions.fixed(1, 1))
            .build()
        );

        FabricDefaultAttributeRegistry.register(getSelf(), BabySquidEntity.createMobAttributes());
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void registerClient() {

    }

    @Override
    public EntityType<? extends BabySquidEntity> getSelf() {
        return self;
    }

    public static BabySquidRegistrar getInstance() {
        return i;
    }
}