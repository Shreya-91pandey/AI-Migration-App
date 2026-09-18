public abstract class n8h implements xc8
{
    public boolean v;
    
    public static void h(final n8h n8h, final o8h o8h, final long n) {
        n8h.e(o8h);
        o8h.a0(ugc.d(n, o8h.z), 0.0f, null);
    }
    
    public static void j(final n8h n8h, final o8h o8h, int n, int v) {
        final long n2 = (long)n << 32 | ((long)v & 0xFFFFFFFFL);
        if (n8h.c() != qzc.v && n8h.d() != 0) {
            final int d = n8h.d();
            v = o8h.v;
            final int n3 = (int)(n2 >> 32);
            n = (int)(n2 & 0xFFFFFFFFL);
            final long n4 = d - v - n3;
            final long n5 = n;
            n8h.e(o8h);
            o8h.a0(ugc.d(n4 << 32 | (n5 & 0xFFFFFFFFL), o8h.z), 0.0f, null);
            return;
        }
        n8h.e(o8h);
        o8h.a0(ugc.d(n2, o8h.z), 0.0f, null);
    }
    
    public static void k(final n8h n8h, final o8h o8h, int d, int n, lta a, int n2) {
        if ((n2 & 0x8) != 0x0) {
            a = (lta)p8h.a;
        }
        final long n3 = (long)d << 32 | ((long)n & 0xFFFFFFFFL);
        if (n8h.c() != qzc.v && n8h.d() != 0) {
            d = n8h.d();
            final int v = o8h.v;
            n2 = (int)(n3 >> 32);
            n = (int)(n3 & 0xFFFFFFFFL);
            final long n4 = d - v - n2;
            final long n5 = n;
            n8h.e(o8h);
            o8h.a0(ugc.d(n4 << 32 | (n5 & 0xFFFFFFFFL), o8h.z), 0.0f, a);
            return;
        }
        n8h.e(o8h);
        o8h.a0(ugc.d(n3, o8h.z), 0.0f, a);
    }
    
    public static void n(final n8h n8h, final o8h o8h, long n) {
        final kmg a = p8h.a;
        if (n8h.c() != qzc.v && n8h.d() != 0) {
            final int d = n8h.d();
            final int v = o8h.v;
            final int n2 = (int)(n >> 32);
            final int n3 = (int)(n & 0xFFFFFFFFL);
            n = d - v - n2;
            final long n4 = n3;
            n8h.e(o8h);
            o8h.a0(ugc.d((n4 & 0xFFFFFFFFL) | n << 32, o8h.z), 0.0f, (lta)a);
            return;
        }
        n8h.e(o8h);
        o8h.a0(ugc.d(n, o8h.z), 0.0f, (lta)a);
    }
    
    public static void o(final n8h n8h, final o8h o8h, final int n, final int n2, lta a, final int n3) {
        if ((n3 & 0x8) != 0x0) {
            a = (lta)p8h.a;
        }
        final long n4 = n;
        final long n5 = n2;
        n8h.e(o8h);
        o8h.a0(ugc.d((n5 & 0xFFFFFFFFL) | n4 << 32, o8h.z), 0.0f, a);
    }
    
    public static void p(final n8h n8h, final o8h o8h, final long n, qd0 a, final int n2) {
        if ((n2 & 0x4) != 0x0) {
            a = (qd0)p8h.a;
        }
        n8h.e(o8h);
        o8h.a0(ugc.d(n, o8h.z), 0.0f, (lta)a);
    }
    
    public float a(final wlb wlb) {
        return Float.NaN;
    }
    
    public abstract nzc b();
    
    public abstract qzc c();
    
    public abstract int d();
    
    public final void e(final o8h o8h) {
        if (o8h instanceof whf) {
            ((whf)o8h).E(this.v);
        }
    }
    
    public final void f(final o8h o8h, final int n, final int n2, final float n3) {
        final long n4 = n;
        final long n5 = n2;
        this.e(o8h);
        o8h.a0(ugc.d((n5 & 0xFFFFFFFFL) | n4 << 32, o8h.z), n3, null);
    }
}
