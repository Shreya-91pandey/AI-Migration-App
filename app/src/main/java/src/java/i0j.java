import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class i0j extends m6n implements bua
{
    public umf A;
    public umf B;
    public Set C;
    public umf D;
    public byte E;
    public ahf F;
    public final j0j G;
    public List w;
    public List x;
    public List y;
    public umf z;
    
    public i0j(final j0j g, final f07 f07) {
        this.G = g;
        super(3, f07);
    }
    
    public static final void r(final j0j j0j, final List list, final List list2, final List list3, final umf umf, final umf umf2, final umf umf3, final umf umf4) {
        final Object d;
        monitorenter(d = j0j.d);
        Label_0540: {
            try {
                list.clear();
                list2.clear();
                for (int size = ((Collection)list3).size(), i = 0; i < size; ++i) {
                    final yl6 yl6 = (yl6)list3.get(i);
                    yl6.e();
                    j0j.P(yl6);
                }
            }
            finally {
                break Label_0540;
            }
            list3.clear();
            final Object[] b = umf.b;
            final long[] a = umf.a;
            final int n = a.length - 2;
            final j0j j0j2;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    long n3 = a[n2];
                    if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n4 = 8 - (~(n2 - n) >>> 31);
                        for (int j = 0; j < n4; ++j) {
                            if ((n3 & 0xFFL) < 128L) {
                                final yl6 yl7 = (yl6)b[(n2 << 3) + j];
                                yl7.e();
                                j0j2.P(yl7);
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
            umf.b();
            final Object[] b2 = umf2.b;
            final long[] a2 = umf2.a;
            final int n5 = a2.length - 2;
            if (n5 >= 0) {
                int n6 = 0;
                while (true) {
                    long n7 = a2[n6];
                    if ((~n7 << 7 & n7 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n8 = 8 - (~(n6 - n5) >>> 31);
                        for (int k = 0; k < n8; ++k) {
                            if ((n7 & 0xFFL) < 128L) {
                                ((yl6)b2[(n6 << 3) + k]).k();
                            }
                            n7 >>= 8;
                        }
                        if (n8 != 8) {
                            break;
                        }
                    }
                    if (n6 == n5) {
                        break;
                    }
                    ++n6;
                }
            }
            umf2.b();
            umf3.b();
            final Object[] b3 = umf4.b;
            final long[] a3 = umf4.a;
            final int n9 = a3.length - 2;
            if (n9 >= 0) {
                int n10 = 0;
                while (true) {
                    long n11 = a3[n10];
                    if ((~n11 << 7 & n11 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n12 = 8 - (~(n10 - n9) >>> 31);
                        for (int l = 0; l < n12; ++l) {
                            if ((n11 & 0xFFL) < 128L) {
                                final yl6 yl8 = (yl6)b3[(n10 << 3) + l];
                                yl8.e();
                                j0j2.P(yl8);
                            }
                            n11 >>= 8;
                        }
                        if (n12 != 8) {
                            break;
                        }
                    }
                    if (n10 == n9) {
                        break;
                    }
                    ++n10;
                }
            }
            umf4.b();
            monitorexit(d);
            return;
        }
        monitorexit(d);
    }
    
    public static final void t(final List list, final j0j j0j) {
        list.clear();
        final Object d;
        monitorenter(d = j0j.d);
        Label_0074: {
            try {
                final ArrayList l = j0j.l;
                for (int size = l.size(), i = 0; i < size; ++i) {
                    ((Collection)list).add((Object)l.get(i));
                }
            }
            finally {
                break Label_0074;
            }
            j0j.l.clear();
            monitorexit(d);
            return;
        }
        monitorexit(d);
    }
    
    public final Object h(final Object o, final Object o2, final Object o3) {
        final oc7 oc7 = (oc7)o;
        final ahf f = (ahf)o2;
        final i0j i0j = new i0j(this.G, (f07)o3);
        i0j.F = f;
        return i0j.invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final pc7 v = pc7.v;
        final byte e = this.E;
        Object y = null;
        Object d = null;
        byte e2 = 1;
        final byte b = 1;
        while (true) {
            Label_0757: {
                umf umf;
                Object o2;
                umf umf2;
                Object o3;
                Object o4;
                Object o5;
                Object o6;
                umf umf3;
                if (e != 0) {
                    if (e == 1) {
                        umf = this.D;
                        o2 = this.C;
                        umf2 = this.B;
                        final umf a = this.A;
                        o3 = this.z;
                        y = this.y;
                        o4 = this.x;
                        o5 = this.w;
                        o6 = this.F;
                        vt4.g0(o);
                        umf3 = a;
                        e2 = b;
                        break Label_0757;
                    }
                    if (e == 2) {
                        d = this.D;
                        o2 = this.C;
                        umf2 = this.B;
                        final umf a2 = this.A;
                        umf = this.z;
                        o5 = this.y;
                        o4 = this.x;
                        o3 = this.w;
                        y = this.F;
                        vt4.g0(o);
                        break Label_0757;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(o);
                    o6 = this.F;
                    o3 = new ArrayList();
                    o4 = new ArrayList();
                    o5 = new ArrayList();
                    final umf a3 = kak.a;
                    umf = new umf();
                    umf3 = new umf();
                    umf2 = new umf();
                    o2 = new lak(umf2);
                    d = new umf();
                }
                umf a2;
                j0j g;
                apm b2;
                Object d2;
                boolean t;
                ppc y2;
                Iterator iterator;
                vyk vyk;
                Object o7;
                l13 s;
                Object d3;
                umf umf4;
                List list;
                yb0 yb0;
                int n;
                yog yog;
                Object o8;
                j0j g2;
                yl6 b3;
                xmf z;
                wl6 d4;
                Object o9;
                int n2;
                l0 l0;
                l0 l3;
                l0 l2;
                yb0 yb2;
                byte b4;
                hif hif;
                int n3;
                l0 l4;
                hif hif2;
                hif hif3;
                boolean b5;
                yb0 yb3;
                yb0 yb4;
                umf umf5;
                int b6;
                j0j g3;
                apm b7;
                emf d5;
                Object[] a4;
                iif iif;
                Label_1219_Outer:Label_0939_Outer:
                while (true) {
                    g = this.G;
                    b2 = j0j.B;
                    d2 = g.d;
                    synchronized (d2) {
                        t = g.t;
                        monitorexit(d2);
                        if (t) {
                            y2 = g.y;
                            y2.getClass();
                            iterator = new mw0((Object)new xpc((f07)y, (bqc)y2), e2).iterator();
                            do {
                                vyk = (vyk)iterator;
                                if (vyk.hasNext()) {
                                    continue Label_1219_Outer;
                                }
                                return lqo.a;
                            } while (!((opc)vyk.next()).c());
                        }
                        o7 = this.G;
                        this.F = (ahf)o6;
                        this.w = (List)o3;
                        this.x = (List)o4;
                        this.y = (List)o5;
                        this.z = umf;
                        this.A = umf3;
                        this.B = umf2;
                        this.C = (Set)o2;
                        this.D = (umf)d;
                        this.E = e2;
                        Label_0568: {
                            if (!((j0j)o7).G()) {
                                s = new l13((int)e2, ljq.K((f07)this));
                                s.r();
                                d3 = ((j0j)o7).d;
                                synchronized (d3) {
                                    if (((j0j)o7).G()) {
                                        o7 = s;
                                    }
                                    else {
                                        ((j0j)o7).s = s;
                                        o7 = y;
                                    }
                                    monitorexit(d3);
                                    if (o7 != null) {
                                        ((l13)o7).resumeWith((Object)lqo.a);
                                    }
                                    o7 = s.p();
                                    if (o7 == pc7.v) {
                                        break Label_0568;
                                    }
                                    o7 = lqo.a;
                                    break Label_0568;
                                }
                            }
                            o7 = lqo.a;
                        }
                        if (o7 == v) {
                            return v;
                        }
                        umf4 = umf;
                        umf = (umf)d;
                        list = (List)o5;
                        o5 = o3;
                        d = y;
                        o3 = umf4;
                        y = list;
                        break Label_0757;
                        while (true) {
                            Block_14_Outer:Label_0950_Outer:
                            while (true) {
                                monitorexit(yb0);
                                while (true) {
                                Block_12_Outer:
                                    while (true) {
                                        yog = (yog)y[n];
                                        o6 = yog.v;
                                        o8 = yog.w;
                                        iftrue(Label_1158:)(o8 == null);
                                    Label_0985:
                                        while (true) {
                                            Label_0961: {
                                                Label_1158: {
                                                    while (true) {
                                                        Block_15: {
                                                            break Block_15;
                                                            y = j4g.b;
                                                            y.getClass();
                                                            break Label_0961;
                                                            g2.o.a();
                                                            break Label_0961;
                                                            ((yb0)o6).j();
                                                            d = new h0j(this.G, umf2, umf, (List)o5, (List)o4, (umf)o3, (List)y, umf3, (Set)o2);
                                                            this.F = (ahf)o6;
                                                            this.w = (List)o5;
                                                            this.x = (List)o4;
                                                            this.y = (List)y;
                                                            this.z = (umf)o3;
                                                            this.A = umf3;
                                                            this.B = umf2;
                                                            this.C = (Set)o2;
                                                            this.D = umf;
                                                            this.E = 2;
                                                            iftrue(Label_0735:)(((ahf)o6).p0((f07)this, (lta)d) != v);
                                                            return v;
                                                        }
                                                        b3 = ((iif)o6).b();
                                                        o6 = b3.P;
                                                        z = b3.z;
                                                        d4 = b3.Q.D();
                                                        try {
                                                            ((yb0)o6).s((Set)z, d4);
                                                            o8 = (o9 = ((hif)o8).a().o());
                                                            n2 = ((y5m)o9).t;
                                                            l0 = new(l0.class)();
                                                            l2 = (l3 = l0);
                                                            yb2 = (yb0)o6;
                                                            b4 = 7;
                                                            new l0((Object)yb2, b4);
                                                            hif = (hif)o8;
                                                            n3 = n2;
                                                            l4 = l2;
                                                            ((y5m)hif).m(n3, (zta)l4);
                                                            hif2 = (hif)o8;
                                                            ((y5m)hif2).I();
                                                            hif3 = (hif)o8;
                                                            b5 = true;
                                                            ((y5m)hif3).e(b5);
                                                            yb3 = (yb0)o6;
                                                            yb3.l();
                                                            yb4 = (yb0)o6;
                                                            yb4.j();
                                                            break Label_1158;
                                                        }
                                                        finally {
                                                            continue Block_12_Outer;
                                                        }
                                                        try {
                                                            o9 = o8;
                                                            n2 = ((y5m)o9).t;
                                                            l0 = new(l0.class)();
                                                            l2 = (l3 = l0);
                                                            yb2 = (yb0)o6;
                                                            b4 = 7;
                                                            new l0((Object)yb2, b4);
                                                            hif = (hif)o8;
                                                            n3 = n2;
                                                            l4 = l2;
                                                            ((y5m)hif).m(n3, (zta)l4);
                                                            hif2 = (hif)o8;
                                                            ((y5m)hif2).I();
                                                            hif3 = (hif)o8;
                                                            b5 = true;
                                                            ((y5m)hif3).e(b5);
                                                            yb3 = (yb0)o6;
                                                            yb3.l();
                                                            yb4 = (yb0)o6;
                                                            yb4.j();
                                                            break Label_1158;
                                                        }
                                                        finally {
                                                            ((y5m)o8).e(false);
                                                        }
                                                        continue Block_12_Outer;
                                                    }
                                                    Label_0735: {
                                                        d = umf;
                                                    }
                                                    umf = (umf)o3;
                                                    o3 = o5;
                                                    o5 = y;
                                                    a2 = umf3;
                                                    o = o6;
                                                    break Label_0757;
                                                }
                                                ++n;
                                                break Label_0985;
                                                Label_1164: {
                                                    y = this.G.c;
                                                }
                                                ((cc1)((tze)y).w).set(0);
                                                ((uy7)((tze)y).x).L((lta)new xtf((byte)23));
                                                e2 = 1;
                                                y = null;
                                                o6 = umf3;
                                                o = a2;
                                                continue Label_1219_Outer;
                                                Label_1224:
                                                umf5 = umf;
                                                umf = (umf)o3;
                                                o3 = o5;
                                                o5 = y;
                                                y = d;
                                                d = umf5;
                                                continue Label_1219_Outer;
                                            }
                                            monitorexit(yb0);
                                            o6 = ((emf)y).a;
                                            b6 = ((emf)y).b;
                                            n = 0;
                                            y = o6;
                                            break Label_0985;
                                            g3 = this.G;
                                            b7 = j0j.B;
                                            iftrue(Label_1224:)(!g3.O());
                                            continue;
                                        }
                                        iftrue(Label_1164:)(n >= b6);
                                        continue Label_0950_Outer;
                                    }
                                    g2 = this.G;
                                    y = j0j.B;
                                    o6 = g2.d;
                                    monitorenter(yb0 = (yb0)o6);
                                    try {
                                        if (!g2.m.j()) {
                                            continue Label_0939_Outer;
                                        }
                                        d5 = gkf.d(g2.m);
                                        g2.m.a();
                                        y = g2.n;
                                        ((tmf)((e3a)y).w).a();
                                        ((tmf)((e3a)y).x).a();
                                        g2.p.a();
                                        y = new emf(d5.b);
                                        a4 = d5.a;
                                        for (int b8 = d5.b, i = 0; i < b8; ++i) {
                                            iif = (iif)a4[i];
                                            ((emf)y).b((Object)new yog((Object)iif, g2.o.g((Object)iif)));
                                        }
                                    }
                                    finally {
                                        continue Block_14_Outer;
                                    }
                                    break;
                                }
                                break;
                            }
                            continue;
                        }
                    }
                }
            }
            continue;
        }
    }
}
