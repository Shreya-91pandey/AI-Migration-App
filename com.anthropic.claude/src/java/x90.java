import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import android.webkit.WebSettings;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;
import java.util.Map;
import androidx.compose.foundation.layout.b;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.KSerializer;
import android.content.res.Configuration;

public abstract class x90
{
    public static final f07[] a;
    public static final vzq b;
    public static final dqb c;
    public static final p90 d;
    public static final p90 e;
    public static final p90 f;
    public static final y7j g;
    public static boolean h;
    
    public static dq8 A(final opc opc, final qpc qpc) {
        if (opc instanceof bqc) {
            return ((bqc)opc).P(true, qpc);
        }
        return opc.X(qpc.m(), true, new d3a((Object)qpc));
    }
    
    public static final boolean B(final hc7 hc7) {
        final opc opc = (opc)hc7.M0((gc7)o55.z);
        return opc == null || opc.c();
    }
    
    public static final boolean C(final String s) {
        for (int i = 0; i < s.length(); ++i) {
            final char char1 = s.charAt(i);
            if (char1 >= '\u0080' || Character.isLetter(char1)) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean D(final gva gva) {
        return (((Configuration)gva.j((sei)q50.a)).uiMode & 0x30) == 0x20;
    }
    
    public static final wmm E(final wja wja, final oc7 oc7) {
        return rhc.G(oc7, null, 0, new pn((byte)13, null, wja), 3);
    }
    
    public static igf F(final igf igf, final p90 p2) {
        return igf.E((igf)new leh(p2));
    }
    
    public static final byte[] G(final vzk vzk, final Object o, final rjc rjc) {
        Label_0033: {
            try {
                final String m = vzk.m(o);
                if (m != null) {
                    final byte[] bytes = m.getBytes(ui3.a);
                    bytes.getClass();
                    return bytes;
                }
            }
            finally {
                break Label_0033;
            }
            return null;
        }
        final Throwable t;
        c5q.F(rjc, 5, lq6.Y(qjc.v, qjc.x), (jta)new rth(o, (byte)6), t, 48);
        return null;
    }
    
    public static final jd H(final vqd vqd) {
        String b;
        if ((b = v4j.a((Class)vqd.getClass()).b()) == null) {
            b = "unknown";
        }
        return new jd(oz1.o(b, "@", vqd.hashCode()), uoo.S(vqd), vqd.a());
    }
    
    public static String I(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return "disabled";
        }
        if (d == 1) {
            return "time_based_default";
        }
        if (d == 2) {
            return "time_based_custom";
        }
        if (d == 3) {
            return "custom";
        }
        en9.r();
        return null;
    }
    
    public static String J(final mxf mxf) {
        if (mxf != null) {
            if (mxf instanceof kxf) {
                final int ordinal = ((Enum)mxf).ordinal();
                if (ordinal == 0) {
                    return "disabled";
                }
                if (ordinal == 1) {
                    return "no_action";
                }
                if (ordinal == 2) {
                    return "no_eligible_action";
                }
                if (ordinal == 3) {
                    return "no_previous_view";
                }
                if (ordinal != 4) {
                    en9.r();
                    return null;
                }
            }
            else {
                if (!(mxf instanceof lxf)) {
                    en9.r();
                    return null;
                }
                final int ordinal2 = ((Enum)mxf).ordinal();
                if (ordinal2 == 0) {
                    return "no_resources";
                }
                if (ordinal2 == 1) {
                    return "no_initial_resources";
                }
                if (ordinal2 == 2) {
                    return "not_settled_yet";
                }
                if (ordinal2 != 3) {
                    en9.r();
                    return null;
                }
            }
        }
        return "unknown";
    }
    
    public static final mec K(final dec dec) {
        return new mec(dec.a, dec.b, dec.c, dec.d);
    }
    
    public static String L(final int n) {
        if (n == 0) {
            return "Clear";
        }
        if (n == 1) {
            return "Src";
        }
        if (n == 2) {
            return "Dst";
        }
        if (n == 3) {
            return "SrcOver";
        }
        if (n == 4) {
            return "DstOver";
        }
        if (n == 5) {
            return "SrcIn";
        }
        if (n == 6) {
            return "DstIn";
        }
        if (n == 7) {
            return "SrcOut";
        }
        if (n == 8) {
            return "DstOut";
        }
        if (n == 9) {
            return "SrcAtop";
        }
        if (n == 10) {
            return "DstAtop";
        }
        if (n == 11) {
            return "Xor";
        }
        if (n == 12) {
            return "Plus";
        }
        if (n == 13) {
            return "Modulate";
        }
        if (n == 14) {
            return "Screen";
        }
        if (n == 15) {
            return "Overlay";
        }
        if (n == 16) {
            return "Darken";
        }
        if (n == 17) {
            return "Lighten";
        }
        if (n == 18) {
            return "ColorDodge";
        }
        if (n == 19) {
            return "ColorBurn";
        }
        if (n == 20) {
            return "HardLight";
        }
        if (n == 21) {
            return "Softlight";
        }
        if (n == 22) {
            return "Difference";
        }
        if (n == 23) {
            return "Exclusion";
        }
        if (n == 24) {
            return "Multiply";
        }
        if (n == 25) {
            return "Hue";
        }
        if (n == 26) {
            return "Saturation";
        }
        if (n == 27) {
            return "Color";
        }
        if (n == 28) {
            return "Luminosity";
        }
        return "Unknown";
    }
    
    public static final void M(final gwj gwj, final gva gva) {
        final cib a = bi6.a;
        gva.g0(-415363796);
        gva.g0(-845455153);
        final b09 a2 = nec.a;
        final boolean booleanValue = (boolean)gva.j((sei)a2);
        final oyk oyk = null;
        Object o = null;
        Label_0213: {
            if (!booleanValue) {
                gva.g0(-1266144448);
                final odk a3 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a3);
                final Object r = gva.R();
                if ((f | f2) || (o = r) == a) {
                    o = a3.d((Class)kd.class, (emi)null);
                    gva.q0(o);
                }
                gva.q(false);
            }
            else {
                gva.g0(-1266126189);
                gva.q(false);
                final di8 z = vzq.z;
                if (z == null) {
                    gva.q(false);
                    o = null;
                    break Label_0213;
                }
                final boolean f3 = gva.f((Object)z);
                final Object r2 = gva.R();
                if (f3 || (o = r2) == a) {
                    o = z.d().f((Class)kd.class, (emi)null);
                    gva.q0(o);
                }
            }
            gva.q(false);
        }
        final kd kd = (kd)o;
        if (kd == null) {
            gva.q(false);
            return;
        }
        gva.g0(-845455153);
        Object o2;
        if (!(boolean)gva.j((sei)a2)) {
            gva.g0(-1266144448);
            final odk a4 = ii8.a(gva);
            final boolean f4 = gva.f((Object)null);
            final boolean f5 = gva.f((Object)a4);
            o2 = gva.R();
            if ((f4 | f5) || o2 == a) {
                o2 = a4.d((Class)oyk.class, (emi)null);
                gva.q0(o2);
            }
            gva.q(false);
        }
        else {
            gva.g0(-1266126189);
            gva.q(false);
            final di8 z2 = vzq.z;
            if (z2 == null) {
                o2 = oyk;
            }
            else {
                final boolean f6 = gva.f((Object)z2);
                o2 = gva.R();
                if (f6 || o2 == a) {
                    o2 = z2.d().f((Class)oyk.class, (emi)null);
                    gva.q0(o2);
                }
            }
        }
        gva.q(false);
        final oyk oyk2 = (oyk)o2;
        if (oyk2 == null) {
            gva.q(false);
            return;
        }
        gva.g0(1234123832);
        Object r3;
        if ((r3 = gva.R()) == a) {
            r3 = new Object();
            gva.q0(r3);
        }
        final boolean h = gva.h((Object)kd);
        final boolean h2 = gva.h(r3);
        final Object r4 = gva.R();
        Object o3;
        if ((h | h2) || (o3 = r4) == a) {
            o3 = new tt8((Object)kd, r3, (byte)17);
            gva.q0(o3);
        }
        mlc.b(r3, kd, (lta)o3, gva);
        final boolean h3 = gva.h((Object)gwj);
        final boolean h4 = gva.h((Object)kd);
        final boolean h5 = gva.h(r3);
        final boolean h6 = gva.h((Object)oyk2);
        final Object r5 = gva.R();
        zta zta;
        if ((h3 | h4 | h5 | h6) || (zta = (zta)r5) == a) {
            zta = new kd0((mrf)gwj, kd, r3, oyk2, null, (byte)7);
            gva.q0((Object)zta);
        }
        mlc.i(new Object[] { gwj, r3, oyk2, kd }, zta, gva);
        gva.q(false);
        gva.q(false);
    }
    
    public static final JsonElement N(final jqc jqc, final Object o, final KSerializer kSerializer) {
        final Object o2 = new Object();
        new fsc(jqc, (lta)new opm((b4j)o2, (byte)1), (byte)1).K(o, kSerializer);
        final Object v = ((b4j)o2).v;
        if (v != null) {
            return (JsonElement)v;
        }
        mlc.j0("result");
        throw null;
    }
    
    public static final void a(igf v, ac3 c, long e, final gva gva, final int n, final int n2) {
        gva.i0(1284499463);
        final int n3 = n2 & 0x1;
        int n4;
        if (n3 != 0) {
            n4 = (n | 0x6);
        }
        else if ((n & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)v)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n4 = (n5 | n);
        }
        else {
            n4 = n;
        }
        final int n6 = n2 & 0x2;
        int n7;
        if (n6 != 0) {
            n7 = (n4 | 0x30);
        }
        else {
            n7 = n4;
            if ((n & 0x30) == 0x0) {
                int ordinal;
                if (c == null) {
                    ordinal = -1;
                }
                else {
                    ordinal = ((Enum)c).ordinal();
                }
                int n8;
                if (gva.d(ordinal)) {
                    n8 = 32;
                }
                else {
                    n8 = 16;
                }
                n7 = (n4 | n8);
            }
        }
        if ((n & 0x180) == 0x0) {
            int n9;
            if ((n2 & 0x4) == 0x0 && gva.e(e)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n7 |= n9;
        }
        if (gva.W(n7 & 0x1, (n7 & 0x93) != 0x92)) {
            gva.b0();
            int n10;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n10 = n7;
                if ((n2 & 0x4) != 0x0) {
                    n10 = (n7 & 0xFFFFFC7F);
                }
            }
            else {
                if (n3 != 0) {
                    v = (igf)fgf.v;
                }
                if (n6 != 0) {
                    c = ac3.C;
                }
                if ((n2 & 0x4) != 0x0) {
                    final cy4 a = qy4.a;
                    e = qy4.a(gva).e;
                    n10 = (n7 & 0xFFFFFC7F);
                }
                else {
                    n10 = n7;
                }
            }
            gva.r();
            if (gva.j((sei)nec.a)) {
                gva.g0(-1634811493);
                final long g = j86.g;
                final float w = c.w;
                final igf u = omo.U(androidx.compose.foundation.layout.b.p(v, c.v), c.x);
                Object r;
                if ((r = gva.R()) == bi6.a) {
                    r = new kc2((byte)6);
                    gva.q0(r);
                }
                fuh.b((jta)r, u, e, w, g, 0, 0.0f, gva, (n10 & 0x380) | 0x6006);
                gva.q(false);
            }
            else {
                gva.g0(-1634538104);
                fuh.a(omo.U(androidx.compose.foundation.layout.b.p(v, c.v), c.x), e, c.w, 0L, 0, 0.0f, gva, n10 >> 3 & 0x70, 56);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new q93(v, c, e, n, n2);
        }
    }
    
    public static final void b(final jta jta, igf v, ac3 c, long e, final gva gva, final int n, final int n2) {
        gva.i0(-1221844101);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.h((Object)jta)) {
                n3 = 4;
            }
            else {
                n3 = 2;
            }
            n4 = (n3 | n);
        }
        else {
            n4 = n;
        }
        final int n5 = n2 & 0x2;
        int n6;
        if (n5 != 0) {
            n6 = (n4 | 0x30);
        }
        else {
            int n7;
            if (gva.f((Object)v)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        final int n8 = n2 & 0x4;
        int n9;
        if (n8 != 0) {
            n9 = (n6 | 0x180);
        }
        else {
            n9 = n6;
            if ((n & 0x180) == 0x0) {
                int ordinal;
                if (c == null) {
                    ordinal = -1;
                }
                else {
                    ordinal = ((Enum)c).ordinal();
                }
                int n10;
                if (gva.d(ordinal)) {
                    n10 = 256;
                }
                else {
                    n10 = 128;
                }
                n9 = (n6 | n10);
            }
        }
        int n11;
        if ((n2 & 0x8) == 0x0 && gva.e(e)) {
            n11 = 2048;
        }
        else {
            n11 = 1024;
        }
        final int n12 = n9 | n11;
        if (gva.W(n12 & 0x1, (n12 & 0x493) != 0x492)) {
            gva.b0();
            int n13;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n13 = n12;
                if ((n2 & 0x8) != 0x0) {
                    n13 = (n12 & 0xFFFFE3FF);
                }
            }
            else {
                if (n5 != 0) {
                    v = (igf)fgf.v;
                }
                if (n8 != 0) {
                    c = ac3.C;
                }
                if ((n2 & 0x8) != 0x0) {
                    final cy4 a = qy4.a;
                    e = qy4.a(gva).e;
                    n13 = (n12 & 0xFFFFE3FF);
                }
                else {
                    n13 = n12;
                }
            }
            gva.r();
            final cy4 a2 = qy4.a;
            fuh.b(jta, omo.U(androidx.compose.foundation.layout.b.p(v, c.v), c.x), e, c.w, qy4.a(gva).w, 0, 0.0f, gva, (n13 & 0xE) | (n13 >> 3 & 0x380));
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new p93(jta, v, c, e, n, n2);
        }
    }
    
    public static final void c(final igf igf, mnn mnn, t7d t7d, final gva gva, final int n) {
        gva.i0(-1425982656);
        int n2;
        if (gva.f((Object)igf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n | n2 | 0x90;
        if (gva.W(n3 & 0x1, (n3 & 0x93) != 0x92)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final cy4 a2 = qy4.a;
                final mnn mnn2 = (mnn)((uy4)qy4.c(gva).k.v).E;
                final odk a3 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a3);
                final Object r = gva.R();
                Object o;
                if ((f | f2) || (o = r) == a) {
                    o = a3.d((Class)t7d.class, (emi)null);
                    gva.q0(o);
                }
                final t7d t7d2 = (t7d)o;
                mnn = mnn2;
                t7d = t7d2;
            }
            gva.r();
            final og0 g = zn2.g(2131756960, new Object[] { t7d.a(s7d.z), t7d.a(s7d.x), t7d.a(s7d.y) }, gva);
            final String s = soh.S(2131756961, gva);
            final cy4 a4 = qy4.a;
            final long q = qy4.a(gva).Q;
            final boolean f3 = gva.f((Object)s);
            final Object r2 = gva.R();
            Object o2;
            if (f3 || (o2 = r2) == a) {
                o2 = new jy4(s, (byte)1);
                gva.q0(o2);
            }
            lmn.c(g, wsk.b((lta)o2, igf, false), q, 0L, 0L, new kfn(3), 0L, 0, false, 0, 0, (Map)null, (lta)null, mnn, gva, 0, 0, 261112);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)igf, (Object)mnn, (Object)t7d, (byte)8);
        }
    }
    
    public static ppc d() {
        return new ppc((opc)null);
    }
    
    public static final void e(final gwj gwj, final gva gva, final int n) {
        gva.i0(-512013506);
        int n3;
        if ((n & 0x6) == 0x0) {
            boolean b;
            if ((n & 0x8) == 0x0) {
                b = gva.f((Object)gwj);
            }
            else {
                b = gva.h((Object)gwj);
            }
            int n2;
            if (b) {
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
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            M(gwj, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new oj2((Object)gwj, n, (byte)4);
        }
    }
    
    public static final void f(final frg frg, final gva gva, final int n) {
        final cib a = bi6.a;
        gva.i0(-933352578);
        int n2;
        if (gva.f((Object)frg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        while (true) {
            Label_0326: {
                if (!gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
                    gva.Z();
                    break Label_0326;
                }
                gva.g0(-845455153);
                final boolean booleanValue = (boolean)gva.j((sei)nec.a);
                Object o = null;
                if (!booleanValue) {
                    gva.g0(-1266144448);
                    final odk a2 = ii8.a(gva);
                    final boolean f = gva.f((Object)null);
                    final boolean f2 = gva.f((Object)a2);
                    o = gva.R();
                    if ((f | f2) || o == a) {
                        o = a2.d((Class)kd.class, (emi)null);
                        gva.q0(o);
                    }
                    gva.q(false);
                }
                else {
                    gva.g0(-1266126189);
                    gva.q(false);
                    final di8 z = vzq.z;
                    if (z != null) {
                        final boolean f3 = gva.f((Object)z);
                        o = gva.R();
                        if (f3 || o == a) {
                            o = z.d().f((Class)kd.class, (emi)null);
                            gva.q0(o);
                        }
                    }
                }
                gva.q(false);
                final kd kd = (kd)o;
                if (kd != null) {
                    g(frg, kd, gva, (n3 & 0xE) | 0x40);
                    break Label_0326;
                }
                final b0j v = gva.v();
                if (v == null) {
                    return;
                }
                final v4g v4g = new v4g(frg, n, (byte)0);
                final b0j b0j = v;
                final v4g d = v4g;
                b0j.d = (zta)d;
                return;
            }
            final b0j v2 = gva.v();
            if (v2 != null) {
                final v4g d = new v4g(frg, n, (byte)1);
                final b0j b0j = v2;
                continue;
            }
            break;
        }
    }
    
    public static final void g(final frg frg, final kd kd, final gva gva, final int n) {
        gva.i0(-1051306345);
        int n2;
        if (gva.f((Object)frg)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)kd)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        int n5 = false ? 1 : 0;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final Object r = gva.R();
            final cib a = bi6.a;
            Object o;
            if ((o = r) == a) {
                o = new Object();
                gva.q0(o);
            }
            Object r2;
            if ((r2 = gva.R()) == a) {
                r2 = new Object();
                gva.q0(r2);
            }
            final int n6 = n4 & 0x70;
            final boolean b = n6 == 32 || gva.h((Object)kd);
            final boolean h = gva.h(o);
            final boolean h2 = gva.h(r2);
            final Object r3 = gva.R();
            Object o2;
            if ((b | h | h2) || (o2 = r3) == a) {
                o2 = new rx1((Object)kd, o, r2, (byte)20);
                gva.q0(o2);
            }
            mlc.c(o, r2, kd, (lta)o2, gva);
            final boolean b2 = (n4 & 0xE) == 0x4;
            if (n6 == 32 || gva.h((Object)kd)) {
                n5 = (true ? 1 : 0);
            }
            final boolean h3 = gva.h(o);
            final boolean h4 = gva.h(r2);
            Object r4 = gva.R();
            if (((b2 ? 1 : 0) | n5 | (h3 ? 1 : 0) | (h4 ? 1 : 0)) || r4 == a) {
                r4 = new kd0((mrf)frg, kd, o, r2, null, (byte)6);
                gva.q0(r4);
            }
            mlc.i(new Object[] { frg, o, r2, kd }, (zta)r4, gva);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new txf((Object)frg, (Object)kd, n, (byte)1);
        }
    }
    
    public static final void h(final mln mln, final lta lta, final String s, final igf igf, boolean b, zta zta, String s2, lep e, final mvc mvc, gvc g, long p16, mnn mnn, int n, final gva gva, final int n2, final int n3) {
        gva.i0(2012603350);
        int n5;
        if ((n2 & 0x6) == 0x0) {
            int n4;
            if (gva.f((Object)mln)) {
                n4 = 4;
            }
            else {
                n4 = 2;
            }
            n5 = (n2 | n4);
        }
        else {
            n5 = n2;
        }
        if ((n2 & 0x30) == 0x0) {
            int n6;
            if (gva.h((Object)lta)) {
                n6 = 32;
            }
            else {
                n6 = 16;
            }
            n5 |= n6;
        }
        final boolean f = gva.f((Object)s);
        final int n7 = 128;
        int n8;
        if (f) {
            n8 = 256;
        }
        else {
            n8 = 128;
        }
        int n9;
        if (gva.f((Object)igf)) {
            n9 = 2048;
        }
        else {
            n9 = 1024;
        }
        final int n10 = n5 | n8 | n9;
        final int n11 = n10 | 0x6000;
        final int n12 = n3 & 0x20;
        int n13;
        if (n12 != 0) {
            n13 = (n10 | 0x36000);
        }
        else {
            n13 = n11;
            if ((n2 & 0x30000) == 0x0) {
                int n14;
                if (gva.h((Object)zta)) {
                    n14 = 131072;
                }
                else {
                    n14 = 65536;
                }
                n13 = (n11 | n14);
            }
        }
        if ((n2 & 0x180000) == 0x0) {
            int n15;
            if ((n3 & 0x40) == 0x0 && gva.f((Object)s2)) {
                n15 = 1048576;
            }
            else {
                n15 = 524288;
            }
            n13 |= n15;
        }
        final int n16 = n3 & 0x80;
        int n17;
        if (n16 != 0) {
            n17 = (n13 | 0xC00000);
        }
        else {
            int n18;
            if (gva.f((Object)e)) {
                n18 = 8388608;
            }
            else {
                n18 = 4194304;
            }
            n17 = (n13 | n18);
        }
        final int n19 = n17 | 0x30000000;
        int n20;
        if ((n3 & 0x1000) == 0x0) {
            n20 = n7;
            if (gva.d(n)) {
                n20 = 256;
            }
        }
        else {
            n20 = n7;
        }
        final boolean b2 = true;
        if (gva.W(n19 & 0x1, (0x12492493 & n19) != 0x12492492 || ((n20 | 0x12) & 0x93) != 0x92)) {
            gva.b0();
            int n21;
            String s3;
            zta zta3;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n21 = n19;
                if ((n3 & 0x40) != 0x0) {
                    n21 = (n19 & 0xFFC7FFFF);
                }
                final zta zta2 = zta;
                s3 = s2;
                zta3 = zta2;
            }
            else {
                if (n12 != 0) {
                    zta = null;
                }
                n21 = n19;
                if ((n3 & 0x40) != 0x0) {
                    n21 = (n19 & 0xFFC7FFFF);
                    s2 = s;
                }
                if (n16 != 0) {
                    e = (lep)def.E;
                }
                g = gvc.g;
                final cy4 a = qy4.a;
                p16 = qy4.a(gva).p;
                mnn = (mnn)gva.j((sei)lmn.a);
                if ((n3 & 0x1000) != 0x0) {
                    n = 3;
                }
                final zta zta4 = zta;
                s3 = s2;
                zta3 = zta4;
                b = b2;
            }
            gva.r();
            Object t0;
            if (s3 == null) {
                gva.g0(-276130617);
                gva.q(false);
                t0 = null;
            }
            else {
                gva.g0(-276130616);
                t0 = uuj.t0(1279044707, (aua)new g7a(s3, n, s), gva);
                gva.q(false);
            }
            final mnn f2 = mnn.f(mnn, 0L, 0L, (zoa)null, (una)null, 0L, (wgn)null, n, 0L, 16744447);
            final cy4 a2 = qy4.a;
            final aql u = qy4.b(gva).u;
            final igf d = b.d(igf, 1.0f);
            final int n22 = n21 >> 12;
            tsf.i(mln, lta, s, d, b, u, f2, (zta)t0, zta3, e, mvc, g, true, 0, 1, p16, (ihn)null, gva, n21 & 0xE3FE, (n22 & 0x1C00) | ((n22 & 0x70) | 0x6180000) | 0x36000, 1185312);
            final String s4 = s3;
            zta = zta3;
            s2 = s4;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new uud(mln, lta, s, igf, b, zta, s2, e, mvc, g, p16, mnn, n, n2, n3);
        }
    }
    
    public static final void i(final String s, final lta lta, final String s2, final igf igf, boolean b, String s3, zta zta, lep e, final mvc mvc, gvc g, long p16, final mnn mnn, int n, final gva gva, final int n2, final int n3) {
        gva.i0(-1541456154);
        final boolean f = gva.f((Object)s);
        final int n4 = 2;
        int n5;
        if (f) {
            n5 = 4;
        }
        else {
            n5 = 2;
        }
        int n6;
        if (gva.h((Object)lta)) {
            n6 = 32;
        }
        else {
            n6 = 16;
        }
        int n7;
        if (gva.f((Object)s2)) {
            n7 = 256;
        }
        else {
            n7 = 128;
        }
        int n8;
        if (gva.f((Object)igf)) {
            n8 = 2048;
        }
        else {
            n8 = 1024;
        }
        final int n9 = n2 | n5 | n6 | n7 | n8;
        final int n10 = n3 & 0x10;
        int n11;
        if (n10 != 0) {
            n11 = (n9 | 0x6000);
        }
        else {
            int n12;
            if (gva.g(b)) {
                n12 = 16384;
            }
            else {
                n12 = 8192;
            }
            n11 = (n9 | n12);
        }
        final int n13 = 0x190000 | n11;
        final int n14 = n3 & 0x80;
        int n15;
        if (n14 != 0) {
            n15 = (0xD90000 | n11);
        }
        else {
            n15 = n13;
            if ((n2 & 0xC00000) == 0x0) {
                int n16;
                if (gva.h((Object)zta)) {
                    n16 = 8388608;
                }
                else {
                    n16 = 4194304;
                }
                n15 = (n13 | n16);
            }
        }
        int n17 = n15 | 0x6000000;
        if ((n2 & 0x30000000) == 0x0) {
            int n18;
            if (gva.f((Object)mvc)) {
                n18 = 536870912;
            }
            else {
                n18 = 268435456;
            }
            n17 |= n18;
        }
        final int n19 = n3 & 0x400;
        int n20;
        if (n19 != 0) {
            n20 = 6;
        }
        else {
            n20 = n4;
            if (gva.f((Object)g)) {
                n20 = 4;
            }
        }
        final int n21 = n20 | 0x490;
        final boolean b2 = true;
        zta zta2;
        mnn mnn2;
        if (gva.W(n17 & 0x1, (0x12492493 & n17) != 0x12492492 || (n21 & 0x493) != 0x492)) {
            gva.b0();
            int n24;
            int n25;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                final int n22 = n21 & 0xFFFFE00F;
                zta2 = zta;
                final int n23 = n17 & 0xFFF8FFFF;
                mnn2 = mnn;
                n24 = n22;
                n25 = n23;
            }
            else {
                if (n10 != 0) {
                    b = b2;
                }
                if (n14 != 0) {
                    zta = null;
                }
                e = (lep)def.E;
                if (n19 != 0) {
                    g = gvc.g;
                }
                final cy4 a = qy4.a;
                p16 = qy4.a(gva).p;
                final mnn mnn3 = (mnn)gva.j((sei)lmn.a);
                final int n26 = n21 & 0xFFFFE00F;
                n = 3;
                n25 = (n17 & 0xFFF8FFFF);
                s3 = s2;
                n24 = n26;
                zta2 = zta;
                mnn2 = mnn3;
            }
            Object t0 = null;
            gva.r();
            if (s3 == null) {
                gva.g0(271002423);
                gva.q(false);
            }
            else {
                gva.g0(271002424);
                t0 = uuj.t0(-89875469, (aua)new b23(s3, n, s2), gva);
                gva.q(false);
            }
            final mnn f2 = mnn.f(mnn2, 0L, 0L, (zoa)null, (una)null, 0L, (wgn)null, n, 0L, 16744447);
            final cy4 a2 = qy4.a;
            tsf.j(s, lta, s2, b.d(igf, 1.0f), b, false, qy4.b(gva).u, f2, (zta)t0, (zta)null, zta2, e, mvc, g, true, 0, 1, p16, (ihn)null, gva, n25 & 0xE3FE, (n25 >> 15 & 0xE000) | ((n25 >> 21 & 0xE) | 0x6180C30) | (n24 << 15 & 0x70000), 1184288);
        }
        else {
            gva.Z();
            zta2 = zta;
            mnn2 = mnn;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new tud(s, lta, s2, igf, b, s3, zta2, e, mvc, g, p16, mnn2, n, n2, n3);
        }
    }
    
    public static final void j(final int n, final int n2, final gva gva, igf igf, final String s, final boolean b) {
        gva.i0(-184843806);
        int n3;
        if (gva.f((Object)s)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.d(n)) {
            n4 = 256;
        }
        else {
            n4 = 128;
        }
        int n5;
        if (gva.g(b)) {
            n5 = 2048;
        }
        else {
            n5 = 1024;
        }
        final int n6 = n2 | n3 | 0x30 | n4 | n5;
        if (gva.W(n6 & 0x1, (n6 & 0x493) != 0x492)) {
            gva.b0();
            Object o = fgf.v;
            if ((n2 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                igf = (igf)o;
            }
            gva.r();
            final igf d = b.d(igf, 1.0f);
            if (b) {
                gva.g0(-1541214214);
                Object r;
                if ((r = gva.R()) == bi6.a) {
                    r = new yp7((byte)17);
                    gva.q0(r);
                }
                o = wsk.a((igf)o, (lta)r);
            }
            else {
                gva.g0(-1541213270);
            }
            gva.q(false);
            final igf e = d.E((igf)o);
            final cy4 a = qy4.a;
            lmn.b(s, e, qy4.a(gva).Q, 0L, (zoa)null, (una)null, 0L, (wgn)null, new kfn(n), 0L, 0, false, 0, 0, (lta)null, (mnn)null, gva, n6 & 0xE, n6 >> 6 & 0xE, 261112);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new vo1(s, igf, n, b, n2);
        }
    }
    
    public static final void k(final c4d c4d, final Object o, final int n, final Object o2, final gva gva, final int n2) {
        gva.i0(1439843069);
        int n3;
        if (gva.f((Object)c4d)) {
            n3 = 4;
        }
        else {
            n3 = 2;
        }
        int n4;
        if (gva.f(o)) {
            n4 = 32;
        }
        else {
            n4 = 16;
        }
        int n5;
        if (gva.d(n)) {
            n5 = 256;
        }
        else {
            n5 = 128;
        }
        int n6;
        if (gva.f(o2)) {
            n6 = 2048;
        }
        else {
            n6 = 1024;
        }
        final int n7 = n3 | n2 | n4 | n5 | n6;
        if (gva.W(n7 & 0x1, (n7 & 0x493) != 0x492)) {
            ((q8k)o).d(o2, uuj.t0(980966366, (aua)new we6(n, c4d, o2), gva), gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new wf0(c4d, o, n, o2, n2);
        }
    }
    
    public static final void l(final gva gva, final igf igf) {
        final qj2 g = qj2.g;
        final int hashCode = Long.hashCode(gva.T);
        final igf b = ien.B(gva, igf);
        final e3h l = gva.l();
        vh6.e.getClass();
        gva.k0();
        if (gva.S) {
            gva.k((jta)LayoutNode.n0);
        }
        else {
            gva.t0();
        }
        k8e.P((zta)awp.A, gva, g);
        k8e.P((zta)awp.z, gva, l);
        k8e.C(gva);
        k8e.P((zta)awp.y, gva, b);
        k8e.P((zta)awp.B, gva, hashCode);
        gva.q(true);
    }
    
    public static void m(final y5m y5m, final List list, final c0j a) {
        if (!((Collection)list).isEmpty()) {
            for (int size = ((Collection)list).size(), i = 0; i < size; ++i) {
                final int c = y5m.c((bva)list.get(i));
                final int o = y5m.O(y5m.b, y5m.q(c));
                Object a2;
                if (o < y5m.f(y5m.b, y5m.q(c + 1))) {
                    a2 = y5m.c[y5m.g(o)];
                }
                else {
                    a2 = bi6.a;
                }
                b0j b0j;
                if (a2 instanceof b0j) {
                    b0j = (b0j)a2;
                }
                else {
                    b0j = null;
                }
                if (b0j != null) {
                    b0j.a = a;
                }
            }
        }
    }
    
    public static final void n(final WebSettings webSettings) {
        final String userAgentString = webSettings.getUserAgentString();
        final StringBuilder sb = new StringBuilder();
        sb.append(userAgentString);
        sb.append(" Claude/1.260911.19");
        webSettings.setUserAgentString(sb.toString());
    }
    
    public static final void o(final hc7 hc7, final CancellationException ex) {
        final opc opc = (opc)hc7.M0((gc7)o55.z);
        if (opc != null) {
            opc.g(ex);
        }
    }
    
    public static final Object p(final opc opc, final h07 h07) {
        opc.g((CancellationException)null);
        final Object l = opc.L((f07)h07);
        if (l == pc7.v) {
            return l;
        }
        return lqo.a;
    }
    
    public static final Object q(final ija ija, final f07 f07) {
        final Object a = ija.a((jja)qyf.v, f07);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public static final Object r(final ija ija, final zta zta, final f07 f07) {
        final int a = mka.a;
        final Object q = q(ri2.p((ija)mka.b(ija, (bua)new lka((aua)zta, (f07)null, (byte)0)), 0), f07);
        if (q == pc7.v) {
            return q;
        }
        return lqo.a;
    }
    
    public static final int s(final b3k b3k, String k) {
        final int columnCount = b3k.getColumnCount();
        final int n = 0;
        int i = 0;
        while (true) {
            while (i < columnCount) {
                if (k.equals(b3k.getColumnName(i))) {
                    if (i >= 0) {
                        return i;
                    }
                    k = hia.k("`", k, "`");
                    final int columnCount2 = b3k.getColumnCount();
                    int j = n;
                    while (true) {
                        while (j < columnCount2) {
                            if (k.equals(b3k.getColumnName(j))) {
                                if (j >= 0) {
                                    return j;
                                }
                                return -1;
                            }
                            else {
                                ++j;
                            }
                        }
                        j = -1;
                        continue;
                    }
                }
                else {
                    ++i;
                }
            }
            i = -1;
            continue;
        }
    }
    
    public static final Object t(final jja jja, final ija ija, final f07 f07) {
        if (jja instanceof avn) {
            throw ((avn)jja).v;
        }
        final Object a = ija.a(jja, f07);
        if (a == pc7.v) {
            return a;
        }
        return lqo.a;
    }
    
    public static final void u(final hc7 hc7) {
        final opc opc = (opc)hc7.M0((gc7)o55.z);
        if (opc != null && !opc.c()) {
            throw opc.T();
        }
    }
    
    public static kb v(final zrc zrc) {
        Label_0126: {
            Label_0117: {
                Label_0108: {
                    Number h = null;
                    Number h2 = null;
                    Label_0045: {
                        try {
                            h = zrc.o("session_sample_rate").h();
                            final irc o = zrc.o("session_replay_sample_rate");
                            if (o != null) {
                                h2 = o.h();
                                break Label_0045;
                            }
                        }
                        catch (final NullPointerException ex) {
                            break Label_0108;
                        }
                        catch (final NumberFormatException ex2) {
                            break Label_0117;
                        }
                        catch (final IllegalStateException ex3) {
                            break Label_0126;
                        }
                        h2 = null;
                    }
                    final irc o2 = zrc.o("profiling_sample_rate");
                    Number h3;
                    if (o2 != null) {
                        h3 = o2.h();
                    }
                    else {
                        h3 = null;
                    }
                    final irc o3 = zrc.o("trace_sample_rate");
                    Number h4;
                    if (o3 != null) {
                        h4 = o3.h();
                    }
                    else {
                        h4 = null;
                    }
                    h.getClass();
                    return new kb(h, h2, h3, h4);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type Configuration", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type Configuration", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type Configuration", (Throwable)ex3);
        return null;
    }
    
    public static jmj w(final zrc zrc) {
        Label_0156: {
            Label_0147: {
                Label_0138: {
                    String i = null;
                    int n2 = 0;
                    Boolean value;
                    while (true) {
                    Label_0099:
                        while (true) {
                            int n = 0;
                            Label_0119: {
                                try {
                                    i = zrc.o("id").i();
                                    final String j = zrc.o("type").i();
                                    j.getClass();
                                    final int[] f = ge9.F(3);
                                    final int length = f.length;
                                    n = 0;
                                    if (n >= length) {
                                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                                    }
                                    n2 = f[n];
                                    if (!lmf.j(n2).equals(j)) {
                                        break Label_0119;
                                    }
                                    final irc o = zrc.o("has_replay");
                                    if (o != null) {
                                        value = o.a();
                                        break;
                                    }
                                }
                                catch (final NullPointerException ex) {
                                    break Label_0138;
                                }
                                catch (final NumberFormatException ex2) {
                                    break Label_0147;
                                }
                                catch (final IllegalStateException ex3) {
                                    break Label_0156;
                                }
                                break Label_0099;
                            }
                            ++n;
                            continue;
                        }
                        value = null;
                        break;
                    }
                    i.getClass();
                    return new jmj(n2, value, i);
                }
                final NullPointerException ex;
                oyl.n("Unable to parse json into type ResourceEventSession", (Throwable)ex);
                return null;
            }
            final NumberFormatException ex2;
            oyl.n("Unable to parse json into type ResourceEventSession", (Throwable)ex2);
            return null;
        }
        final IllegalStateException ex3;
        oyl.n("Unable to parse json into type ResourceEventSession", (Throwable)ex3);
        return null;
    }
    
    public static final opc x(final hc7 hc7) {
        final opc opc = (opc)hc7.M0((gc7)o55.z);
        if (opc != null) {
            return opc;
        }
        uy8.g((Object)hc7, "Current context doesn't contain Job in it: ");
        return null;
    }
    
    public static final mnn y(final int n, final gva gva) {
        final tno b = ((e8e)gva.j((sei)h8e.a)).b;
        if (n == 3) {
            return b.a;
        }
        if (n == 4) {
            return b.b;
        }
        if (n == 5) {
            return b.c;
        }
        if (n == 6) {
            return b.d;
        }
        if (n == 7) {
            return b.e;
        }
        if (n == 8) {
            return b.f;
        }
        if (n == 12) {
            return b.g;
        }
        if (n == 13) {
            return b.h;
        }
        if (n == 14) {
            return b.i;
        }
        if (n == 0) {
            return b.j;
        }
        if (n == 1) {
            return b.k;
        }
        if (n == 2) {
            return b.l;
        }
        if (n == 9) {
            return b.m;
        }
        if (n == 10) {
            return b.n;
        }
        if (n == 11) {
            return b.o;
        }
        if (n == 18) {
            return b.p;
        }
        if (n == 19) {
            return b.q;
        }
        if (n == 20) {
            return b.r;
        }
        if (n == 21) {
            return b.s;
        }
        if (n == 22) {
            return b.t;
        }
        if (n == 23) {
            return b.u;
        }
        if (n == 27) {
            return b.v;
        }
        if (n == 28) {
            return b.w;
        }
        if (n == 29) {
            return b.x;
        }
        if (n == 15) {
            return b.y;
        }
        if (n == 16) {
            return b.z;
        }
        if (n == 17) {
            return b.A;
        }
        if (n == 24) {
            return b.B;
        }
        if (n == 25) {
            return b.C;
        }
        if (n == 26) {
            return b.D;
        }
        return b.j;
    }
    
    public static final void z(final bw8 bw8) {
        if (((hgf)bw8).v.I) {
            soh.J(bw8, 1).p1();
        }
    }
}
