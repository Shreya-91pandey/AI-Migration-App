import java.util.Collection;
import java.util.Map;
import java.util.List;

public final class uj2 implements moe
{
    public final gx a;
    public final boolean b;
    
    public uj2(final gx a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public final noe b(final ooe ooe, final List list, long a) {
        final boolean empty = list.isEmpty();
        final s89 v = s89.v;
        if (empty) {
            return ooe.Y(gv6.k(a), gv6.j(a), (Map)v, (lta)new mx1((byte)25));
        }
        long n;
        if (this.b) {
            n = a;
        }
        else {
            n = (a & 0xFFFFFFFE00000003L);
        }
        final int size = list.size();
        final mj2 mj2 = null;
        boolean b = true;
        if (size == 1) {
            final goe goe = (goe)list.get(0);
            final Object z = goe.z();
            mj2 mj3 = mj2;
            if (z instanceof mj2) {
                mj3 = (mj2)z;
            }
            o8h o8h;
            int max;
            int max2;
            if (mj3 == null || !mj3.K) {
                o8h = goe.u(n);
                max = Math.max(gv6.k(a), o8h.v);
                max2 = Math.max(gv6.j(a), o8h.w);
            }
            else {
                final int k = gv6.k(a);
                final int j = gv6.j(a);
                final int i = gv6.k(a);
                final int l = gv6.j(a);
                final boolean b2 = i >= 0;
                if (l < 0) {
                    b = false;
                }
                if (!(b & b2)) {
                    iac.a("width and height must be >= 0");
                }
                o8h = goe.u(hv6.h(i, i, l, l));
                max = k;
                max2 = j;
            }
            return ooe.Y(max, max2, (Map)v, (lta)new sj2(o8h, goe, ooe, max, max2, this));
        }
        final o8h[] array = new o8h[list.size()];
        final Object o = new Object();
        ((z3j)o).v = gv6.k(a);
        final Object o2 = new Object();
        ((z3j)o2).v = gv6.j(a);
        final int size2 = ((Collection)list).size();
        int n2 = 0;
        boolean b3 = false;
        while (n2 < size2) {
            final goe goe2 = (goe)list.get(n2);
            final Object z2 = goe2.z();
            mj2 mj4;
            if (z2 instanceof mj2) {
                mj4 = (mj2)z2;
            }
            else {
                mj4 = null;
            }
            if (mj4 == null || !mj4.K) {
                final o8h u = goe2.u(n);
                array[n2] = u;
                ((z3j)o).v = Math.max(((z3j)o).v, u.v);
                ((z3j)o2).v = Math.max(((z3j)o2).v, u.w);
            }
            else {
                b3 = true;
            }
            ++n2;
        }
        if (b3) {
            final int v2 = ((z3j)o).v;
            int n3;
            if (v2 != Integer.MAX_VALUE) {
                n3 = v2;
            }
            else {
                n3 = 0;
            }
            final int v3 = ((z3j)o2).v;
            int n4;
            if (v3 != Integer.MAX_VALUE) {
                n4 = v3;
            }
            else {
                n4 = 0;
            }
            a = hv6.a(n3, v2, n4, v3);
            for (int size3 = ((Collection)list).size(), n5 = 0; n5 < size3; ++n5) {
                final goe goe3 = (goe)list.get(n5);
                final Object z3 = goe3.z();
                mj2 mj5;
                if (z3 instanceof mj2) {
                    mj5 = (mj2)z3;
                }
                else {
                    mj5 = null;
                }
                if (mj5 != null && mj5.K) {
                    array[n5] = goe3.u(a);
                }
            }
        }
        return ooe.Y(((z3j)o).v, ((z3j)o2).v, (Map)v, (lta)new tj2((Object)array, (Object)list, (Object)ooe, o, o2, (Object)this, (byte)0));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof uj2)) {
            return false;
        }
        final uj2 uj2 = (uj2)o;
        return mlc.q((Object)this.a, (Object)uj2.a) && this.b == uj2.b;
    }
    
    @Override
    public final int hashCode() {
        return Boolean.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb.append((Object)this.a);
        sb.append(", propagateMinConstraints=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
