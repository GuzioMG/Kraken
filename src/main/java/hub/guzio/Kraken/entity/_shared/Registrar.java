package hub.guzio.Kraken.entity._shared;

import hub.guzio.Kraken.launch.Main;
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

    protected abstract void register();
    protected abstract void registerClient();
    protected abstract EntityType<? extends T> getSelf();
}
