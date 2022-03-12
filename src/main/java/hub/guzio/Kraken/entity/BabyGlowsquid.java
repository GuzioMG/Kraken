package hub.guzio.Kraken.entity;

import hub.guzio.Kraken.Main;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class BabyGlowsquid extends Kraken {

    @SuppressWarnings("unchecked")
    public static final EntityType<BabyGlowsquid> self = (EntityType<BabyGlowsquid>) getSelf();

    public BabyGlowsquid(EntityType<? extends Kraken> entityType, World world) {
        super(entityType, world);
    }

    public static void register() {
        FabricDefaultAttributeRegistry.register(self, BabyGlowsquid.createMobAttributes());        
    }
    
    public static EntityType<? extends Kraken> getSelf(){
        return Registry.register(Registry.ENTITY_TYPE,
            new Identifier(Main.ID, "squid"),
            FabricEntityTypeBuilder
                .create(SpawnGroup.WATER_AMBIENT, BabyGlowsquid::new)
                .dimensions(EntityDimensions.fixed(1, 1))
            .build()
        );
    }
}