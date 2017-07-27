package me.creepinson.meepar;

import me.creepinson.meepar.block.ModBlocks;
import me.creepinson.meepar.item.ModItems;
import me.creepinson.meepar.tileentity.TileEntityTurret;
import me.creepinson.meepar.util.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = Meepar.MOD_ID,
        name = Meepar.MOD_NAME,
        version = Meepar.VERSION
)
public class Meepar {

    public static final String MOD_ID = "meepar";
    public static final String MOD_NAME = "Meepar";
    public static final String VERSION = "1.0.0";
    public static final String SERVER_PROXY = "me.creepinson.meepar.util.proxy.CommonProxy";
    public static final String CLIENT_PROXY = "me.creepinson.meepar.util.proxy.ClientProxy";

    @Mod.Instance(MOD_ID)
    public static Meepar instance;

    @SidedProxy(serverSide = SERVER_PROXY, clientSide = CLIENT_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void init(FMLInitializationEvent event) {


        GameRegistry.registerTileEntity(TileEntityTurret.class, "tileentityturret");


    }


    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        ModItems.init();;
        ModItems.register();

        ModBlocks.init();
        ModBlocks.register();


        proxy.registerRenders();
        
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {




    }




}
