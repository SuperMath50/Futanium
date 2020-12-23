package fr.supermath.futanium.objects.items.fuel;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.util.interfaces.IHasModel;
import net.minecraft.item.Item;
import net.minecraft.item.ItemCoal;
import net.minecraft.item.ItemStack;

public class ItemFuelIridium extends Item implements IHasModel
{

    public ItemFuelIridium(String name)
        {

            setUnlocalizedName(name);
            setRegistryName(name);
            setCreativeTab(Main.FUTANIUMTAB);

            ItemInit.ITEMS.add(this);

        }

    @Override
    public int getItemBurnTime(ItemStack itemStack)
    {
        return 500;
    }

    @Override
        public void registerModels()
        {
            Main.proxy.registerItemRenderer(this, 0, "inventory");
        }

}
