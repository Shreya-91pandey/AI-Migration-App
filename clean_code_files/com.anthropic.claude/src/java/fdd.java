public final class fdd
{
    public static final float b;
    public static final float c;
    public static final float d;
    public final float a = a;
    
    static {
        a(0.0f);
        a(0.5f);
        b = 0.5f;
        a(-1.0f);
        c = -1.0f;
        a(1.0f);
        d = 1.0f;
    }
    
    public static void a(final float n) {
        if (0.0f > n || n > 1.0f) {
            if (n != -1.0f) {
                hac.c("topRatio should be in [0..1] range or -1");
            }
        }
    }
    
    public static String b(final float n) {
        if (n == 0.0f) {
            return "LineHeightStyle.Alignment.Top";
        }
        if (n == fdd.b) {
            return "LineHeightStyle.Alignment.Center";
        }
        if (n == fdd.c) {
            return "LineHeightStyle.Alignment.Proportional";
        }
        if (n == fdd.d) {
            return "LineHeightStyle.Alignment.Bottom";
        }
        return tj0.j("LineHeightStyle.Alignment(topPercentage = ", n, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof fdd) {
            if (Float.compare(this.a, ((fdd)o).a) == 0) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return b(this.a);
    }
}
