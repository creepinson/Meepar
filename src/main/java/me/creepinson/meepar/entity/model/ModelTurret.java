package me.creepinson.meepar.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelTurret - Creepinson
 * Created using Tabula 5.1.0
 */
public class ModelTurret extends ModelBase {
    public ModelRenderer top;
    public ModelRenderer stand;
    public ModelRenderer base;

    public ModelTurret() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.top = new ModelRenderer(this, 1, 1);
        this.top.setRotationPoint(-9.4F, -23.5F, 0.0F);
        this.top.addBox(0.1F, 0.0F, -6.0F, 16, 16, 16, 0.0F);
        this.base = new ModelRenderer(this, 60, 88);
        this.base.setRotationPoint(-9.2F, 7.5F, -1.5F);
        this.base.addBox(0.0F, 0.0F, -6.0F, 16, 16, 16, 0.0F);
        this.stand = new ModelRenderer(this, 1, 63);
        this.stand.mirror = true;
        this.stand.setRotationPoint(-3.5F, -7.5F, 5.5F);
        this.stand.addBox(0.0F, 0.0F, -6.0F, 4, 16, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.top.render(f5);
        this.base.render(f5);
        this.stand.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
