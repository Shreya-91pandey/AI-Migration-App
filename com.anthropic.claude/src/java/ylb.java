public final class ylb implements aql
{
    public static final ylb b;
    public static final ylb c;
    public final byte a;
    
    @Override
    public final k8e a(final long n, final qzc qzc, final xc8 xc8) {
        switch (this.a) {
            default: {
                return (k8e)new rig(rml.f(0L, n));
            }
            case 1: {
                final float n2 = (float)xc8.L0(30.0f);
                return (k8e)new rig(new k2j(-n2, 0.0f, Float.intBitsToFloat((int)(n >> 32)) + n2, Float.intBitsToFloat((int)(n & 0xFFFFFFFFL))));
            }
            case 0: {
                final float n3 = (float)xc8.L0(30.0f);
                return (k8e)new rig(new k2j(0.0f, -n3, Float.intBitsToFloat((int)(n >> 32)), Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) + n3));
            }
        }
    }
    
    @Override
    public String toString() {
        switch (this.a) {
            default: {
                return super.toString();
            }
            case 2: {
                return "RectangleShape";
            }
        }
    }
}
