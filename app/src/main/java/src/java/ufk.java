public final class ufk implements mgk
{
    public static final n9k k;
    public final hsg a;
    public final hsg b;
    public final hsg c;
    public final ksg d;
    public final llf e;
    public final hsg f;
    public float g;
    public final r68 h;
    public final sd8 i;
    public final sd8 j;
    
    static {
        k = new n9k((lta)new p9k((byte)17), (zta)new o9k((byte)20));
    }
    
    public ufk(final int n) {
        this.a = new hsg(n);
        this.b = new hsg(0);
        this.c = new hsg(0);
        this.d = o50.Q(Boolean.FALSE);
        this.e = new llf();
        this.f = new hsg(Integer.MAX_VALUE);
        this.h = new r68((lta)new e0j((Object)this, (byte)4));
        this.i = r8m.b((jta)new hz3(this, (byte)1));
        this.j = r8m.b((jta)new hz3(this, (byte)2));
    }
    
    public static Object g(final ufk ufk, final int n, final m6n m6n) {
        final Object k = soh.k(ufk, (float)(n - ufk.a.h()), new ygm(7, null), m6n);
        if (k == pc7.v) {
            return k;
        }
        return lqo.a;
    }
    
    @Override
    public final boolean a() {
        return this.h.a();
    }
    
    @Override
    public final Object b(final lnf lnf, final zta zta, final f07 f07) {
        final Object b = this.h.b(lnf, zta, f07);
        if (b == pc7.v) {
            return b;
        }
        return lqo.a;
    }
    
    @Override
    public final boolean c() {
        return (boolean)this.j.getValue();
    }
    
    @Override
    public final boolean d() {
        return (boolean)this.i.getValue();
    }
    
    @Override
    public final float e(final float n) {
        return this.h.e(n);
    }
    
    @Override
    public final boolean f() {
        return this.h.f();
    }
    
    public final void h(final int n) {
        final hsg a = this.a;
        this.f.i(n);
        final r7m a2 = q7m.a();
        lta e;
        if (a2 != null) {
            e = a2.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a2);
        Label_0069: {
            try {
                if (a.h() > n) {
                    a.i(n);
                }
            }
            finally {
                break Label_0069;
            }
            q7m.d(a2, b, e);
            return;
        }
        q7m.d(a2, b, e);
    }
}
