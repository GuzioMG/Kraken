package hub.guzio.Kraken.entity;

import hub.guzio.Kraken.launch.Main;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

public class BabySquid extends Kraken {

    @SuppressWarnings("unchecked")
    public static final EntityType<BabySquid> self = (EntityType<BabySquid>) getSelf();
    public static final Identifier ID = new Identifier(Main.ID, "squid");

    public BabySquid(EntityType<? extends Kraken> entityType, World world) {
        super(entityType, world);
    }

    public static void register(boolean client) {
        FabricDefaultAttributeRegistry.register(self, BabySquid.createMobAttributes());        
    }
    
    public static EntityType<? extends Kraken> getSelf(){
        return Registry.register(Registry.ENTITY_TYPE, ID,
            FabricEntityTypeBuilder
                .create(SpawnGroup.WATER_AMBIENT, BabySquid::new)
                .dimensions(EntityDimensions.fixed(1, 1))
            .build()
        );
    }
}