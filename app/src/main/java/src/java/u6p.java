public final class u6p implements q6p
{
    public float[] A;
    public ig0 B;
    public ig0 C;
    public ig0 D;
    public ig0 E;
    public float[] F;
    public float[] G;
    public j9j H;
    public final ilf v;
    public final jlf w;
    public final short x;
    public final u09 y;
    public int[] z;
    
    public u6p(final ilf v, final jlf w, final int x, final u09 y) {
        this.v = v;
        this.w = w;
        this.x = (short)x;
        this.y = y;
        this.z = p6p.a;
        final float[] b = p6p.b;
        this.A = b;
        this.F = b;
        this.G = b;
        this.H = p6p.c;
    }
    
    public final int b(final int n) {
        final ilf v = this.v;
        final int b = v.b;
        if (b > 0) {
            int n2 = b - 1;
            int i = 0;
            while (true) {
                while (i <= n2) {
                    final int n3 = i + n2 >>> 1;
                    final int n4 = v.a[n3];
                    if (n4 < n) {
                        i = n3 + 1;
                    }
                    else {
                        final int n5 = n3;
                        if (n4 > n) {
                            n2 = n3 - 1;
                        }
                        else {
                            if (n5 < -1) {
                                return -(n5 + 2);
                            }
                            return n5;
                        }
                    }
                }
                final int n5 = -(i + 1);
                continue;
            }
        }
        qiq.t("");
        throw null;
    }
    
    public final float c(int c, final int n, final boolean b) {
        final ilf v = this.v;
        float n2;
        if (c >= v.b - 1) {
            n2 = (float)n;
        }
        else {
            final int c2 = v.c(c);
            c = v.c(c + 1);
            if (n == c2) {
                n2 = (float)c2;
            }
            else {
                final t6p t6p = (t6p)this.w.b(c2);
                u09 u09;
                if (t6p == null || (u09 = t6p.b) == null) {
                    u09 = this.y;
                }
                final float n3 = (float)(n - c2);
                final float n4 = (float)(c - c2);
                final float a = u09.a(n3 / n4);
                if (b) {
                    return a;
                }
                return (n4 * a + c2) / 1000.0f;
            }
        }
        return n2 / 1000.0f;
    }
    
    @Override
    public final ig0 e(long n, ig0 i, final ig0 ig0, final ig0 ig2) {
        final long n2 = n / 1000000L;
        final int[] a = p6p.a;
        final long n3 = this.x;
        n = n2;
        if (n2 < 0L) {
            n = 0L;
        }
        if (n > n3) {
            n = n3;
        }
        if (n < 0L) {
            return ig2;
        }
        this.f(i, ig0, ig2);
        final ig0 c = this.C;
        c.getClass();
        final j9j h = this.H;
        final j9j c2 = p6p.c;
        int j = 0;
        final int n4 = 0;
        if (h != c2) {
            final int n5 = (int)n;
            final float c3 = this.c(this.b(n5), n5, false);
            final float[] g = this.G;
            final nu0[][] array = (nu0[][])this.H.w;
            final float a2 = array[0][0].a;
            final float b = array[array.length - 1][0].b;
            float n6 = c3;
            if (c3 < a2) {
                n6 = a2;
            }
            if (n6 > b) {
                n6 = b;
            }
            final int length = g.length;
            final int length2 = array.length;
            int k = 0;
            boolean b2 = false;
            while (k < length2) {
                for (int l = 0, n7 = 0; l < length - 1; l += 2, ++n7) {
                    final nu0 nu0 = array[k][n7];
                    if (n6 <= nu0.b) {
                        if (nu0.p) {
                            g[l] = nu0.q;
                            g[l + 1] = nu0.r;
                        }
                        else {
                            nu0.c(n6);
                            g[l] = nu0.a();
                            g[l + 1] = nu0.b();
                        }
                        b2 = true;
                    }
                }
                if (b2) {
                    break;
                }
                ++k;
            }
            for (int length3 = g.length, n8 = n4; n8 < length3; ++n8) {
                c.e(n8, g[n8]);
            }
        }
        else {
            final ig0 m = this.i((n - 1L) * 1000000L, i, ig0, ig2);
            i = this.i(n * 1000000L, i, ig0, ig2);
            while (j < m.b()) {
                c.e(j, (m.a(j) - i.a(j)) * 1000.0f);
                ++j;
            }
        }
        return c;
    }
    
    public final void f(final ig0 d, final ig0 e, final ig0 ig0) {
        final boolean b = this.H != p6p.c;
        final ig0 b2 = this.B;
        final jlf w = this.w;
        final ilf v = this.v;
        if (b2 == null) {
            this.B = d.c();
            this.C = ig0.c();
            final int b3 = v.b;
            final float[] a = new float[b3];
            for (int i = 0; i < b3; ++i) {
                a[i] = v.c(i) / 1000.0f;
            }
            this.A = a;
            final int b4 = v.b;
            final int[] z = new int[b4];
            for (int j = 0; j < b4; ++j) {
                final t6p t6p = (t6p)w.b(v.c(j));
                z[j] = 0;
            }
            this.z = z;
        }
        if (b) {
            if (this.H == p6p.c || !mlc.q(this.D, d) || !mlc.q(this.E, e)) {
                this.D = d;
                this.E = e;
                final int n = d.b() + d.b() % 2;
                this.F = new float[n];
                this.G = new float[n];
                final int b5 = v.b;
                final float[][] array = new float[b5][];
                for (int k = 0; k < b5; ++k) {
                    final int c = v.c(k);
                    final t6p t6p2 = (t6p)w.b(c);
                    float[] array3;
                    if (c == 0 && t6p2 == null) {
                        final float[] array2 = new float[n];
                        int n2 = 0;
                        while (true) {
                            array3 = array2;
                            if (n2 >= n) {
                                break;
                            }
                            array2[n2] = d.a(n2);
                            ++n2;
                        }
                    }
                    else if (c == this.x && t6p2 == null) {
                        final float[] array4 = new float[n];
                        int n3 = 0;
                        while (true) {
                            array3 = array4;
                            if (n3 >= n) {
                                break;
                            }
                            array4[n3] = e.a(n3);
                            ++n3;
                        }
                    }
                    else {
                        t6p2.getClass();
                        final ig0 a2 = t6p2.a;
                        array3 = new float[n];
                        for (int l = 0; l < n; ++l) {
                            array3[l] = a2.a(l);
                        }
                    }
                    array[k] = array3;
                }
                this.H = new j9j(this.z, this.A, array);
            }
        }
    }
    
    @Override
    public final int g() {
        return 0;
    }
    
    @Override
    public final int h() {
        return this.x;
    }
    
    @Override
    public final ig0 i(long n, ig0 a, final ig0 ig0, ig0 a2) {
        final long n2 = n / 1000000L;
        final int[] a3 = p6p.a;
        final short x = this.x;
        final long n3 = x;
        n = n2;
        if (n2 < 0L) {
            n = 0L;
        }
        if (n > n3) {
            n = n3;
        }
        final int n4 = (int)n;
        final jlf w = this.w;
        final t6p t6p = (t6p)w.b(n4);
        if (t6p != null) {
            return t6p.a;
        }
        if (n4 >= x) {
            return ig0;
        }
        if (n4 <= 0) {
            return a;
        }
        this.f(a, ig0, a2);
        final ig0 b = this.B;
        b.getClass();
        if (this.H != p6p.c) {
            final float c = this.c(this.b(n4), n4, false);
            final float[] f = this.F;
            final nu0[][] array = (nu0[][])this.H.w;
            int n5 = array.length - 1;
            float a4 = array[0][0].a;
            final float b2 = array[n5][0].b;
            final int length = f.length;
            if (c >= a4 && c <= b2) {
                final int length2 = array.length;
                int i = 0;
                boolean b3 = false;
                while (i < length2) {
                    for (int j = 0, n6 = 0; j < length - 1; j += 2, ++n6) {
                        final nu0 nu0 = array[i][n6];
                        if (c <= nu0.b) {
                            if (nu0.p) {
                                final float a5 = nu0.a;
                                final float k = nu0.k;
                                final float c2 = nu0.c;
                                f[j] = ge9.k(nu0.e, c2, (c - a5) * k, c2);
                                final float d = nu0.d;
                                f[j + 1] = ge9.k(nu0.f, d, (c - a5) * k, d);
                            }
                            else {
                                nu0.c(c);
                                f[j] = nu0.n * nu0.h + nu0.q;
                                f[j + 1] = nu0.o * nu0.i + nu0.r;
                            }
                            b3 = true;
                        }
                    }
                    if (b3) {
                        break;
                    }
                    ++i;
                }
            }
            else {
                if (c > b2) {
                    a4 = b2;
                }
                else {
                    n5 = 0;
                }
                final float n7 = c - a4;
                for (int l = 0, n8 = 0; l < length - 1; l += 2, ++n8) {
                    final nu0 nu2 = array[n5][n8];
                    final boolean p4 = nu2.p;
                    final float r = nu2.r;
                    final float q = nu2.q;
                    if (p4) {
                        final float a6 = nu2.a;
                        final float m = nu2.k;
                        final float c3 = nu2.c;
                        f[l] = q * n7 + ge9.k(nu2.e, c3, (a4 - a6) * m, c3);
                        final float d2 = nu2.d;
                        f[l + 1] = r * n7 + ge9.k(nu2.f, d2, (a4 - a6) * m, d2);
                    }
                    else {
                        nu2.c(a4);
                        f[l] = nu2.a() * n7 + (nu2.n * nu2.h + q);
                        f[l + 1] = nu2.b() * n7 + (nu2.o * nu2.i + r);
                    }
                }
            }
            for (int length3 = f.length, n9 = 0; n9 < length3; ++n9) {
                b.e(n9, f[n9]);
            }
        }
        else {
            final int b4 = this.b(n4);
            final float c4 = this.c(b4, n4, true);
            final ilf v = this.v;
            final t6p t6p2 = (t6p)w.b(v.c(b4));
            a2 = a;
            if (t6p2 != null) {
                a2 = t6p2.a;
                if (a2 == null) {
                    a2 = a;
                }
            }
            final t6p t6p3 = (t6p)w.b(v.c(b4 + 1));
            if (t6p3 == null || (a = t6p3.a) == null) {
                a = ig0;
            }
            for (int b5 = b.b(), n10 = 0; n10 < b5; ++n10) {
                b.e(n10, a.a(n10) * c4 + (1.0f - c4) * a2.a(n10));
            }
        }
        return b;
    }
}
