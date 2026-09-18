public final class nx8
{
    public final lta a;
    public final m30 b;
    public final ksg c;
    public bfa d;
    public bfa e;
    
    public nx8(final yx8 yx8, final lta a) {
        this.a = a;
        final alo a2 = arf.a;
        final v08 c = r20.c;
        final yp7 b = new yp7((byte)23);
        final h87 c2 = new h87((Object)this, (byte)6);
        final m30 b2 = new m30(a, (Object)yx8);
        b2.b = (lta)b;
        b2.c = (jta)c2;
        b2.d = (cg0)a2;
        b2.e = c;
        this.b = b2;
        this.c = o50.Q((Object)null);
        this.d = (bfa)ri2.z0();
        this.e = (bfa)ri2.z0();
    }
    
    public static Object a(final nx8 nx8, final yx8 yx8, final cg0 cg0, final m6n m6n) {
        final Object a = nx8.b.a((Object)yx8, lnf.v, (cua)new mx8(nx8, nx8.b.k.h(), cg0, (f07)null), (h07)m6n);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public final Object b(final m6n m6n) {
        final Object a = a(this, yx8.v, (cg0)this.e, m6n);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public final boolean c() {
        return this.b.h.getValue() == yx8.w;
    }
}
