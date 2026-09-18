import androidx.compose.ui.node.LayoutNode;
import androidx.compose.foundation.b;

public abstract class f0f
{
    public static final int a = 0;
    
    static {
        omo.l(4.0f, 0.0f, 2);
        kih.a.getValue().getClass();
    }
    
    public static final void a(final igf igf, final enf enf, final jta jta, final ufk ufk, final aql aql, final long n, final float n2, final ye6 ye6, final gva gva, final int n3) {
        final Integer value = 0;
        gva.i0(-1278879194);
        int n4;
        if (gva.f((Object)igf)) {
            n4 = 4;
        }
        else {
            n4 = 2;
        }
        int n5;
        if (gva.f((Object)enf)) {
            n5 = 32;
        }
        else {
            n5 = 16;
        }
        int n6;
        if (gva.h((Object)jta)) {
            n6 = 256;
        }
        else {
            n6 = 128;
        }
        int n7;
        if (gva.f((Object)ufk)) {
            n7 = 2048;
        }
        else {
            n7 = 1024;
        }
        int n8;
        if (gva.f((Object)aql)) {
            n8 = 16384;
        }
        else {
            n8 = 8192;
        }
        int n9;
        if (gva.e(n)) {
            n9 = 131072;
        }
        else {
            n9 = 65536;
        }
        int n10;
        if (gva.c(0.0f)) {
            n10 = 1048576;
        }
        else {
            n10 = 524288;
        }
        int n11;
        if (gva.c(n2)) {
            n11 = 8388608;
        }
        else {
            n11 = 4194304;
        }
        int n12;
        if (gva.f((Object)null)) {
            n12 = 67108864;
        }
        else {
            n12 = 33554432;
        }
        int n13;
        if (gva.h((Object)ye6)) {
            n13 = 536870912;
        }
        else {
            n13 = 268435456;
        }
        final int n14 = n3 | n4 | n5 | n6 | n7 | n8 | n9 | n10 | n11 | n12 | n13;
        if (gva.W(n14 & 0x1, (n14 & 0x12492493) != 0x12492492)) {
            final efo r = xp7.R((r1)enf, "DropDownMenu", gva, ((n14 >> 3 & 0xE) | 0x30) & 0x7E, 0);
            final ygm x = zrn.X(1, gva);
            final ygm x2 = zrn.X(4, gva);
            final d0f d0f = new d0f(x, (byte)0);
            final elo e = yi2.e;
            final boolean h = r.h();
            final r1 a = r.a;
            final lta lta = null;
            final cib a2 = bi6.a;
            Object o = null;
            Label_0519: {
                if (!h) {
                    gva.g0(1666573488);
                    final boolean f = gva.f((Object)r);
                    final Object r2 = gva.R();
                    while (true) {
                        if (!f && (o = r2) != a2) {
                            break Label_0415;
                        }
                        final r7m r7m = q7m.a();
                        Label_0478: {
                            Label_0441: {
                                if (r7m != null) {
                                    o = r7m.e();
                                    break Label_0441;
                                }
                                o = null;
                                break Label_0441;
                                break Label_0478;
                            }
                            final r7m b = q7m.b(r7m);
                            try {
                                final Object i = a.i();
                                q7m.d(r7m, b, (lta)o);
                                gva.q0(i);
                                o = i;
                                continue;
                                gva.q(false);
                                break Label_0519;
                            }
                            finally {
                                q7m.d(r7m, b, (lta)o);
                            }
                        }
                        break;
                    }
                }
                gva.g0(1666827533);
                gva.q(false);
                o = a.i();
            }
            final boolean booleanValue = (boolean)o;
            gva.g0(-904349302);
            float n15 = 0.8f;
            final float n16 = 1.0f;
            float n17;
            if (booleanValue) {
                n17 = 1.0f;
            }
            else {
                n17 = 0.8f;
            }
            gva.q(false);
            final boolean f2 = gva.f((Object)r);
            final Object r3 = gva.R();
            Object b2;
            if (f2 || (b2 = r3) == a2) {
                b2 = r8m.b((jta)new dp4(r, (byte)6));
                gva.q0(b2);
            }
            final boolean booleanValue2 = (boolean)((xom)b2).getValue();
            gva.g0(-904349302);
            if (booleanValue2) {
                n15 = 1.0f;
            }
            gva.q(false);
            final boolean f3 = gva.f((Object)r);
            final Object r4 = gva.R();
            Object b3;
            if (f3 || (b3 = r4) == a2) {
                b3 = r8m.b((jta)new dp4(r, (byte)7));
                gva.q0(b3);
            }
            final zeo u = xp7.u(r, (Object)n17, (Object)n15, (bfa)d0f.h(((xom)b3).getValue(), (Object)gva, (Object)value), (dlo)e, gva, 0);
            final d0f d0f2 = new d0f(x2, (byte)1);
            Object o3 = null;
            Label_0924: {
                if (!r.h()) {
                    gva.g0(1666573488);
                    final boolean f4 = gva.f((Object)r);
                    Object o2 = gva.R();
                    while (true) {
                        if (!f4 && (o3 = o2) != a2) {
                            break Label_0822;
                        }
                        o2 = q7m.a();
                        o3 = lta;
                        if (o2 != null) {
                            o3 = ((r7m)o2).e();
                        }
                        Label_0883: {
                            Label_0846: {
                                break Label_0846;
                                break Label_0883;
                            }
                            final r7m r7m = q7m.b((r7m)o2);
                            try {
                                final Object j = a.i();
                                q7m.d((r7m)o2, r7m, (lta)o3);
                                gva.q0(j);
                                o3 = j;
                                continue;
                                gva.q(false);
                                break Label_0924;
                            }
                            finally {
                                q7m.d((r7m)o2, r7m, (lta)o3);
                            }
                        }
                        break;
                    }
                }
                gva.g0(1666827533);
                gva.q(false);
                o3 = a.i();
            }
            final boolean booleanValue3 = (boolean)o3;
            gva.g0(2062693622);
            float n18;
            if (booleanValue3) {
                n18 = 1.0f;
            }
            else {
                n18 = 0.0f;
            }
            gva.q(false);
            final boolean f5 = gva.f((Object)r);
            final Object r5 = gva.R();
            Object b4;
            if (f5 || (b4 = r5) == a2) {
                b4 = r8m.b((jta)new dp4(r, (byte)8));
                gva.q0(b4);
            }
            final boolean booleanValue4 = (boolean)((xom)b4).getValue();
            gva.g0(2062693622);
            float n19;
            if (booleanValue4) {
                n19 = n16;
            }
            else {
                n19 = 0.0f;
            }
            gva.q(false);
            final boolean f6 = gva.f((Object)r);
            final Object r6 = gva.R();
            Object b5;
            if (f6 || (b5 = r6) == a2) {
                b5 = r8m.b((jta)new dp4(r, (byte)9));
                gva.q0(b5);
            }
            final bfa bfa = (bfa)d0f2.h(((xom)b5).getValue(), (Object)gva, (Object)value);
            boolean b6 = true;
            final zeo u2 = xp7.u(r, (Object)n18, (Object)n19, bfa, (dlo)e, gva, 0);
            final boolean booleanValue5 = (boolean)gva.j((sei)nec.a);
            final boolean g = gva.g(booleanValue5);
            final boolean f7 = gva.f((Object)u);
            final boolean b7 = (n14 & 0x70) == 0x20;
            final boolean f8 = gva.f((Object)u2);
            if ((n14 & 0x380) != 0x100) {
                b6 = false;
            }
            Object r7 = gva.R();
            if ((g | f7 | b7 | f8 | b6) || r7 == a2) {
                r7 = new ye4(booleanValue5, enf, jta, u, u2);
                gva.q0(r7);
            }
            final igf f9 = zrn.F((igf)fgf.v, (lta)r7);
            final ye6 t0 = uuj.t0(-816027071, (aua)new wre(igf, ufk, ye6), gva);
            final int n20 = n14 >> 9;
            final int n21 = n14 >> 6;
            a6n.a(f9, aql, n, 0L, 0.0f, n2, null, (zta)t0, gva, (n20 & 0x380) | ((n20 & 0x70) | 0xC00000) | (0xE000 & n21) | (0x70000 & n21) | (n21 & 0x380000), 8);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new e0f(igf, enf, jta, ufk, aql, n, n2, ye6, n3);
        }
    }
    
    public static final void b(final ye6 ye6, final jta jta, final igf igf, final zta zta, final boolean b, final uze uze, final dng dng, final gva gva, final int n) {
        gva.i0(-1325192924);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)ye6)) {
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
            if (gva.h((Object)jta)) {
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
            if (gva.f((Object)igf)) {
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
            if (gva.h((Object)zta)) {
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
            if (gva.h((Object)null)) {
                n10 = 16384;
            }
            else {
                n10 = 8192;
            }
            n9 = (n7 | n10);
        }
        int n11 = n9;
        if ((0x30000 & n) == 0x0) {
            int n12;
            if (gva.g(b)) {
                n12 = 131072;
            }
            else {
                n12 = 65536;
            }
            n11 = (n9 | n12);
        }
        int n13 = n11;
        if ((0x180000 & n) == 0x0) {
            int n14;
            if (gva.f((Object)uze)) {
                n14 = 1048576;
            }
            else {
                n14 = 524288;
            }
            n13 = (n11 | n14);
        }
        int n15 = n13;
        if ((0xC00000 & n) == 0x0) {
            int n16;
            if (gva.f((Object)dng)) {
                n16 = 8388608;
            }
            else {
                n16 = 4194304;
            }
            n15 = (n13 | n16);
        }
        int n17 = n15;
        if ((0x6000000 & n) == 0x0) {
            int n18;
            if (gva.f((Object)null)) {
                n18 = 67108864;
            }
            else {
                n18 = 33554432;
            }
            n17 = (n15 | n18);
        }
        if (gva.W(n17 & 0x1, (0x2492493 & n17) != 0x2492492)) {
            final igf t = omo.T(androidx.compose.foundation.layout.b.t(androidx.compose.foundation.layout.b.d(b.b(igf, (llf)null, utj.a(true, 0.0f, 0L, null, 254), b, (String)null, (iuj)null, jta, 24), 1.0f), 112.0f, 48.0f, 280.0f, 8), dng);
            final jzj a = hzj.a((gv0)t08.a, wab.H, gva, 48);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b2 = ien.B(gva, t);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)a);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b2);
            lmn.a(((e8e)gva.j((sei)h8e.a)).b.m, (zta)uuj.t0(865999929, (aua)new mu0((Object)zta, (Object)uze, b, (Object)ye6, (byte)20), gva), gva, 48);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new c0f(ye6, jta, igf, zta, b, uze, dng, n);
        }
    }
    
    public static final long c(final ygc ygc, final ygc ygc2) {
        final int a = ygc2.a;
        final int d = ygc2.d;
        final int c = ygc2.c;
        final int b = ygc2.b;
        final int c2 = ygc.c;
        final int b2 = ygc.b;
        final int d2 = ygc.d;
        final int a2 = ygc.a;
        float n = 1.0f;
        float n2 = 0.0f;
        Label_0118: {
            if (a < c2) {
                if (c <= a2) {
                    n2 = 1.0f;
                    break Label_0118;
                }
                if (ygc2.f() != 0) {
                    n2 = ((Math.min(ygc.c, c) + Math.max(a2, a)) / 2 - a) / (float)ygc2.f();
                    break Label_0118;
                }
            }
            n2 = 0.0f;
        }
        if (b < d2) {
            if (d <= b2) {
                return ncq.h(n2, n);
            }
            if (ygc2.c() != 0) {
                n = ((Math.min(d2, d) + Math.max(b2, b)) / 2 - b) / (float)ygc2.c();
                return ncq.h(n2, n);
            }
        }
        n = 0.0f;
        return ncq.h(n2, n);
    }
}
