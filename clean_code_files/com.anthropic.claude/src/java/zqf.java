import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class zqf implements moe
{
    public final nx8 a;
    public final bnf b;
    public final gsg c;
    
    public zqf(final nx8 a, final bnf b, final gsg c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final noe b(final ooe ooe, final List list, long b) {
        b = gv6.b(b, 0, 0, 0, 0, 10);
        final ArrayList list2 = new ArrayList(list.size());
        final int size = ((Collection)list).size();
        final int n = 0;
        for (int i = 0; i < size; ++i) {
            list2.add((Object)((goe)list.get(i)).u(b));
        }
        final boolean empty = list2.isEmpty();
        final Integer n2 = null;
        int n3 = 1;
        Integer n4;
        if (empty) {
            n4 = null;
        }
        else {
            final Integer value = ((o8h)list2.get(0)).v;
            final int p3 = lq6.P((List)list2);
            n4 = value;
            if (1 <= p3) {
                int n5 = 1;
                Integer n6 = value;
                while (true) {
                    final Integer value2 = ((o8h)list2.get(n5)).v;
                    Integer n7 = n6;
                    if (value2.compareTo((Object)n6) > 0) {
                        n7 = value2;
                    }
                    n4 = n7;
                    if (n5 == p3) {
                        break;
                    }
                    ++n5;
                    n6 = n7;
                }
            }
        }
        int intValue;
        if (n4 != null) {
            intValue = n4;
        }
        else {
            intValue = 0;
        }
        Integer n8;
        if (list2.isEmpty()) {
            n8 = n2;
        }
        else {
            final Integer value3 = ((o8h)list2.get(0)).w;
            final int p4 = lq6.P((List)list2);
            Integer n9 = value3;
            if (1 <= p4) {
                Integer n10 = value3;
                while (true) {
                    final Integer value4 = ((o8h)list2.get(n3)).w;
                    Integer n11 = n10;
                    if (value4.compareTo((Object)n10) > 0) {
                        n11 = value4;
                    }
                    n9 = n11;
                    if (n3 == p4) {
                        break;
                    }
                    ++n3;
                    n10 = n11;
                }
            }
            n8 = n9;
        }
        int intValue2 = n;
        if (n8 != null) {
            intValue2 = n8;
        }
        return ooe.Y(intValue, intValue2, (Map)s89.v, (lta)new yqf(this.a, intValue, list2, this.b, this.c));
    }
}
