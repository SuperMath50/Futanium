package fr.supermath.futanium.init;

import fr.supermath.futanium.objects.armour.ArmourBase;
import fr.supermath.futanium.objects.items.ItemBase;
import fr.supermath.futanium.objects.items.ItemFoods;
import fr.supermath.futanium.objects.items.fuel.ItemFuelIridium;
import fr.supermath.futanium.objects.items.seed.ItemEggplantSeed;
import fr.supermath.futanium.objects.items.seed.ItemRudiumSeed;
import fr.supermath.futanium.objects.tools.*;
import fr.supermath.futanium.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material
    //public static final ToolMaterial TOOL_MATERIAL = EnumHelper.addToolMaterial("tool_MATERIAL", harvestLevel, maxUses, EfficiencyF, DamageF, Enchantability);
    public static final ToolMaterial TOOL_FUTANIUM = EnumHelper.addToolMaterial("tool_futanium", 6, 1800, 9.0F, 5.5F, 61);
    public static final ToolMaterial TOOL_MULTIVER = EnumHelper.addToolMaterial("tool_multiver", 4, 1500, 10.0F, 7F, 100);

    //ARMOR
    //public static final ItemArmor.ArmorMaterial ARMOUR_MATERIAL = EnumHelper.addArmorMaterial("armour_MATERIAL", Reference.MODID + ":MATERIAL", DURABILITY, new int[]{BOOTS, LEGGINGS, CHESTPLATE, HELMET}, ENCHANTABILITY, SoundEvents.SOUND, TOUGHNESS F);
    public static final ItemArmor.ArmorMaterial ARMOUR_FUTANIUM = EnumHelper.addArmorMaterial("armour_futanium", Reference.MODID + ":futanium", 35, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
    public static final ItemArmor.ArmorMaterial ARMOUR_IRIDIUM = EnumHelper.addArmorMaterial("armour_iridium", Reference.MODID + ":iridium", 20, new int[]{3, 6, 8, 3}, 60, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2F);
    public static final ItemArmor.ArmorMaterial ARMOUR_GALLIUM = EnumHelper.addArmorMaterial("arour_gallium", Reference.MODID + ":gallium", 50, new int[]{4, 8, 9, 5}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static final ItemArmor.ArmorMaterial ARMOUR_OLONIUM = EnumHelper.addArmorMaterial("armour_olonium", Reference.MODID + ":olonium", 50, new int[]{3, 4, 5, 3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 5.0F);

    //Ingot
    //public static final Item NAME = new ItemBase("NAME");
    public static final Item FUTANIUM_INGOT = new ItemBase("futanium_ingot");
    public static final Item GALLIUM_INGOT = new ItemBase("gallium_ingot");
    public static final Item MULTIVER_INGOT = new ItemBase("multiver_ingot");
    public static final Item OLONIUM_INGOT = new ItemBase("olonium_ingot");
    public static final Item IRIDIUM_INGOT = new ItemFuelIridium("iridium_ingot");
    public static final Item RUDIUM = new ItemBase("rudium");
    public static final Item RUDIUM_ = new ItemBase("rudium_");

    //Armore
    //public static final Item NAME = new ArmourBase("NAME", ARMOUR_MATERIAL, 1, EntityEquipmentSlot.SLOT);
    public static final Item FUTANIUM_HELMET = new ArmourBase("futanium_helmet", ARMOUR_FUTANIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item FUTANIUM_CHESTPLATE = new ArmourBase("futanium_chestplate", ARMOUR_FUTANIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item FUTANIUM_LEGGINGS = new ArmourBase("futanium_leggings", ARMOUR_FUTANIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item FUTANIUM_BOOTS = new ArmourBase("futanium_boots", ARMOUR_FUTANIUM, 1, EntityEquipmentSlot.FEET);

    public static final Item GALLIUM_HELMET = new ArmourBase("gallium_helmet", ARMOUR_GALLIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item GALLIUM_CHESTPLATE = new ArmourBase("gallium_chestplate", ARMOUR_GALLIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item GALLIUM_LEGGINGS = new ArmourBase("gallium_leggings", ARMOUR_GALLIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item GALLIUM_BOOTS = new ArmourBase("gallium_boots", ARMOUR_GALLIUM, 1, EntityEquipmentSlot.FEET);

    public static final Item IRIDIUM_HELMET = new ArmourBase("iridium_helmet", ARMOUR_IRIDIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item IRIDIUM_CHESTPLATE = new ArmourBase("iridium_chestplate", ARMOUR_IRIDIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item IRIDIUM_LEGGINGS = new ArmourBase("iridium_leggings", ARMOUR_IRIDIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item IRIDIUM_BOOTS = new ArmourBase("iridium_boots", ARMOUR_IRIDIUM, 1, EntityEquipmentSlot.FEET);

    public static final Item OLONIUM_HELMET = new ArmourBase("olonium_helmet", ARMOUR_OLONIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item OLONIUM_CHESTPLATE = new ArmourBase("olonium_chestplate", ARMOUR_OLONIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item OLONIUM_LEGGINGS = new ArmourBase("olonium_leggings", ARMOUR_OLONIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item OLONIUM_BOOTS = new ArmourBase("olonium_boots", ARMOUR_OLONIUM, 1, EntityEquipmentSlot.FEET);

    //Tools
    //public static final Item NAME = new ToolAxe("NAME", TOOLS_MATERIAL);
    public static final Item FUTANIUM_AXE = new ToolAxe("futanium_axe", TOOL_FUTANIUM);
    public static final Item FUTANIUM_PICKAXE = new ToolPickaxe("futanium_pickaxe", TOOL_FUTANIUM);
    public static final Item FUTANIUM_HOE = new ToolHoe("futanium_hoe", TOOL_FUTANIUM);
    public static final Item FUTANIUM_SHOVEL = new ToolShovel("futanium_shovel", TOOL_FUTANIUM);
    public static final Item FUTANIUM_SWORD = new ToolSword("futanium_sword", TOOL_FUTANIUM);

    public static final Item MULTIVER_AXE = new ToolAxe("multiver_axe", TOOL_MULTIVER);
    public static final Item MULTIVER_PICKAXE = new ToolPickaxe("multiver_pickaxe", TOOL_MULTIVER);
    public static final Item MULTIVER_HOE = new ToolHoe("multiver_hoe", TOOL_MULTIVER);
    public static final Item MULTIVER_SHOVEL = new ToolShovel("multiver_shovel", TOOL_MULTIVER);
    public static final Item MULTIVER_SWORD = new ToolSword("multiver_sword", TOOL_MULTIVER);

    //FOODS
    //public static final Item NAME = new ItemFoods("NAME", FOOD AMOUNT, WOLF FOOD (true ore false);
    public static final Item EGGPLANT = new ItemFoods("eggplant", 3, false);

    //Seed
    public static final Item EGGPLANT_SEED = new ItemEggplantSeed("eggplant_seed");
    public static final Item RUDIUM_SEED = new ItemRudiumSeed("rudium_seed");

}
