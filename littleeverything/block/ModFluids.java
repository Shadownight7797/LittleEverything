package com.grygoriiovsianikov.littleeverything.block;

import com.grygoriiovsianikov.littleeverything.LittleEverything;
import com.grygoriiovsianikov.littleeverything.item.ModItems;
import com.grygoriiovsianikov.littleeverything.util.RegistryHandler;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.block.material.Material;
import net.minecraft.fluid.FlowingFluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.fml.RegistryObject;

public class ModFluids
{
    // NORMAL:

    public static final ResourceLocation NMYSTIC_STILL_RL = new ResourceLocation(LittleEverything.MOD_ID,
            "block/nmystic_still");

    public static final ResourceLocation NMYSTIC_FLOWING_RL = new ResourceLocation(LittleEverything.MOD_ID,
            "block/nmystic_flowing");

    public static final ResourceLocation NMYSTIC_OVERLAY_RL = new ResourceLocation(LittleEverything.MOD_ID,
            "block/nmystic_overlay");

    // BOILING:

    public static final ResourceLocation BMYSTIC_STILL_RL = new ResourceLocation(LittleEverything.MOD_ID,
            "block/bmystic_still");

    public static final ResourceLocation BMYSTIC_FLOWING_RL = new ResourceLocation(LittleEverything.MOD_ID,
            "block/bmystic_flowing");

    public static final ResourceLocation BMYSTIC_OVERLAY_RL = new ResourceLocation(LittleEverything.MOD_ID,
            "block/bmystic_overlay");

    // NORMAL REGISTRY:

    public static final RegistryObject<FlowingFluid> NMYSTIC_FLUID
            = RegistryHandler.FLUIDS.register("nmystic_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.NMYSTIC_PROPERTIES));

    public static final RegistryObject<FlowingFluid> NMYSTIC_FLOWING
            = RegistryHandler.FLUIDS.register("nmystic_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.NMYSTIC_PROPERTIES));

    public static final ForgeFlowingFluid.Properties NMYSTIC_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> NMYSTIC_FLUID.get(), () -> NMYSTIC_FLOWING.get(), FluidAttributes.builder(NMYSTIC_STILL_RL, NMYSTIC_FLOWING_RL)
            .density(1).rarity(Rarity.RARE).sound(SoundEvents.ITEM_BUCKET_EMPTY).overlay(NMYSTIC_OVERLAY_RL)
            .viscosity(15)).slopeFindDistance(1).levelDecreasePerBlock(1).canMultiply()
            .block(() -> ModFluids.NMYSTIC_BLOCK.get()).bucket(() -> ModItems.NMYSTIC_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> NMYSTIC_BLOCK = RegistryHandler.BLOCKS.register("nmystic",
            () -> new FlowingFluidBlock(() -> ModFluids.NMYSTIC_FLUID.get(), AbstractBlock.Properties.create(Material.WATER)
                    .doesNotBlockMovement().hardnessAndResistance(100f).notSolid().noDrops()));

    // BOILING REGISTRY:

    public static final RegistryObject<FlowingFluid> BMYSTIC_FLUID
            = RegistryHandler.FLUIDS.register("bmystic_fluid",
            () -> new ForgeFlowingFluid.Source(ModFluids.BMYSTIC_PROPERTIES));

    public static final RegistryObject<FlowingFluid> BMYSTIC_FLOWING
            = RegistryHandler.FLUIDS.register("bmystic_flowing",
            () -> new ForgeFlowingFluid.Flowing(ModFluids.BMYSTIC_PROPERTIES));

    public static final ForgeFlowingFluid.Properties BMYSTIC_PROPERTIES = new ForgeFlowingFluid.Properties(
            () -> BMYSTIC_FLUID.get(), () -> BMYSTIC_FLOWING.get(), FluidAttributes.builder(BMYSTIC_STILL_RL, BMYSTIC_FLOWING_RL)
            .density(1).luminosity(100).rarity(Rarity.EPIC).sound(SoundEvents.ITEM_BUCKET_EMPTY).overlay(BMYSTIC_OVERLAY_RL)
            .viscosity(15).temperature(5).gaseous()).slopeFindDistance(1).levelDecreasePerBlock(1)
            .block(() -> ModFluids.BMYSTIC_BLOCK.get()).bucket(() -> ModItems.BMYSTIC_BUCKET.get());

    public static final RegistryObject<FlowingFluidBlock> BMYSTIC_BLOCK = RegistryHandler.BLOCKS.register("bmystic",
            () -> new FlowingFluidBlock(() -> ModFluids.BMYSTIC_FLUID.get(), AbstractBlock.Properties.create(Material.LAVA)
                    .doesNotBlockMovement().hardnessAndResistance(100f).notSolid().noDrops()));

    // REGISTER:

    public static void register() { }

}