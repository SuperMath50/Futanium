package fr.supermath.futanium.objects.tools;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.util.interfaces.IHasModel;
import net.minecraft.item.ItemHoe;

public class ToolHoe extends ItemHoe implements IHasModel
{

    public ToolHoe(String name, ToolMaterial material)
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
