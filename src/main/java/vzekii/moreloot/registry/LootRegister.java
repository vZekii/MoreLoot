package vzekii.moreloot.registry;

import net.fabricmc.fabric.api.loot.v1.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootRegister {

    public static final Identifier SPIDER_LOOT_TABLE_ID = EntityType.SPIDER.getLootTableId();
    public static final Identifier CAVE_SPIDER_LOOT_TABLE_ID = EntityType.CAVE_SPIDER.getLootTableId();

    public static void register() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {
            if (SPIDER_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ItemRegister.SPIDER_FANG));

                table.pool(poolBuilder);
            }

            if (CAVE_SPIDER_LOOT_TABLE_ID.equals(id)) {
                FabricLootPoolBuilder poolBuilder = FabricLootPoolBuilder.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ItemRegister.POISON_GLAND));

                table.pool(poolBuilder);
            }
        });
    }
}
