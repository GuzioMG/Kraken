package hub.guzio.Kraken.item;

import hub.guzio.Kraken.item._shared.FoodData;
import hub.guzio.Kraken.item._shared.Registrar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Glod extends Item implements Registrar{

    private static final Settings settings = new Item.Settings().group(ItemGroup.FOOD).food(FoodData.RAW);

    public Glod() {
        super(settings);
    }

    @Override
    public Identifier getID() {
        return Registrar.helpID("glod");
    }

    @Override
    public void register() {
        Registry.register(Registry.ITEM, getID(), this);
    }

    @Override
    public Settings getSettings() {
        return settings;
    }

    //TODO: Make this guy breed glowsquids
}
