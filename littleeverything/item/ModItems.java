package com.grygoriiovsianikov.littleeverything.item;

import com.grygoriiovsianikov.littleeverything.LittleEverything;
import com.grygoriiovsianikov.littleeverything.block.ModBlocks;
import com.grygoriiovsianikov.littleeverything.block.ModFluids;
import com.grygoriiovsianikov.littleeverything.util.RegistryHandler;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class  ModItems
{
    public static final RegistryObject<Item> MYSTIC_INGOT =
            RegistryHandler.ITEMS.register("mystic_ingot",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_NUGGET =
            RegistryHandler.ITEMS.register("mystic_nugget",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND =
            RegistryHandler.ITEMS.register("mystic_wand",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_SPEED =
            RegistryHandler.ITEMS.register("mystic_wand_speed",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_SLOW =
            RegistryHandler.ITEMS.register("mystic_wand_slow",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_HASTE =
            RegistryHandler.ITEMS.register("mystic_wand_haste",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_FATIGUE =
            RegistryHandler.ITEMS.register("mystic_wand_fatigue",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_STRENGTH =
            RegistryHandler.ITEMS.register("mystic_wand_strength",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_HEALTH =
            RegistryHandler.ITEMS.register("mystic_wand_health",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_JUMP =
            RegistryHandler.ITEMS.register("mystic_wand_jump",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_NAUSEA =
            RegistryHandler.ITEMS.register("mystic_wand_nausea",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_REGENERATION =
            RegistryHandler.ITEMS.register("mystic_wand_regeneration",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_RESISTANCE =
            RegistryHandler.ITEMS.register("mystic_wand_resistance",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_FIRE =
            RegistryHandler.ITEMS.register("mystic_wand_fire",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_WATER =
            RegistryHandler.ITEMS.register("mystic_wand_water",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_INVIS =
            RegistryHandler.ITEMS.register("mystic_wand_invis",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_BLIND =
            RegistryHandler.ITEMS.register("mystic_wand_blind",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_NIGHT =
            RegistryHandler.ITEMS.register("mystic_wand_night",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_HUNGER =
            RegistryHandler.ITEMS.register("mystic_wand_hunger",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_WEAK=
            RegistryHandler.ITEMS.register("mystic_wand_weak",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_POISON =
            RegistryHandler.ITEMS.register("mystic_wand_poison",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_WITHER =
            RegistryHandler.ITEMS.register("mystic_wand_wither",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_HBOOST =
            RegistryHandler.ITEMS.register("mystic_wand_hboost",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_ABSORPTION =
            RegistryHandler.ITEMS.register("mystic_wand_absorption",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_SATURATION =
            RegistryHandler.ITEMS.register("mystic_wand_saturation",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_GLOWING =
            RegistryHandler.ITEMS.register("mystic_wand_glowing",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_LEVITATION =
            RegistryHandler.ITEMS.register("mystic_wand_levitation",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_LUCK =
            RegistryHandler.ITEMS.register("mystic_wand_luck",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_BADLUCK =
            RegistryHandler.ITEMS.register("mystic_wand_badluck",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_SFALLING =
            RegistryHandler.ITEMS.register("mystic_wand_sfalling",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_CONDUIT =
            RegistryHandler.ITEMS.register("mystic_wand_conduit",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_DOLPHIN =
            RegistryHandler.ITEMS.register("mystic_wand_dolphin",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_OMEN =
            RegistryHandler.ITEMS.register("mystic_wand_omen",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_WAND_HERO =
            RegistryHandler.ITEMS.register("mystic_wand_hero",
                    () -> new Item(new Item.Properties()
                            .isImmuneToFire()
                            .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTICAL_BEEF =
            RegistryHandler.ITEMS.register("mystical_beef",
                    () -> new MysticalBeef());

    public static final RegistryObject<Item> MYSTIC_SHOVEL =
            RegistryHandler.ITEMS.register("mystic_shovel",
                    () -> new ShovelItem(MysticItemTier.MYSTIC, 5f, 0f,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .defaultMaxDamage(1791)
                                    .addToolType(ToolType.SHOVEL, 3)
                                    .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_SWORD =
            RegistryHandler.ITEMS.register("mystic_sword",
                    () -> new SwordItem(MysticItemTier.MYSTIC, 7, 0f,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .defaultMaxDamage(1791)
                                    .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_PICKAXE =
            RegistryHandler.ITEMS.register("mystic_pickaxe",
                    () -> new PickaxeItem(MysticItemTier.MYSTIC, 4, 0f,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .defaultMaxDamage(1791)
                                    .addToolType(ToolType.PICKAXE, 4)
                                    .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_HOE =
            RegistryHandler.ITEMS.register("mystic_hoe",
                    () -> new HoeItem(MysticItemTier.MYSTIC, 0, 0f,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .defaultMaxDamage(1791)
                                    .addToolType(ToolType.HOE, 3)
                                    .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_AXE =
            RegistryHandler.ITEMS.register("mystic_axe",
                    () -> new AxeItem(MysticItemTier.MYSTIC, 8.5f, 0f,
                            new Item.Properties()
                                    .isImmuneToFire()
                                    .defaultMaxDamage(1791)
                                    .addToolType(ToolType.AXE, 3)
                                    .group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_HELMET =
            RegistryHandler.ITEMS.register("mystic_helmet",
                    () -> new ArmorItem(ModArmorMaterial.MYSTIC, EquipmentSlotType.HEAD,
                            new Item.Properties().group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_CHESTPLATE =
            RegistryHandler.ITEMS.register("mystic_chestplate",
                    () -> new ArmorItem(ModArmorMaterial.MYSTIC, EquipmentSlotType.CHEST,
                            new Item.Properties().group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_LEGGINGS =
            RegistryHandler.ITEMS.register("mystic_leggings",
                    () -> new ArmorItem(ModArmorMaterial.MYSTIC, EquipmentSlotType.LEGS,
                            new Item.Properties().group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTIC_BOOTS =
            RegistryHandler.ITEMS.register("mystic_boots",
                    () -> new ArmorItem(ModArmorMaterial.MYSTIC, EquipmentSlotType.FEET,
                            new Item.Properties().group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTICAL_SEEDS =
            RegistryHandler.ITEMS.register("mystical_seeds",
                    () -> new BlockItem(ModBlocks.MYSTICAL_CROP.get(), new Item.Properties().group(LittleEverything.MYSTIC_TAB)));

    public static final RegistryObject<Item> MYSTICAL_ROOT =
            RegistryHandler.ITEMS.register("mystical_root",
                    () -> new MysticalRoot());

    public static final RegistryObject<Item> NMYSTIC_BUCKET =
            RegistryHandler.ITEMS.register("nmystic_bucket",
                    () -> new BucketItem(ModFluids.NMYSTIC_FLUID::get,
                            new Item.Properties().group(LittleEverything.MYSTIC_TAB).maxStackSize(1)));

    public static final RegistryObject<Item> BMYSTIC_BUCKET =
            RegistryHandler.ITEMS.register("bmystic_bucket",
                    () -> new BucketItem(ModFluids.BMYSTIC_FLUID::get,
                            new Item.Properties().group(LittleEverything.MYSTIC_TAB).maxStackSize(1).isImmuneToFire()));

    public static void register() {}

    public enum ModArmorMaterial implements IArmorMaterial
    {
        MYSTIC(new int[] { 455, 525, 560, 385 }, new int[] { 3, 6, 8, 3 }, 125, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
                Ingredient.fromStacks(new ItemStack(ModItems.MYSTIC_INGOT.get())), LittleEverything.MOD_ID + ":mystic",
                2, 0.05f);

        private final int[] durability;
        private final int[] damageReductionAmountArray;
        private final int enchantability;
        private final SoundEvent soundEvent;
        private final Ingredient repairMaterial;
        private final String name;
        private final float toughness;
        private final float knockbackResistance;

        ModArmorMaterial(int[] durability, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, Ingredient repairMaterial, String name, float toughness, float knockbackResistance) {
            this.durability = durability;
            this.damageReductionAmountArray = damageReductionAmountArray;
            this.enchantability = enchantability;
            this.soundEvent = soundEvent;
            this.repairMaterial = repairMaterial;
            this.name = name;
            this.toughness = toughness;
            this.knockbackResistance = knockbackResistance;
        }

        @Override
        public int getDurability(EquipmentSlotType equipmentSlotType) {
            return durability[equipmentSlotType.getIndex()];
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType equipmentSlotType)
        {
            return damageReductionAmountArray[equipmentSlotType.getIndex()];
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return soundEvent;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public float getToughness() {
            return toughness;
        }

        @Override
        public float getKnockbackResistance() {
            return knockbackResistance;
        }
    }

    public enum MysticItemTier implements IItemTier
    {
        MYSTIC(4, 1791, 10f, 0, 256,
                Ingredient.fromStacks(new ItemStack(ModItems.MYSTIC_INGOT.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

        MysticItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
            this.harvestLevel = harvestLevel;
            this.maxUses = maxUses;
            this.efficiency = efficiency;
            this.attackDamage = attackDamage;
            this.enchantability = enchantability;
            this.repairMaterial = repairMaterial;
        }

        @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }

    }
}