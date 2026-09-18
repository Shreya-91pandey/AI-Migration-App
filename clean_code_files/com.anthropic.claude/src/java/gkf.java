import java.util.Arrays;

public final class gkf
{
    public final tmf a = a;
    
    public static final void a(final tmf tmf, final Object o, Object o2) {
        final int f = tmf.f(o);
        final boolean b = f < 0;
        Object o3;
        if (b) {
            o3 = null;
        }
        else {
            o3 = tmf.c[f];
        }
        if (o3 != null) {
            if (o3 instanceof emf) {
                final emf emf = (emf)o3;
                emf.b(o2);
                o2 = emf;
            }
            else {
                final Object[] a = j4g.a;
                final emf emf2 = new emf(2);
                emf2.b(o3);
                emf2.b(o2);
                o2 = emf2;
            }
        }
        if (b) {
            final int n = ~f;
            tmf.b[n] = o;
            tmf.c[n] = o2;
            return;
        }
        tmf.c[f] = o2;
    }
    
    public static final Object b(final tmf tmf, final gif gif) {
        final Object g = tmf.g((Object)gif);
        if (g == null) {
            return null;
        }
        if (g instanceof emf) {
            final emf emf = (emf)g;
            final Object i = rjq.i(emf);
            i.getClass();
            if (emf.i()) {
                tmf.k((Object)gif);
            }
            if (emf.b == 1) {
                tmf.m((Object)gif, emf.f());
            }
            return i;
        }
        tmf.k((Object)gif);
        return g;
    }
    
    public static final void c(final tmf tmf, final gif gif, final lta lta) {
        final Object g = tmf.g((Object)gif);
        if (g != null) {
            if (g instanceof emf) {
                final emf emf = (emf)g;
                final int b = emf.b;
                final Object[] a = emf.a;
                int n = 0;
                final int n2 = 0;
                final xgc t = ncq.T(0, b);
                int v = ((vgc)t).v;
                final int w = ((vgc)t).w;
                if (v <= w) {
                    int n3 = n2;
                    while (true) {
                        a[v - n3] = a[v];
                        int n4 = n3;
                        if (lta.b(a[v])) {
                            n4 = n3 + 1;
                        }
                        n = n4;
                        if (v == w) {
                            break;
                        }
                        ++v;
                        n3 = n4;
                    }
                }
                Arrays.fill(a, b - n, b, (Object)null);
                emf.b -= n;
                if (emf.i()) {
                    tmf.k((Object)gif);
                }
                if (emf.b == 1) {
                    tmf.m((Object)gif, emf.f());
                }
            }
            else if (lta.b(g)) {
                tmf.k((Object)gif);
            }
        }
    }
    
    public static final emf d(final tmf tmf) {
        if (tmf.i()) {
            final emf b = j4g.b;
            b.getClass();
            return b;
        }
        final emf emf = new emf();
        final Object[] c = tmf.c;
        final long[] a = tmf.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final Object o = c[(n2 << 3) + i];
                            if (o instanceof emf) {
                                emf.c((emf)o);
                            }
                            else {
                                o.getClass();
                                emf.b(o);
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
        return emf;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof gkf) {
            if (this.a.equals((Object)((gkf)o).a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("MultiValueMap(map=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
