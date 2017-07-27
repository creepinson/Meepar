package me.creepinson.meepar.util.proxy;

import me.creepinson.meepar.Meepar;
import me.creepinson.meepar.block.ModBlocks;
import me.creepinson.meepar.item.ModItems;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.util.ResourceLocation;

/**
 * Created by theo on 7/25/17.
 */
public class ClientProxy extends CommonProxy{

    @Override
    public void registerRenders() {

        ModItems.registerRenders();
        ModBlocks.registerRenders();



    }

    @Override
    public void registerModelBakeryStuff() {
        ModelBakery.registerItemVariants(ModItems.reinforcedStick, new ResourceLocation(Meepar.MOD_ID, "reinforced_stick_tier1"), new ResourceLocation(Meepar.MOD_ID, "reinforced_stick_tier2"));


    }
}
