package fr.supermath.futanium.world.gen;

import fr.supermath.futanium.init.BlockInit;
import fr.supermath.futanium.objects.blocks.BlockOre;
import fr.supermath.futanium.util.Handler.EnumHandeler;
import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class WorldGenCustomOres implements IWorldGenerator
{

    private WorldGenerator ore_overworld_olonium, ore_nether_olonium, ore_end_olonium;
    private WorldGenerator ore_overworld_multiver, ore_nether_multiver, ore_end_multiver;
    private WorldGenerator ore_overworld_futanium, ore_nether_futanium;


    public WorldGenCustomOres()
    {
        ore_overworld_olonium = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.OLONIUM), 7, BlockMatcher.forBlock(Blocks.STONE));

        ore_overworld_futanium = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.FUTANIUM), 2, BlockMatcher.forBlock(Blocks.STONE));

        ore_overworld_multiver = new WorldGenMinable(BlockInit.ORE_OVERWORLD.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.MULTIVER), 3, BlockMatcher.forBlock(Blocks.STONE));

        ore_nether_multiver = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.MULTIVER), 2, BlockMatcher.forBlock(Blocks.NETHERRACK));

        ore_nether_futanium = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.FUTANIUM), 2, BlockMatcher.forBlock(Blocks.NETHERRACK));

       ore_nether_olonium = new WorldGenMinable(BlockInit.ORE_NETHER.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.OLONIUM), 3, BlockMatcher.forBlock(Blocks.NETHERRACK));

       ore_end_olonium = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.OLONIUM), 4, BlockMatcher.forBlock(Blocks.END_STONE));

       ore_end_multiver = new WorldGenMinable(BlockInit.ORE_END.getDefaultState().withProperty(BlockOre.VARIANT, EnumHandeler.EnumType.MULTIVER), 5, BlockMatcher.forBlock(Blocks.END_STONE));
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider)
    {
        switch (world.provider.getDimension())
        {
            case 0:
                runGenerator(ore_overworld_olonium, world, random, chunkX, chunkZ, 4, 0, 50);
                runGenerator(ore_overworld_futanium, world, random, chunkX, chunkZ, 2, 0, 20);
                runGenerator(ore_overworld_multiver, world, random, chunkX, chunkZ, 2, 0, 20);

                break;
            case -1:
                runGenerator(ore_nether_olonium, world, random, chunkX, chunkZ, 5, 0, 100);
                runGenerator(ore_nether_futanium, world, random, chunkX, chunkZ, 50, 0, 100);
                runGenerator(ore_nether_multiver, world, random, chunkX, chunkZ, 50, 0, 100);

                break;
            case 1:
                runGenerator(ore_end_olonium, world, random, chunkX, chunkZ, 20, 0, 256);
                runGenerator(ore_end_multiver, world, random, chunkX, chunkZ, 20, 0, 256);
        }
    }

    private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
    {
        if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generation out of bound");

        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chance; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);

            gen.generate(world, rand, new BlockPos( x, y, z));
        }
    }

}
