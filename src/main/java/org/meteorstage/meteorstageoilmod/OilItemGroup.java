package org.meteorstage.meteorstageoilmod;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class OilItemGroup {
    public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
            new Identifier(MeteorStageOilMod.MOD_ID, "item_group"),
            () -> new ItemStack(MeteorStageOilMod.OIL)
    );
}
