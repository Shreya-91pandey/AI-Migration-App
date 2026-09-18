import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

public final class ajn implements xom, jpm
{
    public final ksg v;
    public final ksg w;
    public wmn x;
    public xin y;
    
    public ajn() {
        this.v = new ksg((Object)null, (q8m)zin.f);
        this.w = new ksg((Object)null, (q8m)yin.g);
        this.y = new xin();
    }
    
    public final lpm a() {
        return this.y;
    }
    
    public final lpm d(final lpm lpm, final lpm lpm2, final lpm lpm3) {
        return lpm3;
    }
    
    public final omn e(final zin zin, final yin yin) {
        final hhn f = zin.a.f();
        final List v = f.v;
        final lln w = f.w;
        Object o;
        if (w != null) {
            final nnn a = w.a;
            final ArrayList list = new ArrayList();
            final ogc c = a.c;
            o = list;
            if (!nar.b(c.u(), c.x())) {
                int n = 4;
                while (true) {
                    o = list;
                    if (n >= ogc.e(c).b) {
                        break;
                    }
                    if (!c.z(n)) {
                        final Object o2 = c.o(n);
                        if (o2 != null) {
                            final long w2 = c.w(n);
                            int h = gar.h(w2);
                            if (h > a.d) {
                                h -= a.c();
                            }
                            int g = gar.g(w2);
                            if (g > a.d) {
                                g -= a.c();
                            }
                            list.add((Object)new ng0(h, g, o2));
                        }
                    }
                    n += 4;
                }
            }
        }
        else {
            o = null;
        }
        Object n2;
        if ((v == null || ((Collection)v).isEmpty()) && (o == null || ((Collection)o).isEmpty())) {
            n2 = null;
        }
        else if (v != null && !((Collection)v).isEmpty()) {
            n2 = v;
            if (o != null) {
                if (((Collection)o).isEmpty()) {
                    n2 = v;
                }
                else {
                    final ygd a2 = lq6.A();
                    a2.addAll((Collection)v);
                    a2.addAll((Collection)o);
                    n2 = lq6.n(a2);
                }
            }
        }
        else {
            n2 = o;
        }
        final xin xin = (xin)g8m.f((lpm)this.y);
        final omn n3 = xin.n;
        final int n4 = 1;
        if (n3 != null) {
            final CharSequence c2 = xin.c;
            if (c2 != null && rym.u0(c2, (CharSequence)f) && mlc.q((Object)xin.d, n2) && mlc.q((Object)xin.e, (Object)f.z) && xin.g == zin.c && xin.h == zin.d && xin.k == yin.b && xin.i == yin.a.getDensity() && xin.j == yin.a.o0() && gv6.c(xin.m, yin.d) && mlc.q((Object)xin.l, (Object)yin.c) && !n3.b.a.e()) {
                final mnn f2 = xin.f;
                final int n5 = 0;
                final boolean b = f2 != null && f2.d(zin.b);
                final mnn f3 = xin.f;
                int n6 = n5;
                Label_0601: {
                    if (f3 != null) {
                        final mnn b2 = zin.b;
                        if (f3 != b2) {
                            n6 = n5;
                            if (!f3.a.c(b2.a)) {
                                break Label_0601;
                            }
                        }
                        n6 = 1;
                    }
                }
                if (b && n6 != 0) {
                    return n3;
                }
                if (b) {
                    final nmn a3 = n3.a;
                    return new omn(new nmn(a3.a, zin.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, a3.j), n3.b, n3.c);
                }
            }
        }
        wmn x;
        if ((x = this.x) == null) {
            x = new wmn(yin.c, (xc8)yin.a, yin.b, 1);
            this.x = x;
        }
        final boolean e = zin.e;
        mnn mnn2;
        final mnn mnn = mnn2 = zin.b;
        if (e) {
            final jpd k = mnn.a.k;
            hpd hpd;
            if (k == null || (hpd = k.a()) == null) {
                hpd = zah.a.v().a();
            }
            mnn2 = mnn.e(new mnn(0L, 0L, (zoa)null, (soa)null, (una)null, 0L, 0L, 0, tiq.i(hpd), 0L, (idd)null, 16711679));
        }
        final String string = f.x.toString();
        Object v2;
        if (n2 == null) {
            v2 = r89.v;
        }
        else {
            v2 = n2;
        }
        final og0 og0 = new og0(string, (List)v2);
        final boolean d = zin.d;
        int n7;
        if (zin.c) {
            n7 = n4;
        }
        else {
            n7 = Integer.MAX_VALUE;
        }
        final omn b3 = wmn.b(x, og0, mnn2, 0, d, n7, yin.d, yin.b, (xc8)yin.a, yin.c, 1060);
        if (!b3.equals((Object)n3)) {
            final r7m h2 = g8m.h();
            if (!h2.f()) {
                final xin y = this.y;
                final Object c3 = g8m.c;
                synchronized (c3) {
                    final xin xin2 = (xin)g8m.w((lpm)y, (jpm)this, h2);
                    xin2.c = (CharSequence)f;
                    xin2.d = (List)n2;
                    xin2.e = f.z;
                    xin2.g = zin.c;
                    xin2.h = zin.d;
                    xin2.f = zin.b;
                    xin2.k = yin.b;
                    xin2.i = yin.e;
                    xin2.j = yin.f;
                    xin2.m = yin.d;
                    xin2.l = yin.c;
                    xin2.n = b3;
                    monitorexit(c3);
                    g8m.l(h2, (jpm)this);
                    return b3;
                }
            }
        }
        return b3;
    }
    
    public final void f(final lpm lpm) {
        this.y = (xin)lpm;
    }
    
    public final Object getValue() {
        final zin zin = (zin)this.v.getValue();
        if (zin != null) {
            final yin yin = (yin)this.w.getValue();
            if (yin != null) {
                return this.e(zin, yin);
            }
        }
        return null;
    }
}
