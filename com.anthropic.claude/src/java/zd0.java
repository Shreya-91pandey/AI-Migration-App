public final class zd0 extends qxc implements zta
{
    public final le0 A;
    public final v8m B;
    public final ye6 C;
    public final Object w;
    public final efo x;
    public final xxg y;
    public final lta z;
    
    public zd0(final Object w, final efo x, final xxg y, final lta z, final le0 a, final v8m b, final ye6 c) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        super(2);
    }
    
    @Override
    public final Object d(Object o, Object o2) {
        final gva gva = (gva)o;
        final int intValue = ((Number)o2).intValue();
        final boolean b = false;
        if (gva.W(intValue & 0x1, (intValue & 0x3) != 0x2)) {
            final efo x = this.x;
            final ksg e = x.e;
            final ksg d = x.d;
            o = e.getValue();
            final Object w = this.w;
            final boolean g = gva.g(mlc.q(w, o));
            o2 = gva.R();
            final lta z = this.z;
            final xxg y = this.y;
            final cib a = bi6.a;
            final le0 a2 = this.A;
            if (g || (o = o2) == a) {
                if (mlc.q(w, e.getValue()) && y != null) {
                    o = z.b(y);
                }
                else if (!mlc.q(w, x.f().d()) && !mlc.q(w, x.f().h())) {
                    o = z.b(new xxg(a2, x.f().d(), w));
                }
                else {
                    o = z.b(a2);
                }
                gva.q0(o);
            }
            final ey6 ey6 = (ey6)o;
            final boolean q = mlc.q(x.f().h(), w);
            final boolean q2 = mlc.q(w, e.getValue());
            final boolean g2 = gva.g(q);
            final boolean g3 = gva.g(q2);
            o2 = gva.R();
            if ((g2 | g3) || (o = o2) == a) {
                if (!mlc.q(x.f().h(), w) && (!mlc.q(w, e.getValue()) || y == null)) {
                    if (!mlc.q(w, x.f().d()) && !mlc.q(w, x.f().h())) {
                        o = ((ey6)z.b(new xxg(a2, w, x.f().d()))).b;
                    }
                    else {
                        o = ((ey6)z.b(a2)).b;
                    }
                }
                else {
                    o = ev9.b;
                }
                gva.q0(o);
            }
            final ev9 ev9 = (ev9)o;
            o2 = gva.R();
            if ((o = o2) == a) {
                o = new fe0(mlc.q(w, d.getValue()));
                gva.q0(o);
            }
            final fe0 fe0 = (fe0)o;
            final id9 a3 = ey6.a;
            final abq abq = new abq(ey6.c.h(), w);
            fe0.v.setValue((Object)mlc.q(w, d.getValue()));
            boolean b2 = b;
            if (mlc.q(w, e.getValue())) {
                b2 = b;
                if (!mlc.q(w, d.getValue())) {
                    b2 = b;
                    if (!mlc.q(w, x.a.i())) {
                        b2 = true;
                    }
                }
            }
            fe0.w.setValue((Object)b2);
            final igf e2 = abq.E(fe0);
            final boolean h = gva.h(w);
            o2 = gva.R();
            if (h || (o = o2) == a) {
                o = new k10(w, (byte)1);
                gva.q0(o);
            }
            final lta lta = (lta)o;
            final boolean f = gva.f((Object)ev9);
            o2 = gva.R();
            if (f || (o = o2) == a) {
                o = new vd0(ev9);
                gva.q0(o);
            }
            ljq.a(x, lta, e2, a3, ev9, (zta)o, (bua)uuj.t0(1831990167, new yd0(w, this.B, a2, this.C), gva), gva, 100663296);
        }
        else {
            gva.Z();
        }
        return lqo.a;
    }
}
