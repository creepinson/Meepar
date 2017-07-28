package me.creepinson.meepar.entity.render;

import me.creepinson.meepar.entity.EntityTurret;
import me.creepinson.meepar.entity.model.ModelTurret;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by theo on 7/28/17.
 */
public class RenderTurretFactory implements IRenderFactory<EntityTurret> {

    public static final RenderTurretFactory INSTANCE = new RenderTurretFactory();

    @Override
    public Render<? super EntityTurret> createRenderFor(RenderManager manager) {
        // TODO Auto-generated method stub
        return new RenderTurret(manager, new ModelTurret());
    }

}

