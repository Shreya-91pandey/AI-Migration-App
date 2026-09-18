import java.util.Collection;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

public final class qj2 implements moe
{
    public static final qj2 b;
    public static final qj2 c;
    public static final yp7 d;
    public static final qj2 e;
    public static final qj2 f;
    public static final qj2 g;
    public final byte a;
    
    @Override
    public final noe b(final ooe ooe, final List list, final long n) {
        final byte a = this.a;
        int i = 0;
        int h = 0;
        final s89 v = s89.v;
        switch (a) {
            default: {
                int j;
                if (gv6.g(n)) {
                    j = gv6.i(n);
                }
                else {
                    j = 0;
                }
                if (gv6.f(n)) {
                    h = gv6.h(n);
                }
                return ooe.Y(j, h, (Map)v, (lta)new cyl((byte)5));
            }
            case 3: {
                final ArrayList list2 = new ArrayList(list.size());
                final int size = ((Collection)list).size();
                int max = 0;
                int max2 = 0;
                while (i < size) {
                    final o8h u = ((goe)list.get(i)).u(n);
                    max = Math.max(max, u.v);
                    max2 = Math.max(max2, u.w);
                    list2.add((Object)u);
                    ++i;
                }
                return ooe.Y(max, max2, (Map)v, (lta)new avj(list2, (byte)1));
            }
            case 2: {
                return ooe.Y(gv6.k(n), gv6.j(n), (Map)v, (lta)new dqb((byte)14));
            }
            case 1: {
                return ooe.Y(gv6.i(n), gv6.h(n), (Map)v, (lta)qj2.d);
            }
            case 0: {
                return ooe.Y(gv6.k(n), gv6.j(n), (Map)v, (lta)new mx1((byte)24));
            }
        }
    }
}
