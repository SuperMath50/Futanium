package fr.supermath.futanium.objects.blocks.machines.oven.slot;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import fr.supermath.futanium.init.BlockInit;
import fr.supermath.futanium.init.ItemInit;
import fr.supermath.futanium.objects.blocks.machines.oven.GuiOven;
import mezz.jei.api.recipe.IRecipeCategory;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.SlotFurnaceOutput;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.profiler.Profiler;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityLockableLoot;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;


import java.util.Map;

public class OvenRecipes extends Ingredient
{
    private final Table<ItemStack, ItemStack, ItemStack> smeltingList = HashBasedTable.<ItemStack, ItemStack, ItemStack>create();
    private static final OvenRecipes INSTANCE = new OvenRecipes();
    private static final OvenRecipes COOKING_BASE = new OvenRecipes();
    private final Map<ItemStack, ItemStack> cookingList = Maps.<ItemStack, ItemStack>newHashMap();
    private final Map<ItemStack, Float> experienceList = Maps.<ItemStack, Float>newHashMap();

    public static OvenRecipes instance()
    {
        return COOKING_BASE;
    }

    public static OvenRecipes getInstance()
    {
        return INSTANCE;
    }


    public static ItemStack getCookerOutputForItemStack(ItemStack itemStack) {
        ItemStack resultStack = FurnaceRecipes.instance().getSmeltingResult(itemStack);

        if (resultStack == null) {
            return null;
        }

        if (resultStack.getItem() instanceof ItemFood) {
            return resultStack;
        }

        return null;
    }

    private OvenRecipes()
    {

        //addCookingRecipe(new ItemStack(Block/Item, nombre, meta), new ItemStack(Block/Item, nombre), experience.0F);
        addCookingRecipe(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 0), new ItemStack(ItemInit.OLONIUM_INGOT, 1), 1.0F);
        addCookingRecipe(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 1), new ItemStack(ItemInit.FUTANIUM_INGOT, 1), 10.0F);
        addCookingRecipe(new ItemStack(BlockInit.ORE_OVERWORLD, 1, 2), new ItemStack(ItemInit.IRIDIUM_INGOT, 1), 5.0F);

        addCookingRecipe(new ItemStack(BlockInit.ORE_NETHER, 1, 0), new ItemStack(ItemInit.MULTIVER_INGOT, 1), 3.0F);
        addCookingRecipe(new ItemStack(BlockInit.ORE_NETHER, 1, 1), new ItemStack(ItemInit.FUTANIUM_INGOT, 1), 5.0F);
        addCookingRecipe(new ItemStack(BlockInit.ORE_NETHER, 1, 2), new ItemStack(ItemInit.GALLIUM_INGOT, 1), 10.0F);

        addCookingRecipe(new ItemStack(BlockInit.ORE_END, 1, 0), new ItemStack(ItemInit.FUTANIUM_INGOT, 1), 20.0F);
        addCookingRecipe(new ItemStack(BlockInit.ORE_END, 1, 2), new ItemStack(ItemInit.GALLIUM_INGOT, 1), 20.0F);

        addCookingRecipe(new ItemStack(Blocks.STONE, 1, 0), new ItemStack(BlockInit.BETON, 1), 1.0F);































}

    public void addCookingRecipeForBlock(Block input, ItemStack stack, float experience)
    {
        this.addCooking(Item.getItemFromBlock(input), stack, experience);
    }

    public void addCooking(Item input, ItemStack stack, float experience)
    {
        this.addCookingRecipe(new ItemStack(input, 1, 32767), stack, experience);
    }

    public void addCookingRecipe(ItemStack input, ItemStack stack, float experience)
    {
        if (getCookingResult(input) != ItemStack.EMPTY)
        {
            net.minecraftforge.fml.common.FMLLog.log.info("Ignored cooking recipe with conflicting input: {} = {}", input, stack); return;
        }
        this.cookingList.put(input, stack);
        this.experienceList.put(stack, Float.valueOf(experience));
    }

    public ItemStack getCookingResult(ItemStack stack)
    {
        for (Map.Entry<ItemStack, ItemStack> entry : this.cookingList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return entry.getValue();
            }
        }

        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2)
    {
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }

    public Table<ItemStack, ItemStack, ItemStack> getDualSmeltingList()
    {
        return this.smeltingList;
    }

    public Map<ItemStack, ItemStack> getCookingList()
    {
        return this.cookingList;
    }

    public float getCookingExperience(ItemStack stack)
    {
        float ret = stack.getItem().getSmeltingExperience(stack);
        if (ret != -1) return ret;
        for (Map.Entry<ItemStack, Float> entry : this.experienceList.entrySet())
        {
            if (this.compareItemStacks(stack, entry.getKey()))
            {
                return ((Float)entry.getValue()).floatValue();
            }
        }
        return 0.0F;
    }

}
