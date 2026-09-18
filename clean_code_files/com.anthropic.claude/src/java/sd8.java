public final class sd8 extends kpm implements xom
{
    public final jta w;
    public final q8m x;
    public rd8 y;
    
    public sd8(final jta w, final q8m x) {
        this.w = w;
        this.x = x;
        this.y = new rd8(g8m.h().g());
    }
    
    public final lpm a() {
        return this.y;
    }
    
    public final void f(final lpm lpm) {
        this.y = (rd8)lpm;
    }
    
    public final Object getValue() {
        final lta e = g8m.h().e();
        if (e != null) {
            e.b((Object)this);
        }
        final r7m h = g8m.h();
        return this.h((rd8)g8m.g(this.y, h), h, true, this.w).f;
    }
    
    public final rd8 h(rd8 rd8, r7m c, final boolean b, jta c2) {
        if (rd8.d(this, c)) {
            if (b) {
                final inf a = r8m.a();
                final Object[] v = a.v;
                for (int x = a.x, i = 0; i < x; ++i) {
                    ((fva)v[i]).b();
                }
                Label_0113: {
                    try {
                        final amf e = rd8.e;
                        final tze a2 = r8m.a;
                        zgc zgc;
                        if ((zgc = (zgc)a2.get()) == null) {
                            zgc = new zgc();
                            a2.l((Object)zgc);
                        }
                        break Label_0113;
                    }
                    finally {
                        final Object[] v2 = a.v;
                        for (int x2 = a.x, j = 0; j < x2; ++j) {
                            ((fva)v2[j]).a();
                        }
                        while (true) {
                            int n2 = 0;
                            long n4 = 0L;
                            final int n7;
                            Label_0292: {
                                int n = 0;
                                int n6 = 0;
                                Block_11: {
                                    final zgc zgc;
                                    int a3 = 0;
                                    Object[] b2 = null;
                                    int[] c3 = null;
                                Label_0156_Outer:
                                    while (true) {
                                        n = 0;
                                    Label_0348_Outer:
                                        while (true) {
                                            break Label_0156;
                                            final int n3;
                                            iftrue(Label_0305:)(n2 >= n3);
                                            iftrue(Label_0292:)((n4 & 0xFFL) >= 128L);
                                            break Label_0156_Outer;
                                            Label_0325: {
                                                zgc.a = a3;
                                            }
                                            final Object[] v3 = a.v;
                                            final int x3 = a.x;
                                            int n5 = 0;
                                            Block_15: {
                                            Label_0312_Outer:
                                                while (true) {
                                                    break Label_0348;
                                                    while (true) {
                                                        iftrue(Label_0325:)(n == n6);
                                                        break Block_15;
                                                        final long[] a4;
                                                        n4 = a4[n];
                                                        iftrue(Label_0312:)((~n4 << 7 & n4 & 0x8080808080808080L) == 0x8080808080808080L);
                                                        break Block_11;
                                                        Label_0305:
                                                        iftrue(Label_0325:)(n3 != n7);
                                                        continue;
                                                    }
                                                    iftrue(Label_0412:)(n5 >= x3);
                                                    ((fva)v3[n5]).a();
                                                    ++n5;
                                                    continue Label_0312_Outer;
                                                }
                                            }
                                            ++n;
                                            continue Label_0348_Outer;
                                        }
                                        a3 = zgc.a;
                                        final amf e;
                                        b2 = e.b;
                                        c3 = e.c;
                                        final long[] a4 = e.a;
                                        n6 = a4.length - 2;
                                        iftrue(Label_0325:)(n6 < 0);
                                        continue Label_0156_Outer;
                                    }
                                    final int n8 = (n << 3) + n2;
                                    final Object o = b2[n8];
                                    final int n9 = c3[n8];
                                    final jpm jpm = (jpm)o;
                                    zgc.a = a3 + n9;
                                    final lta e2 = c.e();
                                    iftrue(Label_0292:)(e2 == null);
                                    e2.b((Object)jpm);
                                    break Label_0292;
                                }
                                n7 = 8;
                                final int n3 = 8 - (~(n - n6) >>> 31);
                                n2 = 0;
                                continue;
                            }
                            n4 >>= n7;
                            ++n2;
                            continue;
                        }
                    }
                }
            }
            Label_0412: {
                return rd8;
            }
        }
        final amf amf = new amf();
        final tze a5 = r8m.a;
        zgc zgc2;
        if ((zgc2 = (zgc)a5.get()) == null) {
            zgc2 = new zgc();
            a5.l((Object)zgc2);
        }
        final int a6 = zgc2.a;
        Object o2 = r8m.a();
        final Object[] v4 = ((inf)o2).v;
        for (int x4 = ((inf)o2).x, k = 0; k < x4; ++k) {
            ((fva)v4[k]).b();
        }
        try {
            zgc2.a = a6 + 1;
            c2 = (jta)q7m.c(new qd8(a6, (Object)this, (Object)zgc2, (Object)amf, (byte)0), c2);
            zgc2.a = a6;
            final Object[] v5 = ((inf)o2).v;
            for (int x5 = ((inf)o2).x, l = 0; l < x5; ++l) {
                ((fva)v5[l]).a();
            }
            c = (r7m)g8m.c;
            r7m r7m;
            monitorenter(r7m = c);
            Label_0733: {
                try {
                    o2 = g8m.h();
                    final Object f = rd8.f;
                    if (f != rd8.h) {
                        final q8m x6 = this.x;
                        if (x6 != null && x6.n((Object)c2, f)) {
                            rd8.e = amf;
                            rd8.g = rd8.e(this, (r7m)o2);
                            break Label_0733;
                        }
                    }
                }
                finally {
                    break Label_0733;
                }
                final rd8 y = this.y;
                synchronized (c) {
                    final lpm m = g8m.k(y, (jpm)this);
                    m.a((lpm)y);
                    m.a = ((r7m)o2).g();
                    monitorexit(c);
                    rd8 = (rd8)m;
                    rd8.e = amf;
                    rd8.g = rd8.e(this, (r7m)o2);
                    rd8.f = c2;
                    monitorexit(c);
                    final zgc zgc3 = (zgc)r8m.a.get();
                    if (zgc3 != null && zgc3.a == 0) {
                        g8m.h().m();
                        synchronized (r7m = c) {
                            final r7m h = g8m.h();
                            rd8.c = h.g();
                            rd8.d = h.h();
                            return rd8;
                        }
                    }
                    return rd8;
                }
            }
            monitorexit(r7m);
        }
        finally {
            final Object[] v6 = ((inf)o2).v;
            for (int x7 = ((inf)o2).x, n10 = 0; n10 < x7; ++n10) {
                ((fva)v6[n10]).a();
            }
        }
    }
    
    public final rd8 i() {
        final r7m h = g8m.h();
        return this.h((rd8)g8m.g(this.y, h), h, false, this.w);
    }
    
    public final String toString() {
        final rd8 rd8 = (rd8)g8m.f(this.y);
        final rd8 rd9 = (rd8)g8m.f(this.y);
        String value;
        if (rd9.d(this, g8m.h())) {
            value = String.valueOf(rd9.f);
        }
        else {
            value = "<Not calculated>";
        }
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("DerivedState(value=");
        sb.append(value);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
}
