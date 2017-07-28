package me.creepinson.meepar.entity.model;

// Cubik Studio 2.8.438 Beta JAVA exporter
// Designed by Creepinson with Cubik Studio - https://cubik.studio

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTurret extends ModelBase {

    //fields
    ModelRenderer e1;
    ModelRenderer e2;
    ModelRenderer e3;

    public ModelTurret()
    {
        textureWidth = 128;
        textureHeight = 64;

        e1 = new ModelRenderer(this, 64, 46);
        e1.addBox(7F, 16F, 7F, 2, 16, 2);
        e1.setRotationPoint(7F, 16F, 7F);
        e1.setTextureSize(128, 64);
        e1.mirror = false;
        setRotation(e1, 0F, 0F, 0F);
        e2 = new ModelRenderer(this, 0, 32);
        e2.addBox(0F, 0F, 0F, 16, 16, 16);
        e2.setRotationPoint(0F, 0F, 0F);
        e2.setTextureSize(128, 64);
        e2.mirror = false;
        setRotation(e2, 0F, 0F, 0F);
        e3 = new ModelRenderer(this, 0, 0);
        e3.addBox(0F, 32F, 0F, 16, 16, 16);
        e3.setRotationPoint(0F, 32F, 0F);
        e3.setTextureSize(128, 64);
        e3.mirror = false;
        setRotation(e3, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);

        this.e1.render(f5);
        this.e2.render(f5);
        this.e3.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}