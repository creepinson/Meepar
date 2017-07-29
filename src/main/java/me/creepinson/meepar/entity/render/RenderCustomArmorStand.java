package me.creepinson.meepar.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Created by theo on 7/28/17.
 */
public class RenderCustomArmorStand extends RenderLivingBase<EntityArmorStand> {
    private ResourceLocation TEXTURE;


    public RenderCustomArmorStand(RenderManager rendermanagerIn, ModelBase customModel, ResourceLocation textureLocation, float shadowsizeIn) {
        super(rendermanagerIn, customModel, shadowsizeIn);
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityArmorStand entity) {
        return TEXTURE;
    }
}
