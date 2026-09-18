public abstract class gp2
{
    public static final hng a;
    public static final hng b;
    public static final hng c;
    public static final float d;
    public static final float e;
    public static final float f;
    
    static {
        a = new hng(24.0f, 8.0f, 24.0f, 8.0f);
        b = new hng(16.0f, 8.0f, 24.0f, 8.0f);
        c = new hng(12.0f, 8.0f, 12.0f, 8.0f);
        boolean b2 = false;
        final boolean b3 = 12.0f >= 0.0f;
        final boolean b4 = 8.0f >= 0.0f;
        final boolean b5 = 16.0f >= 0.0f;
        if (8.0f >= 0.0f) {
            b2 = true;
        }
        if (!(b3 & b4 & b5 & b2)) {
            eac.a("Padding must be non-negative");
        }
        d = 58.0f;
        e = 18.0f;
        f = 8.0f;
    }
    
    public static cp2 a(final long n, final long n2, long h, long h2, final gva gva, final int n3) {
        if ((n3 & 0x4) != 0x0) {
            h = j86.h;
        }
        if ((n3 & 0x8) != 0x0) {
            h2 = j86.h;
        }
        final r86 a = ((e8e)gva.j((sei)h8e.a)).a;
        cp2 w = a.W;
        if (w == null) {
            w = new cp2(s86.c(a, 25), s86.c(a, 9), j86.b(0.1f, s86.c(a, 17)), j86.b(0.38f, s86.c(a, 18)));
            a.W = w;
        }
        return w.a(n, n2, h, h2);
    }
    
    public static ip2 b(final int n) {
        float n2 = 0.0f;
        float n3;
        if ((n & 0x1) != 0x0) {
            n3 = 0.0f;
        }
        else {
            n3 = 2.0f;
        }
        if ((n & 0x2) == 0x0) {
            n2 = 1.0f;
        }
        return new ip2(n3, n2);
    }
    
    public static cp2 c(final r86 r86) {
        final cp2 x = r86.X;
        if (x == null) {
            final long g = j86.g;
            return r86.X = new cp2(g, s86.c(r86, 25), g, j86.b(0.38f, s86.c(r86, 18)));
        }
        return x;
    }
    
    public static float d() {
        if (kih.a.getValue()) {
            return 36.0f;
        }
        return 40.0f;
    }
    
    public static cp2 e(long h, final long n, long n2, final gva gva, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            h = j86.h;
        }
        final long h2 = j86.h;
        if ((n3 & 0x8) != 0x0) {
            n2 = h2;
        }
        return c(((e8e)gva.j((sei)h8e.a)).a).a(h, n, h2, n2);
    }
}
