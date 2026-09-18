import androidx.compose.ui.node.LayoutNode;

public final class m0d
{
    public final LayoutNode a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public final loe p;
    public byd q;
    
    public m0d(final LayoutNode a) {
        this.a = a;
        this.d = 5;
        this.p = new loe(this);
    }
    
    public final yxf a() {
        return (yxf)this.a.Z.z;
    }
    
    public final void b() {
        final int v = this.a.v();
        if (v == 3 || v == 4) {
            if (this.p.V) {
                this.g(true);
            }
            else {
                this.f(true);
            }
        }
        if (v == 4) {
            final byd q = this.q;
            if (q != null && q.Q) {
                this.i(true);
                return;
            }
            this.h(true);
        }
    }
    
    public final void c(final long u) {
        final byd q = this.q;
        if (q != null) {
            final m0d a = q.A;
            a.d = 2;
            final LayoutNode a2 = a.a;
            a.e = false;
            q.U = u;
            final lmg snapshotObserver = l0d.a(a2).getSnapshotObserver();
            snapshotObserver.a.d((Object)a2, (lta)snapshotObserver.b, (jta)q.V);
            a.f = true;
            a.g = true;
            final boolean r = omo.R(a2);
            final loe p = a.p;
            if (r) {
                p.Q = true;
                p.R = true;
            }
            else {
                p.P = true;
            }
            a.d = 5;
        }
    }
    
    public final void d(final int l) {
        final int i = this.l;
        this.l = l;
        int n = false ? 1 : 0;
        final boolean b = i == 0;
        if (l == 0) {
            n = (true ? 1 : 0);
        }
        if ((b ? 1 : 0) != n) {
            final LayoutNode g = this.a.G();
            m0d t;
            if (g != null) {
                t = g.t();
            }
            else {
                t = null;
            }
            if (t != null) {
                final int j = t.l;
                if (l == 0) {
                    t.d(j - 1);
                    return;
                }
                t.d(j + 1);
            }
        }
    }
    
    public final void e(final int o) {
        final int o2 = this.o;
        this.o = o;
        int n = false ? 1 : 0;
        final boolean b = o2 == 0;
        if (o == 0) {
            n = (true ? 1 : 0);
        }
        if ((b ? 1 : 0) != n) {
            final LayoutNode g = this.a.G();
            m0d t;
            if (g != null) {
                t = g.t();
            }
            else {
                t = null;
            }
            if (t != null) {
                final int o3 = t.o;
                if (o == 0) {
                    t.e(o3 - 1);
                    return;
                }
                t.e(o3 + 1);
            }
        }
    }
    
    public final void f(final boolean k) {
        if (this.k != k) {
            this.k = k;
            if (k && !this.j) {
                this.d(this.l + 1);
                return;
            }
            if (!k && !this.j) {
                this.d(this.l - 1);
            }
        }
    }
    
    public final void g(final boolean j) {
        if (this.j != j) {
            this.j = j;
            if (j && !this.k) {
                this.d(this.l + 1);
                return;
            }
            if (!j && !this.k) {
                this.d(this.l - 1);
            }
        }
    }
    
    public final void h(final boolean n) {
        if (this.n != n) {
            this.n = n;
            if (n && !this.m) {
                this.e(this.o + 1);
                return;
            }
            if (!n && !this.m) {
                this.e(this.o - 1);
            }
        }
    }
    
    public final void i(final boolean m) {
        if (this.m != m) {
            this.m = m;
            if (m && !this.n) {
                this.e(this.o + 1);
                return;
            }
            if (!m && !this.n) {
                this.e(this.o - 1);
            }
        }
    }
    
    public final void j() {
        final loe p = this.p;
        final m0d a = p.A;
        final Object m = p.M;
        final LayoutNode a2 = this.a;
        if (m != null || a.a().z() != null) {
            if (p.L) {
                p.L = false;
                p.M = a.a().z();
                final LayoutNode g = a2.G();
                if (g != null) {
                    LayoutNode.t0(g, false, 7);
                }
            }
        }
        final byd q = this.q;
        if (q != null) {
            final m0d a3 = q.A;
            if (q.T == null) {
                final yxd f1 = a3.a().f1();
                f1.getClass();
                if (f1.P.z() == null) {
                    return;
                }
            }
            if (q.S) {
                q.S = false;
                final yxd f2 = a3.a().f1();
                f2.getClass();
                q.T = f2.P.z();
                if (omo.R(a2)) {
                    final LayoutNode g2 = a2.G();
                    if (g2 != null) {
                        LayoutNode.t0(g2, false, 7);
                    }
                }
                else {
                    final LayoutNode g3 = a2.G();
                    if (g3 != null) {
                        LayoutNode.r0(g3, false, 7);
                    }
                }
            }
        }
    }
}
