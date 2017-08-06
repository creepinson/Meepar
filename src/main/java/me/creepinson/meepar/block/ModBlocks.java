package me.creepinson.meepar.block;

import me.creepinson.meepar.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by theo on 7/25/17.
 */
public class ModBlocks {


    //TURRET
    public static Block turretBase;
    public static Block turretStand;
    public static Block mobChamberCore;

    //


    public static void init() {

        turretBase = new BlockTurretBase("turret_base", "turret_base");
        turretStand = new BlockTurretStand("turret_stand", "turret_stand");
        mobChamberCore = new BlockMobChamberCore("mob_chamber_core", "mob_chamber_core");
    }

    public static void register() {

        registerBlock(turretBase);
        registerBlock(turretStand);
        registerBlock(mobChamberCore);
    }

    public static void registerRenders() {
        registerRender(mobChamberCore);
        registerRender(turretBase);
        registerRender(turretStand);

    }

    public static void registerBlock(Block block){
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()).setHasSubtypes(true).setMaxDamage(0));
        Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));
    }

    public static void registerRender(Block block){

        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

    }


}
