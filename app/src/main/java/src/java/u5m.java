import java.util.ArrayList;

public final class u5m
{
    public final v5m a;
    public final int[] b;
    public final int c;
    public Object[] d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public final dhc j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    
    public u5m(final v5m a) {
        this.a = a;
        this.b = a.v;
        final int w = a.w;
        this.c = w;
        this.d = a.x;
        this.e = a.y;
        this.h = w;
        this.i = -1;
        this.j = new dhc((byte)1);
    }
    
    public final bva a(final int n) {
        final ArrayList d = this.a.D;
        final int c = x5m.c(d, n, this.c);
        if (c < 0) {
            final bva bva = new bva(n);
            d.add(-(c + 1), (Object)bva);
            return bva;
        }
        return (bva)d.get(c);
    }
    
    public final Object b(final int[] array, int length) {
        length *= 5;
        final int n = array[length + 1];
        if ((0x10000000 & n) != 0x0) {
            final Object[] d = this.d;
            if (length >= array.length) {
                length = array.length;
            }
            else {
                length = array[length + 4] + Integer.bitCount(n >> 29);
            }
            return d[length];
        }
        return bi6.a;
    }
    
    public final void c() {
        this.f = true;
        final v5m a = this.a;
        if (a.z <= 0) {
            ti6.a("Unexpected reader close()");
        }
        --a.z;
        this.d = new Object[0];
    }
    
    public final boolean d(final int n) {
        return (this.b[n * 5 + 1] & 0x4000000) != 0x0;
    }
    
    public final void e() {
        if (this.k == 0) {
            if (this.g != this.h) {
                ti6.a("endGroup() not called at the end of a group");
            }
            final int i = this.i;
            final int[] b = this.b;
            final int j = b[i * 5 + 2];
            this.i = j;
            final int c = this.c;
            int h;
            if (j < 0) {
                h = c;
            }
            else {
                h = b[j * 5 + 3] + j;
            }
            this.h = h;
            final int d = this.j.d();
            if (d < 0) {
                this.l = 0;
                this.m = 0;
                return;
            }
            this.l = d;
            int e;
            if (j >= c - 1) {
                e = this.e;
            }
            else {
                e = b[(j + 1) * 5 + 4];
            }
            this.m = e;
        }
    }
    
    public final Object f() {
        final int g = this.g;
        if (g < this.h) {
            return this.b(this.b, g);
        }
        return 0;
    }
    
    public final int g() {
        final int g = this.g;
        if (g < this.h) {
            return this.b[g * 5];
        }
        return 0;
    }
    
    public final Object h(int e, int n) {
        final int[] b = this.b;
        final int d = x5m.d(b, e);
        if (++e < this.c) {
            e = b[e * 5 + 4];
        }
        else {
            e = this.e;
        }
        n += d;
        if (n < e) {
            return this.d[n];
        }
        return bi6.a;
    }
    
    public final int i(final int n) {
        return this.b[n * 5];
    }
    
    public final boolean j(final int n) {
        return (this.b[n * 5 + 1] & 0x8000000) != 0x0;
    }
    
    public final boolean k(final int n) {
        return (this.b[n * 5 + 1] & 0x20000000) != 0x0;
    }
    
    public final boolean l(final int n) {
        return (this.b[n * 5 + 1] & 0x40000000) != 0x0;
    }
    
    public final Object m() {
        if (this.k <= 0) {
            final int l = this.l;
            if (l < this.m) {
                this.n = true;
                final Object[] d = this.d;
                this.l = l + 1;
                return d[l];
            }
        }
        this.n = false;
        return bi6.a;
    }
    
    public final Object n(int n) {
        n *= 5;
        final int[] b = this.b;
        final int n2 = b[n + 1] & 0x40000000;
        if (n2 == 0) {
            return null;
        }
        if (n2 != 0) {
            return this.d[b[n + 4]];
        }
        return bi6.a;
    }
    
    public final int o(final int n) {
        return this.b[n * 5 + 1] & 0x3FFFFFF;
    }
    
    public final Object p(final int[] array, int n) {
        final int n2 = n * 5;
        n = array[n2 + 1];
        if ((0x20000000 & n) != 0x0) {
            return this.d[Integer.bitCount(n >> 30) + array[n2 + 4]];
        }
        return null;
    }
    
    public final int q(final int n) {
        return this.b[n * 5 + 2];
    }
    
    public final void r(int n) {
        if (this.k != 0) {
            ti6.a("Cannot reposition while in an empty region");
        }
        this.g = n;
        final int[] b = this.b;
        final int c = this.c;
        if (n < c) {
            n = b[n * 5 + 2];
        }
        else {
            n = -1;
        }
        if (n != this.i) {
            if ((this.i = n) < 0) {
                this.h = c;
            }
            else {
                this.h = b[n * 5 + 3] + n;
            }
            this.l = 0;
            this.m = 0;
        }
    }
    
    public final int s() {
        if (this.k != 0) {
            ti6.a("Cannot skip while in an empty region");
        }
        final int g = this.g;
        final int n = g * 5;
        final int[] b = this.b;
        final int n2 = b[n + 1];
        int n3;
        if ((0x40000000 & n2) != 0x0) {
            n3 = 1;
        }
        else {
            n3 = (n2 & 0x3FFFFFF);
        }
        this.g = b[n + 3] + g;
        return n3;
    }
    
    public final void t() {
        if (this.k != 0) {
            ti6.a("Cannot skip the enclosing group while in an empty region");
        }
        this.g = this.h;
        this.l = 0;
        this.m = 0;
    }
    
    @Override
    public final String toString() {
        return rua.h(this.i, this.h, ", end=", ")", hia.o(this.g, this.g(), "SlotReader(current=", ", key=", ", parent="));
    }
    
    public final void u() {
        if (this.k <= 0) {
            final int i = this.i;
            final int g = this.g;
            final int n = g * 5;
            final int[] b = this.b;
            if (b[n + 2] != i) {
                pih.a("Invalid slot table detected");
            }
            final int l = this.l;
            final int m = this.m;
            final dhc j = this.j;
            if (l == 0 && m == 0) {
                j.e(-1);
            }
            else {
                j.e(l);
            }
            this.i = g;
            this.h = b[n + 3] + g;
            final int g2 = g + 1;
            this.g = g2;
            this.l = x5m.d(b, g);
            int e;
            if (g >= this.c - 1) {
                e = this.e;
            }
            else {
                e = b[g2 * 5 + 4];
            }
            this.m = e;
        }
    }
}
