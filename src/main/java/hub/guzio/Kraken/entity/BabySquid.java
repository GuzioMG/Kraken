package hub.guzio.Kraken.entity;

import hub.guzio.Kraken.Main;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class BabySquid extends Kraken {

    public static final EntityType<BabySquid> self = getSelf();

    public BabySquid(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
        
    }

    public static void register() {
        FabricDefaultAttributeRegistry.register(self, BabySquid.createMobAttributes());        
    }
    
    public static EntityType<BabySquid> getSelf(){
        return Registry.register(Registry.ENTITY_TYPE,
            new Identifier(Main.ID, "squid"),
            FabricEntityTypeBuilder
                .create(SpawnGroup.WATER_AMBIENT, BabySquid::new)
                .dimensions(EntityDimensions.fixed(1, 1))
            .build()
        );
    }
}
