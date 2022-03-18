package hub.guzio.Kraken.entity.BabyGlowsquid;

import hub.guzio.Kraken.entity.BabySquid.BrokenSquidRenderer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.SquidEntityModel;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

@Environment(EnvType.CLIENT)
public class BrokenGlowsquidRenderer extends BrokenSquidRenderer<BabyGlowsquidEntity> {
    private static final Identifier TEXTURE = new Identifier("textures/entity/squid/glow_squid.png");

    public BrokenGlowsquidRenderer(EntityRendererFactory.Context context, SquidEntityModel<BabyGlowsquidEntity> squidEntityModel) {
        super(context, squidEntityModel);
    }

    @Override
    public Identifier getTexture(BabyGlowsquidEntity BabyGlowsquidEntity) {
        return TEXTURE;
    }

    @Override
    protected int getBlockLight(BabyGlowsquidEntity BabyGlowsquidEntity, BlockPos blockPos) {
        int i = (int)MathHelper.clampedLerp(0.0f, 15.0f, 1.0f - (float)BabyGlowsquidEntity.getDarkTicksRemaining() / 10.0f);
        if (i == 15) {
            return 15;
        }
        return Math.max(i, super.getBlockLight(BabyGlowsquidEntity, blockPos));
    }
}