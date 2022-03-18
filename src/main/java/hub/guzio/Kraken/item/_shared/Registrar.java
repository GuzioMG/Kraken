package hub.guzio.Kraken.item._shared;

import hub.guzio.Kraken.launch.Main;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;

public interface Registrar{

    public static Identifier helpID(String ID){
        return new Identifier(Main.ID, ID);
    }

    public Identifier getID();
    public void register();
    public Settings getSettings();
}
