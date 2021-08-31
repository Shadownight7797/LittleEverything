package com.grygoriiovsianikov.littleeverything.block;

import com.grygoriiovsianikov.littleeverything.LittleEverything;
import com.grygoriiovsianikov.littleeverything.util.RegistryHandler;
import javafx.scene.effect.Light;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> MYSTIC_BLOCK = register("mystic_block",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(3f, 10f)
                    .sound(SoundType.NETHERITE)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> MYSTIC_ORE = register("mystic_ore",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(3f, 10f)
                    .sound(SoundType.STONE)
                    .harvestLevel(2)
                    .harvestTool(ToolType.PICKAXE)));

    public static final RegistryObject<Block> STONE_GHOST_BLOCK = register("stone_ghost_block",
            () -> new Block(AbstractBlock.Properties.create(Material.ROCK)
                    .hardnessAndResistance(1.5f, 6f)
                    .sound(SoundType.STONE)
                    .harvestLevel(1)
                    .harvestTool(ToolType.PICKAXE)
                    .doesNotBlockMovement()));

    public static final RegistryObject<Block> MYSTIC_STAIRS = register("mystic_stairs",
            () -> new StairsBlock(() -> ModBlocks.MYSTIC_BLOCK.get().getDefaultState(),
                    AbstractBlock.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(3f, 10f)));

    public static final RegistryObject<Block> MYSTIC_FENCE = register("mystic_fence",
            () -> new FenceBlock(AbstractBlock.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(3f, 10f)));

    public static final RegistryObject<Block> MYSTIC_FENCE_GATE = register("mystic_fence_gate",
            () -> new FenceGateBlock(AbstractBlock.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(3f, 10f)));

    public static final RegistryObject<Block> MYSTIC_PRESSURE_PLATE = register("mystic_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, AbstractBlock.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(3f, 10f)));

    public static final RegistryObject<Block> MYSTIC_SLAB = register("mystic_slab",
            () -> new SlabBlock(AbstractBlock.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(3f, 10f)));

    public static final RegistryObject<Block> MYSTIC_BUTTON = register("mystic_button",
            () -> new StoneButtonBlock(AbstractBlock.Properties.create(Material.IRON)
                            .sound(SoundType.METAL)
                            .harvestLevel(3)
                            .harvestTool(ToolType.PICKAXE)
                            .hardnessAndResistance(3f, 10f)));

    public static final RegistryObject<Block> MYSTICAL_CROP =
            RegistryHandler.BLOCKS.register("mystical_crop",
                    () -> new MysticCrop(AbstractBlock.Properties.from(Blocks.WHEAT)));

    public static void register() {}

    private static <T extends Block>RegistryObject<T> register (String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = RegistryHandler.BLOCKS.register(name, block);
        RegistryHandler.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(LittleEverything.MYSTIC_TAB)));
        return toReturn;
    }
}
