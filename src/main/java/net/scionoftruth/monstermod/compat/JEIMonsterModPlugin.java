package net.scionoftruth.monstermod.compat;

import java.util.List;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IGuiHandlerRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeManager;
import net.scionoftruth.monstermod.MonsterMod;
import net.scionoftruth.monstermod.recipe.SheetPressRecipe;
import net.scionoftruth.monstermod.screen.SheetPressScreen;

@JeiPlugin
public class JEIMonsterModPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return new ResourceLocation(MonsterMod.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new SheetPressCategory(registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        RecipeManager recipeManager = Minecraft.getInstance().level.getRecipeManager();

        List<SheetPressRecipe> pressRecipes = recipeManager.getAllRecipesFor(SheetPressRecipe.Type.INSTANCE);
        registration.addRecipes(SheetPressCategory.SHEET_PRESS_TYPE, pressRecipes);
    }

    @Override
    public void registerGuiHandlers(IGuiHandlerRegistration registration) {
        registration.addRecipeClickArea(SheetPressScreen.class, 78, 28, 20, 30, SheetPressCategory.SHEET_PRESS_TYPE);
    }
}
