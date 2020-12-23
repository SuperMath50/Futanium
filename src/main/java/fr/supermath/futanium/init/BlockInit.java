package fr.supermath.futanium.init;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.objects.blocks.BlockBase;
import fr.supermath.futanium.objects.blocks.BlockOre;
import fr.supermath.futanium.objects.blocks.crops.BlockEggplant;
import fr.supermath.futanium.objects.blocks.crops.BlockRudium;
import fr.supermath.futanium.objects.blocks.machines.oven.OvenFurnace;
import fr.supermath.futanium.objects.blocks.machines.seed.SeedFabricator;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class BlockInit
{

    public static final List<Block> BLOCKS = new ArrayList<Block>();

    //Ore
    public static final Block ORE_OVERWORLD = new BlockOre("ore_overworld", "overworld", 5.0F, 30F, 4, "pickaxe");
    public static final Block ORE_NETHER = new BlockOre("ore_nether", "nether", 10.0F, 30F, 4, "pickaxe");
    public static final Block ORE_END = new BlockOre("ore_end", "end", 10.0F, 30F, 4, "pickaxe");

    //Blocks
    public static final Block FUTANIUM_BLOCK = new BlockBase("futanium_block", Material.IRON, 3F, 30F, 1, "pickaxe");
    public static final Block BETON = new BlockBase("beton", Material.IRON, 6F, 60F, 5, "pickaxe");

    //Machine
    public static final Block OVEN_ON = new OvenFurnace("oven_on", true);
    public static final Block OVEN_OFF = new OvenFurnace("oven_off", false).setCreativeTab(Main.FUTANIUMTAB);

    public static final Block SEED_ON = new SeedFabricator("seed_on", true);
    public static final Block SEED_OFF = new SeedFabricator("seed_off", false).setCreativeTab(Main.FUTANIUMTAB);

    //Crop
    public static final Block EGGPLANT_CROP = new BlockEggplant("eggplant_crops");
    public static final Block RUDIUM_CROP = new BlockRudium("rudium_crops");

}