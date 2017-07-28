package me.creepinson.meepar.entity.render;

import me.creepinson.meepar.entity.EntityArrowCustom;
import net.minecraft.client.renderer.entity.RenderArrow;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderArrowCustom extends RenderArrow<EntityArrowCustom> {
    public static final ResourceLocation RES_ARROW = new ResourceLocation("textures/entity/projectiles/arrow.png");

    public RenderArrowCustom(RenderManager renderManagerIn) {
        super(renderManagerIn);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityArrowCustom entity) {
        return RES_ARROW;
    }
}