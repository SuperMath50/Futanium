package fr.supermath.futanium;

import fr.supermath.futanium.init.ModRecipes;
import fr.supermath.futanium.proxy.CommonProxy;
import fr.supermath.futanium.tabs.FutaniumTab;
import fr.supermath.futanium.util.Handler.RegistryHandler;
import fr.supermath.futanium.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Ref;
import java.util.Arrays;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main
{

    @Instance
    public static Main instance;

    public static final String NAME = "futanium";

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    public static final CreativeTabs FUTANIUMTAB = new FutaniumTab("tutaniumtab");

    public static boolean commonCapsLoaded;
    public static final Logger LOGGER = LogManager.getLogger(NAME);

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        RegistryHandler.otherRegistries();
        RegistryHandler.preInitRegistries(event);
        commonCapsLoaded = Loader.isModLoaded("commoncapabilities");
        Main.LOGGER.info("Starting PreInitialization Phase...");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.instance.initRecipes();
        RegistryHandler.initRegistries(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        RegistryHandler.postInitRegistries(event);
    }

    @EventHandler
    public void serverRegistries(FMLServerStartingEvent event)
    {
        RegistryHandler.serverRegistries(event);
    }

}
