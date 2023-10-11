package net.dwy__.vsadditions.item;

import net.dwy__.vsadditions.VSAdditions;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, VSAdditions.MOD_ID);

    public static final RegistryObject<CreativeModeTab> VSA_TAB = CREATIVE_MODE_TABS.register("vsa_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.OBSIDIAN_SHARD.get()))
                    .title(Component.translatable("creativetab.vsa_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.OBSIDIAN_SHARD.get());
                        pOutput.accept(ModItems.DIAMOND_INFUSED_SHARD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

}
