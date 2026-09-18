import java.util.Map;

public final class mhn extends v98 implements a0d, bw8, zl6, x2b, xsk
{
    public boolean L;
    public boolean M;
    public qmn N;
    public peo O;
    public ykn P;
    public qm2 Q;
    public boolean R;
    public ufk S;
    public zhg T;
    public g66 U;
    public lbh V;
    public pr7 W;
    public wmm X;
    public dnn Y;
    public k2j Z;
    public int a0;
    public int b0;
    public final fjn c0;
    public final vgn d0;
    
    public mhn(final boolean l, final boolean m, final boolean b, final qmn n, final peo o, final ykn p12, final qm2 q, final boolean r, final ufk s, final zhg t, final g66 u, final lbh v) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p12;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
        this.V = v;
        this.Z = new k2j(-1.0f, -1.0f, -1.0f, -1.0f);
        final boolean b2 = l || m || b;
        Object c0;
        if (d0e.a()) {
            c0 = new hjn(o, p12, n, b2);
        }
        else {
            c0 = new rb0();
        }
        this.o1((t98)c0);
        this.c0 = (fjn)c0;
        final vgn d0 = new vgn(this.U, (lta)new ade((byte)1, null, this), (lta)new pf0((byte)1, null, this), (lta)new e0j((Object)this, (byte)17));
        this.o1((t98)d0);
        this.d0 = d0;
    }
    
    public final void I0(final k0d k0d) {
        final z13 v = k0d.v;
        k0d.a();
        final hhn f = this.O.f();
        final omn c = this.N.c();
        if (c == null) {
            return;
        }
        final yog a = f.A;
        final yog a2 = f.A;
        final long y = f.y;
        if (a != null) {
            final int b = ((uln)a.v).b();
            final long a3 = ((dnn)a.w).a;
            if (!dnn.d(a3)) {
                final g90 k = c.k(dnn.g(a3), dnn.f(a3));
                final mnn b2 = c.a.b;
                if (uln.a(b)) {
                    final qm2 b3 = b2.b();
                    if (b3 != null) {
                        cw8.s0((cw8)k0d, k, b3, 0.2f, (tym)null, 56);
                    }
                    else {
                        long n = b2.c();
                        if (n == 16L) {
                            n = j86.b;
                        }
                        cw8.Z0((cw8)k0d, k, j86.b(j86.c(n) * 0.2f, n), 0.0f, (dw8)null, 60);
                    }
                }
                else {
                    cw8.Z0((cw8)k0d, k, ((gnn)uoo.z((zl6)this, (sei)hnn.a)).b, 0.0f, (dw8)null, 60);
                }
            }
        }
        if (dnn.d(y)) {
            t08.X(v.w.t(), c);
            if (a2 == null) {
                final qm2 q = this.Q;
                final boolean r1 = this.r1();
                final pr7 w = this.W;
                final ykn p = this.P;
                float h;
                if (w != null) {
                    h = w.c.h();
                }
                else {
                    h = 0.0f;
                }
                if (h != 0.0f) {
                    if (r1) {
                        final k2j p2 = p.p();
                        final float c2 = p2.c;
                        final float a4 = p2.a;
                        final float n2 = c2 - a4;
                        k0d.c(q, ((long)Float.floatToRawIntBits(p2.b) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n2 / 2.0f + a4) << 32, p2.c(), n2, h);
                    }
                }
            }
        }
        else {
            if (a2 == null) {
                final int g = dnn.g(y);
                final int f2 = dnn.f(y);
                if (g != f2) {
                    cw8.Z0((cw8)k0d, c.k(g, f2), ((gnn)uoo.z((zl6)this, (sei)hnn.a)).b, 0.0f, (dw8)null, 60);
                }
            }
            t08.X(v.w.t(), c);
        }
        this.c0.I0(k0d);
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final zhg t = this.T;
        final zhg v = zhg.v;
        final s89 v2 = s89.v;
        if (t == v) {
            final o8h u = goe.u(gv6.b(n, 0, 0, 0, Integer.MAX_VALUE, 7));
            final int min = Math.min(u.w, gv6.h(n));
            return ooe.Y(u.v, min, (Map)v2, (lta)new qd8(this, min, u, ooe));
        }
        final o8h u2 = goe.u(gv6.b(n, 0, Integer.MAX_VALUE, 0, 0, 13));
        final int min2 = Math.min(u2.v, gv6.i(n));
        return ooe.Y(min2, u2.w, (Map)v2, (lta)new tk4((Object)this, min2, (Object)u2, (Object)ooe, (byte)6));
    }
    
    public final void g1() {
        final ykn p = this.P;
        final boolean l = this.L;
        p.h = l;
        if (l && this.r1()) {
            this.s1();
        }
    }
    
    public final void j(final itk itk) {
        this.c0.j(itk);
    }
    
    public final boolean r1() {
        if (this.R && (this.L || this.M)) {
            final qm2 q = this.Q;
            if (!(q instanceof cam) || ((cam)q).a != 16L) {
                return true;
            }
        }
        return false;
    }
    
    public final void s1() {
        if (this.W == null) {
            this.W = new pr7((boolean)uoo.z((zl6)this, (sei)hm6.z));
            x90.z((bw8)this);
        }
        this.X = rhc.G(((hgf)this).c1(), (hc7)null, 0, (zta)new khn((byte)0, null, this), 3);
    }
    
    public final void t1(final n8h n8h, final int b0, final int a0, final long n, final qzc qzc) {
        this.S.b.i(b0);
        this.S.h(a0 - b0);
        final dnn y = this.Y;
        int n4 = 0;
        Label_0135: {
            if (y != null) {
                final int c = dnn.c;
                final int n2 = (int)(n & 0xFFFFFFFFL);
                final long a2 = y.a;
                if (n2 == (int)(a2 & 0xFFFFFFFFL)) {
                    final int n3 = (int)(n >> 32);
                    if ((n4 = n3) != (int)(a2 >> 32)) {
                        break Label_0135;
                    }
                    n4 = n3;
                    if (a0 != this.a0) {
                        break Label_0135;
                    }
                    if (b0 != this.b0) {
                        n4 = n3;
                        break Label_0135;
                    }
                    n4 = -1;
                    break Label_0135;
                }
            }
            final int c2 = dnn.c;
            n4 = (int)(0xFFFFFFFFL & n);
        }
        if (n4 >= 0) {
            if (this.r1()) {
                final omn c3 = this.N.c();
                if (c3 != null) {
                    final int length = c3.a.a.w.length();
                    final int n5 = 0;
                    final k2j c4 = c3.c(ncq.p(n4, (xgc)new vgc(0, length, 1)));
                    float a3 = c4.a;
                    final float c5 = c4.c;
                    final boolean b2 = qzc == qzc.w;
                    final int l0 = ((xc8)n8h).L0(2.0f);
                    float n6;
                    if (b2) {
                        n6 = a0 - c5;
                    }
                    else {
                        n6 = a3;
                    }
                    if (b2) {
                        a3 = a0 - c5;
                    }
                    final float n7 = a3 + l0;
                    final float n8 = (float)a0;
                    float n9 = n7;
                    if (n7 > n8) {
                        n9 = n8;
                    }
                    final k2j b3 = k2j.b(c4, n6, n9, 0.0f, 10);
                    final float b4 = b3.b;
                    float a4 = b3.a;
                    final k2j z = this.Z;
                    final boolean b5 = a4 != z.a || b4 != z.b || a0 != this.a0;
                    if (b5 || b0 != this.b0) {
                        int n10 = n5;
                        if (this.T == zhg.v) {
                            n10 = 1;
                        }
                        if (n10 != 0) {
                            a4 = b4;
                        }
                        float n11;
                        if (n10 != 0) {
                            n11 = b3.d;
                        }
                        else {
                            n11 = b3.c;
                        }
                        final int h = this.S.a.h();
                        final float n12 = (float)(h + b0);
                        float n15 = 0.0f;
                        Label_0540: {
                            if (n11 <= n12) {
                                final float n13 = (float)h;
                                final float n14 = fcmpg(a4, n13);
                                if (n14 >= 0 || n11 - a4 <= b0) {
                                    if (n14 < 0 && n11 - a4 <= b0) {
                                        n15 = a4 - n13;
                                        break Label_0540;
                                    }
                                    n15 = 0.0f;
                                    break Label_0540;
                                }
                            }
                            n15 = n11 - n12;
                        }
                        this.Y = new dnn(n);
                        this.Z = b3;
                        this.b0 = b0;
                        this.a0 = a0;
                        rhc.G(((hgf)this).c1(), (hc7)null, 4, (zta)new lhn(n15, this, b5, n, c4, null), 1);
                    }
                }
            }
        }
    }
    
    public final void u0(final yxf value) {
        this.N.e.setValue((Object)value);
        this.c0.u0(value);
    }
}
