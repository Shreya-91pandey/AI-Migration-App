import java.util.ArrayList;

public final class mi6
{
    public final gva a;
    public fd3 b;
    public boolean c;
    public final dhc d;
    public boolean e;
    public int f;
    public int g;
    public final ArrayList h;
    public int i;
    public int j;
    public int k;
    public int l;
    
    public mi6(final gva a, final fd3 b) {
        this.a = a;
        this.b = b;
        this.d = new dhc((byte)1);
        this.e = true;
        this.h = new ArrayList();
        this.i = -1;
        this.j = -1;
        this.k = -1;
    }
    
    public final void a() {
        this.c();
        final ArrayList h = this.h;
        if (!h.isEmpty()) {
            h.remove(h.size() - 1);
            return;
        }
        ++this.g;
    }
    
    public final void b() {
        final int g = this.g;
        if (g > 0) {
            final jfg f = this.b.f;
            f.j0(efg.c);
            f.e[f.f - f.c[f.d - 1].a] = g;
            this.g = 0;
        }
        final ArrayList h = this.h;
        if (!h.isEmpty()) {
            final fd3 b = this.b;
            final int size = h.size();
            final Object[] array = new Object[size];
            for (int i = 0; i < size; ++i) {
                array[i] = h.get(i);
            }
            b.getClass();
            if (size != 0) {
                final jfg f2 = b.f;
                f2.j0(eeg.c);
                t08.g0(f2, 0, (Object)array);
            }
            h.clear();
        }
    }
    
    public final void c() {
        final int l = this.l;
        if (l > 0) {
            final int i = this.i;
            if (i >= 0) {
                this.b();
                final jfg f = this.b.f;
                f.j0(ueg.c);
                final int n = f.f - f.c[f.d - 1].a;
                final int[] e = f.e;
                e[n] = i;
                e[n + 1] = l;
                this.i = -1;
            }
            else {
                final int k = this.k;
                final int j = this.j;
                this.b();
                final jfg f2 = this.b.f;
                f2.j0((gfg)peg.c);
                final int n2 = f2.f - f2.c[f2.d - 1].a;
                final int[] e2 = f2.e;
                e2[n2 + 1] = k;
                e2[n2] = j;
                e2[n2 + 2] = l;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }
    
    public final void d(final boolean b) {
        final u5m g = this.a.G;
        int f;
        if (b) {
            f = g.i;
        }
        else {
            f = g.g;
        }
        final int n = f - this.f;
        if (n < 0) {
            ti6.a("Tried to seek backward");
        }
        if (n > 0) {
            final jfg f2 = this.b.f;
            f2.j0(xdg.c);
            f2.e[f2.f - f2.c[f2.d - 1].a] = n;
            this.f = f;
        }
    }
    
    public final void e() {
        final u5m g = this.a.G;
        if (g.c > 0) {
            final int i = g.i;
            final dhc d = this.d;
            if (d.c(-2) != i) {
                if (!this.c && this.e) {
                    this.d(false);
                    this.b.f.j0(keg.c);
                    this.c = true;
                }
                if (i > 0) {
                    final bva a = g.a(i);
                    d.e(i);
                    this.d(false);
                    final jfg f = this.b.f;
                    f.j0(jeg.c);
                    t08.g0(f, 0, (Object)a);
                    this.c = true;
                }
            }
        }
    }
    
    public final void f(final int i, final int l) {
        if (l > 0) {
            if (i < 0) {
                final StringBuilder sb = new StringBuilder("Invalid remove index ");
                sb.append(i);
                ti6.a(sb.toString());
            }
            if (this.i == i) {
                this.l += l;
                return;
            }
            this.c();
            this.i = i;
            this.l = l;
        }
    }
}
