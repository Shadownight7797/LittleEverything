package com.grygoriiovsianikov.littleeverything.events;

import com.grygoriiovsianikov.littleeverything.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.Hand;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.LogManager;

import java.util.Collection;

public class ModEvents {

    @SubscribeEvent
    public void onSlowndownEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_SLOW.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onSpedupEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_SPEED.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.SPEED, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onHastedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_HASTE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.HASTE, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onFatiguedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_FATIGUE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.MINING_FATIGUE, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onStrongEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_STRENGTH.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.STRENGTH, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onHealthEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_HEALTH.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.INSTANT_HEALTH, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onJumpyEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_JUMP.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.JUMP_BOOST, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onNauseaEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_NAUSEA.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.NAUSEA, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onRegeneratingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_REGENERATION.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.REGENERATION, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onResistingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_RESISTANCE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.RESISTANCE, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onFireyEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_FIRE.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, 6000, 0));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onWaterBreathingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_WATER.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.WATER_BREATHING, 6000, 0));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onInvisibleEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_INVIS.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.INVISIBILITY, 6000, 0));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onBlindEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_BLIND.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.BLINDNESS, 6000, 0));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onNightyEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_NIGHT.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, 6000, 0));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onHungryEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_HUNGER.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.HUNGER, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onWeakEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_WEAK.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.WEAKNESS, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onPoisonedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_POISON.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.POISON, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onWitheringEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_WITHER.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.WITHER, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onHBoostedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_HBOOST.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onAbsorbingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_ABSORPTION.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.ABSORPTION, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onSaturatingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_SATURATION.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.SATURATION, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onGlowingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_GLOWING.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.GLOWING, 6000, 0));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onLevitatingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_LEVITATION.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.LEVITATION, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onUnluckyEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_BADLUCK.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.UNLUCK, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onLuckyEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_LUCK.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    LivingEntity player = event.getEntityLiving();

                    target.addPotionEffect(new EffectInstance(Effects.LUCK, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onSlowFallingEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_SFALLING.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.SLOW_FALLING, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onConduitedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_CONDUIT.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.CONDUIT_POWER, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onGracedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_DOLPHIN.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.DOLPHINS_GRACE, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onBadOmenedEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_OMEN.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.BAD_OMEN, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onHeroEntity(AttackEntityEvent event) {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.MYSTIC_WAND_HERO.get()) {
            if (event.getTarget().isAlive()) {
                LivingEntity target = (LivingEntity) event.getTarget();
                if (target instanceof LivingEntity) {
                    PlayerEntity player = event.getPlayer();

                    target.addPotionEffect(new EffectInstance(Effects.HERO_OF_THE_VILLAGE, 6000, 1));

                    if (!player.world.isRemote()) {
                        String msg = TextFormatting.LIGHT_PURPLE + "*zap!*";
                        player.sendMessage(new StringTextComponent(msg), player.getUniqueID());
                    }
                }
            }
        }
    }

    @SubscribeEvent
    public void onLuckyEntityDrops(LivingDropsEvent event) {
        LivingEntity entity = event.getEntityLiving();

        if (entity instanceof LivingEntity) {
            World world = entity.getEntityWorld();
            Collection<ItemEntity> drops = event.getDrops();

            LogManager.getLogger().debug(entity.getActivePotionEffects());

            if (entity.isPotionActive(Effects.LUCK)) {
                drops.add(new ItemEntity(world, entity.getPosX(), entity.getPosY(), entity.getPosZ(),
                        new ItemStack(ModItems.MYSTIC_INGOT.get())));
            }
        }
    }
}