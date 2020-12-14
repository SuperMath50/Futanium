package fr.supermath.futanium.util.compat.jei.oven;

import fr.supermath.futanium.util.Reference;
import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawableAnimated;
import mezz.jei.api.gui.IDrawableStatic;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.api.recipe.IRecipeWrapper;
import net.minecraft.util.ResourceLocation;

public abstract class AbstractRecipeCategory<T extends IRecipeWrapper> implements IRecipeCategory<T>
{

    protected static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MODID + ":textures/gui/jeioven.png");

    protected static final int input1 = 0;
    protected static final int fuelSlot = 1;
    protected static final int outputSlot = 2;

    protected final IDrawableStatic staticFlame;
    protected final IDrawableAnimated animatedFlame;
    protected final IDrawableAnimated animatedArrow;

    public AbstractRecipeCategory(IGuiHelper helper)
    {
        staticFlame = helper.createDrawable(TEXTURES, 82, 114, 14, 14);
        animatedFlame = helper.createAnimatedDrawable(staticFlame, 300, IDrawableAnimated.StartDirection.TOP, true);

        IDrawableStatic statcArrow = helper.createDrawable(TEXTURES, 82, 128, 24, 17);
        animatedArrow = helper.createAnimatedDrawable(statcArrow, 200, IDrawableAnimated.StartDirection.LEFT, false);
    }

}
