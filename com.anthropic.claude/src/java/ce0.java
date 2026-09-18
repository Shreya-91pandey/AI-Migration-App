import java.util.Collection;
import java.util.Map;
import java.util.List;

public final class ce0 implements moe
{
    public final le0 a;
    public o8h[] b;
    public o8h[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final be0 h;
    public final be0 i;
    
    public ce0(final le0 a) {
        this.a = a;
        this.h = new be0(this, (byte)1);
        this.i = new be0(this, (byte)0);
    }
    
    @Override
    public final int a(final flc flc, final List list, final int n) {
        Integer n2;
        if (list.isEmpty()) {
            n2 = null;
        }
        else {
            final Integer value = ((goe)list.get(0)).s(n);
            final int p3 = lq6.P(list);
            int n3 = 1;
            n2 = value;
            if (1 <= p3) {
                Integer n4 = value;
                while (true) {
                    final Integer value2 = ((goe)list.get(n3)).s(n);
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
        if (n2 != null) {
            return n2;
        }
        return 0;
    }
    
    @Override
    public final noe b(final ooe ooe, final List list, long n) {
        final int size = list.size();
        final o8h[] array = new o8h[size];
        final int size2 = ((Collection)list).size();
        long n2 = 0L;
        long n3;
        for (int i = 0; i < size2; ++i, n2 = n3) {
            final goe goe = (goe)list.get(i);
            final Object z = goe.z();
            fe0 fe0;
            if (z instanceof fe0) {
                fe0 = (fe0)z;
            }
            else {
                fe0 = null;
            }
            n3 = n2;
            if (fe0 != null) {
                n3 = n2;
                if (fe0.v.getValue()) {
                    final o8h u = goe.u(n);
                    final int v = u.v;
                    final int w = u.w;
                    final long n4 = v;
                    final long n5 = w;
                    array[i] = u;
                    n3 = ((n5 & 0xFFFFFFFFL) | n4 << 32);
                }
            }
        }
        for (int size3 = ((Collection)list).size(), j = 0; j < size3; ++j) {
            final goe goe2 = (goe)list.get(j);
            if (array[j] == null) {
                array[j] = goe2.u(n);
            }
        }
        yog yog;
        if (((flc)ooe).r0()) {
            yog = new yog((Object)(int)(n2 >> 32), (Object)(int)(n2 & 0xFFFFFFFFL));
        }
        else {
            int k = 0;
            int n6 = 0;
            int n7 = 0;
            while (k < size) {
                final o8h o8h = array[k];
                int n8;
                if (o8h == null) {
                    n8 = n7;
                }
                else {
                    final Object z2 = ((goe)list.get(k)).z();
                    fe0 fe2;
                    if (z2 instanceof fe0) {
                        fe2 = (fe0)z2;
                    }
                    else {
                        fe2 = null;
                    }
                    if (fe2 != null && (boolean)fe2.w.getValue()) {
                        n8 = n7;
                    }
                    else {
                        final int v2 = o8h.v;
                        int n9;
                        if (v2 > (n9 = n6)) {
                            n9 = v2;
                        }
                        final int w2 = o8h.w;
                        n6 = n9;
                        if (w2 > (n8 = n7)) {
                            n8 = w2;
                            n6 = n9;
                        }
                    }
                }
                ++k;
                n7 = n8;
            }
            yog = new yog((Object)n6, (Object)n7);
        }
        final int intValue = ((Number)yog.v).intValue();
        final int intValue2 = ((Number)yog.w).intValue();
        final boolean r0 = ((flc)ooe).r0();
        final s89 v3 = s89.v;
        if (!r0) {
            n = intValue;
            this.a.d.setValue((Object)new chc(n << 32 | ((long)intValue2 & 0xFFFFFFFFL)));
            this.c = array;
            this.e = intValue;
            this.g = intValue2;
            return ooe.Y(intValue, intValue2, (Map)v3, (lta)this.i);
        }
        this.b = array;
        this.d = intValue;
        this.f = intValue2;
        return ooe.Y(intValue, intValue2, (Map)v3, (lta)this.h);
    }
    
    @Override
    public final int c(final flc flc, final List list, final int n) {
        Integer n2;
        if (list.isEmpty()) {
            n2 = null;
        }
        else {
            final Integer value = ((goe)list.get(0)).n(n);
            final int p3 = lq6.P(list);
            int n3 = 1;
            n2 = value;
            if (1 <= p3) {
                Integer n4 = value;
                while (true) {
                    final Integer value2 = ((goe)list.get(n3)).n(n);
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
        if (n2 != null) {
            return n2;
        }
        return 0;
    }
    
    @Override
    public final int d(final flc flc, final List list, final int n) {
        Integer n2;
        if (list.isEmpty()) {
            n2 = null;
        }
        else {
            final Integer value = ((goe)list.get(0)).a(n);
            final int p3 = lq6.P(list);
            int n3 = 1;
            n2 = value;
            if (1 <= p3) {
                Integer n4 = value;
                while (true) {
                    final Integer value2 = ((goe)list.get(n3)).a(n);
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
        if (n2 != null) {
            return n2;
        }
        return 0;
    }
    
    @Override
    public final int e(final flc flc, final List list, final int n) {
        Integer n2;
        if (list.isEmpty()) {
            n2 = null;
        }
        else {
            final Integer value = ((goe)list.get(0)).Q(n);
            final int p3 = lq6.P(list);
            int n3 = 1;
            n2 = value;
            if (1 <= p3) {
                Integer n4 = value;
                while (true) {
                    final Integer value2 = ((goe)list.get(n3)).Q(n);
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
        if (n2 != null) {
            return n2;
        }
        return 0;
    }
}
