import org.xmlpull.v1.XmlPullParser;
import java.lang.ref.Reference;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import android.os.Build$VERSION;
import java.util.Set;
import java.util.Arrays;
import androidx.compose.ui.graphics.vector.VectorPainter;
import android.content.res.XmlResourceParser;
import android.content.res.Resources$Theme;
import androidx.compose.ui.res.ResourceResolutionException;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import org.xmlpull.v1.XmlPullParserException;
import java.lang.ref.WeakReference;
import android.util.TypedValue;
import android.content.res.Resources;
import android.os.UserManager;
import android.content.Context;
import android.view.ViewParent;
import java.util.concurrent.Executor;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlinx.serialization.encoding.Decoder;

public abstract class eqi implements Decoder, jl6
{
    public static final ye6 a;
    public static final ye6 b;
    public static final Object c;
    public static final vf0 d;
    public static String e;
    public static int f;
    public static Boolean g;
    
    public static final void F(final mln value, final lta u, final igf igf, final mnn mnn, final lep f, final lta lta, final llf llf, final cam cam, final boolean b, final int n, final int n2, final y4c y4c, final gvc b2, final boolean b3, final boolean b4, final ye6 ye6, final gva gva, final int n3, final int n4) {
        gva.i0(31062401);
        int n6;
        if ((n3 & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)value)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n6 = (n3 | n5);
        }
        else {
            n6 = n3;
        }
        final int n7 = 16;
        int n8 = n6;
        if ((n3 & 0x30) == 0x0) {
            int n9;
            if (gva.h((Object)u)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 = (n6 | n9);
        }
        final int n10 = 128;
        int n11 = n8;
        if ((n3 & 0x180) == 0x0) {
            int n12;
            if (gva.f((Object)igf)) {
                n12 = 256;
            }
            else {
                n12 = 128;
            }
            n11 = (n8 | n12);
        }
        final int n13 = 1024;
        int n14 = n11;
        if ((n3 & 0xC00) == 0x0) {
            int n15;
            if (gva.f((Object)mnn)) {
                n15 = 2048;
            }
            else {
                n15 = 1024;
            }
            n14 = (n11 | n15);
        }
        final int n16 = 8192;
        int n17 = n14;
        if ((n3 & 0x6000) == 0x0) {
            int n18;
            if (gva.f((Object)f)) {
                n18 = 16384;
            }
            else {
                n18 = 8192;
            }
            n17 = (n14 | n18);
        }
        final int n19 = 131072;
        int n20 = n17;
        if ((n3 & 0x30000) == 0x0) {
            int n21;
            if (gva.h((Object)lta)) {
                n21 = 131072;
            }
            else {
                n21 = 65536;
            }
            n20 = (n17 | n21);
        }
        int n22 = n20;
        if ((n3 & 0x180000) == 0x0) {
            int n23;
            if (gva.f((Object)llf)) {
                n23 = 1048576;
            }
            else {
                n23 = 524288;
            }
            n22 = (n20 | n23);
        }
        int n24 = n22;
        if ((n3 & 0xC00000) == 0x0) {
            int n25;
            if (gva.f((Object)cam)) {
                n25 = 8388608;
            }
            else {
                n25 = 4194304;
            }
            n24 = (n22 | n25);
        }
        int n26 = n24;
        if ((n3 & 0x6000000) == 0x0) {
            int n27;
            if (gva.g(b)) {
                n27 = 67108864;
            }
            else {
                n27 = 33554432;
            }
            n26 = (n24 | n27);
        }
        int n28 = n26;
        if ((n3 & 0x30000000) == 0x0) {
            int n29;
            if (gva.d(n)) {
                n29 = 536870912;
            }
            else {
                n29 = 268435456;
            }
            n28 = (n26 | n29);
        }
        int n31;
        if ((n4 & 0x6) == 0x0) {
            int n30;
            if (gva.d(n2)) {
                n30 = 4;
            }
            else {
                n30 = 2;
            }
            n31 = (n4 | n30);
        }
        else {
            n31 = n4;
        }
        int n32 = n31;
        if ((n4 & 0x30) == 0x0) {
            int n33 = n7;
            if (gva.f((Object)y4c)) {
                n33 = 32;
            }
            n32 = (n31 | n33);
        }
        int n34 = n32;
        if ((n4 & 0x180) == 0x0) {
            int n35 = n10;
            if (gva.f((Object)b2)) {
                n35 = 256;
            }
            n34 = (n32 | n35);
        }
        int n36 = n34;
        if ((n4 & 0xC00) == 0x0) {
            int n37 = n13;
            if (gva.g(b3)) {
                n37 = 2048;
            }
            n36 = (n34 | n37);
        }
        int n38 = n36;
        if ((n4 & 0x6000) == 0x0) {
            int n39 = n16;
            if (gva.g(b4)) {
                n39 = 16384;
            }
            n38 = (n36 | n39);
        }
        if ((n4 & 0x30000) == 0x0) {
            int n40;
            if (gva.h((Object)ye6)) {
                n40 = n19;
            }
            else {
                n40 = 65536;
            }
            n38 |= n40;
        }
        final int n41 = n38 | 0x180000;
        if (gva.W(n28 & 0x1, (n28 & 0x12492493) != 0x12492492 || (0x92493 & n41) != 0x92492)) {
            gva.b0();
            if ((n3 & 0x1) != 0x0) {
                if (!gva.C()) {
                    gva.Z();
                }
            }
            gva.r();
            final Object r = gva.R();
            final cib a = bi6.a;
            xma f2;
            if ((f2 = (xma)r) == a) {
                f2 = oz1.f(gva);
            }
            final xma m = f2;
            Object r2;
            if ((r2 = gva.R()) == a) {
                final c7d a2 = d7d.a;
                r2 = new Object();
                gva.q0(r2);
            }
            final w70 w70 = (w70)r2;
            Object r3;
            if ((r3 = gva.R()) == a) {
                r3 = new amn((tbh)w70);
                gva.q0(r3);
            }
            final amn amn = (amn)r3;
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            final tna tna = (tna)gva.j((sei)hm6.k);
            final long b5 = ((gnn)gva.j((sei)hnn.a)).b;
            final mma c = (mma)gva.j((sei)hm6.i);
            final z0q z0q = (z0q)gva.j((sei)hm6.v);
            final z9m z9m = (z9m)gva.j((sei)hm6.r);
            final zhg v = zhg.v;
            zhg w71;
            if (n == 1 && !b && y4c.a) {
                w71 = zhg.w;
            }
            else {
                w71 = v;
            }
            gva.g0(-213744626);
            final n9k g = sjn.g;
            final boolean d = gva.d(((Enum)w71).ordinal());
            final Object r4 = gva.R();
            Object o;
            if (d || (o = r4) == a) {
                o = new h87((Object)w71, (byte)2);
                gva.q0(o);
            }
            final sjn sjn = (sjn)mlc.b0(new Object[] { w71 }, (m9k)g, (jta)o, gva, 0);
            gva.q(false);
            if (sjn.f.getValue() != w71) {
                String s;
                if (w71 == v) {
                    s = "only single-line, non-wrap text fields can scroll horizontally";
                }
                else {
                    s = "single-line, non-wrap text fields can only scroll horizontally";
                }
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(s));
            }
            final int n42 = n28 & 0xE;
            final boolean b6 = n42 == 4;
            final boolean b7 = (n28 & 0xE000) == 0x4000;
            Object o2 = gva.R();
            if ((b6 | b7) || o2 == a) {
                o2 = t5p.a(f, value.a);
                final o6g b8 = ((leo)o2).b;
                final dnn c2 = value.c;
                if (c2 != null) {
                    final long a3 = c2.a;
                    final int c3 = dnn.c;
                    final int g2 = b8.G((int)(a3 >> 32));
                    final int g3 = b8.G((int)(a3 & 0xFFFFFFFFL));
                    final int min = Math.min(g2, g3);
                    final int max = Math.max(g2, g3);
                    final mg0 mg0 = new mg0(((leo)o2).a);
                    mg0.b(new hcm(0L, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, wgn.c, (rpl)null, 61439), min, max);
                    o2 = new leo(mg0.n(), b8);
                }
                gva.q0(o2);
            }
            final leo leo = (leo)o2;
            final og0 a4 = leo.a;
            final o6g b9 = leo.b;
            final b0j b10 = gva.B();
            if (b10 == null) {
                en9.q("no recompose scope found");
                return;
            }
            b10.b |= 0x1;
            final boolean f3 = gva.f((Object)z9m);
            Object r5 = gva.R();
            final r89 v2 = r89.v;
            if (f3 || r5 == a) {
                r5 = new j7d(new kce(a4, xc8, tna, mnn, (List)v2, b), b10, z9m);
                gva.q0(r5);
            }
            final j7d d2 = (j7d)r5;
            final og0 a5 = value.a;
            final long b11 = value.b;
            d2.u = u;
            d2.z = b5;
            final fvc r6 = d2.r;
            r6.b = b2;
            r6.c = c;
            d2.j = a5;
            kce a6 = d2.a;
            if (!mlc.q(a6.b, a4) || !mlc.q(a6.c, mnn) || a6.a != b || !mlc.q(a6.d, xc8) || !mlc.q(a6.f, v2) || a6.e != tna) {
                a6 = new kce(a4, xc8, tna, mnn, (List)v2, b);
            }
            if (d2.a != a6) {
                d2.p = true;
            }
            d2.a = a6;
            final vcc d3 = d2.d;
            final dmn e = d2.e;
            d3.getClass();
            final dnn c4 = value.c;
            final boolean q = mlc.q(c4, ((f29)d3.x).c());
            final String w72 = ((mln)d3.w).a.w;
            final og0 a7 = value.a;
            boolean b12 = false;
            boolean b13 = false;
            Label_1870: {
                if (!mlc.q(w72, a7.w)) {
                    d3.x = new f29(a7, b11);
                    b12 = true;
                }
                else {
                    if (!dnn.c(((mln)d3.w).b, b11)) {
                        ((f29)d3.x).f(dnn.g(b11), dnn.f(b11));
                        b12 = false;
                        b13 = true;
                        break Label_1870;
                    }
                    b12 = false;
                }
                b13 = false;
            }
            if (c4 == null) {
                final f29 f4 = (f29)d3.x;
                f4.d = -1;
                f4.e = -1;
            }
            else {
                final long a8 = c4.a;
                if (!dnn.d(a8)) {
                    ((f29)d3.x).e(dnn.g(a8), dnn.f(a8));
                }
            }
            long longValue = 0L;
            mln a9;
            if (!b12 && (b13 || q)) {
                a9 = value;
            }
            else {
                final f29 f5 = (f29)d3.x;
                f5.d = -1;
                f5.e = -1;
                a9 = mln.a(value, (og0)null, 0L, 3);
            }
            final mln mln = (mln)d3.w;
            d3.w = a9;
            if (e != null) {
                e.a(mln, a9);
            }
            Object r7;
            if ((r7 = gva.R()) == a) {
                r7 = new Object();
                gva.q0(r7);
            }
            final bqo bqo = (bqo)r7;
            final long currentTimeMillis = System.currentTimeMillis();
            Label_2126: {
                if (!bqo.e) {
                    final Long d4 = bqo.d;
                    if (d4 != null) {
                        longValue = d4;
                    }
                    if (currentTimeMillis <= longValue + 5000L) {
                        break Label_2126;
                    }
                }
                bqo.d = currentTimeMillis;
                bqo.a(value);
            }
            Object o3;
            if ((o3 = gva.R()) == a) {
                o3 = mlc.z((hc7)o89.v, gva);
                gva.q0(o3);
            }
            final oc7 i = (oc7)o3;
            Object r8;
            if ((r8 = gva.R()) == a) {
                r8 = new rl2();
                gva.q0(r8);
            }
            final rl2 rl2 = (rl2)r8;
            Object r9;
            if ((r9 = gva.R()) == a) {
                r9 = new dkn(bqo);
                gva.q0(r9);
            }
            final dkn dkn = (dkn)r9;
            dkn.b = b9;
            dkn.f = f;
            dkn.c = (lta)d2.v;
            dkn.d = d2;
            dkn.e.setValue((Object)value);
            dkn.x = new dnn(b11);
            dkn.h = (y45)gva.j((sei)hm6.f);
            dkn.i = i;
            dkn.k = (qnn)gva.j((sei)hm6.s);
            dkn.l = (ccb)gva.j((sei)hm6.l);
            dkn.m = m;
            final boolean b14 = b4 ^ true;
            dkn.n.setValue((Object)b14);
            dkn.o.setValue((Object)b3);
            gva.g0(1966756105);
            dkn.j = mbh.b(upk.v, mnn.a.k, gva, 6);
            gva.q(false);
            d2.b();
            final boolean h = gva.h((Object)d2);
            final int n43 = n41 & 0x1C00;
            final boolean b15 = h | n43 == 2048 | (n41 & 0xE000) == 0x4000 | gva.h((Object)amn) | n42 == 4;
            final int n44 = (n41 & 0x70) ^ 0x30;
            boolean b16 = false;
            Label_2592: {
                if (n44 <= 32 || !gva.f((Object)y4c)) {
                    if ((n41 & 0x30) != 0x20) {
                        b16 = false;
                        break Label_2592;
                    }
                }
                b16 = true;
            }
            final boolean h2 = gva.h((Object)b9);
            final boolean h3 = gva.h((Object)i);
            final boolean h4 = gva.h((Object)rl2);
            final boolean h5 = gva.h((Object)dkn);
            Object r10 = gva.R();
            if ((b15 | b16 | h2 | h3 | h4 | h5) || r10 == a) {
                r10 = new jb7(d2, b3, b4, amn, value, y4c, b9, dkn, i, rl2);
                gva.q0(r10);
            }
            final dkn dkn2 = dkn;
            final lta lta2 = (lta)r10;
            Object o4 = fgf.v;
            final igf p19 = r6k.p(h0(uuj.g0((igf)o4, m), lta2), b3, llf);
            final bnf w73 = o50.W(b3 && !b4, gva);
            final boolean f6 = gva.f((Object)w73);
            final boolean h6 = gva.h((Object)d2);
            final boolean h7 = gva.h((Object)amn);
            final boolean h8 = gva.h((Object)dkn2);
            boolean b17 = false;
            Label_2852: {
                if (n44 <= 32 || !gva.f((Object)y4c)) {
                    if ((n41 & 0x30) != 0x20) {
                        b17 = false;
                        break Label_2852;
                    }
                }
                b17 = true;
            }
            final Object r11 = gva.R();
            Object o5;
            if (!(f6 | h6 | h7 | h8 | b17) && r11 != a) {
                o5 = r11;
            }
            else {
                final eh0 eh0 = new eh0((Object)d2, (Object)w73, (Object)amn, (Object)dkn2, (Object)y4c, (f07)null, (byte)2);
                gva.q0((Object)eh0);
                o5 = eh0;
            }
            final dkn dkn3 = dkn;
            mlc.f((zta)o5, gva, lqo.a);
            final igf b18 = p6n.b((igf)o4, (Object)8675309, (PointerInputEventHandler)new qy6((lta)new gb7(d2, (byte)4), (byte)1));
            final mjn mjn = new mjn(d2, m, b4, b3, dkn3, b9);
            igf l = b18;
            if (b3) {
                l = ien.l(b18, (bua)new zy3((Object)mjn, (Object)llf, (byte)8));
            }
            final igf c5 = p6n.c(l, (Object)dkn3.B, (Object)dkn3.A, (PointerInputEventHandler)new v60(dkn3, (byte)3));
            neh.a.getClass();
            final igf f7 = x90.F(c5, x90.e);
            final igf e2 = t08.E((igf)o4, (lta)new rx1((Object)d2, (Object)value, (Object)b9, (byte)11));
            final boolean h9 = gva.h((Object)d2);
            final boolean b19 = n43 == 2048;
            final boolean f8 = gva.f((Object)z0q);
            final boolean h10 = gva.h((Object)dkn3);
            final boolean b20 = n42 == 4;
            final boolean h11 = gva.h((Object)b9);
            Object r12 = gva.R();
            if ((h9 | b19 | f8 | h10 | b20 | h11) || r12 == a) {
                r12 = new kb7(d2, b3, z0q, dkn3, value, b9);
                gva.q0(r12);
            }
            final igf d5 = ien.D((igf)o4, (lta)r12);
            final qb7 qb7 = new qb7(leo, value, d2, b4, b3, f instanceof evg, b9, dkn3, y4c, m);
            igf j;
            if (b3 && !b4 && ((n6d)z0q).b() && dnn.d(((dnn)d2.A.getValue()).a) && dnn.d(((dnn)d2.B.getValue()).a)) {
                j = ien.l((igf)o4, (bua)new d4d((Object)cam, (Object)d2, (Object)value, (Object)b9, (byte)3));
            }
            else {
                j = (igf)o4;
            }
            final boolean h12 = gva.h((Object)dkn3);
            final Object r13 = gva.R();
            Object o6;
            if (h12 || (o6 = r13) == a) {
                o6 = new i1((Object)dkn3, (byte)22);
                gva.q0(o6);
            }
            mlc.a(dkn3, (lta)o6, gva);
            final boolean h13 = gva.h((Object)d2);
            final boolean h14 = gva.h((Object)amn);
            final boolean b21 = n42 == 4;
            final boolean b22 = (n44 > 32 && gva.f((Object)y4c)) || (n41 & 0x30) == 0x20;
            Object r14 = gva.R();
            if ((h13 | h14 | b21 | b22) || r14 == a) {
                r14 = new fd0((Object)d2, (Object)amn, (Object)value, (Object)y4c, (byte)6);
                gva.q0(r14);
            }
            mlc.a(y4c, (lta)r14, gva);
            final igf k = ien.l((igf)o4, (bua)new rin(d2, dkn3, value, b14, n == 1, b9, bqo, (lta)d2.v, y4c.e));
            final int d6 = y4c.d;
            boolean b23 = false;
            Label_3669: {
                if (d6 != 7) {
                    if (d6 != 8) {
                        b23 = true;
                        break Label_3669;
                    }
                }
                b23 = false;
            }
            final boolean booleanValue = (boolean)((xom)w73).getValue();
            final boolean g4 = gva.g(b23);
            final boolean h15 = gva.h((Object)w70);
            final Object r15 = gva.R();
            Object o7;
            if ((g4 | h15) || (o7 = r15) == a) {
                o7 = new vx1(b23, (Object)w70, (byte)1);
                gva.q0(o7);
            }
            final igf y = uoo.Y((igf)o4, booleanValue, b23, (jta)o7);
            Object o8 = gva.j((sei)cm1.a);
            final long a10 = ((j86)gva.j((sei)cm1.b)).a;
            final long c6 = t08.c(1308617531);
            final int i2 = j86.i;
            if (!foo.a(a10, c6)) {
                o8 = new cam(a10);
            }
            final boolean h16 = gva.h((Object)d2);
            final boolean f9 = gva.f(o8);
            final Object r16 = gva.R();
            Object o9;
            if ((h16 | f9) || (o9 = r16) == a) {
                o9 = new e4((Object)d2, o8, (byte)27);
                gva.q0(o9);
            }
            final igf e3 = rml.F(rml.F(tsf.L(igf.E(t08.G((igf)o4, (lta)o9)), w70, d2, dkn3).E(y).E(p19), (lta)new n90((Object)c, (Object)d2, (byte)9)), (lta)new n90((Object)d2, (Object)dkn3, (byte)4)).E(k);
            boolean b24 = true;
            igf igf2 = ien.D(e3.E((igf)new ai6((bua)new bj4((Object)sjn, b3, (Object)llf, (byte)1))).E(f7).E((igf)qb7), (lta)new gb7(d2, (byte)0));
            if (twl.C) {
                igf2 = xiq.d(igf2, dkn3, i);
            }
            if (!b3 || !d2.b() || !(boolean)d2.q.getValue() || !((n6d)z0q).b()) {
                b24 = false;
            }
            if (b24) {
                o4 = xiq.S(dkn3);
            }
            G(igf2, dkn3, uuj.t0(-814563849, (aua)new hb7(ye6, mnn, d2, n2, n, b, sjn, value, f, j, e2, d5, (igf)o4, rl2, dkn3, b24, b4, z0q, i, lta, b9, xc8), gva), gva, 384);
        }
        else {
            gva.Z();
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new ib7(value, u, igf, mnn, f, lta, llf, cam, b, n, n2, y4c, b2, b3, b4, ye6, n3, n4);
        }
    }
    
    public static final void G(final igf igf, final dkn dkn, final ye6 ye6, final gva gva, final int n) {
        gva.i0(2036174316);
        int n2;
        if (gva.f((Object)igf)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.h((Object)dkn)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x93) != 0x92)) {
            final moe c = rj2.c((gx)wab.x, true);
            final int hashCode = Long.hashCode(gva.T);
            final e3h l = gva.l();
            final igf b = ien.B(gva, igf);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, c);
            k8e.P((zta)awp.z, gva, l);
            k8e.P((zta)awp.B, gva, hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, b);
            lq6.c(dkn, ye6, gva, n4 >> 3 & 0x7E);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)igf, (Object)dkn, (Object)ye6, (byte)9);
        }
    }
    
    public static final void H(vfj vfj, st4 st4, z8b z8b, final gva gva, final int n) {
        gva.i0(848605432);
        final int n2 = n | 0x92;
        if (gva.W(n2 & 0x1, (n2 & 0x93) != 0x92)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                final odk a2 = ii8.a(gva);
                final boolean f = gva.f((Object)null);
                final boolean f2 = gva.f((Object)a2);
                final Object r = gva.R();
                if ((f | f2) || (vfj = (vfj)r) == a) {
                    vfj = (vfj)a2.d((Class)vfj.class, (emi)null);
                    gva.q0((Object)vfj);
                }
                final vfj vfj2 = vfj;
                final odk a3 = ii8.a(gva);
                final boolean f3 = gva.f((Object)null);
                final boolean f4 = gva.f((Object)a3);
                final Object r2 = gva.R();
                Object o;
                if ((f3 | f4) || (o = r2) == a) {
                    o = a3.d((Class)st4.class, (emi)null);
                    gva.q0(o);
                }
                final st4 st5 = (st4)o;
                final odk a4 = ii8.a(gva);
                final boolean f5 = gva.f((Object)null);
                final boolean f6 = gva.f((Object)a4);
                final Object r3 = gva.R();
                Object o2;
                if ((f5 | f6) || (o2 = r3) == a) {
                    o2 = a4.d((Class)z8b.class, (emi)null);
                    gva.q0(o2);
                }
                z8b = (z8b)o2;
                vfj = vfj2;
                st4 = st5;
            }
            gva.r();
            final bnf w = ljq.w((yom)vfj.j, gva);
            final boolean h = gva.h((Object)z8b);
            final boolean h2 = gva.h((Object)vfj);
            final Object r4 = gva.R();
            Object o3;
            if ((h | h2) || (o3 = r4) == a) {
                o3 = new pp0((Object)z8b, (Object)vfj, (f07)null, (byte)6);
                gva.q0(o3);
            }
            uuj.R((lta)o3, gva, 0);
            final ke ke = new ke((byte)3);
            final boolean h3 = gva.h((Object)st4);
            final boolean h4 = gva.h((Object)vfj);
            final Object r5 = gva.R();
            Object o4;
            if ((h3 | h4) || (o4 = r5) == a) {
                o4 = new tt8((Object)st4, (Object)vfj, (byte)7);
                gva.q0(o4);
            }
            final a1e d = k8e.D(ke, (lta)o4, gva, 0);
            final eia eia = (eia)((xom)w).getValue();
            final boolean f7 = gva.f((Object)w);
            final boolean h5 = gva.h((Object)st4);
            final boolean h6 = gva.h((Object)vfj);
            final boolean h7 = gva.h((Object)d);
            final Object r6 = gva.R();
            Object o5;
            if ((f7 | h5 | h6 | h7) || (o5 = r6) == a) {
                o5 = new xw4(st4, vfj, d, w, (f07)null);
                gva.q0(o5);
            }
            mlc.f((zta)o5, gva, eia);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new up4(n, (Object)vfj, (Object)st4, (Object)z8b, (byte)11);
        }
    }
    
    public static final void I(final lta lta, final irk irk, final igf igf, final ye6 ye6, final gva gva, final int n) {
        gva.i0(-1387314949);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.h((Object)lta)) {
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
        int n4 = n3;
        if ((n & 0x30) == 0x0) {
            boolean b;
            if ((n & 0x40) == 0x0) {
                b = gva.f((Object)irk);
            }
            else {
                b = gva.h((Object)irk);
            }
            int n5;
            if (b) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if ((n & 0x180) == 0x0) {
            int n6;
            if (gva.f((Object)igf)) {
                n6 = 256;
            }
            else {
                n6 = 128;
            }
            n4 |= n6;
        }
        int n7 = n4;
        if ((n & 0xC00) == 0x0) {
            int n8;
            if (gva.h((Object)ye6)) {
                n8 = 2048;
            }
            else {
                n8 = 1024;
            }
            n7 = (n4 | n8);
        }
        if (gva.W(n7 & 0x1, (n7 & 0x493) != 0x492)) {
            final View view = (View)gva.j((sei)q50.f);
            final b09 s = hm6.s;
            final qnn qnn = (qnn)gva.j((sei)s);
            final b09 f = hm6.f;
            final y45 y45 = (y45)gva.j((sei)f);
            final boolean f2 = gva.f((Object)y45);
            final Object r = gva.R();
            final cib a = bi6.a;
            k33 k33;
            if (f2 || (k33 = (k33)r) == a) {
                k33 = new k33(y45);
                gva.q0((Object)k33);
            }
            final k33 k34 = k33;
            final boolean f3 = gva.f((Object)view);
            final boolean f4 = gva.f((Object)k34);
            final Object r2 = gva.R();
            acj acj;
            if ((f3 | f4) || (acj = (acj)r2) == a) {
                acj = new acj(view, k34);
                gva.q0((Object)acj);
            }
            final acj acj2 = acj;
            final boolean h = gva.h((Object)acj2);
            final boolean b2 = (n7 & 0xE) == 0x4;
            final Object r3 = gva.R();
            Object o;
            if ((h | b2) || (o = r3) == a) {
                o = new zyh((byte)21, lta, (Object)acj2);
                gva.q0(o);
            }
            mlc.l((jta)o, gva);
            c5q.d(new ffi[] { s.a((Object)acj2), f.a((Object)k34) }, (zta)uuj.t0(-916700101, (aua)new ij9(irk, igf, qnn, y45, ye6), gva), gva, 48);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new th8(lta, irk, igf, ye6, n);
        }
    }
    
    public static final void J(final dkn dkn, final boolean b, final gva gva, final int n) {
        gva.i0(626339208);
        int n2;
        if (gva.h((Object)dkn)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        int n3;
        if (gva.g(b)) {
            n3 = 32;
        }
        else {
            n3 = 16;
        }
        final int n4 = n2 | n | n3;
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            if (b) {
                gva.g0(1530097388);
                final j7d d = dkn.d;
                omn omn2;
                final omn omn = omn2 = null;
                if (d != null) {
                    final pmn d2 = d.d();
                    omn2 = omn;
                    if (d2 != null) {
                        final omn a = d2.a;
                        final j7d d3 = dkn.d;
                        final boolean b2 = d3 == null || d3.p;
                        omn2 = omn;
                        if (!b2) {
                            omn2 = a;
                        }
                    }
                }
                if (omn2 == null) {
                    gva.g0(1530097387);
                    gva.q(false);
                }
                else {
                    gva.g0(1530097388);
                    if (!dnn.d(dkn.r().b)) {
                        gva.g0(2109807302);
                        final int g = dkn.b.G((int)(dkn.r().b >> 32));
                        final int g2 = dkn.b.G((int)(dkn.r().b & 0xFFFFFFFFL));
                        final int a2 = omn2.a(g);
                        final int a3 = omn2.a(Math.max(g2 - 1, 0));
                        final j7d d4 = dkn.d;
                        if (d4 != null && (boolean)d4.m.getValue()) {
                            gva.g0(2110225306);
                            uiq.h(true, a2, dkn, gva, (n4 << 6 & 0x380) | 0x6);
                            gva.q(false);
                        }
                        else {
                            gva.g0(2110490542);
                            gva.q(false);
                        }
                        final j7d d5 = dkn.d;
                        if (d5 != null && (boolean)d5.n.getValue()) {
                            gva.g0(2110574459);
                            uiq.h(false, a3, dkn, gva, (n4 << 6 & 0x380) | 0x6);
                            gva.q(false);
                        }
                        else {
                            gva.g0(2110838734);
                            gva.q(false);
                        }
                        gva.q(false);
                    }
                    else {
                        gva.g0(2110860558);
                        gva.q(false);
                    }
                    final j7d d6 = dkn.d;
                    if (d6 != null) {
                        final ksg l = d6.l;
                        if (!mlc.q(dkn.v.a.w, dkn.r().a.w)) {
                            l.setValue((Object)Boolean.FALSE);
                        }
                        if (d6.b()) {
                            if (l.getValue()) {
                                dkn.z();
                            }
                            else {
                                dkn.s();
                            }
                        }
                    }
                    gva.q(false);
                }
                gva.q(false);
            }
            else {
                gva.g0(1989076778);
                gva.q(false);
                dkn.s();
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new uf0((Object)dkn, b, n, (byte)1);
        }
    }
    
    public static final void K(final dkn dkn, final gva gva, final int n) {
        gva.i0(-1436003720);
        int n2;
        if (gva.h((Object)dkn)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        Label_0563: {
            if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
                final j7d d = dkn.d;
                if (d != null && (boolean)d.o.getValue()) {
                    final og0 q = dkn.q();
                    if (q != null && q.w.length() > 0) {
                        gva.g0(-2112351432);
                        final boolean f = gva.f((Object)dkn);
                        final Object r = gva.R();
                        final cib a = bi6.a;
                        Object o;
                        if (f || (o = r) == a) {
                            o = new vjn(dkn);
                            gva.q0(o);
                        }
                        final dhn dhn = (dhn)o;
                        final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
                        final o6g b = dkn.b;
                        final long b2 = dkn.r().b;
                        final int c = dnn.c;
                        final int g = b.G((int)(b2 >> 32));
                        final j7d d2 = dkn.d;
                        pmn d3;
                        if (d2 != null) {
                            d3 = d2.d();
                        }
                        else {
                            d3 = null;
                        }
                        d3.getClass();
                        final omn a2 = d3.a;
                        final k2j c2 = a2.c(ncq.o(g, 0, a2.a.a.w.length()));
                        final long n4 = (long)Float.floatToRawIntBits(xc8.w0(2.0f) / 2.0f + c2.a) << 32 | ((long)Float.floatToRawIntBits(c2.d) & 0xFFFFFFFFL);
                        final boolean e = gva.e(n4);
                        final Object r2 = gva.R();
                        Object o2;
                        if (e || (o2 = r2) == a) {
                            o2 = new mb7(n4);
                            gva.q0(o2);
                        }
                        final q6g q6g = (q6g)o2;
                        final boolean h = gva.h((Object)dhn);
                        final boolean h2 = gva.h((Object)dkn);
                        final Object r3 = gva.R();
                        Object o3;
                        if ((h | h2) || (o3 = r3) == a) {
                            o3 = new pb7((Object)dhn, (Object)dkn, (byte)0);
                            gva.q0(o3);
                        }
                        final igf b3 = p6n.b((igf)fgf.v, (Object)dhn, (PointerInputEventHandler)o3);
                        final boolean e2 = gva.e(n4);
                        final Object r4 = gva.R();
                        Object o4;
                        if (e2 || (o4 = r4) == a) {
                            o4 = new b60((byte)5, n4);
                            gva.q0(o4);
                        }
                        d60.a(q6g, wsk.b((lta)o4, b3, false), 0L, gva, 0, 4);
                        gva.q(false);
                        break Label_0563;
                    }
                }
                gva.g0(-2111042550);
                gva.q(false);
            }
            else {
                gva.Z();
            }
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new pz4((Object)dkn, n, (byte)12);
        }
    }
    
    public static final x8c L(final z8c z8c, final float n, final float n2, final w8c w8c, String s, final gva gva, final int n3, final int n4) {
        if ((n4 & 0x8) != 0x0) {
            s = "FloatAnimation";
        }
        return M(z8c, (Number)n, (Number)n2, yi2.e, w8c, s, gva, (n3 & 0x3FE) | 0x8000 | (n3 << 3 & 0x70000));
    }
    
    public static final x8c M(final z8c z8c, final Number n, final Number n2, final elo elo, final w8c w8c, final String s, final gva gva, final int n3) {
        final Object r = gva.R();
        final cib a = bi6.a;
        Object o;
        if (r == a) {
            o = new x8c(z8c, n, n2, elo, w8c);
            gva.q0(o);
        }
        else {
            o = r;
        }
        final x8c x8c = (x8c)o;
        final boolean b = true;
        final boolean b2 = (((n3 & 0x70) ^ 0x30) > 32 && gva.h((Object)n)) || (n3 & 0x30) == 0x20;
        final boolean b3 = (((n3 & 0x380) ^ 0x180) > 256 && gva.h((Object)n2)) || (n3 & 0x180) == 0x100;
        boolean b4 = false;
        Label_0192: {
            if (((0xE000 & n3) ^ 0x6000) > 16384) {
                b4 = b;
                if (gva.h((Object)w8c)) {
                    break Label_0192;
                }
            }
            b4 = ((n3 & 0x6000) == 0x4000 && b);
        }
        final Object r2 = gva.R();
        Object o2;
        if ((b2 | b3 | b4) || (o2 = r2) == a) {
            o2 = new ng4((Object)n, (Object)x8c, (Object)n2, (Object)w8c, (byte)4);
            gva.q0(o2);
        }
        mlc.l((jta)o2, gva);
        final boolean h = gva.h((Object)z8c);
        final Object r3 = gva.R();
        Object o3;
        if (h || (o3 = r3) == a) {
            o3 = new tt8((Object)z8c, (Object)x8c, (byte)6);
            gva.q0(o3);
        }
        mlc.a(x8c, (lta)o3, gva);
        return x8c;
    }
    
    public static final void N(final int n, final StringBuilder sb) {
        for (int i = 0; i < n; ++i) {
            sb.append("?");
            if (i < n - 1) {
                sb.append(",");
            }
        }
    }
    
    public static final Executor O(final ic7 ic7) {
        ot9 ot9;
        if (ic7 instanceof ot9) {
            ot9 = (ot9)ic7;
        }
        else {
            ot9 = null;
        }
        if (ot9 != null) {
            final Executor k1 = ot9.k1();
            if (k1 != null) {
                return k1;
            }
        }
        return (Executor)new to8(ic7);
    }
    
    public static final void P(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        en9.j(smk.o(n, n2, "index: ", ", size: "));
    }
    
    public static final void Q(final int n, final int n2) {
        if (n >= 0 && n <= n2) {
            return;
        }
        en9.j(smk.o(n, n2, "index: ", ", size: "));
    }
    
    public static final void R(final int n, final int n2, final int n3) {
        if (n < 0 || n2 > n3) {
            fvd.g(n3, hia.o(n, n2, "fromIndex: ", ", toIndex: ", ", size: "));
            return;
        }
        if (n <= n2) {
            return;
        }
        en9.s(smk.o(n, n2, "fromIndex: ", " > toIndex: "));
    }
    
    public static final void S(final long n, final zhg zhg) {
        if (zhg == zhg.v) {
            if (gv6.h(n) == Integer.MAX_VALUE) {
                jac.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        }
        else if (gv6.i(n) == Integer.MAX_VALUE) {
            jac.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }
    
    public static final long T() {
        return Thread.currentThread().getId();
    }
    
    public static final void V(final j7d j7d) {
        final dmn e = j7d.e;
        if (e != null) {
            j7d.v.b((Object)mln.a((mln)j7d.d.w, (og0)null, 0L, 3));
            final amn a = e.a;
            if (idn.p(a.b, (Object)e)) {
                a.a.c();
            }
        }
        j7d.e = null;
    }
    
    public static final ic7 W(final Executor executor) {
        to8 to8;
        if (executor instanceof to8) {
            to8 = (to8)executor;
        }
        else {
            to8 = null;
        }
        if (to8 != null) {
            final ic7 v = to8.v;
            if (v != null) {
                return v;
            }
        }
        return (ic7)new pt9(executor);
    }
    
    public static q9f X(q9f h, final qzc qzc, final mnn mnn, final xc8 xc8, final tna tna) {
        if (h != null && qzc == h.a && k8e.F(mnn, qzc).equals((Object)h.b) && xc8.getDensity() == h.c.v && tna == h.d) {
            return h;
        }
        h = q9f.h;
        if (h != null && qzc == h.a && k8e.F(mnn, qzc).equals((Object)h.b) && xc8.getDensity() == h.c.v && tna == h.d) {
            return h;
        }
        h = new q9f(qzc, k8e.F(mnn, qzc), new ad8(xc8.getDensity(), xc8.o0()), tna);
        return q9f.h = h;
    }
    
    public static final gbd Y(View view) {
        while (view != null) {
            final Object tag = view.getTag(2131297128);
            gbd gbd;
            if (tag instanceof gbd) {
                gbd = (gbd)tag;
            }
            else {
                gbd = null;
            }
            if (gbd != null) {
                return gbd;
            }
            final ViewParent z = soh.z(view);
            if (z instanceof View) {
                view = (View)z;
            }
            else {
                view = null;
            }
        }
        return null;
    }
    
    public static String Z() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_2        
        //     5: ifnonnull       205
        //     8: getstatic       android/os/Build$VERSION.SDK_INT:I
        //    11: bipush          28
        //    13: if_icmplt       26
        //    16: invokestatic    k4.g:()Ljava/lang/String;
        //    19: astore_2       
        //    20: aload_2        
        //    21: putstatic       eqi.e:Ljava/lang/String;
        //    24: aload_2        
        //    25: areturn        
        //    26: getstatic       eqi.f:I
        //    29: istore_1       
        //    30: iload_1        
        //    31: istore_0       
        //    32: iload_1        
        //    33: ifne            44
        //    36: invokestatic    android/os/Process.myPid:()I
        //    39: istore_0       
        //    40: iload_0        
        //    41: putstatic       eqi.f:I
        //    44: aconst_null    
        //    45: astore          4
        //    47: aconst_null    
        //    48: astore_3       
        //    49: aconst_null    
        //    50: astore_2       
        //    51: iload_0        
        //    52: ifgt            60
        //    55: aload_3        
        //    56: astore_2       
        //    57: goto            199
        //    60: iload_0        
        //    61: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    64: invokevirtual   java/lang/String.length:()I
        //    67: istore_1       
        //    68: new             Ljava/lang/StringBuilder;
        //    71: astore_3       
        //    72: aload_3        
        //    73: iload_1        
        //    74: bipush          14
        //    76: iadd           
        //    77: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //    80: aload_3        
        //    81: ldc_w           "/proc/"
        //    84: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    87: pop            
        //    88: aload_3        
        //    89: iload_0        
        //    90: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    93: pop            
        //    94: aload_3        
        //    95: ldc_w           "/cmdline"
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   101: pop            
        //   102: aload_3        
        //   103: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   106: astore          7
        //   108: invokestatic    android/os/StrictMode.allowThreadDiskReads:()Landroid/os/StrictMode$ThreadPolicy;
        //   111: astore          5
        //   113: new             Ljava/io/BufferedReader;
        //   116: astore_3       
        //   117: new             Ljava/io/FileReader;
        //   120: astore          6
        //   122: aload           6
        //   124: aload           7
        //   126: invokespecial   java/io/FileReader.<init>:(Ljava/lang/String;)V
        //   129: aload_3        
        //   130: aload           6
        //   132: invokespecial   java/io/BufferedReader.<init>:(Ljava/io/Reader;)V
        //   135: aload           5
        //   137: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   140: aload_3        
        //   141: invokevirtual   java/io/BufferedReader.readLine:()Ljava/lang/String;
        //   144: astore          4
        //   146: aload           4
        //   148: invokestatic    ao2.z:(Ljava/lang/Object;)V
        //   151: aload           4
        //   153: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   156: astore          4
        //   158: aload           4
        //   160: astore_2       
        //   161: aload_3        
        //   162: invokestatic    b7r.g:(Ljava/io/Closeable;)V
        //   165: goto            199
        //   168: astore_2       
        //   169: goto            187
        //   172: astore_2       
        //   173: aload           4
        //   175: astore_3       
        //   176: goto            187
        //   179: astore_3       
        //   180: aload           5
        //   182: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //   185: aload_3        
        //   186: athrow         
        //   187: aload_3        
        //   188: invokestatic    b7r.g:(Ljava/io/Closeable;)V
        //   191: aload_2        
        //   192: athrow         
        //   193: astore_3       
        //   194: aconst_null    
        //   195: astore_3       
        //   196: goto            161
        //   199: aload_2        
        //   200: putstatic       eqi.e:Ljava/lang/String;
        //   203: aload_2        
        //   204: areturn        
        //   205: aload_2        
        //   206: areturn        
        //   207: astore          4
        //   209: goto            161
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  60     113    193    199    Ljava/io/IOException;
        //  60     113    172    179    Any
        //  113    135    179    187    Any
        //  135    140    193    199    Ljava/io/IOException;
        //  135    140    172    179    Any
        //  140    158    207    212    Ljava/io/IOException;
        //  140    158    168    172    Any
        //  180    187    193    199    Ljava/io/IOException;
        //  180    187    172    179    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0161:
        //     at q5.p.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:150)
        //     at q5.p.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:470)
        //     at u5.m.d(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:30)
        //     at u5.i.g(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:23)
        //     at u5.i.f(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:159)
        //     at u5.i.j(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:619)
        //     at u5.i.k(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:13)
        //     at u5.i.i(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:29)
        //     at s5.b.a(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:90)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.decompileWithProcyon(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:367)
        //     at com.thesourceofcode.jadec.decompilers.JavaExtractionWorker.doWork(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:162)
        //     at com.thesourceofcode.jadec.decompilers.BaseDecompiler.withAttempt(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:3)
        //     at z6.a.run(r8-map-id-5336d296fbf3284427aba3c9406dc63d81d5d24d9edcf157bc560c004a742559:31)
        //     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1100)
        //     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
        //     at java.lang.Thread.run(Thread.java:1572)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final bzj a0(final goe goe) {
        final Object z = goe.z();
        if (z instanceof bzj) {
            return (bzj)z;
        }
        return null;
    }
    
    public static final zoa b0() {
        return new zoa(550);
    }
    
    public static final float c0(final bzj bzj) {
        if (bzj != null) {
            return bzj.a;
        }
        return 0.0f;
    }
    
    public static final int d0(final fw0 fw0, final Object o, final int n) {
        final int x = fw0.x;
        if (x == 0) {
            return -1;
        }
        try {
            int o2 = o50.o(x, n, fw0.v);
            if (o2 >= 0) {
                if (!mlc.q(o, fw0.w[o2])) {
                    int n2;
                    for (n2 = o2 + 1; n2 < x && fw0.v[n2] == n; ++n2) {
                        if (mlc.q(o, fw0.w[n2])) {
                            return n2;
                        }
                    }
                    --o2;
                    while (o2 >= 0 && fw0.v[o2] == n) {
                        if (mlc.q(o, fw0.w[o2])) {
                            return o2;
                        }
                        --o2;
                    }
                    return ~n2;
                }
            }
            return o2;
        }
        catch (final IndexOutOfBoundsException ex) {
            en9.c();
            return 0;
        }
    }
    
    public static boolean e0(final Context context) {
        return ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
    }
    
    public static hpb f0(final tjc tjc, final cx7 cx7, final lta lta, final xv7 xv7, final jta jta) {
        return new hpb(tjc, lta, xv7, 1, jta);
    }
    
    public static final void g0(final j7d j7d, final mln mln, final o6g o6g) {
        final r7m a = q7m.a();
        lta e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b = q7m.b(a);
        try {
            final pmn d = j7d.d();
            if (d == null) {
                return;
            }
            final dmn e2 = j7d.e;
            if (e2 == null) {
                return;
            }
            final nzc c = j7d.c();
            if (c == null) {
                return;
            }
            jiq.i(mln, j7d.a, d.a, c, e2, j7d.b(), o6g);
        }
        finally {
            q7m.d(a, b, e);
        }
    }
    
    public static final igf h0(final igf igf, final lta lta) {
        return igf.E((igf)new qla(lta));
    }
    
    public static final xog i0(int n, final gva gva) {
        final Context context = (Context)gva.j((sei)q50.b);
        final Resources resources = (Resources)gva.j((sei)q50.c);
        final umj umj = (umj)gva.j((sei)q50.e);
        final umj umj2;
        monitorenter(umj2 = umj);
        Label_0514: {
            TypedValue typedValue;
            try {
                if ((typedValue = (TypedValue)umj.a.b(n)) == null) {
                    typedValue = new TypedValue();
                    resources.getValue(n, typedValue, true);
                    final jlf a = umj.a;
                    final int d = a.d(n);
                    final Object[] c = a.c;
                    final Object o = c[d];
                    a.b[d] = n;
                    c[d] = typedValue;
                }
            }
            finally {
                break Label_0514;
            }
            monitorexit(umj2);
            final CharSequence string = typedValue.string;
            final gva gva2;
            if (string != null && kym.N0(string, (CharSequence)".xml")) {
                gva2.g0(-1771798434);
                final Resources$Theme theme = context.getTheme();
                final int changingConfigurations = typedValue.changingConfigurations;
                final r4c r4c = (r4c)gva2.j((sei)q50.d);
                final q4c q4c = new q4c(theme, n);
                final WeakReference weakReference = (WeakReference)r4c.a.get((Object)q4c);
                p4c p4c;
                if (weakReference != null) {
                    p4c = (p4c)((Reference)weakReference).get();
                }
                else {
                    p4c = null;
                }
                p4c n2 = p4c;
                if (p4c == null) {
                    XmlResourceParser xml;
                    for (xml = resources.getXml(n), n = ((XmlPullParser)xml).next(); n != 2 && n != 1; n = ((XmlPullParser)xml).next()) {}
                    if (n != 2) {
                        throw new XmlPullParserException("No start tag found");
                    }
                    if (!mlc.q(((XmlPullParser)xml).getName(), "vector")) {
                        en9.s("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
                        return null;
                    }
                    n2 = o50.N(theme, resources, xml, changingConfigurations);
                    r4c.a.put((Object)q4c, (Object)new WeakReference((Object)n2));
                }
                final VectorPainter t = ljq.T(n2.a, gva2);
                gva2.q(false);
                return (xog)t;
            }
            gva2.g0(-1771643000);
            final Resources$Theme theme2 = context.getTheme();
            final boolean f = gva2.f((Object)string);
            final boolean d2 = gva2.d(n);
            final boolean f2 = gva2.f((Object)theme2);
            final Object r = gva2.R();
            Label_0457: {
                if (!(f2 | (f | d2))) {
                    final n70 h;
                    if ((h = (n70)r) != bi6.a) {
                        break Label_0457;
                    }
                }
                try {
                    final n70 h = t7r.h(resources, n);
                    gva2.q0((Object)h);
                    final BitmapPainter bitmapPainter = new BitmapPainter((n70)h);
                    gva2.q(false);
                    return (xog)bitmapPainter;
                }
                catch (final Exception ex) {
                    final StringBuilder sb = new StringBuilder("Error attempting to load resource: ");
                    sb.append((Object)string);
                    throw new ResourceResolutionException(ex, sb.toString());
                }
            }
        }
        monitorexit(umj2);
    }
    
    public static final Object j0(final Object o) {
        if (o instanceof cd6) {
            return new jpj(((cd6)o).a);
        }
        return o;
    }
    
    public static final z8c k0(final String s, final gva gva, final int n) {
        Object r;
        if ((r = gva.R()) == bi6.a) {
            r = new z8c();
            gva.q0(r);
        }
        final z8c z8c = (z8c)r;
        z8c.a(0, gva);
        return z8c;
    }
    
    public static final c4j l0(Object[] copy, final gva gva) {
        copy = Arrays.copyOf(copy, copy.length);
        boolean d = gva.d(copy.length);
        for (int length = copy.length, i = 0; i < length; ++i) {
            d |= gva.f(copy[i]);
        }
        final Object r = gva.R();
        Object o;
        if (d || (o = r) == bi6.a) {
            o = new Object();
            gva.q0(o);
        }
        return (c4j)o;
    }
    
    public static final View m0(final t98 t98) {
        if (!t98.z0().I) {
            gac.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View)l0d.a(soh.L(t98));
    }
    
    public static final xgc n0(final CharSequence charSequence, final int n, final Set set) {
        if (charSequence.length() != 0) {
            if (n >= 0) {
                if (n <= charSequence.length()) {
                    final int n2 = n - 1;
                    final int n3 = 0;
                    int n4;
                    if ((n4 = n2) < 0) {
                        n4 = 0;
                    }
                    while (n4 > 0 && !lq6.V(charSequence.charAt(n4)) && charSequence.charAt(n4) != '/') {
                        --n4;
                    }
                    int n5 = n4;
                    if (lq6.V(charSequence.charAt(n4))) {
                        n5 = n4 + 1;
                    }
                    if (n5 < charSequence.length()) {
                        if (charSequence.charAt(n5) == '/') {
                            if (n5 > 0 && !lq6.V(charSequence.charAt(n5 - 1))) {
                                return null;
                            }
                            int n7;
                            int n6;
                            for (n6 = (n7 = n5 + 1); n7 < charSequence.length() && !lq6.V(charSequence.charAt(n7)); ++n7) {}
                            if (n7 == n6) {
                                return null;
                            }
                            int n8 = n3;
                            if (n7 < charSequence.length()) {
                                n8 = n3;
                                if (charSequence.charAt(n7) == ' ') {
                                    n8 = 1;
                                }
                            }
                            if (n7 < charSequence.length() && n8 == 0) {
                                return null;
                            }
                            if (!set.contains((Object)charSequence.subSequence(n6, n7).toString())) {
                                return null;
                            }
                            if (n8 == 0) {
                                --n7;
                            }
                            if (n5 <= n && n <= n7) {
                                return (xgc)new vgc(n5, n7, 1);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
    
    public static final void o0(final amn amn, final j7d j7d, final mln mln, final y4c y4c, final o6g o6g) {
        final vcc d = j7d.d;
        final gb7 v = j7d.v;
        final gb7 w = j7d.w;
        final Object o = new Object();
        final z6n z6n = new z6n((Object)d, (Object)v, o, (byte)2);
        final tbh a = amn.a;
        a.d(mln, y4c, z6n, w);
        final dmn dmn = new dmn(amn, a);
        amn.b.set((Object)dmn);
        ((b4j)o).v = dmn;
        j7d.e = dmn;
        g0(j7d, mln, o6g);
    }
    
    public static final long p0(final long n) {
        final long n2 = 0x3FL & n;
        final int n3 = (int)n2;
        if (n3 <= 15) {
            return n;
        }
        if (n3 == ((u86)x86.u).c) {
            return t08.o0(n);
        }
        if ((n3 == ((u86)x86.v).c || n3 == ((u86)x86.w).c) && Build$VERSION.SDK_INT < 34) {
            return t08.o0(n);
        }
        if (n3 == ((u86)x86.x).c && Build$VERSION.SDK_INT < 36) {
            return t08.o0(n);
        }
        return (n & 0xFFFFFFFFFFFFFFC0L) | n2 - 1L;
    }
    
    public static final String q0(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (final byte b : array) {
            sb.append("0123456789abcdef".charAt((b & 0xFF) >>> 4));
            sb.append("0123456789abcdef".charAt(b & 0xF));
        }
        return sb.toString();
    }
    
    public static final long r0(final long n) {
        final int n2 = (int)(0x3FL & n);
        if (n2 != ((u86)x86.x).c && n2 != ((u86)x86.s).c && n2 != ((u86)x86.t).c) {
            return p0(n);
        }
        return p0(j86.a(n, (u86)x86.e));
    }
    
    public abstract byte A();
    
    public abstract short B();
    
    public float C() {
        this.U();
        throw null;
    }
    
    public float D(final SerialDescriptor serialDescriptor, final int n) {
        return this.C();
    }
    
    public double E() {
        this.U();
        throw null;
    }
    
    public void U() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)v4j.a((Class)this.getClass()));
        sb.append(" can't retrieve untyped values");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public jl6 b(final SerialDescriptor serialDescriptor) {
        return this;
    }
    
    public Decoder d(final boh boh, final int n) {
        return this.x(((zid)boh).j(n));
    }
    
    public boolean e() {
        this.U();
        throw null;
    }
    
    public char f() {
        this.U();
        throw null;
    }
    
    public int g(final SerialDescriptor serialDescriptor) {
        this.U();
        throw null;
    }
    
    public long h(final SerialDescriptor serialDescriptor, final int n) {
        return this.q();
    }
    
    public void i(final SerialDescriptor serialDescriptor) {
    }
    
    public char j(final boh boh, final int n) {
        return this.f();
    }
    
    public byte l(final boh boh, final int n) {
        return this.A();
    }
    
    public abstract int m();
    
    public short n(final boh boh, final int n) {
        return this.B();
    }
    
    public int o(final SerialDescriptor serialDescriptor, final int n) {
        return this.m();
    }
    
    public String p() {
        this.U();
        throw null;
    }
    
    public abstract long q();
    
    public boolean r(final SerialDescriptor serialDescriptor, final int n) {
        return this.e();
    }
    
    public String s(final SerialDescriptor serialDescriptor, final int n) {
        return this.p();
    }
    
    public boolean t() {
        return true;
    }
    
    public Object w(final SerialDescriptor serialDescriptor, final int n, final KSerializer kSerializer, final Object o) {
        if (!kSerializer.getDescriptor().d() && !((Decoder)this).t()) {
            return null;
        }
        return ((Decoder)this).v(kSerializer);
    }
    
    public Decoder x(final SerialDescriptor serialDescriptor) {
        return (Decoder)this;
    }
    
    public double y(final SerialDescriptor serialDescriptor, final int n) {
        return this.E();
    }
    
    public Object z(final SerialDescriptor serialDescriptor, final int n, final KSerializer kSerializer, final Object o) {
        return ((Decoder)this).v(kSerializer);
    }
}
