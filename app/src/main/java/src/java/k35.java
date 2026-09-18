import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class k35 extends h0
{
    public peh f0;
    public f8c g0;
    
    @Override
    public final void D(final o70 o70, final keh keh) {
        this.y1();
        if (super.Q && super.U == null) {
            final jxa e = o1r.e((ixa)this);
            this.o1((t98)e);
            super.U = e;
        }
        final keh w = keh.w;
        int i = 0;
        if (keh == w) {
            if (this.g0 != null) {
                final ArrayList list = (ArrayList)o70.f();
                for (int size = list.size(), j = 0; j < size; ++j) {
                    final f8c f8c = (f8c)list.get(j);
                    if (f8c.f() || !f8c.d() || f8c.c()) {
                        final float g = ((jap)uoo.z(this, (sei)hm6.u)).g();
                        final ArrayList list2 = (ArrayList)o70.f();
                        for (int size2 = list2.size(), k = 0; k < size2; ++k) {
                            final f8c f8c2 = (f8c)list2.get(k);
                            final long b = f8c2.b();
                            final f8c g2 = this.g0;
                            g2.getClass();
                            final boolean b2 = Math.abs(l6g.d(l6g.h(b, g2.b()))) > g;
                            if (f8c2.f() || b2) {
                                this.E1(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                ((f8c)((ArrayList)o70.f()).get(0)).a();
                if (super.Q) {
                    super.V = "recognized";
                    final f8c g3 = this.g0;
                    g3.getClass();
                    this.v1(g3.b(), true);
                    this.C1();
                }
                this.g0 = null;
                return;
            }
            final ArrayList list3 = (ArrayList)o70.f();
            final int size3 = list3.size();
            int l = 0;
            while (l < size3) {
                if (b9r.i((f8c)list3.get(l))) {
                    final f8c g4 = (f8c)((ArrayList)o70.f()).get(0);
                    g4.a();
                    this.g0 = g4;
                    if (super.Q) {
                        super.V = "waiting";
                        this.w1(g4);
                        return;
                    }
                    break;
                }
                else {
                    ++l;
                }
            }
        }
        else if (keh == keh.x) {
            if (this.g0 != null) {
                for (ArrayList list4 = (ArrayList)o70.f(); i < list4.size(); ++i) {
                    final f8c f8c3 = (f8c)list4.get(i);
                    if (f8c3.f() && f8c3 != this.g0) {
                        this.E1(true);
                        break;
                    }
                }
            }
            if (mlc.q(super.V, "recognized")) {
                super.V = "idle";
            }
        }
    }
    
    public final void E1(final boolean b) {
        if (b) {
            this.g0 = null;
        }
        else {
            this.f0 = null;
        }
        this.u1(b);
        super.V = "idle";
    }
    
    @Override
    public final void G(final jeh jeh, final keh keh, final long n) {
        super.G(jeh, keh, n);
        if (keh == keh.w) {
            if (this.f0 != null) {
                final List a = jeh.a;
                for (int size = ((Collection)a).size(), i = 0; i < size; ++i) {
                    if (!i1r.g((peh)a.get(i))) {
                        final long t1 = this.t1(n);
                        for (int size2 = ((Collection)a).size(), j = 0; j < size2; ++j) {
                            final peh peh = (peh)a.get(j);
                            if (peh.l() || i1r.n(peh, n, t1)) {
                                this.E1(false);
                                return;
                            }
                        }
                        return;
                    }
                }
                ((peh)a.get(0)).a();
                if (super.Q) {
                    super.V = "recognized";
                    final peh f0 = this.f0;
                    f0.getClass();
                    this.v1(f0.e(), false);
                    this.C1();
                }
                this.f0 = null;
                return;
            }
            if (ccn.h(jeh, true)) {
                final peh f2 = (peh)jeh.a.get(0);
                f2.a();
                this.f0 = f2;
                if (super.Q) {
                    super.V = "waiting";
                    this.x1(f2);
                }
            }
        }
        else if (keh == keh.x) {
            if (this.f0 != null) {
                final List a2 = jeh.a;
                for (int size3 = ((Collection)a2).size(), k = 0; k < size3; ++k) {
                    final peh peh2 = (peh)a2.get(k);
                    if (peh2.l() && peh2 != this.f0) {
                        this.E1(false);
                        break;
                    }
                }
            }
            if (mlc.q(super.V, "recognized")) {
                super.V = "idle";
            }
        }
    }
    
    @Override
    public final void V() {
        final llf l = super.L;
        if (l != null) {
            final wmb y = super.Y;
            if (y != null) {
                l.b((eic)new xmb(y));
            }
        }
        super.Y = null;
        this.E1(false);
    }
    
    @Override
    public final void y0() {
        this.E1(true);
    }
}
