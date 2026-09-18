import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Map;

public final class v8k implements u8k
{
    public final lta v;
    public final tmf w;
    public tmf x;
    
    public v8k(final Map map, final lta v) {
        this.v = v;
        tmf w;
        if (map != null && !map.isEmpty()) {
            final tmf tmf = new tmf(map.size());
            final Iterator iterator = map.entrySet().iterator();
            while (true) {
                w = tmf;
                if (!iterator.hasNext()) {
                    break;
                }
                final Map$Entry map$Entry = (Map$Entry)iterator.next();
                tmf.m(map$Entry.getKey(), map$Entry.getValue());
            }
        }
        else {
            w = null;
        }
        this.w = w;
    }
    
    public final t8k a(final jta jta, final String s) {
        for (int length = s.length(), i = 0; i < length; ++i) {
            if (!lq6.V(s.charAt(i))) {
                tmf x;
                if ((x = this.x) == null) {
                    final long[] a = jak.a;
                    x = new tmf();
                    this.x = x;
                }
                Object g;
                if ((g = x.g((Object)s)) == null) {
                    g = new ArrayList();
                    x.m((Object)s, g);
                }
                ((List)g).add((Object)jta);
                return (t8k)new tze((Object)x, (Object)s, (Object)jta, (byte)7);
            }
        }
        en9.s("Registered key is empty or blank");
        return null;
    }
    
    public final boolean b(final Object o) {
        return (boolean)this.v.b(o);
    }
    
    public final Map c() {
        final tmf w = this.w;
        if (w == null && this.x == null) {
            return (Map)s89.v;
        }
        int e;
        if (w != null) {
            e = w.e;
        }
        else {
            e = 0;
        }
        final tmf x = this.x;
        int e2;
        if (x != null) {
            e2 = x.e;
        }
        else {
            e2 = 0;
        }
        final HashMap hashMap = new HashMap(e + e2);
        final int n = 7;
        final long n2 = -9187201950435737472L;
        final int n3 = 8;
        int n9 = 0;
        long n10 = 0L;
        Label_0282: {
            if (w != null) {
                final Object[] b = w.b;
                final Object[] c = w.c;
                final long[] a = w.a;
                final int n4 = a.length - 2;
                if (n4 >= 0) {
                    int n5 = 0;
                    while (true) {
                        long n6 = a[n5];
                        if ((~n6 << n & n6 & n2) != n2) {
                            final int n7 = 8 - (~(n5 - n4) >>> 31);
                            for (int i = 0; i < n7; ++i) {
                                if ((n6 & 0xFFL) < 128L) {
                                    final int n8 = (n5 << 3) + i;
                                    ((Map)hashMap).put((Object)b[n8], (Object)c[n8]);
                                }
                                n6 >>= 8;
                            }
                            n9 = n;
                            n10 = n2;
                            if (n7 != 8) {
                                break Label_0282;
                            }
                        }
                        n9 = n;
                        n10 = n2;
                        if (n5 == n4) {
                            break Label_0282;
                        }
                        ++n5;
                    }
                }
            }
            n9 = 7;
            n10 = -9187201950435737472L;
        }
        final tmf x2 = this.x;
        Label_0642: {
            if (x2 != null) {
                final Object[] b2 = x2.b;
                final Object[] c2 = x2.c;
                final long[] a2 = x2.a;
                final int n11 = a2.length - 2;
                if (n11 >= 0) {
                    int n12 = 0;
                    final int n13 = n3;
                    while (true) {
                        long n14 = a2[n12];
                        if ((~n14 << n9 & n14 & n10) != n10) {
                            final int n15 = 8 - (~(n12 - n11) >>> 31);
                            int n16 = 0;
                            while (true) {
                                int j = 0;
                                if (n16 < n15) {
                                    if ((n14 & 0xFFL) < 128L) {
                                        final int n17 = (n12 << 3) + n16;
                                        final Object o = b2[n17];
                                        final List list = (List)c2[n17];
                                        final String s = (String)o;
                                        if (list.size() == 1) {
                                            final Object a3 = ((jta)list.get(0)).a();
                                            if (a3 != null) {
                                                if (!this.b(a3)) {
                                                    fvd.h((Object)mlc.H(a3));
                                                    return null;
                                                }
                                                ((Map)hashMap).put((Object)s, (Object)lq6.g(new Object[] { a3 }));
                                            }
                                        }
                                        else {
                                            final int size = list.size();
                                            final ArrayList list2 = new ArrayList(size);
                                            while (j < size) {
                                                final Object a4 = ((jta)list.get(j)).a();
                                                if (a4 != null && !this.b(a4)) {
                                                    fvd.h((Object)mlc.H(a4));
                                                    return null;
                                                }
                                                list2.add(a4);
                                                ++j;
                                            }
                                            ((Map)hashMap).put((Object)s, (Object)list2);
                                        }
                                    }
                                    n14 >>= n13;
                                    ++n16;
                                }
                                else {
                                    if (n15 == n13) {
                                        break;
                                    }
                                    break Label_0642;
                                }
                            }
                        }
                        if (n12 == n11) {
                            break;
                        }
                        ++n12;
                    }
                }
            }
        }
        return (Map)hashMap;
    }
    
    public final Object f(final String s) {
        final tmf w = this.w;
        List list;
        if (w != null) {
            list = (List)w.k((Object)s);
        }
        else {
            list = null;
        }
        if (list != null && !((Collection)list).isEmpty()) {
            if (list.size() > 1 && w != null) {
                final List subList = list.subList(1, list.size());
                final int f = w.f((Object)s);
                int n;
                if ((n = f) < 0) {
                    n = ~f;
                }
                final Object[] c = w.c;
                final Object o = c[n];
                w.b[n] = s;
                c[n] = subList;
                final List list2 = (List)o;
            }
            return list.get(0);
        }
        return null;
    }
}
