package fr.supermath.futanium.objects.armour;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.util.interfaces.IHasModel;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ArmourBase extends ItemArmor implements IHasModel
{
    public ArmourBase(String name, ArmorMaterial materialIn, int rendererIndexIn, EntityEquipmentSlot equipmentSlotIn)
    {
        super(materialIn, rendererIndexIn, equipmentSlotIn);
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
