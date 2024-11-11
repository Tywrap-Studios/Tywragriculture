package net.tywrapstudios.agriculture.registry;

import com.tterrag.registrate.Registrate;
import com.tterrag.registrate.util.entry.RegistryEntry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Blocks;
import net.tywrapstudios.agriculture.content.block.crops.*;
import net.tywrapstudios.agriculture.content.block.kitchen.*;
import net.tywrapstudios.agriculture.util.logging.LoggingHandlers;

public class BlockRegistry {

    public static RegistryEntry<BlackCarrotCrop> BLACK_CARROT;
    public static RegistryEntry<PurpleCarrotCrop> PURPLE_CARROT;
    public static RegistryEntry<GoldCarrotCrop> GOLD_CARROT;
    public static RegistryEntry<TomatoShrub> TOMATO_PLANT;
    public static RegistryEntry<SweetPotatoCrop> SWEET_POTATO;
    public static RegistryEntry<StrawberryBush> STRAWBERRY_BUSH;
    public static RegistryEntry<PeaCrop> PEA_CROP;
    // TODO:
    public static RegistryEntry<CrateBlock> CRATE;
    public static RegistryEntry<OvenBlock> OVEN;
    public static RegistryEntry<SinkBlock> SINK;

    public static void registerModBlocks(Registrate REGISTRATE) {
        BLACK_CARROT = REGISTRATE.block("black_carrot_crop", p -> new BlackCarrotCrop(FabricBlockSettings
                        .copyOf(Blocks.CARROTS)))
                .register();
        PURPLE_CARROT = REGISTRATE.block("purple_carrot_crop", p -> new PurpleCarrotCrop(FabricBlockSettings
                        .copyOf(Blocks.CARROTS)))
                .register();
        GOLD_CARROT = REGISTRATE.block("gold_carrot_crop", p -> new GoldCarrotCrop(FabricBlockSettings
                        .copyOf(Blocks.CARROTS)))
                .register();
        SWEET_POTATO = REGISTRATE.block("sweet_potato_crop", p -> new SweetPotatoCrop(FabricBlockSettings
                        .copyOf(Blocks.POTATOES)))
                .register();
        STRAWBERRY_BUSH = REGISTRATE.block("strawberry_bush", p -> new StrawberryBush(FabricBlockSettings
                        .copyOf(Blocks.SWEET_BERRY_BUSH)))
                .register();
        PEA_CROP = REGISTRATE.block("pea_crop", p -> new PeaCrop(FabricBlockSettings
                        .copyOf(Blocks.WHEAT)))
                .register();

        registerFDInspiredBlocks(REGISTRATE);
        LoggingHandlers.debug("Blocks have been registered.");
    }

    public static void registerFDInspiredBlocks(Registrate REGISTRATE) {
        TOMATO_PLANT = REGISTRATE.block("tomato_shrub", p -> new TomatoShrub(FabricBlockSettings
                .copyOf(Blocks.SWEET_BERRY_BUSH)))
                .register();
    }
}