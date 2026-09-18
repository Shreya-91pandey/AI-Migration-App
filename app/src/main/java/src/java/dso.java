public final class dso extends fso
{
    @Override
    public final boolean a(final long n, final Object o) {
        if (kso.g) {
            return kso.e(n, o);
        }
        return (byte)(kso.f(0xFFFFFFFFFFFFFFFCL & n, o) >>> (int)((n & 0x3L) << 3) & 0xFF) != 0;
    }
    
    @Override
    public final double c(final long n, final Object o) {
        return Double.longBitsToDouble(super.b.getLong(o, n));
    }
    
    @Override
    public final float d(final long n, final Object o) {
        return Float.intBitsToFloat(super.b.getInt(o, n));
    }
    
    @Override
    public final void e(final Object o, final long n, final boolean b) {
        if (kso.g) {
            kso.k(n, o, (byte)(b ? 1 : 0));
            return;
        }
        kso.l(n, o, (byte)(b ? 1 : 0));
    }
    
    @Override
    public final void g(final Object o, final long n, final double n2) {
        super.b.putLong(o, n, Double.doubleToLongBits(n2));
    }
    
    @Override
    public final void h(final Object o, final long n, final float n2) {
        super.b.putInt(o, n, Float.floatToIntBits(n2));
    }
    
    @Override
    public final boolean j() {
        return false;
    }
}
