package com.jetpacker06.CreateBrokenBad.register;

import com.jetpacker06.CreateBrokenBad.CreateBrokenBad;
import com.jetpacker06.CreateBrokenBad.item.*;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class AllItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateBrokenBad.MOD_ID);
    //begin items
    public static final RegistryObject<Item>
    MATCH = ITEMS.register("match", () -> new MatchItem(new Item.Properties().tab(ItemGroup.CREATEBB))),
    PSEUDOPHEDRINE = ingredient("pseudophedrine"),
    SUDAFED = ITEMS.register("sudafed", () -> new SudafedItem(new Item.Properties().tab(ItemGroup.CREATEBB)
            .food(new FoodProperties.Builder()
                    .alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 60 * 20, 0), 1.0f)
                    .fast()
                    .build()))),
    SUDAFED_BOX = ITEMS.register("sudafed_box", () -> new SudafedBoxItem(new Item.Properties()
            .tab(ItemGroup.CREATEBB)
            .food(new FoodProperties.Builder()
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 60 * 20, 1), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 60 * 20, 0), 1.0f)
                    .build()))),
    EPHEDRA = ITEMS.register("ephedra", () -> new EphedraItem(new Item.Properties().tab(ItemGroup.CREATEBB))),
    EPHEDRA_SEEDS = ITEMS.register("ephedra_seeds", () -> new ItemNameBlockItem(AllBlocks.EPHEDRA_CROP_BLOCK.get(), new Item.Properties().tab(ItemGroup.CREATEBB))),
    WHITE_PHOSPHORUS = ingredient("white_phosphorus"),
    RED_PHOSPHORUS = ingredient("red_phosphorus"),
    BRINE = ingredient("brine"),
    IODINE = ingredient("iodine"),
    WHITE_METH = ITEMS.register("white_meth", () -> new MethItem.White(new Item.Properties()
            .tab(ItemGroup.CREATEBB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0f).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 30 * 20, 2), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 45 * 20, 0), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 30 * 20, 0), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 30 * 20, 1), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 30 * 20, 0), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 30 * 20, 0), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 30 * 20, 0), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.POISON, 45 * 20, 1), 0.3f)
                    .effect(new MobEffectInstance(MobEffects.POISON, 45 * 20, 2), 0.2f)
                    .effect(new MobEffectInstance(MobEffects.POISON, 45 * 20, 3), 0.1f)
                    .fast()
                    .build()))),

    CRUSHED_COPPER = ingredient("crushed_copper"),
    CRUSHED_ZINC = ingredient("crushed_zinc"),
    COPPER_ZINC_CATALYST = ITEMS.register("copper_zinc_catalyst", () -> new NonConsumedCatalystItem(new Item.Properties().stacksTo(1).tab(ItemGroup.CREATEBB))),
    CYANIDE = ingredient("cyanide"),
    ALUMINOSILICATE_CATALYST = ITEMS.register("aluminosilicate_catalyst", () -> new NonConsumedCatalystItem(new Item.Properties().stacksTo(1).tab(ItemGroup.CREATEBB))),
    ALUMINOSILICATE_BIT = ingredient("aluminosilicate_bit"),
    ALUMINOSILICATE_CHUNK = ingredient("aluminosilicate_chunk"),
    NITROGEN = ingredient("nitrogen"),
    BLUE_METH = ITEMS.register("blue_meth", () -> new MethItem.Blue(new Item.Properties()
            .tab(ItemGroup.CREATEBB)
            .food(new FoodProperties.Builder().nutrition(2).saturationMod(0f).alwaysEat()
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 120 * 20, 4), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 150 * 20, 1), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.ABSORPTION, 120 * 20, 2), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.DIG_SPEED, 120 * 20, 4), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.REGENERATION, 120 * 20, 0), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.HUNGER, 120 * 20, 2), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 120 * 20, 2), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.CONFUSION, 120 * 20, 3), 1.0f)
                    .effect(new MobEffectInstance(MobEffects.WITHER, 150 * 20, 3), 0.2f)
                    .effect(new MobEffectInstance(MobEffects.WITHER, 150 * 20, 4), 0.1f)
                    .effect(new MobEffectInstance(MobEffects.HARM, 150 * 20, 250), 0.05f)
                    .fast()
                    .build()))),

    LIQUID_METHAMPHETAMINE_BUCKET = bucket("liquid_methamphetamine_bucket", AllFluids.LIQUID_METHAMPHETAMINE),
    LIQUID_BLUE_METHAMPHETAMINE_BUCKET = bucket("liquid_blue_methamphetamine_bucket", AllFluids.LIQUID_BLUE_METHAMPHETAMINE),
    METHYLAMINE_BUCKET = bucket("methylamine_bucket", AllFluids.METHYLAMINE),
    METHANOL_BUCKET = bucket("methanol_bucket", AllFluids.METHANOL),
    HYDROGEN_BUCKET = bucket("hydrogen_bucket", AllFluids.HYDROGEN),
    OXYGEN_BUCKET = bucket("oxygen_bucket", AllFluids.OXYGEN),
    AMMONIA_BUCKET = bucket("ammonia_bucket", AllFluids.AMMONIA),
    PHENYLACETIC_ACID_BUCKET = bucket("phenylacetic_acid_bucket", AllFluids.PHENYLACETIC_ACID),
    ACETIC_ANHYRIDE_BUCKET = bucket("acetic_anhydride_bucket", AllFluids.ACETIC_ANHYDRIDE),
    PHENYLACETONE_BUCKET = bucket("phenylacetone_bucket", AllFluids.PHENYLACETONE);

    //end items
    public static RegistryObject<Item> ingredient(String name) {
        return ingredient(name, new Item.Properties().tab(ItemGroup.CREATEBB));
    }
    public static RegistryObject<Item> bucket(String name, RegistryObject<FlowingFluid> fluid) {
        return ITEMS.register(name, () -> new BucketItem(fluid, new Item.Properties().tab(ItemGroup.CREATEBB).craftRemainder(Items.BUCKET)));
    }
    public static RegistryObject<Item> ingredient(String name, Item.Properties pProperties) {
        return ITEMS.register(name, () -> new Item(pProperties));
    }
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}