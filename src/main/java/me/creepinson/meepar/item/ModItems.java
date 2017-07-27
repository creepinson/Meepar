package me.creepinson.meepar.item;

import me.creepinson.meepar.EnumHandler;
import me.creepinson.meepar.Meepar;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by theo on 7/26/17.
 */
public class ModItems {

    public static Item reinforcedStick;

    public static void init() {

        reinforcedStick = new ItemReinforcedStick();


    }



    public static void register() {

        registerItem(reinforcedStick);

    }

    public static void registerItem(Item item){
        GameRegistry.register(item);
    }

    public static void registerRenders() {



        for(int i = 0; i < EnumHandler.Tiers.values().length; i++) {
            registerRender(reinforcedStick, i, "reinforced_stick_tier" + EnumHandler.Tiers.values()[i].getName());
        }
    }

    public static void registerRender(Item item) {

        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Meepar.MOD_ID, item.getUnlocalizedName().substring(5)), "inventory"));

    }

    public static void registerRender(Item item, int meta, String fileName) {

        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(Meepar.MOD_ID, fileName), "inventory"));

    }

}
