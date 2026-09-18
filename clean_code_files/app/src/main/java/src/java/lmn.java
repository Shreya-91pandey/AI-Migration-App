import java.util.Map;

public abstract class lmn
{
    public static final b09 a;
    
    static {
        a = new b09((jta)new s8k((byte)29), (byte)0);
    }
    
    public static final void a(final mnn mnn, final zta zta, final gva gva, final int n) {
        gva.i0(15327438);
        int n3;
        if ((n & 0x6) == 0x0) {
            int n2;
            if (gva.f((Object)mnn)) {
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
            int n5;
            if (gva.h((Object)zta)) {
                n5 = 32;
            }
            else {
                n5 = 16;
            }
            n4 = (n3 | n5);
        }
        if (gva.W(n4 & 0x1, (n4 & 0x13) != 0x12)) {
            final b09 a = lmn.a;
            c5q.c(a.a((Object)((mnn)gva.j((sei)a)).e(mnn)), zta, gva, (n4 & 0x70) | 0x8);
        }
        else {
            gva.Z();
        }
        final b0j v = gva.v();
        if (v != null) {
            v.d = (zta)new we6((Object)mnn, (Object)zta, n, (byte)11);
        }
    }
    
    public static final void b(final String s, igf v, long h, long c, zoa zoa, una una, long n, wgn wgn, kfn kfn, long c2, int n2, boolean b, int n3, int n4, final lta lta, final mnn mnn, final gva gva, final int n5, final int n6, final int n7) {
        gva.i0(1809465675);
        int n9;
        if ((n5 & 0x6) == 0x0) {
            int n8;
            if (gva.f((Object)s)) {
                n8 = 4;
            }
            else {
                n8 = 2;
            }
            n9 = (n8 | n5);
        }
        else {
            n9 = n5;
        }
        final int n10 = n7 & 0x2;
        int n13 = 0;
        Label_0112: {
            int n11;
            if (n10 != 0) {
                n11 = (n9 | 0x30);
            }
            else {
                n11 = n9;
                if ((n5 & 0x30) == 0x0) {
                    int n12;
                    if (gva.f((Object)v)) {
                        n12 = 32;
                    }
                    else {
                        n12 = 16;
                    }
                    n13 = (n9 | n12);
                    break Label_0112;
                }
            }
            n13 = n11;
        }
        final int n14 = n7 & 0x4;
        int n15;
        if (n14 != 0) {
            n15 = (n13 | 0x180);
        }
        else {
            n15 = n13;
            if ((n5 & 0x180) == 0x0) {
                int n16;
                if (gva.e(h)) {
                    n16 = 256;
                }
                else {
                    n16 = 128;
                }
                n15 = (n13 | n16);
            }
        }
        final int n17 = n15 | 0xC00;
        final int n18 = n7 & 0x10;
        final int n19 = 8192;
        int n20;
        if (n18 != 0) {
            n20 = (n15 | 0x6C00);
        }
        else {
            n20 = n17;
            if ((n5 & 0x6000) == 0x0) {
                int n21;
                if (gva.e(c)) {
                    n21 = 16384;
                }
                else {
                    n21 = 8192;
                }
                n20 = (n17 | n21);
            }
        }
        final int n22 = n20 | 0x30000;
        final int n23 = n7 & 0x40;
        final int n24 = 524288;
        int n25;
        if (n23 != 0) {
            n25 = (n20 | 0x1B0000);
        }
        else {
            n25 = n22;
            if ((n5 & 0x180000) == 0x0) {
                int n26;
                if (gva.f((Object)zoa)) {
                    n26 = 1048576;
                }
                else {
                    n26 = 524288;
                }
                n25 = (n22 | n26);
            }
        }
        final int n27 = n7 & 0x80;
        final int n28 = 4194304;
        int n29;
        if (n27 != 0) {
            n29 = (n25 | 0xC00000);
        }
        else {
            n29 = n25;
            if ((n5 & 0xC00000) == 0x0) {
                int n30;
                if (gva.f((Object)una)) {
                    n30 = 8388608;
                }
                else {
                    n30 = 4194304;
                }
                n29 = (n25 | n30);
            }
        }
        final int n31 = n29 | 0x6000000;
        final int n32 = n7 & 0x200;
        int n33;
        if (n32 != 0) {
            n33 = (n29 | 0x36000000);
        }
        else {
            n33 = n31;
            if ((n5 & 0x30000000) == 0x0) {
                int n34;
                if (gva.f((Object)wgn)) {
                    n34 = 536870912;
                }
                else {
                    n34 = 268435456;
                }
                n33 = (n31 | n34);
            }
        }
        final int n35 = n7 & 0x400;
        int n36;
        if (n35 != 0) {
            n36 = (n6 | 0x6);
        }
        else if ((n6 & 0x6) == 0x0) {
            int n37;
            if (gva.f((Object)kfn)) {
                n37 = 4;
            }
            else {
                n37 = 2;
            }
            n36 = (n6 | n37);
        }
        else {
            n36 = n6;
        }
        final int n38 = n36 | 0x30;
        final int n39 = n7 & 0x1000;
        int n40;
        if (n39 != 0) {
            n40 = (n36 | 0x1B0);
        }
        else if ((n6 & 0x180) == 0x0) {
            int n41;
            if (gva.d(n2)) {
                n41 = 256;
            }
            else {
                n41 = 128;
            }
            n40 = (n38 | n41);
        }
        else {
            n40 = n38;
        }
        final int n42 = n7 & 0x2000;
        if (n42 != 0) {
            n40 |= 0xC00;
        }
        else if ((n6 & 0xC00) == 0x0) {
            int n43;
            if (gva.g(b)) {
                n43 = 2048;
            }
            else {
                n43 = 1024;
            }
            n40 |= n43;
        }
        final int n44 = n7 & 0x4000;
        int n45;
        if (n44 != 0) {
            n45 = (n40 | 0x6000);
        }
        else {
            n45 = n40;
            if ((n6 & 0x6000) == 0x0) {
                int n46 = n19;
                if (gva.d(n3)) {
                    n46 = 16384;
                }
                n45 = (n40 | n46);
            }
        }
        final int n47 = n7 & 0x8000;
        int n48;
        if (n47 != 0) {
            n48 = (n45 | 0x30000);
        }
        else {
            n48 = n45;
            if ((n6 & 0x30000) == 0x0) {
                int n49;
                if (gva.d(n4)) {
                    n49 = 131072;
                }
                else {
                    n49 = 65536;
                }
                n48 = (n45 | n49);
            }
        }
        final int n50 = n7 & 0x10000;
        int n51;
        if (n50 != 0) {
            n51 = (n48 | 0x180000);
        }
        else {
            n51 = n48;
            if ((n6 & 0x180000) == 0x0) {
                int n52 = n24;
                if (gva.h((Object)lta)) {
                    n52 = 1048576;
                }
                n51 = (n48 | n52);
            }
        }
        int n54;
        if ((n6 & 0xC00000) == 0x0) {
            int n53 = n28;
            if ((n7 & 0x20000) == 0x0) {
                n53 = n28;
                if (gva.f((Object)mnn)) {
                    n53 = 8388608;
                }
            }
            n54 = (n51 | n53);
        }
        else {
            n54 = n51;
        }
        final int n55 = 1;
        mnn mnn2;
        lta lta2;
        igf igf3;
        zoa zoa3;
        una una2;
        wgn wgn3;
        if (gva.W(n33 & 0x1, (n33 & 0x12492493) != 0x12492492 || (n54 & 0x492493) != 0x492492)) {
            gva.b0();
            igf igf;
            kfn kfn3;
            if ((n5 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n56 = n54;
                if ((n7 & 0x20000) != 0x0) {
                    n56 = (n54 & 0xFE3FFFFF);
                }
                final long n57 = n;
                final kfn kfn2 = kfn;
                n = c2;
                mnn2 = mnn;
                c2 = n57;
                igf = v;
                kfn3 = kfn2;
                lta2 = lta;
                n54 = n56;
            }
            else {
                if (n10 != 0) {
                    v = (igf)fgf.v;
                }
                if (n14 != 0) {
                    h = j86.h;
                }
                if (n18 != 0) {
                    c = vnn.c;
                }
                final lta lta3 = null;
                if (n23 != 0) {
                    zoa = null;
                }
                if (n27 != 0) {
                    una = null;
                }
                c2 = vnn.c;
                if (n32 != 0) {
                    wgn = null;
                }
                kfn kfn4;
                if (n35 != 0) {
                    kfn4 = null;
                }
                else {
                    kfn4 = kfn;
                }
                if (n39 != 0) {
                    n2 = 1;
                }
                if (n42 != 0) {
                    b = true;
                }
                if (n44 != 0) {
                    n3 = Integer.MAX_VALUE;
                }
                if (n47 != 0) {
                    n4 = n55;
                }
                lta lta4;
                if (n50 != 0) {
                    lta4 = lta3;
                }
                else {
                    lta4 = lta;
                }
                if ((n7 & 0x20000) != 0x0) {
                    mnn2 = (mnn)gva.j((sei)lmn.a);
                    n54 &= 0xFE3FFFFF;
                }
                else {
                    mnn2 = mnn;
                }
                lta2 = lta4;
                n = c2;
                igf = v;
                kfn3 = kfn4;
            }
            gva.r();
            gva.g0(-565217490);
            long n58;
            if (h != 16L) {
                n58 = h;
            }
            else {
                gva.g0(-565216717);
                n58 = mnn2.c();
                if (n58 == 16L) {
                    n58 = ((j86)gva.j((sei)dx6.a)).a;
                }
                gva.q(false);
            }
            gva.q(false);
            int a;
            if (kfn3 != null) {
                a = kfn3.a;
            }
            else {
                a = 0;
            }
            final mnn f = mnn.f(mnn2, n58, c, zoa, una, c2, wgn, a, n, 16609104);
            final int n59 = n54 << 6;
            o50.d(s, igf, f, lta2, n2, b, n3, n4, (rfn)null, gva, (n54 >> 9 & 0x1C00) | (n33 & 0x7E) | (n59 & 0xE000) | (n59 & 0x70000) | (n59 & 0x380000) | (n59 & 0x1C00000) | (n33 << 18 & 0x70000000), 256);
            final igf igf2 = igf;
            final wgn wgn2 = wgn;
            final zoa zoa2 = zoa;
            igf3 = igf2;
            zoa3 = zoa2;
            una2 = una;
            wgn3 = wgn2;
            kfn = kfn3;
        }
        else {
            gva.Z();
            mnn2 = mnn;
            final una una3 = una;
            final long n60 = n;
            wgn3 = wgn;
            n = c2;
            lta2 = lta;
            c2 = n60;
            una2 = una3;
            zoa3 = zoa;
            igf3 = v;
        }
        final b0j v2 = gva.v();
        if (v2 != null) {
            v2.d = (zta)new gmn(s, igf3, h, c, zoa3, una2, c2, wgn3, kfn, n, n2, b, n3, n4, lta2, mnn2, n5, n6, n7);
        }
    }
    
    public static final void c(final og0 og0, igf v, long h, long n, long c, kfn kfn, long n2, int n3, boolean b, int n4, int n5, Map v2, lta lta, mnn mnn, final gva gva, final int n6, final int n7, final int n8) {
        gva.i0(292247417);
        int n10;
        if ((n6 & 0x6) == 0x0) {
            int n9;
            if (gva.f((Object)og0)) {
                n9 = 4;
            }
            else {
                n9 = 2;
            }
            n10 = (n9 | n6);
        }
        else {
            n10 = n6;
        }
        final int n11 = n8 & 0x2;
        int n14 = 0;
        Label_0112: {
            int n12;
            if (n11 != 0) {
                n12 = (n10 | 0x30);
            }
            else {
                n12 = n10;
                if ((n6 & 0x30) == 0x0) {
                    int n13;
                    if (gva.f((Object)v)) {
                        n13 = 32;
                    }
                    else {
                        n13 = 16;
                    }
                    n14 = (n10 | n13);
                    break Label_0112;
                }
            }
            n14 = n12;
        }
        final int n15 = n8 & 0x4;
        int n16;
        if (n15 != 0) {
            n16 = (n14 | 0x180);
        }
        else {
            n16 = n14;
            if ((n6 & 0x180) == 0x0) {
                int n17;
                if (gva.e(h)) {
                    n17 = 256;
                }
                else {
                    n17 = 128;
                }
                n16 = (n14 | n17);
            }
        }
        final int n18 = n16 | 0x36DB6C00;
        final int n19 = n8 & 0x400;
        int n20;
        if (n19 != 0) {
            n20 = (n7 | 0x6);
        }
        else if ((n7 & 0x6) == 0x0) {
            int n21;
            if (gva.f((Object)kfn)) {
                n21 = 4;
            }
            else {
                n21 = 2;
            }
            n20 = (n7 | n21);
        }
        else {
            n20 = n7;
        }
        final int n22 = n20 | 0x30;
        final int n23 = n8 & 0x1000;
        int n24;
        if (n23 != 0) {
            n24 = (n20 | 0x1B0);
        }
        else if ((n7 & 0x180) == 0x0) {
            int n25;
            if (gva.d(n3)) {
                n25 = 256;
            }
            else {
                n25 = 128;
            }
            n24 = (n22 | n25);
        }
        else {
            n24 = n22;
        }
        final int n26 = n24 | 0xC00;
        final int n27 = n8 & 0x4000;
        int n28;
        if (n27 != 0) {
            n28 = (n24 | 0x6C00);
        }
        else {
            n28 = n26;
            if ((n7 & 0x6000) == 0x0) {
                int n29;
                if (gva.d(n4)) {
                    n29 = 16384;
                }
                else {
                    n29 = 8192;
                }
                n28 = (n26 | n29);
            }
        }
        final int n30 = n8 & 0x8000;
        int n31;
        if (n30 != 0) {
            n31 = (n28 | 0x30000);
        }
        else {
            n31 = n28;
            if ((n7 & 0x30000) == 0x0) {
                int n32;
                if (gva.d(n5)) {
                    n32 = 131072;
                }
                else {
                    n32 = 65536;
                }
                n31 = (n28 | n32);
            }
        }
        final int n33 = n8 & 0x10000;
        int n34;
        if (n33 != 0) {
            n34 = (n31 | 0x180000);
        }
        else {
            n34 = n31;
            if ((n7 & 0x180000) == 0x0) {
                int n35;
                if (gva.h((Object)v2)) {
                    n35 = 1048576;
                }
                else {
                    n35 = 524288;
                }
                n34 = (n31 | n35);
            }
        }
        final int n36 = n8 & 0x20000;
        int n37;
        if (n36 != 0) {
            n37 = (n34 | 0xC00000);
        }
        else {
            n37 = n34;
            if ((n7 & 0xC00000) == 0x0) {
                int n38;
                if (gva.h((Object)lta)) {
                    n38 = 8388608;
                }
                else {
                    n38 = 4194304;
                }
                n37 = (n34 | n38);
            }
        }
        int n40;
        if ((n7 & 0x6000000) == 0x0) {
            int n39;
            if ((n8 & 0x40000) == 0x0 && gva.f((Object)mnn)) {
                n39 = 67108864;
            }
            else {
                n39 = 33554432;
            }
            n40 = (n37 | n39);
        }
        else {
            n40 = n37;
        }
        final int n41 = 1;
        igf igf;
        kfn kfn3;
        mnn mnn2;
        if (gva.W(n18 & 0x1, (n18 & 0x12492493) != 0x12492492 || (n40 & 0x2492493) != 0x2492492)) {
            gva.b0();
            final cib a = bi6.a;
            if ((n6 & 0x1) != 0x0 && !gva.C()) {
                gva.Z();
                int n42 = n40;
                if ((n8 & 0x40000) != 0x0) {
                    n42 = (n40 & 0xF1FFFFFF);
                }
                final kfn kfn2 = kfn;
                n40 = n42;
                final long n43 = n;
                n = c;
                igf = v;
                kfn3 = kfn2;
                c = n43;
            }
            else {
                if (n11 != 0) {
                    v = (igf)fgf.v;
                }
                if (n15 != 0) {
                    h = j86.h;
                }
                c = vnn.c;
                if (n19 != 0) {
                    kfn = null;
                }
                if (n23 != 0) {
                    n3 = 1;
                }
                if (n27 != 0) {
                    n4 = Integer.MAX_VALUE;
                }
                if (n30 != 0) {
                    n5 = 1;
                }
                if (n33 != 0) {
                    v2 = (Map)s89.v;
                }
                if (n36 != 0) {
                    Object r;
                    if ((r = gva.R()) == a) {
                        r = new jkn((byte)4);
                        gva.q0(r);
                    }
                    lta = (lta)r;
                }
                if ((n8 & 0x40000) != 0x0) {
                    mnn = (mnn)gva.j((sei)lmn.a);
                    n40 &= 0xF1FFFFFF;
                }
                final kfn kfn4 = kfn;
                b = true;
                n = (n2 = c);
                igf = v;
                kfn3 = kfn4;
            }
            gva.r();
            gva.g0(1676919260);
            long n44;
            if (h != 16L) {
                n44 = h;
            }
            else {
                gva.g0(1676920033);
                n44 = mnn.c();
                if (n44 == 16L) {
                    n44 = ((j86)gva.j((sei)dx6.a)).a;
                }
                gva.q(false);
            }
            gva.q(false);
            final long a2 = ((e8e)gva.j((sei)h8e.a)).a.a;
            final boolean e = gva.e(a2);
            final Object r2 = gva.R();
            vmn vmn;
            if (e || (vmn = (vmn)r2) == a) {
                vmn = new vmn(new hcm(a2, 0L, (zoa)null, (soa)null, (toa)null, (una)null, (String)null, 0L, (zw1)null, (tln)null, (jpd)null, 0L, wgn.c, (rpl)null, 61438), (hcm)null, 14);
                gva.q0((Object)vmn);
            }
            final vmn vmn2 = vmn;
            int n45;
            if ((n18 & 0xE) == 0x4) {
                n45 = n41;
            }
            else {
                n45 = 0;
            }
            final boolean f = gva.f((Object)vmn2);
            final Object r3 = gva.R();
            og0 e2;
            if ((n45 | (f ? 1 : 0)) != 0x0 || (e2 = (og0)r3) == a) {
                e2 = og0.e((lta)new e0j((Object)vmn2, (byte)21));
                gva.q0((Object)e2);
            }
            final og0 og2 = e2;
            int a3;
            if (kfn3 != null) {
                a3 = kfn3.a;
            }
            else {
                a3 = 0;
            }
            final mnn f2 = mnn.f(mnn, n44, c, (zoa)null, (una)null, n, (wgn)null, a3, n2, 16609104);
            final int n46 = n40 << 6;
            o50.c(og2, igf, f2, lta, n3, b, n4, n5, v2, gva, (n40 >> 12 & 0x1C00) | (n18 & 0x70) | (n46 & 0xE000) | (n46 & 0x70000) | (n46 & 0x380000) | (n46 & 0x1C00000) | (n46 & 0xE000000), n18 >> 9 & 0xE, 512);
            final long n47 = c;
            c = n;
            n = n47;
            mnn2 = mnn;
        }
        else {
            gva.Z();
            mnn2 = mnn;
            final igf igf2 = v;
            kfn3 = kfn;
            igf = igf2;
        }
        final b0j v3 = gva.v();
        if (v3 != null) {
            v3.d = (zta)new emn(og0, igf, h, n, c, kfn3, n2, n3, b, n4, n5, v2, lta, mnn2, n6, n7, n8);
        }
    }
}
