package fr.supermath.futanium.util.compat.jei.oven;

import fr.supermath.futanium.objects.blocks.machines.oven.slot.OvenRecipes;
import fr.supermath.futanium.util.compat.jei.JEICompat;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.item.ItemStack;

import java.awt.*;
import java.util.List;

public class OvenRecipe implements IRecipeWrapper
{

    private final List<ItemStack> inputs;
    private final ItemStack output;

    public OvenRecipe(List<ItemStack> inputs, ItemStack output)
    {
        this.inputs = inputs;
        this.output = output;
    }

    @Override
    public void getIngredients(IIngredients ingredients)
    {
        ingredients.setInputs(ItemStack.class, inputs);
        ingredients.setOutput(ItemStack.class, output);
    }

    @Override
    public void drawInfo(Minecraft minecraft, int recipeWidth, int recipeHeight, int mouseX, int mouseY)
    {
        OvenRecipes recipes = OvenRecipes.getInstance();
        float experience = recipes.getCookingExperience(output);

        if(experience > 0)
        {
            String experienceString = JEICompat.translateToLocalFormatted("gui.jei.category.smelting.experience", experience);
            FontRenderer renderer = minecraft.fontRenderer;
            int stringWidth = renderer.getStringWidth(experienceString);
            renderer.drawString(experienceString, recipeWidth - stringWidth, 0, Color.gray.getRGB());
        }
    }
}
