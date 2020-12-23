package fr.supermath.futanium.util.compat.jei.seed;

import fr.supermath.futanium.objects.blocks.machines.seed.slot.SeedRecipes;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.recipe.IStackHelper;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeedRecipeMaker
{

    public static List<SeedRecipe> getFurnaceRecipes(IJeiHelpers helpers) {
        IStackHelper stackHelper = helpers.getStackHelper();
        SeedRecipes instance = SeedRecipes.instance();
        Map<ItemStack, ItemStack> smeltingMap = instance.getCookingList();

        List<SeedRecipe> recipes = new ArrayList<>();

        for (Map.Entry<ItemStack, ItemStack> entry : smeltingMap.entrySet()) {
            ItemStack input = entry.getKey();
            ItemStack output = entry.getValue();

            List<ItemStack> inputs = stackHelper.getSubtypes(input);
            SeedRecipe recipe = new SeedRecipe(inputs, output);
            recipes.add(recipe);
        }

        return recipes;
    }

}
