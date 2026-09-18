import java.util.Collection;
import java.util.Map;
import java.util.List;

public final class abo implements moe
{
    public final tia a;
    public final jv0 b;
    public final kb2 c;
    public final int d;
    public final float e;
    public final dng f;
    
    public abo(final tia a, final jv0 b, final kb2 c, final int d, final float e, final dng f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final int a(final flc flc, final List list, final int n) {
        final int size = ((Collection)list).size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            n2 += ((goe)list.get(i)).s(n);
            ++i;
        }
        return n2;
    }
    
    public final noe b(final ooe ooe, final List list, final long n) {
        final int size = ((Collection)list).size();
        final int n2 = 0;
        for (int i = 0; i < size; ++i) {
            final goe goe = (goe)list.get(i);
            if (mlc.q(ao2.O(goe), (Object)"navigationIcon")) {
                final o8h u = goe.u(gv6.b(n, 0, 0, 0, 0, 14));
                for (int size2 = ((Collection)list).size(), j = 0; j < size2; ++j) {
                    final goe goe2 = (goe)list.get(j);
                    if (mlc.q(ao2.O(goe2), (Object)"actionIcons")) {
                        final o8h u2 = goe2.u(gv6.b(n, 0, 0, 0, 0, 14));
                        final qzc layoutDirection = ooe.getLayoutDirection();
                        final dng f = this.f;
                        final float z = omo.z(f, layoutDirection);
                        final float y = omo.y(f, ooe.getLayoutDirection());
                        final int max = Math.max(ooe.L0(wk0.b), u.v);
                        int k;
                        if (gv6.i(n) == Integer.MAX_VALUE) {
                            k = gv6.i(n);
                        }
                        else {
                            k = gv6.i(n) - max - u2.v - ooe.L0(z) - ooe.L0(y);
                            if (k < 0) {
                                k = 0;
                            }
                        }
                        for (int size3 = ((Collection)list).size(), l = 0; l < size3; ++l) {
                            final goe goe3 = (goe)list.get(l);
                            if (mlc.q(ao2.O(goe3), (Object)"title")) {
                                final o8h u3 = goe3.u(gv6.b(n, 0, k, 0, 0, 12));
                                final olb b = kx.b;
                                int s;
                                if (u3.S((hx)b) != Integer.MIN_VALUE) {
                                    s = u3.S((hx)b);
                                }
                                else {
                                    s = 0;
                                }
                                final float a = this.a.a();
                                int h;
                                if (Float.isNaN(a)) {
                                    h = 0;
                                }
                                else {
                                    h = k8e.H(a);
                                }
                                final int n3 = Math.max(ooe.L0(this.e), u3.w) + ooe.L0(f.d()) + ooe.L0(f.a());
                                int n4;
                                if (gv6.h(n) == Integer.MAX_VALUE) {
                                    n4 = n3;
                                }
                                else {
                                    n4 = h + n3;
                                    if (n4 < 0) {
                                        n4 = n2;
                                    }
                                }
                                return ooe.Y(gv6.i(n), n4, (Map)s89.v, (lta)new zao(u, ooe.L0(omo.z(f, ooe.getLayoutDirection())), ooe.L0(f.d()) + n4 - ooe.L0(f.a()), u3, u2, n, ooe.L0(omo.y(f, ooe.getLayoutDirection())), this, s, n3));
                            }
                        }
                        ald.b("Collection contains no element matching the predicate.");
                        ebq.a();
                        return null;
                    }
                }
                ald.b("Collection contains no element matching the predicate.");
                ebq.a();
                return null;
            }
        }
        ald.b("Collection contains no element matching the predicate.");
        ebq.a();
        return null;
    }
    
    public final int c(final flc flc, final List list, final int n) {
        final int size = ((Collection)list).size();
        int i = 0;
        int n2 = 0;
        while (i < size) {
            n2 += ((goe)list.get(i)).n(n);
            ++i;
        }
        return n2;
    }
    
    public final int d(final flc flc, final List list, int intValue) {
        final int l0 = flc.L0(this.e);
        final boolean empty = list.isEmpty();
        final int n = 0;
        Integer n2;
        if (empty) {
            n2 = null;
        }
        else {
            final Integer value = ((goe)list.get(0)).a(intValue);
            final int p3 = lq6.P(list);
            int n3 = 1;
            n2 = value;
            if (1 <= p3) {
                Integer n4 = value;
                while (true) {
                    final Integer value2 = ((goe)list.get(n3)).a(intValue);
                    Integer n5 = n4;
                    if (value2.compareTo((Object)n4) > 0) {
                        n5 = value2;
                    }
                    n2 = n5;
                    if (n3 == p3) {
                        break;
                    }
                    ++n3;
                    n4 = n5;
                }
            }
        }
        intValue = n;
        if (n2 != null) {
            intValue = n2;
        }
        return Math.max(l0, intValue);
    }
    
    public final int e(final flc flc, final List list, int intValue) {
        final int l0 = flc.L0(this.e);
        final boolean empty = list.isEmpty();
        final int n = 0;
        Integer n2;
        if (empty) {
            n2 = null;
        }
        else {
            final Integer value = ((goe)list.get(0)).Q(intValue);
            final int p3 = lq6.P(list);
            int n3 = 1;
            n2 = value;
            if (1 <= p3) {
                Integer n4 = value;
                while (true) {
                    final Integer value2 = ((goe)list.get(n3)).Q(intValue);
                    Integer n5 = n4;
                    if (value2.compareTo((Object)n4) > 0) {
                        n5 = value2;
                    }
                    n2 = n5;
                    if (n3 == p3) {
                        break;
                    }
                    ++n3;
                    n4 = n5;
                }
            }
        }
        intValue = n;
        if (n2 != null) {
            intValue = n2;
        }
        return Math.max(l0, intValue);
    }
}
