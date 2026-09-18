import java.util.Collection;

public final class z4d implements r3d
{
    public final v5d a;
    
    public z4d(final v5d a) {
        this.a = a;
    }
    
    @Override
    public final int a() {
        return this.a.i().o;
    }
    
    @Override
    public final int b() {
        return Math.min(this.a() - 1, ((m5d)c86.P0(this.a.i().l)).a);
    }
    
    @Override
    public final int c() {
        final v5d a = this.a;
        if (a.i().l.isEmpty()) {
            return 0;
        }
        final int h = w5e.h(a.i());
        final int y = ifc.y(a.i());
        if (y != 0) {
            final int n = h / y;
            if (n >= 1) {
                return n;
            }
        }
        return 1;
    }
    
    @Override
    public final boolean d() {
        return ((Collection)this.a.i().l).isEmpty() ^ true;
    }
    
    @Override
    public final int e() {
        return Math.max(0, ((hsg)this.a.e.w).h());
    }
}
