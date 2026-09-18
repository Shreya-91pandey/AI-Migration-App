public final class xma
{
    public static final xma b;
    public static final xma c;
    public static final xma d;
    public final inf a;
    
    static {
        b = new xma();
        c = new xma();
        d = new xma();
    }
    
    public xma() {
        this.a = new inf(0, new zma[16]);
    }
    
    public static boolean a(final xma xma) {
        xma.getClass();
        if (xma == xma.b) {
            en9.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        if (xma == xma.c) {
            en9.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
            return false;
        }
        final inf a = xma.a;
        final int x = a.x;
        if (x == 0) {
            System.out.println((Object)"FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
            return false;
        }
        final Object[] v = a.v;
        int i = 0;
        boolean b = false;
        while (i < x) {
            final zma zma = (zma)v[i];
            if (!((hgf)zma).v.I) {
                gac.c("visitChildren called on an unattached node");
            }
            final inf inf = new inf(0, new hgf[16]);
            final hgf v2 = ((hgf)zma).v;
            final hgf a2 = v2.A;
            if (a2 == null) {
                soh.i(inf, v2);
            }
            else {
                inf.b(a2);
            }
            boolean b2 = false;
        Label_0430:
            while (true) {
                final int x2 = inf.x;
                b2 = b;
                if (x2 == 0) {
                    break;
                }
                hgf hgf2;
                final hgf hgf = hgf2 = (hgf)inf.l(x2 - 1);
                if ((hgf.y & 0x400) == 0x0) {
                    soh.i(inf, hgf);
                }
                else {
                    while (hgf2 != null) {
                        if ((hgf2.x & 0x400) != 0x0) {
                            inf inf2 = null;
                            while (hgf2 != null) {
                                inf inf3;
                                if (hgf2 instanceof gna) {
                                    inf3 = inf2;
                                    if (((gna)hgf2).v1(7)) {
                                        b2 = true;
                                        break Label_0430;
                                    }
                                }
                                else {
                                    inf3 = inf2;
                                    if ((hgf2.x & 0x400) != 0x0) {
                                        inf3 = inf2;
                                        if (hgf2 instanceof v98) {
                                            hgf hgf3 = ((v98)hgf2).K;
                                            int n = 0;
                                            while (hgf3 != null) {
                                                hgf hgf4 = hgf2;
                                                inf inf4 = inf2;
                                                int n2 = n;
                                                if ((hgf3.x & 0x400) != 0x0) {
                                                    n2 = n + 1;
                                                    if (n2 == 1) {
                                                        hgf4 = hgf3;
                                                        inf4 = inf2;
                                                    }
                                                    else {
                                                        inf inf5;
                                                        if ((inf5 = inf2) == null) {
                                                            inf5 = new inf(0, new hgf[16]);
                                                        }
                                                        gna gna;
                                                        if ((gna = (gna)hgf2) != null) {
                                                            inf5.b(hgf2);
                                                            gna = null;
                                                        }
                                                        inf5.b(hgf3);
                                                        inf4 = inf5;
                                                        hgf4 = gna;
                                                    }
                                                }
                                                hgf3 = hgf3.A;
                                                hgf2 = hgf4;
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
                                hgf2 = soh.G(inf3);
                                inf2 = inf3;
                            }
                            break;
                        }
                        hgf2 = hgf2.A;
                    }
                }
            }
            ++i;
            b = b2;
        }
        return b;
    }
}
