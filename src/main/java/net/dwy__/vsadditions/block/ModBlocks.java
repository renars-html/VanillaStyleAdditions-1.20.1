package net.dwy__.vsadditions.block;

import net.dwy__.vsadditions.VSAdditions;
import net.dwy__.vsadditions.block.custom.GlowingStoneMosaicBlock;
import net.dwy__.vsadditions.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LightBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, VSAdditions.MOD_ID);

    public static final RegistryObject<Block> STONE_MOSAIC = registerBlock("stone_mosaic",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GLOWING_STONE_MOSAIC = registerBlock("glowing_stone_mosaic",
            () -> new GlowingStoneMosaicBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)
                    .lightLevel(state -> state.getValue(GlowingStoneMosaicBlock.LIT) ? 9 : 0)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
