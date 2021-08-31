package com.grygoriiovsianikov.littleeverything.item;

import com.grygoriiovsianikov.littleeverything.LittleEverything;
import com.grygoriiovsianikov.littleeverything.util.KeyboardHelper;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.world.World;

import java.util.List;

public class MysticalRoot extends Item
{
    public MysticalRoot()
    {
        super(new Properties().group(LittleEverything.MYSTIC_TAB)
                .food(new Food.Builder()
                        .hunger(1)
                        .saturation(1)
                        .build()));
    }

    @Override
    public void addInformation(ItemStack stack, World world, List<ITextComponent> tooltip,
                               ITooltipFlag flag)
    {
        if(KeyboardHelper.isHoldingShift())
        {
            tooltip.add(new StringTextComponent("\u00A77" + "No one knows what it does. Maybe it's not used for just eating."));
        }
        else{
            tooltip.add(new StringTextComponent("Hold " + "\u00A7e" + "SHIFT" + "\u00A77" + " for Information."));
        }

        super.addInformation(stack, world, tooltip, flag);
    }
}
