package hub.guzio.Kraken.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.WaterCreatureEntity;
import net.minecraft.world.World;

public abstract class Kraken extends WaterCreatureEntity{

    protected Kraken(EntityType<? extends WaterCreatureEntity> entityType, World world) {
        super(entityType, world);
    }

    public static void register(boolean client) throws UnsupportedOperationException{
        throw new UnsupportedOperationException("This method may only be accessed from a class that extends this class");
    }
    
    public static EntityType<? extends Kraken> getSelf() throws UnsupportedOperationException{
        throw new UnsupportedOperationException("This method may only be accessed from a class that extends this class");
    }
}
