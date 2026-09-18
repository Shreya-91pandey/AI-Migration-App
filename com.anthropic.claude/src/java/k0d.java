import android.graphics.Paint;
import androidx.compose.ui.node.LayoutNode;

public final class k0d implements cw8
{
    public final z13 v;
    public bw8 w;
    
    public k0d() {
        final z13 v = new z13();
        this.v = v;
    }
    
    @Override
    public final void A0(final coi coi, final float n, final long n2) {
        this.v.A0(coi, n, n2);
    }
    
    @Override
    public final void B(final n70 n70, final long n71, final float n72, final he2 he2, final int n73) {
        this.v.B(n70, n71, n72, he2, n73);
    }
    
    @Override
    public final zn0 B0() {
        return this.v.w;
    }
    
    public final int E0(final long n) {
        return ((xc8)this.v).E0(n);
    }
    
    @Override
    public final void F(final long n, final float n2, final float n3, final long n4, final long n5, final float n6, final dw8 dw8) {
        this.v.F(n, n2, n3, n4, n5, n6, dw8);
    }
    
    public final float I(final long n) {
        return ((xc8)this.v).I(n);
    }
    
    public final int L0(final float n) {
        return ((xc8)this.v).L0(n);
    }
    
    @Override
    public final void N0(final long n, final float n2, final long n3, final dw8 dw8, final int n4) {
        this.v.N0(n, n2, n3, dw8, n4);
    }
    
    @Override
    public final long P0() {
        return this.v.P0();
    }
    
    @Override
    public final void R(final long n, final long n2, final long n3, final float n4, final int n5) {
        this.v.R(n, n2, n3, n4, n5);
    }
    
    @Override
    public final void S0(final long n, final long n2, final long n3, final float n4, final dw8 dw8, final he2 he2, final int n5) {
        this.v.S0(n, n2, n3, n4, dw8, he2, n5);
    }
    
    public final long T0(final long n) {
        return ((xc8)this.v).T0(n);
    }
    
    public final float W0(final long n) {
        return ((xc8)this.v).W0(n);
    }
    
    public final long X(final int n) {
        return ((xc8)this.v).X(n);
    }
    
    public final long Z(final float n) {
        return ((xc8)this.v).Z(n);
    }
    
    public final void a() {
        final z13 v = this.v;
        final zn0 w = v.w;
        final x13 t = v.w.t();
        final bw8 w2 = this.w;
        if (w2 == null) {
            throw ge9.x("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        final hgf hgf = (hgf)w2;
        final hgf a = hgf.v.A;
        Object o = null;
        Label_0118: {
            if (a != null) {
                o = a;
                if ((a.y & 0x4) != 0x0) {
                    while (o != null) {
                        final int x = ((hgf)o).x;
                        if ((x & 0x2) != 0x0) {
                            break;
                        }
                        if ((x & 0x4) != 0x0) {
                            break Label_0118;
                        }
                        o = ((hgf)o).A;
                    }
                }
            }
            o = null;
        }
        if (o != null) {
            inf inf = null;
            while (o != null) {
                inf inf2;
                if (o instanceof bw8) {
                    final bw8 bw8 = (bw8)o;
                    final g6b g6b = (g6b)w.w;
                    final yxf j = soh.J((t98)bw8, 4);
                    final long z = uoo.Z(j.x);
                    final LayoutNode p = j.P;
                    p.getClass();
                    l0d.a(p).getSharedDrawScope().b(t, z, j, bw8, g6b);
                    inf2 = inf;
                }
                else {
                    inf2 = inf;
                    if ((((hgf)o).x & 0x4) != 0x0) {
                        inf2 = inf;
                        if (o instanceof v98) {
                            hgf hgf2 = ((v98)o).K;
                            int n = 0;
                            while (hgf2 != null) {
                                v98 v2 = (v98)o;
                                int n2 = n;
                                inf inf3 = inf;
                                if ((hgf2.x & 0x4) != 0x0) {
                                    n2 = n + 1;
                                    if (n2 == 1) {
                                        v2 = (v98)hgf2;
                                        inf3 = inf;
                                    }
                                    else {
                                        inf inf4;
                                        if ((inf4 = inf) == null) {
                                            inf4 = new inf(0, new hgf[16]);
                                        }
                                        v98 v3;
                                        if ((v3 = (v98)o) != null) {
                                            inf4.b(o);
                                            v3 = null;
                                        }
                                        inf4.b(hgf2);
                                        inf3 = inf4;
                                        v2 = v3;
                                    }
                                }
                                hgf2 = hgf2.A;
                                o = v2;
                                n = n2;
                                inf = inf3;
                            }
                            inf2 = inf;
                            if (n == 1) {
                                continue;
                            }
                        }
                    }
                }
                o = soh.G(inf2);
                inf = inf2;
            }
            return;
        }
        yxf yxf2;
        final yxf yxf = yxf2 = soh.J((t98)w2, 4);
        if (yxf.h1() == hgf.v) {
            yxf2 = yxf.S;
            yxf2.getClass();
        }
        yxf2.x1(t, (g6b)w.w);
    }
    
    public final void b(final x13 x13, final long n, final yxf yxf, final bw8 w, final g6b w2) {
        final bw8 w3 = this.w;
        this.w = w;
        final qzc v = yxf.P.V;
        final zn0 w4 = this.v.w;
        final xc8 w5 = w4.w();
        final qzc y = w4.y();
        final x13 t = w4.t();
        final long a = w4.A();
        final g6b g6b = (g6b)w4.w;
        w4.H((xc8)yxf);
        w4.I(v);
        w4.G(x13);
        w4.J(n);
        w4.w = w2;
        x13.g();
        try {
            w.I0(this);
            x13.p();
            w4.H(w5);
            w4.I(y);
            w4.G(t);
            w4.J(a);
            w4.w = g6b;
            this.w = w3;
        }
        finally {
            x13.p();
            w4.H(w5);
            w4.I(y);
            w4.G(t);
            w4.J(a);
            w4.w = g6b;
        }
    }
    
    public final void c(final qm2 qm2, final long n, final long n2, final float n3, final float n4) {
        final z13 v = this.v;
        final x13 c = v.v.c;
        y80 y;
        if ((y = v.y) == null) {
            y = uoo.d();
            y.n(1);
            v.y = y;
        }
        final Paint a = y.a;
        if (qm2 != null) {
            qm2.a(n4, v.i(), y);
        }
        else if (a.getAlpha() / 255.0f != n4) {
            y.d(n4);
        }
        if (!mlc.q((Object)y.d, (Object)null)) {
            y.g(null);
        }
        if (y.b != 3) {
            y.e(3);
        }
        if (a.getStrokeWidth() != n3) {
            y.m(n3);
        }
        if (a.getStrokeMiter() != 4.0f) {
            a.setStrokeMiter(4.0f);
        }
        if (y.b() != 0) {
            y.k(0);
        }
        if (y.c() != 0) {
            y.l(0);
        }
        if (!mlc.q((Object)y.e, (Object)null)) {
            y.i(null);
        }
        if (!a.isFilterBitmap()) {
            y.h(1);
        }
        c.h(n, n2, y);
    }
    
    public final float e0(final int n) {
        return ((xc8)this.v).e0(n);
    }
    
    public final float getDensity() {
        return this.v.getDensity();
    }
    
    @Override
    public final qzc getLayoutDirection() {
        return this.v.v.b;
    }
    
    @Override
    public final long i() {
        return this.v.i();
    }
    
    public final float i0(final float n) {
        return n / this.v.getDensity();
    }
    
    @Override
    public final void l(final g90 g90, final qm2 qm2, final float n, final dw8 dw8, final int n2) {
        this.v.l(g90, qm2, n, dw8, n2);
    }
    
    @Override
    public final void l0(final qm2 qm2, final long n, final long n2, final float n3, final dw8 dw8, final int n4) {
        this.v.l0(qm2, n, n2, n3, dw8, n4);
    }
    
    @Override
    public final void m(final g90 g90, final long n, final float n2, final dw8 dw8) {
        this.v.m(g90, n, n2, dw8);
    }
    
    public final float o0() {
        return this.v.o0();
    }
    
    @Override
    public final void p0(final long n, final long n2, final long n3, final long n4, final dw8 dw8, final float n5, final int n6) {
        this.v.p0(n, n2, n3, n4, dw8, n5, n6);
    }
    
    @Override
    public final void q(final n70 n70, final long n71, final long n72, final long n73, final long n74, final float n75, final he2 he2, final int n76) {
        this.v.q(n70, n71, n72, n73, n74, n75, he2, n76);
    }
    
    @Override
    public final void t0(final qm2 qm2, final long n, final long n2, final long n3, final float n4, final dw8 dw8) {
        this.v.t0(qm2, n, n2, n3, n4, dw8);
    }
    
    public final float w0(final float n) {
        return this.v.getDensity() * n;
    }
    
    public final long x(final float n) {
        return ((xc8)this.v).x(n);
    }
    
    public final long y(final long n) {
        return ((xc8)this.v).y(n);
    }
}
