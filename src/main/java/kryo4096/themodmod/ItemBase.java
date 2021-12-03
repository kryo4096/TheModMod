package kryo4096.themodmod;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Formatting;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.List;

public class ItemBase extends Item {

    private boolean hasTooltip;

    public ItemBase(Settings settings) {
        super(settings);
    }

    public ItemBase(Settings settings, boolean hasTooltip) {
        super(settings);

        this.hasTooltip = hasTooltip;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (hasTooltip)
            tooltip.add(new TranslatableText("item."+Registry.ITEM.getId(this).toString().replace(':', '.')+".tooltip").formatted(Formatting.AQUA));
    }
}
