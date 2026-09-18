import kotlinx.serialization.KSerializer;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItemSelected;
import com.anthropic.claude.analytics.events.DrawerEvents$DrawerItem;
import java.util.Set;

public abstract class zu4
{
    public static final void a(final alb alb, final nx8 nx8, final frg frg, final igf igf, vq vq, st4 st4, jj4 jj4, ax3 ax3, krf krf, t46 t46, vk6 vk6, final bk4 bk4, final gva gva, final int n) {
        gva.i0(1571682450);
        int n2;
        if (gva.f((Object)alb)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)nx8)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.f((Object)frg)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.f((Object)igf)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n | n2 | n3 | n4 | n5 | 0x12492000;
        bk4 bk6;
        ax3 ax4;
        krf krf3;
        if (gva.W(n6 & 0x1, (0x12492493 & n6) != 0x12492492)) {
            gva.b0();
            final cib a = bi6.a;
            jj4 jj5;
            bk4 bk5;
            int n7;
            Object o;
            st4 st6;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final st4 st5 = st4;
                jj5 = jj4;
                bk5 = bk4;
                n7 = (n6 & 0x80001FFF);
                o = vq;
                st6 = st5;
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (vq = (vq)r) == a) {
                    vq = (vq)a2.d((Class)vq.class, (emi)null);
                    gva.q0((Object)vq);
                }
                o = vq;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o2;
                if ((f3 | f4) || (o2 = r2) == a) {
                    o2 = a3.d((Class)st4.class, (emi)null);
                    gva.q0(o2);
                }
                st4 = (st4)o2;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o3;
                if ((f5 | f6) || (o3 = r3) == a) {
                    o3 = a4.d((Class)jj4.class, (emi)null);
                    gva.q0(o3);
                }
                final jj4 jj6 = (jj4)o3;
                final odk a5 = ii8.a(gva);
                final boolean f7 = gva.f((Object)null);
                final boolean f8 = gva.f((Object)a5);
                final Object r4 = gva.R();
                Object o4;
                if ((f7 | f8) || (o4 = r4) == a) {
                    o4 = a5.d((Class)ax3.class, (emi)null);
                    gva.q0(o4);
                }
                ax3 = (ax3)o4;
                final odk a6 = ii8.a(gva);
                final boolean f9 = gva.f((Object)null);
                final boolean f10 = gva.f((Object)a6);
                final Object r5 = gva.R();
                Object o5;
                if ((f9 | f10) || (o5 = r5) == a) {
                    o5 = a6.d((Class)krf.class, (emi)null);
                    gva.q0(o5);
                }
                krf = (krf)o5;
                final odk a7 = ii8.a(gva);
                final boolean f11 = gva.f((Object)null);
                final boolean f12 = gva.f((Object)a7);
                final Object r6 = gva.R();
                Object o6;
                if ((f11 | f12) || (o6 = r6) == a) {
                    o6 = a7.d((Class)t46.class, (emi)null);
                    gva.q0(o6);
                }
                t46 = (t46)o6;
                n7 = (n6 & 0x80001FFF);
                final odk a8 = ii8.a(gva);
                final boolean f13 = gva.f((Object)null);
                final boolean f14 = gva.f((Object)a8);
                Object r7 = gva.R();
                if ((f13 | f14) || r7 == a) {
                    r7 = a8.d((Class)vk6.class, (emi)null);
                    gva.q0(r7);
                }
                vk6 = (vk6)r7;
                final odk a9 = ii8.a(gva);
                final boolean f15 = gva.f((Object)null);
                final boolean f16 = gva.f((Object)a9);
                Object r8 = gva.R();
                if ((f15 | f16) || r8 == a) {
                    r8 = a9.d((Class)bk4.class, (emi)null);
                    gva.q0(r8);
                }
                bk5 = (bk4)r8;
                st6 = st4;
                jj5 = jj6;
            }
            gva.r();
            Object o7;
            if ((o7 = gva.R()) == a) {
                o7 = mlc.z((hc7)o89.v, gva);
                gva.q0(o7);
            }
            final oc7 oc7 = (oc7)o7;
            final q65 x = ao2.X(gva);
            final boolean h = gva.h(o);
            Object r9 = gva.R();
            if (h || r9 == a) {
                r9 = new pn((byte)4, (f07)null, o);
                gva.q0(r9);
            }
            mlc.f((zta)r9, gva, (Object)lqo.a);
            if (nx8.b.i.getValue() == yx8.w) {
                gva.g0(-1740519231);
                final boolean h2 = gva.h((Object)oc7);
                final boolean b = (n7 & 0x70) == 0x20;
                Object r10 = gva.R();
                if ((h2 | b) || r10 == a) {
                    r10 = new nu4(oc7, nx8, (byte)0);
                    gva.q0(r10);
                }
                mi9.a((jta)r10, gva, 0);
                gva.q(false);
            }
            else {
                gva.g0(-1740443312);
                gva.q(false);
            }
            final xll a10 = lx8.a(frg, vk6);
            final boolean d = x.d;
            final vr vr = (vr)o;
            final String s = (String)vr.w.g.getValue();
            final boolean h3 = gva.h((Object)st6);
            final boolean h4 = gva.h((Object)oc7);
            final int n8 = n7 & 0x70;
            final boolean b2 = n8 == 32;
            final int n9 = n7 & 0x380;
            final boolean b3 = n9 == 256;
            Object r11 = gva.R();
            if ((h3 | h4 | b2 | b3) || r11 == a) {
                r11 = new pu4(frg, st6, oc7, nx8, (byte)4);
                gva.q0(r11);
            }
            final jta jta = (jta)r11;
            final boolean h5 = gva.h((Object)st6);
            final boolean h6 = gva.h((Object)oc7);
            final boolean b4 = n8 == 32;
            final boolean b5 = n9 == 256;
            final Object r12 = gva.R();
            Object o8;
            if ((h5 | h6 | b4 | b5) || (o8 = r12) == a) {
                o8 = new pu4(frg, st6, oc7, nx8, (byte)5);
                gva.q0(o8);
            }
            final jta jta2 = (jta)o8;
            final boolean h7 = gva.h((Object)st6);
            final boolean h8 = gva.h((Object)oc7);
            final boolean b6 = n8 == 32;
            final boolean b7 = n9 == 256;
            final boolean h9 = gva.h((Object)t46);
            final boolean h10 = gva.h((Object)krf);
            Object r13 = gva.R();
            if ((h7 | h8 | b6 | b7 | h9 | h10) || r13 == a) {
                r13 = new ou4(frg, t46, krf, st6, oc7, nx8, (byte)0);
                gva.q0(r13);
            }
            final jta jta3 = (jta)r13;
            final boolean h11 = gva.h((Object)st6);
            final boolean h12 = gva.h((Object)oc7);
            final boolean b8 = n8 == 32;
            final boolean b9 = n9 == 256;
            final Object r14 = gva.R();
            Object o9;
            if ((h11 | h12 | b8 | b9) || (o9 = r14) == a) {
                o9 = new pu4(frg, st6, oc7, nx8, (byte)0);
                gva.q0(o9);
            }
            final jta jta4 = (jta)o9;
            final boolean h13 = gva.h((Object)st6);
            final boolean h14 = gva.h((Object)oc7);
            final boolean b10 = n8 == 32;
            final boolean b11 = n9 == 256;
            final boolean h15 = gva.h((Object)t46);
            final boolean h16 = gva.h((Object)krf);
            final Object r15 = gva.R();
            Object o10;
            if ((h13 | h14 | b10 | b11 | h15 | h16) || (o10 = r15) == a) {
                o10 = new ou4(frg, t46, krf, st6, oc7, nx8, (byte)1);
                gva.q0(o10);
            }
            final jta jta5 = (jta)o10;
            final boolean b12 = n9 == 256;
            final boolean h17 = gva.h((Object)vk6);
            final boolean h18 = gva.h((Object)st6);
            final boolean h19 = gva.h((Object)oc7);
            final boolean b13 = n8 == 32;
            final boolean h20 = gva.h((Object)jj5);
            final boolean h21 = gva.h((Object)krf);
            final boolean h22 = gva.h((Object)ax3);
            final boolean h23 = gva.h((Object)t46);
            final boolean f17 = gva.f((Object)x);
            Object r16 = gva.R();
            if ((b13 | (b12 | h17 | h18 | h19) | h20 | h21 | h22 | h23 | f17) || r16 == a) {
                r16 = new qu4((Object)frg, (Object)vk6, (Object)st6, (Object)jj5, (Object)oc7, (Object)krf, (Object)ax3, (Object)t46, (Object)x, (Object)nx8, (byte)0);
                gva.q0(r16);
            }
            final lta lta = (lta)r16;
            final boolean h24 = gva.h((Object)st6);
            final boolean h25 = gva.h((Object)oc7);
            final boolean b14 = n8 == 32;
            final boolean b15 = n9 == 256;
            final Object r17 = gva.R();
            Object o11;
            if ((h24 | h25 | b14 | b15) || (o11 = r17) == a) {
                o11 = new wu4(st6, oc7, nx8, frg);
                gva.q0(o11);
            }
            final lta lta2 = (lta)o11;
            final boolean h26 = gva.h((Object)st6);
            final boolean h27 = gva.h((Object)oc7);
            final boolean b16 = n8 == 32;
            final boolean b17 = n9 == 256;
            Object r18 = gva.R();
            if ((h26 | h27 | b16 | b17) || r18 == a) {
                r18 = new pu4(frg, st6, oc7, nx8, (byte)1);
                gva.q0(r18);
            }
            final jta jta6 = (jta)r18;
            final boolean h28 = gva.h((Object)st6);
            final boolean h29 = gva.h((Object)oc7);
            final boolean b18 = n8 == 32;
            final boolean b19 = n9 == 256;
            Object r19 = gva.R();
            if ((h28 | h29 | b18 | b19) || r19 == a) {
                r19 = new pu4(frg, st6, oc7, nx8, (byte)2);
                gva.q0(r19);
            }
            final jta jta7 = (jta)r19;
            final int n10 = n7 & 0xE;
            final boolean b20 = n10 == 4;
            Object r20 = gva.R();
            if (b20 || r20 == a) {
                r20 = new ru4(alb, (byte)0);
                gva.q0(r20);
            }
            final lta lta3 = (lta)r20;
            final boolean b21 = n10 == 4;
            Object r21 = gva.R();
            if (b21 || r21 == a) {
                r21 = new ru4(alb, (byte)1);
                gva.q0(r21);
            }
            final lta lta4 = (lta)r21;
            final boolean h30 = gva.h((Object)st6);
            final boolean h31 = gva.h((Object)oc7);
            final boolean b22 = n8 == 32;
            final boolean b23 = n9 == 256;
            final Object r22 = gva.R();
            Object o12;
            if ((b23 | (h30 | h31 | b22)) || (o12 = r22) == a) {
                o12 = new uu4(st6, oc7, nx8, frg);
                gva.q0(o12);
            }
            final lta lta5 = (lta)o12;
            final boolean b24 = n10 == 4;
            Object r23 = gva.R();
            if (b24 || r23 == a) {
                r23 = new vg4((Object)alb, (byte)3);
                gva.q0(r23);
            }
            final jta jta8 = (jta)r23;
            final boolean h32 = gva.h((Object)st6);
            final boolean h33 = gva.h((Object)oc7);
            final boolean b25 = n8 == 32;
            final boolean b26 = n9 == 256;
            final Object r24 = gva.R();
            Object o13;
            if ((b25 | (h32 | h33) | b26) || (o13 = r24) == a) {
                o13 = new pu4(st6, oc7, nx8, frg);
                gva.q0(o13);
            }
            final jta jta9 = (jta)o13;
            final boolean h34 = gva.h((Object)st6);
            final boolean b27 = n10 == 4;
            final boolean h35 = gva.h((Object)oc7);
            final boolean b28 = n8 == 32;
            final boolean b29 = n9 == 256;
            final boolean h36 = gva.h((Object)jj5);
            Object r25 = gva.R();
            if ((b27 | h34 | h35 | b28 | b29 | h36) || r25 == a) {
                r25 = new yq((Object)st6, (Object)alb, (Object)frg, (Object)jj5, (Object)oc7, (Object)nx8, (byte)4);
                gva.q0(r25);
            }
            final jta jta10 = (jta)r25;
            final boolean h37 = gva.h((Object)st6);
            final boolean h38 = gva.h((Object)oc7);
            final boolean b30 = n8 == 32;
            final boolean b31 = n9 == 256;
            final boolean h39 = gva.h((Object)jj5);
            Object r26 = gva.R();
            if ((h37 | h38 | b30 | b31 | h39) || r26 == a) {
                r26 = new er((Object)frg, (Object)jj5, (Object)st6, (Object)oc7, (Object)nx8, (byte)12);
                gva.q0(r26);
            }
            final jta jta11 = (jta)r26;
            final boolean h40 = gva.h((Object)st6);
            final boolean h41 = gva.h((Object)oc7);
            final boolean b32 = n8 == 32;
            final boolean h42 = gva.h((Object)bk5);
            final boolean b33 = n9 == 256;
            Object r27 = gva.R();
            if ((h40 | h41 | b32 | h42 | b33) || r27 == a) {
                r27 = new er((Object)bk5, (Object)frg, (Object)st6, (Object)oc7, (Object)nx8, (byte)13);
                gva.q0(r27);
            }
            yi2.d(alb, nx8, (Set)a10, jta, jta2, jta3, jta4, jta5, lta, d, lta2, jta6, jta7, lta3, lta4, lta5, jta8, jta9, jta10, jta11, (jta)r27, igf, false, false, s, false, false, gva, n7 & 0x7E, n7 >> 6 & 0x70);
            final Object o14 = vr;
            final st4 st7 = st6;
            final krf krf2 = krf;
            bk6 = bk5;
            jj4 = jj5;
            vq = (vq)o14;
            st4 = st7;
            ax4 = ax3;
            krf3 = krf2;
        }
        else {
            gva.Z();
            ax4 = ax3;
            krf3 = krf;
            bk6 = bk4;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new su4(alb, nx8, frg, igf, vq, st4, jj4, ax4, krf3, t46, vk6, bk6, n);
        }
    }
    
    public static final void b(final st4 st4, final oc7 oc7, final nx8 nx8, final DrawerEvents$DrawerItem drawerEvents$DrawerItem) {
        final DrawerEvents$DrawerItemSelected drawerEvents$DrawerItemSelected = new DrawerEvents$DrawerItemSelected(drawerEvents$DrawerItem);
        final KSerializer serializer = DrawerEvents$DrawerItemSelected.Companion.serializer();
        vt4.b0(serializer);
        st4.b((v10)drawerEvents$DrawerItemSelected, (KSerializer)serializer);
        rhc.G(oc7, (hc7)null, 0, (zta)new vu4(nx8, (f07)null, (byte)2), 3);
    }
}
