import android.view.ViewParent;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import androidx.compose.ui.node.Owner;
import java.util.Map$Entry;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.LayoutNode;

public abstract class yxf extends wxd implements goe, nzc
{
    public static final xtf s0;
    public static final xtf t0;
    public static final jqj u0;
    public static final dzc v0;
    public static final float[] w0;
    public static final wxf x0;
    public static final wab y0;
    public final LayoutNode P;
    public boolean Q;
    public boolean R;
    public yxf S;
    public yxf T;
    public boolean U;
    public boolean V;
    public lta W;
    public xc8 X;
    public qzc Y;
    public float Z;
    public noe a0;
    public amf b0;
    public long c0;
    public float d0;
    public smf e0;
    public dzc f0;
    public aql g0;
    public k2j h0;
    public k2j i0;
    public boolean j0;
    public boolean k0;
    public g6b l0;
    public x13 m0;
    public txf n0;
    public final sxf o0;
    public boolean p0;
    public gmg q0;
    public g6b r0;
    
    static {
        s0 = new xtf((byte)24);
        t0 = new xtf((byte)25);
        u0 = new jqj();
        v0 = new dzc();
        w0 = l8e.a();
        x0 = (wxf)new Object();
        y0 = new wab((byte)22);
    }
    
    public yxf(final LayoutNode p) {
        this.P = p;
        this.X = p.U;
        this.Y = p.V;
        this.Z = 0.8f;
        this.c0 = 0L;
        this.g0 = (aql)zn2.k;
        final k2j e = k2j.e;
        this.h0 = e;
        this.i0 = e;
        this.o0 = new sxf(this, (byte)1);
    }
    
    public static yxf D1(final nzc nzc) {
        zxd zxd;
        if (nzc instanceof zxd) {
            zxd = (zxd)nzc;
        }
        else {
            zxd = null;
        }
        if (zxd != null) {
            final yxf p = zxd.v.P;
            if (p != null) {
                return p;
            }
        }
        nzc.getClass();
        return (yxf)nzc;
    }
    
    @Override
    public final boolean A() {
        return this.q0 != null && !this.U && this.P.V();
    }
    
    public final void A1() {
        if (this.q0 != null) {
            if (this.r0 != null) {
                this.r0 = null;
            }
            this.H1(null, false);
            this.P.s0(false);
        }
    }
    
    public final void B1(final noe a0) {
        final noe a2 = this.a0;
        if (a0 != a2) {
            this.a0 = a0;
            final LayoutNode p = this.P;
            if (a2 == null || a0.b() != a2.b() || a0.a() != a2.a()) {
                final int b = a0.b();
                final int a3 = a0.a();
                final gmg q0 = this.q0;
                if (q0 != null) {
                    ((j6b)q0).e((long)b << 32 | ((long)a3 & 0xFFFFFFFFL));
                }
                else if (p.W()) {
                    final yxf t = this.T;
                    if (t != null) {
                        t.p1();
                    }
                }
                this.c0(((long)a3 & 0xFFFFFFFFL) | (long)b << 32);
                if (this.W != null) {
                    this.I1(false);
                }
                final boolean g = zxf.g(4);
                hgf hgf = this.h1();
                Label_0485: {
                    if (!g) {
                        if ((hgf = hgf.z) == null) {
                            break Label_0485;
                        }
                    }
                    for (hgf hgf2 = this.k1(g); hgf2 != null && (hgf2.y & 0x4) != 0x0; hgf2 = hgf2.A) {
                        if ((hgf2.x & 0x4) != 0x0) {
                            hgf g2 = hgf2;
                            inf inf = null;
                            while (g2 != null) {
                                inf inf2;
                                if (g2 instanceof bw8) {
                                    ((bw8)g2).b0();
                                    inf2 = inf;
                                }
                                else {
                                    inf2 = inf;
                                    if ((g2.x & 0x4) != 0x0) {
                                        inf2 = inf;
                                        if (g2 instanceof v98) {
                                            hgf hgf3 = ((v98)g2).K;
                                            int n = 0;
                                            while (hgf3 != null) {
                                                hgf hgf4 = g2;
                                                inf inf3 = inf;
                                                int n2 = n;
                                                if ((hgf3.x & 0x4) != 0x0) {
                                                    n2 = n + 1;
                                                    if (n2 == 1) {
                                                        hgf4 = hgf3;
                                                        inf3 = inf;
                                                    }
                                                    else {
                                                        inf inf4;
                                                        if ((inf4 = inf) == null) {
                                                            inf4 = new inf(0, new hgf[16]);
                                                        }
                                                        hgf hgf5;
                                                        if ((hgf5 = g2) != null) {
                                                            inf4.b(g2);
                                                            hgf5 = null;
                                                        }
                                                        inf4.b(hgf3);
                                                        inf3 = inf4;
                                                        hgf4 = hgf5;
                                                    }
                                                }
                                                hgf3 = hgf3.A;
                                                g2 = hgf4;
                                                inf = inf3;
                                                n = n2;
                                            }
                                            inf2 = inf;
                                            if (n == 1) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                g2 = soh.G(inf2);
                                inf = inf2;
                            }
                        }
                        if (hgf2 == hgf) {
                            break;
                        }
                    }
                }
                final Owner j = p.J;
                if (j != null) {
                    ((AndroidComposeView)j).w(p);
                }
                p.i0(this);
            }
            final amf b2 = this.b0;
            if (b2 == null || b2.e == 0) {
                if (a0.c().isEmpty()) {
                    return;
                }
            }
            final amf b3 = this.b0;
            final Map c = a0.c();
            Label_0744: {
                if (b3 != null) {
                    if (b3.e == c.size()) {
                        final Object[] b4 = b3.b;
                        final int[] c2 = b3.c;
                        final long[] a4 = b3.a;
                        final int n3 = a4.length - 2;
                        if (n3 < 0) {
                            return;
                        }
                        int n4 = 0;
                    Block_33:
                        while (true) {
                            long n5 = a4[n4];
                            if ((~n5 << 7 & n5 & 0x8080808080808080L) != 0x8080808080808080L) {
                                final int n6 = 8 - (~(n4 - n3) >>> 31);
                                for (int i = 0; i < n6; ++i) {
                                    if ((0xFFL & n5) < 128L) {
                                        final int n7 = (n4 << 3) + i;
                                        final Object o = b4[n7];
                                        final int n8 = c2[n7];
                                        final Integer n9 = (Integer)c.get((Object)o);
                                        if (n9 == null) {
                                            break Block_33;
                                        }
                                        if (n9 != n8) {
                                            break Label_0744;
                                        }
                                    }
                                    n5 >>= 8;
                                }
                                if (n6 != 8) {
                                    return;
                                }
                            }
                            if (n4 == n3) {
                                return;
                            }
                            ++n4;
                        }
                    }
                }
            }
            p.t().p.S.f();
            amf b5;
            if ((b5 = this.b0) == null) {
                final amf a5 = i4g.a;
                b5 = new amf();
                this.b0 = b5;
            }
            b5.a();
            for (final Map$Entry map$Entry : a0.c().entrySet()) {
                b5.g(((Number)map$Entry.getValue()).intValue(), map$Entry.getKey());
            }
        }
    }
    
    public final void C1(final hgf hgf, final xxf xxf, long a, final dkb dkb, int x, final boolean b, final float n) {
        if (hgf == null) {
            this.o1(xxf, a, dkb, x, b);
            return;
        }
        if (!xxf.d(hgf)) {
            this.C1(rar.w((t98)hgf, xxf.c()), xxf, a, dkb, x, b, n);
            return;
        }
        if (!xxf.a(hgf)) {
            this.w1(rar.w((t98)hgf, xxf.c()), xxf, a, dkb, x, b, n, false);
            return;
        }
        final vxf vxf = new vxf(this, hgf, xxf, a, dkb, x, b, n);
        final qlf w = dkb.w;
        final emf v = dkb.v;
        if (dkb.x != lq6.P((List)dkb)) {
            a = dkb.a();
            final int x2 = dkb.x;
            x = lq6.P((List)dkb);
            dkb.x = x;
            dkb.d(x + 1, v.b);
            ++dkb.x;
            v.b((Object)hgf);
            w.a(u5r.g(n, b, false));
            vxf.a();
            dkb.x = x;
            final long a2 = dkb.a();
            if (dkb.x + 1 < lq6.P((List)dkb) && t8r.k(a, a2) > 0) {
                final boolean o = t8r.o(a2);
                x = dkb.x;
                if (o) {
                    x += 2;
                }
                else {
                    ++x;
                }
                dkb.d(x2 + 1, x);
            }
            else {
                dkb.d(dkb.x + 1, v.b);
            }
            dkb.x = x2;
            return;
        }
        x = dkb.x;
        final int n2 = x + 1;
        dkb.d(n2, v.b);
        ++dkb.x;
        v.b((Object)hgf);
        w.a(u5r.g(n, b, false));
        vxf.a();
        dkb.x = x;
        if (n2 != lq6.P((List)dkb) && !t8r.o(dkb.a())) {
            return;
        }
        x = dkb.x;
        final int n3 = x + 1;
        v.l(n3);
        if (n3 >= 0) {
            final int b2 = w.b;
            if (n3 < b2) {
                final long[] a3 = w.a;
                a = a3[n3];
                if (n3 != b2 - 1) {
                    iw0.M0(a3, a3, n3, x + 2, b2);
                }
                --w.b;
                return;
            }
        }
        qiq.t("Index must be between 0 and size");
        throw null;
    }
    
    @Override
    public final nzc D() {
        final boolean i = this.h1().I;
        final LayoutNode p = this.P;
        if (!i) {
            final StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (LayoutNode g = p; g != null; g = g.G()) {
                sb.append("\n|");
                sb.append((Object)g);
                sb.append(" isAttached=");
                sb.append(g.V());
                sb.append(" modifier=");
                sb.append((Object)g.d0);
                sb.append(" tail=");
                sb.append((Object)this.h1());
            }
            gac.c(sb.toString());
        }
        this.r1();
        return p.getOuterCoordinator$ui().T;
    }
    
    @Override
    public final long D0() {
        return this.c0;
    }
    
    public final k2j E1() {
        if (this.h1().I) {
            final nzc t = r9n.t((nzc)this);
            final smf e0 = this.e0;
            float b = 0.0f;
            smf e2;
            if ((e2 = e0) == null) {
                e2 = new smf(0.0f, 0.0f, 0.0f, 0.0f);
                this.e0 = e2;
            }
            final long v0 = this.V0(this.g1());
            float a;
            if (this.i1()) {
                a = this.h0.a;
            }
            else {
                a = 0.0f;
            }
            if (this.i1()) {
                b = this.h0.b;
            }
            float c;
            if (this.i1()) {
                c = this.h0.c;
            }
            else {
                c = (float)this.V();
            }
            float d;
            if (this.i1()) {
                d = this.h0.d;
            }
            else {
                d = (float)this.T();
            }
            final int n = (int)(v0 >> 32);
            e2.a = a - Float.intBitsToFloat(n);
            final int n2 = (int)(v0 & 0xFFFFFFFFL);
            e2.b = b - Float.intBitsToFloat(n2);
            e2.c = Float.intBitsToFloat(n) + c;
            e2.d = Float.intBitsToFloat(n2) + d;
            yxf t2 = this;
            while (t2 != t) {
                t2.z1(e2, false, true);
                if (e2.b()) {
                    return k2j.e;
                }
                t2 = t2.T;
                t2.getClass();
            }
            return new k2j(e2.a, e2.b, e2.c, e2.d);
        }
        return k2j.e;
    }
    
    public final void F1(final yxf yxf, final float[] array) {
        if (!mlc.q((Object)yxf, (Object)this)) {
            final yxf t = this.T;
            t.getClass();
            t.F1(yxf, array);
            if (!ugc.b(this.c0, 0L)) {
                final float[] w0 = yxf.w0;
                l8e.d(w0);
                final long c0 = this.c0;
                l8e.g(w0, -(float)(int)(c0 >> 32), -(float)(int)(c0 & 0xFFFFFFFFL));
                l8e.f(array, w0);
            }
            final gmg q0 = this.q0;
            if (q0 != null) {
                final float[] a = ((j6b)q0).a();
                if (a != null) {
                    l8e.f(array, a);
                }
            }
        }
    }
    
    public final void G1(final yxf obj, final float[] array) {
        yxf t = this;
        while (!t.equals(obj)) {
            final gmg q0 = t.q0;
            if (q0 != null) {
                l8e.f(array, ((j6b)q0).b());
            }
            final long c0 = t.c0;
            if (!ugc.b(c0, 0L)) {
                final float[] w0 = yxf.w0;
                l8e.d(w0);
                l8e.g(w0, (float)(int)(c0 >> 32), (float)(int)(c0 & 0xFFFFFFFFL));
                l8e.f(array, w0);
            }
            t = t.T;
            t.getClass();
        }
    }
    
    @Override
    public final long H(final nzc nzc, final long n) {
        return this.O(nzc, n, true);
    }
    
    public final void H1(final lta w, final boolean b) {
        if (w != null) {
            if (this.r0 != null) {
                gac.a("layerBlock can't be provided when explicitLayer is provided");
            }
        }
        final LayoutNode p2 = this.P;
        final boolean b2 = b || this.W != w || !mlc.q((Object)this.X, (Object)p2.U) || this.Y != p2.V;
        this.X = p2.U;
        this.Y = p2.V;
        final boolean v = p2.V();
        final sxf o0 = this.o0;
        if (!v || w == null) {
            this.W = null;
            final gmg q0 = this.q0;
            if (q0 != null) {
                final j6b j6b = (j6b)q0;
                if (!lq6.U(j6b.b())) {
                    p2.i0(this);
                }
                j6b.y = null;
                j6b.z = null;
                j6b.B = true;
                j6b.f(false);
                final d6b w2 = j6b.w;
                if (w2 != null) {
                    w2.a(j6b.v);
                    final AndroidComposeView x = j6b.x;
                    final vhk k0 = x.K0;
                    Reference poll;
                    inf inf;
                    do {
                        final ReferenceQueue referenceQueue = (ReferenceQueue)k0.x;
                        inf = (inf)k0.w;
                        poll = referenceQueue.poll();
                        if (poll != null) {
                            inf.k(poll);
                        }
                    } while (poll != null);
                    inf.b(new WeakReference((Object)j6b, (ReferenceQueue)k0.x));
                    x.V.k((Object)j6b);
                }
                this.q0 = null;
                p2.c0 = true;
                o0.a();
                if (this.h1().I && p2.W()) {
                    final Owner j = p2.J;
                    if (j != null) {
                        ((AndroidComposeView)j).w(p2);
                    }
                }
            }
            this.p0 = false;
            return;
        }
        this.W = w;
        if (this.q0 == null) {
            final Owner a = l0d.a(p2);
            txf n0;
            if ((n0 = this.n0) == null) {
                n0 = new txf((Object)this, (Object)new sxf(this, (byte)0), (byte)0);
                this.n0 = n0;
            }
            final gmg e = ((AndroidComposeView)a).e((zta)n0, o0, (g6b)null);
            final long x2 = super.x;
            final j6b j6b2 = (j6b)e;
            j6b2.e(x2);
            j6b2.d(this.c0);
            this.q0 = e;
            this.I1(true);
            p2.c0 = true;
            o0.a();
            return;
        }
        if (b2) {
            this.I1(true);
        }
    }
    
    @Override
    public final void I0() {
        final g6b r0 = this.r0;
        final long c0 = this.c0;
        if (r0 != null) {
            this.b0(c0, this.d0, r0);
            return;
        }
        this.a0(c0, this.d0, this.W);
    }
    
    public final void I1(final boolean b) {
        if (this.r0 == null) {
            final gmg q0 = this.q0;
            final lta w = this.W;
            if (q0 != null) {
                if (w == null) {
                    throw ge9.x("updateLayerParameters requires a non-null layerBlock");
                }
                final jqj u0 = yxf.u0;
                u0.a();
                final LayoutNode p = this.P;
                u0.M = p.U;
                u0.N = p.V;
                u0.K = uoo.Z(super.x);
                final Object o = new Object();
                l0d.a(p).getSnapshotObserver().a.d(this, (lta)yxf.s0, (jta)new qn1((Object)w, (Object)this, o, (byte)17));
                dzc f0;
                if ((f0 = this.f0) == null) {
                    f0 = new dzc();
                    this.f0 = f0;
                }
                final dzc v0 = yxf.v0;
                v0.getClass();
                v0.a = f0.a;
                v0.b = f0.b;
                v0.c = f0.c;
                v0.d = f0.d;
                v0.e = f0.e;
                v0.f = f0.f;
                v0.g = f0.g;
                f0.a = u0.w;
                f0.b = u0.x;
                f0.c = u0.z;
                f0.d = u0.A;
                f0.e = u0.E;
                f0.f = u0.F;
                f0.g = u0.G;
                final j6b j6b = (j6b)q0;
                final AndroidComposeView x = j6b.x;
                final int n = u0.v | j6b.I;
                j6b.G = u0.N;
                final xc8 m = u0.M;
                j6b.F = m;
                if ((0x100000 & n) != 0x0) {
                    final g6b v2 = j6b.v;
                    u0.L.getClass();
                    final int l0 = m.L0(0.0f);
                    u0.L.getClass();
                    final int l2 = m.L0(0.0f);
                    u0.L.getClass();
                    final int l3 = m.L0(0.0f);
                    u0.L.getClass();
                    final int l4 = m.L0(0.0f);
                    v2.v = l0;
                    v2.w = l2;
                    v2.x = l3;
                    v2.y = l4;
                    v2.a.w(l0, l2, l3, l4);
                    j6b.c();
                }
                final int n2 = n & 0x1000;
                if (n2 != 0) {
                    j6b.J = u0.G;
                }
                if ((n & 0x1) != 0x0) {
                    final g6b v3 = j6b.v;
                    final float w2 = u0.w;
                    final i6b a = v3.a;
                    if (a.b() != w2) {
                        a.D(w2);
                    }
                }
                if ((n & 0x2) != 0x0) {
                    final g6b v4 = j6b.v;
                    final float x2 = u0.x;
                    final i6b a2 = v4.a;
                    if (a2.O() != x2) {
                        a2.n(x2);
                    }
                }
                if ((n & 0x4) != 0x0) {
                    j6b.v.g(u0.y);
                }
                if ((n & 0x8) != 0x0) {
                    final g6b v5 = j6b.v;
                    final float z = u0.z;
                    final i6b a3 = v5.a;
                    if (a3.F() != z) {
                        a3.J(z);
                    }
                }
                if ((n & 0x10) != 0x0) {
                    final g6b v6 = j6b.v;
                    final float a4 = u0.A;
                    final i6b a5 = v6.a;
                    if (a5.x() != a4) {
                        a5.f(a4);
                    }
                }
                if ((n & 0x20) != 0x0) {
                    final g6b v7 = j6b.v;
                    final float b2 = u0.B;
                    final i6b a6 = v7.a;
                    if (a6.N() != b2) {
                        a6.c(b2);
                        v7.g = true;
                        v7.a();
                    }
                    if (u0.B > 0.0f && !j6b.O) {
                        final jta z2 = j6b.z;
                        if (z2 != null) {
                            z2.a();
                        }
                    }
                }
                if ((n & 0x40) != 0x0) {
                    final g6b v8 = j6b.v;
                    final long c = u0.C;
                    final i6b a7 = v8.a;
                    final long t = a7.t();
                    final int i = j86.i;
                    if (!foo.a(c, t)) {
                        a7.B(c);
                    }
                }
                if ((n & 0x80) != 0x0) {
                    final g6b v9 = j6b.v;
                    final long d = u0.D;
                    final i6b a8 = v9.a;
                    final long a9 = a8.A();
                    final int j = j86.i;
                    if (!foo.a(d, a9)) {
                        a8.K(d);
                    }
                }
                if ((n & 0x400) != 0x0) {
                    final g6b v10 = j6b.v;
                    final float e = u0.E;
                    final i6b a10 = v10.a;
                    if (a10.r() != e) {
                        a10.e(e);
                    }
                }
                if ((n & 0x100) != 0x0) {
                    final i6b a11 = j6b.v.a;
                    if (a11.H() != 0.0f) {
                        a11.u();
                    }
                }
                if ((n & 0x200) != 0x0) {
                    final i6b a12 = j6b.v.a;
                    if (a12.o() != 0.0f) {
                        a12.z();
                    }
                }
                if ((n & 0x800) != 0x0) {
                    final g6b v11 = j6b.v;
                    final float f2 = u0.F;
                    final i6b a13 = v11.a;
                    if (a13.E() != f2) {
                        a13.M(f2);
                    }
                }
                if (n2 != 0) {
                    final boolean a14 = jeo.a(j6b.J, jeo.b);
                    final g6b v12 = j6b.v;
                    if (a14) {
                        if (!l6g.c(v12.z, 9205357640488583168L)) {
                            v12.z = 9205357640488583168L;
                            v12.a.s(9205357640488583168L);
                        }
                    }
                    else {
                        final long z3 = ((long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(j6b.J & 0xFFFFFFFFL)) * (int)(j6b.A & 0xFFFFFFFFL)) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(Float.intBitsToFloat((int)(j6b.J >> 32)) * (int)(j6b.A >> 32)) << 32;
                        if (!l6g.c(v12.z, z3)) {
                            v12.z = z3;
                            v12.a.s(z3);
                        }
                    }
                }
                if ((n & 0x4000) != 0x0) {
                    final g6b v13 = j6b.v;
                    final boolean k = u0.I;
                    if (v13.A != k) {
                        v13.A = k;
                        v13.g = true;
                        v13.a();
                    }
                }
                if ((0x20000 & n) != 0x0) {
                    final g6b v14 = j6b.v;
                    final r1 o2 = u0.O;
                    final i6b a15 = v14.a;
                    if (!mlc.q((Object)a15.d(), (Object)o2)) {
                        a15.y(o2);
                    }
                }
                if ((0x40000 & n) != 0x0) {
                    final i6b a16 = j6b.v.a;
                    if (!mlc.q((Object)a16.m(), (Object)null)) {
                        a16.C();
                    }
                }
                if ((0x80000 & n) != 0x0) {
                    final g6b v15 = j6b.v;
                    final byte p2 = u0.P;
                    final i6b a17 = v15.a;
                    if (a17.P() != p2) {
                        a17.h(p2);
                    }
                }
                if ((0x8000 & n) != 0x0) {
                    final g6b v16 = j6b.v;
                    final int j2 = u0.J;
                    int n3;
                    if (j2 == 0) {
                        n3 = 0;
                    }
                    else if (j2 == 1) {
                        n3 = 1;
                    }
                    else {
                        n3 = 2;
                        if (j2 != 2) {
                            en9.q("Not supported composition strategy");
                            return;
                        }
                    }
                    final i6b a18 = v16.a;
                    if (a18.l() != n3) {
                        a18.I(n3);
                    }
                }
                if ((n & 0x1F1B) != 0x0) {
                    j6b.L = true;
                    j6b.M = true;
                }
                boolean b4;
                if (!mlc.q((Object)j6b.K, (Object)u0.Q)) {
                    final k8e q2 = u0.Q;
                    if ((j6b.K = q2) != null) {
                        final g6b v17 = j6b.v;
                        if (q2 instanceof rig) {
                            final k2j e2 = ((rig)q2).e;
                            final float a19 = e2.a;
                            final float b3 = e2.b;
                            v17.h(0.0f, (long)Float.floatToRawIntBits(a19) << 32 | ((long)Float.floatToRawIntBits(b3) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(e2.c - a19) << 32 | ((long)Float.floatToRawIntBits(e2.d - b3) & 0xFFFFFFFFL));
                        }
                        else if (q2 instanceof qig) {
                            final g90 e3 = ((qig)q2).e;
                            v17.k = null;
                            v17.i = 9205357640488583168L;
                            v17.h = 0L;
                            v17.j = 0.0f;
                            v17.g = true;
                            v17.n = false;
                            v17.l = e3;
                            v17.a();
                        }
                        else {
                            if (!(q2 instanceof sig)) {
                                en9.r();
                                return;
                            }
                            final sig sig = (sig)q2;
                            final g90 f3 = sig.f;
                            if (f3 != null) {
                                v17.k = null;
                                v17.i = 9205357640488583168L;
                                v17.h = 0L;
                                v17.j = 0.0f;
                                v17.g = true;
                                v17.n = false;
                                v17.l = f3;
                                v17.a();
                            }
                            else {
                                final lvj e4 = sig.e;
                                v17.h(Float.intBitsToFloat((int)(e4.h >> 32)), (long)Float.floatToRawIntBits(e4.a) << 32 | ((long)Float.floatToRawIntBits(e4.b) & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(e4.b()) << 32 | ((long)Float.floatToRawIntBits(e4.a()) & 0xFFFFFFFFL));
                            }
                        }
                        if (Build$VERSION.SDK_INT < 33 && (q2 instanceof qig || (q2 instanceof sig && !t08.U(((sig)q2).e)))) {
                            final jta z4 = j6b.z;
                            if (z4 != null) {
                                z4.a();
                            }
                        }
                    }
                    b4 = true;
                }
                else {
                    b4 = false;
                }
                j6b.I = u0.v;
                if (n != 0 || b4) {
                    final ViewParent parent = ((View)x).getParent();
                    if (parent != null) {
                        parent.onDescendantInvalidated((View)x, (View)x);
                    }
                    if (AndroidComposeView.m()) {
                        x.N(0.0f);
                    }
                }
                final boolean v18 = this.V;
                this.V = u0.I;
                this.Z = u0.y;
                final boolean b5 = v0.a == f0.a && v0.b == f0.b && v0.c == f0.c && v0.d == f0.d && v0.e == f0.e && v0.f == f0.f && jeo.a(v0.g, f0.g);
                if (b && (!b5 || v18 != this.V || ((x3j)o).v)) {
                    final Owner j3 = p.J;
                    if (j3 != null) {
                        ((AndroidComposeView)j3).w(p);
                    }
                }
                if (!b5) {
                    p.i0(this);
                    if (p.i0 > 0) {
                        final AndroidComposeView androidComposeView = (AndroidComposeView)l0d.a(p);
                        final e3a e3a = (e3a)androidComposeView.o0.f;
                        if (p.i0 > 0) {
                            ((inf)e3a.w).b(p);
                            p.h0 = true;
                        }
                        androidComposeView.G((LayoutNode)null);
                    }
                }
            }
            else if (w != null) {
                gac.c("null layer with a non-null layerBlock");
            }
        }
    }
    
    public final boolean J1(final long n) {
        if (((0x7F8000007F800000L ^ (n & 0x7F8000007F800000L)) - 4294967297L & 0x8000000080000000L) == 0x0L) {
            final gmg q0 = this.q0;
            if (q0 != null && this.V) {
                final j6b j6b = (j6b)q0;
                final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
                final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
                final g6b v = j6b.v;
                if (v.A && !w5r.i(v.e(), intBitsToFloat, intBitsToFloat2)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public final long K(long h) {
        if (!this.h1().I) {
            gac.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        h = ((AndroidComposeView)l0d.a(this.P)).H(h);
        return this.O(r9n.t((nzc)this), h, true);
    }
    
    @Override
    public final k2j L(final nzc nzc, final boolean b) {
        if (!this.h1().I) {
            gac.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!nzc.p()) {
            final StringBuilder sb = new StringBuilder("LayoutCoordinates ");
            sb.append((Object)nzc);
            sb.append(" is not attached!");
            gac.c(sb.toString());
        }
        final yxf d1 = D1(nzc);
        d1.r1();
        final yxf d2 = this.d1(d1);
        smf e0;
        if ((e0 = this.e0) == null) {
            e0 = new smf(0.0f, 0.0f, 0.0f, 0.0f);
            this.e0 = e0;
        }
        e0.a = 0.0f;
        e0.b = 0.0f;
        e0.c = (float)(int)(nzc.k() >> 32);
        e0.d = (float)(int)(nzc.k() & 0xFFFFFFFFL);
        yxf t = d1;
        while (t != d2) {
            t.z1(e0, b, false);
            if (e0.b()) {
                return k2j.e;
            }
            t = t.T;
            t.getClass();
        }
        this.O0(d2, e0, b);
        return new k2j(e0.a, e0.b, e0.c, e0.d);
    }
    
    @Override
    public final long N(long n) {
        if (!this.h1().I) {
            gac.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        this.r1();
        for (yxf t = this; t != null; t = t.T) {
            final LayoutNode p = t.P;
            if (t == p.getOuterCoordinator$ui() && !p.x) {
                final long b = l0d.a(p).getRectManager().b(p);
                if (!ugc.b(b, 9223372034707292159L)) {
                    return zrn.N(n, b);
                }
            }
            final gmg q0 = t.q0;
            long b2 = n;
            if (q0 != null) {
                final j6b j6b = (j6b)q0;
                final float[] b3 = j6b.b();
                if (j6b.N) {
                    b2 = n;
                }
                else {
                    b2 = l8e.b(n, b3);
                }
            }
            n = zrn.N(b2, t.c0);
        }
        return n;
    }
    
    @Override
    public final long O(final nzc nzc, long n, final boolean b) {
        if (nzc instanceof zxd) {
            final zxd zxd = (zxd)nzc;
            zxd.v.P.r1();
            return zxd.O(this, n ^ 0x8000000080000000L, b) ^ 0x8000000080000000L;
        }
        yxf yxf = D1(nzc);
        yxf.r1();
        final yxf d1 = this.d1(yxf);
        while (yxf != d1) {
            final gmg q0 = yxf.q0;
            long b2 = n;
            if (q0 != null) {
                final j6b j6b = (j6b)q0;
                final float[] b3 = j6b.b();
                if (j6b.N) {
                    b2 = n;
                }
                else {
                    b2 = l8e.b(n, b3);
                }
            }
            if (!b && yxf.G) {
                n = b2;
            }
            else {
                n = zrn.N(b2, yxf.c0);
            }
            yxf = yxf.T;
            yxf.getClass();
        }
        return this.R0(d1, n, b);
    }
    
    public final void O0(final yxf yxf, final smf smf, final boolean b) {
        if (yxf != this) {
            final yxf t = this.T;
            if (t != null) {
                t.O0(yxf, smf, b);
            }
            final long c0 = this.c0;
            final int n = (int)(c0 >> 32);
            final float a = smf.a;
            final float n2 = (float)n;
            smf.a = a - n2;
            smf.c -= n2;
            final int n3 = (int)(c0 & 0xFFFFFFFFL);
            final float b2 = smf.b;
            final float n4 = (float)n3;
            smf.b = b2 - n4;
            smf.d -= n4;
            final gmg q0 = this.q0;
            if (q0 != null) {
                final j6b j6b = (j6b)q0;
                final float[] a2 = j6b.a();
                if (!j6b.N) {
                    if (a2 == null) {
                        smf.a = 0.0f;
                        smf.b = 0.0f;
                        smf.c = 0.0f;
                        smf.d = 0.0f;
                    }
                    else {
                        l8e.c(a2, smf);
                    }
                }
                if (this.V && b) {
                    final long x = super.x;
                    smf.a(0.0f, 0.0f, (float)(int)(x >> 32), (float)(int)(x & 0xFFFFFFFFL));
                }
            }
        }
    }
    
    public final long R0(final yxf yxf, final long n, final boolean b) {
        if (yxf == this) {
            return n;
        }
        final yxf t = this.T;
        if (t != null && !mlc.q((Object)yxf, (Object)t)) {
            return this.e1(t.R0(yxf, n, b), b);
        }
        return this.e1(n, b);
    }
    
    public final long V0(long n) {
        float n2;
        if (this.i1()) {
            final k2j h0 = this.h0;
            n2 = h0.c - h0.a;
        }
        else {
            n2 = (float)this.V();
        }
        float n3;
        if (this.i1()) {
            final k2j h2 = this.h0;
            n3 = h2.d - h2.b;
        }
        else {
            n3 = (float)this.T();
        }
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        final float max = Math.max(0.0f, (intBitsToFloat - n2) / 2.0f);
        final float max2 = Math.max(0.0f, (intBitsToFloat2 - n3) / 2.0f);
        n = Float.floatToRawIntBits(max);
        return ((long)Float.floatToRawIntBits(max2) & 0xFFFFFFFFL) | n << 32;
    }
    
    public final float X0(long n, long v0) {
        if (this.V() < Float.intBitsToFloat((int)(v0 >> 32)) || this.T() < Float.intBitsToFloat((int)(v0 & 0xFFFFFFFFL))) {
            v0 = this.V0(v0);
            final float intBitsToFloat = Float.intBitsToFloat((int)(v0 >> 32));
            final float intBitsToFloat2 = Float.intBitsToFloat((int)(v0 & 0xFFFFFFFFL));
            final float intBitsToFloat3 = Float.intBitsToFloat((int)(n >> 32));
            float n2;
            if (intBitsToFloat3 < 0.0f) {
                n2 = -intBitsToFloat3;
            }
            else {
                n2 = intBitsToFloat3 - this.V();
            }
            final float max = Math.max(0.0f, n2);
            final float intBitsToFloat4 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
            float n3;
            if (intBitsToFloat4 < 0.0f) {
                n3 = -intBitsToFloat4;
            }
            else {
                n3 = intBitsToFloat4 - this.T();
            }
            n = ((long)Float.floatToRawIntBits(max) << 32 | ((long)Float.floatToRawIntBits(Math.max(0.0f, n3)) & 0xFFFFFFFFL));
            if ((intBitsToFloat > 0.0f || intBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int)(n >> 32)) <= intBitsToFloat && Float.intBitsToFloat((int)(n & 0xFFFFFFFFL)) <= intBitsToFloat2) {
                return l6g.e(n);
            }
        }
        return Float.POSITIVE_INFINITY;
    }
    
    public final void Y0(final x13 x13, final g6b w) {
        final gmg q0 = this.q0;
        if (q0 != null) {
            final j6b j6b = (j6b)q0;
            final z13 h = j6b.H;
            j6b.g();
            j6b.O = (j6b.v.a.N() > 0.0f);
            final zn0 w2 = h.w;
            w2.G(x13);
            w2.w = w;
            r9n.p((cw8)h, j6b.v);
            return;
        }
        final long c0 = this.c0;
        final float n = (float)(int)(c0 >> 32);
        final float n2 = (float)(int)(c0 & 0xFFFFFFFFL);
        x13.n(n, n2);
        this.a1(x13, w);
        x13.n(-n, -n2);
    }
    
    public final void a1(final x13 x13, final g6b g6b) {
        final hgf j1 = this.j1(4);
        if (j1 == null) {
            this.x1(x13, g6b);
            return;
        }
        final LayoutNode p2 = this.P;
        p2.getClass();
        final k0d sharedDrawScope = l0d.a(p2).getSharedDrawScope();
        final long z = uoo.Z(super.x);
        sharedDrawScope.getClass();
        inf inf = null;
        hgf g = j1;
    Label_0265_Outer:
        while (g != null) {
            while (true) {
                inf inf2 = null;
                Label_0268: {
                    if (g instanceof bw8) {
                        sharedDrawScope.b(x13, z, this, (bw8)g, g6b);
                        inf2 = inf;
                        break Label_0268;
                    }
                    inf2 = inf;
                    if ((g.x & 0x4) == 0x0) {
                        break Label_0268;
                    }
                    inf2 = inf;
                    if (!(g instanceof v98)) {
                        break Label_0268;
                    }
                    hgf hgf = ((v98)g).K;
                    int n = 0;
                    while (hgf != null) {
                        hgf hgf2 = g;
                        inf inf3 = inf;
                        int n2 = n;
                        if ((hgf.x & 0x4) != 0x0) {
                            n2 = n + 1;
                            if (n2 == 1) {
                                hgf2 = hgf;
                                inf3 = inf;
                            }
                            else {
                                inf inf4;
                                if ((inf4 = inf) == null) {
                                    inf4 = new inf(0, new hgf[16]);
                                }
                                hgf hgf3;
                                if ((hgf3 = g) != null) {
                                    inf4.b(g);
                                    hgf3 = null;
                                }
                                inf4.b(hgf);
                                inf3 = inf4;
                                hgf2 = hgf3;
                            }
                        }
                        hgf = hgf.A;
                        g = hgf2;
                        inf = inf3;
                        n = n2;
                    }
                    inf2 = inf;
                    if (n == 1) {
                        continue Label_0265_Outer;
                    }
                    break Label_0268;
                    continue Label_0265_Outer;
                }
                g = soh.G(inf2);
                inf = inf2;
                continue;
            }
        }
    }
    
    @Override
    public final long b(long n) {
        n = this.N(n);
        final AndroidComposeView androidComposeView = (AndroidComposeView)l0d.a(this.P);
        androidComposeView.B();
        return l8e.b(n, androidComposeView.t0);
    }
    
    @Override
    public abstract void b0(final long p0, final float p1, final g6b p2);
    
    public abstract void c1();
    
    public final yxf d1(final yxf yxf) {
        final LayoutNode p = yxf.P;
        final LayoutNode p2 = this.P;
        LayoutNode g = p;
        if (p == p2) {
            final hgf h1 = yxf.h1();
            final hgf h2 = this.h1();
            if (!h2.v.I) {
                gac.c("visitLocalAncestors called on an unattached node");
            }
            for (hgf hgf = h2.v.z; hgf != null; hgf = hgf.z) {
                if ((hgf.x & 0x2) != 0x0 && hgf == h1) {
                    return yxf;
                }
            }
        }
        else {
            while (g.L > p2.L) {
                g = g.G();
                g.getClass();
            }
            LayoutNode g2 = p2;
            LayoutNode g3;
            LayoutNode g4;
            while (true) {
                g3 = g;
                g4 = g2;
                if (g2.L <= g.L) {
                    break;
                }
                g2 = g2.G();
                g2.getClass();
            }
            while (g3 != g4) {
                g3 = g3.G();
                g4 = g4.G();
                if (g3 != null && g4 != null) {
                    continue;
                }
                en9.s("layouts are not part of the same hierarchy");
                return null;
            }
            if (g4 != p2) {
                if (g3 == yxf.P) {
                    return yxf;
                }
                return (lcc)g3.Z.y;
            }
        }
        return this;
    }
    
    public final long e1(long n, final boolean b) {
        if (b || !super.G) {
            final long c0 = this.c0;
            final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
            final float n2 = (float)(int)(c0 >> 32);
            final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
            final float n3 = (float)(int)(c0 & 0xFFFFFFFFL);
            n = Float.floatToRawIntBits(intBitsToFloat - n2);
            n = (((long)Float.floatToRawIntBits(intBitsToFloat2 - n3) & 0xFFFFFFFFL) | n << 32);
        }
        final gmg q0 = this.q0;
        if (q0 != null) {
            final j6b j6b = (j6b)q0;
            final float[] a = j6b.a();
            if (a == null) {
                return 9187343241974906880L;
            }
            if (!j6b.N) {
                return l8e.b(n, a);
            }
        }
        return n;
    }
    
    public abstract yxd f1();
    
    public final long g1() {
        return this.X.T0(this.P.W.e());
    }
    
    public final float getDensity() {
        return this.P.U.getDensity();
    }
    
    public final qzc getLayoutDirection() {
        return this.P.V;
    }
    
    @Override
    public final void h(final float[] array) {
        final Owner a = l0d.a(this.P);
        final yxf d1 = D1(r9n.t((nzc)this));
        this.G1(d1, array);
        if (a instanceof AndroidComposeView) {
            ((AndroidComposeView)a).q(array);
            return;
        }
        final long t = d1.t(0L);
        if ((0x7FFFFFFF7FFFFFFFL & t) != 0x7FC000007FC00000L) {
            l8e.g(array, Float.intBitsToFloat((int)(t >> 32)), Float.intBitsToFloat((int)(t & 0xFFFFFFFFL)));
        }
    }
    
    public abstract hgf h1();
    
    public final boolean i1() {
        return this.j0 && !this.h0.j();
    }
    
    @Override
    public final void j(final nzc nzc, final float[] array) {
        final yxf d1 = D1(nzc);
        d1.r1();
        final yxf d2 = this.d1(d1);
        l8e.d(array);
        d1.G1(d2, array);
        this.F1(d2, array);
    }
    
    public final hgf j1(final int n) {
        final boolean g = zxf.g(n);
        hgf hgf = this.h1();
        if (!g) {
            if ((hgf = hgf.z) == null) {
                return null;
            }
        }
        for (hgf hgf2 = this.k1(g); hgf2 != null && (hgf2.y & n) != 0x0; hgf2 = hgf2.A) {
            if ((hgf2.x & n) != 0x0) {
                return hgf2;
            }
            if (hgf2 == hgf) {
                break;
            }
        }
        return null;
    }
    
    @Override
    public final long k() {
        return super.x;
    }
    
    public final hgf k1(final boolean b) {
        final LayoutNode p = this.P;
        if (p.getOuterCoordinator$ui() == this) {
            return (hgf)p.Z.B;
        }
        final yxf t = this.T;
        if (b) {
            if (t != null) {
                final hgf h1 = t.h1();
                if (h1 != null) {
                    return h1.A;
                }
            }
        }
        else if (t != null) {
            return t.h1();
        }
        return null;
    }
    
    public final void l1(final hgf hgf, final xxf xxf, final long n, final dkb dkb, final int n2, final boolean b) {
        if (hgf == null) {
            this.o1(xxf, n, dkb, n2, b);
            return;
        }
        if (!xxf.d(hgf)) {
            this.l1(rar.w((t98)hgf, xxf.c()), xxf, n, dkb, n2, b);
            return;
        }
        final int x = dkb.x;
        final emf v = dkb.v;
        dkb.d(x + 1, v.b);
        ++dkb.x;
        v.b((Object)hgf);
        dkb.w.a(u5r.g(-1.0f, b, false));
        this.l1(rar.w((t98)hgf, xxf.c()), xxf, n, dkb, n2, b);
        dkb.x = x;
    }
    
    public final void m1(final hgf hgf, final xxf xxf, final long n, final dkb dkb, final int n2, final boolean b, final float n3) {
        if (hgf == null) {
            this.o1(xxf, n, dkb, n2, b);
            return;
        }
        if (!xxf.d(hgf)) {
            this.m1(rar.w((t98)hgf, xxf.c()), xxf, n, dkb, n2, b, n3);
            return;
        }
        final int x = dkb.x;
        final emf v = dkb.v;
        dkb.d(x + 1, v.b);
        ++dkb.x;
        v.b((Object)hgf);
        dkb.w.a(u5r.g(n3, b, false));
        this.w1(rar.w((t98)hgf, xxf.c()), xxf, n, dkb, n2, b, n3, true);
        dkb.x = x;
    }
    
    public final void n1(final xxf xxf, final long n, final dkb dkb, final int n2, final boolean b) {
        final hgf j1 = this.j1(xxf.c());
        if (!this.J1(n)) {
            if (xeh.b(n2, 1)) {
                final float x0 = this.X0(n, this.g1());
                if ((Float.floatToRawIntBits(x0) & Integer.MAX_VALUE) < 2139095040) {
                    if (dkb.x != lq6.P((List)dkb)) {
                        if (t8r.k(dkb.a(), u5r.c(x0, false)) <= 0) {
                            return;
                        }
                    }
                    this.m1(j1, xxf, n, dkb, n2, false, x0);
                }
            }
            return;
        }
        if (j1 == null) {
            this.o1(xxf, n, dkb, n2, b);
            return;
        }
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        if (intBitsToFloat >= 0.0f && intBitsToFloat2 >= 0.0f && intBitsToFloat < this.V() && intBitsToFloat2 < this.T()) {
            this.l1(j1, xxf, n, dkb, n2, b);
            return;
        }
        float x2;
        if (!xeh.b(n2, 1)) {
            x2 = Float.POSITIVE_INFINITY;
        }
        else {
            x2 = this.X0(n, this.g1());
        }
        while (true) {
            Label_0285: {
                if ((Float.floatToRawIntBits(x2) & Integer.MAX_VALUE) >= 2139095040) {
                    break Label_0285;
                }
                if (dkb.x != lq6.P((List)dkb)) {
                    if (t8r.k(dkb.a(), u5r.c(x2, b)) <= 0) {
                        break Label_0285;
                    }
                }
                final boolean b2 = true;
                this.w1(j1, xxf, n, dkb, n2, b, x2, b2);
                return;
            }
            final boolean b2 = false;
            continue;
        }
    }
    
    public final float o0() {
        return this.P.U.o0();
    }
    
    public void o1(final xxf xxf, final long n, final dkb dkb, final int n2, final boolean b) {
        final yxf s = this.S;
        if (s != null) {
            s.n1(xxf, s.e1(n, true), dkb, n2, b);
        }
    }
    
    @Override
    public final boolean p() {
        return this.h1().I;
    }
    
    public final void p1() {
        final gmg q0 = this.q0;
        if (q0 != null) {
            ((j6b)q0).c();
            return;
        }
        final yxf t = this.T;
        if (t != null) {
            t.p1();
        }
    }
    
    @Override
    public final wxd q0() {
        return this.S;
    }
    
    public final boolean q1() {
        if (this.q0 != null && this.Z <= 0.0f) {
            return true;
        }
        final yxf t = this.T;
        return t != null && t.q1();
    }
    
    public final void r1() {
        this.P.t().b();
    }
    
    public final void s1() {
        final boolean g = zxf.g(128);
        final hgf k1 = this.k1(g);
        if (k1 != null && (k1.v.y & 0x80) != 0x0) {
            final r7m a = q7m.a();
            lta e;
            if (a != null) {
                e = a.e();
            }
            else {
                e = null;
            }
            final r7m b = q7m.b(a);
            Label_0389: {
                hgf hgf = null;
                Label_0103: {
                    Label_0082: {
                        if (g) {
                            Label_0399: {
                                try {
                                    hgf = this.h1();
                                    break Label_0103;
                                }
                                finally {
                                    break Label_0399;
                                }
                                break Label_0082;
                            }
                            q7m.d(a, b, e);
                        }
                    }
                    if ((hgf = this.h1().z) == null) {
                        break Label_0389;
                    }
                }
                for (hgf hgf2 = this.k1(g); hgf2 != null && (hgf2.y & 0x80) != 0x0; hgf2 = hgf2.A) {
                    if ((hgf2.x & 0x80) != 0x0) {
                        hgf g2 = hgf2;
                        inf inf = null;
                        while (g2 != null) {
                            inf inf2;
                            if (g2 instanceof qoe) {
                                ((qoe)g2).c(super.x);
                                inf2 = inf;
                            }
                            else {
                                inf2 = inf;
                                if ((g2.x & 0x80) != 0x0) {
                                    inf2 = inf;
                                    if (g2 instanceof v98) {
                                        hgf hgf3 = ((v98)g2).K;
                                        int n = 0;
                                        while (hgf3 != null) {
                                            hgf hgf4 = g2;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf3.x & 0x80) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    hgf4 = hgf3;
                                                    inf3 = inf;
                                                }
                                                else {
                                                    inf inf4;
                                                    if ((inf4 = inf) == null) {
                                                        inf4 = new inf(0, new hgf[16]);
                                                    }
                                                    hgf hgf5;
                                                    if ((hgf5 = g2) != null) {
                                                        inf4.b(g2);
                                                        hgf5 = null;
                                                    }
                                                    inf4.b(hgf3);
                                                    inf3 = inf4;
                                                    hgf4 = hgf5;
                                                }
                                            }
                                            hgf3 = hgf3.A;
                                            g2 = hgf4;
                                            inf = inf3;
                                            n = n2;
                                        }
                                        inf2 = inf;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            g2 = soh.G(inf2);
                            inf = inf2;
                        }
                    }
                    if (hgf2 == hgf) {
                        break;
                    }
                }
            }
            q7m.d(a, b, e);
        }
    }
    
    @Override
    public final long t(long n) {
        if (!this.h1().I) {
            gac.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        n = this.N(n);
        return ((AndroidComposeView)l0d.a(this.P)).r(n);
    }
    
    public final void t1() {
        final boolean g = zxf.g(4194304);
        hgf hgf = this.h1();
        if (!g) {
            if ((hgf = hgf.z) == null) {
                return;
            }
        }
        for (hgf hgf2 = this.k1(g); hgf2 != null && (hgf2.y & 0x400000) != 0x0; hgf2 = hgf2.A) {
            if ((hgf2.x & 0x400000) != 0x0) {
                hgf g2 = hgf2;
                inf inf = null;
                while (g2 != null) {
                    inf inf2;
                    if (g2 instanceof jzc) {
                        ((jzc)g2).t((nzc)this);
                        inf2 = inf;
                    }
                    else {
                        inf2 = inf;
                        if ((g2.x & 0x400000) != 0x0) {
                            inf2 = inf;
                            if (g2 instanceof v98) {
                                hgf hgf3 = ((v98)g2).K;
                                int n = 0;
                                while (hgf3 != null) {
                                    hgf hgf4 = g2;
                                    inf inf3 = inf;
                                    int n2 = n;
                                    if ((hgf3.x & 0x400000) != 0x0) {
                                        n2 = n + 1;
                                        if (n2 == 1) {
                                            hgf4 = hgf3;
                                            inf3 = inf;
                                        }
                                        else {
                                            inf inf4;
                                            if ((inf4 = inf) == null) {
                                                inf4 = new inf(0, new hgf[16]);
                                            }
                                            hgf hgf5;
                                            if ((hgf5 = g2) != null) {
                                                inf4.b(g2);
                                                hgf5 = null;
                                            }
                                            inf4.b(hgf3);
                                            inf3 = inf4;
                                            hgf4 = hgf5;
                                        }
                                    }
                                    hgf3 = hgf3.A;
                                    g2 = hgf4;
                                    inf = inf3;
                                    n = n2;
                                }
                                inf2 = inf;
                                if (n == 1) {
                                    continue;
                                }
                            }
                        }
                    }
                    g2 = soh.G(inf2);
                    inf = inf2;
                }
            }
            if (hgf2 == hgf) {
                break;
            }
        }
    }
    
    @Override
    public final nzc u0() {
        return this;
    }
    
    public final void u1() {
        this.U = true;
        this.o0.a();
        this.A1();
        if (!ugc.b(this.c0, 0L)) {
            this.P.i0(this);
        }
    }
    
    @Override
    public final boolean v0() {
        return this.a0 != null;
    }
    
    public final void v1() {
        final boolean g = zxf.g(1048576);
        final hgf k1 = this.k1(g);
        if (k1 != null && (k1.v.y & 0x100000) != 0x0) {
            hgf hgf = this.h1();
            if (!g) {
                if ((hgf = hgf.z) == null) {
                    return;
                }
            }
            for (hgf hgf2 = this.k1(g); hgf2 != null && (hgf2.y & 0x100000) != 0x0; hgf2 = hgf2.A) {
                if ((hgf2.x & 0x100000) != 0x0) {
                    hgf g2 = hgf2;
                    inf inf = null;
                    while (g2 != null) {
                        inf inf2;
                        if (g2 instanceof jro) {
                            ((jro)g2).a1();
                            inf2 = inf;
                        }
                        else {
                            inf2 = inf;
                            if ((g2.x & 0x100000) != 0x0) {
                                inf2 = inf;
                                if (g2 instanceof v98) {
                                    hgf hgf3 = ((v98)g2).K;
                                    int n = 0;
                                    while (hgf3 != null) {
                                        hgf hgf4 = g2;
                                        inf inf3 = inf;
                                        int n2 = n;
                                        if ((hgf3.x & 0x100000) != 0x0) {
                                            n2 = n + 1;
                                            if (n2 == 1) {
                                                hgf4 = hgf3;
                                                inf3 = inf;
                                            }
                                            else {
                                                inf inf4;
                                                if ((inf4 = inf) == null) {
                                                    inf4 = new inf(0, new hgf[16]);
                                                }
                                                hgf hgf5;
                                                if ((hgf5 = g2) != null) {
                                                    inf4.b(g2);
                                                    hgf5 = null;
                                                }
                                                inf4.b(hgf3);
                                                inf3 = inf4;
                                                hgf4 = hgf5;
                                            }
                                        }
                                        hgf3 = hgf3.A;
                                        g2 = hgf4;
                                        inf = inf3;
                                        n = n2;
                                    }
                                    inf2 = inf;
                                    if (n == 1) {
                                        continue;
                                    }
                                }
                            }
                        }
                        g2 = soh.G(inf2);
                        inf = inf2;
                    }
                }
                if (hgf2 == hgf) {
                    break;
                }
            }
        }
    }
    
    @Override
    public final long w(final long n) {
        if (!this.h1().I) {
            gac.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        final nzc t = r9n.t((nzc)this);
        final AndroidComposeView androidComposeView = (AndroidComposeView)l0d.a(this.P);
        androidComposeView.B();
        return this.O(t, l6g.h(l8e.b(n, androidComposeView.u0), t.N(0L)), true);
    }
    
    public final void w1(final hgf hgf, final xxf xxf, long a, final dkb dkb, int n, final boolean b, final float n2, final boolean b2) {
        if (hgf == null) {
            this.o1(xxf, a, dkb, n, b);
            return;
        }
        if (!xxf.d(hgf)) {
            this.w1(rar.w((t98)hgf, xxf.c()), xxf, a, dkb, n, b, n2, b2);
            return;
        }
        if (xeh.b(n, 3) || xeh.b(n, 4)) {
            hgf g = hgf;
            inf inf = null;
        Label_0723_Outer:
            while (g != null) {
                if (!(g instanceof teh)) {
                    inf inf2 = inf;
                    while (true) {
                        Label_0726: {
                            if ((g.x & 0x10) == 0x0) {
                                break Label_0726;
                            }
                            inf2 = inf;
                            if (!(g instanceof v98)) {
                                break Label_0726;
                            }
                            hgf hgf2 = ((v98)g).K;
                            int n3 = 0;
                            while (hgf2 != null) {
                                hgf hgf3 = g;
                                inf inf3 = inf;
                                int n4 = n3;
                                if ((hgf2.x & 0x10) != 0x0) {
                                    n4 = n3 + 1;
                                    if (n4 == 1) {
                                        hgf3 = hgf2;
                                        inf3 = inf;
                                    }
                                    else {
                                        inf inf4;
                                        if ((inf4 = inf) == null) {
                                            inf4 = new inf(0, new hgf[16]);
                                        }
                                        hgf hgf4;
                                        if ((hgf4 = g) != null) {
                                            inf4.b(g);
                                            hgf4 = null;
                                        }
                                        inf4.b(hgf2);
                                        inf3 = inf4;
                                        hgf3 = hgf4;
                                    }
                                }
                                hgf2 = hgf2.A;
                                g = hgf3;
                                inf = inf3;
                                n3 = n4;
                            }
                            inf2 = inf;
                            if (n3 == 1) {
                                continue Label_0723_Outer;
                            }
                            break Label_0726;
                            continue Label_0723_Outer;
                        }
                        g = soh.G(inf2);
                        inf = inf2;
                        continue;
                    }
                }
                final long w = ((teh)g).w();
                final int n5 = (int)(a >> 32);
                final float intBitsToFloat = Float.intBitsToFloat(n5);
                final LayoutNode p8 = this.P;
                if (intBitsToFloat < -sbo.a(w, p8.V) || Float.intBitsToFloat(n5) >= sbo.b(w, p8.V) + this.V()) {
                    break;
                }
                final int n6 = (int)(0xFFFFFFFFL & a);
                if (Float.intBitsToFloat(n6) < -sbo.d(w) || Float.intBitsToFloat(n6) >= sbo.c(w) + this.T()) {
                    break;
                }
                final uxf uxf = new uxf(this, hgf, xxf, a, dkb, n, b, n2, b2);
                final qlf w2 = dkb.w;
                final emf v = dkb.v;
                if (dkb.x == lq6.P((List)dkb)) {
                    n = dkb.x;
                    dkb.d(n + 1, v.b);
                    ++dkb.x;
                    v.b((Object)hgf);
                    w2.a(u5r.g(0.0f, b, true));
                    uxf.a();
                    dkb.x = n;
                    return;
                }
                a = dkb.a();
                final int x = dkb.x;
                if (t8r.o(a)) {
                    n = lq6.P((List)dkb);
                    dkb.x = n;
                    dkb.d(n + 1, v.b);
                    ++dkb.x;
                    v.b((Object)hgf);
                    w2.a(u5r.g(0.0f, b, true));
                    uxf.a();
                    dkb.x = n;
                    if (t8r.l(dkb.a()) < 0.0f) {
                        dkb.d(x + 1, dkb.x + 1);
                    }
                    dkb.x = x;
                    return;
                }
                if (t8r.l(a) > 0.0f) {
                    n = dkb.x;
                    dkb.d(n + 1, v.b);
                    ++dkb.x;
                    v.b((Object)hgf);
                    w2.a(u5r.g(0.0f, b, true));
                    uxf.a();
                    dkb.x = n;
                }
                return;
            }
        }
        if (b2) {
            this.m1(hgf, xxf, a, dkb, n, b, n2);
            return;
        }
        this.C1(hgf, xxf, a, dkb, n, b, n2);
    }
    
    @Override
    public final LayoutNode x0() {
        return this.P;
    }
    
    public void x1(final x13 x13, final g6b g6b) {
        final LayoutNode p2 = this.P;
        final Owner a = l0d.a(p2);
        final inf l = p2.L();
        final Object[] v = l.v;
        for (int x14 = l.x, i = 0; i < x14; ++i) {
            final LayoutNode layoutNode = (LayoutNode)v[i];
            if (layoutNode.W()) {
                layoutNode.l(x13, g6b);
            }
        }
        if (a.getShowLayoutBounds()) {
            final y80 b0 = lcc.B0;
            final long x15 = super.x;
            x13.j(0.5f, 0.5f, (int)(x15 >> 32) - 0.5f, (int)(x15 & 0xFFFFFFFFL) - 0.5f, b0);
        }
    }
    
    @Override
    public final noe y0() {
        final noe a0 = this.a0;
        if (a0 != null) {
            return a0;
        }
        en9.q("Asking for measurement result of unmeasured layout modifier");
        return null;
    }
    
    public final void y1(final long c0, final float d0, final lta lta, final g6b r0) {
        final LayoutNode p4 = this.P;
        if (r0 != null) {
            if (lta != null) {
                gac.a("both ways to create layers shouldn't be used together");
            }
            if (this.r0 != r0) {
                this.r0 = null;
                this.H1(null, false);
                this.r0 = r0;
            }
            if (this.q0 == null) {
                final Owner a = l0d.a(p4);
                txf n0;
                if ((n0 = this.n0) == null) {
                    n0 = new txf((Object)this, (Object)new sxf(this, (byte)0), (byte)0);
                    this.n0 = n0;
                }
                final AndroidComposeView androidComposeView = (AndroidComposeView)a;
                final sxf o0 = this.o0;
                final gmg e = androidComposeView.e((zta)n0, o0, r0);
                final long x = super.x;
                final j6b j6b = (j6b)e;
                j6b.e(x);
                j6b.d(c0);
                this.q0 = e;
                p4.c0 = true;
                o0.a();
            }
        }
        else {
            if (this.r0 != null) {
                this.r0 = null;
                this.H1(null, false);
            }
            this.H1(lta, false);
        }
        if (!ugc.b(this.c0, c0)) {
            ((AndroidComposeView)l0d.a(p4)).N(-4.0f);
            this.c0 = c0;
            final gmg q0 = this.q0;
            if (q0 != null) {
                ((j6b)q0).d(c0);
            }
            else {
                final yxf t = this.T;
                if (t != null) {
                    t.p1();
                }
            }
            p4.i0(this);
            wxd.G0(this);
            final Owner j = p4.J;
            if (j != null) {
                ((AndroidComposeView)j).w(p4);
            }
        }
        this.d0 = d0;
        if (this == p4.getOuterCoordinator$ui()) {
            l0d.a(p4).getRectManager().g(p4);
        }
        if (!super.J) {
            this.n0(this.y0());
        }
    }
    
    @Override
    public final Object z() {
        final LayoutNode p = this.P;
        if (p.Z.l(64)) {
            this.h1();
            Object z = p.Z.A;
            Object o = null;
            while (z != null) {
                Object o2 = o;
                if ((((hgf)z).x & 0x40) != 0x0) {
                    Object g = z;
                    inf inf = null;
                    while (true) {
                        o2 = o;
                        if (g == null) {
                            break;
                        }
                        Object d;
                        inf inf2;
                        if (g instanceof msg) {
                            d = ((msg)g).d(p.U, o);
                            inf2 = inf;
                        }
                        else {
                            d = o;
                            inf2 = inf;
                            if ((((hgf)g).x & 0x40) != 0x0) {
                                d = o;
                                inf2 = inf;
                                if (g instanceof v98) {
                                    hgf hgf = ((v98)g).K;
                                    int n = 0;
                                    while (hgf != null) {
                                        v98 v98 = (v98)g;
                                        inf inf3 = inf;
                                        int n2 = n;
                                        if ((hgf.x & 0x40) != 0x0) {
                                            n2 = n + 1;
                                            if (n2 == 1) {
                                                v98 = (v98)hgf;
                                                inf3 = inf;
                                            }
                                            else {
                                                inf inf4;
                                                if ((inf4 = inf) == null) {
                                                    inf4 = new inf(0, new hgf[16]);
                                                }
                                                v98 v99;
                                                if ((v99 = (v98)g) != null) {
                                                    inf4.b(g);
                                                    v99 = null;
                                                }
                                                inf4.b(hgf);
                                                inf3 = inf4;
                                                v98 = v99;
                                            }
                                        }
                                        hgf = hgf.A;
                                        g = v98;
                                        inf = inf3;
                                        n = n2;
                                    }
                                    d = o;
                                    inf2 = inf;
                                    if (n == 1) {
                                        continue;
                                    }
                                }
                            }
                        }
                        g = soh.G(inf2);
                        o = d;
                        inf = inf2;
                    }
                }
                z = ((hgf)z).z;
                o = o2;
            }
            return o;
        }
        return null;
    }
    
    @Override
    public final wxd z0() {
        return this.T;
    }
    
    public final void z1(final smf smf, final boolean b, final boolean b2) {
        final gmg q0 = this.q0;
        if (q0 != null) {
            if (this.V) {
                if (b2) {
                    final long g1 = this.g1();
                    final float a = smf.a;
                    final float b3 = smf.b;
                    long n7 = 0L;
                    Label_0257: {
                        if (smf.c >= 0.0f) {
                            final long x = super.x;
                            if (a <= (int)(x >> 32) && smf.d >= 0.0f) {
                                if (b3 <= (int)(x & 0xFFFFFFFFL)) {
                                    final float intBitsToFloat = Float.intBitsToFloat((int)(g1 >> 32));
                                    final float intBitsToFloat2 = Float.intBitsToFloat((int)(g1 & 0xFFFFFFFFL));
                                    final float n = (intBitsToFloat - (smf.c - smf.a)) / 2.0f;
                                    float n2;
                                    if (n > 0.0f) {
                                        n2 = a - n;
                                    }
                                    else {
                                        final float n3 = -intBitsToFloat / 2.0f;
                                        n2 = a;
                                        if (a < n3) {
                                            n2 = n3;
                                        }
                                    }
                                    final float n4 = (intBitsToFloat2 - (smf.d - smf.b)) / 2.0f;
                                    float n5;
                                    if (n4 > 0.0f) {
                                        n5 = b3 - n4;
                                    }
                                    else {
                                        final float n6 = -intBitsToFloat2 / 2.0f;
                                        n5 = b3;
                                        if (b3 < n6) {
                                            n5 = n6;
                                        }
                                    }
                                    n7 = ((long)Float.floatToRawIntBits(n2) << 32 | ((long)Float.floatToRawIntBits(n5) & 0xFFFFFFFFL));
                                    break Label_0257;
                                }
                            }
                        }
                        n7 = 0L;
                    }
                    final float intBitsToFloat3 = Float.intBitsToFloat((int)(n7 >> 32));
                    final float intBitsToFloat4 = Float.intBitsToFloat((int)(n7 & 0xFFFFFFFFL));
                    final long x2 = super.x;
                    final int n8 = (int)(x2 >> 32);
                    final int n9 = (int)(x2 & 0xFFFFFFFFL);
                    final float n10 = (float)n8;
                    final int n11 = (int)(g1 >> 32);
                    final float min = Math.min(Float.intBitsToFloat(n11) + n10, Math.max(n10, Float.intBitsToFloat(n11) + intBitsToFloat3));
                    final float n12 = (float)n9;
                    final int n13 = (int)(g1 & 0xFFFFFFFFL);
                    smf.a(intBitsToFloat3, intBitsToFloat4, min, Math.min(Float.intBitsToFloat(n13) + n12, Math.max(n12, Float.intBitsToFloat(n13) + intBitsToFloat4)));
                }
                else if (b) {
                    final long x3 = super.x;
                    smf.a(0.0f, 0.0f, (float)(int)(x3 >> 32), (float)(int)(x3 & 0xFFFFFFFFL));
                }
                if (smf.b()) {
                    return;
                }
            }
            final j6b j6b = (j6b)q0;
            final float[] b4 = j6b.b();
            if (!j6b.N) {
                if (b4 == null) {
                    smf.a = 0.0f;
                    smf.b = 0.0f;
                    smf.c = 0.0f;
                    smf.d = 0.0f;
                }
                else {
                    l8e.c(b4, smf);
                }
            }
        }
        final long c0 = this.c0;
        final int n14 = (int)(c0 >> 32);
        final float a2 = smf.a;
        final float n15 = (float)n14;
        smf.a = a2 + n15;
        smf.c += n15;
        final int n16 = (int)(c0 & 0xFFFFFFFFL);
        final float b5 = smf.b;
        final float n17 = (float)n16;
        smf.b = b5 + n17;
        smf.d += n17;
    }
}
