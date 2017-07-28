package me.creepinson.meepar.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.ai.EntityAIAttackRanged;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by theo on 7/28/17.
 */
public class EntityTurret extends EntityMob implements IRangedAttackMob {
    private int tier;

    public int getTier() {
        return tier;
    }

    public int attackMode;
    public int range;
    public List<UUID> owners = new ArrayList<UUID>();

    public EntityTurret(World worldIn, UUID startingOwner, int range, int tier) {
        super(worldIn);
        this.owners.add(startingOwner);
        this.range = range;
        this.tier = tier;
    }

    public EntityTurret(World worldIn){
        super(worldIn);
    }

    @Override
    protected void initEntityAI() {
        super.initEntityAI();
        this.tasks.addTask(4, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIAttackRanged(this, 0, 5, range));

//        switch(attackMode){
//
//             case 0:
//                 this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityPlayer>(this, 0, 5, range));
//
//
//        }

        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget<EntityZombie>(this, EntityZombie.class, true, true));


    }

    @Override
    public void attackEntityWithRangedAttack(EntityLivingBase target, float distanceFactor) {

        EntityArrowCustom arrow = null;
        switch (tier) {
            case 0:
                arrow = new EntityArrowCustom(getEntityWorld(), this, false);
            case 1:
                arrow = new EntityArrowCustom(getEntityWorld(), this, true);

        }
        Vec3d looking = this.getLookVec();
        if (looking != null) {
            arrow.motionX = looking.x;
            arrow.motionY = looking.y;
            arrow.motionZ = looking.z;
        }


    }
}
