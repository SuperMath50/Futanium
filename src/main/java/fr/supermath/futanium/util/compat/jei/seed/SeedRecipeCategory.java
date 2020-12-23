package fr.supermath.futanium.util.compat.jei.seed;

import fr.supermath.futanium.init.BlockInit;
import fr.supermath.futanium.util.Reference;
import fr.supermath.futanium.util.compat.jei.RecipeCategories;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;

public class SeedRecipeCategory extends AbstractRecipeCategory<SeedRecipe>
{

    private final IDrawable background;
    private final String localizedName;
    private final IDrawable icon;

    public SeedRecipeCategory(IGuiHelper helper)
    {
        super(helper);
        background = helper.createDrawable(TEXTURES, 0, 114, 82, 54);
        localizedName = "Seed  Fabricator";
        icon = helper.createDrawableIngredient(new ItemStack(BlockInit.SEED_ON));
    }

    @Override
    public IDrawable getBackground()
    {
        return background;
    }

    @Override
    public IDrawable getIcon()
    {
        return icon;
    }

    @Override
    public void drawExtras(Minecraft minecraft)
    {
        animatedFlame.draw(minecraft, 1, 20);
        animatedArrow.draw(minecraft, 24, 18);
    }

    @Override
    public String getTitle()
    {
        return localizedName;
    }

    @Override
    public String getModName()
    {
        return Reference.NAME;
    }

    @Override
    public String getUid()
    {
        return RecipeCategories.SEED;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, SeedRecipe ovenRecipe, IIngredients ingredients)
    {
        IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();

        guiItemStacks.init(input1, true, 0, 0);
        guiItemStacks.init(outputSlot, false, 60, 18);

        guiItemStacks.set(ingredients);
    }

}
