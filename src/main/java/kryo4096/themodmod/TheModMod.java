package kryo4096.themodmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.HashSet;
import java.util.Set;


public class TheModMod implements ModInitializer {

    public static final ArmorMaterial ARMOR_MATERIAL_FLINTASSIUM = new ArmorMaterialFlintassium();

    public static final Item ITEM_AMOGIUM = new ItemBase(new FabricItemSettings().group(ItemGroup.MATERIALS), true);
    public static final Item ITEM_FLINTASSIUM_INGOT = new ItemBase(new FabricItemSettings().group(ItemGroup.MATERIALS), false);

    public static final Item ITEM_FLINTASSIUM_HELMET = new ArmorItem(ARMOR_MATERIAL_FLINTASSIUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ItemGroup.MATERIALS));
    public static final Item ITEM_FLINTASSIUM_CHESTPLATE = new ItemFlintassiumArmor(ARMOR_MATERIAL_FLINTASSIUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item ITEM_FLINTASSIUM_LEGGINGS = new ArmorItem(ARMOR_MATERIAL_FLINTASSIUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ItemGroup.COMBAT));
    public static final Item ITEM_FLINTASSIUM_BOOTS = new ArmorItem(ARMOR_MATERIAL_FLINTASSIUM, EquipmentSlot.FEET, new FabricItemSettings().group(ItemGroup.COMBAT));

    public static final Item ITEM_FLINTASSIUM_CHUNK = new ItemBase(new FabricItemSettings().group(ItemGroup.MATERIALS), true);

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("themodmod", "flintassium_ingot"), ITEM_FLINTASSIUM_INGOT);
        Registry.register(Registry.ITEM, new Identifier("themodmod", "amogium"), ITEM_AMOGIUM);
        Registry.register(Registry.ITEM, new Identifier("themodmod", "flintassium_chunk"), ITEM_FLINTASSIUM_CHUNK);

        Registry.register(Registry.ITEM, new Identifier("themodmod", "flintassium_helmet"), ITEM_FLINTASSIUM_HELMET);
        Registry.register(Registry.ITEM, new Identifier("themodmod", "flintassium_chestplate"), ITEM_FLINTASSIUM_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier("themodmod", "flintassium_leggings"), ITEM_FLINTASSIUM_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier("themodmod", "flintassium_boots"), ITEM_FLINTASSIUM_BOOTS);
    }
}
