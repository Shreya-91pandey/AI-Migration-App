public final class rd8 extends lpm
{
    public static final Object h;
    public long c;
    public int d;
    public amf e;
    public Object f;
    public int g;
    
    static {
        h = new Object();
    }
    
    public rd8(final long n) {
        super(n);
        final amf a = i4g.a;
        a.getClass();
        this.e = a;
        this.f = rd8.h;
    }
    
    public final void a(final lpm lpm) {
        lpm.getClass();
        final rd8 rd8 = (rd8)lpm;
        this.e = rd8.e;
        this.f = rd8.f;
        this.g = rd8.g;
    }
    
    public final lpm c(final long n) {
        return new rd8(n);
    }
    
    public final boolean d(final sd8 sd8, final r7m r7m) {
        final Object c = g8m.c;
        final Object o;
        monitorenter(o = c);
        Label_0155: {
            boolean b = false;
            int h = 0;
            Label_0065: {
                try {
                    final long c2 = this.c;
                    final long g = r7m.g();
                    b = true;
                    if (c2 == g) {
                        final int d = this.d;
                        h = r7m.h();
                        if (d == h) {
                            h = 0;
                            break Label_0065;
                        }
                    }
                }
                finally {
                    break Label_0155;
                }
                h = 1;
            }
            monitorexit(o);
            boolean b2 = false;
            Label_0109: {
                if (this.f != rd8.h) {
                    b2 = b;
                    if (h == 0) {
                        break Label_0109;
                    }
                    final sd8 sd9;
                    if (this.g == this.e(sd9, r7m)) {
                        b2 = b;
                        break Label_0109;
                    }
                }
                b2 = false;
            }
            if (b2 && h != 0) {
                synchronized (c) {
                    this.c = r7m.g();
                    this.d = r7m.h();
                    return b2;
                }
            }
            return b2;
        }
        monitorexit(o);
    }
    
    public final int e(final sd8 sd8, final r7m r7m) {
        final Object c = g8m.c;
        synchronized (c) {
            final amf e = this.e;
            monitorexit(c);
            final int e2 = e.e;
            final int n = 7;
            if (e2 != 0) {
                final inf a = r8m.a();
                final Object[] v = a.v;
                for (int x = a.x, i = 0; i < x; ++i) {
                    ((fva)v[i]).b();
                }
            Label_0598_Outer:
                while (true) {
                Label_0168_Outer:
                    while (true) {
                    Label_0310_Outer:
                        while (true) {
                        Label_0367_Outer:
                            while (true) {
                                Object[] b;
                                int[] c2;
                                long[] a2;
                                int n2;
                                int n3 = 0;
                                int n4;
                                long n5;
                                long n6;
                                int n7 = 0;
                                int n8;
                                int n9;
                                int n10;
                                Object o;
                                int n11;
                                jpm jpm;
                                int n12;
                                sd8 sd9;
                                rd8 h = null;
                                amf e3;
                                Object[] b2;
                                long[] a3;
                                int n13;
                                int n14;
                                int n15;
                                long n16;
                                long n17 = 0L;
                                int n18;
                                int n19;
                                int n20;
                                long n21;
                                int n22;
                                Object[] v2;
                                int n23;
                                int n24;
                                int n25;
                                int x3;
                                Object[] v3;
                                lpm g;
                                int n26 = 0;
                                int n27;
                                Block_17_Outer:Label_0563_Outer:
                                while (true) {
                                    Label_0420: {
                                        try {
                                            b = e.b;
                                            c2 = e.c;
                                            a2 = e.a;
                                            n2 = a2.length - 2;
                                            if (n2 < 0) {
                                                break Label_0598_Outer;
                                            }
                                            n3 = 7;
                                            n4 = 0;
                                            n5 = a2[n4];
                                            n6 = -9187201950435737472L;
                                            if ((~n5 << n & n5 & 0x8080808080808080L) == 0x8080808080808080L) {
                                                break Label_0598;
                                            }
                                            n7 = 8;
                                            n8 = 8 - (~(n4 - n2) >>> 31);
                                            n9 = 0;
                                            if (n9 >= n8) {
                                                break Label_0367_Outer;
                                            }
                                            if ((n5 & 0xFFL) >= 128L) {
                                                break Label_0367_Outer;
                                            }
                                            n10 = (n4 << 3) + n9;
                                            o = b[n10];
                                            n11 = c2[n10];
                                            jpm = (jpm)o;
                                            if (n11 != 1) {
                                                n12 = n3;
                                                break Label_0367_Outer;
                                            }
                                            if (!(jpm instanceof sd8)) {
                                                break Label_0367_Outer;
                                            }
                                            sd9 = (sd8)jpm;
                                            h = sd9.h((rd8)g8m.g(sd9.y, r7m), r7m, false, sd9.w);
                                            e3 = h.e;
                                            b2 = e3.b;
                                            a3 = e3.a;
                                            n13 = a3.length - 2;
                                            if (n13 < 0) {
                                                break Label_0367_Outer;
                                            }
                                            n14 = 0;
                                            n15 = n7;
                                            n16 = a3[n14];
                                            n17 = n5;
                                            n18 = n3;
                                            if ((~n16 << n & n16 & n6) == n6) {
                                                break Block_17_Outer;
                                            }
                                            n19 = 8 - (~(n14 - n13) >>> 31);
                                            n20 = 0;
                                            n21 = n16;
                                            if (n20 >= n19) {
                                                break Label_0420;
                                            }
                                            n22 = n3;
                                            if ((n21 & 0xFFL) < 128L) {
                                                n22 = n3 * 31 + System.identityHashCode((Object)b2[(n14 << 3) + n20]);
                                            }
                                            break Label_0420;
                                        }
                                        finally {
                                            v2 = a.v;
                                            for (int x2 = a.x, j = 0; j < x2; ++j) {
                                                ((fva)v2[j]).a();
                                            }
                                        Label_0635:
                                            while (true) {
                                            Label_0563:
                                                while (true) {
                                                Label_0515:
                                                    while (true) {
                                                    Label_0617_Outer:
                                                        while (true) {
                                                            n18 = n3;
                                                            break Block_17_Outer;
                                                            n5 >>= n23;
                                                            n24 = n23;
                                                            ++n9;
                                                            n3 = n12;
                                                            n7 = n24;
                                                            continue Label_0310_Outer;
                                                            iftrue(Label_0656:)(n25 >= x3);
                                                        Label_0617:
                                                            while (true) {
                                                                while (true) {
                                                                    Block_20: {
                                                                        break Block_20;
                                                                        n21 >>= n15;
                                                                        ++n20;
                                                                        n3 = n22;
                                                                        continue Block_17_Outer;
                                                                        ++n4;
                                                                        continue Label_0598_Outer;
                                                                        n3 = n;
                                                                        break Label_0617;
                                                                    }
                                                                    ((fva)v3[n25]).a();
                                                                    ++n25;
                                                                    continue Label_0635;
                                                                    iftrue(Label_0611:)(n4 == n2);
                                                                    continue Label_0617_Outer;
                                                                }
                                                                n12 = (n3 * 31 + System.identityHashCode((Object)g)) * 31 + Long.hashCode(g.a);
                                                                break Label_0367_Outer;
                                                                g = g8m.g(jpm.a(), r7m);
                                                                continue Label_0515;
                                                                n3 = n18;
                                                                g = h;
                                                                n5 = n17;
                                                                iftrue(Label_0515:)(n14 == n13);
                                                                Block_18: {
                                                                    break Block_18;
                                                                    n23 = 8;
                                                                    continue Label_0563;
                                                                }
                                                                ++n14;
                                                                n5 = n17;
                                                                n15 = 8;
                                                                n3 = n18;
                                                                continue Label_0367_Outer;
                                                                n26 = n3;
                                                                iftrue(Label_0620:)(n8 != n7);
                                                                continue Label_0168_Outer;
                                                                n26 = n3;
                                                                break Label_0563;
                                                                Label_0611: {
                                                                    continue Label_0617;
                                                                }
                                                            }
                                                            g = h;
                                                            continue Label_0515;
                                                            iftrue(Label_0449:)(n19 != n15);
                                                            continue Label_0563_Outer;
                                                        }
                                                        Label_0449: {
                                                            g = h;
                                                        }
                                                        n5 = n17;
                                                        continue Label_0515;
                                                    }
                                                    n27 = n7;
                                                    n12 = n3;
                                                    n23 = n27;
                                                    continue Label_0563;
                                                }
                                                v3 = a.v;
                                                x3 = a.x;
                                                n25 = 0;
                                                continue Label_0635;
                                            }
                                            Label_0656: {
                                                return n26;
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    }
                    break;
                }
            }
            return 7;
        }
    }
}
