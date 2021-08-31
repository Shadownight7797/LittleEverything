package com.grygoriiovsianikov.littleeverything.item;

import com.grygoriiovsianikov.littleeverything.LittleEverything;
import com.grygoriiovsianikov.littleeverything.util.Config;
import com.grygoriiovsianikov.littleeverything.util.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Effect;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class MysticalBeef extends Item
{
    public MysticalBeef()
    {
        super(new Properties().group(LittleEverything.MYSTIC_TAB)
                .food(new Food.Builder()
                        .hunger(20)
                        .saturation(10)
                        .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH, 10, 5),1.0f)
                        .effect(() -> new EffectInstance(Effects.LUCK, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 5),1.0f)
                        .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 0),1.0f)
                        .effect(() -> new EffectInstance(Effects.HASTE, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 3),1.0f)
                        .effect(() -> new EffectInstance(Effects.REGENERATION, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 3),1.0f)
                        .effect(() -> new EffectInstance(Effects.STRENGTH, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 3),1.0f)
                        .effect(() -> new EffectInstance(Effects.WATER_BREATHING, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 0),1.0f)
                        .effect(() -> new EffectInstance(Effects.DOLPHINS_GRACE, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 3),1.0f)
                        .effect(() -> new EffectInstance(Effects.NIGHT_VISION, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 0),1.0f)
                        .effect(() -> new EffectInstance(Effects.ABSORPTION, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 6),1.0f)
                        .effect(() -> new EffectInstance(Effects.RESISTANCE, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 2),1.0f)
                        .effect(() -> new EffectInstance(Effects.SATURATION, Config.MYSTICAL_BEEF_POTION_DURATION.get(), 3),1.0f)
                        .meat()
                        .setAlwaysEdible()
                        .build()));
    }

    public boolean hasEffect(ItemStack stack)
    {
        return true;
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag)
    {
        if(KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("Even better than a totem, except you have to eat it. P.S. This will let you fall exactly " + "\u00A7e" +"123.1" + "\u00A7f" + " blocks high and survive on half a heart without any armor."));
        }
        else{
            tooltip.add(new StringTextComponent("Hold " + "\u00A7e" + "SHIFT" + "\u00A77" + " for Information."));
        }

        super.addInformation(stack, world, tooltip, flag);
    }

    @Override
    public int getBurnTime(ItemStack itemStack)
    {
        return 25600;
    }
}
