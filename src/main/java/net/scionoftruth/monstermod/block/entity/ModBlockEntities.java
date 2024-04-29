package net.scionoftruth.monstermod.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.scionoftruth.monstermod.MonsterMod;
import net.minecraftforge.registries.ForgeRegistries;
import net.scionoftruth.monstermod.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MonsterMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<SheetPressBlockEntity>> SHEET_PRESS_BE =
            BLOCK_ENTITIES.register("sheet_press_be", () ->
                    BlockEntityType.Builder.of(SheetPressBlockEntity::new,
                            ModBlocks.Sheet_Press.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
