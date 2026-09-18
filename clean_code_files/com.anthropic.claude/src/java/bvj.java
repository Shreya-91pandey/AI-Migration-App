import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class bvj extends h0d
{
    public static final bvj c;
    public final byte b;
    
    static {
        c = new bvj("Undefined intrinsics block and it is required", (byte)0);
    }
    
    public final noe b(final ooe ooe, final List list, final long n) {
        switch (this.b) {
            default: {
                throw new IllegalStateException("Undefined measure and it is required");
            }
            case 0: {
                final int size = list.size();
                final s89 v = s89.v;
                noe noe;
                if (size != 0) {
                    if (size != 1) {
                        final ArrayList list2 = new ArrayList(list.size());
                        final int size2 = ((Collection)list).size();
                        int i = 0;
                        int max2;
                        int max = max2 = 0;
                        while (i < size2) {
                            final o8h u = ((goe)list.get(i)).u(n);
                            max = Math.max(u.v, max);
                            max2 = Math.max(u.w, max2);
                            list2.add((Object)u);
                            ++i;
                        }
                        noe = ooe.Y(hv6.g(max, n), hv6.f(max2, n), (Map)v, (lta)new avj(list2, (byte)0));
                    }
                    else {
                        final o8h u2 = ((goe)list.get(0)).u(n);
                        noe = ooe.Y(hv6.g(u2.v, n), hv6.f(u2.w, n), (Map)v, (lta)new t40(u2, (byte)6));
                    }
                }
                else {
                    noe = ooe.Y(gv6.k(n), gv6.j(n), (Map)v, (lta)new drj((byte)6));
                }
                return noe;
            }
        }
    }
}
