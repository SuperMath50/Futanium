package fr.supermath.futanium.util.Handler;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.init.BlockInit;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.util.compat.OreDictionaryCompat;
import fr.supermath.futanium.util.interfaces.IHasModel;
import fr.supermath.futanium.world.gen.WorldGenCustomOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod.EventBusSubscriber
public class RegistryHandler
{
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(ItemInit.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(BlockInit.BLOCKS.toArray(new Block[0]));
        TileEntityHandler.registerTileEntities();
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event)
    {
        for(Item item : ItemInit.ITEMS)
        {
            if(item instanceof IHasModel)
            {
                ((IHasModel)item).registerModels();
            }
        }
        for(Block block : BlockInit.BLOCKS)
        {
            if(block instanceof IHasModel)
            {
                ((IHasModel)block).registerModels();
            }
        }
    }

    public static void otherRegistries()
    {
        GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
    }



    public static void preInitRegistries(FMLPreInitializationEvent event)
    {

    }

    public static void initRegistries(FMLInitializationEvent event)
    {

        OreDictionaryCompat.registerOres();
        NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GUIHandler());

    }

    public static void postInitRegistries(FMLPostInitializationEvent event)
    {

    }

    public static void serverRegistries(FMLServerStartingEvent event)
    {

    }



}