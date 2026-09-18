import java.util.List;

public final class j5d extends r1
{
    public final boolean A;
    public final f4d B;
    public final int C;
    public final int D;
    public final dx E;
    public final lb2 F;
    public final boolean G;
    public final int H;
    public final int I;
    public final long J;
    public final v5d K;
    public final d5d x;
    public final f4d y;
    public final long z;
    
    public j5d(final long n, final boolean a, final d5d x, final f4d f4d, int i, int h, final dx e, final lb2 f, final boolean g, final int h2, final int j, final long k, final v5d l) {
        this.A = a;
        this.B = f4d;
        this.C = i;
        this.D = h;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h2;
        this.I = j;
        this.J = k;
        this.K = l;
        super((byte)1);
        this.x = x;
        this.y = f4d;
        h = Integer.MAX_VALUE;
        if (a) {
            i = gv6.i(n);
        }
        else {
            i = Integer.MAX_VALUE;
        }
        if (!a) {
            h = gv6.h(n);
        }
        this.z = hv6.b(0, i, 0, h, 5);
    }
    
    public final g4d h(final int n, final int n2, final int n3, final long n4) {
        return this.r(n, n4);
    }
    
    public final m5d r(final int n, final long n2) {
        final d5d x = this.x;
        final Object b = x.b(n);
        final Object d = x.b.D(n);
        final List j = this.j(this.y, n, n2);
        int d2;
        if (n == this.C - 1) {
            d2 = 0;
        }
        else {
            d2 = this.D;
        }
        return new m5d(n, j, this.A, this.E, this.F, ((flc)this.B.w).getLayoutDirection(), this.G, this.H, this.I, d2, this.J, b, d, this.K.o, n2);
    }
}
