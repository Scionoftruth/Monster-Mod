package net.scionoftruth.monstermod.item.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.scionoftruth.monstermod.MonsterMod;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> MONSTER_ORES = tag("monster_ores");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(MonsterMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(MonsterMod.MOD_ID, name));
        }
    }
}
