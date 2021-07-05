package vzekii.moreloot.registry;

import net.fabricmc.fabric.api.loot.v1.event.LootTableLoadingCallback;

public class LootRegister {

    public static void register() {
        LootTableLoadingCallback.EVENT.register((resourceManager, lootManager, id, table, setter) -> {

        });
    }
}
