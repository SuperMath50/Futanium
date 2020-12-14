package fr.supermath.futanium.util.Handler;


import fr.supermath.futanium.objects.blocks.machines.oven.TileEntityOven;
import fr.supermath.futanium.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler
{

    public static void registerTileEntities()
    {
       GameRegistry.registerTileEntity(TileEntityOven.class, new ResourceLocation(Reference.MODID + "oven"));
    }

}
