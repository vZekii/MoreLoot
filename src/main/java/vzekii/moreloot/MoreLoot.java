package vzekii.moreloot;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vzekii.moreloot.registry.ItemRegister;
import vzekii.moreloot.registry.LootRegister;

public class MoreLoot implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Initialising MoreLoot");

        LOGGER.info("Registering Items");
        ItemRegister.register();
        LOGGER.info("Registering Loot Tables");
        LootRegister.register();

        LOGGER.info("Finished initialising MoreLoot");

    }
}
