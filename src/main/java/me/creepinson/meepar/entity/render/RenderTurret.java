package me.creepinson.meepar.entity.render;

import me.creepinson.meepar.Meepar;
import me.creepinson.meepar.entity.EntityTurret;
import me.creepinson.meepar.entity.model.ModelTurret;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Created by theo on 7/28/17.
 */
public class RenderTurret extends RenderLiving<EntityTurret> {
    public static final ResourceLocation RES_TURRET = new ResourceLocation(Meepar.MOD_ID, "textures/entity/turret.png");

    public RenderTurret(RenderManager manager, ModelTurret modelTurret) {
        super(manager, modelTurret, 2.0f);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityTurret entity) {
        return RES_TURRET;
    }
}
