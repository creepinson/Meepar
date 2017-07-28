package me.creepinson.meepar.entity.render;

import me.creepinson.meepar.entity.EntityArrowCustom;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.fml.client.registry.IRenderFactory;

/**
 * Created by theo on 7/28/17.
 */
public class RenderArrowCustomFactory implements IRenderFactory<EntityArrowCustom> {

    public static final RenderArrowCustomFactory INSTANCE = new RenderArrowCustomFactory();

    @Override
    public Render<? super EntityArrowCustom> createRenderFor(RenderManager manager) {
        // TODO Auto-generated method stub
        return new RenderArrowCustom(manager);
    }

}

