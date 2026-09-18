import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.node.Owner;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;

public final class loe extends o8h implements goe, nx, whf
{
    public final m0d A;
    public boolean B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public boolean G;
    public long H;
    public lta I;
    public g6b J;
    public float K;
    public boolean L;
    public Object M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public final j0d S;
    public final inf T;
    public boolean U;
    public boolean V;
    public long W;
    public final koe X;
    public final koe Y;
    public float Z;
    public boolean a0;
    public lta b0;
    public g6b c0;
    public long d0;
    public float e0;
    public final koe f0;
    public boolean g0;
    public int h0;
    
    public loe(final m0d a) {
        this.A = a;
        this.C = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.h0 = 3;
        this.H = 0L;
        this.L = true;
        this.S = new j0d((nx)this, (byte)0);
        this.T = new inf(0, (Object[])new loe[16]);
        this.U = true;
        this.W = hv6.b(0, 0, 0, 0, 15);
        this.X = new koe(this, (byte)0);
        this.Y = new koe(this, (byte)1);
        this.d0 = 0L;
        this.f0 = new koe(this, (byte)2);
    }
    
    public final void E(final boolean g) {
        final m0d a = this.A;
        if (g != ((wxd)a.a()).G) {
            ((wxd)a.a()).G = g;
            this.g0 = true;
        }
    }
    
    public final void G() {
        this.V = true;
        final j0d s = this.S;
        s.h();
        final boolean q = this.Q;
        final m0d a = this.A;
        if (q) {
            final inf m = a.a.M();
            final Object[] v = m.v;
            for (int x = m.x, i = 0; i < x; ++i) {
                final LayoutNode layoutNode = (LayoutNode)v[i];
                if (layoutNode.B() && layoutNode.C() == 1 && LayoutNode.m0(layoutNode)) {
                    LayoutNode.t0(a.a, false, 7);
                }
            }
        }
        if (this.R || (!this.G && !((wxd)this.d()).J && this.Q)) {
            this.Q = false;
            final int d = a.d;
            a.d = 3;
            a.g(false);
            final LayoutNode a2 = a.a;
            final lmg snapshotObserver = l0d.a(a2).getSnapshotObserver();
            snapshotObserver.a.d((Object)a2, (lta)snapshotObserver.e, (jta)this.Y);
            a.d = d;
            this.R = false;
        }
        if (s.d) {
            s.e = true;
        }
        if (s.b && s.e()) {
            s.g();
        }
        this.V = false;
    }
    
    public final void P() {
        LayoutNode.t0(this.A.a, false, 7);
    }
    
    public final int Q(final int n) {
        final m0d a = this.A;
        if (omo.R(a.a)) {
            final byd q = a.q;
            q.getClass();
            return q.Q(n);
        }
        this.n0();
        return ((goe)a.a()).Q(n);
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
        final j0d s = this.S;
        if (v == 1) {
            s.c = true;
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
            if (v2 == 3) {
                s.d = true;
            }
        }
        this.G = true;
        final int s2 = ((wxd)a.a()).S(hx);
        this.G = false;
        return s2;
    }
    
    public final int T() {
        return ((o8h)this.A.a()).T();
    }
    
    public final int V() {
        return ((o8h)this.A.a()).V();
    }
    
    public final int a(final int n) {
        final m0d a = this.A;
        if (omo.R(a.a)) {
            final byd q = a.q;
            q.getClass();
            return q.a(n);
        }
        this.n0();
        return ((goe)a.a()).a(n);
    }
    
    public final void a0(final long n, final float n2, final lta lta) {
        this.v0(n, n2, lta, null);
    }
    
    public final void b0(final long n, final float n2, final g6b g6b) {
        this.v0(n, n2, null, g6b);
    }
    
    public final j0d c() {
        return this.S;
    }
    
    public final lcc d() {
        return (lcc)this.A.a.Z.y;
    }
    
    public final void e(final i1 i1) {
        final inf m = this.A.a.M();
        final Object[] v = m.v;
        for (int x = m.x, j = 0; j < x; ++j) {
            i1.b((Object)((LayoutNode)v[j]).t().p);
        }
    }
    
    public final List f0() {
        final m0d a = this.A;
        a.a.D0();
        final boolean u = this.U;
        final inf t = this.T;
        if (!u) {
            return t.g();
        }
        final LayoutNode a2 = a.a;
        final inf m = a2.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            final LayoutNode layoutNode = (LayoutNode)v[i];
            if (t.x <= i) {
                t.b((Object)layoutNode.t().p);
            }
            else {
                final loe p = layoutNode.t().p;
                final Object[] v2 = t.v;
                final Object o = v2[i];
                v2[i] = p;
            }
        }
        t.m(a2.getChildren$ui().size(), t.x);
        this.U = false;
        return t.g();
    }
    
    public final nx g() {
        final LayoutNode g = this.A.a.G();
        if (g != null) {
            final m0d t = g.t();
            if (t != null) {
                return (nx)t.p;
            }
        }
        return null;
    }
    
    public final void h0() {
        final boolean n = this.N;
        this.N = true;
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final rxf z = a2.Z;
        if (!n) {
            ((yxf)z.y).t1();
            l0d.a(a2).getRectManager().g(a.a);
            if (a2.B()) {
                LayoutNode.t0(a2, true, 6);
            }
            else if (a2.x()) {
                LayoutNode.r0(a2, true, 6);
            }
        }
        for (yxf yxf = a2.getOuterCoordinator$ui(); !mlc.q((Object)yxf, (Object)((yxf)z.y).S) && yxf != null; yxf = yxf.S) {
            if (yxf.p0) {
                yxf.p1();
            }
        }
        final inf m = a2.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            final LayoutNode layoutNode = (LayoutNode)v[i];
            if (layoutNode.H() != Integer.MAX_VALUE) {
                layoutNode.z().h0();
                LayoutNode.u0(layoutNode);
            }
        }
    }
    
    public final void m0() {
        if (this.N) {
            int i = 0;
            this.N = false;
            final m0d a = this.A;
            final LayoutNode a2 = a.a;
            final LayoutNode a3 = a.a;
            l0d.a(a2).getRectManager().h(a3);
            for (yxf yxf = a3.getOuterCoordinator$ui(); !mlc.q((Object)yxf, (Object)((yxf)a3.Z.y).S) && yxf != null; yxf = yxf.S) {
                yxf.v1();
                yxf.A1();
            }
            final inf m = a3.M();
            final Object[] v = m.v;
            while (i < m.x) {
                ((LayoutNode)v[i]).z().m0();
                ++i;
            }
        }
    }
    
    public final int n(final int n) {
        final m0d a = this.A;
        if (omo.R(a.a)) {
            final byd q = a.q;
            q.getClass();
            return q.n(n);
        }
        this.n0();
        return ((goe)a.a()).n(n);
    }
    
    public final void n0() {
        final m0d a = this.A;
        LayoutNode.t0(a.a, false, 7);
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
    
    public final int o() {
        return this.D;
    }
    
    public final void q0() {
        this.a0 = true;
        final m0d a = this.A;
        final LayoutNode g = a.a.G();
        float d0 = ((yxf)this.d()).d0;
        final LayoutNode a2 = a.a;
        d0d d0d;
        for (yxf yxf = a2.getOuterCoordinator$ui(); yxf != a2.Z.y; yxf = ((yxf)d0d).S) {
            yxf.getClass();
            d0d = (d0d)yxf;
            d0 += ((yxf)d0d).d0;
        }
        if (d0 != this.Z) {
            this.Z = d0;
            if (g != null) {
                g.j0();
            }
            if (g != null) {
                g.P();
            }
        }
        if (!((wxd)this.d()).J) {
            final boolean n = this.N;
            if (!n || this.S.d()) {
                this.h0();
            }
            if (!n) {
                if (g != null) {
                    g.P();
                }
                if (this.B && g != null) {
                    g.s0(false);
                }
            }
            else {
                ((yxf)a2.Z.y).t1();
            }
        }
        if (g != null) {
            if (!this.B && g.v() == 3) {
                if (this.D != Integer.MAX_VALUE) {
                    gac.c("Place was called on a node which was placed already");
                }
                this.D = g.t().i;
                final m0d t = g.t();
                ++t.i;
            }
        }
        else {
            this.D = 0;
        }
        this.G();
    }
    
    public final void requestLayout() {
        this.A.a.s0(false);
    }
    
    public final int s(final int n) {
        final m0d a = this.A;
        if (omo.R(a.a)) {
            final byd q = a.q;
            q.getClass();
            return q.s(n);
        }
        this.n0();
        return ((goe)a.a()).s(n);
    }
    
    public final o8h u(final long n) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        if (a2.k0 == 3) {
            a2.f();
        }
        if (omo.R(a3)) {
            final byd q = a.q;
            q.getClass();
            q.E = 3;
            q.u(n);
        }
        final LayoutNode g = a3.G();
        if (g != null) {
            if (this.h0 != 3) {
                if (!a3.Y) {
                    gac.c("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
                }
            }
            final int d = ge9.D(g.v());
            int h0;
            if (d != 0) {
                h0 = 2;
                if (d != 2) {
                    en9.q("Measurable could be only measured from the parent's measure or layout block. Parents state is ".concat(hia.C(g.v())));
                    return null;
                }
            }
            else {
                h0 = 1;
            }
            this.h0 = h0;
        }
        else {
            this.h0 = 3;
        }
        this.x0(n);
        return this;
    }
    
    public final void u0(final long n, final float n2, final lta lta, final g6b g6b) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        if (a2.j0) {
            gac.a("place is called on a deactivated node");
        }
        a.d = 3;
        this.H = n;
        this.K = n2;
        this.I = lta;
        this.J = g6b;
        this.a0 = false;
        final Owner a4 = l0d.a(a3);
        if (!this.Q && this.N) {
            final yxf a5 = a.a();
            a5.y1(ugc.d(n, ((o8h)a5).z), n2, lta, g6b);
            this.q0();
        }
        else {
            a.f(this.S.g = false);
            this.b0 = lta;
            this.d0 = n;
            this.e0 = n2;
            this.c0 = g6b;
            final lmg snapshotObserver = a4.getSnapshotObserver();
            snapshotObserver.a.d((Object)a3, (lta)snapshotObserver.f, (jta)this.f0);
        }
        a.d = 5;
        if (((wxd)a.a()).J && (a.k || a.j)) {
            this.requestLayout();
        }
        this.F = true;
    }
    
    public final void v0(final long n, final float n2, final lta lta, final g6b g6b) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        final Throwable t2;
        Label_0295: {
            Label_0093: {
                try {
                    this.O = true;
                    if (ugc.b(n, this.H) && lta == this.I) {
                        if (!this.g0) {
                            break Label_0093;
                        }
                    }
                }
                finally {
                    break Label_0295;
                }
                if (a.k || a.j || this.g0) {
                    this.Q = true;
                    this.g0 = false;
                }
            }
            final byd q = a.q;
            if (q != null) {
                final m0d a4 = q.A;
                if (q.M == 3) {
                    if (!omo.R(a4.a)) {
                        a4.c = true;
                    }
                }
            }
            final byd q2 = a.q;
            if (q2 != null && q2.f0()) {
                final yxf t = a.a().T;
                Object o;
                if (t != null) {
                    o = ((wxd)t).K;
                }
                else {
                    o = l0d.a(a3).getPlacementScope();
                }
                final byd q3 = a.q;
                q3.getClass();
                final LayoutNode g = a3.G();
                if (g != null) {
                    g.t().h = 0;
                }
                q3.D = Integer.MAX_VALUE;
                n8h.g((n8h)o, (o8h)q3, (int)(n >> 32), (int)(0xFFFFFFFFL & n));
            }
            final byd q4 = a.q;
            if (q4 != null && !q4.G) {
                gac.c("Error: Placement happened before lookahead.");
            }
            this.u0(n, n2, (lta)t2, g6b);
            return;
        }
        a2.w0(t2);
        throw null;
    }
    
    public final boolean x0(long w) {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        final m0d m0d;
        Label_0429: {
            try {
                if (a2.j0) {
                    gac.a("measure is called on a deactivated node");
                }
            }
            finally {
                break Label_0429;
            }
            final Owner a4 = l0d.a(a3);
            final LayoutNode g = a3.G();
            final boolean y = a3.Y;
            final boolean b = true;
            a3.Y = (y || (g != null && g.Y));
            if (!a3.B() && gv6.c(super.y, w)) {
                ((AndroidComposeView)a4).h(a3, false);
                a3.v0();
                return false;
            }
            this.S.f = false;
            final inf m = a3.M();
            final Object[] v = m.v;
            for (int x = m.x, i = 0; i < x; ++i) {
                ((LayoutNode)v[i]).t().p.S.c = false;
            }
            this.E = true;
            final long x2 = ((o8h)m0d.a()).x;
            this.d0(w);
            if (m0d.d != 5) {
                gac.c("layout state is not idle before measure starts");
            }
            this.W = w;
            m0d.d = 1;
            this.P = false;
            final lmg snapshotObserver = l0d.a(a3).getSnapshotObserver();
            snapshotObserver.a.d((Object)a3, (lta)snapshotObserver.c, (jta)this.X);
            if (m0d.d == 1) {
                this.Q = true;
                this.R = true;
                m0d.d = 5;
            }
            boolean b2 = b;
            if (chc.b(((o8h)m0d.a()).x, x2)) {
                b2 = b;
                if (((o8h)m0d.a()).v == super.v) {
                    b2 = (((o8h)m0d.a()).w != super.w && b);
                }
            }
            final int v2 = ((o8h)m0d.a()).v;
            final int w2 = ((o8h)m0d.a()).w;
            w = v2;
            this.c0(((long)w2 & 0xFFFFFFFFL) | w << 32);
            return b2;
        }
        a2.w0((Throwable)m0d);
        throw null;
    }
    
    public final void y0() {
        final m0d a = this.A;
        final LayoutNode a2 = a.a;
        final LayoutNode a3 = a.a;
        if (a2.W() && a.l > 0) {
            final m0d t = a3.t();
            final boolean j = t.j;
            int i = 0;
            if ((j || t.k) && !t.p.Q) {
                a3.s0(false);
            }
            final inf m = a3.M();
            final Object[] v = m.v;
            while (i < m.x) {
                ((LayoutNode)v[i]).z().y0();
                ++i;
            }
        }
    }
    
    public final Object z() {
        return this.M;
    }
}
