import androidx.compose.ui.node.LayoutNode;

public final class wxf implements xxf
{
    public final boolean a(final hgf hgf) {
        final inf inf = null;
        hgf g = hgf;
        inf inf2 = inf;
        while (g != null) {
            inf inf3;
            if (g instanceof teh) {
                ((teh)g).c0();
                inf3 = inf2;
            }
            else {
                inf3 = inf2;
                if ((g.x & 0x10) != 0x0) {
                    inf3 = inf2;
                    if (g instanceof v98) {
                        hgf hgf2 = ((v98)g).K;
                        int n = 0;
                        while (hgf2 != null) {
                            inf inf4 = inf2;
                            int n2 = n;
                            hgf hgf3 = g;
                            if ((hgf2.x & 0x10) != 0x0) {
                                n2 = n + 1;
                                if (n2 == 1) {
                                    hgf3 = hgf2;
                                    inf4 = inf2;
                                }
                                else {
                                    if ((inf4 = inf2) == null) {
                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                    }
                                    if ((hgf3 = g) != null) {
                                        inf4.b((Object)g);
                                        hgf3 = null;
                                    }
                                    inf4.b((Object)hgf2);
                                }
                            }
                            hgf2 = hgf2.A;
                            inf2 = inf4;
                            n = n2;
                            g = hgf3;
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
        return false;
    }
    
    public final int c() {
        return 16;
    }
    
    public final void g(final LayoutNode layoutNode, final long n, final dkb dkb, final int n2, final boolean b) {
        layoutNode.N(n, dkb, n2, b);
    }
    
    public final boolean i(final dkb dkb, final LayoutNode layoutNode) {
        final yxf outerCoordinator$ui = layoutNode.getOuterCoordinator$ui();
        outerCoordinator$ui.getClass();
        final hgf k1 = outerCoordinator$ui.k1(zxf.g(16));
        if (k1 != null) {
            if (k1.I) {
                if (!k1.v.I) {
                    gac.c("visitLocalDescendants called on an unattached node");
                }
                hgf hgf = k1.v;
                if ((hgf.y & 0x10) != 0x0) {
                    while (hgf != null) {
                        if ((hgf.x & 0x10) != 0x0) {
                            hgf g = hgf;
                            inf inf = null;
                            while (g != null) {
                                inf inf2;
                                if (g instanceof teh) {
                                    inf2 = inf;
                                    if (((teh)g).R0()) {
                                        dkb.x = dkb.v.b - 1;
                                        return true;
                                    }
                                }
                                else {
                                    inf2 = inf;
                                    if ((g.x & 0x10) != 0x0) {
                                        inf2 = inf;
                                        if (g instanceof v98) {
                                            hgf hgf2 = ((v98)g).K;
                                            int n = 0;
                                            while (hgf2 != null) {
                                                hgf hgf3 = g;
                                                inf inf3 = inf;
                                                int n2 = n;
                                                if ((hgf2.x & 0x10) != 0x0) {
                                                    n2 = n + 1;
                                                    if (n2 == 1) {
                                                        hgf3 = hgf2;
                                                        inf3 = inf;
                                                    }
                                                    else {
                                                        inf inf4;
                                                        if ((inf4 = inf) == null) {
                                                            inf4 = new inf(0, (Object[])new hgf[16]);
                                                        }
                                                        hgf hgf4;
                                                        if ((hgf4 = g) != null) {
                                                            inf4.b((Object)g);
                                                            hgf4 = null;
                                                        }
                                                        inf4.b((Object)hgf2);
                                                        inf3 = inf4;
                                                        hgf3 = hgf4;
                                                    }
                                                }
                                                hgf2 = hgf2.A;
                                                g = hgf3;
                                                inf = inf3;
                                                n = n2;
                                            }
                                            inf2 = inf;
                                            if (n == 1) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                g = soh.G(inf2);
                                inf = inf2;
                            }
                        }
                        hgf = hgf.A;
                    }
                }
            }
        }
        return false;
    }
    
    public final boolean j(final LayoutNode layoutNode) {
        return true;
    }
}
