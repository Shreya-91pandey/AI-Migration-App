public final class yin
{
    public static final o55 g;
    public final ooe a;
    public final qzc b;
    public final tna c;
    public final long d;
    public final float e;
    public final float f;
    
    static {
        g = new o55((byte)26);
    }
    
    public yin(final ooe a, final qzc b, final tna c, final long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = a.getDensity();
        this.f = a.o0();
    }
    
    @Override
    public final String toString() {
        final String m = gv6.m(this.d);
        final StringBuilder sb = new StringBuilder("MeasureInputs(density=");
        sb.append((Object)this.a);
        sb.append(", densityValue=");
        sb.append(this.e);
        sb.append(", fontScale=");
        sb.append(this.f);
        sb.append(", layoutDirection=");
        sb.append((Object)this.b);
        sb.append(", fontFamilyResolver=");
        sb.append((Object)this.c);
        sb.append(", constraints=");
        sb.append(m);
        sb.append(")");
        return sb.toString();
    }
}
