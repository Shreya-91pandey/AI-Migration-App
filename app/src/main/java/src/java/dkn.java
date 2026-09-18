import java.util.concurrent.CancellationException;

public final class dkn
{
    public final bkn A;
    public final yjn B;
    public boolean C;
    public final bqo a;
    public o6g b;
    public lta c;
    public j7d d;
    public final ksg e;
    public lep f;
    public jta g;
    public y45 h;
    public oc7 i;
    public lbh j;
    public qnn k;
    public ccb l;
    public xma m;
    public final ksg n;
    public final ksg o;
    public long p;
    public dnn q;
    public long r;
    public final ksg s;
    public final ksg t;
    public int u;
    public mln v;
    public rzl w;
    public dnn x;
    public final ksg y;
    public final x9o z;
    
    public dkn(final bqo a) {
        this.a = a;
        this.b = (o6g)t5p.a;
        this.c = (lta)new cyl((byte)29);
        this.e = o50.Q((Object)new mln((String)null, 0L, 7));
        this.f = (lep)def.E;
        final Boolean booleanTrue = Boolean.TRUE;
        this.n = o50.Q((Object)true);
        this.o = o50.Q((Object)true);
        this.p = 0L;
        this.r = 0L;
        this.s = o50.Q((Object)null);
        this.t = o50.Q((Object)null);
        this.u = -1;
        this.v = new mln((String)null, 0L, 7);
        this.y = o50.Q((Object)Boolean.FALSE);
        this.z = (x9o)new g66((byte)1);
        this.A = new bkn(this);
        this.B = new yjn(this);
    }
    
    public static mln g(final og0 og0, final long n) {
        return new mln(og0, n, (dnn)null);
    }
    
    public final Object A(final h07 h07) {
        ckn ckn2 = null;
        Label_0047: {
            if (h07 instanceof ckn) {
                final ckn ckn = (ckn)h07;
                final int y = ckn.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ckn.y = y + Integer.MIN_VALUE;
                    ckn2 = ckn;
                    break Label_0047;
                }
            }
            ckn2 = new ckn(this, h07);
        }
        Object w = ckn2.w;
        final int y2 = ckn2.y;
        dkn v;
        if (y2 != 0) {
            if (y2 != 1) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v = ckn2.v;
            vt4.g0(w);
        }
        else {
            vt4.g0(w);
            if (this.h == null) {
                return lqo.a;
            }
            ckn2.v = this;
            ckn2.y = 1;
            final Boolean a = xiq.A(this);
            final pc7 v2 = pc7.v;
            v = this;
            if ((w = a) == v2) {
                return v2;
            }
        }
        final Boolean value = (Boolean)w;
        value.getClass();
        v.y.setValue((Object)value);
        return lqo.a;
    }
    
    public final void B(final boolean b) {
        final j7d d = this.d;
        if (d != null) {
            d.l.setValue((Object)b);
        }
        if (b) {
            this.z();
            return;
        }
        this.s();
    }
    
    public final long C(mln g, long c, final boolean b, final boolean b2, final ypk ypk, final boolean b3, final dcb dcb) {
        final j7d d = this.d;
        if (d != null) {
            final pmn d2 = d.d();
            if (d2 != null) {
                final o6g b4 = this.b;
                final long b5 = g.b;
                final og0 a = g.a;
                final int c2 = dnn.c;
                final long c3 = rhc.c(b4.G((int)(b5 >> 32)), this.b.G((int)(b5 & 0xFFFFFFFFL)));
                final boolean b6 = false;
                final int b7 = d2.b(c, false);
                int n;
                if (!b2 && !b) {
                    n = (int)(c3 >> 32);
                }
                else {
                    n = b7;
                }
                int n2;
                if (b2 && !b) {
                    n2 = (int)(c3 & 0xFFFFFFFFL);
                }
                else {
                    n2 = b7;
                }
                final rzl w = this.w;
                int n3 = -1;
                if (!b && w != null) {
                    final int u = this.u;
                    if (u != -1) {
                        n3 = u;
                    }
                }
                final rzl h = k1r.h(d2.a, n, n2, n3, c3, b, b2);
                if (h.m((qqk)w)) {
                    this.w = h;
                    this.u = b7;
                    final xpk a2 = ypk.a((qqk)h);
                    c = rhc.c(this.b.n(a2.c().a()), this.b.n(a2.b().a()));
                    if (!dnn.c(c, b5)) {
                        final boolean b8 = dnn.h(c) != dnn.h(b5) && dnn.c(rhc.c((int)(0xFFFFFFFFL & c), (int)(c >> 32)), b5);
                        final boolean b9 = dnn.d(c) && dnn.d(b5);
                        if (b3 && a.w.length() > 0 && !b8 && !b9 && dcb != null) {
                            final ccb l = this.l;
                            if (l != null) {
                                l.a(dcb.c());
                            }
                        }
                        g = g(a, c);
                        this.c.b((Object)g);
                        this.x = new dnn(c);
                        if (!b3) {
                            this.B(dnn.d(c) ^ true);
                        }
                        final j7d d3 = this.d;
                        if (d3 != null) {
                            d3.q.setValue((Object)b3);
                        }
                        final j7d d4 = this.d;
                        if (d4 != null) {
                            d4.m.setValue((Object)(!dnn.d(c) && xiq.B(this, true)));
                        }
                        final j7d d5 = this.d;
                        if (d5 != null) {
                            d5.n.setValue((Object)(!dnn.d(c) && xiq.B(this, false)));
                        }
                        final j7d d6 = this.d;
                        if (d6 != null) {
                            boolean b10 = b6;
                            if (dnn.d(c)) {
                                b10 = b6;
                                if (xiq.B(this, true)) {
                                    b10 = true;
                                }
                            }
                            d6.o.setValue((Object)b10);
                        }
                        return c;
                    }
                }
                return b5;
            }
        }
        return dnn.b;
    }
    
    public final boolean a() {
        return this.n() && dnn.d(this.r().b);
    }
    
    public final boolean b() {
        return !dnn.d(this.r().b) && !(this.f instanceof evg) && this.h != null;
    }
    
    public final boolean c() {
        return !dnn.d(this.r().b) && this.n() && !(this.f instanceof evg) && this.h != null;
    }
    
    public final boolean d() {
        return this.n() && (boolean)this.y.getValue() && this.h != null;
    }
    
    public final boolean e() {
        return dnn.e(this.r().b) != this.r().a.w.length();
    }
    
    public final wmm f(final boolean b) {
        final oc7 i = this.i;
        if (i != null) {
            return rhc.G(i, (hc7)null, 4, (zta)new si1((Object)this, b, (f07)null, (byte)12), 1);
        }
        return null;
    }
    
    public final void h() {
        final oc7 i = this.i;
        if (i != null) {
            rhc.G(i, (hc7)null, 4, (zta)new wjn(this, (f07)null, (byte)0), 1);
        }
    }
    
    public final void i(final l6g l6g) {
        if (!dnn.d(this.r().b)) {
            final j7d d = this.d;
            pmn d2;
            if (d != null) {
                d2 = d.d();
            }
            else {
                d2 = null;
            }
            int n;
            if (l6g != null && d2 != null) {
                n = this.b.n(d2.b(l6g.a, true));
            }
            else {
                n = dnn.f(this.r().b);
            }
            final mln a = mln.a(this.r(), (og0)null, rhc.c(n, n), 5);
            this.c.b((Object)a);
            this.x = new dnn(a.b);
        }
        tbb tbb;
        if (l6g != null && this.r().a.w.length() > 0) {
            tbb = tbb.x;
        }
        else {
            tbb = tbb.v;
        }
        this.y(tbb);
        this.B(false);
    }
    
    public final void j(final boolean b) {
        final j7d d = this.d;
        if (d != null && !d.b()) {
            final xma m = this.m;
            if (m != null) {
                xma.a(m);
            }
        }
        this.v = this.r();
        this.B(b);
        this.y(tbb.w);
    }
    
    public final k2j k() {
        j7d d = this.d;
        if (d != null) {
            if (d.p) {
                d = null;
            }
            if (d != null) {
                final o6g b = this.b;
                final long b2 = this.r().b;
                final int c = dnn.c;
                final int g = b.G((int)(b2 >> 32));
                final int g2 = this.b.G((int)(this.r().b & 0xFFFFFFFFL));
                final j7d d2 = this.d;
                final long n = 0L;
                long n2 = 0L;
                Label_0134: {
                    if (d2 != null) {
                        final nzc c2 = d2.c();
                        if (c2 != null) {
                            n2 = c2.N(this.p(true));
                            break Label_0134;
                        }
                    }
                    n2 = 0L;
                }
                final j7d d3 = this.d;
                long n3 = n;
                if (d3 != null) {
                    final nzc c3 = d3.c();
                    n3 = n;
                    if (c3 != null) {
                        n3 = c3.N(this.p(false));
                    }
                }
                final j7d d4 = this.d;
                final float n4 = 0.0f;
                float intBitsToFloat = 0.0f;
                Label_0278: {
                    if (d4 != null) {
                        final nzc c4 = d4.c();
                        if (c4 != null) {
                            final pmn d5 = d.d();
                            float b3;
                            if (d5 != null) {
                                b3 = d5.a.c(g).b;
                            }
                            else {
                                b3 = 0.0f;
                            }
                            intBitsToFloat = Float.intBitsToFloat((int)(c4.N(((long)Float.floatToRawIntBits(b3) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(0.0f) << 32) & 0xFFFFFFFFL));
                            break Label_0278;
                        }
                    }
                    intBitsToFloat = 0.0f;
                }
                final j7d d6 = this.d;
                float intBitsToFloat2 = n4;
                if (d6 != null) {
                    final nzc c5 = d6.c();
                    intBitsToFloat2 = n4;
                    if (c5 != null) {
                        final pmn d7 = d.d();
                        float b4;
                        if (d7 != null) {
                            b4 = d7.a.c(g2).b;
                        }
                        else {
                            b4 = 0.0f;
                        }
                        intBitsToFloat2 = Float.intBitsToFloat((int)(c5.N((long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(b4) & 0xFFFFFFFFL)) & 0xFFFFFFFFL));
                    }
                }
                final int n5 = (int)(n2 >> 32);
                final float intBitsToFloat3 = Float.intBitsToFloat(n5);
                final int n6 = (int)(n3 >> 32);
                return new k2j(Math.min(intBitsToFloat3, Float.intBitsToFloat(n6)), Math.min(intBitsToFloat, intBitsToFloat2), Math.max(Float.intBitsToFloat(n5), Float.intBitsToFloat(n6)), ((xc8)d.a.d).getDensity() * 25.0f + Math.max(Float.intBitsToFloat((int)(n2 & 0xFFFFFFFFL)), Float.intBitsToFloat((int)(n3 & 0xFFFFFFFFL))));
            }
        }
        return k2j.e;
    }
    
    public final yog l() {
        final og0 q = this.q();
        if (q != null) {
            final String w = q.w;
            if (w != null) {
                final dnn x = this.x;
                if (x != null) {
                    final long a = x.a;
                    return new yog((Object)w, (Object)new dnn(rhc.c(this.b.G((int)(a >> 32)), this.b.G((int)(a & 0xFFFFFFFFL)))));
                }
            }
        }
        return null;
    }
    
    public final l6g m() {
        return (l6g)this.t.getValue();
    }
    
    public final boolean n() {
        return (boolean)this.n.getValue();
    }
    
    public final boolean o() {
        return (boolean)this.o.getValue();
    }
    
    public final long p(final boolean b) {
        final j7d d = this.d;
        if (d != null) {
            final pmn d2 = d.d();
            if (d2 != null) {
                final omn a = d2.a;
                final og0 q = this.q();
                if (q != null) {
                    if (mlc.q((Object)q.w, (Object)a.a.a.w)) {
                        final mln r = this.r();
                        long n;
                        if (b) {
                            final long b2 = r.b;
                            final int c = dnn.c;
                            n = b2 >> 32;
                        }
                        else {
                            final long b3 = r.b;
                            final int c2 = dnn.c;
                            n = (b3 & 0xFFFFFFFFL);
                        }
                        return mkq.p(a, this.b.G((int)n), b, dnn.h(this.r().b));
                    }
                }
            }
        }
        return 9205357640488583168L;
    }
    
    public final og0 q() {
        final j7d d = this.d;
        if (d != null) {
            return (og0)d.a.b;
        }
        return null;
    }
    
    public final mln r() {
        return (mln)this.e.getValue();
    }
    
    public final void s() {
        if (twl.C) {
            final vgn vgn = (vgn)((g66)this.z).w;
            if (vgn != null) {
                final wmm p = vgn.P;
                if (p != null) {
                    ((bqc)p).g((CancellationException)null);
                    vgn.P = null;
                }
            }
        }
        else {
            final qnn k = this.k;
            int a;
            if (k != null) {
                a = k.a();
            }
            else {
                a = 0;
            }
            if (a == 1) {
                final qnn i = this.k;
                if (i != null) {
                    i.d();
                }
            }
        }
    }
    
    public final void t(final dnn dnn) {
        if (dnn != null) {
            final long a = dnn.a;
            final lbh j = this.j;
            if (j != null) {
                final og0 q = this.q();
                if (q != null) {
                    final String w = q.w;
                    if (w != null) {
                        final o6g b = this.b;
                        final long c = rhc.c(b.G((int)(a >> 32)), b.G((int)(a & 0xFFFFFFFFL)));
                        if (w.length() > 0 && !dnn.d(c)) {
                            final oc7 i = this.i;
                            if (i != null) {
                                rhc.G(i, (hc7)null, 0, (zta)new nx6(j, w, c, dnn, this, b, (f07)null), 3);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public final void u() {
        final oc7 i = this.i;
        if (i != null) {
            rhc.G(i, (hc7)null, 4, (zta)new tjn(this, (f07)null, (byte)1), 1);
        }
    }
    
    public final void v() {
        final mln g = g(this.r().a, rhc.c(0, this.r().a.w.length()));
        this.c.b((Object)g);
        final long b = g.b;
        this.x = new dnn(b);
        this.v = mln.a(this.v, (og0)null, b, 5);
        this.j(true);
    }
    
    public final void w(final l6g value) {
        this.t.setValue((Object)value);
    }
    
    public final void x(final qbb value) {
        this.s.setValue((Object)value);
    }
    
    public final void y(final tbb value) {
        final j7d d = this.d;
        if (d != null) {
            j7d j7d = d;
            if (d.a() == value) {
                j7d = null;
            }
            if (j7d != null) {
                j7d.k.setValue((Object)value);
            }
        }
    }
    
    public final void z() {
        final r7m a = q7m.a();
        Object o;
        if (a != null) {
            o = a.e();
        }
        else {
            o = null;
        }
        final r7m b = q7m.b(a);
        Label_0126: {
            try {
                if (this.o()) {
                    final j7d d = this.d;
                    if (d == null || (boolean)d.q.getValue()) {
                        q7m.d(a, b, (lta)o);
                        if (twl.C) {
                            ((g66)this.z).f();
                            return;
                        }
                        o = this.i;
                        if (o != null) {
                            rhc.G((oc7)o, (hc7)null, 4, (zta)new wjn(this, (f07)null, (byte)1), 1);
                        }
                        return;
                    }
                }
            }
            finally {
                break Label_0126;
            }
            q7m.d(a, b, (lta)o);
            return;
        }
        q7m.d(a, b, (lta)o);
    }
}
