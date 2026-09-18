import java.util.Collection;
import java.util.Map;
import java.util.List;

public final class fjg implements moe
{
    public final lta a;
    public final boolean b;
    public final riq c;
    public final oin d;
    public final oin e;
    public final oin f;
    public final dng g;
    public final float h;
    
    public fjg(final lta a, final boolean b, final riq c, final oin d, final oin e, final oin f, final dng g, final float h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static final int j(final int n, final fjg fjg, int w, int round, final o8h o8h, final o8h o8h2) {
        if (fjg.b) {
            round = Math.round((w - o8h2.w) / 2.0f * 1.0f);
        }
        if (o8h != null) {
            w = o8h.w;
        }
        else {
            w = 0;
        }
        return Math.max(n + round, w / 2);
    }
    
    public final int a(final flc flc, final List list, final int n) {
        return this.i(flc, list, n, (zta)new v6e((byte)21));
    }
    
    public final noe b(final ooe ooe, final List list, final long n) {
        final float a = this.d.a();
        final dng g = this.g;
        final int l0 = ((xc8)ooe).L0(g.a());
        final long b = gv6.b(n, 0, 0, 0, 0, 10);
        while (true) {
            for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                final Object value = list.get(i);
                if (mlc.q(ao2.O((goe)value), (Object)"Leading")) {
                    final goe goe = (goe)value;
                    o8h u;
                    if (goe != null) {
                        u = goe.u(b);
                    }
                    else {
                        u = null;
                    }
                    int v;
                    if (u != null) {
                        v = u.v;
                    }
                    else {
                        v = 0;
                    }
                    int w;
                    if (u != null) {
                        w = u.w;
                    }
                    else {
                        w = 0;
                    }
                    final int max = Math.max(0, w);
                    while (true) {
                        for (int size2 = ((Collection)list).size(), j = 0; j < size2; ++j) {
                            final Object value2 = list.get(j);
                            if (mlc.q(ao2.O((goe)value2), (Object)"Trailing")) {
                                final goe goe2 = (goe)value2;
                                o8h u2;
                                if (goe2 != null) {
                                    u2 = goe2.u(hv6.j(-v, 0, 2, b));
                                }
                                else {
                                    u2 = null;
                                }
                                int v2;
                                if (u2 != null) {
                                    v2 = u2.v;
                                }
                                else {
                                    v2 = 0;
                                }
                                final int n2 = v + v2;
                                int w2;
                                if (u2 != null) {
                                    w2 = u2.w;
                                }
                                else {
                                    w2 = 0;
                                }
                                final int max2 = Math.max(max, w2);
                                while (true) {
                                    for (int size3 = ((Collection)list).size(), k = 0; k < size3; ++k) {
                                        final Object value3 = list.get(k);
                                        if (mlc.q(ao2.O((goe)value3), (Object)"Prefix")) {
                                            final goe goe3 = (goe)value3;
                                            o8h u3;
                                            if (goe3 != null) {
                                                u3 = goe3.u(hv6.j(-n2, 0, 2, b));
                                            }
                                            else {
                                                u3 = null;
                                            }
                                            int v3;
                                            if (u3 != null) {
                                                v3 = u3.v;
                                            }
                                            else {
                                                v3 = 0;
                                            }
                                            final int n3 = n2 + v3;
                                            int w3;
                                            if (u3 != null) {
                                                w3 = u3.w;
                                            }
                                            else {
                                                w3 = 0;
                                            }
                                            final int max3 = Math.max(max2, w3);
                                            while (true) {
                                                for (int size4 = ((Collection)list).size(), n4 = 0; n4 < size4; ++n4) {
                                                    final Object value4 = list.get(n4);
                                                    if (mlc.q(ao2.O((goe)value4), (Object)"Suffix")) {
                                                        final goe goe4 = (goe)value4;
                                                        o8h u4;
                                                        if (goe4 != null) {
                                                            u4 = goe4.u(hv6.j(-n3, 0, 2, b));
                                                        }
                                                        else {
                                                            u4 = null;
                                                        }
                                                        int v4;
                                                        if (u4 != null) {
                                                            v4 = u4.v;
                                                        }
                                                        else {
                                                            v4 = 0;
                                                        }
                                                        final int n5 = n3 + v4;
                                                        int w4;
                                                        if (u4 != null) {
                                                            w4 = u4.w;
                                                        }
                                                        else {
                                                            w4 = 0;
                                                        }
                                                        final int max4 = Math.max(max3, w4);
                                                        while (true) {
                                                            for (int size5 = ((Collection)list).size(), n6 = 0; n6 < size5; ++n6) {
                                                                final Object value5 = list.get(n6);
                                                                if (mlc.q(ao2.O((goe)value5), (Object)"Label")) {
                                                                    final goe goe5 = (goe)value5;
                                                                    final Object o = new Object();
                                                                    final int n7 = ((xc8)ooe).L0(g.c(((flc)ooe).getLayoutDirection())) + ((xc8)ooe).L0(g.b(((flc)ooe).getLayoutDirection()));
                                                                    final int n8 = -vt4.U(a, n5 + n7, n7);
                                                                    final int n9 = -l0;
                                                                    final long m = hv6.i(n8, b, n9);
                                                                    o8h u5;
                                                                    if (goe5 != null) {
                                                                        u5 = goe5.u(m);
                                                                    }
                                                                    else {
                                                                        u5 = null;
                                                                    }
                                                                    ((b4j)o).v = u5;
                                                                    long n10;
                                                                    if (u5 != null) {
                                                                        n10 = (((long)Float.floatToRawIntBits((float)u5.w) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits((float)u5.v) << 32);
                                                                    }
                                                                    else {
                                                                        n10 = 0L;
                                                                    }
                                                                    this.a.b((Object)new yzl(n10));
                                                                    while (true) {
                                                                        for (int size6 = ((Collection)list).size(), n11 = 0; n11 < size6; ++n11) {
                                                                            final Object value6 = list.get(n11);
                                                                            if (mlc.q(ao2.O((goe)value6), (Object)"Supporting")) {
                                                                                final goe goe6 = (goe)value6;
                                                                                int q;
                                                                                if (goe6 != null) {
                                                                                    q = goe6.Q(gv6.k(n));
                                                                                }
                                                                                else {
                                                                                    q = 0;
                                                                                }
                                                                                final o8h o8h = (o8h)((b4j)o).v;
                                                                                int w5;
                                                                                if (o8h != null) {
                                                                                    w5 = o8h.w;
                                                                                }
                                                                                else {
                                                                                    w5 = 0;
                                                                                }
                                                                                final int max5 = Math.max(w5 / 2, ((xc8)ooe).L0(g.d()));
                                                                                final long b2 = gv6.b(hv6.i(-n5, n, n9 - max5 - q), 0, 0, 0, 0, 11);
                                                                                final int size7 = ((Collection)list).size();
                                                                                int n12 = 0;
                                                                                final int n13 = max5;
                                                                                final goe goe7 = goe6;
                                                                                while (n12 < size7) {
                                                                                    final goe goe8 = (goe)list.get(n12);
                                                                                    if (mlc.q(ao2.O(goe8), (Object)"TextField")) {
                                                                                        final o8h u6 = goe8.u(b2);
                                                                                        final long b3 = gv6.b(b2, 0, 0, 0, 0, 14);
                                                                                        while (true) {
                                                                                            for (int size8 = ((Collection)list).size(), n14 = 0; n14 < size8; ++n14) {
                                                                                                final Object value7 = list.get(n14);
                                                                                                if (mlc.q(ao2.O((goe)value7), (Object)"Hint")) {
                                                                                                    final goe goe9 = (goe)value7;
                                                                                                    final goe goe10 = goe9;
                                                                                                    o8h u7;
                                                                                                    if (goe10 != null) {
                                                                                                        u7 = goe10.u(b3);
                                                                                                    }
                                                                                                    else {
                                                                                                        u7 = null;
                                                                                                    }
                                                                                                    final int w6 = u6.w;
                                                                                                    int w7;
                                                                                                    if (u7 != null) {
                                                                                                        w7 = u7.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w7 = 0;
                                                                                                    }
                                                                                                    final int max6 = Math.max(max4, Math.max(w6, w7) + n13 + l0);
                                                                                                    int v5;
                                                                                                    if (u != null) {
                                                                                                        v5 = u.v;
                                                                                                    }
                                                                                                    else {
                                                                                                        v5 = 0;
                                                                                                    }
                                                                                                    int v6;
                                                                                                    if (u2 != null) {
                                                                                                        v6 = u2.v;
                                                                                                    }
                                                                                                    else {
                                                                                                        v6 = 0;
                                                                                                    }
                                                                                                    int v7;
                                                                                                    if (u3 != null) {
                                                                                                        v7 = u3.v;
                                                                                                    }
                                                                                                    else {
                                                                                                        v7 = 0;
                                                                                                    }
                                                                                                    int v8;
                                                                                                    if (u4 != null) {
                                                                                                        v8 = u4.v;
                                                                                                    }
                                                                                                    else {
                                                                                                        v8 = 0;
                                                                                                    }
                                                                                                    final int v9 = u6.v;
                                                                                                    final o8h o8h2 = (o8h)((b4j)o).v;
                                                                                                    int v10;
                                                                                                    if (o8h2 != null) {
                                                                                                        v10 = o8h2.v;
                                                                                                    }
                                                                                                    else {
                                                                                                        v10 = 0;
                                                                                                    }
                                                                                                    int v11;
                                                                                                    if (u7 != null) {
                                                                                                        v11 = u7.v;
                                                                                                    }
                                                                                                    else {
                                                                                                        v11 = 0;
                                                                                                    }
                                                                                                    final int g2 = this.g((xc8)ooe, v5, v6, v7, v8, v9, v10, v11, n, a);
                                                                                                    final long b4 = gv6.b(hv6.j(0, -max6, 1, b), 0, g2, 0, 0, 9);
                                                                                                    o8h u8;
                                                                                                    if (goe7 != null) {
                                                                                                        u8 = goe7.u(b4);
                                                                                                    }
                                                                                                    else {
                                                                                                        u8 = null;
                                                                                                    }
                                                                                                    int w8;
                                                                                                    if (u8 != null) {
                                                                                                        w8 = u8.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w8 = 0;
                                                                                                    }
                                                                                                    int w9;
                                                                                                    if (u != null) {
                                                                                                        w9 = u.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w9 = 0;
                                                                                                    }
                                                                                                    int w10;
                                                                                                    if (u2 != null) {
                                                                                                        w10 = u2.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w10 = 0;
                                                                                                    }
                                                                                                    int w11;
                                                                                                    if (u3 != null) {
                                                                                                        w11 = u3.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w11 = 0;
                                                                                                    }
                                                                                                    int w12;
                                                                                                    if (u4 != null) {
                                                                                                        w12 = u4.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w12 = 0;
                                                                                                    }
                                                                                                    final int w13 = u6.w;
                                                                                                    final o8h o8h3 = (o8h)((b4j)o).v;
                                                                                                    int w14;
                                                                                                    if (o8h3 != null) {
                                                                                                        w14 = o8h3.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w14 = 0;
                                                                                                    }
                                                                                                    int w15;
                                                                                                    if (u7 != null) {
                                                                                                        w15 = u7.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w15 = 0;
                                                                                                    }
                                                                                                    int w16;
                                                                                                    if (u8 != null) {
                                                                                                        w16 = u8.w;
                                                                                                    }
                                                                                                    else {
                                                                                                        w16 = 0;
                                                                                                    }
                                                                                                    final int f = this.f((xc8)ooe, w9, w10, w11, w12, w13, w14, w15, w16, n, a);
                                                                                                    final int n15 = f - w8;
                                                                                                    final int size9 = ((Collection)list).size();
                                                                                                    final int n16 = 0;
                                                                                                    final int n17 = f;
                                                                                                    for (int n18 = n16; n18 < size9; ++n18) {
                                                                                                        final goe goe11 = (goe)list.get(n18);
                                                                                                        if (mlc.q(ao2.O(goe11), (Object)"Container")) {
                                                                                                            int n19;
                                                                                                            if (g2 != Integer.MAX_VALUE) {
                                                                                                                n19 = g2;
                                                                                                            }
                                                                                                            else {
                                                                                                                n19 = 0;
                                                                                                            }
                                                                                                            int n20;
                                                                                                            if (n15 != Integer.MAX_VALUE) {
                                                                                                                n20 = n15;
                                                                                                            }
                                                                                                            else {
                                                                                                                n20 = 0;
                                                                                                            }
                                                                                                            return ooe.Y(g2, n17, (Map)s89.v, (lta)new djg(this, n17, g2, u, u2, u3, u4, u6, (b4j)o, u7, goe11.u(hv6.a(n19, g2, n20, n15)), u8, ooe, a));
                                                                                                        }
                                                                                                    }
                                                                                                    ald.b("Collection contains no element matching the predicate.");
                                                                                                    ebq.a();
                                                                                                    return null;
                                                                                                }
                                                                                            }
                                                                                            final goe goe9 = null;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                    ++n12;
                                                                                }
                                                                                ald.b("Collection contains no element matching the predicate.");
                                                                                ebq.a();
                                                                                return null;
                                                                            }
                                                                        }
                                                                        final Object value6 = null;
                                                                        continue;
                                                                    }
                                                                }
                                                            }
                                                            final Object value5 = null;
                                                            continue;
                                                        }
                                                    }
                                                }
                                                final Object value4 = null;
                                                continue;
                                            }
                                        }
                                    }
                                    final Object value3 = null;
                                    continue;
                                }
                            }
                        }
                        final Object value2 = null;
                        continue;
                    }
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public final int c(final flc flc, final List list, final int n) {
        return this.i(flc, list, n, (zta)new v6e((byte)20));
    }
    
    public final int d(final flc flc, final List list, final int n) {
        return this.h(flc, list, n, (zta)new v6e((byte)23));
    }
    
    public final int e(final flc flc, final List list, final int n) {
        return this.h(flc, list, n, (zta)new v6e((byte)22));
    }
    
    public final int f(final xc8 xc8, final int n, final int n2, final int n3, final int n4, int i, final int n5, final int n6, final int n7, final long n8, float t) {
        final int n9 = 0;
        final int u = vt4.U(t, n5, 0);
        int max = i;
        for (i = n9; i < 4; ++i) {
            max = Math.max(max, (new int[] { n6, n3, n4, u })[i]);
        }
        final dng g = this.g;
        final float w0 = xc8.w0(g.d());
        t = vt4.T(w0, Math.max(w0, n5 / 2.0f), t);
        return hv6.f(Math.max(n, Math.max(n2, k8e.H(t + max + xc8.w0(g.a())))) + n7, n8);
    }
    
    public final int g(final xc8 xc8, final int n, final int n2, int max, final int n3, final int n4, final int n5, final int n6, final long n7, final float n8) {
        max += n3;
        max = Math.max(n4 + max, Math.max(n6 + max, vt4.U(n8, n5, 0)));
        final dng g = this.g;
        final qzc v = qzc.v;
        return hv6.g(Math.max(max + n + n2, k8e.H((n5 + xc8.w0(g.c(v) + g.b(v))) * n8)), n7);
    }
    
    public final int h(final flc flc, final List list, int intValue, final zta zta) {
        final float a = this.d.a();
        while (true) {
            for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                final Object value = list.get(i);
                if (mlc.q(rdr.g((goe)value), (Object)"Leading")) {
                    final goe goe = (goe)value;
                    int n;
                    int intValue2;
                    if (goe != null) {
                        n = rdr.i(intValue, goe.s(Integer.MAX_VALUE));
                        intValue2 = ((Number)zta.d((Object)goe, (Object)intValue)).intValue();
                    }
                    else {
                        n = intValue;
                        intValue2 = 0;
                    }
                    while (true) {
                        for (int size2 = ((Collection)list).size(), j = 0; j < size2; ++j) {
                            final Object value2 = list.get(j);
                            if (mlc.q(rdr.g((goe)value2), (Object)"Trailing")) {
                                final goe goe2 = (goe)value2;
                                int intValue3;
                                if (goe2 != null) {
                                    n = rdr.i(n, goe2.s(Integer.MAX_VALUE));
                                    intValue3 = ((Number)zta.d((Object)goe2, (Object)intValue)).intValue();
                                }
                                else {
                                    intValue3 = 0;
                                }
                                while (true) {
                                    for (int size3 = ((Collection)list).size(), k = 0; k < size3; ++k) {
                                        final Object value3 = list.get(k);
                                        if (mlc.q(rdr.g((goe)value3), (Object)"Label")) {
                                            final goe goe3 = (goe)value3;
                                            int intValue4;
                                            if (goe3 != null) {
                                                intValue4 = ((Number)zta.d((Object)goe3, (Object)vt4.U(a, n, intValue))).intValue();
                                            }
                                            else {
                                                intValue4 = 0;
                                            }
                                            while (true) {
                                                for (int size4 = ((Collection)list).size(), l = 0; l < size4; ++l) {
                                                    final Object value4 = list.get(l);
                                                    if (mlc.q(rdr.g((goe)value4), (Object)"Prefix")) {
                                                        final goe goe4 = (goe)value4;
                                                        int intValue5;
                                                        if (goe4 != null) {
                                                            intValue5 = ((Number)zta.d((Object)goe4, (Object)n)).intValue();
                                                            n = rdr.i(n, goe4.s(Integer.MAX_VALUE));
                                                        }
                                                        else {
                                                            intValue5 = 0;
                                                        }
                                                        while (true) {
                                                            for (int size5 = ((Collection)list).size(), n2 = 0; n2 < size5; ++n2) {
                                                                final Object value5 = list.get(n2);
                                                                if (mlc.q(rdr.g((goe)value5), (Object)"Suffix")) {
                                                                    final goe goe5 = (goe)value5;
                                                                    int m;
                                                                    int n3;
                                                                    if (goe5 != null) {
                                                                        final int intValue6 = ((Number)zta.d((Object)goe5, (Object)n)).intValue();
                                                                        m = rdr.i(n, goe5.s(Integer.MAX_VALUE));
                                                                        n3 = intValue6;
                                                                    }
                                                                    else {
                                                                        final int n4 = 0;
                                                                        m = n;
                                                                        n3 = n4;
                                                                    }
                                                                    for (int size6 = ((Collection)list).size(), n5 = 0; n5 < size6; ++n5) {
                                                                        final Object value6 = list.get(n5);
                                                                        if (mlc.q(rdr.g((goe)value6), (Object)"TextField")) {
                                                                            final int intValue7 = ((Number)zta.d(value6, (Object)m)).intValue();
                                                                            while (true) {
                                                                                for (int size7 = ((Collection)list).size(), n6 = 0; n6 < size7; ++n6) {
                                                                                    final Object value7 = list.get(n6);
                                                                                    if (mlc.q(rdr.g((goe)value7), (Object)"Hint")) {
                                                                                        final goe goe6 = (goe)value7;
                                                                                        int intValue8;
                                                                                        if (goe6 != null) {
                                                                                            intValue8 = ((Number)zta.d((Object)goe6, (Object)m)).intValue();
                                                                                        }
                                                                                        else {
                                                                                            intValue8 = 0;
                                                                                        }
                                                                                        while (true) {
                                                                                            for (int size8 = ((Collection)list).size(), n7 = 0; n7 < size8; ++n7) {
                                                                                                final Object value8 = list.get(n7);
                                                                                                if (mlc.q(rdr.g((goe)value8), (Object)"Supporting")) {
                                                                                                    final goe goe7 = (goe)value8;
                                                                                                    final goe goe8 = goe7;
                                                                                                    if (goe8 != null) {
                                                                                                        intValue = ((Number)zta.d((Object)goe8, (Object)intValue)).intValue();
                                                                                                    }
                                                                                                    else {
                                                                                                        intValue = 0;
                                                                                                    }
                                                                                                    return this.f((xc8)flc, intValue2, intValue3, intValue5, n3, intValue7, intValue4, intValue8, intValue, hv6.b(0, 0, 0, 0, 15), a);
                                                                                                }
                                                                                            }
                                                                                            final goe goe7 = null;
                                                                                            continue;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                final Object value7 = null;
                                                                                continue;
                                                                            }
                                                                        }
                                                                    }
                                                                    ald.b("Collection contains no element matching the predicate.");
                                                                    ebq.a();
                                                                    return 0;
                                                                }
                                                            }
                                                            final Object value5 = null;
                                                            continue;
                                                        }
                                                    }
                                                }
                                                final Object value4 = null;
                                                continue;
                                            }
                                        }
                                    }
                                    final Object value3 = null;
                                    continue;
                                }
                            }
                        }
                        final Object value2 = null;
                        continue;
                    }
                }
            }
            final Object value = null;
            continue;
        }
    }
    
    public final int i(final flc flc, final List list, int intValue, final zta zta) {
        for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
            final Object value = list.get(i);
            if (mlc.q(rdr.g((goe)value), (Object)"TextField")) {
                final int intValue2 = ((Number)zta.d(value, (Object)intValue)).intValue();
                final int size2 = ((Collection)list).size();
                int n = 0;
                goe goe;
                Object value2;
                while (true) {
                    goe = null;
                    if (n >= size2) {
                        value2 = null;
                        break;
                    }
                    value2 = list.get(n);
                    if (mlc.q(rdr.g((goe)value2), (Object)"Label")) {
                        break;
                    }
                    ++n;
                }
                final goe goe2 = (goe)value2;
                int intValue3;
                if (goe2 != null) {
                    intValue3 = ((Number)zta.d((Object)goe2, (Object)intValue)).intValue();
                }
                else {
                    intValue3 = 0;
                }
                while (true) {
                    for (int size3 = ((Collection)list).size(), j = 0; j < size3; ++j) {
                        final Object value3 = list.get(j);
                        if (mlc.q(rdr.g((goe)value3), (Object)"Trailing")) {
                            final goe goe3 = (goe)value3;
                            int intValue4;
                            if (goe3 != null) {
                                intValue4 = ((Number)zta.d((Object)goe3, (Object)intValue)).intValue();
                            }
                            else {
                                intValue4 = 0;
                            }
                            while (true) {
                                for (int size4 = ((Collection)list).size(), k = 0; k < size4; ++k) {
                                    final Object value4 = list.get(k);
                                    if (mlc.q(rdr.g((goe)value4), (Object)"Leading")) {
                                        final goe goe4 = (goe)value4;
                                        int intValue5;
                                        if (goe4 != null) {
                                            intValue5 = ((Number)zta.d((Object)goe4, (Object)intValue)).intValue();
                                        }
                                        else {
                                            intValue5 = 0;
                                        }
                                        while (true) {
                                            for (int size5 = ((Collection)list).size(), l = 0; l < size5; ++l) {
                                                final Object value5 = list.get(l);
                                                if (mlc.q(rdr.g((goe)value5), (Object)"Prefix")) {
                                                    final goe goe5 = (goe)value5;
                                                    int intValue6;
                                                    if (goe5 != null) {
                                                        intValue6 = ((Number)zta.d((Object)goe5, (Object)intValue)).intValue();
                                                    }
                                                    else {
                                                        intValue6 = 0;
                                                    }
                                                    while (true) {
                                                        for (int size6 = ((Collection)list).size(), n2 = 0; n2 < size6; ++n2) {
                                                            final Object value6 = list.get(n2);
                                                            if (mlc.q(rdr.g((goe)value6), (Object)"Suffix")) {
                                                                final goe goe6 = (goe)value6;
                                                                int intValue7;
                                                                if (goe6 != null) {
                                                                    intValue7 = ((Number)zta.d((Object)goe6, (Object)intValue)).intValue();
                                                                }
                                                                else {
                                                                    intValue7 = 0;
                                                                }
                                                                final int size7 = ((Collection)list).size();
                                                                int n3 = 0;
                                                                Object value7;
                                                                while (true) {
                                                                    value7 = goe;
                                                                    if (n3 >= size7) {
                                                                        break;
                                                                    }
                                                                    value7 = list.get(n3);
                                                                    if (mlc.q(rdr.g((goe)value7), (Object)"Hint")) {
                                                                        break;
                                                                    }
                                                                    ++n3;
                                                                }
                                                                final goe goe7 = (goe)value7;
                                                                if (goe7 != null) {
                                                                    intValue = ((Number)zta.d((Object)goe7, (Object)intValue)).intValue();
                                                                }
                                                                else {
                                                                    intValue = 0;
                                                                }
                                                                return this.g((xc8)flc, intValue5, intValue4, intValue6, intValue7, intValue2, intValue3, intValue, hv6.b(0, 0, 0, 0, 15), this.d.a());
                                                            }
                                                        }
                                                        final Object value6 = null;
                                                        continue;
                                                    }
                                                }
                                            }
                                            final Object value5 = null;
                                            continue;
                                        }
                                    }
                                }
                                final Object value4 = null;
                                continue;
                            }
                        }
                    }
                    final Object value3 = null;
                    continue;
                }
            }
        }
        ald.b("Collection contains no element matching the predicate.");
        ebq.a();
        return 0;
    }
}
