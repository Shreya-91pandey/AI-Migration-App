public final class mzj implements kzj
{
    public static final mzj a;
    
    static {
        a = (mzj)new Object();
    }
    
    @Override
    public final igf a(final igf igf, final float n, final boolean b) {
        if (n <= 0.0) {
            eac.a("invalid weight; must be greater than zero");
        }
        float n2 = n;
        if (n > Float.MAX_VALUE) {
            n2 = Float.MAX_VALUE;
        }
        return igf.E((igf)new a2d(n2, b));
    }
    
    @Override
    public final igf b(final igf igf, final lb2 lb2) {
        return igf.E((igf)new g8p(lb2));
    }
    
    public final igf c(final igf igf) {
        return (igf)new d4q((hx)kx.a);
    }
}
