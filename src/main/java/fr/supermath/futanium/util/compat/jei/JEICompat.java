package fr.supermath.futanium.util.compat.jei;

import fr.supermath.futanium.objects.blocks.machines.oven.ContainerOven;
import fr.supermath.futanium.objects.blocks.machines.oven.GuiOven;
import fr.supermath.futanium.util.compat.jei.oven.OvenRecipeCategory;
import fr.supermath.futanium.util.compat.jei.oven.OvenRecipeMaker;
import mezz.jei.api.*;
import mezz.jei.api.ingredients.IIngredientRegistry;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import mezz.jei.api.recipe.transfer.IRecipeTransferRegistry;
import net.minecraft.util.text.translation.I18n;

import java.util.IllegalFormatException;

@JEIPlugin
public class JEICompat implements IModPlugin
{

    @Override
    public void registerCategories(IRecipeCategoryRegistration registry)
    {

        final IJeiHelpers helpers = registry.getJeiHelpers();
        final IGuiHelper gui = helpers.getGuiHelper();
        registry.addRecipeCategories(

                new OvenRecipeCategory(gui)

        );

    }

    @Override
    public void register(IModRegistry registry)
    {
        final IIngredientRegistry ingredientRegistry = registry.getIngredientRegistry();
        final IJeiHelpers jeiHelpers = registry.getJeiHelpers();
        IRecipeTransferRegistry recipeTransferRegistry = registry.getRecipeTransferRegistry();

        registry.addRecipes(OvenRecipeMaker.getFurnaceRecipes(jeiHelpers), RecipeCategories.OVEN);
        registry.addRecipeClickArea(GuiOven.class,78, 32, 28, 23, RecipeCategories.OVEN);
        recipeTransferRegistry.addRecipeTransferHandler(ContainerOven.class, RecipeCategories.OVEN,  0, 1, 3, 36);
    }

    public static String translateToLocal(String key)
    {
        if(I18n.canTranslate(key)) return I18n.translateToLocal(key);
        else return I18n.translateToFallback(key);
    }

    public static String translateToLocalFormatted(String key, Object... format)
    {
        String s = translateToLocal(key);
        try
        {
            return String.format(s, format);
        }catch (IllegalFormatException e)
        {
            return "Format error: " + s;
        }
    }

}
