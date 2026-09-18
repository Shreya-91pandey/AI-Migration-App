import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.node.LayoutNode;

public abstract class fy1
{
    public static final long a;
    
    static {
        a = ncq.b(40.0f, 40.0f);
    }
    
    public static final void a(final iln iln, final igf igf, boolean b, boolean b2, tdc tdc, final mnn mnn, mvc mvc, djn djn, zta zta, llf llf, qm2 qm2, na6 na6, nhn nhn, ufk t, final gva gva, final int n, final int n2) {
        gva.i0(469439921);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)iln)) {
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
        if ((n & 0x30) == 0x0) {
            int n5;
            if (gva.f((Object)igf)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 |= n5;
        }
        final int n6 = n2 & 0x4;
        int n9 = 0;
        Label_0154: {
            int n7;
            if (n6 != 0) {
                n7 = (n4 | 0x180);
            }
            else {
                n7 = n4;
                if ((n & 0x180) == 0x0) {
                    int n8;
                    if (gva.g(b)) {
                        n8 = 256;
                    }
                    else {
                        n8 = 128;
                    }
                    n9 = (n4 | n8);
                    break Label_0154;
                }
            }
            n9 = n7;
        }
        final int n10 = n2 & 0x8;
        final int n11 = 2048;
        int n14 = 0;
        Label_0228: {
            int n12;
            if (n10 != 0) {
                n12 = (n9 | 0xC00);
            }
            else {
                n12 = n9;
                if ((n & 0xC00) == 0x0) {
                    int n13;
                    if (gva.g(b2)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n9 | n13);
                    break Label_0228;
                }
            }
            n14 = n12;
        }
        final int n15 = n2 & 0x10;
        final int n16 = 8192;
        int n19 = 0;
        Label_0303: {
            int n17;
            if (n15 != 0) {
                n17 = (n14 | 0x6000);
            }
            else {
                n17 = n14;
                if ((n & 0x6000) == 0x0) {
                    int n18;
                    if (gva.f((Object)tdc)) {
                        n18 = 16384;
                    }
                    else {
                        n18 = 8192;
                    }
                    n19 = (n14 | n18);
                    break Label_0303;
                }
            }
            n19 = n17;
        }
        int n20 = n19;
        if ((n & 0x30000) == 0x0) {
            int n21;
            if (gva.f((Object)mnn)) {
                n21 = 131072;
            }
            else {
                n21 = 65536;
            }
            n20 = (n19 | n21);
        }
        final int n22 = n2 & 0x40;
        int n23;
        if (n22 != 0) {
            n23 = (n20 | 0x180000);
        }
        else {
            n23 = n20;
            if ((n & 0x180000) == 0x0) {
                int n24;
                if (gva.f((Object)mvc)) {
                    n24 = 1048576;
                }
                else {
                    n24 = 524288;
                }
                n23 = (n20 | n24);
            }
        }
        int n25;
        if ((n2 & 0x80) != 0x0) {
            n25 = (n23 | 0xC00000);
        }
        else {
            n25 = n23;
            if ((n & 0xC00000) == 0x0) {
                int n26;
                if (gva.f((Object)null)) {
                    n26 = 8388608;
                }
                else {
                    n26 = 4194304;
                }
                n25 = (n23 | n26);
            }
        }
        final int n27 = n2 & 0x100;
        int n28;
        if (n27 != 0) {
            n28 = (n25 | 0x6000000);
        }
        else {
            n28 = n25;
            if ((n & 0x6000000) == 0x0) {
                int n29;
                if (gva.f((Object)djn)) {
                    n29 = 67108864;
                }
                else {
                    n29 = 33554432;
                }
                n28 = (n25 | n29);
            }
        }
        final int n30 = n2 & 0x200;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x30000000);
        }
        else {
            n31 = n28;
            if ((n & 0x30000000) == 0x0) {
                int n32;
                if (gva.h((Object)zta)) {
                    n32 = 536870912;
                }
                else {
                    n32 = 268435456;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n2 & 0x400;
        int n34;
        if (n33 != 0) {
            n34 = 6;
        }
        else if (gva.f((Object)llf)) {
            n34 = 4;
        }
        else {
            n34 = 2;
        }
        final int n35 = n2 & 0x800;
        int n36;
        if (n35 != 0) {
            n36 = (n34 | 0x30);
        }
        else {
            int n37;
            if (gva.f((Object)qm2)) {
                n37 = 32;
            }
            else {
                n37 = 16;
            }
            n36 = (n34 | n37);
        }
        final int n38 = n2 & 0x1000;
        int n39;
        if (n38 != 0) {
            n39 = (n36 | 0x180);
        }
        else {
            int n40;
            if (gva.f((Object)na6)) {
                n40 = 256;
            }
            else {
                n40 = 128;
            }
            n39 = (n36 | n40);
        }
        final int n41 = n2 & 0x2000;
        int n42;
        if (n41 != 0) {
            n42 = (n39 | 0xC00);
        }
        else {
            int n43;
            if (gva.f((Object)nhn)) {
                n43 = n11;
            }
            else {
                n43 = 1024;
            }
            n42 = (n39 | n43);
        }
        int n44;
        if ((n2 & 0x4000) == 0x0) {
            n44 = n16;
            if (gva.f((Object)t)) {
                n44 = 16384;
            }
        }
        else {
            n44 = n16;
        }
        final int n45 = n42 | n44;
        if (gva.W(n31 & 0x1, (n31 & 0x12492493) != 0x12492492 || (n45 & 0x2493) != 0x2492)) {
            gva.b0();
            int n46;
            Object a;
            zta zta2;
            tdc tdc2;
            mvc mvc3;
            llf llf3;
            if ((n & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                n46 = n45;
                if ((n2 & 0x4000) != 0x0) {
                    n46 = (n45 & 0xFFFF1FFF);
                }
                final llf llf2 = llf;
                final mvc mvc2 = mvc;
                a = djn;
                zta2 = zta;
                tdc2 = tdc;
                mvc3 = mvc2;
                llf3 = llf2;
            }
            else {
                if (n6 != 0) {
                    b = true;
                }
                if (n10 != 0) {
                    b2 = false;
                }
                if (n15 != 0) {
                    tdc = null;
                }
                mvc g = mvc;
                if (n22 != 0) {
                    g = mvc.g;
                }
                if (n27 != 0) {
                    djn.r.getClass();
                    a = bjn.a();
                }
                else {
                    a = djn;
                }
                if (n30 != 0) {
                    zta2 = null;
                }
                else {
                    zta2 = zta;
                }
                if (n33 != 0) {
                    llf3 = null;
                }
                else {
                    llf3 = llf;
                }
                Object a2;
                if (n35 != 0) {
                    a2 = lx1.a();
                }
                else {
                    a2 = qm2;
                }
                if (n38 != 0) {
                    na6 = null;
                }
                nhn nhn2;
                if (n41 != 0) {
                    nhn2 = null;
                }
                else {
                    nhn2 = nhn;
                }
                if ((n2 & 0x4000) != 0x0) {
                    t = rhc.T(0, 1, gva);
                    n46 = (n45 & 0xFFFF1FFF);
                    final Object o = a2;
                    final nhn nhn3 = nhn2;
                    tdc2 = tdc;
                    mvc3 = g;
                    qm2 = (qm2)o;
                    nhn = nhn3;
                }
                else {
                    final mvc mvc4 = g;
                    final tdc tdc3 = tdc;
                    nhn = nhn2;
                    qm2 = (qm2)a2;
                    mvc3 = mvc4;
                    tdc2 = tdc3;
                    n46 = n45;
                }
            }
            gva.r();
            final int n47 = n46 << 3;
            d(iln, igf, b, b2, tdc2, mnn, mvc3, (djn)a, zta2, llf3, qm2, na6, nhn, t, gva, 0x7FFFFFFE & n31, (n47 & 0x1C00) | ((n46 & 0xE) | 0x180 | (n46 & 0x70)) | (0xE000 & n47) | (n47 & 0x70000));
            final llf llf4 = llf3;
            zta = zta2;
            djn = (djn)a;
            mvc = mvc3;
            tdc = tdc2;
            llf = llf4;
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new tx1(iln, igf, b, b2, tdc, mnn, mvc, djn, zta, llf, qm2, na6, nhn, t, n, n2);
        }
    }
    
    public static final void b(final mln mln, final lta lta, final igf igf, final boolean b, final mnn mnn, final mvc mvc, final gvc gvc, final boolean b2, final int n, final int n2, lep lep, lta lta2, llf llf, final cam cam, final ye6 ye6, final gva gva, final int n3, final int n4, final int n5) {
        gva.i0(-971111025);
        int n7;
        if ((n3 & 0x6) == 0x0) {
            int n6;
            if (gva.f((Object)mln)) {
                n6 = 4;
            }
            else {
                n6 = 2;
            }
            n7 = (n6 | n3);
        }
        else {
            n7 = n3;
        }
        int n8 = n7;
        if ((n3 & 0x30) == 0x0) {
            int n9;
            if (gva.h((Object)lta)) {
                n9 = 32;
            }
            else {
                n9 = 16;
            }
            n8 = (n7 | n9);
        }
        if ((n3 & 0x180) == 0x0) {
            int n10;
            if (gva.f((Object)igf)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n8 |= n10;
        }
        final int n11 = 2048;
        if ((n3 & 0xC00) == 0x0) {
            int n12;
            if (gva.g(b)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n8 |= n12;
        }
        final int n13 = 8192;
        int n14;
        if ((n5 & 0x10) != 0x0) {
            n14 = (n8 | 0x6000);
        }
        else {
            n14 = n8;
            if ((n3 & 0x6000) == 0x0) {
                int n15;
                if (gva.g(false)) {
                    n15 = 16384;
                }
                else {
                    n15 = 8192;
                }
                n14 = (n8 | n15);
            }
        }
        final int n16 = 65536;
        int n17 = n14;
        if ((n3 & 0x30000) == 0x0) {
            int n18;
            if (gva.f((Object)mnn)) {
                n18 = 131072;
            }
            else {
                n18 = 65536;
            }
            n17 = (n14 | n18);
        }
        int n19 = n17;
        if ((n3 & 0x180000) == 0x0) {
            int n20;
            if (gva.f((Object)mvc)) {
                n20 = 1048576;
            }
            else {
                n20 = 524288;
            }
            n19 = (n17 | n20);
        }
        int n22;
        if ((n3 & 0xC00000) == 0x0) {
            int n21;
            if (gva.f((Object)gvc)) {
                n21 = 8388608;
            }
            else {
                n21 = 4194304;
            }
            n22 = (n19 | n21);
        }
        else {
            n22 = n19;
        }
        int n23 = n22;
        if ((n3 & 0x6000000) == 0x0) {
            int n24;
            if (gva.g(b2)) {
                n24 = 67108864;
            }
            else {
                n24 = 33554432;
            }
            n23 = (n22 | n24);
        }
        int n25 = n23;
        if ((n3 & 0x30000000) == 0x0) {
            int n26;
            if (gva.d(n)) {
                n26 = 536870912;
            }
            else {
                n26 = 268435456;
            }
            n25 = (n23 | n26);
        }
        int n28;
        if ((n4 & 0x6) == 0x0) {
            int n27;
            if (gva.d(n2)) {
                n27 = 4;
            }
            else {
                n27 = 2;
            }
            n28 = (n4 | n27);
        }
        else {
            n28 = n4;
        }
        final int n29 = n5 & 0x800;
        int n30;
        if (n29 != 0) {
            n30 = (n28 | 0x30);
        }
        else {
            n30 = n28;
            if ((n4 & 0x30) == 0x0) {
                int n31;
                if (gva.f((Object)lep)) {
                    n31 = 32;
                }
                else {
                    n31 = 16;
                }
                n30 = (n28 | n31);
            }
        }
        final int n32 = n30 | 0x180;
        final int n33 = n5 & 0x2000;
        int n34;
        if (n33 != 0) {
            n34 = (n30 | 0xD80);
        }
        else if ((n4 & 0xC00) == 0x0) {
            int n35;
            if (gva.f((Object)llf)) {
                n35 = n11;
            }
            else {
                n35 = 1024;
            }
            n34 = (n32 | n35);
        }
        else {
            n34 = n32;
        }
        if ((n4 & 0x6000) == 0x0) {
            int n36 = n13;
            if (gva.f((Object)cam)) {
                n36 = 16384;
            }
            n34 |= n36;
        }
        int n37 = n34;
        if ((n4 & 0x30000) == 0x0) {
            int n38 = n16;
            if (gva.h((Object)ye6)) {
                n38 = 131072;
            }
            n37 = (n34 | n38);
        }
        boolean b3 = true;
        lep lep2;
        llf llf3;
        if (gva.W(n25 & 0x1, (n25 & 0x12492493) != 0x12492492 || (n37 & 0x12493) != 0x12492)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
            }
            else {
                Object e = lep;
                if (n29 != 0) {
                    e = def.E;
                }
                Object r;
                if ((r = gva.R()) == a) {
                    r = new ot1((byte)15);
                    gva.q0(r);
                }
                final lta lta3 = lta2 = (lta)r;
                lep = (lep)e;
                if (n33 != 0) {
                    llf = null;
                    lep = (lep)e;
                    lta2 = lta3;
                }
            }
            gva.r();
            final y4c e2 = mvc.e(b2);
            int n39;
            if (b2) {
                n39 = 1;
            }
            else {
                n39 = n2;
            }
            int n40;
            if (b2) {
                n40 = 1;
            }
            else {
                n40 = n;
            }
            final boolean b4 = (n25 & 0xE) == 0x4;
            if ((n25 & 0x70) != 0x20) {
                b3 = false;
            }
            final Object r2 = gva.R();
            Object o;
            if ((b4 | b3) || (o = r2) == a) {
                o = new y((Object)mln, (Object)lta, (byte)20);
                gva.q0(o);
            }
            final lta lta4 = (lta)o;
            final int n41 = n37 << 9;
            eqi.F(mln, lta4, igf, mnn, lep, lta2, llf, cam, b2 ^ true, n40, n39, e2, gvc, b, false, ye6, gva, (n25 & 0x38E) | (n25 >> 6 & 0x1C00) | (n41 & 0xE000) | (n41 & 0x70000) | (n41 & 0x380000) | (n41 & 0x1C00000), (n25 & 0x1C00) | (n25 >> 15 & 0x380) | (n25 & 0xE000) | (n37 & 0x70000));
            final llf llf2 = llf;
            lep2 = lep;
            llf3 = llf2;
        }
        else {
            gva.Z();
            final lep lep3 = lep;
            llf3 = llf;
            lep2 = lep3;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new ox1(mln, lta, igf, b, mnn, mvc, gvc, b2, n, n2, lep2, lta2, llf3, cam, ye6, n3, n4, n5);
        }
    }
    
    public static final void c(final String s, final lta lta, final igf igf, boolean b, boolean b2, final mnn mnn, final mvc mvc, gvc g, boolean b3, int n, int n2, lep e, final lta lta2, final llf llf, final cam cam, final ye6 ye6, final gva gva, final int n3, final int n4) {
        gva.i0(2026950908);
        int n6;
        if ((n3 & 0x6) == 0x0) {
            int n5;
            if (gva.f((Object)s)) {
                n5 = 4;
            }
            else {
                n5 = 2;
            }
            n6 = (n5 | n3);
        }
        else {
            n6 = n3;
        }
        int n7 = n6;
        if ((n3 & 0x30) == 0x0) {
            int n8;
            if (gva.h((Object)lta)) {
                n8 = 32;
            }
            else {
                n8 = 16;
            }
            n7 = (n6 | n8);
        }
        int n10;
        if ((n3 & 0x180) == 0x0) {
            int n9;
            if (gva.f((Object)igf)) {
                n9 = 256;
            }
            else {
                n9 = 128;
            }
            n10 = (n7 | n9);
        }
        else {
            n10 = n7;
        }
        final int n11 = n4 & 0x8;
        int n14 = 0;
        Label_0201: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0xC00);
            }
            else {
                n12 = n10;
                if ((n3 & 0xC00) == 0x0) {
                    int n13;
                    if (gva.g(b)) {
                        n13 = 2048;
                    }
                    else {
                        n13 = 1024;
                    }
                    n14 = (n10 | n13);
                    break Label_0201;
                }
            }
            n14 = n12;
        }
        final int n15 = n4 & 0x10;
        final int n16 = 8192;
        int n17;
        if (n15 != 0) {
            n17 = (n14 | 0x6000);
        }
        else {
            n17 = n14;
            if ((n3 & 0x6000) == 0x0) {
                int n18;
                if (gva.g(b2)) {
                    n18 = 16384;
                }
                else {
                    n18 = 8192;
                }
                n17 = (n14 | n18);
            }
        }
        int n19 = n17;
        if ((n3 & 0x30000) == 0x0) {
            int n20;
            if (gva.f((Object)mnn)) {
                n20 = 131072;
            }
            else {
                n20 = 65536;
            }
            n19 = (n17 | n20);
        }
        int n21 = n19;
        if ((n3 & 0x180000) == 0x0) {
            int n22;
            if (gva.f((Object)mvc)) {
                n22 = 1048576;
            }
            else {
                n22 = 524288;
            }
            n21 = (n19 | n22);
        }
        final int n23 = n4 & 0x80;
        int n24;
        if (n23 != 0) {
            n24 = (n21 | 0xC00000);
        }
        else {
            n24 = n21;
            if ((n3 & 0xC00000) == 0x0) {
                int n25;
                if (gva.f((Object)g)) {
                    n25 = 8388608;
                }
                else {
                    n25 = 4194304;
                }
                n24 = (n21 | n25);
            }
        }
        final int n26 = n4 & 0x100;
        int n27;
        if (n26 != 0) {
            n27 = (n24 | 0x6000000);
        }
        else {
            n27 = n24;
            if ((n3 & 0x6000000) == 0x0) {
                int n28;
                if (gva.g(b3)) {
                    n28 = 67108864;
                }
                else {
                    n28 = 33554432;
                }
                n27 = (n24 | n28);
            }
        }
        int n30;
        if ((n3 & 0x30000000) == 0x0) {
            int n29;
            if ((n4 & 0x200) == 0x0 && gva.d(n)) {
                n29 = 536870912;
            }
            else {
                n29 = 268435456;
            }
            n30 = (n27 | n29);
        }
        else {
            n30 = n27;
        }
        final int n31 = n4 & 0x400;
        int n32;
        if (n31 != 0) {
            n32 = 196614;
        }
        else {
            int n33;
            if (gva.d(n2)) {
                n33 = 4;
            }
            else {
                n33 = 2;
            }
            n32 = (0x30000 | n33);
        }
        final int n34 = n4 & 0x800;
        int n35;
        if (n34 != 0) {
            n35 = (n32 | 0x30);
        }
        else {
            int n36;
            if (gva.f((Object)e)) {
                n36 = 32;
            }
            else {
                n36 = 16;
            }
            n35 = (n32 | n36);
        }
        final int n37 = n4 & 0x2000;
        int n38;
        if (n37 != 0) {
            n38 = (n35 | 0xD80);
        }
        else {
            int n39;
            if (gva.f((Object)llf)) {
                n39 = 2048;
            }
            else {
                n39 = 1024;
            }
            n38 = (n35 | 0x180 | n39);
        }
        int n40 = n16;
        if (gva.f((Object)cam)) {
            n40 = 16384;
        }
        final int n41 = n38 | n40;
        boolean b4 = true;
        lep lep;
        gvc gvc2;
        lta lta6;
        llf llf5;
        if (gva.W(n30 & 0x1, (n30 & 0x12492493) != 0x12492492 || (n41 & 0x12493) != 0x12492)) {
            gva.b0();
            final cib a = bi6.a;
            boolean b6;
            lta lta3;
            llf llf2;
            int n43;
            if ((n3 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                if ((n4 & 0x200) != 0x0) {
                    n30 &= 0x8FFFFFFF;
                }
                final int n42 = n2;
                final boolean b5 = b2;
                final gvc gvc = g;
                b6 = b;
                lep = e;
                lta3 = lta2;
                llf2 = llf;
                gvc2 = gvc;
                n43 = (b5 ? 1 : 0);
                n2 = n;
                n = n42;
            }
            else {
                if (n11 != 0) {
                    b = true;
                }
                if (n15 != 0) {
                    b2 = false;
                }
                if (n23 != 0) {
                    g = gvc.g;
                }
                if (n26 != 0) {
                    b3 = false;
                }
                if ((n4 & 0x200) != 0x0) {
                    if (b3) {
                        n = 1;
                    }
                    else {
                        n = Integer.MAX_VALUE;
                    }
                    n30 &= 0x8FFFFFFF;
                }
                if (n31 != 0) {
                    n2 = 1;
                }
                if (n34 != 0) {
                    e = (lep)def.E;
                }
                Object r = gva.R();
                if (r == a) {
                    r = new mx1((byte)0);
                    gva.q0(r);
                }
                final lta lta4 = (lta)r;
                llf llf3;
                if (n37 != 0) {
                    llf3 = null;
                }
                else {
                    llf3 = llf;
                }
                final llf llf4 = llf3;
                final int n44 = n;
                final boolean b7 = b2;
                n = n2;
                lep = e;
                lta3 = lta4;
                b6 = b;
                n2 = n44;
                n43 = (b7 ? 1 : 0);
                gvc2 = g;
                llf2 = llf4;
            }
            gva.r();
            Object o = gva.R();
            if (o == a) {
                o = o50.Q((Object)new mln(s, 0L, 6));
                gva.q0(o);
            }
            final bnf bnf = (bnf)o;
            final mln b8 = mln.b((mln)((xom)bnf).getValue(), s, 0L, 6);
            final boolean f = gva.f((Object)b8);
            final Object r2 = gva.R();
            Object o2;
            if (f || (o2 = r2) == a) {
                o2 = new jd0((Object)b8, (Object)bnf, (byte)7);
                gva.q0(o2);
            }
            mlc.l((jta)o2, gva);
            final boolean b9 = (n30 & 0xE) == 0x4;
            final Object r3 = gva.R();
            Object q;
            if (b9 || (q = r3) == a) {
                q = o50.Q((Object)s);
                gva.q0(q);
            }
            final bnf bnf2 = (bnf)q;
            final y4c e2 = mvc.e(b3);
            int n45;
            if (b3) {
                n45 = 1;
            }
            else {
                n45 = n;
            }
            int n46;
            if (b3) {
                n46 = 1;
            }
            else {
                n46 = n2;
            }
            final boolean f2 = gva.f((Object)bnf2);
            if ((n30 & 0x70) != 0x20) {
                b4 = false;
            }
            final Object r4 = gva.R();
            Object o3;
            if ((f2 | b4) || (o3 = r4) == a) {
                o3 = new rx1((Object)lta, (Object)bnf, (Object)bnf2, (byte)0);
                gva.q0(o3);
            }
            final lta lta5 = (lta)o3;
            final int n47 = n41 << 9;
            eqi.F(b8, lta5, igf, mnn, lep, lta3, llf2, cam, b3 ^ true, n46, n45, e2, gvc2, b6, (boolean)(n43 != 0), ye6, gva, (n30 & 0x380) | (n30 >> 6 & 0x1C00) | (n47 & 0xE000) | 0x30000 | (0x380000 & n47) | (n47 & 0x1C00000), (n30 >> 15 & 0x380) | (n30 & 0x1C00) | (n30 & 0xE000) | 0x30000);
            final int n48 = n43;
            final int n49 = n;
            b = b6;
            b2 = (n48 != 0);
            n = n2;
            n2 = n49;
            lta6 = lta3;
            llf5 = llf2;
        }
        else {
            gva.Z();
            llf5 = llf;
            lta6 = lta2;
            lep = e;
            gvc2 = g;
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new sx1(s, lta, igf, b, b2, mnn, mvc, gvc2, b3, n, n2, lep, lta6, llf5, cam, ye6, n3, n4);
        }
    }
    
    public static final void d(final iln iln, final igf igf, final boolean b, final boolean b2, final tdc tdc, final mnn mnn, final mvc mvc, final djn djn, final zta zta, final llf llf, final qm2 qm2, final na6 na6, final nhn nhn, final ufk ufk, final gva gva, final int n, final int n2) {
        gva.i0(965149429);
        int n4;
        if ((n & 0x6) == 0x0) {
            int n3;
            if (gva.f((Object)iln)) {
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
        final int n5 = 16;
        int n6 = n4;
        if ((n & 0x30) == 0x0) {
            int n7;
            if (gva.f((Object)igf)) {
                n7 = 32;
            }
            else {
                n7 = 16;
            }
            n6 = (n4 | n7);
        }
        final int n8 = 128;
        int n9 = n6;
        if ((n & 0x180) == 0x0) {
            int n10;
            if (gva.g(b)) {
                n10 = 256;
            }
            else {
                n10 = 128;
            }
            n9 = (n6 | n10);
        }
        final int n11 = 1024;
        int n13;
        if ((n & 0xC00) == 0x0) {
            int n12;
            if (gva.g(b2)) {
                n12 = 2048;
            }
            else {
                n12 = 1024;
            }
            n13 = (n9 | n12);
        }
        else {
            n13 = n9;
        }
        final int n14 = 8192;
        int n15 = n13;
        if ((n & 0x6000) == 0x0) {
            int n16;
            if (gva.f((Object)tdc)) {
                n16 = 16384;
            }
            else {
                n16 = 8192;
            }
            n15 = (n13 | n16);
        }
        final int n17 = 131072;
        int n18 = n15;
        if ((n & 0x30000) == 0x0) {
            int n19;
            if (gva.f((Object)mnn)) {
                n19 = 131072;
            }
            else {
                n19 = 65536;
            }
            n18 = (n15 | n19);
        }
        int n20 = n18;
        if ((n & 0x180000) == 0x0) {
            int n21;
            if (gva.f((Object)mvc)) {
                n21 = 1048576;
            }
            else {
                n21 = 524288;
            }
            n20 = (n18 | n21);
        }
        int n22 = n20;
        if ((n & 0xC00000) == 0x0) {
            int n23;
            if (gva.f((Object)null)) {
                n23 = 8388608;
            }
            else {
                n23 = 4194304;
            }
            n22 = (n20 | n23);
        }
        int n24 = n22;
        if ((n & 0x6000000) == 0x0) {
            int n25;
            if (gva.f((Object)djn)) {
                n25 = 67108864;
            }
            else {
                n25 = 33554432;
            }
            n24 = (n22 | n25);
        }
        int n26 = n24;
        if ((n & 0x30000000) == 0x0) {
            int n27;
            if (gva.h((Object)zta)) {
                n27 = 536870912;
            }
            else {
                n27 = 268435456;
            }
            n26 = (n24 | n27);
        }
        int n29;
        if ((n2 & 0x6) == 0x0) {
            int n28;
            if (gva.f((Object)llf)) {
                n28 = 4;
            }
            else {
                n28 = 2;
            }
            n29 = (n2 | n28);
        }
        else {
            n29 = n2;
        }
        int n30 = n29;
        if ((n2 & 0x30) == 0x0) {
            int n31 = n5;
            if (gva.f((Object)qm2)) {
                n31 = 32;
            }
            n30 = (n29 | n31);
        }
        int n33;
        if ((n2 & 0x180) == 0x0) {
            int n32 = n8;
            if (gva.f((Object)null)) {
                n32 = 256;
            }
            n33 = (n30 | n32);
        }
        else {
            n33 = n30;
        }
        int n34 = n33;
        if ((n2 & 0xC00) == 0x0) {
            int n35 = n11;
            if (gva.f((Object)na6)) {
                n35 = 2048;
            }
            n34 = (n33 | n35);
        }
        int n36 = n34;
        if ((n2 & 0x6000) == 0x0) {
            boolean b3;
            if ((0x8000 & n2) == 0x0) {
                b3 = gva.f((Object)nhn);
            }
            else {
                b3 = gva.h((Object)nhn);
            }
            int n37 = n14;
            if (b3) {
                n37 = 16384;
            }
            n36 = (n34 | n37);
        }
        if ((n2 & 0x30000) == 0x0) {
            int n38;
            if (gva.f((Object)ufk)) {
                n38 = n17;
            }
            else {
                n38 = 65536;
            }
            n36 |= n38;
        }
        final int n39 = n36 | 0x180000;
        if (gva.W(n26 & 0x1, (n26 & 0x12492493) != 0x12492492 || (0x92493 & n39) != 0x92492)) {
            gva.b0();
            if ((n & 0x1) != 0x0) {
                if (!gva.C()) {
                    gva.Z();
                }
            }
            gva.r();
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final boolean q = mlc.q((Object)djn, (Object)wab.j0);
            final cib a = bi6.a;
            llf llf2;
            if (llf == null) {
                gva.g0(-2038132442);
                Object o;
                if ((o = gva.R()) == a) {
                    o = oz1.g(gva);
                }
                llf2 = (llf)o;
                gva.q(false);
            }
            else {
                gva.g0(-204294191);
                gva.q(false);
                llf2 = llf;
            }
            final zhg v = zhg.v;
            zhg w;
            if (q) {
                w = zhg.w;
            }
            else {
                w = v;
            }
            Object o2 = gva.R();
            if (o2 == a) {
                o2 = csl.b(0, 3, 2);
                gva.q0(o2);
            }
            final ymf ymf = (ymf)o2;
            final boolean b4 = (n26 & 0xE) == 0x4;
            final boolean b5 = (n39 & 0x380) == 0x100;
            final boolean b6 = (n39 & 0x1C00) == 0x800;
            final Object r = gva.R();
            peo peo;
            if ((b4 | b5 | b6) || (peo = (peo)r) == a) {
                cib c = cib.C;
                if (!q) {
                    c = null;
                }
                peo = new peo(iln, tdc, c, na6);
                gva.q0((Object)peo);
            }
            final peo peo2 = peo;
            final boolean f = gva.f((Object)peo2);
            final Object r2 = gva.R();
            qmn qmn;
            if (f || (qmn = (qmn)r2) == a) {
                qmn = new qmn();
                gva.q0((Object)qmn);
            }
            final qmn qmn2 = qmn;
            mvc l;
            if (tdc != null) {
                l = tdc.l();
            }
            else {
                l = null;
            }
            final mvc b7 = mvc.b(l);
            Object o3;
            if ((o3 = gva.R()) == a) {
                o3 = mlc.z((hc7)o89.v, gva);
                gva.q0(o3);
            }
            final oc7 oc7 = (oc7)o3;
            gva.g0(-2036249936);
            jpd jpd;
            if ((jpd = mnn.a.k) == null) {
                final jpd x = jpd.x;
                jpd = zah.a.v();
            }
            final lbh b8 = mbh.b(upk.v, jpd, gva, 6);
            gva.q(false);
            Object r3 = gva.R();
            if (r3 == a) {
                r3 = new g66((byte)1);
                gva.q0(r3);
            }
            final x9o x9o = (x9o)r3;
            final y45 y45 = (y45)gva.j((sei)hm6.f);
            final boolean f2 = gva.f((Object)peo2);
            Object r4 = gva.R();
            if (f2 || r4 == a) {
                r4 = new ykn(peo2, qmn2, xc8, b, b2, x9o, oc7, b8, y45);
                gva.q0(r4);
            }
            final ykn ykn = (ykn)r4;
            final ccb ccb = (ccb)gva.j((sei)hm6.l);
            final qnn qnn = (qnn)gva.j((sei)hm6.s);
            final boolean f3 = gva.f((Object)oc7);
            final boolean f4 = gva.f((Object)qnn);
            final Object r5 = gva.R();
            cy1 cy1;
            if ((f3 | f4) || (cy1 = (cy1)r5) == a) {
                cy1 = new cy1(qnn, oc7);
                gva.q0((Object)cy1);
            }
            final cy1 cy2 = cy1;
            final boolean f5 = gva.f((Object)peo2);
            final boolean b9 = (0xE000 & n26) == 0x4000;
            final boolean h = gva.h((Object)ykn);
            final boolean h2 = gva.h((Object)ccb);
            final boolean h3 = gva.h((Object)y45);
            final boolean f6 = gva.f((Object)cy2);
            final boolean f7 = gva.f((Object)xc8);
            final boolean b10 = (n26 & 0x380) == 0x100;
            final boolean b11 = (n26 & 0x1C00) == 0x800;
            final boolean b12 = (n39 & 0x380000) == 0x100000;
            Object r6 = gva.R();
            if ((b10 | (f5 | b9 | h | h2 | h3 | f6 | f7) | b11 | b12) || r6 == a) {
                r6 = new ux1(peo2, tdc, ykn, ccb, y45, cy2, xc8, b, b2);
                gva.q0(r6);
            }
            mlc.l((jta)r6, gva);
            final boolean h4 = gva.h((Object)ykn);
            final Object r7 = gva.R();
            Object o4;
            if (h4 || (o4 = r7) == a) {
                o4 = new i1((Object)ykn, (byte)7);
                gva.q0(o4);
            }
            mlc.a((Object)ykn, (lta)o4, gva);
            final int c2 = mvc.c;
            boolean b13 = false;
            Label_1830: {
                if (c2 != 7) {
                    if (c2 != 8) {
                        b13 = true;
                        break Label_1830;
                    }
                }
                b13 = false;
            }
            final kkn kkn = (kkn)ykn.s.getValue();
            final boolean g = gva.g(b13);
            final boolean h5 = gva.h((Object)ymf);
            Object r8 = gva.R();
            if ((g | h5) || r8 == a) {
                r8 = new vx1(b13, (Object)ymf, (byte)0);
                gva.q0(r8);
            }
            final igf e = uoo.Y(igf, b, b13, (jta)r8).E((igf)new ohn(peo2, qmn2, ykn, tdc, b, b2, b7, q, llf2, ymf));
            final boolean b14 = b && kkn == kkn.v;
            boolean b15 = false;
            Label_2005: {
                if (qzc == qzc.w) {
                    if (w != v) {
                        b15 = false;
                        break Label_2005;
                    }
                }
                b15 = true;
            }
            final igf a2 = dgk.a(e, (mgk)ufk, w, b14, b15, null, llf2, 160);
            neh.a.getClass();
            igf igf2 = x90.F(a2, x90.e);
            if (twl.C) {
                igf2 = ajq.i(igf2, ykn, oc7);
            }
            final moe c3 = rj2.c((gx)wab.x, true);
            final int hashCode = Long.hashCode(gva.T);
            final e3h i = gva.l();
            final igf b16 = ien.B(gva, igf2);
            vh6.e.getClass();
            gva.k0();
            if (gva.S) {
                gva.k((jta)LayoutNode.n0);
            }
            else {
                gva.t0();
            }
            k8e.P((zta)awp.A, gva, (Object)c3);
            k8e.P((zta)awp.z, gva, (Object)i);
            k8e.P((zta)awp.B, gva, (Object)hashCode);
            k8e.C(gva);
            k8e.P((zta)awp.y, gva, (Object)b16);
            lq6.d(ykn, b, uuj.t0(-673241599, (aua)new wx1(nhn, llf2, djn, mnn, qmn2, q, kkn, peo2, ykn, qm2, b, b2, ufk, w, x9o, b8, zta, b7), gva), gva, (n26 >> 3 & 0x70) | 0x180);
            gva.q(true);
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new xx1(iln, igf, b, b2, tdc, mnn, mvc, djn, zta, llf, qm2, na6, nhn, ufk, n, n2);
        }
    }
    
    public static final void e(final ykn ykn, final gva gva, final int n) {
        gva.i0(1991581797);
        int n2;
        if (gva.h((Object)ykn)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final boolean f = gva.f((Object)ykn);
            final Object r = gva.R();
            final cib a = bi6.a;
            sd8 b;
            if (f || (b = (sd8)r) == a) {
                b = r8m.b((jta)new px1(ykn, (byte)2));
                gva.q0((Object)b);
            }
            if (((xom)b).getValue()) {
                gva.g0(535437134);
                final boolean h = gva.h((Object)ykn);
                final Object r2 = gva.R();
                Object o;
                if (h || (o = r2) == a) {
                    o = new dy1(ykn, (byte)0);
                    gva.q0(o);
                }
                final q6g q6g = (q6g)o;
                final boolean h2 = gva.h((Object)ykn);
                final Object r3 = gva.R();
                Object o2;
                if (h2 || (o2 = r3) == a) {
                    o2 = new ey1(ykn, (byte)0);
                    gva.q0(o2);
                }
                d60.a(q6g, p6n.b((igf)fgf.v, (Object)ykn, (PointerInputEventHandler)o2), fy1.a, gva, 384, 0);
                gva.q(false);
            }
            else {
                gva.g0(535820573);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new qx1(ykn, n, (byte)1);
        }
    }
    
    public static final void f(final ykn ykn, final gva gva, final int n) {
        gva.i0(2025287684);
        int n2;
        if (gva.h((Object)ykn)) {
            n2 = 4;
        }
        else {
            n2 = 2;
        }
        final int n3 = n2 | n;
        if (gva.W(n3 & 0x1, (n3 & 0x3) != 0x2)) {
            final boolean f = gva.f((Object)ykn);
            final Object r = gva.R();
            final cib a = bi6.a;
            Object b;
            if (f || (b = r) == a) {
                b = r8m.b((jta)new px1(ykn, (byte)0));
                gva.q0(b);
            }
            final din din = (din)((xom)b).getValue();
            final boolean a2 = din.a;
            final fgf v = fgf.v;
            if (a2) {
                gva.g0(-354609545);
                final boolean h = gva.h((Object)ykn);
                final Object r2 = gva.R();
                Object o;
                if (h || (o = r2) == a) {
                    o = new dy1(ykn, (byte)1);
                    gva.q0(o);
                }
                final q6g q6g = (q6g)o;
                final int d = din.d;
                final boolean e = din.e;
                final boolean h2 = gva.h((Object)ykn);
                final Object r3 = gva.R();
                Object o2;
                if (h2 || (o2 = r3) == a) {
                    o2 = new ey1(ykn, (byte)1);
                    gva.q0(o2);
                }
                g9r.c(q6g, true, d, e, fy1.a, din.c, p6n.b((igf)v, (Object)ykn, (PointerInputEventHandler)o2), gva, 24624, 0);
                gva.q(false);
            }
            else {
                gva.g0(-353981826);
                gva.q(false);
            }
            final boolean f2 = gva.f((Object)ykn);
            final Object r4 = gva.R();
            Object b2;
            if (f2 || (b2 = r4) == a) {
                b2 = r8m.b((jta)new px1(ykn, (byte)1));
                gva.q0(b2);
            }
            final din din2 = (din)((xom)b2).getValue();
            if (din2.a) {
                gva.g0(-353488678);
                final boolean h3 = gva.h((Object)ykn);
                final Object r5 = gva.R();
                Object o3;
                if (h3 || (o3 = r5) == a) {
                    o3 = new dy1(ykn, (byte)2);
                    gva.q0(o3);
                }
                final q6g q6g2 = (q6g)o3;
                final int d2 = din2.d;
                final boolean e2 = din2.e;
                final boolean h4 = gva.h((Object)ykn);
                final Object r6 = gva.R();
                Object o4;
                if (h4 || (o4 = r6) == a) {
                    o4 = new ey1(ykn, (byte)2);
                    gva.q0(o4);
                }
                g9r.c(q6g2, false, d2, e2, fy1.a, din2.c, p6n.b((igf)v, (Object)ykn, (PointerInputEventHandler)o4), gva, 24624, 0);
                gva.q(false);
            }
            else {
                gva.g0(-352863842);
                gva.q(false);
            }
        }
        else {
            gva.Z();
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new qx1(ykn, n, (byte)0);
        }
    }
}
