public final class x96
{
    public static final x96 a;
    
    static {
        a = (x96)new Object();
    }
    
    public final igf a(final igf igf, final kb2 kb2) {
        return igf.E((igf)new mlb(kb2));
    }
    
    public final igf b(final igf igf, final float n, final boolean b) {
        if (n <= 0.0) {
            eac.a("invalid weight; must be greater than zero");
        }
        float n2 = n;
        if (n > Float.MAX_VALUE) {
            n2 = Float.MAX_VALUE;
        }
        return igf.E((igf)new a2d(n2, b));
    }
}
