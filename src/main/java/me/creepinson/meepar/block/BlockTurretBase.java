package me.creepinson.meepar.block;

import me.creepinson.meepar.Meepar;
import me.creepinson.meepar.tileentity.TileEntityTurret;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

/**
 * Created by theo on 7/25/17.
 */
public class BlockTurretBase extends Block implements ITileEntityProvider {
    public static final PropertyDirection facing = PropertyDirection.create("facing", EnumFacing.Plane.HORIZONTAL);

    public BlockTurretBase(String unlocalizedName, String registryName) {
        super(Material.IRON);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(Meepar.MOD_ID, registryName));
        this.setHardness(12);
        this.setResistance(2.2f);
        this.setCreativeTab(CreativeTabs.MISC);
        this.setDefaultState(this.blockState.getBaseState().withProperty(facing, EnumFacing.NORTH));

    }

    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(facing, EnumFacing.getFront(meta & 7));
    }

    public int getMetaFromState(IBlockState state) {
        int i = 0;
        i = i | ((EnumFacing) state.getValue(facing)).getIndex();

        return i;
    }

    @Override
    public void onBlockPlacedBy(World worldIn, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack) {
        if (EnumFacing.getDirectionFromEntityLiving(pos, placer) == EnumFacing.DOWN || EnumFacing.getDirectionFromEntityLiving(pos, placer) == EnumFacing.UP) {
            return;
        } else {
            worldIn.setBlockState(pos, state.withProperty(facing, EnumFacing.getDirectionFromEntityLiving(pos, placer)));
        }
    }

    @Override
    public void harvestBlock(World worldIn, EntityPlayer player, BlockPos pos, IBlockState state, @Nullable TileEntity te, ItemStack stack) {
        super.harvestBlock(worldIn, player, pos, state, te, stack);

        worldIn.removeTileEntity(pos);

    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[]{facing});
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if (!worldIn.isRemote) {
            if (!playerIn.isSneaking()) {
                TileEntity te = worldIn.getTileEntity(pos);
                if (te != null && te instanceof TileEntityTurret) {

                    ((TileEntityTurret) te).formMultiBlock(playerIn.getUniqueID());

                }
            }
        }
        return true;
    }

    @Override
    public IBlockState getStateForPlacement(World world, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer, EnumHand hand) {

        if (EnumFacing.getDirectionFromEntityLiving(pos, placer) == EnumFacing.DOWN || EnumFacing.getDirectionFromEntityLiving(pos, placer) == EnumFacing.UP) {
            this.dropBlockAsItem(world, pos, this.getDefaultState(), 0);
            return Blocks.AIR.getDefaultState();

        } else {
            return this.getDefaultState().withProperty(this.facing, EnumFacing.getDirectionFromEntityLiving(pos, placer));
        }
    }


    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(facing, rot.rotate((EnumFacing) state.getValue(facing)));
    }

    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation((EnumFacing) state.getValue(facing)));
    }


    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileEntityTurret();
    }
}
