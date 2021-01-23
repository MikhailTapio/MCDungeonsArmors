package chronosacaria.mcda.enchants;

import chronosacaria.mcda.enchants.enchantments.BurningEnchantment;
import chronosacaria.mcda.enchants.enchantments.GoatsLeapEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public class EnchantsRegistry {
    public static Enchantment BURNING;
    public static Enchantment GOATS_LEAP;

    public static void init(){
        BURNING = new BurningEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR, new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET});
        GOATS_LEAP = new GoatsLeapEnchantment(Enchantment.Rarity.VERY_RARE, EnchantmentTarget.ARMOR_FEET, new EquipmentSlot[]{EquipmentSlot.FEET});
    }
}
