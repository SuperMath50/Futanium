package fr.supermath.futanium.objects.items;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.util.interfaces.IHasModel;
import net.minecraft.item.ItemFood;

public class ItemFoods extends net.minecraft.item.ItemFood implements IHasModel
{

    public ItemFoods(String name, int amount, boolean isWolfFood)
    {

        super(amount, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.FUTANIUMTAB);

        ItemInit.ITEMS.add(this);

    }


    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0, "inventory");
    }

}
