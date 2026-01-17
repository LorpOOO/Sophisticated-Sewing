package net.lorp.sophisticatedsewing.item;

import net.lorp.sophisticatedsewing.SophisticatedSewing;
import net.lorp.sophisticatedsewing.block.ModBlocks;
import net.lorp.sophisticatedsewing.SophisticatedSewing;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SophisticatedSewing.MOD_ID);

    public static final Supplier<CreativeModeTab> SOPHISTICATEDSEWING_TAB = CREATIVE_MODE_TAB.register("sophisticatedsewing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TANNED_LEATHER.get()))
                    .title(Component.translatable("creativetab.sophisticatedsewing.sophisticatedsewing_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.BOUND_LEATHER.get());
                        output.accept(ModItems.DRIED_LEATHER.get());
                        output.accept(ModItems.TANNED_LEATHER.get());
                        output.accept(ModItems.SEWING_SPOOL.get());
                        output.accept(ModItems.COPPER_POCKET.get());
                        output.accept(ModItems.IRON_POCKET.get());
                        output.accept(ModItems.GOLDEN_POCKET.get());
                        output.accept(ModItems.DIAMOND_POCKET.get());
                        output.accept(ModItems.NETHERITE_POCKET.get());
                        output.accept(ModBlocks.SEWING_TABLE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}