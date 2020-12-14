package fr.supermath.futanium.util.compat.jei.oven;

import com.google.common.collect.Lists;
import com.google.common.collect.Table;
import fr.supermath.futanium.objects.blocks.machines.oven.slot.OvenRecipes;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OvenRecipeMaker
{

    public static List<OvenRecipe> getFurnaceRecipes(IJeiHelpers helpers) {
        IStackHelper stackHelper = helpers.getStackHelper();
        OvenRecipes instance = OvenRecipes.instance();
        Map<ItemStack, ItemStack> smeltingMap = instance.getCookingList();

        List<OvenRecipe> recipes = new ArrayList<>();

        for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet()) {
            ItemStack input = entry.getKey();
            ItemStack output = entry.getValue();

            List<ItemStack> inputs = stackHelper.getSubtypes(input);
            OvenRecipe recipe = new OvenRecipe(inputs, output);
            recipes.add(recipe);
        }

        return recipes;
    }

}
