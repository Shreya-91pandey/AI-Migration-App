public abstract class p2q
{
    public static final jlf a;
    public static final n2q[] b;
    
    static {
        final jlf a2 = new jlf(8);
        n2q.a.getClass();
        final o2q g = m2q.g;
        a2.i(1, (Object)g);
        final o2q f = m2q.f;
        a2.i(2, (Object)f);
        final o2q b2 = m2q.b;
        a2.i(4, (Object)b2);
        final o2q d = m2q.d;
        a2.i(8, (Object)d);
        final o2q h = m2q.h;
        a2.i(16, (Object)h);
        final o2q e = m2q.e;
        a2.i(32, (Object)e);
        final o2q i = m2q.i;
        a2.i(64, (Object)i);
        final o2q c = m2q.c;
        a2.i(128, (Object)c);
        a = a2;
        b = new n2q[] { g, f, b2, i, h, e, d, m2q.j, c };
    }
    
    public static final void a(final uxd uxd, final mcc mcc, final long n, final int n2, final int n3) {
        if (!ncq.w(n, -1L)) {
            final float n4 = (float)(int)(n >>> 48 & 0xFFFFL);
            final float n5 = (float)(int)(n >>> 32 & 0xFFFFL);
            final float n6 = (float)(n2 - (int)(n >>> 16 & 0xFFFFL));
            final float n7 = (float)(n3 - (int)(n & 0xFFFFL));
            uxd.a(mcc.b, n4);
            uxd.a(mcc.c, n5);
            uxd.a(mcc.d, n6);
            uxd.a(mcc.e, n7);
        }
    }
}
