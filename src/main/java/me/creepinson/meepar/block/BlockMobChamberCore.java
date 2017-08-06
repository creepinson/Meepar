package me.creepinson.meepar.block;

import com.mojang.realmsclient.gui.ChatFormatting;
import me.creepinson.meepar.Meepar;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.ResourceLocation;

import java.util.List;

/**
 * Created by theo on 7/25/17.
 */
public class BlockMobChamberCore extends Block {
    public BlockMobChamberCore(String unlocalizedName, String registryName) {
        super(Material.ROCK);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Meepar.MOD_ID, registryName));
        this.setHardness(4.2f);
        this.setResistance(2.4f);
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

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> tooltip, boolean advanced) {
        super.addInformation(stack, player, tooltip, advanced);

        tooltip.add(ChatFormatting.DARK_AQUA + "A block used in the Mob Chamber multiblock structure!");
    }
}
