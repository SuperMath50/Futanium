package fr.supermath.futanium.objects.tools;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.util.interfaces.IHasModel;
import net.minecraft.advancements.critereon.ItemDurabilityTrigger;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel
{

    public ToolPickaxe(String name, ToolMaterial material)
    {
        super(material);
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
