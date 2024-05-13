package net.scionoftruth.monstermod.compat;

import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.scionoftruth.monstermod.MonsterMod;
import net.scionoftruth.monstermod.recipe.SheetPressRecipe;
import net.scionoftruth.monstermod.block.ModBlocks;

public class SheetPressCategory implements IRecipeCategory<SheetPressRecipe> {
    public static final ResourceLocation UID = new ResourceLocation(MonsterMod.MOD_ID, "sheet_press");
    public static final ResourceLocation TEXTURE =
            new ResourceLocation(MonsterMod.MOD_ID, "textures/gui/sheet_press_gui.png");

    public static final RecipeType<SheetPressRecipe> SHEET_PRESS_TYPE =
            new RecipeType<>(UID, SheetPressRecipe.class);

    private final IDrawable background;
    private final IDrawable icon;

    public SheetPressCategory(IGuiHelper helper) {
        this.background = helper.createDrawable(TEXTURE, 0 , 0, 176, 80);
        this.icon = helper.createDrawableIngredient(VanillaTypes.ITEM_STACK, new ItemStack(ModBlocks.Sheet_Press.get()));
    }

    @Override
    public RecipeType<SheetPressRecipe> getRecipeType() {
        return SHEET_PRESS_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("block.monstermod.sheet_press");
    }

    @Override
    public IDrawable getBackground() {
        return this.background;
    }

    @Override
    public IDrawable getIcon() {
        return this.icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, SheetPressRecipe recipe, IFocusGroup focuses) {
        builder.addSlot(RecipeIngredientRole.INPUT, 80, 11).addIngredients(recipe.getIngredients().get(0));
        builder.addSlot(RecipeIngredientRole.OUTPUT, 80, 59).addItemStack(recipe.getResultItem(null));
    }
}
