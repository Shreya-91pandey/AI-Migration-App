public abstract class yao
{
    public static final hng a;
    public static final float b;
    public static final float c;
    public static final float d;
    
    static {
        a = new hng(0.0f, 0.0f, 0.0f, 0.0f);
        b = 64.0f;
        c = 64.0f;
        d = 112.0f;
    }
    
    public static hv9 a(cbo g, final gva gva, final int n) {
        if ((n & 0x1) != 0x0) {
            g = wk0.g(gva);
        }
        final Object r = gva.R();
        final cib a = bi6.a;
        Object o;
        if ((o = r) == a) {
            o = new g4o((byte)25);
            gva.q0(o);
        }
        final jta jta = (jta)o;
        final ygm x = zrn.X(3, gva);
        final v08 a2 = fgm.a(gva);
        final boolean f = gva.f((Object)g);
        final boolean f2 = gva.f((Object)jta);
        final boolean f3 = gva.f((Object)x);
        final boolean f4 = gva.f((Object)a2);
        final Object r2 = gva.R();
        hv9 hv9;
        if ((f | f2 | f3 | f4) || (hv9 = (hv9)r2) == a) {
            hv9 = new hv9(g, x, a2, jta);
            gva.q0((Object)hv9);
        }
        return hv9;
    }
    
    public static xao b(final r86 r86) {
        final xao b0 = r86.b0;
        if (b0 == null) {
            return r86.b0 = new xao(s86.c(r86, 34), s86.c(r86, 36), s86.c(r86, 17), s86.c(r86, 17), s86.c(r86, 18), s86.c(r86, 18));
        }
        return b0;
    }
    
    public static wbd c(final gva gva) {
        return new wbd(c5q.B(gva), xp7.q | 0x10);
    }
    
    public static xao d(final long n, long h, long h2, long h3, long h4, final gva gva, final int n2) {
        if ((n2 & 0x2) != 0x0) {
            h = j86.h;
        }
        if ((n2 & 0x4) != 0x0) {
            h2 = j86.h;
        }
        if ((n2 & 0x8) != 0x0) {
            h3 = j86.h;
        }
        if ((n2 & 0x10) != 0x0) {
            h4 = j86.h;
        }
        return b(((e8e)gva.j((sei)h8e.a)).a).a(n, h, h2, h3, h4, j86.h);
    }
}
