public final class htl extends qxc implements bua
{
    public final ctl A;
    public final boolean B;
    public final atl C;
    public final float D;
    public final kj2 E;
    public final etl w;
    public final efo x;
    public final lta y;
    public final itl z;
    
    public htl(final etl w, final efo x, final lta y, final itl z, final ctl a, final boolean b, final atl c, final float d, final kj2 e) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        super(3);
    }
    
    @Override
    public final Object h(Object o, Object o2, final Object o3) {
        final igf igf = (igf)o;
        final gva gva = (gva)o2;
        ((Number)o3).intValue();
        gva.g0(-1539505585);
        final etl w = this.w;
        final Object a = w.a;
        gva.d0(-1996110647, a);
        o2 = gva.R();
        final itl z = this.z;
        final cib a2 = bi6.a;
        o = o2;
        if (o2 == a2) {
            final x8m e = z.E;
            o2 = e.get(a);
            if ((o = o2) == null) {
                o = new url(a, z);
                e.put(a, o);
            }
            o = o;
            gva.q0(o);
        }
        final url value = (url)o;
        final efo x = this.x;
        gva.d0(-1996106866, (Object)x);
        final lta y = this.y;
        efo r;
        if (x != null) {
            final r1 a3 = x.a;
            gva.g0(-1749734647);
            final String string = a.toString();
            final boolean f = gva.f((Object)x);
            o2 = gva.R();
            if (f || (o = o2) == a2) {
                o = a3.i();
                gva.q0(o);
            }
            if (x.h()) {
                o = a3.i();
            }
            gva.g0(1498260051);
            final Boolean b = (Boolean)y.b(o);
            b.getClass();
            gva.q(false);
            o2 = x.d.getValue();
            gva.g0(1498260051);
            final Boolean b2 = (Boolean)y.b(o2);
            b2.getClass();
            gva.q(false);
            final efo s = xp7.s(x, b, b2, string, gva, 0);
            if (!x.h()) {
                gva.g0(782386797);
                o = x.e.getValue();
                Boolean b3;
                if (o == null) {
                    gva.g0(782437481);
                    gva.q(false);
                    b3 = null;
                }
                else {
                    gva.g0(782437482);
                    gva.g0(1498260051);
                    b3 = (Boolean)y.b(o);
                    b3.getClass();
                    gva.q(false);
                    gva.q(false);
                }
                s.r(b3);
                gva.q(false);
            }
            else {
                gva.g0(782538635);
                gva.q(false);
            }
            gva.q(false);
            r = s;
        }
        else {
            gva.g0(-1749482679);
            omo.v(1, y);
            final Boolean b4 = (Boolean)y.b(lqo.a);
            boolean booleanValue = b4;
            o2 = gva.R();
            if ((o = o2) == a2) {
                if (!value.c().isEmpty()) {
                    booleanValue = !booleanValue;
                }
                o = new enf((Object)booleanValue);
                gva.q0(o);
            }
            final enf enf = (enf)o;
            enf.s(b4);
            r = xp7.R(enf, null, gva, 0, 2);
            gva.q(false);
        }
        gva.d0(-1996043323, (Object)z.a());
        final veo t = xp7.t(r, yi2.m, null, gva, 0, 2);
        gva.q(false);
        final boolean f2 = gva.f((Object)r);
        o2 = gva.R();
        if (!f2 && o2 != a2) {
            o = o2;
        }
        else {
            o = new fj2(z, r, t, this.E, value.h);
            gva.q0(o);
        }
        final fj2 value2 = (fj2)o;
        if (!mlc.q(value2.d.getValue(), t)) {
            value2.d.setValue((Object)t);
            value2.h.setValue((Object)null);
            value2.f = gj2.a;
        }
        value2.e.setValue((Object)this.E);
        gva.q(false);
        o = gva.R();
        final ctl a4 = this.A;
        final boolean b5 = this.B;
        final atl c = this.C;
        final float d = this.D;
        if (o == a2) {
            o = new vrl(value, value2, a4, b5, c, w, d);
            gva.q0(o);
        }
        final vrl value3 = (vrl)o;
        w.c.setValue((Object)value3);
        final ksg y2 = value3.y;
        final gsg w2 = value3.w;
        y2.setValue((Object)value);
        value3.B.setValue((Object)b5);
        value3.z.setValue((Object)value2);
        value3.A.setValue((Object)a4);
        value3.C.setValue((Object)c);
        if (w2.h() != d) {
            w2.i(d);
            final hsg c2 = value3.h().b.C;
            c2.i(c2.h() + 1);
        }
        value3.x.setValue((Object)Boolean.TRUE);
        value3.D.setValue((Object)w);
        gva.q(false);
        final igf e2 = igf.E(new arl(value3));
        gva.q(false);
        return e2;
    }
}
