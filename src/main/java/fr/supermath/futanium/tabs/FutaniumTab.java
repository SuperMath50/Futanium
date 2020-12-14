package fr.supermath.futanium.tabs;

import fr.supermath.futanium.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class FutaniumTab extends CreativeTabs
{

    public FutaniumTab(String label)
    {
        super("FutaniumTab");
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.FUTANIUM_INGOT);
    }
}
