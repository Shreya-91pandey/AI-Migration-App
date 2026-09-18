import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

public abstract class zxf
{
    public static final amf a;
    
    static {
        final amf a2 = i4g.a;
        a = new amf();
    }
    
    public static final void a(hgf hgf, final int n, final int n2) {
        if (hgf instanceof v98) {
            final v98 v98 = (v98)hgf;
            final int j = v98.J;
            b(hgf, j & n, n2);
            for (hgf = v98.K; hgf != null; hgf = hgf.A) {
                a(hgf, ~j & n, n2);
            }
            return;
        }
        b(hgf, n & hgf.x, n2);
    }
    
    public static final void b(final hgf hgf, final int n, final int n2) {
        if (n2 != 0 || hgf.d1()) {
            if ((n & 0x2) != 0x0 && hgf instanceof a0d) {
                soh.L((t98)hgf).R();
                if (n2 == 2) {
                    soh.J((t98)hgf, 2).u1();
                }
            }
            if ((n & 0x80) != 0x0 && n2 != 2) {
                soh.L((t98)hgf).R();
            }
            if ((0x400000 & n) != 0x0 && n2 != 2) {
                soh.L((t98)hgf).s0(false);
            }
            if ((n & 0x100) != 0x0 && hgf instanceof x2b) {
                if (n2 != 1) {
                    if (n2 == 2) {
                        final LayoutNode l = soh.L((t98)hgf);
                        l.y0(l.i0 - 1);
                    }
                }
                else {
                    final LayoutNode i = soh.L((t98)hgf);
                    i.y0(i.i0 + 1);
                }
                if (n2 != 2) {
                    final LayoutNode j = soh.L((t98)hgf);
                    if (j.i0 != 0 && !j.u() && !j.B()) {
                        if (!j.h0) {
                            final AndroidComposeView androidComposeView = (AndroidComposeView)l0d.a(j);
                            final e3a e3a = (e3a)androidComposeView.o0.f;
                            if (j.i0 > 0) {
                                ((inf)e3a.w).b((Object)j);
                                j.h0 = true;
                            }
                            androidComposeView.G((LayoutNode)null);
                        }
                    }
                }
            }
            if ((n & 0x4) != 0x0 && hgf instanceof bw8) {
                x90.z((bw8)hgf);
            }
            if ((n & 0x8) != 0x0 && hgf instanceof xsk) {
                soh.L((t98)hgf).N = true;
            }
            if ((n & 0x40) != 0x0 && hgf instanceof msg) {
                soh.L((t98)hgf).S();
            }
            if ((n & 0x800) != 0x0 && hgf instanceof uma) {
                final uma uma = (uma)hgf;
                c13.b = null;
                uma.O((qma)c13.a);
                if (c13.b != null) {
                    clq.p(uma);
                }
            }
            if ((n & 0x1000) != 0x0 && hgf instanceof zla) {
                final zla zla = (zla)hgf;
                final kma d = ((pma)soh.M((t98)zla).getFocusOwner()).d;
                if (d.d.a((Object)zla)) {
                    d.a();
                }
            }
            if ((n & 0x200000) != 0x0 && hgf instanceof m8c && n2 == 2) {
                ((m8c)hgf).y0();
            }
        }
    }
    
    public static final void c(final hgf hgf) {
        if (!hgf.I) {
            gac.c("autoInvalidateUpdatedNode called on unattached node");
        }
        a(hgf, -1, 0);
    }
    
    public static final int d(final ggf ggf) {
        int n;
        if (ggf instanceof xzc) {
            n = 3;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (ggf instanceof aw8) {
            n2 = (n | 0x4);
        }
        int n3 = n2;
        if (ggf instanceof vsk) {
            n3 = (n2 | 0x8);
        }
        int n4 = n3;
        if (ggf instanceof seh) {
            n4 = (n3 | 0x10);
        }
        int n5 = n4;
        if (ggf instanceof ngf) {
            n5 = (n4 | 0x20);
        }
        int n6 = n5;
        if (ggf instanceof fjn) {
            n6 = (n5 | 0x100);
        }
        int n7 = n6;
        if (ggf instanceof lsg) {
            n7 = (n6 | 0x40);
        }
        if (ggf instanceof nl2) {
            return 0x80000 | n7;
        }
        return n7;
    }
    
    public static final int e(final hgf hgf) {
        final int x = hgf.x;
        if (x != 0) {
            return x;
        }
        final Class<? extends hgf> class1 = hgf.getClass();
        final amf a = zxf.a;
        final int d = a.d((Object)class1);
        if (d >= 0) {
            return a.c[d];
        }
        int n;
        if (hgf instanceof a0d) {
            n = 3;
        }
        else {
            n = 1;
        }
        int n2 = n;
        if (hgf instanceof bw8) {
            n2 = (n | 0x4);
        }
        int n3 = n2;
        if (hgf instanceof xsk) {
            n3 = (n2 | 0x8);
        }
        int n4 = n3;
        if (hgf instanceof teh) {
            n4 = (n3 | 0x10);
        }
        int n5 = n4;
        if (hgf instanceof mgf) {
            n5 = (n4 | 0x20);
        }
        int n6 = n5;
        if (hgf instanceof msg) {
            n6 = (n5 | 0x40);
        }
        int n8 = 0;
        Label_0170: {
            int n7;
            if (hgf instanceof v8g) {
                n7 = 4194304;
            }
            else if (hgf instanceof jzc) {
                n7 = 4194432;
            }
            else {
                n8 = n6;
                if (hgf instanceof qoe) {
                    n8 = (n6 | 0x80);
                }
                break Label_0170;
            }
            n8 = (n6 | n7);
        }
        int n9 = n8;
        if (hgf instanceof x2b) {
            n9 = (n8 | 0x100);
        }
        int n10 = n9;
        if (hgf instanceof rt0) {
            n10 = (n9 | 0x200);
        }
        int n11 = n10;
        if (hgf instanceof gna) {
            n11 = (n10 | 0x400);
        }
        int n12 = n11;
        if (hgf instanceof uma) {
            n12 = (n11 | 0x800);
        }
        int n13 = n12;
        if (hgf instanceof zla) {
            n13 = (n12 | 0x1000);
        }
        int n14 = n13;
        if (hgf instanceof ruc) {
            n14 = (n13 | 0x2000);
        }
        int n15 = n14;
        if (hgf instanceof u40) {
            n15 = (n14 | 0x4000);
        }
        int n16 = n15;
        if (hgf instanceof zl6) {
            n16 = (n15 | 0x8000);
        }
        int n17 = n16;
        if (hgf instanceof mic) {
            n17 = (n16 | 0x20000);
        }
        int n18 = n17;
        if (hgf instanceof wfo) {
            n18 = (n17 | 0x40000);
        }
        int n19 = n18;
        if (hgf instanceof nl2) {
            n19 = (n18 | 0x80000);
        }
        int n20 = n19;
        if (hgf instanceof jro) {
            n20 = (n19 | 0x100000);
        }
        int n21 = n20;
        if (hgf instanceof m8c) {
            n21 = (n20 | 0x200000);
        }
        int n22 = n21;
        if (hgf instanceof q3d) {
            n22 = (n21 | 0x800000);
        }
        a.g(n22, (Object)class1);
        return n22;
    }
    
    public static final int f(hgf hgf) {
        if (hgf instanceof v98) {
            final v98 v98 = (v98)hgf;
            int j = v98.J;
            for (hgf = v98.K; hgf != null; hgf = hgf.A) {
                j |= f(hgf);
            }
            return j;
        }
        return e(hgf);
    }
    
    public static final boolean g(final int n) {
        boolean b = false;
        final boolean b2 = (n & 0x80) != 0x0;
        if ((n & 0x400000) != 0x0) {
            b = true;
        }
        return b2 | b;
    }
}
