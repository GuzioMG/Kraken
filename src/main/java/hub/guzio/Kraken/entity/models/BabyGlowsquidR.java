package hub.guzio.Kraken.entity.models;

import hub.guzio.Kraken.entity.BabyGlowsquid;
import hub.guzio.Kraken.launch.Main;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class BabyGlowsquidR extends MobEntityRenderer<BabyGlowsquid, ModelBase> {
 
    public static final EntityModelLayer model = new EntityModelLayer(BabyGlowsquid.ID, "main");

    public BabyGlowsquidR(EntityRendererFactory.Context context) {
        super(context, new ModelBase(context.getPart(model), 0.5f);
    }
 
    @Override
    public Identifier getTexture(BabyGlowsquid entity) {
        return new Identifier(Main.ID, "textures/entity/cube/cube.png");
    }

    @Override
    protected int getBlockLight(BabyGlowsquid entity, BlockPos blockPos) {
        int i = (int)MathHelper.clampedLerp(0.0f, 15.0f, 1.0f - (float)entity.getDarkTicksRemaining() / 10.0f);
        if (i == 15) {
            return 15;
        }
        return Math.max(i, super.getBlockLight(entity, blockPos));
    }

}