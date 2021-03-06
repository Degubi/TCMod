package degubi.teamcraft.entity.render;

import degubi.teamcraft.entity.*;
import degubi.teamcraft.entity.model.*;
import net.minecraft.client.renderer.entity.*;
import net.minecraft.util.*;
import net.minecraftforge.fml.relauncher.*;

@SideOnly(Side.CLIENT)
public final class RenderGoat extends RenderLiving<EntityGoat> {
    static final ResourceLocation[] textures = new ResourceLocation[]{ new ResourceLocation("tcm:textures/entity/goat1.png"),
                                                                       new ResourceLocation("tcm:textures/entity/goat3.png"),
                                                                       new ResourceLocation("tcm:textures/entity/goat2.png") };
    public RenderGoat(RenderManager ren) {
        super(ren, ModelGoat.INSTANCE, 0.5F);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityGoat entity) {
        return textures[entity.getGoatType()];
    }
}