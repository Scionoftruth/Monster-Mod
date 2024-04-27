package net.scionoftruth.monstermod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.scionoftruth.monstermod.MonsterMod;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MonsterMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MONSTER_TAB = CREATIVE_MODE_TABS.register("monster_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MONSTER.get()))
                    .title(Component.translatable("creativetab.monster_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.MONSTER.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
