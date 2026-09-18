import androidx.compose.ui.node.LayoutNode;

public final class fsf extends hgf implements wfo, xrf
{
    public xrf J;
    public asf K;
    public fsf L;
    public final String M;
    
    public fsf(final xrf j, final asf asf) {
        this.J = j;
        asf k = asf;
        if (asf == null) {
            k = new asf();
        }
        this.K = k;
        this.M = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";
    }
    
    public final long K(long k, final int n, final long n2) {
        final long i = this.J.K(k, n, n2);
        fsf p3;
        if (super.I) {
            p3 = this.p1();
        }
        else {
            p3 = null;
        }
        if (p3 != null) {
            k = p3.K(l6g.i(k, i), n, l6g.h(n2, i));
        }
        else {
            k = 0L;
        }
        return l6g.i(i, k);
    }
    
    public final Object L(long n, long w, final f07 f07) {
        while (true) {
            Label_0043: {
                if (!(f07 instanceof dsf)) {
                    break Label_0043;
                }
                final dsf dsf = (dsf)f07;
                final int z = dsf.z;
                if ((z & Integer.MIN_VALUE) == 0x0) {
                    break Label_0043;
                }
                dsf.z = z + Integer.MIN_VALUE;
                Object o = dsf.x;
                final int z2 = dsf.z;
                final fsf fsf = null;
                final pc7 v = pc7.v;
                Label_0294: {
                    long v2;
                    if (z2 != 0) {
                        if (z2 != 1) {
                            if (z2 == 2) {
                                n = dsf.v;
                                vt4.g0(o);
                                break Label_0294;
                            }
                            en9.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        else {
                            w = dsf.w;
                            v2 = dsf.v;
                            vt4.g0(o);
                        }
                    }
                    else {
                        vt4.g0(o);
                        final xrf j = this.J;
                        dsf.v = n;
                        dsf.w = w;
                        dsf.z = 1;
                        o = j.L(n, w, (f07)dsf);
                        if (o == v) {
                            return v;
                        }
                        v2 = n;
                    }
                    n = ((f7p)o).j();
                    final boolean i = super.I;
                    fsf fsf2;
                    if (i) {
                        fsf2 = fsf;
                        if (i) {
                            fsf2 = this.p1();
                        }
                    }
                    else {
                        fsf2 = this.L;
                    }
                    if (fsf2 == null) {
                        final long n2 = 0L;
                        w = n;
                        n = n2;
                        return f7p.a(f7p.g(w, n));
                    }
                    final long g = f7p.g(v2, n);
                    w = f7p.f(w, n);
                    dsf.v = n;
                    dsf.z = 2;
                    o = fsf2.L(g, w, (f07)dsf);
                    if (o != v) {
                        break Label_0294;
                    }
                    return v;
                }
                final long k = ((f7p)o).j();
                w = n;
                n = k;
                return f7p.a(f7p.g(w, n));
            }
            final dsf dsf = new dsf(this, (h07)f07);
            continue;
        }
    }
    
    public final Object O0(long n, final f07 f07) {
        Object o = null;
        Label_0057: {
            if (f07 instanceof esf) {
                final esf esf = (esf)f07;
                final int y = esf.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    esf.y = y + Integer.MIN_VALUE;
                    o = esf;
                    break Label_0057;
                }
            }
            o = new esf(this, (h07)f07);
        }
        Object o2 = ((esf)o).w;
        final int y2 = ((esf)o).y;
        final fsf fsf = null;
        final pc7 v = pc7.v;
        long v2 = 0L;
        Label_0212: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        n = ((esf)o).v;
                        vt4.g0(o2);
                        return f7p.a(f7p.g(n, ((f7p)o2).j()));
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    v2 = ((esf)o).v;
                    vt4.g0(o2);
                }
            }
            else {
                vt4.g0(o2);
                fsf p2 = fsf;
                if (super.I) {
                    p2 = this.p1();
                }
                if (p2 == null) {
                    final long n2 = 0L;
                    v2 = n;
                    n = n2;
                    break Label_0212;
                }
                ((esf)o).v = n;
                ((esf)o).y = 1;
                final Object o3 = p2.O0(n, (f07)o);
                v2 = n;
                if ((o2 = o3) == v) {
                    return v;
                }
            }
            n = ((f7p)o2).j();
        }
        final xrf j = this.J;
        final long f8 = f7p.f(v2, n);
        ((esf)o).v = n;
        ((esf)o).y = 2;
        o2 = j.O0(f8, (f07)o);
        if (o2 != v) {
            return f7p.a(f7p.g(n, ((f7p)o2).j()));
        }
        return v;
    }
    
    public final long a0(final int n, final long n2) {
        fsf p2;
        if (super.I) {
            p2 = this.p1();
        }
        else {
            p2 = null;
        }
        long a0;
        if (p2 != null) {
            a0 = p2.a0(n, n2);
        }
        else {
            a0 = 0L;
        }
        return l6g.i(a0, this.J.a0(n, l6g.h(n2, a0)));
    }
    
    public final void g1() {
        final asf k = this.K;
        k.a = this;
        k.b = null;
        this.L = null;
        k.c = (jta)new lce((Object)this, (byte)5);
        k.d = this.c1();
    }
    
    public final void h1() {
        final Object o = new Object();
        o50.a0((wfo)this, (lta)new m40((b4j)o, (byte)5));
        final fsf fsf = (fsf)((b4j)o).v;
        this.L = fsf;
        final asf k = this.K;
        k.b = fsf;
        if (k.a == this) {
            k.a = null;
            k.d = null;
            k.c = (jta)r6k.e;
        }
    }
    
    public final oc7 o1() {
        final fsf p1 = this.p1();
        oc7 o1;
        if (p1 != null) {
            o1 = p1.o1();
        }
        else {
            o1 = null;
        }
        if (o1 != null && ien.y(o1)) {
            return o1;
        }
        final oc7 d = this.K.d;
        if (d != null) {
            return d;
        }
        en9.q("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
    
    public final fsf p1() {
        final boolean i = super.I;
        fsf fsf = null;
        final fsf fsf2 = null;
        if (i) {
            if (!super.v.I) {
                gac.c("visitAncestors called on an unattached node");
            }
            Object z = super.v.z;
            LayoutNode layoutNode = soh.L((t98)this);
            Object o = null;
        Label_0397:
            while (true) {
                o = fsf2;
                if (layoutNode == null) {
                    break;
                }
                if ((((hgf)layoutNode.Z.B).y & 0x40000) != 0x0) {
                    for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                        if ((((hgf)z2).x & 0x40000) != 0x0) {
                            Object g = z2;
                            inf inf = null;
                            while (g != null) {
                                if (g instanceof wfo) {
                                    final wfo wfo = (wfo)g;
                                    if (mlc.q((Object)this.M, wfo.u()) && fsf.class == wfo.getClass()) {
                                        o = wfo;
                                        break Label_0397;
                                    }
                                }
                                inf inf2 = inf;
                                if ((((hgf)g).x & 0x40000) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf = ((v98)g).K;
                                        int n = 0;
                                        while (hgf != null) {
                                            v98 v98 = (v98)g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf.x & 0x40000) != 0x0) {
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
                                        inf2 = inf;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                                g = soh.G(inf2);
                                inf = inf2;
                            }
                        }
                    }
                }
                layoutNode = layoutNode.G();
                if (layoutNode != null) {
                    final rxf z3 = layoutNode.Z;
                    if (z3 != null) {
                        z = z3.A;
                        continue;
                    }
                }
                z = null;
            }
            fsf = (fsf)o;
        }
        return fsf;
    }
    
    public final Object u() {
        return this.M;
    }
}
