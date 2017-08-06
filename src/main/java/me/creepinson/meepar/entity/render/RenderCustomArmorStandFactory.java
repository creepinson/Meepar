package me.creepinson.meepar.entity.render;

import me.creepinson.meepar.Meepar;
import me.creepinson.meepar.entity.model.ModelCreepino;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by theo on 7/28/17.
 */
public class RenderCustomArmorStandFactory implements IRenderFactory<EntityArmorStand> {
    public RenderCreepinoArmorStand stand = new RenderCreepinoArmorStand(Minecraft.getMinecraft().getRenderManager(), new ModelCreepino(), new ResourceLocation(Meepar.MOD_ID, "textures/entity/creepino.png"));
    public static final RenderCustomArmorStandFactory INSTANCE = new RenderCustomArmorStandFactory();

    @Override
    public Render<? super EntityArmorStand> createRenderFor(RenderManager manager) {
        // TODO Auto-generated method stub
        return stand;
    }

}

