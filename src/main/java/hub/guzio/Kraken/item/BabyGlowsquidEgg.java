package hub.guzio.Kraken.item;

import hub.guzio.Kraken.entity.BabyGlowsquid.BabyGlowsquidRegistrar;
import hub.guzio.Kraken.item._shared.Registrar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BabyGlowsquidEgg extends SpawnEggItem implements Registrar{

    private static final Settings settings = new Item.Settings().group(ItemGroup.MISC);
    
    public BabyGlowsquidEgg(BabyGlowsquidRegistrar entity) {
        super(entity.getSelf(), 0, 0, settings);
    }

    @Override
    public Identifier getID() {
        return Registrar.helpID("glowsquid_egg");
    }

    @Override
    public void register() {
        Registry.register(Registry.ITEM, getID(), this);
    }

    @Override
    public Settings getSettings() {
        return settings;
    }
}