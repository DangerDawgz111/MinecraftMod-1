package com.Dangerdawgz111.DogUpgradesMod.init;

import java.util.ArrayList;
import java.util.List;

import com.Dangerdawgz111.DogUpgradesMod.blocks.RubyOre;
import com.Dangerdawgz111.DogUpgradesMod.items.ItemBase;
import com.Dangerdawgz111.DogUpgradesMod.items.armor.ArmorBase;
import com.Dangerdawgz111.DogUpgradesMod.items.food.FoodBase;
import com.Dangerdawgz111.DogUpgradesMod.items.food.FoodEffectBase;
import com.Dangerdawgz111.DogUpgradesMod.items.tools.ToolAxe;
import com.Dangerdawgz111.DogUpgradesMod.items.tools.ToolHoe;
import com.Dangerdawgz111.DogUpgradesMod.items.tools.ToolPickaxe;
import com.Dangerdawgz111.DogUpgradesMod.items.tools.ToolSpade;
import com.Dangerdawgz111.DogUpgradesMod.items.tools.ToolSword;
import com.Dangerdawgz111.DogUpgradesMod.util.Reference;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 3, 1970, 10.0F, 5.0F, 10);
	public static final ToolMaterial MATERIAL_SAPPHIRE = EnumHelper.addToolMaterial("material_sapphire", 3, 2565, 12.0F, 6.0F, 10);
	public static final ToolMaterial MATERIAL_EMERALD = EnumHelper.addToolMaterial("material_emerald", 3, 2700, 14.0F, 8.0F, 10);
	public static final ToolMaterial MATERIAL_SERENDIBITE = EnumHelper.addToolMaterial("material_serendibite", 3, 2480, 8.0F, 7.0F, 10);
	public static final ToolMaterial MATERIAL_MOONSTONE = EnumHelper.addToolMaterial("material_moonstone", 3, 750, 7.0F, 4.0F, 10);
	public static final ArmorMaterial ARMOR_MATERIAL_RUBY = EnumHelper.addArmorMaterial("armor_material_ruby", Reference.MOD_ID + ":ruby", 16, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SAPPHIRE = EnumHelper.addArmorMaterial("armor_material_sapphire", Reference.MOD_ID + ":sapphire", 16, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_EMERALD = EnumHelper.addArmorMaterial("armor_material_emerald", Reference.MOD_ID + ":emerald", 20, new int[] {3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_MOONSTONE = EnumHelper.addArmorMaterial("armor_material_moonstone", Reference.MOD_ID + ":moonstone", 20, new int[] {2, 4, 5, 2}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.5F);
	public static final ArmorMaterial ARMOR_MATERIAL_HAT1 = EnumHelper.addArmorMaterial("hat1", Reference.MOD_ID + ":hat1", 50, new int[] {3, 6, 8, 250}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 300.0F);
				
	//Items
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item SAPPHIRE = new ItemBase("sapphire");
	public static final Item SERENDIBITE = new ItemBase("serendibite");
	public static final Item MOONSTONE = new ItemBase("moonstone");
	public static final Item AMAZONITE = new ItemBase("amazonite");
	public static final Item RUBY_DOG_COLLAR = new ItemBase("ruby_dog_collar");
	public static final Item SAPPHIRE_DOG_COLLAR = new ItemBase("sapphire_dog_collar");
	public static final Item DIAMOND_DOG_COLLAR = new ItemBase("diamond_dog_collar");
	public static final Item GOLD_DOG_COLLAR = new ItemBase("gold_dog_collar");
	public static final Item IRON_DOG_COLLAR = new ItemBase("iron_dog_collar");	
	public static final Item NETHER_STAR_STICK = new ItemBase("nether_star_stick");	
	public static final Item CARBON = new ItemBase("carbon");
	public static final Item STEEL = new ItemBase("steel");
	
	//Tools
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final ItemPickaxe SAPPHIRE_PICKAXE = new ToolPickaxe("sapphire_pickaxe", MATERIAL_SAPPHIRE);
	public static final ItemSword SAPPHIRE_SWORD = new ToolSword("sapphire_sword", MATERIAL_SAPPHIRE);
	public static final ItemSpade SAPPHIRE_SHOVEL = new ToolSpade("sapphire_shovel", MATERIAL_SAPPHIRE);
	public static final ItemAxe SAPPHIRE_AXE = new ToolAxe("sapphire_axe", MATERIAL_SAPPHIRE);
	public static final ItemHoe SAPPHIRE_HOE = new ToolHoe("sapphire_hoe", MATERIAL_SAPPHIRE);
	public static final ItemPickaxe EMERALD_PICKAXE = new ToolPickaxe("emerald_pickaxe", MATERIAL_EMERALD);
	public static final ItemSword EMERALD_SWORD = new ToolSword("emerald_sword", MATERIAL_EMERALD);
	public static final ItemSpade EMERALD_SHOVEL = new ToolSpade("emerald_shovel", MATERIAL_EMERALD);
	public static final ItemAxe EMERALD_AXE = new ToolAxe("emerald_axe", MATERIAL_EMERALD);
	public static final ItemHoe EMERALD_HOE = new ToolHoe("emerald_hoe", MATERIAL_EMERALD);
	public static final ItemPickaxe MOONSTONE_PICKAXE = new ToolPickaxe("moonstone_pickaxe", MATERIAL_MOONSTONE);
	public static final ItemSword MOONSTONE_SWORD = new ToolSword("moonstone_sword", MATERIAL_MOONSTONE);
	public static final ItemSpade MOONSTONE_SHOVEL = new ToolSpade("moonstone_shovel", MATERIAL_MOONSTONE);
	public static final ItemAxe MOONSTONE_AXE = new ToolAxe("moonstone_axe", MATERIAL_MOONSTONE);
	public static final ItemHoe MOONSTONE_HOE = new ToolHoe("moonstone_hoe", MATERIAL_MOONSTONE);
	public static final ItemPickaxe SERENDIBITE_PICKAXE = new ToolPickaxe("serendibite_pickaxe", MATERIAL_SERENDIBITE);
	public static final ItemSword SERENDIBITE_SWORD = new ToolSword("serendibite_sword", MATERIAL_SERENDIBITE);
	public static final ItemSpade SERENDIBITE_SHOVEL = new ToolSpade("serendibite_shovel", MATERIAL_SERENDIBITE);
	public static final ItemAxe SERENDIBITE_AXE = new ToolAxe("serendibite_axe", MATERIAL_SERENDIBITE);
	public static final ItemHoe SERENDIBITE_HOE = new ToolHoe("serendibite_hoe", MATERIAL_SERENDIBITE);
	
	//Armor
	public static final Item RUBY_HELMET = new ArmorBase("ruby_helmet", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("ruby_chestplate", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("ruby_leggings", ARMOR_MATERIAL_RUBY, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS= new ArmorBase("ruby_boots", ARMOR_MATERIAL_RUBY, 1, EntityEquipmentSlot.FEET);
	public static final Item SAPPHIRE_HELMET = new ArmorBase("sapphire_helmet", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.HEAD);
	public static final Item SAPPHIRE_CHESTPLATE = new ArmorBase("sapphire_chestplate", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.CHEST);
	public static final Item SAPPHIRE_LEGGINGS = new ArmorBase("sapphire_leggings", ARMOR_MATERIAL_SAPPHIRE, 2, EntityEquipmentSlot.LEGS);
	public static final Item SAPPHIRE_BOOTS= new ArmorBase("sapphire_boots", ARMOR_MATERIAL_SAPPHIRE, 1, EntityEquipmentSlot.FEET);
	public static final Item EMERALD_HELMET = new ArmorBase("emerald_helmet", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.HEAD);
	public static final Item EMERALD_CHESTPLATE = new ArmorBase("emerald_chestplate", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.CHEST);
	public static final Item EMERALD_LEGGINGS = new ArmorBase("emerald_leggings", ARMOR_MATERIAL_EMERALD, 2, EntityEquipmentSlot.LEGS);
	public static final Item EMERALD_BOOTS= new ArmorBase("emerald_boots", ARMOR_MATERIAL_EMERALD, 1, EntityEquipmentSlot.FEET);
	public static final Item MOONSTONE_HELMET = new ArmorBase("moonstone_helmet", ARMOR_MATERIAL_MOONSTONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item MOONSTONE_CHESTPLATE = new ArmorBase("moonstone_chestplate", ARMOR_MATERIAL_MOONSTONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item MOONSTONE_LEGGINGS = new ArmorBase("moonstone_leggings", ARMOR_MATERIAL_MOONSTONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item MOONSTONE_BOOTS= new ArmorBase("moonstone_boots", ARMOR_MATERIAL_MOONSTONE, 1, EntityEquipmentSlot.FEET);
	public static final Item HAT1 = new ArmorBase("hat1", ARMOR_MATERIAL_HAT1, 1, EntityEquipmentSlot.HEAD);
	
	//Food
	//public static final Item EVIL_APPLE = new FoodBase("evil_apple", 4, 2.4f, false);
	public static final Item EVIL_APPLE = new FoodEffectBase("evil_apple", 4, 2.4f, false, new PotionEffect(MobEffects.POISON, (60*20), 1, false, true));
	public static final Item EMERALD_APPLE = new FoodEffectBase("emerald_apple", 20, 20f, false, new PotionEffect(MobEffects.HEALTH_BOOST, (60*20)*5, 5, false, true));
	public static final Item SUPER_BEEF_COOKED = new FoodEffectBase("super_beef_cooked", 4, 2.4f, false, new PotionEffect(MobEffects.RESISTANCE, (60*20)*300, 1, false, true));
	public static final Item SUPER_BEEF_RAW = new FoodEffectBase("super_beef_raw", 4, 2.4f, false, new PotionEffect(MobEffects.POISON, (60*20), 1, false, true));
}