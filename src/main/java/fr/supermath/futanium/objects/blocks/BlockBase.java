package fr.supermath.futanium.objects.blocks;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.BlockInit;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.tabs.FutaniumTab;
import fr.supermath.futanium.util.interfaces.IHasModel;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{

    public BlockBase(String name, Material material, CreativeTabs futaniumtab)
    {

        super(material);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.FUTANIUMTAB);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

    }

    public BlockBase(String name, Material materialIn, float hardness, float resistance)
    {

        super(materialIn);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.FUTANIUMTAB);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        setHardness(hardness);
        setResistance(resistance);
    }

    public BlockBase(String name, Material material, float hardness, float resistance, int harverstlevel, String harvestType)
    {
        this(name, material, hardness, resistance);

        setHarvestLevel(harvestType, harverstlevel);
        //0 -> bois 1 -> pierre 2 -> fer 3 -> diamant 4 -> Futanium
    }

    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

}
