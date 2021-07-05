package vzekii.moreloot;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MoreLoot implements ModInitializer {
    public static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onInitialize() {
        LOGGER.info("Initialising MoreLoot");

        LOGGER.info("Finished initialising MoreLoot");

    }
}
