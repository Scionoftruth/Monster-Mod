package net.scionoftruth.monstermod.recipe;

import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.scionoftruth.monstermod.MonsterMod;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, MonsterMod.MOD_ID);

    public static final RegistryObject<RecipeSerializer<SheetPressRecipe>> SHEET_PRESS_SERIALIZER =
            SERIALIZERS.register("sheet_press", () -> SheetPressRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
