import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class me0 implements moe
{
    public final bf0 a;
    public boolean b;
    
    public me0(final bf0 a) {
        this.a = a;
    }
    
    @Override
    public final int a(final flc flc, final List list, final int n) {
        if (list.isEmpty()) {
            return 0;
        }
        final int s = ((goe)list.get(0)).s(n);
        final int p3 = lq6.P(list);
        int n2 = 1;
        int n3 = s;
        if (1 <= p3) {
            int n4 = s;
            while (true) {
                final int s2 = ((goe)list.get(n2)).s(n);
                int n5 = n4;
                if (s2 > n4) {
                    n5 = s2;
                }
                n3 = n5;
                if (n2 == p3) {
                    break;
                }
                ++n2;
                n4 = n5;
            }
        }
        return n3;
    }
    
    @Override
    public final noe b(final ooe ooe, final List list, long n) {
        final ksg b = this.a.b;
        final ArrayList list2 = new ArrayList(list.size());
        final int size = ((Collection)list).size();
        int i = 0;
        int max = 0;
        int max2 = 0;
        while (i < size) {
            final o8h u = ((goe)list.get(i)).u(n);
            max = Math.max(max, u.v);
            max2 = Math.max(max2, u.w);
            list2.add((Object)u);
            ++i;
        }
        if (((flc)ooe).r0()) {
            this.b = true;
            n = max;
            b.setValue((Object)new chc(((long)max2 & 0xFFFFFFFFL) | n << 32));
        }
        else if (!this.b) {
            n = max;
            b.setValue((Object)new chc(((long)max2 & 0xFFFFFFFFL) | n << 32));
        }
        return ooe.Y(max, max2, (Map)s89.v, (lta)new k10(list2, (byte)2));
    }
    
    @Override
    public final int c(final flc flc, final List list, final int n) {
        if (list.isEmpty()) {
            return 0;
        }
        final int n2 = ((goe)list.get(0)).n(n);
        final int p3 = lq6.P(list);
        int n3 = 1;
        int n4 = n2;
        if (1 <= p3) {
            int n5 = n2;
            while (true) {
                final int n6 = ((goe)list.get(n3)).n(n);
                int n7 = n5;
                if (n6 > n5) {
                    n7 = n6;
                }
                n4 = n7;
                if (n3 == p3) {
                    break;
                }
                ++n3;
                n5 = n7;
            }
        }
        return n4;
    }
    
    @Override
    public final int d(final flc flc, final List list, final int n) {
        if (list.isEmpty()) {
            return 0;
        }
        final int a = ((goe)list.get(0)).a(n);
        final int p3 = lq6.P(list);
        int n2 = 1;
        int n3 = a;
        if (1 <= p3) {
            int n4 = a;
            while (true) {
                final int a2 = ((goe)list.get(n2)).a(n);
                int n5 = n4;
                if (a2 > n4) {
                    n5 = a2;
                }
                n3 = n5;
                if (n2 == p3) {
                    break;
                }
                ++n2;
                n4 = n5;
            }
        }
        return n3;
    }
    
    @Override
    public final int e(final flc flc, final List list, final int n) {
        if (list.isEmpty()) {
            return 0;
        }
        final int q = ((goe)list.get(0)).Q(n);
        final int p3 = lq6.P(list);
        int n2 = 1;
        int n3 = q;
        if (1 <= p3) {
            int n4 = q;
            while (true) {
                final int q2 = ((goe)list.get(n2)).Q(n);
                int n5 = n4;
                if (q2 > n4) {
                    n5 = q2;
                }
                n3 = n5;
                if (n2 == p3) {
                    break;
                }
                ++n2;
                n4 = n5;
            }
        }
        return n3;
    }
}
