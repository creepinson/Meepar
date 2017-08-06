package me.creepinson.meepar.entity.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.ResourceLocation;

import javax.annotation.Nullable;

/**
 * Created by theo on 7/29/17.
 */
public class RenderCreepinoArmorStand extends RenderLivingBase<EntityArmorStand> {
    private ResourceLocation texture;

    public RenderCreepinoArmorStand(RenderManager manager, ModelBase model, ResourceLocation texture) {
        super(manager, model, 1.0f);
        this.texture = texture;
    }

    @Nullable
    @Override
    protected ResourceLocation getEntityTexture(EntityArmorStand entity) {
        return texture;
    }
}
