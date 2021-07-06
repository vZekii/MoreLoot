package vzekii.moreloot;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vzekii.moreloot.registry.ItemRegister;
import vzekii.moreloot.registry.LootRegister;

public class MoreLoot implements ModInitializer {
    public static final String MOD_ID = "moreloot";
    public static final Logger LOGGER = LogManager.getLogger();

    //creative tab
    public static final ItemGroup MORELOOT_GROUP = FabricItemGroupBuilder.build(
            new Identifier("moreloot", "moreloot_group"),
            () -> new ItemStack(Blocks.ZOMBIE_HEAD));

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
