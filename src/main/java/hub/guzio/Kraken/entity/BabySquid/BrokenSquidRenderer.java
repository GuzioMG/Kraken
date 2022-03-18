package hub.guzio.Kraken.entity.BabySquid;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.SquidEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3f;

@Environment(EnvType.CLIENT)
public class BrokenSquidRenderer<T extends SquidEntity>
extends MobEntityRenderer<T, SquidEntityModel<T>> {
    private static final Identifier TEXTURE = new Identifier("textures/entity/squid/squid.png");

    public BrokenSquidRenderer(EntityRendererFactory.Context ctx, SquidEntityModel<T> model) {
        super(ctx, model, 0.7f);
    }

    @Override
    public Identifier getTexture(T squidEntity) {
        return TEXTURE;
    }

    @Override
    protected void setupTransforms(T squidEntity, MatrixStack matrixStack, float f, float g, float h) {
        float i = MathHelper.lerp(h, ((BabySquidEntity)squidEntity).prevTiltAngle, ((BabySquidEntity)squidEntity).tiltAngle);
        float j = MathHelper.lerp(h, ((BabySquidEntity)squidEntity).prevRollAngle, ((BabySquidEntity)squidEntity).rollAngle);
        matrixStack.translate(0.0, 0.5, 0.0);
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(180.0f - g));
        matrixStack.multiply(Vec3f.POSITIVE_X.getDegreesQuaternion(i));
        matrixStack.multiply(Vec3f.POSITIVE_Y.getDegreesQuaternion(j));
        matrixStack.translate(0.0, -1.2f, 0.0);
    }

    @Override
    protected float getAnimationProgress(T squidEntity, float f) {
        return MathHelper.lerp(f, ((BabySquidEntity)squidEntity).prevTentacleAngle, ((BabySquidEntity)squidEntity).tentacleAngle);
    }
}

