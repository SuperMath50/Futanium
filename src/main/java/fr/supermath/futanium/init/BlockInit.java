package fr.supermath.futanium.init;

import fr.supermath.futanium.Main;
import fr.supermath.futanium.objects.blocks.BlockBase;
import fr.supermath.futanium.objects.blocks.BlockOre;
import fr.supermath.futanium.objects.blocks.machines.oven.OvenFurnace;
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

    //Gachine
    public static final Block OVEN_ON = new OvenFurnace("oven_on", true);
    public static final Block OVEN_OFF = new OvenFurnace("oven_off", false).setCreativeTab(Main.FUTANIUMTAB);
}
