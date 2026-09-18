public final class nnn
{
    public final boolean a;
    public final Object b;
    public final ogc c;
    public int d;
    public int e;
    
    public nnn(final nnn nnn, final boolean a) {
        this.a = a;
        ogc l = null;
        Label_0038: {
            if (nnn != null) {
                final ogc c = nnn.c;
                if (c != null) {
                    l = c.l();
                    break Label_0038;
                }
            }
            l = new ogc();
        }
        this.c = l;
        if (nnn != null) {
            this.d = nnn.d;
            this.e = nnn.e;
            return;
        }
        this.d = 0;
        this.e = 1000;
    }
    
    public final void a(final int n) {
        if (n == 0) {
            return;
        }
        final int e = this.e;
        final int n2 = e + n;
        final ogc c = this.c;
        final ilf f = ogc.f(c);
        if (!nar.b(c.u(), c.x()) && c.q(c.u()) >= e) {
            if (c.r(c.u()) <= n2) {
                int n3 = c.u();
            Label_0085:
                while (true) {
                    int n4 = 0;
                    while (!nar.b(n3, c.x())) {
                        if (n4 != 0) {
                            if (n4 != 1) {
                                if (n4 != 2) {
                                    continue;
                                }
                                if (!nar.b(c.s(n3), c.x())) {
                                    if (nar.b(n3, c.p(c.s(n3)))) {
                                        n4 = 1;
                                    }
                                    else {
                                        n4 = 2;
                                    }
                                }
                                n3 = c.s(n3);
                            }
                            else {
                                if (c.v(n3) <= n2 && c.n(n3) >= e) {
                                    f.a(n3);
                                }
                                if (!nar.b(c.t(n3), c.x()) && c.q(c.t(n3)) >= e && c.r(c.t(n3)) <= n2) {
                                    n3 = c.t(n3);
                                    continue Label_0085;
                                }
                                n4 = 2;
                            }
                        }
                        else {
                            if (!nar.b(c.p(n3), c.x()) && c.q(c.p(n3)) >= e) {
                                n3 = c.p(n3);
                                continue Label_0085;
                            }
                            n4 = 1;
                        }
                    }
                    break;
                }
            }
        }
        final int b = f.b;
        int n5 = e;
        int i = 0;
        int n6 = 0;
        while (i < b) {
            final int c2 = f.c(i);
            final long w = c.w(c2);
            final int h = gar.h(w);
            final int e2 = this.e;
            int n7 = 0;
            Label_0414: {
                if (h != e2) {
                    final int h2 = gar.h(w);
                    if (e2 > h2 || h2 > n2) {
                        n7 = gar.h(w);
                        break Label_0414;
                    }
                    if (nkq.g(w)) {
                        n7 = this.d;
                        break Label_0414;
                    }
                }
                n7 = n2;
            }
            final int g = gar.g(w);
            final int e3 = this.e;
            int n8 = 0;
            Label_0483: {
                if (g != e3) {
                    final int g2 = gar.g(w);
                    if (e3 > g2 || g2 > n2) {
                        n8 = gar.g(w);
                        break Label_0483;
                    }
                    if (!nkq.f(w)) {
                        n8 = this.d;
                        break Label_0483;
                    }
                }
                n8 = n2;
            }
            long n9;
            if (n7 < n8 && (n7 != this.d || n8 != n2)) {
                n9 = gar.d(n7, n8, nkq.g(w), nkq.f(w));
            }
            else {
                n9 = gar.e(n7, n7);
            }
            final int v = c.v(c2);
            c.I(c2, n9);
            ogc.g(c, c2);
            final int h3 = gar.h(n9);
            if (h3 >= gar.g(n9)) {
                ogc.c(c, c2);
                ogc.d(c, c2);
            }
            else if (h3 >= n5 && h3 <= n2 && (h3 == v || v >= e)) {
                n5 = h3;
            }
            else {
                ogc.c(c, c2);
                f.f(n6, f.c(i));
                ++n6;
            }
            ++i;
        }
        for (int j = 0; j < n6; ++j) {
            final int c3 = f.c(j);
            c.D(c3, 0);
            c.F(c3, c.w(c3));
            c.E(c3, c.x());
            c.H(c3, c.x());
            c.i(c3);
        }
        f.b = 0;
        ogc.b(c);
        this.e += n;
    }
    
    public final void b(final int n) {
        if (n == 0) {
            return;
        }
        final int d = this.d;
        final int n2 = d - n;
        final ogc c = this.c;
        final ilf f = ogc.f(c);
        if (!nar.b(c.u(), c.x()) && c.q(c.u()) >= n2) {
            if (c.r(c.u()) <= d) {
                int n3 = c.u();
            Label_0085:
                while (true) {
                    int n4 = 0;
                    while (!nar.b(n3, c.x())) {
                        if (n4 != 0) {
                            if (n4 != 1) {
                                if (n4 != 2) {
                                    continue;
                                }
                                if (!nar.b(c.s(n3), c.x())) {
                                    if (nar.b(n3, c.p(c.s(n3)))) {
                                        n4 = 1;
                                    }
                                    else {
                                        n4 = 2;
                                    }
                                }
                                n3 = c.s(n3);
                            }
                            else {
                                if (c.v(n3) <= d && c.n(n3) >= n2) {
                                    f.a(n3);
                                }
                                if (!nar.b(c.t(n3), c.x()) && c.q(c.t(n3)) >= n2 && c.r(c.t(n3)) <= d) {
                                    n3 = c.t(n3);
                                    continue Label_0085;
                                }
                                n4 = 2;
                            }
                        }
                        else {
                            if (!nar.b(c.p(n3), c.x()) && c.q(c.p(n3)) >= n2) {
                                n3 = c.p(n3);
                                continue Label_0085;
                            }
                            n4 = 1;
                        }
                    }
                    break;
                }
            }
        }
        final int b = f.b;
        int n5 = n2;
        int i = 0;
        int n6 = 0;
        while (i < b) {
            final int c2 = f.c(i);
            final long w = c.w(c2);
            final int h = gar.h(w);
            final int d2 = this.d;
            int n7 = 0;
            Label_0414: {
                if (h != d2) {
                    final int h2 = gar.h(w);
                    if (n2 > h2 || h2 >= d2) {
                        n7 = gar.h(w);
                        break Label_0414;
                    }
                    if (!nkq.g(w)) {
                        n7 = this.e;
                        break Label_0414;
                    }
                }
                n7 = n2;
            }
            final int g = gar.g(w);
            final int d3 = this.d;
            int n8 = 0;
            Label_0483: {
                if (g != d3) {
                    final int g2 = gar.g(w);
                    if (n2 > g2 || g2 >= d3) {
                        n8 = gar.g(w);
                        break Label_0483;
                    }
                    if (nkq.f(w)) {
                        n8 = this.e;
                        break Label_0483;
                    }
                }
                n8 = n2;
            }
            long n9;
            if (n7 < n8 && (n7 != n2 || n8 != this.e)) {
                n9 = gar.d(n7, n8, nkq.g(w), nkq.f(w));
            }
            else {
                n9 = gar.e(n7, n7);
            }
            final int v = c.v(c2);
            c.I(c2, n9);
            ogc.g(c, c2);
            final int h3 = gar.h(n9);
            if (h3 >= gar.g(n9)) {
                ogc.c(c, c2);
                ogc.d(c, c2);
            }
            else if (h3 >= n5 && h3 <= d && (h3 == v || v >= n2)) {
                n5 = h3;
            }
            else {
                ogc.c(c, c2);
                f.f(n6, f.c(i));
                ++n6;
            }
            ++i;
        }
        for (int j = 0; j < n6; ++j) {
            final int c3 = f.c(j);
            c.D(c3, 0);
            c.F(c3, c.w(c3));
            c.E(c3, c.x());
            c.H(c3, c.x());
            c.i(c3);
        }
        f.b = 0;
        ogc.b(c);
        this.d -= n;
    }
    
    public final int c() {
        return this.e - this.d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nnn)) {
            return false;
        }
        final int d = this.d;
        final nnn nnn = (nnn)o;
        return d == nnn.d && this.e == nnn.e && mlc.q((Object)this.c, (Object)nnn.c);
    }
    
    @Override
    public final int hashCode() {
        return (this.c.hashCode() * 31 + this.d) * 31 + this.e;
    }
}
