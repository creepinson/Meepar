package me.creepinson.meepar.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Created by theo on 7/28/17.
 */
public class ModelCreepino extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Leg;
    public ModelRenderer Head;

    public ModelCreepino() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Leg = new ModelRenderer(this, 39, 44);
        this.Leg.setRotationPoint(-2.0F, 9.0F, -2.0F);
        this.Leg.addBox(0.0F, 0.0F, 0.0F, 4, 15, 4, 0.0F);
        this.Body = new ModelRenderer(this, 92, 0);
        this.Body.setRotationPoint(-4.0F, -5.2F, -4.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 8, 14, 8, 0.0F);
        this.Head = new ModelRenderer(this, 0, 8);
        this.Head.setRotationPoint(-3.0F, -11.2F, -3.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(Head, 0.0F, -0.03717551306747922F, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Leg.render(f5);
        this.Body.render(f5);
        this.Head.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model
     * parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
                                  float headPitch, float scaleFactor, Entity entityIn) {
        this.Head.rotateAngleX = headPitch / (180F / (float) Math.PI);
        this.Leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.2F * limbSwingAmount;
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor,
                entityIn);
    }
}