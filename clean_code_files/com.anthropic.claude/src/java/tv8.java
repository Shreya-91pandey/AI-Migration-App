public abstract class tv8
{
    public static final nv8 a;
    public static final nv8 b;
    
    static {
        a = new nv8(3, null, (byte)0);
        b = new nv8(3, null, (byte)1);
    }
    
    public static igf a(final igf igf, final vv8 vv8, final zhg zhg, boolean b, llf llf, boolean b2, bua a, final bua bua, boolean b3, final int n) {
        if ((n & 0x4) != 0x0) {
            b = true;
        }
        if ((n & 0x8) != 0x0) {
            llf = null;
        }
        if ((n & 0x10) != 0x0) {
            b2 = false;
        }
        if ((n & 0x20) != 0x0) {
            a = (bua)tv8.a;
        }
        if ((n & 0x80) != 0x0) {
            b3 = false;
        }
        return igf.E((igf)new lv8(vv8, zhg, b, llf, b2, a, bua, b3));
    }
    
    public static final vv8 b(final lta lta, final gva gva, final int n) {
        final bnf w = o50.W((Object)lta, gva);
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = new d48(new tt6(w, (byte)17));
            gva.q0(r);
        }
        return (vv8)r;
    }
    
    public static final long c(final long n) {
        final boolean naN = Float.isNaN(f7p.d(n));
        float e = 0.0f;
        float d;
        if (naN) {
            d = 0.0f;
        }
        else {
            d = f7p.d(n);
        }
        if (!Float.isNaN(f7p.e(n))) {
            e = f7p.e(n);
        }
        return iar.g(d, e);
    }
}
