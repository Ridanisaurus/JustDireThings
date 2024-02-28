package com.direwolf20.justdirethings.datagen;

import com.direwolf20.justdirethings.JustDireThings;
import com.direwolf20.justdirethings.datagen.recipes.GooSpreadRecipeBuilder;
import com.direwolf20.justdirethings.setup.Registration;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.Tags;

public class Recipes extends RecipeProvider {


    public Recipes(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        //Blocks
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
                .unlockedBy("has_goo_block", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier1_ITEM.get()))
                .save(consumer);

        //Items
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.Fuel_Canister.get())
                .pattern(" i ")
                .pattern("ici")
                .pattern(" i ")
                .define('i', Tags.Items.INGOTS_IRON)
                .define('c', Items.COAL)
                .group("justdirethings")
                .unlockedBy("has_coal", InventoryChangeTrigger.TriggerInstance.hasItems(Items.COAL))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, Registration.Pocket_Generator.get())
                .pattern("iri")
                .pattern("cfc")
                .pattern("iri")
                .define('i', Tags.Items.INGOTS_IRON)
                .define('c', Items.COAL)
                .define('r', Items.REDSTONE_BLOCK)
                .define('f', Items.FURNACE)
                .group("justdirethings")
                .unlockedBy("has_fuel_canister", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.Fuel_Canister.get()))
                .save(consumer);

        //GooSpread Recipes
        GooSpreadRecipeBuilder.shapeless(new ResourceLocation(JustDireThings.MODID, "dire_iron_block"), Blocks.IRON_BLOCK.defaultBlockState(), Registration.RawFerricoreOre.get().defaultBlockState(), 1, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t1", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier1_ITEM.get()))
                .save(consumer);
        GooSpreadRecipeBuilder.shapeless(new ResourceLocation(JustDireThings.MODID, "dire_gold_block"), Blocks.GOLD_BLOCK.defaultBlockState(), Registration.BlazeGoldBlock.get().defaultBlockState(), 2, 2400)
                .group("justdirethings")
                .unlockedBy("has_goo_block_t2", InventoryChangeTrigger.TriggerInstance.hasItems(Registration.GooBlock_Tier2_ITEM.get()))
                .save(consumer);

        //Smelting
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(Registration.FerricoreRaw.get()), RecipeCategory.MISC,
                        Registration.FerricoreIngot.get(), 1.0f, 400)
                .unlockedBy("has_ferricore_raw", inventoryTrigger(ItemPredicate.Builder.item().of(Registration.FerricoreRaw.get()).build()))
                .save(consumer, new ResourceLocation(JustDireThings.MODID, "ferricore_ingot_smelted"));

        //Resource Conversions
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.FerricoreIngot.get(), RecipeCategory.BUILDING_BLOCKS, Registration.FerricoreBlock.get(), Registration.FerricoreIngot.getId().getNamespace() + ":" + Registration.FerricoreIngot.getId().getPath(), "justdirethings", Registration.FerricoreBlock.getId().getNamespace() + ":" + Registration.FerricoreBlock.getId().getPath(), "justdirethings");
        nineBlockStorageRecipes(consumer, RecipeCategory.MISC, Registration.BlazeGoldIngot.get(), RecipeCategory.BUILDING_BLOCKS, Registration.BlazeGoldBlock.get(), Registration.BlazeGoldIngot.getId().getNamespace() + ":" + Registration.BlazeGoldIngot.getId().getPath(), "justdirethings", Registration.BlazeGoldBlock.getId().getNamespace() + ":" + Registration.BlazeGoldBlock.getId().getPath(), "justdirethings");

    }
}
