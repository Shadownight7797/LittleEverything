package com.grygoriiovsianikov.littleeverything.util;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.io.File;

public class Config
{
    public static ForgeConfigSpec SERVER_CONFIG;
    public static ForgeConfigSpec CLIENT_CONFIG;

    public static ForgeConfigSpec.IntValue MYSTICAL_BEEF_POTION_DURATION;

    static
    {
        ForgeConfigSpec.Builder SERVER_BUILDER = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder CLIENT_BUILDER = new ForgeConfigSpec.Builder();

        setMysticalBeefPotionDuration(SERVER_BUILDER, CLIENT_BUILDER);

        SERVER_CONFIG = SERVER_BUILDER.build();
        CLIENT_CONFIG = CLIENT_BUILDER.build();
    }

    private static  void setMysticalBeefPotionDuration(ForgeConfigSpec.Builder SERVER_BUILDER,
                                                       ForgeConfigSpec.Builder CLIENT_BUILDER)
    {
        MYSTICAL_BEEF_POTION_DURATION = CLIENT_BUILDER.comment("How long the potion effects last on the Mystical Beef (in ticks)")
                .defineInRange("mystic_duration", 6000, 1000, Integer.MAX_VALUE);
    }

    public static void loadConfigFile(ForgeConfigSpec config, String path)
    {
        final CommentedFileConfig file = CommentedFileConfig.builder(new File(path))
                .sync().autosave().writingMode(WritingMode.REPLACE).build();

        file.load();
        config.setConfig(file);
    }
}
