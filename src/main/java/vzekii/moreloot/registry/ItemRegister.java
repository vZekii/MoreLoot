package vzekii.moreloot.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import vzekii.moreloot.MoreLoot;
import vzekii.moreloot.items.PoisonGland;
import vzekii.moreloot.items.SpiderFang;

public class ItemRegister {
    public static final Item SPIDER_FANG = new SpiderFang(new FabricItemSettings().group(MoreLoot.MORELOOT_GROUP).rarity(Rarity.RARE));
    public static final Item POISON_GLAND = new PoisonGland(new FabricItemSettings().group(MoreLoot.MORELOOT_GROUP).rarity(Rarity.RARE));

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(MoreLoot.MOD_ID, "spider_fang"), SPIDER_FANG);
        Registry.register(Registry.ITEM, new Identifier(MoreLoot.MOD_ID, "poison_gland"), POISON_GLAND);

    }
}
