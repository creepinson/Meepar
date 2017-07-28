package me.creepinson.meepar.entity;


import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityArrowCustom extends EntityArrow {
    public EntityArrowCustom(World worldIn) {
        super(worldIn);
    }

    public EntityArrowCustom(World worldIn, EntityLivingBase shooter, boolean flaming) {
        super(worldIn, shooter);
    }

    @Override
    protected ItemStack getArrowStack() {
        return null;
    }
}