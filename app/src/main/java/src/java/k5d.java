import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public final class k5d implements e4d
{
    public final v5d a;
    public final boolean b;
    public final dng c;
    public final boolean d;
    public final jta e;
    public final jv0 f;
    public final gv0 g;
    public final oc7 h;
    public final d6b i;
    public final def j;
    public final dx k;
    public final lb2 l;
    
    public k5d(final v5d a, final boolean b, final dng c, final boolean d, final ytc e, final jv0 f, final gv0 g, final oc7 h, final d6b i, final def j, final dx k, final lb2 l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (jta)e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    @Override
    public final noe a(final f4d f4d, final long n) {
        final g1n w = f4d.w;
        final v5d a = this.a;
        ((xom)a.t).getValue();
        final boolean b = a.b || ((flc)w).r0();
        zhg w2 = zhg.w;
        zhg v = zhg.v;
        final boolean b2 = this.b;
        zhg zhg;
        if (b2) {
            zhg = v;
        }
        else {
            zhg = w2;
        }
        eqi.S(n, zhg);
        final dng c = this.c;
        int n2;
        if (b2) {
            n2 = ((xc8)w).L0(c.b(((flc)w).getLayoutDirection()));
        }
        else {
            n2 = ((xc8)w).L0(omo.z(c, ((flc)w).getLayoutDirection()));
        }
        int n3;
        if (b2) {
            n3 = ((xc8)w).L0(c.c(((flc)w).getLayoutDirection()));
        }
        else {
            n3 = ((xc8)w).L0(omo.y(c, ((flc)w).getLayoutDirection()));
        }
        final int l0 = ((xc8)w).L0(c.d());
        int l2 = ((xc8)w).L0(c.a());
        final int n4 = l0 + l2;
        final int n5 = n2 + n3;
        int n6;
        if (b2) {
            n6 = n4;
        }
        else {
            n6 = n5;
        }
        final boolean d = this.d;
        if (b2 && !d) {
            l2 = l0;
        }
        else if (!b2 || !d) {
            if (!b2 && !d) {
                l2 = n2;
            }
            else {
                l2 = n3;
            }
        }
        final int n7 = n6 - l2;
        final long i = hv6.i(-n5, n, -n4);
        final d5d d5d = (d5d)this.e.a();
        final j3d c2 = d5d.c;
        final int j = gv6.i(i);
        final int h = gv6.h(i);
        c2.a.i(j);
        c2.b.i(h);
        final gv0 g = this.g;
        final jv0 f = this.f;
        float n8;
        if (b2) {
            if (f == null) {
                throw hia.s("null verticalArrangement when isVertical == true");
            }
            n8 = f.d();
        }
        else {
            if (g == null) {
                throw hia.s("null horizontalAlignment when isVertical == false");
            }
            n8 = g.d();
        }
        final int l3 = ((xc8)w).L0(n8);
        final int a2 = d5d.a();
        int n9;
        if (b2) {
            n9 = gv6.h(n) - n4;
        }
        else {
            n9 = gv6.i(n) - n5;
        }
        final boolean d2 = this.d;
        int d3 = n2;
        int n10 = l0;
        if (d2) {
            if (n9 > 0) {
                d3 = n2;
                n10 = l0;
            }
            else {
                if (!b2) {
                    n2 += n9;
                }
                d3 = n2;
                n10 = l0;
                if (b2) {
                    n10 = l0 + n9;
                    d3 = n2;
                }
            }
        }
        final j5d j5d = new j5d(i, this.b, d5d, f4d, a2, l3, this.k, this.l, d2, l2, n7, (long)d3 << 32 | ((long)n10 & 0xFFFFFFFFL), this.a);
        final d5d x = j5d.x;
        final mlf d4 = x.d;
        final r7m a3 = q7m.a();
        lta e;
        if (a3 != null) {
            e = a3.e();
        }
        else {
            e = null;
        }
        final r7m b3 = q7m.b(a3);
        Label_4160: {
            gb0 e2;
            try {
                e2 = a.e;
                final int h2 = ((hsg)e2.w).h();
                d3 = ri2.D(h2, (c4d)d5d, e2.y);
                if (h2 != d3) {
                    ((hsg)e2.w).i(d3);
                    ((h4d)e2.z).a(h2);
                }
            }
            finally {
                break Label_4160;
            }
            int h3 = ((hsg)e2.x).h();
            q7m.d(a3, b3, e);
            final ilf r = ljq.r((c4d)d5d, a.s, a.p);
            float n11;
            if (!((flc)w).r0() && b) {
                n11 = ((Number)((dg0)a.x.x).w.getValue()).floatValue();
            }
            else {
                n11 = a.h;
            }
            final z3d o = a.o;
            final boolean r2 = ((flc)w).r0();
            final bnf w3 = a.w;
            final boolean k = a.i;
            if (l2 < 0) {
                jac.a("invalid beforeContentPadding");
            }
            if (n7 < 0) {
                jac.a("invalid afterContentPadding");
            }
            final s89 v2 = s89.v;
            final boolean b4 = this.b;
            final boolean d5 = this.d;
            final oc7 h4 = this.h;
            final d6b m = this.i;
            final r89 v3 = r89.v;
            l5d l5d = null;
            Label_4137: {
                final xc8 xc8;
                if (a2 > 0) {
                    final int n12 = n9;
                    int n13;
                    if ((n13 = d3) >= a2) {
                        n13 = a2 - 1;
                        h3 = 0;
                    }
                    final int round = Math.round(n11);
                    int n15;
                    final int n14 = n15 = h3 - round;
                    int n16 = round;
                    if (n13 == 0) {
                        n15 = n14;
                        n16 = round;
                        if (n14 < 0) {
                            n16 = round + n14;
                            n15 = 0;
                        }
                    }
                    final pv0 pv0 = new pv0();
                    final int n17 = -l2;
                    int n18;
                    if (l3 < 0) {
                        n18 = l3;
                    }
                    else {
                        n18 = 0;
                    }
                    final int n19 = n17 + n18;
                    int n20 = n15 + n19;
                    int max = 0;
                    long z;
                    while (true) {
                        z = j5d.z;
                        if (n20 >= 0 || n13 <= 0) {
                            break;
                        }
                        --n13;
                        final m5d r3 = j5d.r(n13, z);
                        pv0.add(0, (Object)r3);
                        max = Math.max(max, r3.v);
                        n20 += r3.b();
                    }
                    final int n21 = 0;
                    int n22 = n20;
                    int n23 = n16;
                    if (n20 < n19) {
                        n23 = n16 - (n19 - n20);
                        n22 = n19;
                    }
                    final int n24 = n22 - n19;
                    final int n25 = n12 + n7;
                    int n26;
                    if (n25 < 0) {
                        n26 = n21;
                    }
                    else {
                        n26 = n25;
                    }
                    int n27 = -n24;
                    final int n28 = n24;
                    int n29 = n13;
                    int n30 = 0;
                    boolean b5 = false;
                    while (n30 < pv0.x) {
                        if (n27 >= n26) {
                            pv0.d(n30);
                            b5 = true;
                        }
                        else {
                            ++n29;
                            final int b6 = ((m5d)pv0.get(n30)).b();
                            ++n30;
                            n27 += b6;
                        }
                    }
                    final int n31 = max;
                    final int n32 = n29;
                    int n33 = n13;
                    int n34 = n28;
                    final int n35 = n26;
                    int n36 = n32;
                    int n37 = n31;
                    while (n36 < a2 && (n27 < n35 || n27 <= 0 || pv0.isEmpty())) {
                        final m5d r4 = j5d.r(n36, z);
                        n27 += r4.b();
                        if (n27 <= n19 && n36 != a2 - 1) {
                            n34 -= r4.b();
                            n33 = n36 + 1;
                            b5 = true;
                        }
                        else {
                            n37 = Math.max(n37, r4.v);
                            pv0.addLast((Object)r4);
                        }
                        ++n36;
                    }
                    int n43;
                    int n46;
                    int n47;
                    int n48;
                    int n49;
                    if (n27 < n12) {
                        final int n38 = n12 - n27;
                        final int n39 = n27 + n38;
                        int n40;
                        m5d r5;
                        for (n40 = n34 - n38; n40 < l2 && n33 > 0; n40 += r5.b()) {
                            --n33;
                            r5 = j5d.r(n33, z);
                            pv0.add(0, (Object)r5);
                            n37 = Math.max(n37, r5.v);
                        }
                        final int n41 = n23 + n38;
                        if (n40 < 0) {
                            final int n42 = n37;
                            n43 = n39 + n40;
                            final int n44 = n41 + n40;
                            final int n45 = 0;
                            n46 = n33;
                            n47 = n45;
                            n48 = n42;
                            n49 = n44;
                        }
                        else {
                            final int n50 = n37;
                            n43 = n39;
                            n46 = n33;
                            n47 = n40;
                            n48 = n50;
                            n49 = n41;
                        }
                    }
                    else {
                        final int n51 = n37;
                        n43 = n27;
                        final int n52 = n34;
                        final int n53 = n33;
                        n49 = n23;
                        n48 = n51;
                        n47 = n52;
                        n46 = n53;
                    }
                    float n54;
                    if (Integer.signum(Math.round(n11)) == Integer.signum(n49) && Math.abs(Math.round(n11)) >= Math.abs(n49)) {
                        n54 = (float)n49;
                    }
                    else {
                        n54 = n11;
                    }
                    final float n55 = n11 - n54;
                    float n57;
                    final float n56 = n57 = 0.0f;
                    if (r2) {
                        n57 = n56;
                        if (n49 > n23) {
                            n57 = n56;
                            if (n55 <= 0.0f) {
                                n57 = n49 - n23 + n55;
                            }
                        }
                    }
                    if (n47 < 0) {
                        jac.a("negative currentFirstItemScrollOffset");
                    }
                    final int n58 = -n47;
                    m5d m5d = (m5d)pv0.first();
                    int n60;
                    m5d m5d2;
                    if (l2 > 0 || l3 < 0) {
                        final int a4 = pv0.a();
                        int n59 = 0;
                        while (true) {
                            n60 = n47;
                            m5d2 = m5d;
                            if (n59 >= a4) {
                                break;
                            }
                            final int b7 = ((m5d)pv0.get(n59)).b();
                            n60 = n47;
                            m5d2 = m5d;
                            if (n47 == 0) {
                                break;
                            }
                            n60 = n47;
                            m5d2 = m5d;
                            if (b7 > n47) {
                                break;
                            }
                            n60 = n47;
                            m5d2 = m5d;
                            if (n59 == lq6.P((List)pv0)) {
                                break;
                            }
                            n47 -= b7;
                            ++n59;
                            m5d = (m5d)pv0.get(n59);
                        }
                    }
                    else {
                        m5d2 = m5d;
                        n60 = n47;
                    }
                    final int max2 = Math.max(0, n46);
                    --n46;
                    Object o4;
                    int n63;
                    if (max2 <= n46) {
                        Object o2 = null;
                        final int n61 = n36;
                        int n62 = n46;
                        while (true) {
                            Object o3 = o2;
                            if (o2 == null) {
                                o3 = new ArrayList();
                            }
                            ((List)o3).add((Object)j5d.r(n62, z));
                            o4 = o3;
                            n63 = n61;
                            if (n62 == max2) {
                                break;
                            }
                            --n62;
                            o2 = o3;
                        }
                    }
                    else {
                        o4 = null;
                        n63 = n36;
                    }
                    final int[] a5 = r.a;
                    int n64 = r.b - 1;
                    List list = (List)o4;
                    while (-1 < n64) {
                        final int n65 = a5[n64];
                        Object o5 = list;
                        if (n65 < max2) {
                            if ((o5 = list) == null) {
                                o5 = new ArrayList();
                            }
                            ((List)o5).add((Object)j5d.r(n65, z));
                        }
                        --n64;
                        list = (List)o5;
                    }
                    Object o6;
                    if ((o6 = list) == null) {
                        o6 = v3;
                    }
                    final int size = ((Collection)o6).size();
                    int n66 = n48;
                    for (int n67 = 0; n67 < size; ++n67) {
                        n66 = Math.max(n66, ((m5d)((List)o6).get(n67)).v);
                    }
                    final int min = Math.min(((m5d)c86.P0((List)pv0)).a, a2 - 1);
                    int n68 = ((m5d)c86.P0((List)pv0)).a + 1;
                    Object o9;
                    float n70;
                    if (n68 <= min) {
                        Object o7 = null;
                        while (true) {
                            Object o8 = o7;
                            if (o7 == null) {
                                o8 = new ArrayList();
                            }
                            final int n69 = n66;
                            ((List)o8).add((Object)j5d.r(n68, z));
                            o9 = o8;
                            n66 = n69;
                            n70 = n54;
                            if (n68 == min) {
                                break;
                            }
                            ++n68;
                            o7 = o8;
                            n66 = n69;
                        }
                    }
                    else {
                        o9 = null;
                        n70 = n54;
                    }
                    int a6 = min;
                    if (o9 != null && ((m5d)c86.P0((List)o9)).a > (a6 = min)) {
                        a6 = ((m5d)c86.P0((List)o9)).a;
                    }
                    final int[] a7 = r.a;
                    Object o10;
                    for (int b8 = r.b, n71 = 0; n71 < b8; ++n71, o9 = o10) {
                        final int n72 = a7[n71];
                        o10 = o9;
                        if (n72 > a6) {
                            if ((o10 = o9) == null) {
                                o10 = new ArrayList();
                            }
                            ((List)o10).add((Object)j5d.r(n72, z));
                        }
                    }
                    Object o11;
                    if ((o11 = o9) == null) {
                        o11 = v3;
                    }
                    for (int size2 = ((Collection)o11).size(), n73 = 0; n73 < size2; ++n73) {
                        n66 = Math.max(n66, ((m5d)((List)o11).get(n73)).v);
                    }
                    final boolean b9 = mlc.q((Object)m5d2, pv0.first()) && ((List)o6).isEmpty() && ((List)o11).isEmpty();
                    int n74;
                    if (b4) {
                        n74 = n66;
                    }
                    else {
                        n74 = n43;
                    }
                    int g2 = hv6.g(n74, i);
                    if (b4) {
                        n66 = n43;
                    }
                    final int f2 = hv6.f(n66, i);
                    int n75;
                    if (b4) {
                        n75 = f2;
                    }
                    else {
                        n75 = g2;
                    }
                    final boolean b10 = n43 < Math.min(n75, n12);
                    if (b10) {
                        if (n58 != 0) {
                            jac.c("non-zero itemsScrollOffset");
                        }
                    }
                    final ArrayList list2 = new ArrayList(((List)o11).size() + (((List)o6).size() + pv0.a()));
                    if (b10) {
                        if (!((List)o6).isEmpty() || !((List)o11).isEmpty()) {
                            jac.a("no extra items");
                        }
                        final int a8 = pv0.a();
                        final int[] array = new int[a8];
                        for (int n76 = 0; n76 < a8; ++n76) {
                            int n77;
                            if (!d5) {
                                n77 = n76;
                            }
                            else {
                                n77 = a8 - n76 - 1;
                            }
                            array[n76] = ((m5d)pv0.get(n77)).q;
                        }
                        final int[] array2 = new int[a8];
                        if (b4) {
                            if (f == null) {
                                throw hia.s("null verticalArrangement when isVertical == true");
                            }
                            f.r(xc8, n75, array, array2);
                        }
                        else {
                            if (g == null) {
                                throw hia.s("null horizontalArrangement when isVertical == false");
                            }
                            g.h(xc8, n75, array, qzc.v, array2);
                        }
                        Object z2 = iw0.Z0(array2);
                        if (d5) {
                            z2 = new vgc(((vgc)z2).w, 0, -((vgc)z2).x);
                        }
                        final int v4 = ((vgc)z2).v;
                        final int w4 = ((vgc)z2).w;
                        final int x2 = ((vgc)z2).x;
                    Label_3199:
                        while (true) {
                            Label_3075: {
                                if (x2 <= 0) {
                                    break Label_3075;
                                }
                                final int n78 = a8;
                                int n79;
                                if ((n79 = v4) > w4) {
                                    break Label_3075;
                                }
                                while (true) {
                                    final int n80 = array2[n79];
                                    int n81;
                                    if (!d5) {
                                        n81 = n79;
                                    }
                                    else {
                                        n81 = n78 - n79 - 1;
                                    }
                                    final m5d m5d3 = (m5d)pv0.get(n81);
                                    int n82;
                                    if (d5) {
                                        n82 = n75 - n80 - m5d3.q;
                                    }
                                    else {
                                        n82 = n80;
                                    }
                                    m5d3.o(n82, g2, f2);
                                    list2.add((Object)m5d3);
                                    if (n79 == w4) {
                                        break Label_3199;
                                    }
                                    n79 += x2;
                                }
                            }
                            if (x2 < 0 && w4 <= v4) {
                                final int n79 = v4;
                                final int n78 = a8;
                                continue;
                            }
                            break;
                        }
                    }
                    else {
                        final int size3 = ((Collection)o6).size();
                        int n83 = n58;
                        for (int n84 = 0; n84 < size3; ++n84) {
                            final m5d m5d4 = (m5d)((List)o6).get(n84);
                            n83 -= m5d4.b();
                            m5d4.o(n83, g2, f2);
                            list2.add((Object)m5d4);
                        }
                        final int a9 = pv0.a();
                        int n85 = n58;
                        for (int n86 = 0; n86 < a9; ++n86) {
                            final m5d m5d5 = (m5d)pv0.get(n86);
                            m5d5.o(n85, g2, f2);
                            list2.add((Object)m5d5);
                            n85 += m5d5.b();
                        }
                        for (int size4 = ((Collection)o11).size(), n87 = 0; n87 < size4; ++n87) {
                            final m5d m5d6 = (m5d)((List)o11).get(n87);
                            m5d6.o(n85, g2, f2);
                            list2.add((Object)m5d6);
                            n85 += m5d6.b();
                        }
                    }
                    final int n88 = n9;
                    if (!k) {
                        o.d((int)n70, g2, f2, list2, d4, j5d, b4, r2, 1, b, n60, n43, h4, m);
                    }
                    while (true) {
                        Label_3643: {
                            if (r2) {
                                break Label_3643;
                            }
                            final long b11 = o.b();
                            if (chc.b(b11, 0L)) {
                                break Label_3643;
                            }
                            int n89;
                            if (b4) {
                                n89 = f2;
                            }
                            else {
                                n89 = g2;
                            }
                            final int g3 = hv6.g(Math.max(g2, (int)(b11 >> 32)), i);
                            final int f3 = hv6.f(Math.max(f2, (int)(b11 & 0xFFFFFFFFL)), i);
                            int x3;
                            if (b4) {
                                x3 = f3;
                            }
                            else {
                                x3 = g3;
                            }
                            g2 = g3;
                            int n90 = f3;
                            if (x3 != n89) {
                                final int size5 = list2.size();
                                int n91 = 0;
                                while (true) {
                                    g2 = g3;
                                    n90 = f3;
                                    if (n91 >= size5) {
                                        break;
                                    }
                                    final m5d m5d7 = (m5d)list2.get(n91);
                                    m5d7.x = x3;
                                    m5d7.z = m5d7.i + x3;
                                    ++n91;
                                }
                            }
                            final m5d m5d8 = (m5d)pv0.o();
                            int a10;
                            if (m5d8 != null) {
                                a10 = m5d8.a;
                            }
                            else {
                                a10 = 0;
                            }
                            final m5d m5d9 = (m5d)pv0.s();
                            int a11;
                            if (m5d9 != null) {
                                a11 = m5d9.a;
                            }
                            else {
                                a11 = 0;
                            }
                            ilf ilf = x.b.t;
                            if (ilf == null) {
                                ilf = qgc.a;
                            }
                            final List i2 = zn2.i(this.j, a10, a11, list2, ilf, l2, g2, n90, b4, (lta)new p8a((Object)j5d, (byte)9));
                            Integer n92 = null;
                            Label_3839: {
                                if (b9) {
                                    final m5d m5d10 = (m5d)c86.I0((List)list2);
                                    if (m5d10 != null) {
                                        n92 = m5d10.a;
                                        break Label_3839;
                                    }
                                }
                                else {
                                    final m5d m5d11 = (m5d)pv0.o();
                                    if (m5d11 != null) {
                                        n92 = m5d11.a;
                                        break Label_3839;
                                    }
                                }
                                n92 = null;
                            }
                            Integer n93 = null;
                            Label_3906: {
                                Label_3872: {
                                    if (b9) {
                                        final m5d m5d12 = (m5d)c86.R0((List)list2);
                                        if (m5d12 == null) {
                                            break Label_3872;
                                        }
                                        n93 = m5d12.a;
                                    }
                                    else {
                                        final m5d m5d13 = (m5d)pv0.s();
                                        if (m5d13 == null) {
                                            break Label_3872;
                                        }
                                        n93 = m5d13.a;
                                    }
                                    break Label_3906;
                                }
                                n93 = null;
                            }
                            final boolean b12 = n63 < a2 || n43 > n88;
                            final noe y = ((ooe)w).Y(hv6.g(g2 + n5, n), hv6.f(n90 + n4, n), (Map)v2, (lta)new fv4(w3, list2, i2, r2));
                            int intValue;
                            if (n92 != null) {
                                intValue = n92;
                            }
                            else {
                                intValue = 0;
                            }
                            int intValue2;
                            if (n93 != null) {
                                intValue2 = n93;
                            }
                            else {
                                intValue2 = 0;
                            }
                            final List m2 = mlc.m0(intValue, intValue2, list2, i2);
                            if (b4) {
                                w2 = v;
                            }
                            final int size6 = ((Collection)i2).size();
                            int n94 = 0;
                            int n95 = 0;
                            while (n94 < size6) {
                                n95 += ((m5d)i2.get(n94)).q;
                                ++n94;
                            }
                            l5d = new l5d(m5d2, n60, b12, n70, y, n57, b5, h4, xc8, j5d.z, n95, m2, n17, n25, a2, d5, w2, n7, l3);
                            break Label_4137;
                        }
                        int n90 = f2;
                        continue;
                    }
                }
                final int k2 = gv6.k(i);
                final int j2 = gv6.j(i);
                o.d(0, k2, j2, new ArrayList(), d4, j5d, b4, r2, 1, b, 0, 0, h4, m);
                int g4 = k2;
                int f4 = j2;
                if (!r2) {
                    final long b13 = o.b();
                    g4 = k2;
                    f4 = j2;
                    if (!chc.b(b13, 0L)) {
                        g4 = hv6.g((int)(b13 >> 32), i);
                        f4 = hv6.f((int)(b13 & 0xFFFFFFFFL), i);
                    }
                }
                final noe y2 = ((ooe)w).Y(hv6.g(g4 + n5, n), hv6.f(f4 + n4, n), (Map)v2, (lta)new shc((byte)12));
                final int n96 = -l2;
                if (!b4) {
                    v = w2;
                }
                l5d = new l5d(null, 0, false, 0.0f, y2, 0.0f, false, h4, xc8, j5d.z, 0, (List)v3, n96, n9 + n7, 0, d5, v, n7, l3);
            }
            a.h(l5d, ((flc)w).r0(), false);
            final o58 a12 = a.a;
            return l5d;
        }
        q7m.d(a3, b3, e);
    }
}
