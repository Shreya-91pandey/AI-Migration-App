import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public final class z3d
{
    public final tmf a;
    public mlf b;
    public int c;
    public final umf d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;
    public final ArrayList i;
    public xp8 j;
    
    public z3d() {
        final long[] a = jak.a;
        this.a = new tmf();
        final umf a2 = kak.a;
        this.d = new umf();
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        this.h = new ArrayList();
        this.i = new ArrayList();
    }
    
    public static void c(final g4d g4d, int n, final x3d x3d, final boolean b) {
        int i = 0;
        final long k = g4d.k(0);
        long n2;
        if (b) {
            n2 = ugc.a(0, n, 1, k);
        }
        else {
            n2 = ugc.a(n, 0, 2, k);
        }
        final v3d[] a = x3d.a();
        int length;
        v3d v3d;
        for (length = a.length, n = 0; i < length; ++i, ++n) {
            v3d = a[i];
            if (v3d != null) {
                v3d.r(ugc.d(n2, ugc.c(g4d.k(n), k)));
            }
        }
    }
    
    public static int h(final int[] array, final g4d g4d, final boolean b) {
        final int l = g4d.l();
        final int d = g4d.d();
        int max = 0;
        for (int i = l; i < d + l; ++i) {
            final int n = mlc.S(g4d, b) + array[i];
            array[i] = n;
            max = Math.max(max, n);
        }
        return max;
    }
    
    public final v3d a(final int n, final Object o) {
        final x3d x3d = (x3d)this.a.g(o);
        if (x3d != null) {
            return x3d.a()[n];
        }
        return null;
    }
    
    public final long b() {
        final ArrayList i = this.i;
        final int size = i.size();
        long n = 0L;
        long n2;
        for (int j = 0; j < size; ++j, n = n2) {
            final v3d v3d = (v3d)i.get(j);
            final g6b f = v3d.f();
            n2 = n;
            if (f != null) {
                n2 = (((long)Math.max((int)(n & 0xFFFFFFFFL), (int)(v3d.j() & 0xFFFFFFFFL) + (int)(f.u & 0xFFFFFFFFL)) & 0xFFFFFFFFL) | (long)Math.max((int)(n >> 32), (int)(v3d.j() >> 32) + (int)(f.u >> 32)) << 32);
            }
        }
        return n;
    }
    
    public final void d(int i, final int n, final int n2, final ArrayList list, final mlf b, final r1 r1, final boolean b2, final boolean b3, int n3, final boolean b4, int n4, int h, final oc7 oc7, final d6b d6b) {
        final mlf b5 = this.b;
        this.b = b;
        final int size = list.size();
        int n5 = 0;
        tmf a = null;
    Label_0147:
        while (true) {
            a = this.a;
            if (n5 < size) {
                final g4d g4d = (g4d)list.get(n5);
                for (int size2 = g4d.i().size(), j = 0; j < size2; ++j) {
                    final Object z = ((o8h)g4d.i().get(j)).z();
                    l3d l3d;
                    if (z instanceof l3d) {
                        l3d = (l3d)z;
                    }
                    else {
                        l3d = null;
                    }
                    if (l3d != null) {
                        break Label_0147;
                    }
                }
                ++n5;
            }
            else {
                if (a.i()) {
                    this.e();
                    return;
                }
                break;
            }
        }
        final int c = this.c;
        final g4d g4d2 = (g4d)c86.I0((List)list);
        int index;
        if (g4d2 != null) {
            index = g4d2.getIndex();
        }
        else {
            index = 0;
        }
        this.c = index;
        long n6;
        if (b2) {
            n6 = ((long)i & 0xFFFFFFFFL);
        }
        else {
            n6 = (long)i << 32;
        }
        final boolean b6 = b3 || !b4;
        final Object[] b7 = a.b;
        final long[] a2 = a.a;
        final int n7 = a2.length - 2;
        umf d = this.d;
        long n10;
        if (n7 >= 0) {
            i = 0;
            while (true) {
                long n8 = a2[i];
                if ((~n8 << 7 & n8 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n9 = 8 - (~(i - n7) >>> 31);
                    for (int k = 0; k < n9; ++k) {
                        if ((n8 & 0xFFL) < 128L) {
                            d.a(b7[(i << 3) + k]);
                        }
                        n8 >>= 8;
                    }
                    n10 = n6;
                    if (n9 != 8) {
                        break;
                    }
                }
                n10 = n6;
                if (i == n7) {
                    break;
                }
                ++i;
            }
        }
        else {
            n10 = n6;
        }
        i = list.size();
        final int n11 = 0;
        long n12 = n10;
        final int n13 = c;
        int n14 = n11;
        ArrayList l = null;
        ArrayList f = null;
        ArrayList e = null;
    Label_0417:
        while (true) {
            l = this.i;
            f = this.f;
            e = this.e;
            if (n14 < i) {
                final g4d g4d3 = (g4d)list.get(n14);
                d.l(g4d3.getKey());
                final int size3 = g4d3.i().size();
                int n15 = 0;
                final ArrayList list2 = f;
                final ArrayList list3 = l;
                while (true) {
                    while (n15 < size3) {
                        final Object z2 = ((o8h)g4d3.i().get(n15)).z();
                        l3d l3d2;
                        if (z2 instanceof l3d) {
                            l3d2 = (l3d)z2;
                        }
                        else {
                            l3d2 = null;
                        }
                        if (l3d2 != null) {
                            final x3d x3d = (x3d)a.g(g4d3.getKey());
                            int c2;
                            if (b5 != null) {
                                c2 = b5.c(g4d3.getKey());
                            }
                            else {
                                c2 = -1;
                            }
                            final boolean b8 = c2 == -1 && b5 != null;
                            if (x3d == null) {
                                final x3d x3d2 = new x3d(this);
                                x3d.k(x3d2, g4d3, oc7, d6b, n4, h, b2);
                                a.m(g4d3.getKey(), (Object)x3d2);
                                if (g4d3.getIndex() != c2 && c2 != -1) {
                                    if (c2 < n13) {
                                        e.add((Object)g4d3);
                                    }
                                    else {
                                        list2.add((Object)g4d3);
                                    }
                                }
                                else {
                                    final long m = g4d3.k(0);
                                    long n16;
                                    if (b2) {
                                        n16 = (m & 0xFFFFFFFFL);
                                    }
                                    else {
                                        n16 = m >> 32;
                                    }
                                    c(g4d3, (int)n16, x3d2, b2);
                                    if (b8) {
                                        for (final v3d v3d : x3d2.a()) {
                                            if (v3d != null) {
                                                v3d.a();
                                            }
                                        }
                                    }
                                }
                            }
                            else {
                                final long n18 = n12;
                                if (b6) {
                                    final x3d x3d3 = x3d;
                                    x3d.k(x3d3, g4d3, oc7, d6b, n4, h, b2);
                                    final v3d[] a4 = x3d3.a();
                                    final int length2 = a4.length;
                                    int n19 = 0;
                                    n12 = n18;
                                    while (n19 < length2) {
                                        final v3d v3d2 = a4[n19];
                                        long n20;
                                        if (v3d2 != null) {
                                            final boolean b9 = ugc.b(v3d2.j(), 9223372034707292159L);
                                            n20 = n12;
                                            if (!b9) {
                                                v3d2.d(n12);
                                                n20 = n12;
                                            }
                                        }
                                        else {
                                            n20 = n12;
                                        }
                                        ++n19;
                                        n12 = n20;
                                    }
                                    if (b8) {
                                        for (final v3d v3d3 : x3d3.a()) {
                                            if (v3d3 != null) {
                                                if (v3d3.l()) {
                                                    list3.remove((Object)v3d3);
                                                    final xp8 j2 = this.j;
                                                    if (j2 != null) {
                                                        x90.z((bw8)j2);
                                                    }
                                                }
                                                v3d3.a();
                                            }
                                        }
                                    }
                                    this.g(g4d3, false);
                                }
                            }
                            ++n14;
                            continue Label_0417;
                        }
                        ++n15;
                    }
                    this.f(g4d3.getKey());
                    continue;
                }
            }
            break;
        }
        Object o = e;
        int[] array = new int[n3];
        if (b6 && b5 != null) {
            if (!((ArrayList)o).isEmpty()) {
                if (((ArrayList)o).size() > 1) {
                    g86.s0((List)o, (Comparator)new y3d(b5, (byte)2));
                }
                int size4;
                g4d g4d4;
                int h2;
                Object g;
                for (size4 = ((ArrayList)o).size(), i = 0; i < size4; ++i) {
                    g4d4 = (g4d)((ArrayList)o).get(i);
                    h2 = h(array, g4d4, b2);
                    g = a.g(g4d4.getKey());
                    g.getClass();
                    c(g4d4, n4 - h2, (x3d)g, b2);
                    this.g(g4d4, false);
                }
                iw0.T0(array, 0);
            }
            if (!f.isEmpty()) {
                if (f.size() > 1) {
                    g86.s0((List)f, (Comparator)new y3d(b5, (byte)0));
                }
                int size5;
                g4d g4d5;
                int h3;
                int s;
                Object g2;
                for (size5 = f.size(), i = 0; i < size5; ++i) {
                    g4d5 = (g4d)f.get(i);
                    h3 = h(array, g4d5, b2);
                    s = mlc.S(g4d5, b2);
                    g2 = a.g(g4d5.getKey());
                    g2.getClass();
                    c(g4d5, h3 + h - s, (x3d)g2, b2);
                    this.g(g4d5, false);
                }
                iw0.T0(array, 0);
            }
        }
        final Object[] b10 = d.b;
        final long[] a6 = d.a;
        int n22 = a6.length - 2;
        ArrayList h4 = this.h;
        ArrayList g3 = this.g;
        Object o3;
        ArrayList list8;
        umf umf2;
        ArrayList list9;
        int[] array3;
        ArrayList list10;
        if (n22 >= 0) {
            i = 0;
            ArrayList list4 = f;
            mlf mlf = b5;
            while (true) {
                long n23 = a6[i];
                ArrayList list6;
                ArrayList list7;
                mlf mlf2;
                Object o4;
                int n33;
                umf umf3;
                ArrayList list11;
                int[] array4;
                ArrayList list12;
                if ((~n23 << 7 & n23 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n24 = 8 - (~(i - n22) >>> 31);
                    int n25 = 0;
                Label_1902_Outer:
                    while (n25 < n24) {
                    Label_1902:
                        while (true) {
                            if ((n23 & 0xFFL) < 128L) {
                                final Object o2 = b10[(i << 3) + n25];
                                final x3d x3d4 = (x3d)a.g(o2);
                                if (x3d4 != null) {
                                    final int c3 = b.c(o2);
                                    x3d4.i(Math.min(n3, x3d4.g()));
                                    x3d4.h(Math.min(n3 - x3d4.g(), x3d4.d()));
                                    if (c3 == -1) {
                                        final v3d[] a7 = x3d4.a();
                                        final int length4 = a7.length;
                                        int n26 = 0;
                                        int n27 = 0;
                                        int n29;
                                        for (int n28 = 0; n26 < length4; ++n26, ++n28, n27 = n29) {
                                            final v3d v3d4 = a7[n26];
                                            n29 = n27;
                                            if (v3d4 != null) {
                                                if (!v3d4.l()) {
                                                    if (v3d4.k()) {
                                                        v3d4.n();
                                                        x3d4.a()[n28] = null;
                                                        l.remove((Object)v3d4);
                                                        final xp8 j3 = this.j;
                                                        n29 = n27;
                                                        if (j3 != null) {
                                                            x90.z((bw8)j3);
                                                            n29 = n27;
                                                        }
                                                        continue Label_1902_Outer;
                                                    }
                                                    else {
                                                        if (v3d4.f() != null) {
                                                            v3d4.b();
                                                        }
                                                        if (!v3d4.l()) {
                                                            v3d4.n();
                                                            x3d4.a()[n28] = null;
                                                            n29 = n27;
                                                            continue Label_1902_Outer;
                                                        }
                                                        l.add((Object)v3d4);
                                                        final xp8 j4 = this.j;
                                                        if (j4 != null) {
                                                            x90.z((bw8)j4);
                                                        }
                                                    }
                                                }
                                                n29 = 1;
                                            }
                                        }
                                        if (n27 == 0) {
                                            this.f(o2);
                                        }
                                    }
                                    else {
                                        final gv6 b11 = x3d4.b();
                                        b11.getClass();
                                        final g4d h5 = r1.h(c3, x3d4.d(), x3d4.g(), b11.a);
                                        h5.n();
                                        final v3d[] a8 = x3d4.a();
                                        final int length5 = a8.length;
                                        int n30 = 0;
                                        while (true) {
                                            while (n30 < length5) {
                                                final v3d v3d5 = a8[n30];
                                                if (v3d5 != null && v3d5.m()) {
                                                    x3d4.j(h5, oc7, d6b, n4, h, x3d4.c());
                                                    if (c3 < this.c) {
                                                        g3.add((Object)h5);
                                                        break Label_1902;
                                                    }
                                                    h4.add((Object)h5);
                                                    break Label_1902;
                                                }
                                                else {
                                                    ++n30;
                                                }
                                            }
                                            if (mlf == null || c3 != mlf.c(o2)) {
                                                continue Label_1902_Outer;
                                            }
                                            break;
                                        }
                                        this.f(o2);
                                    }
                                }
                            }
                            n23 >>= 8;
                            ++n25;
                            continue Label_1902_Outer;
                            continue Label_1902;
                        }
                    }
                    final umf umf = d;
                    final ArrayList list5 = (ArrayList)o;
                    final int[] array2 = array;
                    final int n31 = n22;
                    list6 = g3;
                    list7 = list4;
                    mlf2 = mlf;
                    final int n32 = i;
                    o3 = h4;
                    list8 = list6;
                    umf2 = umf;
                    list9 = list7;
                    array3 = array2;
                    list10 = list5;
                    if (n24 != 8) {
                        break;
                    }
                    o4 = h4;
                    i = n31;
                    n33 = n32;
                    umf3 = umf;
                    list11 = l;
                    array4 = array2;
                    list12 = list5;
                }
                else {
                    final Collection collection = (Collection)h4;
                    list11 = l;
                    list12 = (ArrayList)o;
                    array4 = array;
                    list7 = list4;
                    umf3 = d;
                    mlf2 = mlf;
                    n33 = i;
                    i = n22;
                    list6 = g3;
                    o4 = collection;
                }
                o3 = o4;
                list8 = list6;
                umf2 = umf3;
                list9 = list7;
                array3 = array4;
                list10 = list12;
                if (n33 == i) {
                    break;
                }
                ++n33;
                final ArrayList list13 = list12;
                final Collection collection2 = (Collection)o4;
                g3 = list6;
                l = list11;
                final ArrayList list14 = list7;
                d = umf3;
                o = list13;
                array = array4;
                h4 = (ArrayList)collection2;
                n22 = i;
                i = n33;
                mlf = mlf2;
                list4 = list14;
            }
        }
        else {
            list9 = f;
            list10 = (ArrayList)o;
            array3 = array;
            umf2 = d;
            list8 = g3;
            o3 = h4;
        }
        int[] array5;
        if (!list8.isEmpty()) {
            if (list8.size() > 1) {
                g86.s0((List)list8, (Comparator)new y3d(b, (byte)3));
            }
            g4d g4d6;
            Object g4;
            x3d x3d5;
            long k2;
            long n34;
            for (n4 = list8.size(), i = 0; i < n4; ++i) {
                g4d6 = (g4d)list8.get(i);
                g4 = a.g(g4d6.getKey());
                g4.getClass();
                x3d5 = (x3d)g4;
                h = h(array3, g4d6, b2);
                if (b3) {
                    k2 = ((g4d)c86.G0((List)list)).k(0);
                    if (b2) {
                        n34 = (k2 & 0xFFFFFFFFL);
                    }
                    else {
                        n34 = k2 >> 32;
                    }
                    n3 = (int)n34;
                }
                else {
                    n3 = x3d5.f();
                }
                g4d6.e(n3 - h, x3d5.c(), n, n2);
                if (b6) {
                    this.g(g4d6, true);
                }
            }
            array5 = array3;
            iw0.T0(array5, 0);
        }
        else {
            array5 = array3;
        }
        if (!((ArrayList)o3).isEmpty()) {
            if (((ArrayList)o3).size() > 1) {
                g86.s0((List)o3, (Comparator)new y3d(b, (byte)1));
            }
            g4d g4d7;
            Object g5;
            x3d x3d6;
            for (n3 = ((ArrayList)o3).size(), i = 0; i < n3; ++i) {
                g4d7 = (g4d)((ArrayList)o3).get(i);
                g5 = a.g(g4d7.getKey());
                g5.getClass();
                x3d6 = (x3d)g5;
                n4 = h(array5, g4d7, b2);
                g4d7.e(x3d6.e() - mlc.S(g4d7, b2) + n4, x3d6.c(), n, n2);
                if (b6) {
                    this.g(g4d7, true);
                }
            }
        }
        Collections.reverse((List)list8);
        list.addAll(0, (Collection)list8);
        list.addAll((Collection)o3);
        list10.clear();
        list9.clear();
        list8.clear();
        ((ArrayList)o3).clear();
        umf2.b();
    }
    
    public final void e() {
        final tmf a = this.a;
        if (a.j()) {
            final Object[] c = a.c;
            final long[] a2 = a.a;
            final int n = a2.length - 2;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    long n3 = a2[n2];
                    if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n4 = 8 - (~(n2 - n) >>> 31);
                        for (int i = 0; i < n4; ++i) {
                            if ((0xFFL & n3) < 128L) {
                                for (final v3d v3d : ((x3d)c[(n2 << 3) + i]).a()) {
                                    if (v3d != null) {
                                        v3d.n();
                                    }
                                }
                            }
                            n3 >>= 8;
                        }
                        if (n4 != 8) {
                            break;
                        }
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
            a.a();
        }
    }
    
    public final void f(final Object o) {
        final x3d x3d = (x3d)this.a.k(o);
        if (x3d != null) {
            for (final v3d v3d : x3d.a()) {
                if (v3d != null) {
                    v3d.n();
                }
            }
        }
    }
    
    public final void g(final g4d g4d, final boolean b) {
        final Object g = this.a.g(g4d.getKey());
        g.getClass();
        final v3d[] a = ((x3d)g).a();
        for (int length = a.length, i = 0, n = 0; i < length; ++i, ++n) {
            final v3d v3d = a[i];
            if (v3d != null) {
                final long k = g4d.k(n);
                final long j = v3d.j();
                if (!ugc.b(j, 9223372034707292159L) && !ugc.b(j, k)) {
                    v3d.c(ugc.c(k, j), b);
                }
                v3d.r(k);
            }
        }
    }
}
