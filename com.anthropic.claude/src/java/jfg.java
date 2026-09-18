import java.util.Arrays;

public final class jfg extends rhc
{
    public gfg[] c;
    public int d;
    public int[] e;
    public int f;
    public Object[] g;
    public int h;
    
    public jfg() {
        this.c = new gfg[16];
        this.e = new int[16];
        this.g = new Object[16];
    }
    
    public final void g0() {
        this.d = 0;
        this.f = 0;
        Arrays.fill(this.g, 0, this.h, (Object)null);
        this.h = 0;
    }
    
    public final void h0(final it0 it0, final y5m y5m, final yb0 yb0, final hfg hfg) {
        if (this.d != 0) {
            final ifg ifg = new ifg(this);
            while (true) {
                final jfg d = ifg.d;
                final gfg gfg = d.c[ifg.a];
                Object b = gfg.b(ifg);
                try {
                    gfg.a(ifg, it0, y5m, yb0, hfg);
                    int a = ifg.a;
                    final int d2 = d.d;
                    if (a < d2) {
                        b = d.c[a];
                        ifg.b += ((gfg)b).a;
                        ifg.c += ((gfg)b).b;
                        ++a;
                        if ((ifg.a = a) < d2) {
                            continue;
                        }
                    }
                }
                finally {
                    rcr.a((Throwable)it0, hfg, y5m, (bva)b);
                }
                break;
            }
        }
        this.g0();
    }
    
    public final boolean i0() {
        return this.d == 0;
    }
    
    public final void j0(final gfg gfg) {
        final int d = this.d;
        final gfg[] c = this.c;
        final int length = c.length;
        final int n = 1024;
        if (d == length) {
            int n2;
            if (d > 1024) {
                n2 = 1024;
            }
            else {
                n2 = d;
            }
            final gfg[] c2 = new gfg[n2 + d];
            System.arraycopy((Object)c, 0, (Object)c2, 0, d);
            this.c = c2;
        }
        final int f = this.f;
        final int a = gfg.a;
        final int b = gfg.b;
        final int n3 = f + a;
        final int[] e = this.e;
        final int length2 = e.length;
        if (n3 > length2) {
            int n4;
            if (length2 > 1024) {
                n4 = 1024;
            }
            else {
                n4 = length2;
            }
            int n5 = n4 + length2;
            if (n5 < n3) {
                n5 = n3;
            }
            final int[] e2 = new int[n5];
            iw0.J0(0, 0, length2, e, e2);
            this.e = e2;
        }
        final int n6 = this.h + b;
        final Object[] g = this.g;
        final int length3 = g.length;
        if (n6 > length3) {
            int n7;
            if (length3 > 1024) {
                n7 = n;
            }
            else {
                n7 = length3;
            }
            int n8 = n7 + length3;
            if (n8 < n6) {
                n8 = n6;
            }
            final Object[] g2 = new Object[n8];
            System.arraycopy((Object)g, 0, (Object)g2, 0, length3);
            this.g = g2;
        }
        this.c[this.d++] = gfg;
        this.f += gfg.a;
        this.h += b;
    }
}
