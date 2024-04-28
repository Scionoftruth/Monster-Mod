package net.scionoftruth.monstermod.datagen;

import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.scionoftruth.monstermod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.scionoftruth.monstermod.MonsterMod;
import net.scionoftruth.monstermod.item.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MonsterMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.MONSTER_ORES)
                .add(ModBlocks.ALUMINIUM_ORE.get()).addTag(Tags.Blocks.ORES);

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ALUMINIUM_ORE.get(),
                        ModBlocks.MONSTER_BLOCK.get()
        );

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.ALUMINIUM_ORE.get(),
                        ModBlocks.MONSTER_BLOCK.get()
                );

    }
}
