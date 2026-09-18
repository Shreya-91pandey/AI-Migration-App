public final class dln
{
    public qzc a;
    public xc8 b;
    public tna c;
    public mnn d;
    public Object e;
    public final ksg f;
    public long g;
    
    public dln(final qzc a, final xc8 b, final tna c, final mnn d, final Object e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = o50.Q((Object)Boolean.TRUE);
        this.g = 0L;
    }
    
    public static void a(final dln dln, qzc a, xc8 b, mnn d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = dln.a;
        }
        if ((n & 0x2) != 0x0) {
            b = dln.b;
        }
        final tna c = dln.c;
        if ((n & 0x8) != 0x0) {
            d = dln.d;
        }
        final Object e = dln.e;
        final qzc a2 = dln.a;
        final ksg f = dln.f;
        if (a == a2 && mlc.q((Object)b, (Object)dln.b) && mlc.q((Object)c, (Object)dln.c) && mlc.q((Object)d, (Object)dln.d)) {
            if (!mlc.q(e, dln.e)) {
                dln.e = e;
                f.setValue((Object)Boolean.TRUE);
            }
            return;
        }
        dln.a = a;
        dln.b = b;
        dln.c = c;
        dln.d = d;
        f.setValue((Object)Boolean.TRUE);
    }
}
