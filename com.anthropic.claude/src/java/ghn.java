import java.util.Collection;
import java.util.List;

public final class ghn implements Appendable
{
    public jmq A;
    public long B;
    public dnn C;
    public inf D;
    public yog E;
    public final hhn v;
    public final dhc w;
    public final oug x;
    public nnn y;
    public boolean z;
    
    public ghn(final hhn v, jmq jmq, hhn v2, dhc w, int i) {
        final inf inf = null;
        if ((i & 0x2) != 0x0) {
            jmq = null;
        }
        if ((i & 0x4) != 0x0) {
            v2 = v;
        }
        if ((i & 0x8) != 0x0) {
            w = null;
        }
        this.v = v2;
        this.w = w;
        final Object x = new Object();
        ((oug)x).v = (CharSequence)v;
        ((oug)x).x = -1;
        ((oug)x).y = -1;
        this.x = (oug)x;
        final lln w2 = v.w;
        final List v3 = v.v;
        nnn y;
        if (w2 != null) {
            y = new nnn(w2.a, 2);
        }
        else {
            y = null;
        }
        this.y = y;
        jmq a;
        if (jmq != null) {
            a = new jmq(jmq);
        }
        else {
            a = null;
        }
        this.A = a;
        this.B = v.y;
        this.C = v.z;
        inf d = inf;
        if (v3 != null) {
            if (((Collection)v3).isEmpty()) {
                d = inf;
            }
            else {
                final int size = v3.size();
                final ng0[] array = new ng0[size];
                for (i = 0; i < size; ++i) {
                    array[i] = (ng0)v3.get(i);
                }
                d = new inf(size, (Object[])array);
            }
        }
        this.D = d;
    }
    
    public static void d(final ghn ghn, int o, int o2, final CharSequence charSequence, int n, boolean b, int o3) {
        if ((o3 & 0x10) != 0x0) {
            n = charSequence.length();
        }
        if ((o3 & 0x20) != 0x0) {
            b = false;
        }
        final oug x = ghn.x;
        if (o > o2) {
            final StringBuilder sb = new StringBuilder("Expected start=");
            sb.append(o);
            sb.append(" <= end=");
            sb.append(o2);
            jac.a(sb.toString());
        }
        if (n < 0) {
            final StringBuilder sb2 = new StringBuilder("Expected textStart=0 <= textEnd=");
            sb2.append(n);
            jac.a(sb2.toString());
        }
        o = ncq.o(o, 0, x.length());
        o2 = ncq.o(o2, 0, x.length());
        o3 = ncq.o(0, 0, charSequence.length());
        n = ncq.o(n, 0, charSequence.length());
        ghn.b(o, o2, n - o3, b);
        ghn.x.a(o, o2, charSequence, o3, n);
        ghn.g(null);
        ghn.E = null;
    }
    
    public static hhn i(final ghn ghn, long b, dnn c, List list, final int n) {
        if ((n & 0x1) != 0x0) {
            b = ghn.B;
        }
        if ((n & 0x2) != 0x0) {
            c = ghn.C;
        }
        final inf d = ghn.D;
        List g = null;
        Label_0059: {
            if (d != null) {
                g = d.g();
                if (!((hnf)g).isEmpty()) {
                    break Label_0059;
                }
            }
            g = null;
        }
        if ((n & 0x8) != 0x0) {
            list = null;
        }
        return new hhn((CharSequence)ghn.x.toString(), b, c, null, g, list, bjq.n(ghn), 8);
    }
    
    public final jmq a() {
        jmq a;
        if ((a = this.A) == null) {
            a = new jmq((jmq)null);
            this.A = a;
        }
        return a;
    }
    
    public final Appendable append(final char c) {
        final oug x = this.x;
        this.b(x.length(), x.length(), 1, false);
        oug.b(x, x.length(), x.length(), (CharSequence)String.valueOf(c));
        return (Appendable)this;
    }
    
    public final Appendable append(final CharSequence charSequence) {
        if (charSequence != null) {
            final oug x = this.x;
            this.b(x.length(), x.length(), charSequence.length(), false);
            x.a(x.length(), x.length(), charSequence, 0, charSequence.length());
        }
        return (Appendable)this;
    }
    
    public final Appendable append(final CharSequence charSequence, final int n, final int n2) {
        if (charSequence != null) {
            final oug x = this.x;
            this.b(x.length(), x.length(), n2 - n, false);
            oug.b(x, x.length(), x.length(), charSequence.subSequence(n, n2));
        }
        return (Appendable)this;
    }
    
    public final void b(int i, int n, final int n2, final boolean b) {
        this.a().E(i, n, n2, b);
        final dhc w = this.w;
        if (w != null) {
            w.i(i, n, n2);
        }
        this.B = zbq.h(i, n, n2, this.B);
        final nnn y = this.y;
        if (y != null) {
            final ogc c = y.c;
            if (!y.a) {
                jac.c("This buffer is immutable");
            }
            if (!c.A()) {
                final int n3 = n - i;
                final int n4 = n2 - n3;
                if (!c.A()) {
                    if (y.c() < n4) {
                        final int n5 = y.c() - n4 + 1000;
                        final int d = y.d;
                        final ilf f = ogc.f(c);
                        if (!nar.b(c.u(), c.x()) && c.q(c.u()) >= d) {
                            if (c.r(c.u()) <= Integer.MAX_VALUE) {
                                int n6 = c.u();
                            Label_0206:
                                while (true) {
                                    int n7 = 0;
                                    while (!nar.b(n6, c.x())) {
                                        if (n7 != 0) {
                                            if (n7 != 1) {
                                                if (n7 != 2) {
                                                    continue;
                                                }
                                                if (!nar.b(c.s(n6), c.x())) {
                                                    if (nar.b(n6, c.p(c.s(n6)))) {
                                                        n7 = 1;
                                                    }
                                                    else {
                                                        n7 = 2;
                                                    }
                                                }
                                                n6 = c.s(n6);
                                            }
                                            else {
                                                if (c.v(n6) <= Integer.MAX_VALUE && c.n(n6) >= d) {
                                                    f.a(n6);
                                                }
                                                if (!nar.b(c.t(n6), c.x()) && c.q(c.t(n6)) >= d && c.r(c.t(n6)) <= Integer.MAX_VALUE) {
                                                    n6 = c.t(n6);
                                                    continue Label_0393;
                                                }
                                                n7 = 2;
                                            }
                                        }
                                        else {
                                            if (!nar.b(c.p(n6), c.x()) && c.q(c.p(n6)) >= d) {
                                                n6 = c.p(n6);
                                                continue Label_0393;
                                            }
                                            n7 = 1;
                                        }
                                        continue;
                                        Label_0393: {
                                            continue Label_0206;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        final int b2 = f.b;
                        int n8 = d;
                        int j = 0;
                        int n9 = 0;
                        final int n10 = n5;
                        while (j < b2) {
                            final int c2 = f.c(j);
                            final long w2 = c.w(c2);
                            int h;
                            if (gar.h(w2) > y.d) {
                                h = gar.h(w2) + n10;
                            }
                            else {
                                h = gar.h(w2);
                            }
                            int g;
                            if (gar.g(w2) > y.d) {
                                g = gar.g(w2) + n10;
                            }
                            else {
                                g = gar.g(w2);
                            }
                            final long d2 = gar.d(h, g, nkq.g(w2), nkq.f(w2));
                            final int v = c.v(c2);
                            c.I(c2, d2);
                            ogc.g(c, c2);
                            final int h2 = gar.h(d2);
                            if (h2 >= gar.g(d2)) {
                                ogc.c(c, c2);
                                ogc.d(c, c2);
                            }
                            else if (h2 >= n8 && h2 <= Integer.MAX_VALUE && (h2 == v || v >= d)) {
                                n8 = h2;
                            }
                            else {
                                ogc.c(c, c2);
                                f.f(n9, f.c(j));
                                ++n9;
                            }
                            ++j;
                        }
                        for (int k = 0; k < n9; ++k) {
                            final int c3 = f.c(k);
                            c.D(c3, 0);
                            c.F(c3, c.w(c3));
                            c.E(c3, c.x());
                            c.H(c3, c.x());
                            c.i(c3);
                        }
                        f.b = 0;
                        ogc.b(c);
                        y.e += n10;
                    }
                }
                final int d3 = y.d;
                if (i < d3 && n <= d3) {
                    final int n11 = d3 - n;
                    if (n11 != 0) {
                        final int n12 = d3 - n11;
                        final ilf f2 = ogc.f(c);
                        if (!nar.b(c.u(), c.x()) && c.q(c.u()) >= n12) {
                            if (c.r(c.u()) <= d3) {
                                i = c.u();
                            Label_0917:
                                while (true) {
                                    n = 0;
                                    while (!nar.b(i, c.x())) {
                                        if (n != 0) {
                                            if (n != 1) {
                                                if (n != 2) {
                                                    continue;
                                                }
                                                if (!nar.b(c.s(i), c.x())) {
                                                    if (nar.b(i, c.p(c.s(i)))) {
                                                        n = 1;
                                                    }
                                                    else {
                                                        n = 2;
                                                    }
                                                }
                                                i = c.s(i);
                                            }
                                            else {
                                                if (c.v(i) <= d3 && c.n(i) >= n12) {
                                                    f2.a(i);
                                                }
                                                if (!nar.b(c.t(i), c.x()) && c.q(c.t(i)) >= n12 && c.r(c.t(i)) <= d3) {
                                                    i = c.t(i);
                                                    continue Label_0917;
                                                }
                                                n = 2;
                                            }
                                        }
                                        else {
                                            if (!nar.b(c.p(i), c.x()) && c.q(c.p(i)) >= n12) {
                                                i = c.p(i);
                                                continue Label_0917;
                                            }
                                            n = 1;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        final int b3 = f2.b;
                        int n13 = n12;
                        int l = 0;
                        int n14 = 0;
                        while (l < b3) {
                            final int c4 = f2.c(l);
                            final long w3 = c.w(c4);
                            if (gar.h(w3) == n12 && nkq.g(w3)) {
                                i = gar.h(w3);
                            }
                            else {
                                i = y.d;
                                n = gar.h(w3);
                                if (n12 <= n && n <= i) {
                                    i = gar.h(w3) + y.c();
                                }
                                else {
                                    i = gar.h(w3);
                                }
                            }
                            if (gar.g(w3) == n12 && !nkq.f(w3)) {
                                n = gar.g(w3);
                            }
                            else {
                                n = y.d;
                                final int g2 = gar.g(w3);
                                if (n12 <= g2 && g2 <= n) {
                                    n = gar.g(w3);
                                    n += y.c();
                                }
                                else {
                                    n = gar.g(w3);
                                }
                            }
                            final long d4 = gar.d(i, n, nkq.g(w3), nkq.f(w3));
                            n = c.v(c4);
                            c.I(c4, d4);
                            ogc.g(c, c4);
                            i = gar.h(d4);
                            if (i >= gar.g(d4)) {
                                ogc.c(c, c4);
                                ogc.d(c, c4);
                            }
                            else if (i >= n13 && i <= d3 && (i == n || n >= n12)) {
                                n13 = i;
                            }
                            else {
                                ogc.c(c, c4);
                                f2.f(n14, f2.c(l));
                                ++n14;
                            }
                            ++l;
                        }
                        for (i = 0; i < n14; ++i) {
                            n = f2.c(i);
                            c.D(n, 0);
                            c.F(n, c.w(n));
                            c.E(n, c.x());
                            c.H(n, c.x());
                            c.i(n);
                        }
                        f2.b = 0;
                        ogc.b(c);
                        y.d -= n11;
                        y.e -= n11;
                    }
                    y.b(n3);
                }
                else if (i < d3 && n >= d3) {
                    y.b(d3 - i);
                    y.a(n - d3);
                }
                else {
                    final int n15 = i - d3;
                    if (n15 != 0) {
                        final int e = y.e;
                        final int n16 = e + n15;
                        final ilf f3 = ogc.f(c);
                        if (!nar.b(c.u(), c.x()) && c.q(c.u()) >= e) {
                            if (c.r(c.u()) <= n16) {
                                i = c.u();
                            Label_1702:
                                while (true) {
                                    n = 0;
                                    while (!nar.b(i, c.x())) {
                                        if (n != 0) {
                                            if (n != 1) {
                                                if (n != 2) {
                                                    continue;
                                                }
                                                if (!nar.b(c.s(i), c.x())) {
                                                    if (nar.b(i, c.p(c.s(i)))) {
                                                        n = 1;
                                                    }
                                                    else {
                                                        n = 2;
                                                    }
                                                }
                                                i = c.s(i);
                                            }
                                            else {
                                                if (c.v(i) <= n16 && c.n(i) >= e) {
                                                    f3.a(i);
                                                }
                                                if (!nar.b(c.t(i), c.x()) && c.q(c.t(i)) >= e && c.r(c.t(i)) <= n16) {
                                                    i = c.t(i);
                                                    continue Label_1702;
                                                }
                                                n = 2;
                                            }
                                        }
                                        else {
                                            if (!nar.b(c.p(i), c.x()) && c.q(c.p(i)) >= e) {
                                                i = c.p(i);
                                                continue Label_1702;
                                            }
                                            n = 1;
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                        final int b4 = f3.b;
                        int n17 = e;
                        int n18 = 0;
                        int n19 = 0;
                        n = n15;
                        while (n18 < b4) {
                            final int c5 = f3.c(n18);
                            final long w4 = c.w(c5);
                            int h4 = 0;
                            Label_2059: {
                                int n20;
                                if (gar.h(w4) == n16 && nkq.g(w4)) {
                                    n20 = gar.h(w4);
                                    i = y.c();
                                }
                                else {
                                    i = y.e;
                                    final int h3 = gar.h(w4);
                                    if (i > h3 || h3 >= n16) {
                                        h4 = gar.h(w4);
                                        break Label_2059;
                                    }
                                    n20 = gar.h(w4);
                                    i = y.c();
                                }
                                h4 = n20 - i;
                            }
                            if (gar.g(w4) == n16 && !nkq.f(w4)) {
                                i = gar.g(w4) - y.c();
                            }
                            else {
                                i = y.e;
                                final int g3 = gar.g(w4);
                                if (i <= g3 && g3 < n16) {
                                    i = gar.g(w4) - y.c();
                                }
                                else {
                                    i = gar.g(w4);
                                }
                            }
                            final long d5 = gar.d(h4, i, nkq.g(w4), nkq.f(w4));
                            final int v2 = c.v(c5);
                            c.I(c5, d5);
                            ogc.g(c, c5);
                            i = gar.h(d5);
                            if (i >= gar.g(d5)) {
                                ogc.c(c, c5);
                                ogc.d(c, c5);
                            }
                            else if (i >= n17 && i <= n16 && (i == v2 || v2 >= e)) {
                                n17 = i;
                            }
                            else {
                                ogc.c(c, c5);
                                f3.f(n19, f3.c(n18));
                                ++n19;
                            }
                            ++n18;
                        }
                        int c6;
                        for (i = 0; i < n19; ++i) {
                            c6 = f3.c(i);
                            c.D(c6, 0);
                            c.F(c6, c.w(c6));
                            c.E(c6, c.x());
                            c.H(c6, c.x());
                            c.i(c6);
                        }
                        f3.b = 0;
                        ogc.b(c);
                        y.d += n;
                        y.e += n;
                    }
                    y.a(n3);
                }
                y.d += n2;
            }
        }
    }
    
    public final void c(final int n, final int n2, final CharSequence charSequence) {
        d(this, n, n2, charSequence, charSequence.length(), false, 32);
    }
    
    public final void e(final long n) {
        final long c = rhc.c(0, this.x.length());
        if (!dnn.a(c, n)) {
            final String i = dnn.i(n);
            final String j = dnn.i(c);
            final StringBuilder sb = new StringBuilder("Expected ");
            sb.append(i);
            sb.append(" to be in ");
            sb.append(j);
            jac.a(sb.toString());
        }
    }
    
    public final void f(final int n, int i, final List list) {
        final oug x = this.x;
        if (n < 0 || n > x.length()) {
            en9.j(smk.o(n, x.length(), "start (", ") offset is outside of text region "));
            return;
        }
        if (i < 0 || i > x.length()) {
            en9.j(smk.o(i, x.length(), "end (", ") offset is outside of text region "));
            return;
        }
        if (n < i) {
            this.g(new dnn(rhc.c(n, i)));
            final inf d = this.D;
            if (d != null) {
                d.h();
            }
            if (list != null) {
                if (!((Collection)list).isEmpty()) {
                    final inf d2 = this.D;
                    i = 0;
                    if (d2 == null) {
                        this.D = new inf(0, (Object[])new ng0[16]);
                    }
                    while (i < ((Collection)list).size()) {
                        final ng0 ng0 = (ng0)list.get(i);
                        final inf d3 = this.D;
                        if (d3 != null) {
                            d3.b((Object)ng0.a(ng0, (kg0)null, ng0.b + n, ng0.c + n, 9));
                        }
                        ++i;
                    }
                }
            }
            return;
        }
        en9.s(smk.o(n, i, "Do not set reversed or empty range: ", " > "));
    }
    
    public final void g(final dnn c) {
        if (c != null && !dnn.d(c.a)) {
            this.C = c;
            return;
        }
        this.C = null;
        final inf d = this.D;
        if (d != null) {
            d.h();
        }
    }
    
    public final void h(final long b) {
        this.e(b);
        this.B = b;
        this.E = null;
    }
    
    @Override
    public final String toString() {
        return this.x.toString();
    }
}
