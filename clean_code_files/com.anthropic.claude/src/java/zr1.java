import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.LayoutNode;
import java.util.HashSet;

public final class zr1 extends hgf implements a0d, bw8, xsk, teh, mgf, msg, jzc, x2b, zla, uma, zma, jmg, vn2
{
    public ggf J;
    public yr1 K;
    public HashSet L;
    
    public final boolean A() {
        return super.I;
    }
    
    public final void G(final jeh jeh, final keh keh, final long n) {
        final ggf j = this.J;
        j.getClass();
        ((veh)j).f().n(jeh, keh);
    }
    
    public final void I0(final k0d k0d) {
        final ggf j = this.J;
        j.getClass();
        ((x7c)j).c(k0d);
    }
    
    public final int M0(final wxd wxd, final goe goe, final int n) {
        final ggf j = this.J;
        j.getClass();
        return h6r.u((xzc)j, wxd, goe, n);
    }
    
    public final void O(final qma qma) {
        final ggf j = this.J;
        gac.c("applyFocusProperties called on wrong node");
        ge9.C((Object)j);
        throw null;
    }
    
    public final Object P(final tei tei) {
        final tei e = rml.e;
        this.L.add((Object)e);
        if (!super.v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object z = super.v.z;
        LayoutNode layoutNode = soh.L((t98)this);
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0x20) != 0x0) {
                for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                    if ((((hgf)z2).x & 0x20) != 0x0) {
                        Object g = z2;
                        inf inf = null;
                        while (g != null) {
                            inf inf2;
                            if (g instanceof mgf) {
                                final mgf mgf = (mgf)g;
                                inf2 = inf;
                                if (mgf.m0().o(e)) {
                                    return mgf.m0().z(e);
                                }
                            }
                            else {
                                inf2 = inf;
                                if ((((hgf)g).x & 0x20) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf = ((v98)g).K;
                                        int n = 0;
                                        while (hgf != null) {
                                            v98 v98 = (v98)g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf.x & 0x20) != 0x0) {
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
        return e.a.a();
    }
    
    public final boolean R0() {
        final ggf j = this.J;
        j.getClass();
        final seh seh = (seh)j;
        return true;
    }
    
    public final void S(final bna bna) {
        final ggf j = this.J;
        gac.c("onFocusEvent called on wrong node");
        ge9.C((Object)j);
        throw null;
    }
    
    public final void V() {
        final ggf j = this.J;
        j.getClass();
        ((veh)j).f().m();
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final ggf j = this.J;
        j.getClass();
        return ((xzc)j).b(ooe, goe, n);
    }
    
    public final void b0() {
        x90.z((bw8)this);
    }
    
    public final void c(final long n) {
    }
    
    public final void c0() {
        final ggf j = this.J;
        j.getClass();
        final seh seh = (seh)j;
    }
    
    public final Object d(final xc8 xc8, final Object o) {
        final ggf j = this.J;
        j.getClass();
        return ((lsg)j).d(xc8, o);
    }
    
    public final void f() {
        if (this.J instanceof seh) {
            this.V();
        }
    }
    
    public final int g(final wxd wxd, final goe goe, final int n) {
        final ggf j = this.J;
        j.getClass();
        return ((xzc)j).g(wxd, goe, n);
    }
    
    public final void g1() {
        this.o1(true);
    }
    
    public final xc8 getDensity() {
        return soh.L((t98)this).U;
    }
    
    public final qzc getLayoutDirection() {
        return soh.L((t98)this).V;
    }
    
    public final int h(final wxd wxd, final goe goe, final int n) {
        final ggf j = this.J;
        j.getClass();
        return ((xzc)j).h(wxd, goe, n);
    }
    
    public final void h1() {
        this.p1();
    }
    
    public final long i() {
        return uoo.Z(soh.J((t98)this, 128).x);
    }
    
    public final void j(final itk itk) {
        final ggf j = this.J;
        j.getClass();
        final tsk semanticsConfiguration = ((vsk)j).getSemanticsConfiguration();
        itk.getClass();
        final tsk tsk = (tsk)itk;
        final tmf v = tsk.v;
        if (semanticsConfiguration.x) {
            tsk.x = true;
        }
        if (semanticsConfiguration.y) {
            tsk.y = true;
        }
        final tmf v2 = semanticsConfiguration.v;
        final Object[] b = v2.b;
        final Object[] c = v2.c;
        final long[] a = v2.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            final Object o = b[n5];
                            final Object o2 = c[n5];
                            final htk htk = (htk)o;
                            if (!v.b((Object)htk)) {
                                v.m((Object)htk, o2);
                            }
                            else if (o2 instanceof t3) {
                                final Object g = v.g((Object)htk);
                                g.getClass();
                                final t3 t3 = (t3)g;
                                String s;
                                if ((s = t3.a) == null) {
                                    s = ((t3)o2).a;
                                }
                                aua aua;
                                if ((aua = t3.b) == null) {
                                    aua = ((t3)o2).b;
                                }
                                v.m((Object)htk, (Object)new t3(s, aua));
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
    }
    
    public final int k(final wxd wxd, final goe goe, final int n) {
        final ggf j = this.J;
        j.getClass();
        return h6r.s((xzc)j, wxd, goe, n);
    }
    
    public final r9n m0() {
        final yr1 k = this.K;
        if (k != null) {
            return k;
        }
        return t89.h;
    }
    
    public final void o1(final boolean b) {
        if (!super.I) {
            gac.c("initializeModifier called on unattached node");
        }
        final ggf j = this.J;
        if ((super.x & 0x20) != 0x0 && j instanceof ngf) {
            final ngf ngf = (ngf)j;
            final tei a = e98.a;
            final yr1 k = this.K;
            if (k != null && k.o(a)) {
                k.h = ngf;
                final lgf modifierLocalManager = soh.M((t98)this).getModifierLocalManager();
                emf b2;
                if ((b2 = modifierLocalManager.b) == null) {
                    b2 = new emf();
                    modifierLocalManager.b = b2;
                }
                b2.b((Object)this);
                emf c;
                if ((c = modifierLocalManager.c) == null) {
                    c = new emf();
                    modifierLocalManager.c = c;
                }
                c.b((Object)a);
                modifierLocalManager.a();
            }
            else {
                final Object i = new Object();
                ((yr1)i).h = ngf;
                this.K = (yr1)i;
                final obn obn = (obn)soh.L((t98)this).Z.A;
                obn.getClass();
                if (obn.J) {
                    final lgf modifierLocalManager2 = soh.M((t98)this).getModifierLocalManager();
                    emf b3;
                    if ((b3 = modifierLocalManager2.b) == null) {
                        b3 = new emf();
                        modifierLocalManager2.b = b3;
                    }
                    b3.b((Object)this);
                    emf c2;
                    if ((c2 = modifierLocalManager2.c) == null) {
                        c2 = new emf();
                        modifierLocalManager2.c = c2;
                    }
                    c2.b((Object)a);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((super.x & 0x4) != 0x0 && !b) {
            soh.J((t98)this, 2).p1();
        }
        if ((super.x & 0x2) != 0x0) {
            final obn obn2 = (obn)soh.L((t98)this).Z.A;
            obn2.getClass();
            if (obn2.J) {
                final yxf c3 = super.C;
                c3.getClass();
                ((d0d)c3).L1((a0d)this);
                final gmg q0 = c3.q0;
                if (q0 != null) {
                    ((j6b)q0).c();
                }
            }
            if (!b) {
                soh.J((t98)this, 2).p1();
                soh.L((t98)this).R();
            }
        }
        if (j instanceof d8j) {
            ((d8j)j).q0(soh.L((t98)this));
        }
        if ((super.x & 0x100) != 0x0 && j instanceof fjn) {
            final obn obn3 = (obn)soh.L((t98)this).Z.A;
            obn3.getClass();
            if (obn3.J) {
                soh.L((t98)this).R();
            }
        }
        if ((super.x & 0x10) != 0x0 && j instanceof seh) {
            ((veh)j).f().q((nzc)super.C);
        }
        if ((super.x & 0x8) != 0x0) {
            ((AndroidComposeView)soh.M((t98)this)).z();
        }
    }
    
    public final void p1() {
        if (!super.I) {
            gac.c("unInitializeModifier called on unattached node");
        }
        final ggf j = this.J;
        if ((super.x & 0x20) != 0x0 && j instanceof ngf) {
            final lgf modifierLocalManager = soh.M((t98)this).getModifierLocalManager();
            final tei a = e98.a;
            emf d;
            if ((d = modifierLocalManager.d) == null) {
                d = new emf();
                modifierLocalManager.d = d;
            }
            d.b((Object)soh.L((t98)this));
            emf e;
            if ((e = modifierLocalManager.e) == null) {
                e = new emf();
                modifierLocalManager.e = e;
            }
            e.b((Object)a);
            modifierLocalManager.a();
        }
        if ((super.x & 0x8) != 0x0) {
            ((AndroidComposeView)soh.M((t98)this)).z();
        }
    }
    
    public final void q1() {
        if (super.I) {
            this.L.clear();
            soh.M((t98)this).getSnapshotObserver().a.d(this, (lta)mlc.a, (jta)new s5((Object)this, (byte)13));
        }
    }
    
    public final void t(final nzc nzc) {
    }
    
    public final String toString() {
        return this.J.toString();
    }
    
    public final void u0(final yxf yxf) {
        final ggf j = this.J;
        j.getClass();
        ((fjn)j).u0(yxf);
    }
}
