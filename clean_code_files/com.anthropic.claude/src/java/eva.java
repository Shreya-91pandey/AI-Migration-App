import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public final class eva extends tl6
{
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final umf e;
    public final ksg f;
    public final gva g;
    
    public eva(final gva g, final long a, final boolean b, final boolean c, final j9j j9j) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        final umf a2 = kak.a;
        this.e = new umf();
        this.f = new ksg(e3h.y, (q8m)awp.H);
    }
    
    @Override
    public final void a(final yl6 yl6, final zta zta) {
        this.g.b.a(yl6, zta);
    }
    
    @Override
    public final umf b(final yl6 yl6, final vwl vwl, final zta zta) {
        return this.g.b.b(yl6, vwl, zta);
    }
    
    @Override
    public final void c(final iif iif) {
        this.g.b.c(iif);
    }
    
    @Override
    public final void d() {
        final gva g = this.g;
        --g.A;
    }
    
    @Override
    public final boolean e() {
        return this.g.b.e();
    }
    
    @Override
    public final boolean f() {
        return this.b;
    }
    
    @Override
    public final boolean g() {
        return this.c;
    }
    
    @Override
    public final long h() {
        return this.a;
    }
    
    @Override
    public final sl6 i() {
        return this.g.h;
    }
    
    @Override
    public final e3h j() {
        return (e3h)this.f.getValue();
    }
    
    @Override
    public final hc7 k() {
        return this.g.b.k();
    }
    
    @Override
    public final boolean l() {
        return this.g.b.l();
    }
    
    @Override
    public final void m(final iif iif) {
        this.g.b.m(iif);
    }
    
    @Override
    public final void n(final yl6 yl6) {
        final gva g = this.g;
        final tl6 b = g.b;
        b.n(g.h);
        b.n(yl6);
    }
    
    @Override
    public final void o(final iif iif, final hif hif, final it0 it0) {
        this.g.b.o(iif, hif, it0);
    }
    
    @Override
    public final hif p(final iif iif) {
        return this.g.b.p(iif);
    }
    
    @Override
    public final umf q(final yl6 yl6, final vwl vwl, final umf umf) {
        return this.g.b.q(yl6, vwl, umf);
    }
    
    @Override
    public final void r(final Set set) {
        HashSet d;
        if ((d = this.d) == null) {
            d = new HashSet();
            this.d = d;
        }
        ((Set)d).add((Object)set);
    }
    
    @Override
    public final void s(final gva gva) {
        this.e.a((Object)gva);
    }
    
    @Override
    public final void t(final b0j b0j) {
        this.g.b.t(b0j);
    }
    
    @Override
    public final void u(final yl6 yl6) {
        this.g.b.u(yl6);
    }
    
    @Override
    public final q13 v(final h87 h87) {
        return this.g.b.v(h87);
    }
    
    @Override
    public final void w() {
        final gva g = this.g;
        ++g.A;
    }
    
    @Override
    public final void x(final gva gva) {
        final HashSet d = this.d;
        if (d != null) {
            for (final Set set : d) {
                gva.getClass();
                set.remove((Object)gva.z());
            }
        }
        if (gva != null) {
            this.e.l((Object)gva);
        }
    }
    
    @Override
    public final void y(final yl6 yl6) {
        this.g.b.y(yl6);
    }
    
    public final void z() {
        final umf e = this.e;
        if (e.h()) {
            final HashSet d = this.d;
            if (d != null) {
                final Object[] b = e.b;
                final long[] a = e.a;
                final int n = a.length - 2;
                if (n >= 0) {
                    int n2 = 0;
                    while (true) {
                        long n3 = a[n2];
                        if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                            final int n4 = 8 - (~(n2 - n) >>> 31);
                            for (int i = 0; i < n4; ++i) {
                                if ((0xFFL & n3) < 128L) {
                                    final gva gva = (gva)b[(n2 << 3) + i];
                                    final Iterator iterator = d.iterator();
                                    while (iterator.hasNext()) {
                                        ((Set)iterator.next()).remove((Object)gva.z());
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
            e.b();
        }
    }
}
