import androidx.compose.ui.node.LayoutNode;

public interface mgf extends t98
{
    default Object P(final tei tei) {
        final hgf hgf = (hgf)this;
        if (!hgf.v.I) {
            gac.a("ModifierLocal accessed from an unattached node");
        }
        if (!hgf.v.I) {
            gac.c("visitAncestors called on an unattached node");
        }
        Object z = hgf.v.z;
        LayoutNode layoutNode = soh.L(this);
        while (layoutNode != null) {
            if ((((hgf)layoutNode.Z.B).y & 0x20) != 0x0) {
                for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                    if ((((hgf)z2).x & 0x20) != 0x0) {
                        hgf g = (hgf)z2;
                        inf inf = null;
                        while (g != null) {
                            inf inf2;
                            if (g instanceof mgf) {
                                final mgf mgf = (mgf)g;
                                inf2 = inf;
                                if (mgf.m0().o(tei)) {
                                    return mgf.m0().z(tei);
                                }
                            }
                            else {
                                inf2 = inf;
                                if ((g.x & 0x20) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf2 = ((v98)g).K;
                                        int n = 0;
                                        while (hgf2 != null) {
                                            v98 v98 = (v98)g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf2.x & 0x20) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    v98 = (v98)hgf2;
                                                    inf3 = inf;
                                                }
                                                else {
                                                    inf inf4;
                                                    if ((inf4 = inf) == null) {
                                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    v98 v99;
                                                    if ((v99 = (v98)g) != null) {
                                                        inf4.b((Object)g);
                                                        v99 = null;
                                                    }
                                                    inf4.b((Object)hgf2);
                                                    inf3 = inf4;
                                                    v98 = v99;
                                                }
                                            }
                                            hgf2 = hgf2.A;
                                            g = v98;
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
                }
            }
            layoutNode = layoutNode.G();
            if (layoutNode != null) {
                final rxf z3 = layoutNode.Z;
                if (z3 != null) {
                    z = z3.A;
                    continue;
                }
            }
            z = null;
        }
        return tei.a.a();
    }
    
    default r9n m0() {
        return (r9n)t89.h;
    }
}
