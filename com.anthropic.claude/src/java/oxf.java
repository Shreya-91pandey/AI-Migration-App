import java.util.Collection;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.ArrayList;

public final class oxf extends byf
{
    public final hgf c;
    public final gvd d;
    public final rwd e;
    public yxf f;
    public jeh g;
    public boolean h;
    public boolean i;
    public boolean j;
    
    public oxf(final hgf c) {
        this.c = c;
        this.d = new gvd();
        this.e = new rwd(2);
        this.i = true;
        this.j = true;
    }
    
    @Override
    public final boolean a(final rwd rwd, final nzc nzc, final ms9 ms9, final boolean b) {
        final boolean a = super.a(rwd, nzc, ms9, b);
        hgf hgf = this.c;
        if (hgf.I) {
            inf inf = null;
            while (hgf != null) {
                inf inf2;
                if (hgf instanceof teh) {
                    this.f = l1r.h((teh)hgf);
                    inf2 = inf;
                }
                else {
                    inf2 = inf;
                    if ((hgf.x & 0x10) != 0x0) {
                        inf2 = inf;
                        if (hgf instanceof v98) {
                            hgf hgf2 = ((v98)hgf).K;
                            int n = 0;
                            while (hgf2 != null) {
                                hgf hgf3 = hgf;
                                inf inf3 = inf;
                                int n2 = n;
                                if ((hgf2.x & 0x10) != 0x0) {
                                    n2 = n + 1;
                                    if (n2 == 1) {
                                        hgf3 = hgf2;
                                        inf3 = inf;
                                    }
                                    else {
                                        inf inf4;
                                        if ((inf4 = inf) == null) {
                                            inf4 = new inf(0, new hgf[16]);
                                        }
                                        hgf hgf4;
                                        if ((hgf4 = hgf) != null) {
                                            inf4.b(hgf);
                                            hgf4 = null;
                                        }
                                        inf4.b(hgf2);
                                        inf3 = inf4;
                                        hgf3 = hgf4;
                                    }
                                }
                                hgf2 = hgf2.A;
                                hgf = hgf3;
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
                hgf = soh.G(inf2);
                inf = inf2;
            }
            if (this.f != null) {
                final int f = rwd.f();
                int n3 = 0;
                gvd d;
                rwd e;
                while (true) {
                    d = this.d;
                    e = this.e;
                    if (n3 >= f) {
                        break;
                    }
                    final long c = rwd.c(n3);
                    final peh peh = (peh)rwd.g(n3);
                    if (d.d(c)) {
                        final long h = peh.h();
                        final long e2 = peh.e();
                        if (((h & 0x7FFFFFFF7FFFFFFFL) + 36028792732385279L & 0x8000000080000000L) == 0x0L && ((e2 & 0x7FFFFFFF7FFFFFFFL) + 36028792732385279L & 0x8000000080000000L) == 0x0L) {
                            final ArrayList list = new ArrayList(peh.c().size());
                            final List c2 = peh.c();
                            for (int size = ((Collection)c2).size(), i = 0; i < size; ++i) {
                                final zjb zjb = (zjb)c2.get(i);
                                final long c3 = zjb.c();
                                if (((c3 & 0x7FFFFFFF7FFFFFFFL) + 36028792732385279L & 0x8000000080000000L) == 0x0L) {
                                    final long e3 = zjb.e();
                                    final yxf f2 = this.f;
                                    f2.getClass();
                                    list.add((Object)new zjb(e3, f2.O(nzc, c3, true), zjb.d(), zjb.b(), zjb.a()));
                                }
                            }
                            final yxf f3 = this.f;
                            f3.getClass();
                            final long o = f3.O(nzc, h, true);
                            final yxf f4 = this.f;
                            f4.getClass();
                            e.d(c, (Object)peh.b(peh, f4.O(nzc, e2, true), o, list));
                        }
                    }
                    ++n3;
                }
                if (e.f() == 0) {
                    d.c();
                    super.a.h();
                    return true;
                }
                for (int n4 = d.g() - 1; -1 < n4; --n4) {
                    final long f5 = d.f(n4);
                    if (rwd.v) {
                        final int y = rwd.y;
                        final long[] w = rwd.w;
                        final Object[] x = rwd.x;
                        int y2 = 0;
                        int n5;
                        for (int j = 0; j < y; ++j, y2 = n5) {
                            final Object o2 = x[j];
                            n5 = y2;
                            if (o2 != yjq.c) {
                                if (j != y2) {
                                    w[y2] = w[j];
                                    x[y2] = o2;
                                    x[j] = null;
                                }
                                n5 = y2 + 1;
                            }
                        }
                        rwd.v = false;
                        rwd.y = y2;
                    }
                    if (o50.p(rwd.w, rwd.y, f5) < 0) {
                        d.j(n4);
                    }
                }
                final ArrayList list2 = new ArrayList(e.f());
                for (int f6 = e.f(), k = 0; k < f6; ++k) {
                    list2.add(e.g(k));
                }
                final jeh g = new jeh((List)list2, ms9);
                while (true) {
                    for (int size2 = list2.size(), l = 0; l < size2; ++l) {
                        final Object value = list2.get(l);
                        if (ms9.a(((peh)value).d())) {
                            final peh peh2 = (peh)value;
                            Label_1094: {
                                if (peh2 != null) {
                                    if (!b) {
                                        this.i = false;
                                    }
                                    else if (!this.i && (peh2.f() || peh2.i())) {
                                        final yxf f7 = this.f;
                                        f7.getClass();
                                        this.i = (i1r.m(f7.x, peh2) ^ true);
                                    }
                                    final boolean m = this.i;
                                    final boolean h2 = this.h;
                                    int f8 = 5;
                                    Label_1036: {
                                        if (m != h2) {
                                            final int f9 = g.f;
                                            if (f9 != 3) {
                                                if (f9 != 4) {
                                                    if (f9 != 5) {
                                                        break Label_1036;
                                                    }
                                                }
                                            }
                                            if (m) {
                                                f8 = 4;
                                            }
                                            g.f = f8;
                                            break Label_1094;
                                        }
                                    }
                                    final int f10 = g.f;
                                    if (f10 == 4 && h2 && !this.j) {
                                        g.f = 3;
                                    }
                                    else if (f10 == 5 && m && peh2.f()) {
                                        g.f = 3;
                                    }
                                }
                            }
                            boolean b2 = false;
                            Label_1227: {
                                Label_1224: {
                                    if (!a && g.f == 3) {
                                        final jeh g2 = this.g;
                                        if (g2 != null) {
                                            final List a2 = g2.a;
                                            final int size3 = a2.size();
                                            final List a3 = g.a;
                                            if (size3 == a3.size()) {
                                                for (int size4 = a3.size(), n6 = 0; n6 < size4; ++n6) {
                                                    if (!l6g.c(((peh)a2.get(n6)).e(), ((peh)a3.get(n6)).e())) {
                                                        break Label_1224;
                                                    }
                                                }
                                                b2 = false;
                                                break Label_1227;
                                            }
                                        }
                                    }
                                }
                                b2 = true;
                            }
                            this.g = g;
                            return b2;
                        }
                    }
                    final Object value = null;
                    continue;
                }
            }
        }
        return true;
    }
    
    @Override
    public final void b(final ms9 ms9) {
        super.b(ms9);
        final jeh g = this.g;
        if (g == null) {
            return;
        }
        this.h = this.i;
        final List a = g.a;
        final int size = ((Collection)a).size();
        boolean j = false;
        for (int i = 0; i < size; ++i) {
            final peh peh = (peh)a.get(i);
            final boolean f = peh.f();
            final boolean a2 = ms9.a(peh.d());
            final boolean k = this.i;
            if ((!f && !a2) || (!f && !k)) {
                this.d.i(peh.d());
            }
        }
        this.i = false;
        if (g.f == 5) {
            j = true;
        }
        this.j = j;
    }
    
    public final void c() {
        final inf a = super.a;
        final Object[] v = a.v;
        for (int x = a.x, i = 0; i < x; ++i) {
            ((oxf)v[i]).c();
        }
        hgf hgf = this.c;
        inf inf = null;
        while (hgf != null) {
            inf inf2;
            if (hgf instanceof teh) {
                ((teh)hgf).V();
                inf2 = inf;
            }
            else {
                inf2 = inf;
                if ((hgf.x & 0x10) != 0x0) {
                    inf2 = inf;
                    if (hgf instanceof v98) {
                        hgf hgf2 = ((v98)hgf).K;
                        int n = 0;
                        while (hgf2 != null) {
                            inf inf3 = inf;
                            int n2 = n;
                            hgf hgf3 = hgf;
                            if ((hgf2.x & 0x10) != 0x0) {
                                n2 = n + 1;
                                if (n2 == 1) {
                                    hgf3 = hgf2;
                                    inf3 = inf;
                                }
                                else {
                                    if ((inf3 = inf) == null) {
                                        inf3 = new inf(0, new hgf[16]);
                                    }
                                    if ((hgf3 = hgf) != null) {
                                        inf3.b(hgf);
                                        hgf3 = null;
                                    }
                                    inf3.b(hgf2);
                                }
                            }
                            hgf2 = hgf2.A;
                            inf = inf3;
                            n = n2;
                            hgf = hgf3;
                        }
                        inf2 = inf;
                        if (n == 1) {
                            continue;
                        }
                    }
                }
            }
            hgf = soh.G(inf2);
            inf = inf2;
        }
    }
    
    public final boolean d(final ms9 ms9) {
        final rwd e = this.e;
        final int f = e.f();
        final boolean b = false;
        final int n = 0;
        boolean b2;
        if (f == 0) {
            b2 = b;
        }
        else {
            final hgf c = this.c;
            if (!c.I) {
                b2 = b;
            }
            else {
                final yxf c2 = c.C;
                boolean w = false;
                Label_0087: {
                    if (c2 != null) {
                        final LayoutNode p = c2.P;
                        if (p != null) {
                            w = p.W();
                            break Label_0087;
                        }
                    }
                    w = false;
                }
                if (!w) {
                    b2 = b;
                }
                else {
                    final jeh g = this.g;
                    g.getClass();
                    final yxf f2 = this.f;
                    f2.getClass();
                    final long x = f2.x;
                    hgf g2 = c;
                    inf inf = null;
                    while (g2 != null) {
                        inf inf2;
                        if (g2 instanceof teh) {
                            ((teh)g2).G(g, keh.x, x);
                            inf2 = inf;
                        }
                        else {
                            inf2 = inf;
                            if ((g2.x & 0x10) != 0x0) {
                                inf2 = inf;
                                if (g2 instanceof v98) {
                                    hgf hgf = ((v98)g2).K;
                                    int n2 = 0;
                                    while (hgf != null) {
                                        hgf hgf2 = g2;
                                        inf inf3 = inf;
                                        int n3 = n2;
                                        if ((hgf.x & 0x10) != 0x0) {
                                            n3 = n2 + 1;
                                            if (n3 == 1) {
                                                hgf2 = hgf;
                                                inf3 = inf;
                                            }
                                            else {
                                                inf inf4;
                                                if ((inf4 = inf) == null) {
                                                    inf4 = new inf(0, new hgf[16]);
                                                }
                                                hgf hgf3;
                                                if ((hgf3 = g2) != null) {
                                                    inf4.b(g2);
                                                    hgf3 = null;
                                                }
                                                inf4.b(hgf);
                                                inf3 = inf4;
                                                hgf2 = hgf3;
                                            }
                                        }
                                        hgf = hgf.A;
                                        g2 = hgf2;
                                        inf = inf3;
                                        n2 = n3;
                                    }
                                    inf2 = inf;
                                    if (n2 == 1) {
                                        continue;
                                    }
                                }
                            }
                        }
                        g2 = soh.G(inf2);
                        inf = inf2;
                    }
                    if (c.I) {
                        final inf a = super.a;
                        final Object[] v = a.v;
                        for (int x2 = a.x, i = n; i < x2; ++i) {
                            ((oxf)v[i]).d(ms9);
                        }
                    }
                    b2 = true;
                }
            }
        }
        this.b(ms9);
        e.a();
        this.f = null;
        return b2;
    }
    
    public final boolean e(final ms9 ms9, final boolean b) {
        if (this.e.f() == 0) {
            return false;
        }
        final hgf c = this.c;
        if (c.I) {
            final yxf c2 = c.C;
            boolean w = false;
            Label_0066: {
                if (c2 != null) {
                    final LayoutNode p2 = c2.P;
                    if (p2 != null) {
                        w = p2.W();
                        break Label_0066;
                    }
                }
                w = false;
            }
            if (w) {
                final jeh g = this.g;
                g.getClass();
                final yxf f = this.f;
                f.getClass();
                final long x = f.x;
                hgf g2 = c;
                inf inf = null;
                while (g2 != null) {
                    inf inf2;
                    if (g2 instanceof teh) {
                        ((teh)g2).G(g, keh.v, x);
                        inf2 = inf;
                    }
                    else {
                        inf2 = inf;
                        if ((g2.x & 0x10) != 0x0) {
                            inf2 = inf;
                            if (g2 instanceof v98) {
                                hgf hgf = ((v98)g2).K;
                                int n = 0;
                                while (hgf != null) {
                                    hgf hgf2 = g2;
                                    inf inf3 = inf;
                                    int n2 = n;
                                    if ((hgf.x & 0x10) != 0x0) {
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
                                            hgf hgf3;
                                            if ((hgf3 = g2) != null) {
                                                inf4.b(g2);
                                                hgf3 = null;
                                            }
                                            inf4.b(hgf);
                                            inf3 = inf4;
                                            hgf2 = hgf3;
                                        }
                                    }
                                    hgf = hgf.A;
                                    g2 = hgf2;
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
                    g2 = soh.G(inf2);
                    inf = inf2;
                }
                if (c.I) {
                    final inf a = super.a;
                    final Object[] v = a.v;
                    for (int x2 = a.x, i = 0; i < x2; ++i) {
                        final oxf oxf = (oxf)v[i];
                        this.f.getClass();
                        oxf.e(ms9, b);
                    }
                }
                if (c.I) {
                    inf inf5 = null;
                    hgf g3 = c;
                    while (g3 != null) {
                        inf inf6;
                        if (g3 instanceof teh) {
                            ((teh)g3).G(g, keh.w, x);
                            inf6 = inf5;
                        }
                        else {
                            inf6 = inf5;
                            if ((g3.x & 0x10) != 0x0) {
                                inf6 = inf5;
                                if (g3 instanceof v98) {
                                    hgf hgf4 = ((v98)g3).K;
                                    int n3 = 0;
                                    while (hgf4 != null) {
                                        hgf hgf5 = g3;
                                        inf inf7 = inf5;
                                        int n4 = n3;
                                        if ((hgf4.x & 0x10) != 0x0) {
                                            n4 = n3 + 1;
                                            if (n4 == 1) {
                                                hgf5 = hgf4;
                                                inf7 = inf5;
                                            }
                                            else {
                                                inf inf8;
                                                if ((inf8 = inf5) == null) {
                                                    inf8 = new inf(0, new hgf[16]);
                                                }
                                                hgf hgf6;
                                                if ((hgf6 = g3) != null) {
                                                    inf8.b(g3);
                                                    hgf6 = null;
                                                }
                                                inf8.b(hgf4);
                                                inf7 = inf8;
                                                hgf5 = hgf6;
                                            }
                                        }
                                        hgf4 = hgf4.A;
                                        g3 = hgf5;
                                        inf5 = inf7;
                                        n3 = n4;
                                    }
                                    inf6 = inf5;
                                    if (n3 == 1) {
                                        continue;
                                    }
                                }
                            }
                        }
                        g3 = soh.G(inf6);
                        inf5 = inf6;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public final void f(final long n, final emf emf) {
        final gvd d = this.d;
        if (d.d(n)) {
            if (emf.h((Object)this) < 0) {
                d.i(n);
                this.e.e(n);
            }
        }
        final inf a = super.a;
        final Object[] v = a.v;
        for (int x = a.x, i = 0; i < x; ++i) {
            ((oxf)v[i]).f(n, emf);
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Node(modifierNode=");
        sb.append((Object)this.c);
        sb.append(", children=");
        sb.append((Object)super.a);
        sb.append(", pointerIds=");
        sb.append((Object)this.d);
        sb.append(")");
        return sb.toString();
    }
}
