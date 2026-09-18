import java.util.ArrayList;

public abstract class kun
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new smn((byte)14), (byte)0);
    }
    
    public static final void a(final igf igf, final pqg pqg, final tze tze, final gun gun, final ye6 ye6, final bua bua, final ypg ypg, final cua cua, final ye6 ye7, final gva gva, final int n) {
        gva.i0(1879465207);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)igf)) {
                n2 = 4;
            }
            else {
                n2 = 2;
            }
            n3 = (n2 | n);
        }
        else {
            n3 = n;
        }
        if ((n & 0x30) == 0x0) {
            int n4;
            if (gva.f((Object)pqg)) {
                n4 = 32;
            }
            else {
                n4 = 16;
            }
            n3 |= n4;
        }
        int n5 = n3;
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.f((Object)tze)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n5 = (n3 | n6);
        }
        int n7 = n5;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.f((Object)gun)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n5 | n8);
        }
        int n9 = n7;
        if ((n & 0x6000) == 0x0) {
            int n10;
            if (gva.h((Object)ye6)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n7 | n10);
        }
        if ((0x30000 & n) == 0x0) {
            int n11;
            if (gva.h((Object)bua)) {
                n11 = 131072;
            }
            else {
                n11 = 65536;
            }
            n9 |= n11;
        }
        int n12 = n9;
        if ((0x180000 & n) == 0x0) {
            int n13;
            if (gva.f((Object)ypg)) {
                n13 = 1048576;
            }
            else {
                n13 = 524288;
            }
            n12 = (n9 | n13);
        }
        int n14 = n12;
        if ((0xC00000 & n) == 0x0) {
            int n15;
            if (gva.h((Object)cua)) {
                n15 = 8388608;
            }
            else {
                n15 = 4194304;
            }
            n14 = (n12 | n15);
        }
        if ((0x6000000 & n) == 0x0) {
            int n16;
            if (gva.h((Object)ye7)) {
                n16 = 67108864;
            }
            else {
                n16 = 33554432;
            }
            n14 |= n16;
        }
        final int n17 = 1;
        if (gva.W(n14 & 0x1, (0x2492493 & n14) != 0x2492492)) {
            final cib a = bi6.a;
            ypg u0;
            if (ypg == null) {
                gva.g0(-2015147137);
                final boolean b = (n14 & 0x380) == 0x100;
                final Object r = gva.R();
                Object o;
                if (b || (o = r) == a) {
                    o = new uhd(tze, (byte)2);
                    gva.q0(o);
                }
                u0 = uuj.u0((jta)o, cua != null, gva);
                gva.q(false);
            }
            else {
                gva.g0(-2015148191);
                gva.q(false);
                u0 = ypg;
            }
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            int n18;
            if ((n14 & 0x1C00) == 0x800) {
                n18 = n17;
            }
            else {
                n18 = 0;
            }
            final boolean d = gva.d(((Enum)qzc).ordinal());
            final Object r2 = gva.R();
            gun gun2;
            if ((n18 | (d ? 1 : 0)) != 0x0 || (gun2 = (gun)r2) == a) {
                if (qzc == qzc.w) {
                    gun2 = new gun(gun.b, gun.a);
                }
                else {
                    gun2 = gun;
                }
                gva.q0((Object)gun2);
            }
            final gun a2 = gun2;
            final d4j e = k8e.E((Object)fun.d, gva);
            if (!mlc.q((Object)((zmk)tze.w).y.getValue(), (Object)tze.j())) {
                final tun tun = (tun)((zmk)tze.w).y.getValue();
                final tun j = tze.j();
                a2.getClass();
                final kqg[] array = new kqg[3];
                for (int i = 0; i < 3; ++i) {
                    array[i] = new kqg(0);
                }
                final ArrayList list = new ArrayList(3);
                for (int k = 0; k < 3; ++k) {
                    list.add((Object)wab.S);
                }
                final Object o2 = new Object();
                ((z3j)o2).v = 3;
                final Object o3 = new Object();
                ((z3j)o3).v = 3;
                final Object o4 = new Object();
                ((z3j)o4).v = -1;
                final Object o5 = new Object();
                ((z3j)o5).v = -1;
                a2.a((zta)new is((Object)array, (Object)tun, (Object)j, o2, o4, (Object)list, o3, o5, (byte)15));
                final Object o6 = new Object();
                final Object o7 = new Object();
                final Object o8 = new Object();
                ((z3j)o8).v = 3;
                final Object o9 = new Object();
                ((z3j)o9).v = -1;
                a2.a((zta)new ps(o2, o3, o4, o5, (Object)array, (Object)list, o6, o8, o7, o9, (byte)3));
                a2.a((zta)new is(o2, o4, o8, o9, (Object)array, (Object)list, o6, o7, (byte)16));
                a2.a((zta)new o2d((Object)array, (Object)list, (byte)29));
                e.a = new fun((jqg)list.get(a2.b(oun.v)), (jqg)list.get(a2.b(oun.w)), (jqg)list.get(a2.b(oun.x)));
            }
            final fun fun = (fun)e.a;
            Object r3;
            if ((r3 = gva.R()) == a) {
                r3 = new mun();
                gva.q0(r3);
            }
            final mun mun = (mun)r3;
            mun.e = tze;
            mun.a = a2;
            for (byte h = mun.h, b2 = 0; b2 < h; ++b2) {
                final oun c = mun.c(b2);
                final lqg a3 = mun.a(b2);
                a3.a.setValue((Object)fun.a(c));
                a3.g = false;
            }
            gva.g0(407832974);
            final efo r4 = xp7.R((r1)tze.w, "ThreePaneScaffoldState", gva, 56, 0);
            gva.q(false);
            Object r5;
            if ((r5 = gva.R()) == a) {
                r5 = new run(mun);
                gva.q0(r5);
            }
            final run run = (run)r5;
            run.x = tze;
            run.w = r4;
            yi2.f(uuj.t0(-2135424586, (aua)new hun(r4, tze, run, lq6.f0(gva), igf, pqg, gun, bua, u0, cua, mun, ye7, fun, ye6), gva), gva, 6);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new iun(igf, pqg, tze, gun, ye6, bua, ypg, cua, ye7, n);
        }
    }
}
