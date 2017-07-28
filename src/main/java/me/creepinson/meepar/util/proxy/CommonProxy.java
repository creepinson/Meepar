package me.creepinson.meepar.util.proxy;

import me.creepinson.meepar.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by theo on 7/25/17.
 */
public class CommonProxy {

    public void registerRenders() {
    }

    public void registerModelBakeryStuff() {
    }


    public void init() {

        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedStick, 3, 0), Items.BONE, Items.IRON_INGOT, Items.STICK);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.reinforcedStick, 3, 1), Items.BONE, Items.BONE, Items.IRON_INGOT, new ItemStack(ModItems.reinforcedStick, 1, 0));

    }

    public void preInit(){




    }

}
