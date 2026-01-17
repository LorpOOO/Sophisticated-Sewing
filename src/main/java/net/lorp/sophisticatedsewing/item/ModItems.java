package net.lorp.sophisticatedsewing.item;

import net.lorp.sophisticatedsewing.SophisticatedSewing;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.ItemLore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SophisticatedSewing.MOD_ID);

    public static final DeferredItem<Item> BOUND_LEATHER = ITEMS.register("bound_leather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DRIED_LEATHER = ITEMS.register("dried_leather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> TANNED_LEATHER = ITEMS.register("tanned_leather",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> SEWING_SPOOL = ITEMS.register("sewing_spool",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> NETHERITE_POCKET = ITEMS.register("netherite_pocket",
            () -> new Item(new Item.Properties()
                    .component(DataComponents.RARITY, Rarity.UNCOMMON)
                    .fireResistant()
            ));
    public static final DeferredItem<Item> DIAMOND_POCKET = ITEMS.register("diamond_pocket",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> GOLDEN_POCKET = ITEMS.register("golden_pocket",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> IRON_POCKET = ITEMS.register("iron_pocket",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> COPPER_POCKET = ITEMS.register("copper_pocket",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
