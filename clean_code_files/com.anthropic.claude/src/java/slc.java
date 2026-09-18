import java.util.Map;

public final class slc implements ooe, flc
{
    public final flc v;
    public final qzc w;
    
    public slc(final flc v, final qzc w) {
        this.v = v;
        this.w = w;
    }
    
    public final int E0(final long n) {
        return ((xc8)this.v).E0(n);
    }
    
    public final float I(final long n) {
        return ((xc8)this.v).I(n);
    }
    
    public final noe J0(int n, final int n2, final Map map, final lta lta, final lta lta2) {
        int n3 = n;
        if (n < 0) {
            n3 = 0;
        }
        if ((n = n2) < 0) {
            n = 0;
        }
        if ((n3 & 0xFF000000) != 0x0 || (0xFF000000 & n) != 0x0) {
            final StringBuilder sb = new StringBuilder("Size(");
            sb.append(n3);
            sb.append(" x ");
            sb.append(n);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            gac.c(sb.toString());
        }
        return (noe)new rlc(n3, n, map, lta);
    }
    
    public final int L0(final float n) {
        return ((xc8)this.v).L0(n);
    }
    
    public final long T0(final long n) {
        return ((xc8)this.v).T0(n);
    }
    
    public final float W0(final long n) {
        return ((xc8)this.v).W0(n);
    }
    
    public final long X(final int n) {
        return ((xc8)this.v).X(n);
    }
    
    public final long Z(final float n) {
        return ((xc8)this.v).Z(n);
    }
    
    public final float e0(final int n) {
        return ((xc8)this.v).e0(n);
    }
    
    public final float getDensity() {
        return ((xc8)this.v).getDensity();
    }
    
    public final qzc getLayoutDirection() {
        return this.w;
    }
    
    public final float i0(final float n) {
        return ((xc8)this.v).i0(n);
    }
    
    public final float o0() {
        return ((xc8)this.v).o0();
    }
    
    public final boolean r0() {
        return this.v.r0();
    }
    
    public final float w0(final float n) {
        return ((xc8)this.v).w0(n);
    }
    
    public final long x(final float n) {
        return ((xc8)this.v).x(n);
    }
    
    public final long y(final long n) {
        return ((xc8)this.v).y(n);
    }
}
