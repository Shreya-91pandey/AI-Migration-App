import androidx.compose.ui.platform.AndroidComposeView;

public final class lgf
{
    public final AndroidComposeView a;
    public emf b;
    public emf c;
    public emf d;
    public emf e;
    public boolean f;
    
    public lgf(final AndroidComposeView a) {
        this.a = a;
    }
    
    public static void b(hgf a, final tei tei) {
        if (!a.v.I) {
            gac.c("visitSubtreeIf called on an unattached node");
        }
        final inf inf = new inf(0, new hgf[16]);
        final hgf v = a.v;
        a = v.A;
        if (a == null) {
            soh.i(inf, v);
        }
        else {
            inf.b(a);
        }
    Label_0062:
        while (true) {
            final int x = inf.x;
            if (x == 0) {
                break;
            }
            final hgf hgf = (hgf)inf.l(x - 1);
            if ((hgf.y & 0x20) != 0x0) {
                for (hgf a2 = hgf; a2 != null && a2.I; a2 = a2.A) {
                    if ((a2.x & 0x20) != 0x0) {
                        hgf g = a2;
                        inf inf2 = null;
                        while (g != null) {
                            inf inf3;
                            if (g instanceof mgf) {
                                inf3 = inf2;
                                if (((mgf)g).m0().o(tei)) {
                                    continue Label_0062;
                                }
                            }
                            else {
                                inf3 = inf2;
                                if ((g.x & 0x20) != 0x0) {
                                    inf3 = inf2;
                                    if (g instanceof v98) {
                                        hgf hgf2 = ((v98)g).K;
                                        int n = 0;
                                        while (hgf2 != null) {
                                            hgf hgf3 = g;
                                            inf inf4 = inf2;
                                            int n2 = n;
                                            if ((hgf2.x & 0x20) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    hgf3 = hgf2;
                                                    inf4 = inf2;
                                                }
                                                else {
                                                    inf inf5;
                                                    if ((inf5 = inf2) == null) {
                                                        inf5 = new inf(0, new hgf[16]);
                                                    }
                                                    if ((a = g) != null) {
                                                        inf5.b(g);
                                                        a = null;
                                                    }
                                                    inf5.b(hgf2);
                                                    inf4 = inf5;
                                                    hgf3 = a;
                                                }
                                            }
                                            hgf2 = hgf2.A;
                                            g = hgf3;
                                            inf2 = inf4;
                                            n = n2;
                                        }
                                        inf3 = inf2;
                                        if (n == 1) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            g = soh.G(inf3);
                            inf2 = inf3;
                        }
                    }
                }
            }
            soh.i(inf, hgf);
        }
    }
    
    public final void a() {
        if (!this.f) {
            this.f = true;
            final lce lce = new lce((Object)this, (byte)2);
            final emf l0 = this.a.L0;
            if (l0.h((Object)lce) < 0) {
                l0.b((Object)lce);
            }
        }
    }
}
