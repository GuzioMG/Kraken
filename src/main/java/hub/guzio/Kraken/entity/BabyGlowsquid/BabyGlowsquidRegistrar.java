package hub.guzio.Kraken.entity.BabyGlowsquid;

import hub.guzio.Kraken.entity._shared.Registrar;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.registry.Registry;

public class BabyGlowsquidRegistrar extends Registrar<BabyGlowsquidEntity>{

    private static BabyGlowsquidRegistrar i;
    private EntityType<BabyGlowsquidEntity> self;

    public BabyGlowsquidRegistrar() {
        super("glowsquid");
        i = this;
    }

    @Override
    public void register() {
        self = Registry.register(Registry.ENTITY_TYPE, getID(),
            FabricEntityTypeBuilder
                .create(SpawnGroup.WATER_AMBIENT, BabyGlowsquidEntity::new)
                .dimensions(EntityDimensions.fixed(1, 1))
            .build()
        );

        FabricDefaultAttributeRegistry.register(getSelf(), BabyGlowsquidEntity.createMobAttributes());
    }

    @Override
    @Environment(EnvType.CLIENT)
    public void registerClient() {
        
    }

    @Override
    public EntityType<? extends BabyGlowsquidEntity> getSelf() {
        return self;
    }

    public static BabyGlowsquidRegistrar getInstance() {
        return i;
    }
}