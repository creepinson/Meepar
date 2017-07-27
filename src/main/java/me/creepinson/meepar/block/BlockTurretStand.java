package me.creepinson.meepar.block;

import me.creepinson.meepar.Meepar;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;

/**
 * Created by theo on 7/25/17.
 */
public class BlockTurretStand extends Block {
    public BlockTurretStand(String unlocalizedName, String registryName) {
        super(Material.WOOD);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Meepar.MOD_ID, registryName));
        this.setHardness(3);
        this.setResistance(1.1f);
        this.setCreativeTab(CreativeTabs.MISC);

    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }
}
