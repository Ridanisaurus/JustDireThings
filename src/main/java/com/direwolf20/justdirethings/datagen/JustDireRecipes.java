package com.direwolf20.justdirethings.datagen;

import com.direwolf20.justdirethings.JustDireThings;
import com.direwolf20.justdirethings.common.blocks.baseblocks.BaseMachineBlock;
import com.direwolf20.justdirethings.datagen.recipes.FluidDropRecipeBuilder;
import com.direwolf20.justdirethings.datagen.recipes.GooSpreadRecipeBuilder;
import com.direwolf20.justdirethings.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class JustDireRecipes extends RecipeProvider {

    public JustDireRecipes(PackOutput output, CompletableFuture<HolderLookup.Provider> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        //Goo Blocks
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.GooBlock_Tier1.get())
                .pattern("csc")
                .pattern("fdf")
                .pattern("csc")
                .define('d', Items.DIRT)
                .define('c', Items.CLAY_BALL)
                .define('s', Items.SUGAR)
                .define('f', Items.ROTTEN_FLESH)
                .group("justdirethings")
                .unlockedBy("has_coal", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COAL))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.GooBlock_Tier2.get())
                .pattern("brb")
                .pattern("wgw")
                .pattern("brb")
                .define('g', Registration.GooBlock_Tier1_ITEM.get())
                .define('b', Items.BLAZE_POWDER)
                .define('r', Tags.Items.DUSTS_REDSTONE)
                .define('w', Items.NETHER_WART)
                .group("justdirethings")
                .unlockedBy("has_goo_block1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier1_ITEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.GooBlock_Tier3.get())
                .pattern("brb")
                .pattern("wgw")
                .pattern("brb")
                .define('g', Registration.GooBlock_Tier2_ITEM.get())
                .define('b', Items.ENDER_PEARL)
                .define('r', Items.END_STONE)
                .define('w', Items.DRAGON_BREATH)
                .group("justdirethings")
                .unlockedBy("has_goo_block2", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier2_ITEM.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.GooBlock_Tier4.get())
                .pattern("brb")
                .pattern("wgw")
                .pattern("brb")
                .define('g', Registration.GooBlock_Tier3_ITEM.get())
                .define('b', Items.SCULK)
                .define('r', Items.SCULK_SHRIEKER)
                .define('w', Items.ECHO_SHARD)
                .group("justdirethings")
                .unlockedBy("has_goo_block3", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier3_ITEM.get()))
                .save(consumer);

        //Machines
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.ItemCollector.get())
                .pattern(" d ")
                .pattern("heh")
                .pattern("fff")
                .define('e', Items.ENDER_PEARL)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.DIAMOND)
                .define('h', Items.HOPPER)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EnergyTransmitter.get())
                .pattern(" d ")
                .pattern("heh")
                .pattern("fff")
                .define('e', Items.ENDER_PEARL)
                .define('f', Registration.BlazegoldIngot.get())
                .define('d', Registration.Celestigem.get())
                .define('h', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlockBreakerT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.OBSERVER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.DIAMOND)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlockBreakerT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.BlockBreakerT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlockPlacerT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.DISPENSER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.DIAMOND)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlockPlacerT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.BlockPlacerT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.ClickerT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.DISPENSER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.ENDER_EYE)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.ClickerT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.ClickerT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.SensorT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.OBSERVER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.ENDER_EYE)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.SensorT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.SensorT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.DropperT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.DROPPER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.REDSTONE)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.DropperT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.DropperT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.GeneratorT1.get())
                .pattern("iri")
                .pattern("cfc")
                .pattern("iri")
                .define('i', Registration.FerricoreIngot.get())
                .define('c', Items.COAL)
                .define('r', Items.REDSTONE)
                .define('f', Items.BLAST_FURNACE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.GeneratorFluidT1.get())
                .pattern("grg")
                .pattern("bfb")
                .pattern("grg")
                .define('g', Registration.BlazegoldIngot.get())
                .define('b', Items.BUCKET)
                .define('r', Items.REDSTONE)
                .define('f', Items.BLAST_FURNACE)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlockSwapperT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.OBSERVER)
                .define('f', Registration.BlazegoldIngot.get())
                .define('d', Items.ENDER_EYE)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlockSwapperT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.BlockSwapperT1_ITEM.get())
                .define('f', Registration.EclipseAlloyIngot.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.PlayerAccessor.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.DISPENSER)
                .define('f', Registration.BlazegoldIngot.get())
                .define('d', Items.ENDER_EYE)
                .define('l', Items.ENDER_PEARL)
                .define('r', Items.LAPIS_LAZULI)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FluidPlacerT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.DROPPER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.BUCKET)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FluidPlacerT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.FluidPlacerT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FluidCollectorT1.get())
                .pattern("fdf")
                .pattern("lol")
                .pattern("frf")
                .define('o', Items.DISPENSER)
                .define('f', Registration.FerricoreIngot.get())
                .define('d', Items.BUCKET)
                .define('l', Items.LAPIS_LAZULI)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FluidCollectorT2.get())
                .pattern("fdf")
                .pattern("dod")
                .pattern("frf")
                .define('o', Registration.FluidCollectorT1_ITEM.get())
                .define('f', Registration.Celestigem.get())
                .define('d', Items.ENDER_EYE)
                .define('r', Items.REDSTONE)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);

        //Resource
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Registration.PolymorphicCatalyst.get(), 4)
                .requires(Registration.BlazegoldIngot.get())
                .requires(Items.NETHER_WART)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.PortalFluidCatalyst.get())
                .pattern(" c ")
                .pattern("clc")
                .pattern(" c ")
                .define('c', Items.CHORUS_FRUIT)
                .define('l', Items.LAPIS_LAZULI)
                .group("justdirethings")
                .unlockedBy("has_chorus_fruit", InventoryChangeTrigger.TriggerInstance.hasItems(Items.CHORUS_FRUIT))
                .save(consumer);

        //Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreWrench.get())
                .pattern(" i ")
                .pattern(" ii")
                .pattern("i  ")
                .define('i', Registration.FerricoreIngot.get())
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.TotemOfDeathRecall.get())
                .pattern("bdb")
                .pattern("lel")
                .pattern("bdb")
                .define('b', Registration.BlazegoldIngot.get())
                .define('e', Items.ENDER_PEARL)
                .define('d', Items.DIAMOND)
                .define('l', Items.LAPIS_LAZULI)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.Fuel_Canister.get())
                .pattern(" i ")
                .pattern("ici")
                .pattern(" i ")
                .define('i', Registration.FerricoreIngot.get())
                .define('c', Items.COAL)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FluidCanister.get())
                .pattern(" i ")
                .pattern("igi")
                .pattern(" i ")
                .define('i', Registration.FerricoreIngot.get())
                .define('g', Items.GLASS)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.Pocket_Generator.get())
                .pattern("iri")
                .pattern("cfc")
                .pattern("iri")
                .define('i', Registration.FerricoreIngot.get())
                .define('c', Items.COAL)
                .define('r', Items.REDSTONE_BLOCK)
                .define('f', Items.FURNACE)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazejetWand.get())
                .pattern("  b")
                .pattern(" i ")
                .pattern("i  ")
                .define('i', Registration.FerricoreIngot.get())
                .define('b', Registration.BlazegoldIngot.get())
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.VoidshiftWand.get())
                .pattern("  c")
                .pattern(" w ")
                .pattern("b  ")
                .define('b', Registration.BlazegoldIngot.get())
                .define('w', Registration.BlazejetWand.get())
                .define('c', Registration.Celestigem.get())
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipsegateWand.get())
                .pattern("  e")
                .pattern(" w ")
                .pattern("c  ")
                .define('e', Registration.EclipseAlloyIngot.get())
                .define('w', Registration.VoidshiftWand.get())
                .define('c', Registration.Celestigem.get())
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CreatureCatcher.get())
                .pattern(" b ")
                .pattern("beb")
                .pattern(" b ")
                .define('b', Registration.BlazegoldIngot.get())
                .define('e', Items.ENDER_PEARL)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.MachineSettingsCopier.get())
                .pattern("  c")
                .pattern(" p ")
                .pattern("f  ")
                .define('f', Registration.FerricoreIngot.get())
                .define('p', Items.PAPER)
                .define('c', Registration.Coal_T1.get())
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.PortalGun.get())
                .pattern(" bb")
                .pattern("beb")
                .pattern("b  ")
                .define('e', Items.ENDER_EYE)
                .define('b', Registration.BlazegoldIngot.get())
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.PortalGunV2.get())
                .pattern(" bc")
                .pattern("beb")
                .pattern("bf ")
                .define('e', Registration.PortalFluidCatalyst.get())
                .define('b', Registration.BlazegoldIngot.get())
                .define('c', Registration.Celestigem.get())
                .define('f', Registration.FluidCanister.get())
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);


        //GooSpread Recipes
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "dire_iron_block"), Blocks.IRON_BLOCK.defaultBlockState(), Registration.RawFerricoreOre.get().defaultBlockState(), 1, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier1_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "dire_gold_block"), Blocks.GOLD_BLOCK.defaultBlockState(), Registration.RawBlazegoldOre.get().defaultBlockState(), 2, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t2", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier2_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "dire_diamond_block"), Blocks.DIAMOND_BLOCK.defaultBlockState(), Registration.RawCelestigemOre.get().defaultBlockState(), 3, 4800)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t3", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier3_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "dire_netherite_block"), Blocks.NETHERITE_BLOCK.defaultBlockState(), Registration.RawEclipseAlloyOre.get().defaultBlockState(), 4, 4800)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t4", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier4_ITEM.get()))
                .save(consumer);

        //GooSpread Coal
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "coal_block_t1"), Blocks.COAL_BLOCK.defaultBlockState(), Registration.RawCoal_T1.get().defaultBlockState(), 1, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier1_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "coal_block_t2"), Registration.CoalBlock_T1.get().defaultBlockState(), Registration.RawCoal_T2.get().defaultBlockState(), 2, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t2", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier2_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "coal_block_t3"), Registration.CoalBlock_T2.get().defaultBlockState(), Registration.RawCoal_T3.get().defaultBlockState(), 3, 4800)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t3", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier3_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "coal_block_t4"), Registration.CoalBlock_T3.get().defaultBlockState(), Registration.RawCoal_T4.get().defaultBlockState(), 4, 4800)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t4", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier4_ITEM.get()))
                .save(consumer);

        //GooSpread Misc
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "portal_fluid"), Registration.UNSTABLE_PORTAL_FLUID_BLOCK.get().defaultBlockState(), Registration.PORTAL_FLUID_BLOCK.get().defaultBlockState(), 3, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t3", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier3_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "refined_t2_fluid"), Registration.UNREFINED_T2_FLUID_BLOCK.get().defaultBlockState(), Registration.REFINED_T2_FLUID_BLOCK.get().defaultBlockState(), 2, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t2", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier2_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "refined_t3_fluid"), Registration.UNREFINED_T3_FLUID_BLOCK.get().defaultBlockState(), Registration.REFINED_T3_FLUID_BLOCK.get().defaultBlockState(), 3, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t3", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier3_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "refined_t4_fluid"), Registration.UNREFINED_T4_FLUID_BLOCK.get().defaultBlockState(), Registration.REFINED_T4_FLUID_BLOCK.get().defaultBlockState(), 4, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t4", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier4_ITEM.get()))
                .save(consumer);

        //FluidDrop Recipes
        FluidDropRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "polymorphic_fluid"), Blocks.WATER.defaultBlockState(), Registration.POLYMORPHIC_FLUID_BLOCK.get().defaultBlockState(), Registration.PolymorphicCatalyst.get())
                .group("justdirethings")
                .unlockedBy("has_polymorphic_catalyst", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PolymorphicCatalyst.get()))
                .save(consumer);
        FluidDropRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "unstable_portal_fluid"), Registration.POLYMORPHIC_FLUID_BLOCK.get().defaultBlockState(), Registration.UNSTABLE_PORTAL_FLUID_BLOCK.get().defaultBlockState(), Registration.PortalFluidCatalyst.get())
                .group("justdirethings")
                .unlockedBy("has_portal_catalyst", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.PortalFluidCatalyst.get()))
                .save(consumer);
        FluidDropRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "unrefined_t2_fluid"), Registration.POLYMORPHIC_FLUID_BLOCK.get().defaultBlockState(), Registration.UNREFINED_T2_FLUID_BLOCK.get().defaultBlockState(), Registration.Coal_T2.get())
                .group("justdirethings")
                .unlockedBy("has_coal_t2", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Coal_T2.get()))
                .save(consumer);
        FluidDropRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "unrefined_t3_fluid"), Registration.REFINED_T2_FLUID_BLOCK.get().defaultBlockState(), Registration.UNREFINED_T3_FLUID_BLOCK.get().defaultBlockState(), Registration.Coal_T3.get())
                .group("justdirethings")
                .unlockedBy("has_coal_t3", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Coal_T3.get()))
                .save(consumer);
        FluidDropRecipeBuilder.shapeless(ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "unrefined_t4_fluid"), Registration.REFINED_T3_FLUID_BLOCK.get().defaultBlockState(), Registration.UNREFINED_T4_FLUID_BLOCK.get().defaultBlockState(), Registration.Coal_T4.get())
                .group("justdirethings")
                .unlockedBy("has_coal_t4", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Coal_T4.get()))
                .save(consumer);

        //Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RawFerricore.get()), RecipeCategory.MISC,
                        Registration.FerricoreIngot.get(), 1.0f, 200)
                .unlockedBy("has_ferricore_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.RawFerricore.get()).build()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "ferricore_ingot_smelted"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RawBlazegold.get()), RecipeCategory.MISC,
                        Registration.BlazegoldIngot.get(), 1.0f, 200)
                .unlockedBy("has_blazegold_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.RawBlazegold.get()).build()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "blazegold_ingot_smelted"));
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.RawEclipseAlloy.get()), RecipeCategory.MISC,
                        Registration.EclipseAlloyIngot.get(), 1.0f, 200)
                .unlockedBy("has_eclipsealloy_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.RawEclipseAlloy.get()).build()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "eclipsealloy_ingot_smelted"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.RawFerricore.get()), RecipeCategory.MISC,
                        Registration.FerricoreIngot.get(), 1.0f, 100)
                .unlockedBy("has_ferricore_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.RawFerricore.get()).build()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "ferricore_ingot_blasted"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.RawBlazegold.get()), RecipeCategory.MISC,
                        Registration.BlazegoldIngot.get(), 1.0f, 100)
                .unlockedBy("has_blazegold_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.RawBlazegold.get()).build()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "blazegold_ingot_blasted"));
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(Registration.RawEclipseAlloy.get()), RecipeCategory.MISC,
                        Registration.EclipseAlloyIngot.get(), 1.0f, 100)
                .unlockedBy("has_eclipsealloy_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.RawEclipseAlloy.get()).build()))
                .save(consumer, ResourceLocation.fromNamespaceAndPath(JustDireThings.MODID, "eclipsealloy_ingot_blasted"));

        //Tools
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreSword.get())
                .pattern(" f ")
                .pattern(" f ")
                .pattern(" s ")
                .define('f', Registration.FerricoreIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricorePickaxe.get())
                .pattern("fff")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.FerricoreIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreShovel.get())
                .pattern(" f ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.FerricoreIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreAxe.get())
                .pattern("ff ")
                .pattern("fs ")
                .pattern(" s ")
                .define('f', Registration.FerricoreIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreHoe.get())
                .pattern("ff ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.FerricoreIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldSword.get())
                .pattern(" f ")
                .pattern(" f ")
                .pattern(" s ")
                .define('f', Registration.BlazegoldIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldPickaxe.get())
                .pattern("fff")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.BlazegoldIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldShovel.get())
                .pattern(" f ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.BlazegoldIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldAxe.get())
                .pattern("ff ")
                .pattern("fs ")
                .pattern(" s ")
                .define('f', Registration.BlazegoldIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldHoe.get())
                .pattern("ff ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.BlazegoldIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemSword.get())
                .pattern(" f ")
                .pattern(" f ")
                .pattern(" s ")
                .define('f', Registration.Celestigem.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemPickaxe.get())
                .pattern("fff")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.Celestigem.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemShovel.get())
                .pattern(" f ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.Celestigem.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemAxe.get())
                .pattern("ff ")
                .pattern("fs ")
                .pattern(" s ")
                .define('f', Registration.Celestigem.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemHoe.get())
                .pattern("ff ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.Celestigem.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemPaxel.get())
                .pattern("ahp")
                .pattern(" s ")
                .pattern(" s ")
                .define('a', Registration.CelestigemAxe.get())
                .define('h', Registration.CelestigemShovel.get())
                .define('p', Registration.CelestigemPickaxe.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipseAlloySword.get())
                .pattern(" f ")
                .pattern(" f ")
                .pattern(" s ")
                .define('f', Registration.EclipseAlloyIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipseAlloyPickaxe.get())
                .pattern("fff")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.EclipseAlloyIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipseAlloyShovel.get())
                .pattern(" f ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.EclipseAlloyIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipseAlloyAxe.get())
                .pattern("ff ")
                .pattern("fs ")
                .pattern(" s ")
                .define('f', Registration.EclipseAlloyIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipseAlloyHoe.get())
                .pattern("ff ")
                .pattern(" s ")
                .pattern(" s ")
                .define('f', Registration.EclipseAlloyIngot.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.EclipseAlloyPaxel.get())
                .pattern("ahp")
                .pattern(" s ")
                .pattern(" s ")
                .define('a', Registration.EclipseAlloyAxe.get())
                .define('h', Registration.EclipseAlloyShovel.get())
                .define('p', Registration.EclipseAlloyPickaxe.get())
                .define('s', Items.STICK)
                .group("justdirethings")
                .unlockedBy("has_eclipsealloy_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.EclipseAlloyIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreBoots.get())
                .pattern("f f")
                .pattern("f f")
                .pattern("   ")
                .define('f', Registration.FerricoreIngot.get())
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreLeggings.get())
                .pattern("fff")
                .pattern("f f")
                .pattern("f f")
                .define('f', Registration.FerricoreIngot.get())
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreChestplate.get())
                .pattern("f f")
                .pattern("fff")
                .pattern("fff")
                .define('f', Registration.FerricoreIngot.get())
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.FerricoreHelmet.get())
                .pattern("fff")
                .pattern("f f")
                .pattern("   ")
                .define('f', Registration.FerricoreIngot.get())
                .group("justdirethings")
                .unlockedBy("has_ferricore_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.FerricoreIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldBoots.get())
                .pattern("f f")
                .pattern("f f")
                .pattern("   ")
                .define('f', Registration.BlazegoldIngot.get())
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldLeggings.get())
                .pattern("fff")
                .pattern("f f")
                .pattern("f f")
                .define('f', Registration.BlazegoldIngot.get())
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldChestplate.get())
                .pattern("f f")
                .pattern("fff")
                .pattern("fff")
                .define('f', Registration.BlazegoldIngot.get())
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.BlazegoldHelmet.get())
                .pattern("fff")
                .pattern("f f")
                .pattern("   ")
                .define('f', Registration.BlazegoldIngot.get())
                .group("justdirethings")
                .unlockedBy("has_blazegold_ingot", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.BlazegoldIngot.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemBoots.get())
                .pattern("f f")
                .pattern("f f")
                .pattern("   ")
                .define('f', Registration.Celestigem.get())
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemLeggings.get())
                .pattern("fff")
                .pattern("f f")
                .pattern("f f")
                .define('f', Registration.Celestigem.get())
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemChestplate.get())
                .pattern("f f")
                .pattern("fff")
                .pattern("fff")
                .define('f', Registration.Celestigem.get())
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.CelestigemHelmet.get())
                .pattern("fff")
                .pattern("f f")
                .pattern("   ")
                .define('f', Registration.Celestigem.get())
                .group("justdirethings")
                .unlockedBy("has_celestigem", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Celestigem.get()))
                .save(consumer);


        //Resource Conversions
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.FerricoreIngot.get(), RecipeCategory.BUILDING_BLOCKS, Registration.FerricoreBlock.get(), Registration.FerricoreIngot.getId().toString() + "_9x9", "justdirethings", Registration.FerricoreBlock.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.BlazegoldIngot.get(), RecipeCategory.BUILDING_BLOCKS, Registration.BlazeGoldBlock.get(), Registration.BlazegoldIngot.getId().toString() + "_9x9", "justdirethings", Registration.BlazeGoldBlock.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.Celestigem.get(), RecipeCategory.BUILDING_BLOCKS, Registration.CelestigemBlock.get(), Registration.Celestigem.getId().toString() + "_9x9", "justdirethings", Registration.CelestigemBlock.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.EclipseAlloyIngot.get(), RecipeCategory.BUILDING_BLOCKS, Registration.EclipseAlloyBlock.get(), Registration.EclipseAlloyIngot.getId().toString() + "_9x9", "justdirethings", Registration.EclipseAlloyBlock.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.Coal_T1.get(), RecipeCategory.BUILDING_BLOCKS, Registration.CoalBlock_T1.get(), Registration.Coal_T1.getId().toString() + "_9x9", "justdirethings", Registration.CoalBlock_T1.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.Coal_T2.get(), RecipeCategory.BUILDING_BLOCKS, Registration.CoalBlock_T2.get(), Registration.Coal_T2.getId().toString() + "_9x9", "justdirethings", Registration.CoalBlock_T2.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.Coal_T3.get(), RecipeCategory.BUILDING_BLOCKS, Registration.CoalBlock_T3.get(), Registration.Coal_T3.getId().toString() + "_9x9", "justdirethings", Registration.CoalBlock_T3.getId().toString() + "_9x9", "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.Coal_T4.get(), RecipeCategory.BUILDING_BLOCKS, Registration.CoalBlock_T4.get(), Registration.Coal_T4.getId().toString() + "_9x9", "justdirethings", Registration.CoalBlock_T4.getId().toString() + "_9x9", "justdirethings");

        //NBT Clear
        for (var sidedBlock : Registration.SIDEDBLOCKS.getEntries()) {
            if (sidedBlock.get() instanceof BaseMachineBlock baseMachineBlock) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, sidedBlock.get())
                        .requires(sidedBlock.get())
                        .group("justdirethings")
                        .unlockedBy("has_" + sidedBlock.getId().getPath(), InventoryChangeTrigger.TriggerInstance.hasItems(sidedBlock.get()))
                        .save(consumer, sidedBlock.getId() + "_nbtclear");
            }
        }
        for (var sidedBlock : Registration.BLOCKS.getEntries()) {
            if (sidedBlock.get() instanceof BaseMachineBlock baseMachineBlock) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, sidedBlock.get())
                        .requires(sidedBlock.get())
                        .group("justdirethings")
                        .unlockedBy("has_" + sidedBlock.getId().getPath(), InventoryChangeTrigger.TriggerInstance.hasItems(sidedBlock.get()))
                        .save(consumer, sidedBlock.getId() + "_nbtclear");
            }
        }
    }
}
