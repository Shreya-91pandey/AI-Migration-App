import androidx.compose.ui.node.LayoutNode;

public final class jq7 extends qxc implements zta
{
    public final efo w;
    public final bfa x;
    public final Object y;
    public final ye6 z;
    
    public jq7(final efo w, final bfa x, final Object y, final ye6 z) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        super(2);
    }
    
    @Override
    public final Object d(Object o, Object o2) {
        final gva gva = (gva)o;
        final int intValue = ((Number)o2).intValue();
        if (gva.W(intValue & 0x1, (intValue & 0x3) != 0x2)) {
            final elo e = yi2.e;
            final efo w = this.w;
            final boolean h = w.h();
            final r1 a = w.a;
            final cib a2 = bi6.a;
            Label_0205: {
                if (!h) {
                    gva.g0(1666573488);
                    final boolean f = gva.f((Object)w);
                    o2 = gva.R();
                    Label_0166: {
                        if (!f && (o = o2) != a2) {
                            break Label_0166;
                        }
                        final r7m a3 = q7m.a();
                        if (a3 != null) {
                            o = a3.e();
                        }
                        else {
                            o = null;
                        }
                        final r7m b = q7m.b(a3);
                        try {
                            o2 = a.i();
                            q7m.d(a3, b, (lta)o);
                            gva.q0(o2);
                            o = o2;
                            gva.q(false);
                            break Label_0205;
                        }
                        finally {
                            q7m.d(a3, b, (lta)o);
                        }
                    }
                }
                gva.g0(1666827533);
                gva.q(false);
                o = a.i();
            }
            gva.g0(1378811975);
            final Object y = this.y;
            final boolean q = mlc.q(o, y);
            float n = 0.0f;
            float n2;
            if (q) {
                n2 = 1.0f;
            }
            else {
                n2 = 0.0f;
            }
            gva.q(false);
            final boolean f2 = gva.f((Object)w);
            o2 = gva.R();
            if (f2 || (o = o2) == a2) {
                o = r8m.b((jta)new gj4(w, (byte)2));
                gva.q0(o);
            }
            o = ((xom)o).getValue();
            gva.g0(1378811975);
            if (mlc.q(o, y)) {
                n = 1.0f;
            }
            gva.q(false);
            final boolean f3 = gva.f((Object)w);
            o2 = gva.R();
            if (f3 || (o = o2) == a2) {
                o = r8m.b((jta)new gj4(w, (byte)3));
                gva.q0(o);
            }
            final xeo xeo = (xeo)((xom)o).getValue();
            gva.g0(955869654);
            gva.q(false);
            final zeo u = xp7.u(w, n2, n, this.x, e, gva, 0);
            final boolean f4 = gva.f((Object)u);
            o2 = gva.R();
            if (f4 || (o = o2) == a2) {
                o = new k10(u, (byte)5);
                gva.q0(o);
            }
            final igf f5 = zrn.F((igf)fgf.v, (lta)o);
            final moe c = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, f5);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.x(gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b2);
            this.z.h(y, (Object)gva, (Object)0);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        return lqo.a;
    }
}
