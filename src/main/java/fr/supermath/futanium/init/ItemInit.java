package fr.supermath.futanium.init;

import fr.supermath.futanium.objects.armour.ArmourBase;
import fr.supermath.futanium.objects.items.ItemBase;
import fr.supermath.futanium.objects.items.ItemBaseDescription;
import fr.supermath.futanium.objects.tools.*;
import fr.supermath.futanium.util.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraft.item.Item.ToolMaterial;

import java.util.ArrayList;
import java.util.List;

public class ItemInit
{

    public static final List<Item> ITEMS = new ArrayList<Item>();

    //Material
    public static final ToolMaterial TOOL_FUTANIUM = EnumHelper.addToolMaterial("tool_futanium", 4, 1800, 8.0F, 5.5F, 61);
    public static final ItemArmor.ArmorMaterial ARMOUR_FUTANIUM = EnumHelper.addArmorMaterial("armour_futanium", Reference.MODID + ":futanium", 35, new int[]{4, 7, 9, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
    public static final ItemArmor.ArmorMaterial ARMOUR_IRIDIUM = EnumHelper.addArmorMaterial("armour_iridium", Reference.MODID + ":iridium", 20, new int[]{3, 6, 8, 3}, 60, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.2F);
    public static final ItemArmor.ArmorMaterial ARMOUR_GALLIUM = EnumHelper.addArmorMaterial("arour_gallium", Reference.MODID + ":gallium", 50, new int[]{5, 8, 9, 4}, 30, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
    public static final ItemArmor.ArmorMaterial ARMOUR_OLOMIUM = EnumHelper.addArmorMaterial("armour_olomium", Reference.MODID + ":olomium", 50, new int[]{5, 9, 0, 0}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 1.0F);

    //Ingot
    public static final Item FUTANIUM_INGOT = new ItemBase("futanium_ingot");
    public static final Item GALLIUM_INGOT = new ItemBase("gallium_ingot");
    public static final Item MULTIVER_INGOT = new ItemBase("multiver_ingot");
    public static final Item OLONIUM_INGOT = new ItemBase("olonium_ingot");
    public static final Item IRIDIUM_INGOT = new ItemBase("iridium_ingot");

    //Armore
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

    public static final Item OLOMIUM_HELMET = new ArmourBase("olonium_helmet", ARMOUR_OLOMIUM, 1, EntityEquipmentSlot.HEAD);
    public static final Item OLOMIUM_CHESTPLATE = new ArmourBase("olonium_chestplate", ARMOUR_OLOMIUM, 1, EntityEquipmentSlot.CHEST);
    public static final Item OLOMIUM_LEGGINGS = new ArmourBase("olonium-leggings", ARMOUR_OLOMIUM, 2, EntityEquipmentSlot.LEGS);
    public static final Item OLOMIUM_BOOTS = new ArmourBase("olonium_boots", );

    //Tools
    public static final Item FUTANIUM_AXE = new ToolAxe("futanium_axe", TOOL_FUTANIUM);
    public static final Item FUTANIUM_PICKAXE = new ToolPickaxe("futanium_pickaxe", TOOL_FUTANIUM);
    public static final Item FUTANIUM_HOE = new ToolHoe("futanium_hoe", TOOL_FUTANIUM);
    public static final Item FUTANIUM_SHOVEL = new ToolShovel("futanium_shovel", TOOL_FUTANIUM);
    public static final Item FUTANIUM_SWORD = new ToolSword("futanium_sword", TOOL_FUTANIUM);

}
