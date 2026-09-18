import androidx.compose.ui.node.LayoutNode;

public final class lna extends v98 implements xsk, x2b, zl6, k5g, wfo
{
    public static final awp R;
    public llf L;
    public final lta M;
    public gma N;
    public k4d O;
    public yxf P;
    public final gna Q;
    
    static {
        R = new awp((byte)16);
    }
    
    public lna(final llf l, final int n, final lta m) {
        this.L = l;
        this.M = m;
        final gna q = new gna(n, (zta)new m54(2, this, lna.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, (byte)3), 10);
        this.o1((t98)q);
        this.Q = q;
    }
    
    public lna(final llf llf, shn shn, final int n) {
        if ((n & 0x4) != 0x0) {
            shn = null;
        }
        this(llf, 1, (lta)shn);
    }
    
    @Override
    public final void F0() {
        final Object o = new Object();
        yi2.I(this, (jta)new jd0(o, (Object)this, (byte)29));
        k4d o2 = (k4d)((b4j)o).v;
        if (this.Q.t1().b()) {
            final k4d o3 = this.O;
            if (o3 != null) {
                o3.b();
            }
            if (o2 != null) {
                o2.a();
            }
            else {
                o2 = null;
            }
            this.O = o2;
        }
    }
    
    @Override
    public final boolean d1() {
        return false;
    }
    
    @Override
    public final void i1() {
        final k4d o = this.O;
        if (o != null) {
            o.b();
        }
        this.O = null;
    }
    
    @Override
    public final void j(final itk itk) {
        final boolean b = this.Q.t1().b();
        final auc[] a = ftk.a;
        final htk l = etk.l;
        final auc auc = ftk.a[4];
        l.getClass();
        itk.a(l, (Object)b);
        itk.a(rsk.w, (Object)new t3((String)null, (aua)new kr(0, this, lna.class, "requestFocus", "requestFocus()Z", 0, (byte)19)));
    }
    
    public final void r1(final llf llf, final ima ima) {
        if (super.I) {
            final opc opc = (opc)((fz6)this.c1()).v.M0((gc7)o55.z);
            dq8 u0;
            if (opc != null) {
                u0 = opc.U0((lta)new tt8((Object)llf, (Object)ima, (byte)3));
            }
            else {
                u0 = null;
            }
            rhc.G(this.c1(), null, 0, new o10(llf, ima, u0, null, (byte)22), 3);
            return;
        }
        llf.b((eic)ima);
    }
    
    public final void s1() {
        if (super.I) {
            if (!super.v.I) {
                gac.c("visitAncestors called on an unattached node");
            }
            Object z = super.v.z;
            LayoutNode layoutNode = soh.L(this);
            while (layoutNode != null) {
                if ((((hgf)layoutNode.Z.B).y & 0x40000) != 0x0) {
                    for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                        if ((((hgf)z2).x & 0x40000) != 0x0) {
                            hgf g = (hgf)z2;
                            inf inf = null;
                            while (g != null) {
                                if (g instanceof wfo && mna.J == ((wfo)g).u()) {
                                    return;
                                }
                                inf inf2 = inf;
                                if ((g.x & 0x40000) != 0x0) {
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
                                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    v98 v99;
                                                    if ((v99 = (v98)g) != null) {
                                                        inf4.b((Object)g);
                                                        v99 = null;
                                                    }
                                                    inf4.b((Object)hgf);
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
        }
    }
    
    public final void t1(final llf l) {
        if (!mlc.q(this.L, l)) {
            final llf i = this.L;
            if (i != null) {
                final gma n = this.N;
                if (n != null) {
                    i.b((eic)new hma(n));
                }
            }
            this.N = null;
            this.L = l;
        }
    }
    
    @Override
    public final Object u() {
        return lna.R;
    }
    
    @Override
    public final void u0(yxf p) {
        this.P = p;
        if (this.Q.t1().b()) {
            if (!p.h1().I) {
                this.s1();
                return;
            }
            p = this.P;
            if (p != null && p.h1().I) {
                this.s1();
            }
        }
    }
}
