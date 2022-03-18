package hub.guzio.Kraken.item._shared;

import net.minecraft.item.FoodComponent;

public enum FoodData {;

    String _fix = ""; //For whatever reason, syntax highlighting on Eclpise/VSCode is broken for the first type in Enums. This string is used as a filler to fix it.

    private static int 
        CodBase = 2,
       CCodBase = 5,

       BerryBase = 2,
       BerryCount = 4,
       BerryBaseTotal = BerryCount*BerryBase;

    private static float
         CodSat = 0.1f,
        CCodSat = 0.6f,
        
        BerrySat = 0.1f,
        BerrySatTotal = BerrySat*BerryBase;
    
    public static FoodComponent
    RAW    = new FoodComponent.Builder().hunger( CodBase+BerryBaseTotal).saturationModifier( CodSat+BerrySatTotal).build(),
    COOKED = new FoodComponent.Builder().hunger(CCodBase+BerryBaseTotal).saturationModifier(CCodSat+BerrySatTotal).build();
    //TODO: Add effects
}
