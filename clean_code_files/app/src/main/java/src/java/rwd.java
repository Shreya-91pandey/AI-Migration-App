import java.util.Arrays;

public final class rwd implements Cloneable
{
    public boolean v;
    public long[] w;
    public Object[] x;
    public int y;
    
    public rwd(int n) {
        if (n == 0) {
            this.w = o50.d;
            this.x = o50.e;
            return;
        }
        final int n2 = n * 8;
        n = 4;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= 32) {
                break;
            }
            n3 = (1 << n) - 12;
            if (n2 <= n3) {
                break;
            }
            ++n;
        }
        n = n3 / 8;
        this.w = new long[n];
        this.x = new Object[n];
    }
    
    public final void a() {
        final int y = this.y;
        final Object[] x = this.x;
        for (int i = 0; i < y; ++i) {
            x[i] = null;
        }
        this.y = 0;
        this.v = false;
    }
    
    public final Object b(final long n) {
        final int p = o50.p(this.w, this.y, n);
        if (p >= 0) {
            final Object o = this.x[p];
            if (o != yjq.c) {
                return o;
            }
        }
        return null;
    }
    
    public final long c(final int n) {
        if (n >= 0) {
            final int y = this.y;
            if (n < y) {
                if (this.v) {
                    final long[] w = this.w;
                    final Object[] x = this.x;
                    int i = 0;
                    int y2 = 0;
                    while (i < y) {
                        final Object o = x[i];
                        int n2 = y2;
                        if (o != yjq.c) {
                            if (i != y2) {
                                w[y2] = w[i];
                                x[y2] = o;
                                x[i] = null;
                            }
                            n2 = y2 + 1;
                        }
                        ++i;
                        y2 = n2;
                    }
                    this.v = false;
                    this.y = y2;
                }
                return this.w[n];
            }
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        qiq.r(sb.toString());
        throw null;
    }
    
    public final Object clone() {
        final Object clone = super.clone();
        clone.getClass();
        final rwd rwd = (rwd)clone;
        rwd.w = this.w.clone();
        rwd.x = this.x.clone();
        return rwd;
    }
    
    public final void d(final long n, final Object o) {
        final Object c = yjq.c;
        final int p2 = o50.p(this.w, this.y, n);
        if (p2 >= 0) {
            this.x[p2] = o;
            return;
        }
        final int n2 = ~p2;
        final int y = this.y;
        if (n2 < y) {
            final Object[] x = this.x;
            if (x[n2] == c) {
                this.w[n2] = n;
                x[n2] = o;
                return;
            }
        }
        int n3 = n2;
        if (this.v) {
            final long[] w = this.w;
            n3 = n2;
            if (y >= w.length) {
                final Object[] x2 = this.x;
                int i = 0;
                int y2 = 0;
                while (i < y) {
                    final Object o2 = x2[i];
                    int n4 = y2;
                    if (o2 != c) {
                        if (i != y2) {
                            w[y2] = w[i];
                            x2[y2] = o2;
                            x2[i] = null;
                        }
                        n4 = y2 + 1;
                    }
                    ++i;
                    y2 = n4;
                }
                this.v = false;
                this.y = y2;
                n3 = ~o50.p(this.w, y2, n);
            }
        }
        final int y3 = this.y;
        if (y3 >= this.w.length) {
            final int n5 = (y3 + 1) * 8;
            int n6 = 4;
            int n7;
            while (true) {
                n7 = n5;
                if (n6 >= 32) {
                    break;
                }
                n7 = (1 << n6) - 12;
                if (n5 <= n7) {
                    break;
                }
                ++n6;
            }
            final int n8 = n7 / 8;
            this.w = Arrays.copyOf(this.w, n8);
            this.x = Arrays.copyOf(this.x, n8);
        }
        final int y4 = this.y;
        if (y4 - n3 != 0) {
            final long[] w2 = this.w;
            final int n9 = n3 + 1;
            iw0.M0(w2, w2, n9, n3, y4);
            final Object[] x3 = this.x;
            iw0.K0(n9, n3, this.y, x3, x3);
        }
        this.w[n3] = n;
        this.x[n3] = o;
        ++this.y;
    }
    
    public final void e(final long n) {
        final int p = o50.p(this.w, this.y, n);
        if (p >= 0) {
            final Object[] x = this.x;
            final Object o = x[p];
            final Object c = yjq.c;
            if (o != c) {
                x[p] = c;
                this.v = true;
            }
        }
    }
    
    public final int f() {
        if (this.v) {
            final int y = this.y;
            final long[] w = this.w;
            final Object[] x = this.x;
            int i = 0;
            int y2 = 0;
            while (i < y) {
                final Object o = x[i];
                int n = y2;
                if (o != yjq.c) {
                    if (i != y2) {
                        w[y2] = w[i];
                        x[y2] = o;
                        x[i] = null;
                    }
                    n = y2 + 1;
                }
                ++i;
                y2 = n;
            }
            this.v = false;
            this.y = y2;
        }
        return this.y;
    }
    
    public final Object g(final int n) {
        if (n >= 0) {
            final int y = this.y;
            if (n < y) {
                if (this.v) {
                    final long[] w = this.w;
                    final Object[] x = this.x;
                    int i = 0;
                    int y2 = 0;
                    while (i < y) {
                        final Object o = x[i];
                        int n2 = y2;
                        if (o != yjq.c) {
                            if (i != y2) {
                                w[y2] = w[i];
                                x[y2] = o;
                                x[i] = null;
                            }
                            n2 = y2 + 1;
                        }
                        ++i;
                        y2 = n2;
                    }
                    this.v = false;
                    this.y = y2;
                }
                return this.x[n];
            }
        }
        final StringBuilder sb = new StringBuilder("Expected index to be within 0..size()-1, but was ");
        sb.append(n);
        qiq.r(sb.toString());
        throw null;
    }
    
    @Override
    public final String toString() {
        if (this.f() <= 0) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.y * 28);
        sb.append('{');
        for (int y = this.y, i = 0; i < y; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(this.c(i));
            sb.append('=');
            final Object g = this.g(i);
            if (g != sb) {
                sb.append(g);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
