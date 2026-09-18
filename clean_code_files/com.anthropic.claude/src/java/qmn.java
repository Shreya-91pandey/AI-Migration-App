public final class qmn
{
    public final ajn a;
    public zta b;
    public final ajn c;
    public final ksg d;
    public final ksg e;
    public final ksg f;
    public final ksg g;
    public final rl2 h;
    
    public qmn() {
        final ajn ajn = new ajn();
        this.a = ajn;
        this.c = ajn;
        final cib a = cib.A;
        this.d = new ksg((Object)null, (q8m)a);
        this.e = new ksg((Object)null, (q8m)a);
        this.f = new ksg((Object)null, (q8m)a);
        this.g = o50.Q((Object)new qs8(0.0f));
        this.h = new rl2();
    }
    
    public final long a(final long n) {
        final nzc e = this.e();
        k2j k2j2;
        final k2j k2j = k2j2 = k2j.e;
        if (e != null) {
            if (e.p()) {
                final nzc b = this.b();
                if (b != null) {
                    k2j2 = b.L(e, true);
                }
                else {
                    k2j2 = null;
                }
            }
            else {
                k2j2 = k2j;
            }
            if (k2j2 == null) {
                k2j2 = k2j;
            }
        }
        return fkq.f(n, k2j2);
    }
    
    public final nzc b() {
        return (nzc)this.f.getValue();
    }
    
    public final omn c() {
        return (omn)this.c.getValue();
    }
    
    public final int d(long k, final boolean b) {
        final omn c = this.c();
        if (c == null) {
            return -1;
        }
        long a = k;
        if (b) {
            a = this.a(k);
        }
        k = fkq.k(this, a);
        return c.b.g(k);
    }
    
    public final nzc e() {
        return (nzc)this.d.getValue();
    }
    
    public final boolean f(long k) {
        final omn c = this.c();
        if (c != null) {
            k = fkq.k(this, this.a(k));
            final int e = c.b.e(Float.intBitsToFloat((int)(0xFFFFFFFFL & k)));
            final int n = (int)(k >> 32);
            if (Float.intBitsToFloat(n) >= c.g(e) && Float.intBitsToFloat(n) <= c.h(e)) {
                return true;
            }
        }
        return false;
    }
}
