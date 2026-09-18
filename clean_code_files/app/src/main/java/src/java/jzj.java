import java.util.Map;
import java.util.List;

public final class jzj implements moe, azj
{
    public final gv0 a;
    public final lb2 b;
    
    public jzj(final gv0 a, final lb2 b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final flc flc, final List list, final int n) {
        return jar.d(n, flc.L0(this.a.d()), list);
    }
    
    public final noe b(final ooe ooe, final List list, final long n) {
        return uuj.n0((azj)this, gv6.k(n), gv6.j(n), gv6.i(n), gv6.h(n), ooe.L0(this.a.d()), ooe, list, new o8h[list.size()], 0, list.size(), (int[])null, 0);
    }
    
    public final int c(final flc flc, final List list, final int n) {
        return jar.f(n, flc.L0(this.a.d()), list);
    }
    
    public final int d(final flc flc, final List list, final int n) {
        return jar.c(n, flc.L0(this.a.d()), list);
    }
    
    public final int e(final flc flc, final List list, final int n) {
        return jar.e(n, flc.L0(this.a.d()), list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof jzj)) {
            return false;
        }
        final jzj jzj = (jzj)o;
        return mlc.q((Object)this.a, (Object)jzj.a) && mlc.q((Object)this.b, (Object)jzj.b);
    }
    
    public final void f(final int n, final int[] array, final int[] array2, final ooe ooe) {
        this.a.h((xc8)ooe, n, array, ooe.getLayoutDirection(), array2);
    }
    
    public final long g(final int n, final int n2, final int n3, final boolean b) {
        if (!b) {
            return hv6.a(n, n2, 0, n3);
        }
        return ri2.F(n, n2, 0, n3);
    }
    
    public final noe h(final o8h[] array, final ooe ooe, final int n, final int[] array2, final int n2, final int n3, final int[] array3, final int n4, final int n5, final int n6) {
        return ooe.Y(n2, n3, (Map)s89.v, (lta)new izj(array, this, n3, n, array2));
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    public final int i(final o8h o8h) {
        return o8h.w;
    }
    
    public final int j(final o8h o8h) {
        return o8h.v;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RowMeasurePolicy(horizontalArrangement=");
        sb.append((Object)this.a);
        sb.append(", verticalAlignment=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
