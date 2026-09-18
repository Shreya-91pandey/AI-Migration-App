import java.util.List;

public final class lb7 implements moe
{
    public final j7d a;
    public final dkn b;
    public final z0q c;
    public final oc7 d;
    public final lta e;
    public final mln f;
    public final o6g g;
    public final xc8 h;
    public final rl2 i;
    public final int j;
    
    public lb7(final j7d a, final dkn b, final z0q c, final oc7 d, final lta e, final mln f, final o6g g, final xc8 h, final rl2 i, final int j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final int a(final flc flc, final List list, final int n) {
        final j7d a = this.a;
        a.a.d(((yxf)flc).P.V);
        final uy7 uy7 = (uy7)a.a.g;
        if (uy7 != null) {
            return zn2.q(uy7.y());
        }
        en9.q("layoutIntrinsics must be called first");
        return 0;
    }
    
    public final noe b(final ooe ooe, List value, long c) {
        final j7d a = this.a;
        Object o = q7m.a();
        if (o != null) {
            value = (List)((r7m)o).e();
        }
        else {
            value = null;
        }
        Object o2 = q7m.b((r7m)o);
        try {
            final pmn d = a.d();
            q7m.d((r7m)o, (r7m)o2, (lta)value);
            if (d != null) {
                value = (List)d.a;
            }
            else {
                value = null;
            }
            o = a.a;
            o2 = ooe.getLayoutDirection();
            final boolean a2 = ((kce)o).a;
            int n = Integer.MAX_VALUE;
            Label_0716: {
                if (value != null) {
                    final vjf b = ((omn)value).b;
                    final nmn a3 = ((omn)value).a;
                    final og0 og0 = (og0)((kce)o).b;
                    final mnn mnn = (mnn)((kce)o).c;
                    final List list = (List)((kce)o).f;
                    final xc8 xc8 = (xc8)((kce)o).d;
                    final tna tna = (tna)((kce)o).e;
                    if (!b.a.e()) {
                        final og0 a4 = a3.a;
                        final long j = a3.j;
                        Label_0459: {
                            if (mlc.q((Object)a4, (Object)og0) && a3.b.d(mnn) && mlc.q((Object)a3.c, (Object)list) && a3.d == Integer.MAX_VALUE && a3.e == a2 && a3.f == 1 && mlc.q((Object)a3.g, (Object)xc8) && a3.h == o2) {
                                if (mlc.q((Object)a3.i, (Object)tna)) {
                                    if (gv6.k(c) == gv6.k(j)) {
                                        if (a2) {
                                            if (gv6.i(c) != gv6.i(j) || gv6.h(c) != gv6.h(j)) {
                                                break Label_0459;
                                            }
                                        }
                                        o = new nmn(a3.a, (mnn)((kce)o).c, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, c);
                                        o2 = new omn((nmn)o, b, hv6.d(c, ((long)zn2.q(b.e) & 0xFFFFFFFFL) | (long)zn2.q(b.d) << 32));
                                        o = value;
                                        o = o2;
                                        break Label_0716;
                                    }
                                }
                            }
                        }
                    }
                }
                ((kce)o).d((qzc)o2);
                final int k = gv6.k(c);
                if (a2) {
                    if (gv6.e(c)) {
                        n = gv6.i(c);
                    }
                }
                if (k != n) {
                    final uy7 uy7 = (uy7)((kce)o).g;
                    if (uy7 == null) {
                        en9.q("layoutIntrinsics must be called first");
                        return null;
                    }
                    n = ncq.o(zn2.q(uy7.y()), k, n);
                }
                final uy7 uy8 = (uy7)((kce)o).g;
                if (uy8 == null) {
                    en9.q("layoutIntrinsics must be called first");
                    return null;
                }
                final vjf vjf = new vjf(uy8, ri2.F(0, n, 0, gv6.h(c)), Integer.MAX_VALUE, 1);
                final long d2 = hv6.d(c, (long)zn2.q(vjf.d) << 32 | ((long)zn2.q(vjf.e) & 0xFFFFFFFFL));
                final og0 og2 = (og0)((kce)o).b;
                final mnn mnn2 = (mnn)((kce)o).c;
                final List list2 = (List)((kce)o).f;
                final boolean a5 = ((kce)o).a;
                final xc8 xc9 = (xc8)((kce)o).d;
                final tna tna2 = (tna)((kce)o).e;
                o = value;
                o = new omn(new nmn(og2, mnn2, list2, Integer.MAX_VALUE, a5, 1, xc9, (qzc)o2, tna2, c), vjf, d2);
            }
            o2 = value;
            c = ((omn)o).c;
            final int n2 = (int)(c >> 32);
            final int n3 = (int)(c & 0xFFFFFFFFL);
            final int intValue = ((Number)Integer.valueOf(n2)).intValue();
            final int intValue2 = ((Number)Integer.valueOf(n3)).intValue();
            final vjf b2 = ((omn)o).b;
            b2.a.e();
            if (!mlc.q(o2, o)) {
                if (d != null) {
                    value = (List)d.c;
                }
                else {
                    value = null;
                }
                value = (List)new pmn((omn)o, (nzc)value);
                a.i.setValue((Object)value);
                a.p = false;
                final dkn b3 = this.b;
                if (b3.o() && b3.n() && ((n6d)this.c).b() && dnn.d(((dnn)a.A.getValue()).a)) {
                    if (dnn.d(((dnn)a.B.getValue()).a)) {
                        if (a.b()) {
                            if (o2 != null) {
                                value = (List)((omn)o2).a.a;
                            }
                            else {
                                value = null;
                            }
                            if (!mlc.q((Object)value, (Object)((omn)o).a.a)) {
                                value = (List)new mu5((Object)b3, (Object)this.i, (f07)null, (byte)28);
                                rhc.G(this.d, (hc7)null, 0, (zta)value, 3);
                            }
                        }
                    }
                }
                this.e.b(o);
                eqi.g0(a, this.f, this.g);
            }
            int q;
            if (this.j == 1) {
                q = zn2.q(b2.b(0));
            }
            else {
                q = 0;
            }
            a.g.setValue((Object)new qs8(this.h.e0(q)));
            return ooe.Y(intValue, intValue2, y5e.Z(new yog[] { new yog((Object)kx.a, (Object)Math.round(((omn)o).d)), new yog((Object)kx.b, (Object)Math.round(((omn)o).e)) }), (lta)new ct6((byte)24));
        }
        finally {
            q7m.d((r7m)o, (r7m)o2, (lta)value);
        }
    }
}
