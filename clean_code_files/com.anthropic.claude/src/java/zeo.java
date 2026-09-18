public final class zeo implements xom
{
    public jcn A;
    public final ksg B;
    public final gsg C;
    public boolean D;
    public final ksg E;
    public ig0 F;
    public final isg G;
    public boolean H;
    public final ygm I;
    public final efo J;
    public final dlo v;
    public final ksg w;
    public final ksg x;
    public final ksg y;
    public tmk z;
    
    public zeo(final efo j, final Object o, final ig0 f, final dlo v) {
        this.J = j;
        this.v = v;
        final ksg q = o50.Q(o);
        this.w = q;
        Object b = null;
        final ksg q2 = o50.Q(ri2.A0(0.0f, 0.0f, null, 7));
        this.x = q2;
        this.y = o50.Q(new jcn((cg0)q2.getValue(), v, o, q.getValue(), f));
        this.B = o50.Q(Boolean.TRUE);
        this.C = new gsg(-1.0f);
        this.E = o50.Q(o);
        this.F = f;
        this.G = new isg(this.a().b());
        final Float n = (Float)eep.b.get((Object)v);
        if (n != null) {
            final float floatValue = ((Number)n).floatValue();
            final ig0 ig0 = (ig0)v.a().b(o);
            for (int b2 = ig0.b(), i = 0; i < b2; ++i) {
                ig0.e(i, floatValue);
            }
            b = this.v.b().b(ig0);
        }
        this.I = ri2.A0(0.0f, 0.0f, b, 3);
    }
    
    public final jcn a() {
        return (jcn)this.y.getValue();
    }
    
    public final void d(final long n) {
        if (this.C.h() == -1.0f) {
            this.H = true;
            if (mlc.q(this.a().c, this.a().d)) {
                this.e(this.a().c);
                return;
            }
            this.e(this.a().f(n));
            this.F = this.a().d(n);
        }
    }
    
    public final void e(final Object value) {
        this.E.setValue(value);
    }
    
    public final void f(final Object o, final boolean b) {
        final jcn a = this.A;
        Object c;
        if (a != null) {
            c = a.c;
        }
        else {
            c = null;
        }
        final ksg w = this.w;
        final boolean q = mlc.q(c, w.getValue());
        final isg g = this.G;
        final ksg y = this.y;
        Object i = this.I;
        if (q) {
            y.setValue((Object)new jcn((cg0)i, this.v, o, o, this.F.c()));
            this.D = true;
            g.i(this.a().b());
            return;
        }
        final ksg x = this.x;
        if (b && !this.H) {
            if (((bfa)x.getValue()) instanceof ygm) {
                i = x.getValue();
            }
        }
        else {
            i = x.getValue();
        }
        final efo j = this.J;
        if (j.e() > 0L) {
            i = new xnm((bfa)i, j.e());
        }
        y.setValue((Object)new jcn((cg0)i, this.v, o, w.getValue(), this.F));
        g.i(this.a().b());
        this.D = false;
        j.p(true);
        if (j.h()) {
            final v8m k = j.j;
            for (int size = k.size(), l = 0; l < size; ++l) {
                final zeo zeo = (zeo)k.get(l);
                zeo.G.h();
                zeo.d(0L);
            }
            j.p(false);
        }
    }
    
    public final void g(final Object o, final Object value, final bfa value2) {
        this.w.setValue(value);
        this.x.setValue((Object)value2);
        if (mlc.q(this.a().d, o) && mlc.q(this.a().c, value)) {
            return;
        }
        this.f(o, false);
    }
    
    @Override
    public final Object getValue() {
        return this.E.getValue();
    }
    
    public final void h(final Object value, final bfa value2, final Object o, final ig0 f) {
        if (this.D) {
            final jcn a = this.A;
            Object c;
            if (a != null) {
                c = a.c;
            }
            else {
                c = null;
            }
            if (mlc.q(value, c)) {
                return;
            }
        }
        final ksg w = this.w;
        final boolean q = mlc.q(w.getValue(), value);
        final gsg c2 = this.C;
        if (!q || c2.h() != -1.0f || (o != null && !o.equals(this.a().d))) {
            w.setValue(value);
            this.x.setValue((Object)value2);
            Object value3;
            if (o == null) {
                if (c2.h() == -3.0f) {
                    value3 = value;
                }
                else {
                    value3 = this.E.getValue();
                }
            }
            else {
                value3 = o;
            }
            if (o != null) {
                this.e(value3);
                if (f != null) {
                    this.F = f;
                }
            }
            final ksg b = this.B;
            final boolean booleanValue = (boolean)b.getValue();
            boolean b2 = true;
            this.f(value3, booleanValue ^ true);
            if (c2.h() != -3.0f) {
                b2 = false;
            }
            b.setValue((Object)b2);
            if (c2.h() >= 0.0f) {
                this.e(this.a().f((long)(c2.h() * this.a().b())));
            }
            else if (c2.h() == -3.0f) {
                this.e(value);
            }
            this.D = false;
            c2.i(-1.0f);
        }
    }
    
    @Override
    public final String toString() {
        final Object value = this.E.getValue();
        final Object value2 = this.w.getValue();
        final bfa bfa = (bfa)this.x.getValue();
        final StringBuilder sb = new StringBuilder("current value: ");
        sb.append(value);
        sb.append(", target: ");
        sb.append(value2);
        sb.append(", spec: ");
        sb.append((Object)bfa);
        return sb.toString();
    }
}
