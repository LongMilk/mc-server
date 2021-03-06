package net.minecraft.server;

import java.util.Optional;

class ExplosionDamageCalculatorEntity implements ExplosionDamageCalculator {

    private final Entity a;

    ExplosionDamageCalculatorEntity(Entity entity) {
        this.a = entity;
    }

    @Override
    public Optional<Float> a(Explosion explosion, IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata, Fluid fluid) {
        return ExplosionDamageCalculatorBlock.INSTANCE.a(explosion, iblockaccess, blockposition, iblockdata, fluid).map((ofloat) -> {
            return this.a.a(explosion, iblockaccess, blockposition, iblockdata, fluid, ofloat);
        });
    }

    @Override
    public boolean a(Explosion explosion, IBlockAccess iblockaccess, BlockPosition blockposition, IBlockData iblockdata, float f) {
        return this.a.a(explosion, iblockaccess, blockposition, iblockdata, f);
    }
}
