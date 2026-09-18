import java.util.Collection;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;

public final class v5d implements mgk
{
    public static final n9k y;
    public final o58 a;
    public boolean b;
    public l5d c;
    public boolean d;
    public final gb0 e;
    public final ksg f;
    public final llf g;
    public float h;
    public boolean i;
    public final r68 j;
    public final boolean k;
    public LayoutNode l;
    public final s5d m;
    public final jn1 n;
    public final z3d o;
    public final v2b p;
    public final p4d q;
    public final j9j r;
    public final m4d s;
    public final bnf t;
    public final ksg u;
    public final ksg v;
    public final bnf w;
    public final e3a x;
    
    static {
        y = twl.K((lta)new shc((byte)13), (zta)new rg6((byte)17));
    }
    
    public v5d(final int n, final int n2) {
        final Object a = new Object();
        ((o58)a).a = -1;
        ((o58)a).d = -1;
        this.a = (o58)a;
        final Object e = new Object();
        ((gb0)e).w = new hsg(n);
        ((gb0)e).x = new hsg(n2);
        ((gb0)e).z = new h4d(n, 30, 100);
        this.e = (gb0)e;
        this.f = new ksg((Object)y5d.a, (q8m)cib.A);
        this.g = new llf();
        this.j = new r68((lta)new p8a((Object)this, (byte)10));
        this.k = true;
        this.m = new s5d(this);
        this.n = (jn1)new Object();
        this.o = new z3d();
        this.p = new v2b((byte)22);
        this.q = new p4d((lta)new bf4((Object)this, n, (byte)1));
        this.r = new j9j((Object)this, (byte)19);
        this.s = new m4d();
        this.t = ri2.w();
        final Boolean booleanFalse = Boolean.FALSE;
        this.u = o50.Q((Object)false);
        this.v = o50.Q((Object)false);
        this.w = ri2.w();
        this.x = new e3a((byte)7);
    }
    
    public static Object l(final v5d v5d, final int n, final h07 h07) {
        v5d.getClass();
        final Object b = v5d.b(lnf.v, (zta)new u5d(v5d, n, 0, (f07)null), (f07)h07);
        if (b == pc7.v) {
            return b;
        }
        return lqo.a;
    }
    
    public final boolean a() {
        return this.j.a();
    }
    
    public final Object b(final lnf v, final zta zta, final f07 f07) {
        t5d t5d2 = null;
        Label_0054: {
            if (f07 instanceof t5d) {
                final t5d t5d = (t5d)f07;
                final int z = t5d.z;
                if ((z & Integer.MIN_VALUE) != 0x0) {
                    t5d.z = z + Integer.MIN_VALUE;
                    t5d2 = t5d;
                    break Label_0054;
                }
            }
            t5d2 = new t5d(this, f07);
        }
        final Object x = t5d2.x;
        final int z2 = t5d2.z;
        final pc7 v2 = pc7.v;
        zta zta2;
        lnf v3;
        if (z2 != 0) {
            if (z2 != 1) {
                if (z2 == 2) {
                    vt4.g0(x);
                    return lqo.a;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                zta2 = (zta)t5d2.w;
                v3 = t5d2.v;
                vt4.g0(x);
            }
        }
        else {
            vt4.g0(x);
            v3 = v;
            zta2 = zta;
            if (this.f.getValue() == y5d.a) {
                t5d2.v = v;
                t5d2.w = (m6n)zta;
                t5d2.z = 1;
                v3 = v;
                zta2 = zta;
                if (this.n.c((h07)t5d2) == v2) {
                    return v2;
                }
            }
        }
        t5d2.v = null;
        t5d2.w = null;
        t5d2.z = 2;
        if (this.j.b(v3, zta2, (f07)t5d2) != v2) {
            return lqo.a;
        }
        return v2;
    }
    
    public final boolean c() {
        return (boolean)this.v.getValue();
    }
    
    public final boolean d() {
        return (boolean)this.u.getValue();
    }
    
    public final float e(final float n) {
        return this.j.e(n);
    }
    
    public final boolean f() {
        return this.j.f();
    }
    
    public final Object g(final int n, final int n2, final h07 h07) {
        Object o = null;
        Label_0054: {
            if (h07 instanceof r5d) {
                final r5d r5d = (r5d)h07;
                final int x = r5d.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    r5d.x = x + Integer.MIN_VALUE;
                    o = r5d;
                    break Label_0054;
                }
            }
            o = new r5d(this, h07);
        }
        final Object v = ((r5d)o).v;
        final int x2 = ((r5d)o).x;
        Label_0151: {
            if (x2 != 0) {
                Label_0089: {
                    if (x2 == 1) {
                        Label_0160: {
                            try {
                                vt4.g0(v);
                                break Label_0151;
                            }
                            finally {
                                break Label_0160;
                            }
                            break Label_0089;
                        }
                        this.i = false;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
            this.i = true;
            final qn qn = new qn(this, n, n2, (f07)null);
            ((r5d)o).x = 1;
            final Object b = this.b(lnf.v, (zta)qn, (f07)o);
            final pc7 v2 = pc7.v;
            if (b == v2) {
                return v2;
            }
        }
        this.i = false;
        return lqo.a;
    }
    
    public final void h(l5d e, final boolean b, final boolean b2) {
        final List l = e.l;
        final int o = e.o;
        final int b3 = e.b;
        final m5d a = e.a;
        this.q.e = l.size();
        final e3a x = this.x;
        final l5d l5d = null;
        final gb0 e2 = this.e;
        if (b || !this.b) {
            if (b) {
                this.b = true;
            }
            int a2;
            if (a != null) {
                a2 = a.a;
            }
            else {
                a2 = 0;
            }
            this.v.setValue((Object)(a2 != 0 || b3 != 0));
            this.u.setValue((Object)e.c);
            this.h -= e.d;
            this.f.setValue((Object)e);
            if (b2) {
                e2.getClass();
                if (b3 < 0.0f) {
                    jac.c("scrollOffset should be non-negative");
                }
                ((hsg)e2.x).i(b3);
            }
            else {
                final m5d m5d = (m5d)c86.I0(l);
                final m5d m5d2 = (m5d)c86.R0(l);
                long n;
                if (m5d != null) {
                    n = m5d.a;
                }
                else {
                    n = -1L;
                }
                ncq.S(n, "firstVisibleItem:index");
                long n2;
                if (m5d2 != null) {
                    n2 = m5d2.a;
                }
                else {
                    n2 = -1L;
                }
                ncq.S(n2, "lastVisibleItem:index");
                e2.getClass();
                Object i;
                if (a != null) {
                    i = a.l;
                }
                else {
                    i = null;
                }
                e2.y = i;
                if (e2.v || o > 0) {
                    e2.v = true;
                    if (b3 < 0.0f) {
                        jac.c("scrollOffset should be non-negative");
                    }
                    int a3;
                    if (a != null) {
                        a3 = a.a;
                    }
                    else {
                        a3 = 0;
                    }
                    e2.h(a3, b3);
                }
                if (this.k) {
                    final o58 a4 = this.a;
                    final int a5 = a4.a;
                    final boolean c = a4.c;
                    if (a5 != -1 && !((Collection)l).isEmpty() && a5 != o58.a(e, c)) {
                        a4.a = -1;
                        final o4d b4 = a4.b;
                        if (b4 != null) {
                            b4.cancel();
                        }
                        a4.b = null;
                    }
                    final int d = a4.d;
                    if (d != -1) {
                        if (a4.e != 0.0f) {
                            if (d != o && !((Collection)l).isEmpty()) {
                                final int a6 = o58.a(e, a4.e < 0.0f);
                                if (a6 >= 0 && a6 < o) {
                                    a4.a = a6;
                                    a4.b = j9j.C(this.r, a6);
                                }
                            }
                        }
                    }
                    a4.d = o;
                }
            }
            if (b) {
                x.X(e.f, e.i, e.h);
            }
            return;
        }
        this.c = e;
        final r7m a7 = q7m.a();
        e = l5d;
        if (a7 != null) {
            e = (l5d)a7.e();
        }
        final r7m b5 = q7m.b(a7);
        Label_0200: {
            try {
                if (((Number)((dg0)x.x).w.getValue()).floatValue() != 0.0f && a != null && a.a == ((hsg)e2.w).h() && b3 == ((hsg)e2.x).h()) {
                    x.T();
                }
            }
            finally {
                break Label_0200;
            }
            q7m.d(a7, b5, (lta)e);
            return;
        }
        q7m.d(a7, b5, (lta)e);
    }
    
    public final l5d i() {
        return (l5d)this.f.getValue();
    }
    
    public final void j(final float e, final l5d l5d) {
        if (this.k) {
            final o58 a = this.a;
            a.getClass();
            if (!((Collection)l5d.l).isEmpty()) {
                final boolean c = e < 0.0f;
                final int a2 = o58.a(l5d, c);
                if (a2 >= 0 && a2 < l5d.o) {
                    if (a2 != a.a) {
                        if (a.c != c) {
                            a.a = -1;
                            final o4d b = a.b;
                            if (b != null) {
                                b.cancel();
                            }
                            a.b = null;
                        }
                        a.c = c;
                        a.a = a2;
                        a.b = j9j.C(this.r, a2);
                    }
                    final List l = l5d.l;
                    if (c) {
                        final m5d m5d = (m5d)c86.P0(l);
                        if (m5d.p + m5d.q + l5d.s - l5d.n < -e) {
                            final o4d b2 = a.b;
                            if (b2 != null) {
                                b2.a();
                            }
                        }
                    }
                    else if (l5d.m - ((m5d)c86.G0(l)).p < e) {
                        final o4d b3 = a.b;
                        if (b3 != null) {
                            b3.a();
                        }
                    }
                }
            }
            a.e = e;
        }
    }
    
    public final void k(final int n, final int n2) {
        if (this.j.a()) {
            rhc.G(((l5d)this.f.getValue()).h, (hc7)null, 0, (zta)new i00(this, (f07)null, (byte)6), 3);
        }
        this.m(n, n2, false);
    }
    
    public final void m(final int n, final int n2, final boolean b) {
        final gb0 e = this.e;
        if (((hsg)e.w).h() != n || ((hsg)e.x).h() != n2) {
            final z3d o = this.o;
            o.e();
            o.b = null;
            o.c = -1;
        }
        e.h(n, n2);
        e.y = null;
        if (b) {
            final LayoutNode l = this.l;
            if (l != null) {
                l.n();
            }
            return;
        }
        ri2.Z(this.t);
    }
}
