import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public final class f7b extends s5p
{
    public float[] b;
    public final ArrayList c;
    public boolean d;
    public long e;
    public List f;
    public boolean g;
    public g90 h;
    public lta i;
    public final p8a j;
    public String k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public boolean s;
    
    public f7b() {
        this.c = new ArrayList();
        this.d = true;
        this.e = j86.h;
        final int a = l6p.a;
        this.f = (List)r89.v;
        this.g = true;
        this.j = new p8a((Object)this, (byte)3);
        this.k = "";
        this.o = 1.0f;
        this.p = 1.0f;
        this.s = true;
    }
    
    @Override
    public final void a(final cw8 cw8) {
        final boolean s = this.s;
        int i = 0;
        if (s) {
            float[] b = this.b;
            if (b == null) {
                b = l8e.a();
                this.b = b;
            }
            else {
                l8e.d(b);
            }
            l8e.g(b, this.q + this.m, this.r + this.n);
            final float l = this.l;
            if (b.length >= 16) {
                final double n = l * 0.017453292519943295;
                final float n2 = (float)Math.sin(n);
                final float n3 = (float)Math.cos(n);
                final float n4 = b[0];
                final float n5 = b[4];
                final float n6 = -n2;
                final float n7 = b[1];
                final float n8 = b[5];
                final float n9 = b[2];
                final float n10 = b[6];
                final float n11 = b[3];
                final float n12 = b[7];
                b[0] = n2 * n5 + n3 * n4;
                b[1] = n2 * n8 + n3 * n7;
                b[2] = n2 * n10 + n3 * n9;
                b[3] = n2 * n12 + n3 * n11;
                b[4] = n5 * n3 + n4 * n6;
                b[5] = n8 * n3 + n7 * n6;
                b[6] = n10 * n3 + n9 * n6;
                b[7] = n3 * n12 + n6 * n11;
            }
            final float o = this.o;
            final float p = this.p;
            if (b.length >= 16) {
                b[0] *= o;
                b[1] *= o;
                b[2] *= o;
                b[3] *= o;
                b[4] *= p;
                b[5] *= p;
                b[6] *= p;
                b[7] *= p;
                b[8] *= 1.0f;
                b[9] *= 1.0f;
                b[10] *= 1.0f;
                b[11] *= 1.0f;
            }
            l8e.g(b, -this.m, -this.n);
            this.s = false;
        }
        if (this.g) {
            if (!((Collection)this.f).isEmpty()) {
                g90 h;
                if ((h = this.h) == null) {
                    h = j90.a();
                    this.h = h;
                }
                ien.M(this.f, h);
            }
            this.g = false;
        }
        final zn0 b2 = cw8.B0();
        final long a = b2.A();
        b2.t().g();
        Label_0675: {
            try {
                final jy7 jy7 = (jy7)b2.v;
                final float[] b3 = this.b;
                if (b3 != null) {
                    ((zn0)jy7.w).t().k(b3);
                }
                final g90 h2 = this.h;
                if (!((Collection)this.f).isEmpty() && h2 != null) {
                    jy7.k(h2);
                }
            }
            finally {
                break Label_0675;
            }
            for (ArrayList c = this.c; i < c.size(); ++i) {
                final cw8 cw9;
                ((s5p)c.get(i)).a(cw9);
            }
            oz1.w(b2, a);
            return;
        }
        oz1.w(b2, a);
    }
    
    @Override
    public final lta b() {
        return this.i;
    }
    
    @Override
    public final void d(final p8a i) {
        this.i = (lta)i;
    }
    
    public final void e(final int n, final s5p s5p) {
        final ArrayList c = this.c;
        if (n < c.size()) {
            c.set(n, (Object)s5p);
        }
        else {
            c.add((Object)s5p);
        }
        this.g(s5p);
        s5p.d(this.j);
        this.c();
    }
    
    public final void f(final long e) {
        if (this.d) {
            if (e != 16L) {
                final long e2 = this.e;
                if (e2 == 16L) {
                    this.e = e;
                    return;
                }
                final int a = l6p.a;
                if (j86.g(e2) != j86.g(e) || j86.f(e2) != j86.f(e) || j86.d(e2) != j86.d(e)) {
                    this.d = false;
                    this.e = j86.h;
                }
            }
        }
    }
    
    public final void g(final s5p s5p) {
        if (s5p instanceof hvg) {
            final hvg hvg = (hvg)s5p;
            final qm2 b = hvg.b;
            if (this.d) {
                if (b != null) {
                    if (b instanceof cam) {
                        this.f(((cam)b).a);
                    }
                    else {
                        this.d = false;
                        this.e = j86.h;
                    }
                }
            }
            final qm2 g = hvg.g;
            if (this.d) {
                if (g != null) {
                    if (g instanceof cam) {
                        this.f(((cam)g).a);
                        return;
                    }
                    this.d = false;
                    this.e = j86.h;
                }
            }
        }
        else if (s5p instanceof f7b) {
            final f7b f7b = (f7b)s5p;
            if (f7b.d && this.d) {
                this.f(f7b.e);
                return;
            }
            this.d = false;
            this.e = j86.h;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("VGroup: ");
        sb.append(this.k);
        final ArrayList c = this.c;
        for (int size = c.size(), i = 0; i < size; ++i) {
            final s5p s5p = (s5p)c.get(i);
            sb.append("\t");
            sb.append(s5p.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
