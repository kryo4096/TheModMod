package kryo4096.themodmod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class ArmorMaterialFlintassium implements ArmorMaterial {

    @Override
    public int getDurability(EquipmentSlot slot) {
        return 1000;
    }

    @Override
    public int getProtectionAmount(EquipmentSlot slot) {
        return 100;
    }

    @Override
    public int getEnchantability() {
        return 100;
    }

    @Override
    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_GENERIC;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(TheModMod.ITEM_FLINTASSIUM_INGOT);
    }

    @Override
    public String getName() {
        return "flintassium";
    }

    @Override
    public float getToughness() {
        return 10;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}
