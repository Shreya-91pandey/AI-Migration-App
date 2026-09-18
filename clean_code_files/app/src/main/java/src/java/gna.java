import android.os.Trace;
import androidx.compose.ui.node.LayoutNode;

public final class gna extends hgf implements zl6, k5g, mgf, jro, t98
{
    public final boolean J;
    public final zta K;
    public boolean L;
    public boolean M;
    public final int N;
    public t8k O;
    
    public gna(int n, zta k, final int n2) {
        boolean j = true;
        if ((n2 & 0x1) != 0x0) {
            n = 1;
        }
        if ((n2 & 0x2) != 0x0) {
            j = false;
        }
        if ((n2 & 0x4) != 0x0) {
            k = null;
        }
        this.J = j;
        this.K = k;
        this.N = n;
    }
    
    public static boolean w1(final gna gna) {
        return gna.v1(7);
    }
    
    public final void F0() {
        this.u1();
    }
    
    public final void a1() {
    }
    
    public final boolean d1() {
        return false;
    }
    
    public final void g1() {
    }
    
    public final void h1() {
        final int ordinal = this.t1().ordinal();
        Label_0128: {
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            break Label_0128;
                        }
                        en9.r();
                        return;
                    }
                }
                else {
                    final nma focusOwner = soh.M((t98)this).getFocusOwner();
                    final gna f = elq.f(this);
                    if (f != null && f.J) {
                        final pma pma = (pma)focusOwner;
                        pma.a.E();
                        pma.d.a();
                    }
                    break Label_0128;
                }
            }
            final pma pma2 = (pma)soh.M((t98)this).getFocusOwner();
            pma2.d(8, true, false);
            if (this.J) {
                pma2.a.E();
            }
            pma2.d.a();
        }
        final t8k o = this.O;
        if (o != null) {
            ((tze)o).n();
        }
        this.O = null;
    }
    
    public final void i1() {
        if (this.t1().b()) {
            ((pma)soh.M((t98)this).getFocusOwner()).d(8, true, true);
        }
    }
    
    public final boolean o1(int d) {
        d = ge9.D(rhc.N(this, d));
        if (d != 0) {
            boolean b = true;
            if (d != 1) {
                if (d != 2) {
                    if (d == 3) {
                        return false;
                    }
                    en9.r();
                    b = false;
                }
                return b;
            }
            return false;
        }
        return rhc.O(this);
    }
    
    public final void p1(final bna bna, final bna obj) {
        final pma pma = (pma)soh.M((t98)this).getFocusOwner();
        final gna h = pma.h();
        if (!bna.equals(obj)) {
            final zta k = this.K;
            if (k != null) {
                k.d((Object)bna, (Object)obj);
            }
        }
        final hgf v = super.v;
        if (!v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object v2 = super.v;
        LayoutNode layoutNode = soh.L((t98)this);
    Label_0441:
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0x1400) != 0x0) {
                for (Object z = v2; z != null; z = ((hgf)z).z) {
                    final int x = ((hgf)z).x;
                    if ((x & 0x1400) != 0x0) {
                        if (z != v && (x & 0x400) != 0x0) {
                            break Label_0441;
                        }
                        if ((x & 0x1000) != 0x0) {
                            Object g = z;
                            inf inf = null;
                            while (g != null) {
                                inf inf2;
                                if (g instanceof zla) {
                                    final zla zla = (zla)g;
                                    if (h != pma.h()) {
                                        inf2 = inf;
                                    }
                                    else {
                                        zla.S(obj);
                                        inf2 = inf;
                                    }
                                }
                                else {
                                    inf2 = inf;
                                    if ((((hgf)g).x & 0x1000) != 0x0) {
                                        inf2 = inf;
                                        if (g instanceof v98) {
                                            hgf hgf = ((v98)g).K;
                                            int n = 0;
                                            while (hgf != null) {
                                                v98 v3 = (v98)g;
                                                inf inf3 = inf;
                                                int n2 = n;
                                                if ((hgf.x & 0x1000) != 0x0) {
                                                    n2 = n + 1;
                                                    if (n2 == 1) {
                                                        v3 = (v98)hgf;
                                                        inf3 = inf;
                                                    }
                                                    else {
                                                        inf inf4;
                                                        if ((inf4 = inf) == null) {
                                                            inf4 = new inf(0, new hgf[16]);
                                                        }
                                                        v98 v4;
                                                        if ((v4 = (v98)g) != null) {
                                                            inf4.b(g);
                                                            v4 = null;
                                                        }
                                                        inf4.b(hgf);
                                                        inf3 = inf4;
                                                        v3 = v4;
                                                    }
                                                }
                                                hgf = hgf.A;
                                                g = v3;
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
            }
            layoutNode = layoutNode.G();
            if (layoutNode != null) {
                final rxf z2 = layoutNode.Z;
                if (z2 != null) {
                    v2 = z2.A;
                    continue;
                }
            }
            v2 = null;
        }
    }
    
    public final sma q1() {
        final Object o = new Object();
        ((sma)o).a = true;
        final xma b = xma.b;
        ((sma)o).b = b;
        ((sma)o).c = b;
        ((sma)o).d = b;
        ((sma)o).e = b;
        ((sma)o).f = b;
        ((sma)o).g = b;
        ((sma)o).h = b;
        ((sma)o).i = b;
        ((sma)o).j = (lta)new sfa((byte)9);
        ((sma)o).k = (lta)new sfa((byte)10);
        ((sma)o).l = eup.z;
        final int n = this.N;
        int a;
        if (n == 1) {
            a = 1;
        }
        else if (n == 0) {
            int n2;
            if (((cdc)uoo.z((zl6)this, (sei)hm6.m)).a() == 1) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            a = (n2 ^ 0x1);
        }
        else {
            if (n != 2) {
                en9.q("Unknown Focusability");
                return null;
            }
            a = 0;
        }
        ((sma)o).a = (a != 0);
        final hgf v = super.v;
        if (!v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object v2 = super.v;
        LayoutNode layoutNode = soh.L((t98)this);
    Label_0567:
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0xC00) != 0x0) {
                for (Object z = v2; z != null; z = ((hgf)z).z) {
                    final int x = ((hgf)z).x;
                    if ((x & 0xC00) != 0x0) {
                        if (z != v && (x & 0x400) != 0x0) {
                            break Label_0567;
                        }
                        if ((x & 0x800) != 0x0) {
                            inf inf = null;
                            Object g = z;
                            while (g != null) {
                                inf inf2;
                                if (g instanceof uma) {
                                    ((uma)g).O((qma)o);
                                    inf2 = inf;
                                }
                                else {
                                    inf2 = inf;
                                    if ((((hgf)g).x & 0x800) != 0x0) {
                                        inf2 = inf;
                                        if (g instanceof v98) {
                                            hgf hgf = ((v98)g).K;
                                            int n3 = 0;
                                            while (hgf != null) {
                                                Object o2 = g;
                                                inf inf3 = inf;
                                                int n4 = n3;
                                                if ((hgf.x & 0x800) != 0x0) {
                                                    n4 = n3 + 1;
                                                    if (n4 == 1) {
                                                        o2 = hgf;
                                                        inf3 = inf;
                                                    }
                                                    else {
                                                        inf inf4;
                                                        if ((inf4 = inf) == null) {
                                                            inf4 = new inf(0, new hgf[16]);
                                                        }
                                                        v98 v3;
                                                        if ((v3 = (v98)g) != null) {
                                                            inf4.b(g);
                                                            v3 = null;
                                                        }
                                                        inf4.b(hgf);
                                                        inf3 = inf4;
                                                        o2 = v3;
                                                    }
                                                }
                                                hgf = hgf.A;
                                                g = o2;
                                                inf = inf3;
                                                n3 = n4;
                                            }
                                            inf2 = inf;
                                            if (n3 == 1) {
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
            }
            layoutNode = layoutNode.G();
            if (layoutNode != null) {
                final rxf z2 = layoutNode.Z;
                if (z2 != null) {
                    v2 = z2.A;
                    continue;
                }
            }
            v2 = null;
        }
        return (sma)o;
    }
    
    public final k2j r1(final nzc nzc) {
        final k2j l = this.q1().l;
        if (l != eup.z) {
            if (nzc == null) {
                return l;
            }
            return l.m(nzc.f(nzc, soh.K((t98)this), 6));
        }
        else {
            if (nzc != null) {
                return nzc.L(soh.K((t98)this), false);
            }
            return rml.f(0L, uoo.Z(soh.K((t98)this).x));
        }
    }
    
    public final q3d s1() {
        if (!super.v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object o = super.v.z;
        LayoutNode layoutNode = soh.L((t98)this);
    Label_0311:
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0x800020) != 0x0) {
                while (o != null) {
                    final int x = ((hgf)o).x;
                    if ((x & 0x800020) != 0x0) {
                        if ((0x800000 & x) != 0x0) {
                            Object o2;
                            if (o instanceof q3d) {
                                o2 = o;
                            }
                            else if (o instanceof v98) {
                                hgf hgf = ((v98)o).K;
                                q3d q3d = null;
                                while (true) {
                                    o2 = q3d;
                                    if (hgf == null) {
                                        break;
                                    }
                                    if (hgf instanceof q3d) {
                                        q3d = (q3d)hgf;
                                    }
                                    hgf = hgf.A;
                                }
                            }
                            else {
                                o2 = null;
                            }
                            final q3d q3d2 = (q3d)o2;
                            if (q3d2 != null) {
                                return q3d2;
                            }
                            break Label_0311;
                        }
                        else if ((x & 0x20) != 0x0) {
                            Object o3;
                            if (o instanceof mgf) {
                                o3 = o;
                            }
                            else if (o instanceof v98) {
                                hgf hgf2 = ((v98)o).K;
                                mgf mgf = null;
                                while (true) {
                                    o3 = mgf;
                                    if (hgf2 == null) {
                                        break;
                                    }
                                    if (hgf2 instanceof mgf) {
                                        mgf = (mgf)hgf2;
                                    }
                                    hgf2 = hgf2.A;
                                }
                            }
                            else {
                                o3 = null;
                            }
                            final mgf mgf2 = (mgf)o3;
                            if (mgf2 != null) {
                                final r9n m0 = mgf2.m0();
                                final tei a = qdi.a;
                                if (m0.o(a)) {
                                    return (q3d)mgf2.m0().z(a);
                                }
                            }
                        }
                    }
                    o = ((hgf)o).z;
                }
            }
            layoutNode = layoutNode.G();
            if (layoutNode != null) {
                final rxf z = layoutNode.Z;
                if (z != null) {
                    o = z.A;
                    continue;
                }
            }
            o = null;
        }
        return null;
    }
    
    public final bna t1() {
        if (super.I) {
            final gna h = ((pma)soh.M((t98)this).getFocusOwner()).h();
            if (h != null) {
                if (this == h) {
                    return bna.v;
                }
                if (h.I) {
                    if (!h.v.I) {
                        gac.c("visitAncestors called on an unattached node");
                    }
                    Object z = h.v.z;
                    LayoutNode layoutNode = soh.L((t98)h);
                    while (layoutNode != null) {
                        if ((((hgf)layoutNode.Z.B).y & 0x400) != 0x0) {
                            for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                                if ((((hgf)z2).x & 0x400) != 0x0) {
                                    hgf g = (hgf)z2;
                                    inf inf = null;
                                    while (g != null) {
                                        inf inf2;
                                        if (g instanceof gna) {
                                            inf2 = inf;
                                            if (this == g) {
                                                return bna.w;
                                            }
                                        }
                                        else {
                                            inf2 = inf;
                                            if ((g.x & 0x400) != 0x0) {
                                                inf2 = inf;
                                                if (g instanceof v98) {
                                                    hgf hgf = ((v98)g).K;
                                                    int n = 0;
                                                    while (hgf != null) {
                                                        hgf hgf2 = g;
                                                        inf inf3 = inf;
                                                        int n2 = n;
                                                        if ((hgf.x & 0x400) != 0x0) {
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
                                                                gna gna;
                                                                if ((gna = (gna)g) != null) {
                                                                    inf4.b(g);
                                                                    gna = null;
                                                                }
                                                                inf4.b(hgf);
                                                                inf3 = inf4;
                                                                hgf2 = gna;
                                                            }
                                                        }
                                                        hgf = hgf.A;
                                                        g = hgf2;
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
                }
            }
        }
        return bna.x;
    }
    
    public final void u1() {
        final int ordinal = this.t1().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                en9.r();
                return;
            }
        }
        final Object o = new Object();
        yi2.I((hgf)this, (jta)new u78(o, (Object)this, (byte)17));
        final Object v = ((b4j)o).v;
        if (v == null) {
            mlc.j0("focusProperties");
            throw null;
        }
        if (!((qma)v).a()) {
            ((pma)soh.M((t98)this).getFocusOwner()).b(true);
        }
    }
    
    public final boolean v1(final int n) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            if (this.q1().a) {
                return this.o1(n);
            }
            return zn2.v(this, n, (lta)new p40(n, (byte)2));
        }
        finally {
            Trace.endSection();
        }
    }
}
