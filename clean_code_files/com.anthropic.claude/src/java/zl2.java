public final class zl2 implements yl2
{
    @Override
    public final float a(final float n, float n2, final float n3) {
        final float abs = Math.abs(n2 + n - n);
        final boolean b = abs <= n3;
        final float n4 = n2 = 0.3f * n3 - 0.0f * abs;
        if (b) {
            n2 = n4;
            if (n3 - n4 < abs) {
                n2 = n3 - abs;
            }
        }
        return n - n2;
    }
}
