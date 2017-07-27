package me.creepinson.meepar.tileentity;

import me.creepinson.meepar.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.item.EntityMinecartChest;
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity;

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
    public void checkMultiBlock() {

        if (isMultiblockMade()) {
            getWorld().destroyBlock(pos, false);
            getWorld().destroyBlock(pos.up(1), false);
            getWorld().destroyBlock(pos.up(2), false);

            EntityMinecartChest entityTurret = new EntityMinecartChest(getWorld(), pos.getX(), pos.getY(), pos.getZ());

            getWorld().spawnEntity(entityTurret);

        }

    }


}
