import java.util.List;
import java.util.Map;

public final class f4d implements ooe
{
    public final b4d v;
    public final g1n w;
    public final c4d x;
    public final jlf y;
    
    public f4d(final b4d v, final g1n w) {
        this.v = v;
        this.w = w;
        this.x = (c4d)v.b.a();
        tgc.a();
        this.y = new jlf();
    }
    
    @Override
    public final int E0(final long n) {
        return ((xc8)this.w).E0(n);
    }
    
    @Override
    public final float I(final long n) {
        return ((xc8)this.w).I(n);
    }
    
    @Override
    public final noe J0(final int n, final int n2, final Map map, final lta lta, final lta lta2) {
        return ((ooe)this.w).J0(n, n2, map, lta, lta2);
    }
    
    @Override
    public final int L0(final float n) {
        return ((xc8)this.w).L0(n);
    }
    
    @Override
    public final long T0(final long n) {
        return ((xc8)this.w).T0(n);
    }
    
    @Override
    public final float W0(final long n) {
        return ((xc8)this.w).W0(n);
    }
    
    @Override
    public final long X(final int n) {
        return ((xc8)this.w).X(n);
    }
    
    @Override
    public final noe Y(final int n, final int n2, final Map map, final lta lta) {
        return ((ooe)this.w).Y(n, n2, map, lta);
    }
    
    @Override
    public final long Z(final float n) {
        return ((xc8)this.w).Z(n);
    }
    
    public final List a(final int n) {
        final jlf y = this.y;
        final List list = (List)((sgc)y).b(n);
        if (list != null) {
            return list;
        }
        final c4d x = this.x;
        final Object b = x.b(n);
        final List v = this.w.v(this.v.a(n, b, x.c(n)), b);
        y.i(n, (Object)v);
        return v;
    }
    
    @Override
    public final float e0(final int n) {
        return ((xc8)this.w).e0(n);
    }
    
    @Override
    public final float getDensity() {
        return ((xc8)this.w).getDensity();
    }
    
    @Override
    public final qzc getLayoutDirection() {
        return ((flc)this.w).getLayoutDirection();
    }
    
    @Override
    public final float i0(final float n) {
        return ((xc8)this.w).i0(n);
    }
    
    @Override
    public final float o0() {
        return ((xc8)this.w).o0();
    }
    
    @Override
    public final boolean r0() {
        return ((flc)this.w).r0();
    }
    
    @Override
    public final float w0(final float n) {
        return ((xc8)this.w).w0(n);
    }
    
    @Override
    public final long x(final float n) {
        return ((xc8)this.w).x(n);
    }
    
    @Override
    public final long y(final long n) {
        return ((xc8)this.w).y(n);
    }
}
