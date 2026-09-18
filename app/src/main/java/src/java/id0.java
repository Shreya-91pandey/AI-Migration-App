public final class id0
{
    public final dlo a;
    public final Object b;
    public final dg0 c;
    public final ksg d;
    public final ksg e;
    public Object f;
    public Object g;
    public final znf h;
    public final ygm i;
    public final ig0 j;
    public final ig0 k;
    public ig0 l;
    public ig0 m;
    
    public id0(final Object o, final dlo a, final Object b) {
        this.a = a;
        this.b = b;
        final dg0 c = new dg0(a, o, null, 60);
        this.c = c;
        this.d = o50.Q(Boolean.FALSE);
        this.e = o50.Q(o);
        this.h = new znf();
        this.i = new ygm(3, b);
        final ig0 x = c.x;
        final boolean b2 = x instanceof eg0;
        ig0 ig0;
        if (b2) {
            ig0 = zn2.e;
        }
        else if (x instanceof fg0) {
            ig0 = zn2.f;
        }
        else if (x instanceof gg0) {
            ig0 = zn2.g;
        }
        else {
            ig0 = zn2.h;
        }
        this.j = ig0;
        ig0 ig2;
        if (b2) {
            ig2 = zn2.a;
        }
        else if (x instanceof fg0) {
            ig2 = zn2.b;
        }
        else if (x instanceof gg0) {
            ig2 = zn2.c;
        }
        else {
            ig2 = zn2.d;
        }
        this.k = ig2;
        this.l = ig0;
        this.m = ig2;
    }
    
    public static Object a(final id0 id0, final Float n, final v08 v08, final m6n m6n) {
        final Object e = id0.e();
        final dlo a = id0.a;
        return znf.a(id0.h, new gd0(id0, n, (xf0)new u08(v08, a, e, (ig0)a.a().b(n)), id0.c.y, null, null), m6n);
    }
    
    public static Object b(final id0 id0, Object o, cg0 i, lta lta, final f07 f07, final int n) {
        if ((n & 0x2) != 0x0) {
            i = id0.i;
        }
        final Object b = id0.a.b().b(id0.c.x);
        if ((n & 0x8) != 0x0) {
            lta = null;
        }
        final Object e = id0.e();
        final dlo a = id0.a;
        o = new jcn(i, a, e, o, (ig0)a.a().b(b));
        return znf.a(id0.h, new gd0(id0, b, (xf0)o, id0.c.y, lta, null), f07);
    }
    
    public final Object c(final Object o) {
        if (!mlc.q(this.l, this.j) || !mlc.q(this.m, this.k)) {
            final dlo a = this.a;
            final ig0 ig0 = (ig0)a.a().b(o);
            final int b = ig0.b();
            int i = 0;
            boolean b2 = false;
            while (i < b) {
                if (ig0.a(i) < this.l.a(i) || ig0.a(i) > this.m.a(i)) {
                    ig0.e(i, ncq.n(ig0.a(i), this.l.a(i), this.m.a(i)));
                    b2 = true;
                }
                ++i;
            }
            if (b2) {
                return a.b().b(ig0);
            }
        }
        return o;
    }
    
    public final void d() {
        final dg0 c = this.c;
        c.x.d();
        c.y = Long.MIN_VALUE;
        this.d.setValue((Object)Boolean.FALSE);
    }
    
    public final Object e() {
        return this.c.w.getValue();
    }
    
    public final boolean f() {
        return (boolean)this.d.getValue();
    }
    
    public final Object g(final f07 f07, final Object o) {
        final Object a = znf.a(this.h, new e80(this, o, null, (byte)2), f07);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public final Object h(final m6n m6n) {
        final Object a = znf.a(this.h, (lta)new hd0((byte)0, (f07)null, (Object)this), m6n);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public final void i(final Float f, final Float g) {
        final dlo a = this.a;
        ig0 j;
        if (f == null || (j = (ig0)a.a().b(f)) == null) {
            j = this.j;
        }
        ig0 k;
        if (g == null || (k = (ig0)a.a().b(g)) == null) {
            k = this.k;
        }
        for (int b = j.b(), i = 0; i < b; ++i) {
            if (j.a(i) > k.a(i)) {
                final StringBuilder sb = new StringBuilder("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: ");
                sb.append((Object)j);
                sb.append(" is greater than upper bound ");
                sb.append((Object)k);
                sb.append(" on index ");
                sb.append(i);
                rih.b(sb.toString());
            }
        }
        this.l = j;
        this.m = k;
        this.g = g;
        this.f = f;
        if (!this.f()) {
            final Object c = this.c(this.e());
            if (!mlc.q(c, this.e())) {
                this.c.w.setValue(c);
            }
        }
    }
}
