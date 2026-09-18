import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.LayoutNode;

public final class byd extends o8h implements goe, nx, whf
{
    public final m0d A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public boolean F;
    public boolean G;
    public boolean H;
    public gv6 I;
    public long J;
    public lta K;
    public g6b L;
    public int M;
    public final j0d N;
    public final inf O;
    public boolean P;
    public boolean Q;
    public final ayd R;
    public boolean S;
    public Object T;
    public long U;
    public final ayd V;
    public final ayd W;
    public boolean X;
    
    public byd(final m0d a) {
        this.A = a;
        this.C = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.E = 3;
        this.J = 0L;
        this.M = 3;
        this.N = new j0d((nx)this, (byte)1);
        this.O = new inf(0, (Object[])new byd[16]);
        this.P = true;
        this.R = new ayd(this, (byte)0);
        this.S = true;
        this.T = a.p.M;
        this.U = hv6.b(0, 0, 0, 0, 15);
        this.V = new ayd(this, (byte)1);
        this.W = new ayd(this, (byte)2);
    }
    
    public final void E(final boolean g) {
        final m0d a = this.A;
        final yxd f1 = a.a().f1();
        Boolean value;
        if (f1 != null) {
            value = ((wxd)f1).G;
        }
        else {
            value = null;
        }
        if (!Boolean.valueOf(g).equals(value)) {
            final yxd f2 = a.a().f1();
            if (f2 != null) {
                ((wxd)f2).G = g;
            }
        }
    }
    
    public final void G() {
        this.Q = true;
        final j0d n = this.N;
        n.h();
        final m0d a = this.A;
        final boolean f = a.f;
        final LayoutNode a2 = a.a;
        if (f) {
            final inf m = a2.M();
            final Object[] v = m.v;
            for (int x = m.x, i = 0; i < x; ++i) {
                final LayoutNode layoutNode = (LayoutNode)v[i];
                if (layoutNode.x() && layoutNode.D() == 1) {
                    final byd q = layoutNode.t().q;
                    q.getClass();
                    final byd q2 = layoutNode.t().q;
                    gv6 j;
                    if (q2 != null) {
                        j = q2.I;
                    }
                    else {
                        j = null;
                    }
                    j.getClass();
                    if (q.x0(j.a)) {
                        LayoutNode.r0(a2, false, 7);
                    }
                }
            }
        }
        final kcc a3 = this.d().A0;
        a3.getClass();
        if (a.g || (!this.F && !((wxd)a3).J && a.f)) {
            a.f = false;
            final int d = a.d;
            a.d = 4;
            a.i(false);
            final lmg snapshotObserver = l0d.a(a2).getSnapshotObserver();
            snapshotObserver.a.d((Object)a2, (lta)snapshotObserver.h, (jta)this.R);
            a.d = d;
            if (a.m && ((wxd)a3).J) {
                this.requestLayout();
            }
            a.g = false;
        }
        if (n.d) {
            n.e = true;
        }
        if (n.b && n.e()) {
            n.g();
        }
        this.Q = false;
    }
    
    public final void P() {
        LayoutNode.r0(this.A.a, false, 7);
    }
    
    public final int Q(final int n) {
        this.q0();
        final yxd f1 = this.A.a().f1();
        f1.getClass();
        return ((goe)f1).Q(n);
    }
    
    public final int S(final hx hx) {
        final m0d a = this.A;
        final LayoutNode g = a.a.G();
        int v;
        if (g != null) {
            v = g.v();
        }
        else {
            v = 0;
        }
        final j0d n = this.N;
        if (v == 2) {
            n.c = true;
        }
        else {
            final LayoutNode g2 = a.a.G();
            int v2;
            if (g2 != null) {
                v2 = g2.v();
            }
            else {
                v2 = 0;
            }
            if (v2 == 4) {
                n.d = true;
            }
        }
        this.F = true;
        final yxd f1 = a.a().f1();
        f1.getClass();
        final int s = ((wxd)f1).S(hx);
        this.F = false;
        return s;
    }
    
    public final int T() {
        final yxd f1 = this.A.a().f1();
        f1.getClass();
        return ((o8h)f1).T();
    }
    
    public final int V() {
        final yxd f1 = this.A.a().f1();
        f1.getClass();
        return ((o8h)f1).V();
    }
    
    public final int a(final int n) {
        this.q0();
        final yxd f1 = this.A.a().f1();
        f1.getClass();
        return ((goe)f1).a(n);
    }
    
    public final void a0(final long n, final float n2, final lta lta) {
        this.v0(n, lta, null);
    }
    
    public final void b0(final long n, final float n2, final g6b g6b) {
        this.v0(n, null, g6b);
    }
    
    public final j0d c() {
        return this.N;
    }
    
    public final lcc d() {
        return (lcc)this.A.a.Z.y;
    }
    
    public final void e(final i1 i1) {
        final inf m = this.A.a.M();
        final Object[] v = m.v;
        for (int x = m.x, j = 0; j < x; ++j) {
            final byd q = ((LayoutNode)v[j]).t().q;
            q.getClass();
            i1.b((Object)q);
        }
    }
    
    public final boolean f0() {
        final m0d a = this.A;
        return omo.R(a.a) || a.c;
    }
    
    public final nx g() {
        final LayoutNode g = this.A.a.G();
        if (g != null) {
            final m0d t = g.t();
            if (t != null) {
                return (nx)t.q;
            }
        }
        return null;
    }
    
    public final void h0(final boolean b) {
        if (!b || !this.f0()) {
            if (b || this.f0()) {
                this.M = 3;
                final inf m = this.A.a.M();
                final Object[] v = m.v;
                for (int x = m.x, i = 0; i < x; ++i) {
                    final byd q = ((LayoutNode)v[i]).t().q;
                    q.getClass();
                    q.h0(true);
                }
            }
        }
    }
    
    public final void m0() {
        final int m = this.M;
        final m0d a = this.A;
        final boolean c = a.c;
        final LayoutNode a2 = a.a;
        if (c) {
            this.M = 2;
        }
        else {
            this.M = 1;
        }
        if (m != 1 && a.e) {
            LayoutNode.r0(a2, true, 6);
        }
        final inf i = a2.M();
        final Object[] v = i.v;
        for (int x = i.x, j = 0; j < x; ++j) {
            final LayoutNode layoutNode = (LayoutNode)v[j];
            final byd y = layoutNode.y();
            if (y == null) {
                en9.s("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                break;
            }
            if (y.D != Integer.MAX_VALUE) {
                y.m0();
                LayoutNode.u0(layoutNode);
            }
        }
    }
    
    public final int n(final int n) {
        this.q0();
        final yxd f1 = this.A.a().f1();
        f1.getClass();
        return ((goe)f1).n(n);
    }
    
    public final void n0() {
        final m0d a = this.A;
        if (a.o > 0) {
            final inf m = a.a.M();
            final Object[] v = m.v;
            for (int x = m.x, i = 0; i < x; ++i) {
                final LayoutNode layoutNode = (LayoutNode)v[i];
                final m0d t = layoutNode.t();
                if ((t.m || t.n) && !t.f) {
                    layoutNode.q0(false);
                }
                final byd q = t.q;
                if (q != null) {
                    q.n0();
                }
            }
        }
    }
    
    public final int o() {
        return this.D;
    }
    
    public final void q0() {
        final m0d a = this.A;
        LayoutNode.r0(a.a, false, 7);
        final LayoutNode a2 = a.a;
        final LayoutNode g = a2.G();
        if (g != null && a2.k0 == 3) {
            final int d = ge9.D(g.v());
            int k0;
            if (d != 0) {
                k0 = 2;
                if (d != 2) {
                    k0 = g.k0;
                }
            }
            else {
                k0 = 1;
            }
            a2.k0 = k0;
        }
    }
    
    public final void requestLayout() {
        this.A.a.q0(false);
    }
    
    public final int s(final int n) {
        this.q0();
        final yxd f1 = this.A.a().f1();
        f1.getClass();
        return ((goe)f1).s(n);
    }
    
    public final o8h u(final long n) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        final LayoutNode g = a2.G();
        int v;
        if (g != null) {
            v = g.v();
        }
        else {
            v = 0;
        }
        final int n2 = 2;
        Label_0085: {
            if (v != 2) {
                final LayoutNode g2 = a3.G();
                int v2;
                if (g2 != null) {
                    v2 = g2.v();
                }
                else {
                    v2 = 0;
                }
                if (v2 != 4) {
                    break Label_0085;
                }
            }
            a.b = false;
        }
        final LayoutNode g3 = a3.G();
        if (g3 != null) {
            if (this.E != 3) {
                if (!a3.Y) {
                    gac.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
            }
            final int d = ge9.D(g3.v());
            int e;
            if (d != 0 && d != 1) {
                e = n2;
                if (d != 2) {
                    if (d != 3) {
                        en9.q("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(hia.C(g3.v())));
                        return null;
                    }
                    e = n2;
                }
            }
            else {
                e = 1;
            }
            this.E = e;
        }
        else {
            this.E = 3;
        }
        if (a3.k0 == 3) {
            a3.f();
        }
        this.x0(n);
        return this;
    }
    
    public final void u0() {
        this.X = true;
        final m0d a = this.A;
        final LayoutNode g = a.a.G();
        final int m = this.M;
        if ((m != 1 && !a.c) || (m != 2 && a.c)) {
            this.m0();
            if (this.B && g != null) {
                g.q0(false);
            }
        }
        if (g != null) {
            if (!this.B && (g.v() == 3 || g.v() == 4)) {
                if (this.D != Integer.MAX_VALUE) {
                    gac.c("Place was called on a node which was placed already");
                }
                this.D = g.t().h;
                final m0d t = g.t();
                ++t.h;
            }
        }
        else {
            this.D = 0;
        }
        this.G();
    }
    
    public final void v0(final long j, final lta lta, final g6b l) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        final Throwable k;
        Label_0275: {
            int v = 0;
            Label_0049: {
                try {
                    final LayoutNode g = a2.G();
                    if (g != null) {
                        v = g.v();
                        break Label_0049;
                    }
                }
                finally {
                    break Label_0275;
                }
                v = 0;
            }
            if (v == 4) {
                a.c = false;
            }
            if (a3.j0) {
                gac.a("place is called on a deactivated node");
            }
            a.d = 4;
            boolean b = true;
            this.G = true;
            this.X = false;
            if (!ugc.b(j, this.J)) {
                if (a.n || a.m) {
                    a.f = true;
                }
                this.n0();
            }
            final Owner a4 = l0d.a(a3);
            this.J = j;
            Label_0257: {
                if (!a.f) {
                    if (this.M == 3) {
                        b = false;
                    }
                    if (b) {
                        final yxd f1 = a.a().f1();
                        f1.getClass();
                        f1.V0(ugc.d(j, ((o8h)f1).z));
                        this.u0();
                        break Label_0257;
                    }
                }
                a.h(false);
                this.N.g = false;
                final lmg snapshotObserver = a4.getSnapshotObserver();
                snapshotObserver.a.d((Object)a3, (lta)snapshotObserver.g, (jta)this.W);
            }
            this.K = (lta)k;
            this.L = l;
            a.d = 5;
            return;
        }
        a2.w0(k);
        throw null;
    }
    
    public final boolean x0(final long n) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        final m0d m0d;
        Label_0386: {
            try {
                if (a2.j0) {
                    gac.a("measure is called on a deactivated node");
                }
            }
            finally {
                break Label_0386;
            }
            final LayoutNode g = a3.G();
            a3.Y = (a3.Y || (g != null && g.Y));
            if (!a3.x()) {
                final gv6 i = this.I;
                if (i != null && gv6.c(i.a, n)) {
                    final Owner j = a3.J;
                    if (j != null) {
                        ((AndroidComposeView)j).h(a3, true);
                    }
                    a3.v0();
                    return false;
                }
            }
            this.I = new gv6(n);
            this.d0(n);
            this.N.f = false;
            final inf m = a3.M();
            final Object[] v = m.v;
            for (int x = m.x, k = 0; k < x; ++k) {
                final byd q = ((LayoutNode)v[k]).t().q;
                q.getClass();
                q.N.c = false;
            }
            long x2;
            if (this.H) {
                x2 = super.x;
            }
            else {
                x2 = -9223372034707292160L;
            }
            this.H = true;
            final yxd f1 = m0d.a().f1();
            if (f1 == null) {
                gac.c("Lookahead result from lookaheadRemeasure cannot be null");
            }
            m0d.c(n);
            this.c0((long)((o8h)f1).v << 32 | ((long)((o8h)f1).w & 0xFFFFFFFFL));
            return (int)(x2 >> 32) != ((o8h)f1).v || (int)(x2 & 0xFFFFFFFFL) != ((o8h)f1).w;
        }
        a2.w0((Throwable)m0d);
        throw null;
    }
    
    public final Object z() {
        return this.T;
    }
}
