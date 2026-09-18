import java.util.Collection;
import java.util.LinkedHashMap;
import android.os.Trace;
import java.util.Map;
import java.util.List;

public final class pfn extends hgf implements a0d, bw8, xsk
{
    public og0 J;
    public mnn K;
    public tna L;
    public lta M;
    public int N;
    public boolean O;
    public int P;
    public int Q;
    public List R;
    public lta S;
    public iqk T;
    public o86 U;
    public rfn V;
    public lta W;
    public Map X;
    public yjf Y;
    public nfn Z;
    public ofn a0;
    
    public pfn(final og0 j, final mnn k, final tna l, final lta m, final int n, final boolean o, final int p14, final int q, final List r, final lta s, final iqk t, final o86 u, final rfn v, final lta w) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p14;
        this.Q = q;
        this.R = r;
        this.S = s;
        this.T = t;
        this.U = u;
        this.V = v;
        this.W = w;
    }
    
    public final void I0(final k0d k0d) {
        if (!super.I) {
            return;
        }
        final iqk t = this.T;
        if (t != null) {
            t.a(k0d);
        }
        final x13 t2 = k0d.v.w.t();
        final yjf q1 = this.q1((xc8)k0d);
        final omn o = q1.o;
        Label_0485: {
            if (o == null) {
                break Label_0485;
            }
            final vjf b = o.b;
            final boolean e = o.e();
            boolean d = false;
            final boolean b2 = e && this.N != 3;
            if (b2) {
                final long c = o.c;
                final k2j f = rml.f(0L, (long)Float.floatToRawIntBits((float)(int)(c >> 32)) << 32 | ((long)Float.floatToRawIntBits((float)(int)(c & 0xFFFFFFFFL)) & 0xFFFFFFFFL));
                t2.g();
                x13.q(t2, f);
            }
            Label_0208: {
                try {
                    final mnn k = this.K;
                    final hcm a = k.a;
                    wgn wgn;
                    if ((wgn = a.m) == null) {
                        wgn = wgn.b;
                    }
                    break Label_0208;
                }
                finally {
                    if (b2) {
                        t2.p();
                    }
                    return;
                    final mnn k;
                    final hcm a;
                    final wgn wgn;
                    rpl rpl;
                    og0 j;
                    List r;
                    long n;
                    Object o2;
                    qm2 b3;
                    o86 u;
                    ofn a2;
                    Block_18_Outer:Label_0323_Outer:Label_0366_Outer:
                    while (true) {
                        rpl = rpl.d;
                    Label_0366:
                        while (true) {
                        Label_0323:
                            while (true) {
                            Block_16_Outer:
                                while (true) {
                                Label_0395:
                                    while (true) {
                                        Label_0383: {
                                            while (true) {
                                                Label_0229: {
                                                    break Label_0229;
                                                    Label_0418: {
                                                        j = this.J;
                                                    }
                                                    d = j.d(j.w.length());
                                                    break Block_18;
                                                    while (true) {
                                                        r = this.R;
                                                        iftrue(Label_0466:)(r != null && !((Collection)r).isEmpty());
                                                        return;
                                                        iftrue(Label_0466:)(d);
                                                        continue Label_0323_Outer;
                                                    }
                                                    iftrue(Label_0335:)(n == 16L);
                                                    Block_15: {
                                                        while (true) {
                                                            Block_12: {
                                                                Block_14: {
                                                                    break Block_14;
                                                                    o2 = gea.a;
                                                                    Label_0250: {
                                                                        break Label_0250;
                                                                        t2.p();
                                                                        break Label_0395;
                                                                        Label_0466:
                                                                        k0d.a();
                                                                        return;
                                                                    }
                                                                    b3 = k.b();
                                                                    iftrue(Label_0295:)(b3 == null);
                                                                    break Block_12;
                                                                    Label_0335:
                                                                    iftrue(Label_0361:)(this.K.c() == 16L);
                                                                    break Block_15;
                                                                    n = u.a();
                                                                    continue Label_0323;
                                                                }
                                                                break Label_0366;
                                                            }
                                                            z8r.g(b, t2, b3, this.K.a.a.a(), rpl, wgn, (dw8)o2);
                                                            break Label_0383;
                                                            Label_0295:
                                                            u = this.U;
                                                            iftrue(Label_0318:)(u == null);
                                                            continue Label_0366_Outer;
                                                        }
                                                    }
                                                    n = this.K.c();
                                                    break Label_0366;
                                                }
                                                iftrue(Label_0250:)((o2 = a.p) != null);
                                                continue Block_16_Outer;
                                            }
                                            vjf.i(b, t2, n, rpl, wgn, (dw8)o2, 32);
                                        }
                                        iftrue(Label_0395:)(!b2);
                                        continue Label_0366_Outer;
                                    }
                                    a2 = this.a0;
                                    iftrue(Label_0418:)(a2 == null || !a2.d());
                                    continue Label_0323_Outer;
                                }
                                Label_0318: {
                                    n = j86.h;
                                }
                                continue Label_0323;
                            }
                            Label_0361: {
                                n = j86.b;
                            }
                            continue Label_0366;
                        }
                        iftrue(Label_0229:)((rpl = a.n) != null);
                        continue Block_18_Outer;
                    }
                }
            }
        }
        uy8.n((Object)q1, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
    }
    
    public final int M0(final wxd wxd, final goe goe, final int n) {
        return zn2.q(this.q1((xc8)wxd).e(((flc)wxd).getLayoutDirection()).p());
    }
    
    public final noe b(final ooe ooe, final goe goe, long c) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            final yjf q1 = this.q1(ooe);
            final boolean c2 = q1.c(c, ooe.getLayoutDirection());
            final omn o = q1.o;
            if (o != null) {
                c = o.c;
                o.b.a.e();
                if (c2) {
                    soh.J((t98)this, 2).p1();
                    final lta m = this.M;
                    if (m != null) {
                        m.b((Object)o);
                    }
                    final iqk t = this.T;
                    if (t != null) {
                        t.d(o);
                    }
                    Object x;
                    if ((x = this.X) == null) {
                        x = new LinkedHashMap(2);
                    }
                    ((Map)x).put((Object)kx.a, (Object)Math.round(o.d));
                    ((Map)x).put((Object)kx.b, (Object)Math.round(o.e));
                    this.X = (Map)x;
                }
                final lta s = this.S;
                if (s != null) {
                    s.b((Object)o.f);
                }
                final int n = (int)(c >> 32);
                final int n2 = (int)(c & 0xFFFFFFFFL);
                final o8h u = goe.u(ri2.F(n, n, n2, n2));
                final Map x2 = this.X;
                x2.getClass();
                return ooe.Y(n, n2, x2, (lta)new t40(u, (byte)9));
            }
            final StringBuilder sb = new StringBuilder("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
            sb.append((Object)q1);
            throw new IllegalStateException(sb.toString());
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final int g(final wxd wxd, final goe goe, final int n) {
        return this.q1((xc8)wxd).a(n, ((flc)wxd).getLayoutDirection());
    }
    
    public final int h(final wxd wxd, final goe goe, final int n) {
        return this.q1((xc8)wxd).a(n, ((flc)wxd).getLayoutDirection());
    }
    
    public final void j(final itk itk) {
        nfn z;
        if ((z = this.Z) == null) {
            z = new nfn(this, (byte)0);
            this.Z = z;
        }
        ftk.x(itk, this.J);
        final ofn a0 = this.a0;
        if (a0 != null) {
            final og0 c = a0.c();
            final htk d = etk.D;
            final auc[] a2 = ftk.a;
            final auc auc = a2[16];
            d.getClass();
            itk.a(d, c);
            final boolean d2 = a0.d();
            final htk e = etk.E;
            final auc auc2 = a2[17];
            e.getClass();
            itk.a(e, d2);
        }
        itk.a(rsk.l, new t3((String)null, (aua)new nfn(this, (byte)1)));
        itk.a(rsk.m, new t3((String)null, (aua)new nfn(this, (byte)2)));
        itk.a(rsk.n, new t3((String)null, (aua)new wfk((Object)this, (byte)12)));
        ftk.b(itk, (lta)z);
    }
    
    public final int k(final wxd wxd, final goe goe, final int n) {
        return zn2.q(this.q1((xc8)wxd).e(((flc)wxd).getLayoutDirection()).y());
    }
    
    public final void o1(final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        if (b2 || b3 || b4) {
            final yjf p4 = this.p1();
            final og0 j = this.J;
            final mnn k = this.K;
            final tna l = this.L;
            final int n = this.N;
            final boolean o = this.O;
            final int p5 = this.P;
            final int q = this.Q;
            final List r = this.R;
            final rfn v = this.V;
            p4.a = j;
            p4.f(k);
            p4.b = l;
            p4.c = n;
            p4.d = o;
            p4.e = p5;
            p4.f = q;
            p4.g = r;
            p4.h = v;
            p4.s = (p4.s << 2 | 0x2L);
            p4.m = null;
            p4.o = null;
            p4.q = -1;
            p4.p = -1;
            p4.r = null;
        }
        if (super.I) {
            if (b2 || (b && this.Z != null)) {
                soh.L((t98)this).T();
            }
            if (b2 || b3 || b4) {
                soh.L((t98)this).R();
                x90.z((bw8)this);
            }
            if (b) {
                x90.z((bw8)this);
            }
        }
    }
    
    public final yjf p1() {
        yjf y;
        if ((y = this.Y) == null) {
            y = new yjf(this.J, this.K, this.L, this.N, this.O, this.P, this.Q, this.R, this.V);
            this.Y = y;
        }
        y.getClass();
        return y;
    }
    
    public final yjf q1(final xc8 xc8) {
        final ofn a0 = this.a0;
        if (a0 != null && a0.d()) {
            final yjf a2 = a0.a();
            if (a2 != null) {
                a2.d(xc8);
                return a2;
            }
        }
        final yjf p = this.p1();
        p.d(xc8);
        return p;
    }
    
    public final boolean r1(final lta m, final lta s, final iqk t, final lta w) {
        boolean b;
        if (this.M != m) {
            this.M = m;
            b = true;
        }
        else {
            b = false;
        }
        if (this.S != s) {
            this.S = s;
            b = true;
        }
        if (!mlc.q((Object)this.T, (Object)t)) {
            this.T = t;
            b = true;
        }
        if (this.W != w) {
            this.W = w;
            return true;
        }
        return b;
    }
    
    public final boolean s1(final mnn k, final List r, final int q, final int p8, final boolean o, final tna l, final int n, final rfn v) {
        boolean b = this.K.d(k) ^ true;
        this.K = k;
        if (!mlc.q((Object)this.R, (Object)r)) {
            this.R = r;
            b = true;
        }
        if (this.Q != q) {
            this.Q = q;
            b = true;
        }
        if (this.P != p8) {
            this.P = p8;
            b = true;
        }
        if (this.O != o) {
            this.O = o;
            b = true;
        }
        if (!mlc.q((Object)this.L, (Object)l)) {
            this.L = l;
            b = true;
        }
        if (this.N != n) {
            this.N = n;
            b = true;
        }
        if (!mlc.q((Object)this.V, (Object)v)) {
            this.V = v;
            return true;
        }
        return b;
    }
    
    public final boolean t1(final og0 j) {
        final boolean q = mlc.q((Object)this.J.w, (Object)j.w);
        final boolean q2 = mlc.q((Object)this.J.v, (Object)j.v);
        final boolean b = !q || !q2;
        if (b) {
            this.J = j;
        }
        if (!q) {
            this.a0 = null;
        }
        return b;
    }
}
