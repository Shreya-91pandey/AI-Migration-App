import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public abstract class pg0
{
    public static final og0 a;
    
    static {
        a = new og0("");
    }
    
    public static og0 a(final String s, final hcm hcm) {
        return new og0(s, lq6.X((Object)new ng0(0, s.length(), hcm)), (List)r89.v);
    }
    
    public static final List b(final og0 og0, int i, int size, final p50 p4) {
        if (i != size) {
            final List v = og0.v;
            if (v != null) {
                int j = 0;
                final int n = 0;
                if (i != 0 || size < og0.w.length()) {
                    final ArrayList list = new ArrayList(v.size());
                    while (j < ((Collection)v).size()) {
                        final ng0 ng0 = (ng0)v.get(j);
                        if (p4 == null || (boolean)p4.b(ng0.a)) {
                            final int b = ng0.b;
                            final int c = ng0.c;
                            if (c(i, size, b, c)) {
                                list.add((Object)new ng0(ncq.o(ng0.b, i, size) - i, ncq.o(c, i, size) - i, ng0.a, ng0.d));
                            }
                        }
                        ++j;
                    }
                    return (List)list;
                }
                if (p4 == null) {
                    return v;
                }
                final ArrayList list2 = new ArrayList(v.size());
                Object value;
                for (size = ((Collection)v).size(), i = n; i < size; ++i) {
                    value = v.get(i);
                    if (p4.b(((ng0)value).a)) {
                        list2.add(value);
                    }
                }
                return (List)list2;
            }
        }
        return null;
    }
    
    public static final boolean c(int n, final int n2, final int n3, int n4) {
        final int n5 = 0;
        final boolean b = n == n2;
        final boolean b2 = n3 == n4;
        final boolean b3 = n == n3;
        if (n < n4) {
            n = 1;
        }
        else {
            n = 0;
        }
        n4 = n5;
        if (n3 < n2) {
            n4 = 1;
        }
        return ((n & n4) | (((b | b2) & b3) ? 1 : 0)) != 0x0;
    }
}
