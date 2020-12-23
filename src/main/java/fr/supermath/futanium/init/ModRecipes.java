package fr.supermath.futanium.init;

import fr.supermath.futanium.objects.blocks.BlockOre;
import fr.supermath.futanium.util.interfaces.IMetaName;
import fr.supermath.futanium.world.gen.WorldGenCustomOres;
import net.minecraft.item.ItemStack;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import fr.supermath.futanium.util.Handler.EnumHandeler;

public class ModRecipes
{

    public static ModRecipes instance = new ModRecipes();

    public void initRecipes()
    {

      //GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_END, 1, 2), new ItemStack(ItemInit.GALLIUM_INGOT, 1), 10.0F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 0), new ItemStack(ItemInit.OLONIUM_INGOT, 1), 0.7F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 1), new ItemStack(ItemInit.FUTANIUM_INGOT, 1), 4.7F);
        GameRegistry.addSmelting(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 2), new ItemStack(ItemInit.IRIDIUM_INGOT, 1), 1.0F);

    }

}
