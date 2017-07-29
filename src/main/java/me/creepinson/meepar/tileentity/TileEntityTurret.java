package me.creepinson.meepar.tileentity;

import me.creepinson.meepar.block.BlockTurretBase;
import me.creepinson.meepar.block.ModBlocks;
import me.creepinson.meepar.entity.EntityTurret;
import me.creepinson.meepar.util.Utils;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;

import java.util.UUID;

/**
 * Created by theo on 7/26/17.
 */
public class TileEntityTurret extends TileEntity {

    public boolean isMultiblockMade(){
    Block turretStand = getWorld().getBlockState(pos.up(1)).getBlock();
    Block turretTop = getWorld().getBlockState(pos.up(2)).getBlock();

        if(turretStand ==ModBlocks.turretStand &&turretTop ==Blocks.DISPENSER)

    {
        return true;
    }

        else

    {
        return false;
    }

}



    public void formMultiBlock(UUID startingOwner) {

        if (isMultiblockMade()) {

            EnumFacing facing = getWorld().getBlockState(pos).getValue(BlockTurretBase.facing);
            EntityTurret entityTurret = new EntityTurret(getWorld(), startingOwner, 5, 0);
            entityTurret.setPosition(pos.getX(), pos.getY(), pos.getZ());
            entityTurret.rotationYaw = facing.getHorizontalAngle();
            getWorld().destroyBlock(pos, false);
            getWorld().destroyBlock(pos.up(1), false);
            getWorld().destroyBlock(pos.up(2), false);
            getWorld().spawnEntity(entityTurret);
            Utils.getLogger().info("Spawned Turret!");

        }

    }


}
