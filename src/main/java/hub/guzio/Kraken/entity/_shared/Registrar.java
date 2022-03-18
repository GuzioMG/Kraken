package hub.guzio.Kraken.entity._shared;

import hub.guzio.Kraken.launch.Main;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.Identifier;

public abstract class Registrar<T extends SquidEntity>{

    private Identifier ID;

    protected Registrar(String ID) {
        this.ID = new Identifier(Main.ID, ID);
    }

    public Identifier getID(){
        return ID;
    }

    public abstract void register();

    @Environment(EnvType.CLIENT)
    public abstract void registerClient();
    
    public abstract EntityType<? extends T> getSelf();
}
