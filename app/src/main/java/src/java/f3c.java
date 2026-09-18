public final class f3c
{
    public static final f3c o;
    public final xca a;
    public final hc7 b;
    public final hc7 c;
    public final hc7 d;
    public final int e;
    public final int f;
    public final int g;
    public final lta h;
    public final lta i;
    public final lta j;
    public final m0m k;
    public final z9k l;
    public final int m;
    public final p3a n;
    
    static {
        final hr0 r = hr0.R;
        final ptc v = xca.v;
        final o68 a = vo8.a;
        final d58 w = d58.w;
        o = new f3c((xca)v, (hc7)o89.v, (hc7)w, (hc7)w, 1, 1, 1, (lta)r, (lta)r, (lta)r, m0m.n, z9k.w, 1, p3a.b);
    }
    
    public f3c(final xca a, final hc7 b, final hc7 c, final hc7 d, final int e, final int f, final int g, final lta h, final lta i, final lta j, final m0m k, final z9k l, final int m, final p3a n) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
    }
    
    public static f3c a(final f3c f3c, hc7 b, p3a n, final int n2) {
        Object o = d58.w;
        final xca a = f3c.a;
        if ((n2 & 0x2) != 0x0) {
            b = f3c.b;
        }
        Object c;
        if ((n2 & 0x4) != 0x0) {
            c = f3c.c;
        }
        else {
            c = o;
        }
        if ((n2 & 0x8) != 0x0) {
            o = f3c.d;
        }
        final int e = f3c.e;
        int f;
        if ((n2 & 0x20) != 0x0) {
            f = f3c.f;
        }
        else {
            f = 4;
        }
        final int g = f3c.g;
        final lta h = f3c.h;
        final lta i = f3c.i;
        final lta j = f3c.j;
        final m0m k = f3c.k;
        final z9k l = f3c.l;
        final int m = f3c.m;
        if ((n2 & 0x2000) != 0x0) {
            n = f3c.n;
        }
        f3c.getClass();
        return new f3c(a, b, (hc7)c, (hc7)o, e, f, g, h, i, j, k, l, m, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof f3c) {
                final f3c f3c = (f3c)o;
                if (mlc.q((Object)this.a, (Object)f3c.a)) {
                    if (mlc.q((Object)this.b, (Object)f3c.b)) {
                        if (mlc.q((Object)this.c, (Object)f3c.c)) {
                            if (mlc.q((Object)this.d, (Object)f3c.d)) {
                                if (this.e == f3c.e) {
                                    if (this.f == f3c.f) {
                                        if (this.g == f3c.g) {
                                            if (mlc.q((Object)this.h, (Object)f3c.h)) {
                                                if (mlc.q((Object)this.i, (Object)f3c.i)) {
                                                    if (mlc.q((Object)this.j, (Object)f3c.j)) {
                                                        if (mlc.q((Object)this.k, (Object)f3c.k)) {
                                                            if (this.l == f3c.l) {
                                                                if (this.m == f3c.m) {
                                                                    if (mlc.q((Object)this.n, (Object)f3c.n)) {
                                                                        return true;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.n.a.hashCode() + hia.b(this.m, (this.l.hashCode() + (this.k.hashCode() + xc2.i(xc2.i(xc2.i(hia.b(this.g, hia.b(this.f, hia.b(this.e, (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31) * 31, 31), 31), 31), 31, this.h), 31, this.i), 31, this.j)) * 31) * 31, 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Defaults(fileSystem=");
        sb.append((Object)this.a);
        sb.append(", interceptorCoroutineContext=");
        sb.append((Object)this.b);
        sb.append(", fetcherCoroutineContext=");
        sb.append((Object)this.c);
        sb.append(", decoderCoroutineContext=");
        sb.append((Object)this.d);
        sb.append(", memoryCachePolicy=");
        sb.append(xc2.u(this.e));
        sb.append(", diskCachePolicy=");
        sb.append(xc2.u(this.f));
        sb.append(", networkCachePolicy=");
        sb.append(xc2.u(this.g));
        sb.append(", placeholderFactory=");
        sb.append((Object)this.h);
        sb.append(", errorFactory=");
        rua.o(sb, this.i, ", fallbackFactory=", this.j, ", sizeResolver=");
        sb.append((Object)this.k);
        sb.append(", scale=");
        sb.append((Object)this.l);
        sb.append(", precision=");
        sb.append(p3g.l(this.m));
        sb.append(", extras=");
        sb.append((Object)this.n);
        sb.append(")");
        return sb.toString();
    }
}
