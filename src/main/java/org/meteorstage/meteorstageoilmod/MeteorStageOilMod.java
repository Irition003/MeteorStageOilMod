package org.meteorstage.meteorstageoilmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class MeteorStageOilMod implements ModInitializer {

    public static final String MOD_ID = "meteorstageoilmod";

    public static final Item OIL = new Item(new FabricItemSettings().group(OilItemGroup.ITEM_GROUP));

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "oil"), OIL);
    }
}
