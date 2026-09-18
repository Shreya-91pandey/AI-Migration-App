import java.util.Map;
import java.util.List;

public final class v96 implements moe, azj
{
    public final jv0 a;
    public final dx b;
    
    public v96(final jv0 a, final dx b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a(final flc flc, final List list, final int n) {
        return jar.l(n, flc.L0(this.a.d()), list);
    }
    
    public final noe b(final ooe ooe, final List list, final long n) {
        return uuj.n0((azj)this, gv6.j(n), gv6.k(n), gv6.h(n), gv6.i(n), ooe.L0(this.a.d()), ooe, list, new o8h[list.size()], 0, list.size(), (int[])null, 0);
    }
    
    public final int c(final flc flc, final List list, final int n) {
        return jar.n(n, flc.L0(this.a.d()), list);
    }
    
    public final int d(final flc flc, final List list, final int n) {
        return jar.k(n, flc.L0(this.a.d()), list);
    }
    
    public final int e(final flc flc, final List list, final int n) {
        return jar.m(n, flc.L0(this.a.d()), list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof v96) {
                final v96 v96 = (v96)o;
                if (this.a.equals(v96.a)) {
                    if (mlc.q((Object)this.b, (Object)v96.b)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final void f(final int n, final int[] array, final int[] array2, final ooe ooe) {
        this.a.r((xc8)ooe, n, array, array2);
    }
    
    public final long g(final int n, final int n2, final int n3, final boolean b) {
        if (!b) {
            return hv6.a(0, n3, n, n2);
        }
        return ri2.E(0, n3, n, n2);
    }
    
    public final noe h(final o8h[] array, final ooe ooe, final int n, final int[] array2, final int n2, final int n3, final int[] array3, final int n4, final int n5, final int n6) {
        return ooe.Y(n3, n2, (Map)s89.v, (lta)new sj2(array, this, n3, n, ooe, array2));
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    public final int i(final o8h o8h) {
        return o8h.v;
    }
    
    public final int j(final o8h o8h) {
        return o8h.w;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ColumnMeasurePolicy(verticalArrangement=");
        sb.append((Object)this.a);
        sb.append(", horizontalAlignment=");
        sb.append((Object)this.b);
        sb.append(")");
        return sb.toString();
    }
}
