package net.dwy__.vsadditions.item;

import net.dwy__.vsadditions.VSAdditions;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, VSAdditions.MOD_ID);

    public static final RegistryObject<Item> OBSIDIAN_SHARD = ITEMS.register("obsidian_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_INFUSED_SHARD = ITEMS.register("diamond_infused_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GLOWSTONE_SHARD = ITEMS.register("glowstone_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DAGGER_HANDLE = ITEMS.register("dagger_handle",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
