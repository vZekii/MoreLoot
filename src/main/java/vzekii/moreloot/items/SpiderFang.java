package vzekii.moreloot.items;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class SpiderFang extends Item {
    public SpiderFang(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        // default white text
        tooltip.add( new TranslatableText("item.moreloot.spider_fang.tooltip") );

        // formatted red text
        tooltip.add(new LiteralText("More Loot").formatted(Formatting.RED));
    }
}
