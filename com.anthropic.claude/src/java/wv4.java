import androidx.compose.ui.node.LayoutNode;
import com.anthropic.claude.app.ClaudeAppOverlay;

public abstract class wv4
{
    public static final void a(final pqg pqg, final lta lta, final gva gva, final int n) {
        gva.i0(1344168964);
        int n2;
        if (gva.f((Object)pqg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)lta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        boolean b = false;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            zp4 zp4;
            if (pqg.a > 1) {
                zp4 = zp4.w;
            }
            else {
                zp4 = zp4.v;
            }
            if ((n4 & 0x70) == 0x20) {
                b = true;
            }
            final boolean d = gva.d(((Enum)zp4).ordinal());
            final Object r = gva.R();
            Object o;
            if ((d | b) || (o = r) == bi6.a) {
                o = new e4((Object)lta, (Object)zp4, (byte)25);
                gva.q0(o);
            }
            mlc.a((Object)zp4, (lta)o, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ah0((Object)pqg, (Object)lta, n, (byte)18);
        }
    }
    
    public static final void b(final frg frg, final gwj gwj, final jta jta, final igf igf, final pqg pqg, st4 st4, final gva gva, final int n) {
        gva.i0(-860885147);
        int n2;
        if (gva.f((Object)frg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.f((Object)gwj)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        int n4;
        if (gva.h((Object)jta)) {
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
        int n6;
        if (gva.f((Object)pqg)) {
            n6 = 16384;
        }
        else {
            n6 = 8192;
        }
        final int n7 = n | n2 | n3 | n4 | n5 | n6 | 0x10000;
        if (gva.W(n7 & 0x1, (0x12493 & n7) != 0x12492)) {
            gva.b0();
            final cib a = bi6.a;
            int n8;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n8 = (n7 & 0xFFF8FFFF);
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (st4 = (st4)r) == a) {
                    st4 = (st4)a2.d((Class)st4.class, (emi)null);
                    gva.q0((Object)st4);
                }
                st4 = st4;
                n8 = (n7 & 0xFFF8FFFF);
            }
            gva.r();
            final hwj hwj = (hwj)gva.j((sei)iwj.a);
            final nx8 h = arf.h(gva);
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new adf();
                gva.q0(r2);
            }
            final adf adf = (adf)r2;
            Object o;
            if ((o = gva.R()) == a) {
                o = mlc.z((hc7)o89.v, gva);
                gva.q0(o);
            }
            final oc7 oc7 = (oc7)o;
            final boolean f3 = gva.f((Object)h);
            final boolean f4 = gva.f((Object)oc7);
            final boolean f5 = gva.f((Object)st4);
            final Object r3 = gva.R();
            Object o2;
            if ((f3 | f4 | f5) || (o2 = r3) == a) {
                o2 = new je4((Object)st4, (Object)oc7, (Object)h, (byte)13);
                gva.q0(o2);
            }
            final jta jta2 = (jta)o2;
            final dlb o3 = ri2.o0(gva);
            final int n9 = n8 & 0xE;
            final odk odk = (odk)gva.j((sei)ii8.a);
            final boolean b = ((n9 ^ 0x6) > 4 && gva.f((Object)frg)) || (n8 & 0x6) == 0x4;
            Object r4 = gva.R();
            if (b || r4 == a) {
                r4 = new xv4(frg, (qo4)odk.d((Class)qo4.class, (emi)null));
                gva.q0(r4);
            }
            final xv4 xv4 = (xv4)r4;
            pqg a3 = null;
            Label_0647: {
                if (xv4.c.h() <= 0) {
                    if (pqg.a > 1) {
                        a3 = pqg;
                        break Label_0647;
                    }
                }
                a3 = pqg.a(pqg, 1, 0.0f, 94);
            }
            final boolean b2 = n9 == 4;
            final Object r5 = gva.R();
            Object o4;
            if (b2 || (o4 = r5) == a) {
                o4 = new pn3(frg, (byte)1);
                gva.q0(o4);
            }
            a(a3, (lta)o4, gva, 0);
            final boolean c = h.c();
            final boolean h2 = gva.h((Object)oc7);
            final boolean f6 = gva.f((Object)h);
            final Object r6 = gva.R();
            Object o5;
            if ((h2 | f6) || (o5 = r6) == a) {
                o5 = new nu4(oc7, h, (byte)1);
                gva.q0(o5);
            }
            omo.a(0, 0, (jta)o5, gva, c);
            final boolean f7 = gva.f((Object)o3);
            final Object r7 = gva.R();
            Object o6;
            if (f7 || (o6 = r7) == a) {
                o6 = new tv4(o3, (byte)0);
                gva.q0(o6);
            }
            c(h, (jta)o6, gva, 0);
            if (qt7.y(gwj) instanceof ClaudeAppOverlay.None) {
                gva.g0(-1377489200);
                eqi.H((vfj)null, (st4)null, (z8b)null, gva, 0);
                gva.q(false);
            }
            else {
                gva.g0(-1377445955);
                gva.q(false);
            }
            final moe c2 = rj2.c((gx)wab.x, false);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b3 = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c2);
            k8e.P((zta)awp.z, gva, (Object)l);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b3);
            arf.d(uuj.t0(231234296, (aua)new hs((Object)o3, (Object)h, (Object)frg, (Object)adf, (byte)28), gva), (igf)null, h, h.c(), 0L, uuj.t0(342226877, (aua)new lt0((Object)frg, (Object)gwj, (Object)xv4, (Object)h, (aua)jta2, (Object)jta, (Object)a3, (Object)hwj, (Object)adf, (byte)2), gva), gva, 196614);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new fq((Object)frg, (Object)gwj, (aua)jta, igf, (Object)pqg, (Object)st4, n, (byte)5);
        }
    }
    
    public static final void c(final nx8 nx8, final jta jta, final gva gva, final int n) {
        gva.i0(-2071348784);
        int n2;
        if (gva.f((Object)nx8)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)jta)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        boolean b = false;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final bnf w = o50.W((Object)jta, gva);
            if ((n4 & 0xE) == 0x4) {
                b = true;
            }
            final boolean f = gva.f((Object)w);
            final Object r = gva.R();
            Object o;
            if ((f | b) || (o = r) == bi6.a) {
                o = new g24((Object)nx8, (Object)w, (f07)null, (byte)23);
                gva.q0(o);
            }
            mlc.f((zta)o, gva, (Object)nx8);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new n84((Object)nx8, (Object)jta, n, (byte)11);
        }
    }
}
