import java.util.List;

public final class n6p extends m6p
{
    public final qm2 A;
    public final float B;
    public final float C;
    public final int D;
    public final int E;
    public final float F;
    public final float G;
    public final float H;
    public final float I;
    public final String v;
    public final List w;
    public final int x;
    public final qm2 y;
    public final float z;
    
    public n6p(final float z, final float b, final float c, final float f, final float g, final float h, final float i, final int x, final int d, final int e, final qm2 y, final qm2 a, final String v, final List w) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (n6p.class == o.getClass()) {
                final n6p n6p = (n6p)o;
                if (!mlc.q((Object)this.v, (Object)n6p.v)) {
                    return false;
                }
                if (!mlc.q((Object)this.y, (Object)n6p.y)) {
                    return false;
                }
                if (this.z == n6p.z) {
                    if (!mlc.q((Object)this.A, (Object)n6p.A)) {
                        return false;
                    }
                    if (this.B == n6p.B && this.C == n6p.C && this.D == n6p.D && this.E == n6p.E && this.F == n6p.F && this.G == n6p.G && this.H == n6p.H && this.I == n6p.I && this.x == n6p.x) {
                        return mlc.q((Object)this.w, (Object)n6p.w);
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int k = smk.k(this.v.hashCode() * 31, 31, this.w);
        final int n = 0;
        final qm2 y = this.y;
        int hashCode;
        if (y != null) {
            hashCode = y.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int d = oz1.d(this.z, (k + hashCode) * 31, 31);
        final qm2 a = this.A;
        int hashCode2 = n;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        return Integer.hashCode(this.x) + oz1.d(this.I, oz1.d(this.H, oz1.d(this.G, oz1.d(this.F, hia.y(this.E, hia.y(this.D, oz1.d(this.C, oz1.d(this.B, (d + hashCode2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
