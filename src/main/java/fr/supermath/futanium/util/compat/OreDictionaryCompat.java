package fr.supermath.futanium.util.compat;

import fr.supermath.futanium.init.ItemInit;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryCompat
{

    public static void registerOres()
    {
        OreDictionary.registerOre("ingotIridium", ItemInit.IRIDIUM_INGOT);
        OreDictionary.registerOre("ingotOlonium", ItemInit.OLONIUM_INGOT);
        OreDictionary.registerOre("ingotFutanium", ItemInit.FUTANIUM_INGOT);
        OreDictionary.registerOre("ingotMultiver", ItemInit.MULTIVER_INGOT);
        OreDictionary.registerOre("ingotGallium", ItemInit.GALLIUM_INGOT);
    }

}
