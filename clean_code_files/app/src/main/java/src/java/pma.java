import androidx.compose.ui.node.Owner;
import java.util.Collection;
import android.view.ViewGroup;
import java.util.List;
import java.util.ArrayList;
import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

public final class pma implements nma
{
    public final AndroidComposeView a;
    public final AndroidComposeView b;
    public final gna c;
    public final kma d;
    public final oma e;
    public slf f;
    public final emf g;
    public gna h;
    
    public pma(final AndroidComposeView a, final AndroidComposeView b) {
        this.a = a;
        this.b = b;
        this.c = new gna(2, null, 14);
        this.d = new kma(this, b);
        this.e = new oma(this);
        this.g = new emf(1);
    }
    
    @Override
    public final boolean a(final int n) {
        return this.i(n, true);
    }
    
    @Override
    public final void b(final boolean b) {
        this.d(8, b, true);
    }
    
    public final boolean c(final boolean b) {
        if (this.h() != null) {
            final gna h = this.h();
            this.k(null);
            if (h != null) {
                final bna v = bna.v;
                final bna x = bna.x;
                h.p1(v, x);
                if (!h.v.I) {
                    gac.c("visitAncestors called on an unattached node");
                }
                Object z = h.v.z;
                LayoutNode layoutNode = soh.L((t98)h);
                while (layoutNode != null) {
                    if ((((hgf)layoutNode.Z.B).y & 0x400) != 0x0) {
                        for (Object z2 = z; z2 != null; z2 = ((hgf)z2).z) {
                            if ((((hgf)z2).x & 0x400) != 0x0) {
                                hgf g = (hgf)z2;
                                inf inf = null;
                                while (g != null) {
                                    inf inf2;
                                    if (g instanceof gna) {
                                        ((gna)g).p1(bna.w, x);
                                        inf2 = inf;
                                    }
                                    else {
                                        inf2 = inf;
                                        if ((g.x & 0x400) != 0x0) {
                                            inf2 = inf;
                                            if (g instanceof v98) {
                                                hgf hgf = ((v98)g).K;
                                                int n = 0;
                                                while (hgf != null) {
                                                    hgf hgf2 = g;
                                                    inf inf3 = inf;
                                                    int n2 = n;
                                                    if ((hgf.x & 0x400) != 0x0) {
                                                        n2 = n + 1;
                                                        if (n2 == 1) {
                                                            hgf2 = hgf;
                                                            inf3 = inf;
                                                        }
                                                        else {
                                                            inf inf4;
                                                            if ((inf4 = inf) == null) {
                                                                inf4 = new inf(0, new hgf[16]);
                                                            }
                                                            gna gna;
                                                            if ((gna = (gna)g) != null) {
                                                                inf4.b(g);
                                                                gna = null;
                                                            }
                                                            inf4.b(hgf);
                                                            inf3 = inf4;
                                                            hgf2 = gna;
                                                        }
                                                    }
                                                    hgf = hgf.A;
                                                    g = hgf2;
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
            }
        }
        return true;
    }
    
    public final boolean d(int d, final boolean b, final boolean b2) {
        final boolean b3 = true;
        boolean b4;
        if (!b) {
            d = ge9.D(rhc.L(this.c, d));
            if (d != 0) {
                if (d != 1 && d != 2 && d != 3) {
                    en9.r();
                    return false;
                }
                b4 = false;
            }
            else {
                this.c(b);
                b4 = b3;
            }
        }
        else {
            this.c(b);
            b4 = b3;
        }
        if (b4 && b2) {
            this.e();
        }
        return b4;
    }
    
    public final void e() {
        final AndroidComposeView a = this.a;
        if (!((View)a).isFocused() && !((View)a).hasFocus()) {
            if (((View)a).hasFocus()) {
                final View focus = ((View)a).findFocus();
                if (focus != null) {
                    focus.clearFocus();
                }
                ((ViewGroup)a).clearFocus();
            }
            return;
        }
        ((ViewGroup)a).clearFocus();
    }
    
    public final boolean f(final KeyEvent keyEvent, final jta jta) {
        final gna c = this.c;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.d.e) {
                System.out.println((Object)"FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            final long i = ibr.i(keyEvent);
            final int j = ibr.j(keyEvent);
            if (hbr.c(j, 2)) {
                slf f;
                if ((f = this.f) == null) {
                    f = new slf(3);
                    this.f = f;
                }
                f.d(i);
            }
            else if (hbr.c(j, 1)) {
                final slf f2 = this.f;
                if (f2 == null || !f2.a(i)) {
                    return false;
                }
                final slf f3 = this.f;
                if (f3 != null) {
                    f3.e(i);
                }
            }
            final gna f4 = elq.f(c);
            hgf hgf2 = null;
            Label_1046: {
                if (f4 != null) {
                    if (!f4.v.I) {
                        gac.c("visitLocalDescendants called on an unattached node");
                    }
                    final hgf v = f4.v;
                    Object o2;
                    if ((v.y & 0x2400) != 0x0) {
                        hgf hgf = v.A;
                        Object o = null;
                        while (true) {
                            o2 = o;
                            if (hgf == null) {
                                break;
                            }
                            final int x = hgf.x;
                            Object o3 = o;
                            if ((x & 0x2400) != 0x0) {
                                if ((x & 0x400) != 0x0) {
                                    o2 = o;
                                    break;
                                }
                                o3 = hgf;
                            }
                            hgf = hgf.A;
                            o = o3;
                        }
                    }
                    else {
                        o2 = null;
                    }
                    if ((hgf2 = (hgf)o2) != null) {
                        break Label_1046;
                    }
                }
                Label_0663: {
                    if (f4 != null) {
                        if (!f4.v.I) {
                            gac.c("visitAncestors called on an unattached node");
                        }
                        Object v2 = f4.v;
                        LayoutNode layoutNode = soh.L((t98)f4);
                    Label_0638:
                        while (true) {
                            while (layoutNode != null) {
                                Label_0592: {
                                    if ((((hgf)layoutNode.Z.B).y & 0x2000) != 0x0) {
                                        for (Object z = v2; z != null; z = ((hgf)z).z) {
                                            if ((((hgf)z).x & 0x2000) != 0x0) {
                                                inf inf = null;
                                                Object g = z;
                                                while (g != null) {
                                                    if (g instanceof ruc) {
                                                        break Label_0638;
                                                    }
                                                    inf inf2 = inf;
                                                    if ((((hgf)g).x & 0x2000) != 0x0) {
                                                        inf2 = inf;
                                                        if (g instanceof v98) {
                                                            hgf hgf3 = ((v98)g).K;
                                                            int n = 0;
                                                            while (hgf3 != null) {
                                                                v98 v3 = (v98)g;
                                                                inf inf3 = inf;
                                                                int n2 = n;
                                                                if ((hgf3.x & 0x2000) != 0x0) {
                                                                    n2 = n + 1;
                                                                    if (n2 == 1) {
                                                                        v3 = (v98)hgf3;
                                                                        inf3 = inf;
                                                                    }
                                                                    else {
                                                                        inf inf4;
                                                                        if ((inf4 = inf) == null) {
                                                                            inf4 = new inf(0, new hgf[16]);
                                                                        }
                                                                        v98 v4;
                                                                        if ((v4 = (v98)g) != null) {
                                                                            inf4.b(g);
                                                                            v4 = null;
                                                                        }
                                                                        inf4.b(hgf3);
                                                                        inf3 = inf4;
                                                                        v3 = v4;
                                                                    }
                                                                }
                                                                hgf3 = hgf3.A;
                                                                g = v3;
                                                                inf = inf3;
                                                                n = n2;
                                                            }
                                                            inf2 = inf;
                                                            if (n == 1) {
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    g = soh.G(inf2);
                                                    inf = inf2;
                                                }
                                            }
                                        }
                                        break Label_0592;
                                        Object g = null;
                                        final ruc ruc = (ruc)g;
                                        if (ruc != null) {
                                            hgf2 = ((hgf)ruc).v;
                                            break Label_1046;
                                        }
                                        break Label_0663;
                                    }
                                }
                                layoutNode = layoutNode.G();
                                if (layoutNode != null) {
                                    final rxf z2 = layoutNode.Z;
                                    if (z2 != null) {
                                        v2 = z2.A;
                                        continue;
                                    }
                                }
                                v2 = null;
                            }
                            Object g = null;
                            continue Label_0638;
                        }
                    }
                }
                if (!c.v.I) {
                    gac.c("visitAncestors called on an unattached node");
                }
                Object z3 = c.v.z;
                LayoutNode layoutNode2 = soh.L((t98)c);
            Label_1018:
                while (true) {
                    while (layoutNode2 != null) {
                        Label_0972: {
                            if ((((hgf)layoutNode2.Z.B).y & 0x2000) != 0x0) {
                                for (Object z4 = z3; z4 != null; z4 = ((hgf)z4).z) {
                                    if ((((hgf)z4).x & 0x2000) != 0x0) {
                                        Object g2 = z4;
                                        inf inf5 = null;
                                        while (g2 != null) {
                                            if (g2 instanceof ruc) {
                                                break Label_1018;
                                            }
                                            inf inf6 = inf5;
                                            if ((((hgf)g2).x & 0x2000) != 0x0) {
                                                inf6 = inf5;
                                                if (g2 instanceof v98) {
                                                    hgf hgf4 = ((v98)g2).K;
                                                    int n3 = 0;
                                                    while (hgf4 != null) {
                                                        v98 v5 = (v98)g2;
                                                        inf inf7 = inf5;
                                                        int n4 = n3;
                                                        if ((hgf4.x & 0x2000) != 0x0) {
                                                            n4 = n3 + 1;
                                                            if (n4 == 1) {
                                                                v5 = (v98)hgf4;
                                                                inf7 = inf5;
                                                            }
                                                            else {
                                                                inf inf8;
                                                                if ((inf8 = inf5) == null) {
                                                                    inf8 = new inf(0, new hgf[16]);
                                                                }
                                                                v98 v6;
                                                                if ((v6 = (v98)g2) != null) {
                                                                    inf8.b(g2);
                                                                    v6 = null;
                                                                }
                                                                inf8.b(hgf4);
                                                                inf7 = inf8;
                                                                v5 = v6;
                                                            }
                                                        }
                                                        hgf4 = hgf4.A;
                                                        g2 = v5;
                                                        inf5 = inf7;
                                                        n3 = n4;
                                                    }
                                                    inf6 = inf5;
                                                    if (n3 == 1) {
                                                        continue;
                                                    }
                                                }
                                            }
                                            g2 = soh.G(inf6);
                                            inf5 = inf6;
                                        }
                                    }
                                }
                                break Label_0972;
                                Object g2 = null;
                                final ruc ruc2 = (ruc)g2;
                                if (ruc2 != null) {
                                    hgf2 = ((hgf)ruc2).v;
                                    break Label_1046;
                                }
                                hgf2 = null;
                                break Label_1046;
                            }
                        }
                        layoutNode2 = layoutNode2.G();
                        if (layoutNode2 != null) {
                            final rxf z5 = layoutNode2.Z;
                            if (z5 != null) {
                                z3 = z5.A;
                                continue;
                            }
                        }
                        z3 = null;
                    }
                    Object g2 = null;
                    continue Label_1018;
                }
            }
            if (hgf2 != null) {
                if (!hgf2.v.I) {
                    gac.c("visitAncestors called on an unattached node");
                }
                Object z6 = hgf2.v.z;
                LayoutNode layoutNode3 = soh.L((t98)hgf2);
                Object o4 = null;
                while (layoutNode3 != null) {
                    Object o5 = o4;
                    if ((((hgf)layoutNode3.Z.B).y & 0x2000) != 0x0) {
                        Object z7 = z6;
                        while (true) {
                            o5 = o4;
                            if (z7 == null) {
                                break;
                            }
                            Object o6 = o4;
                            if ((((hgf)z7).x & 0x2000) != 0x0) {
                                Object g3 = z7;
                                inf inf9 = null;
                                while (true) {
                                    o6 = o4;
                                    if (g3 == null) {
                                        break;
                                    }
                                    boolean b;
                                    List list;
                                    if (g3 instanceof ruc) {
                                        Object o7;
                                        if ((o7 = o4) == null) {
                                            o7 = new ArrayList();
                                        }
                                        ((List)o7).add(g3);
                                        b = false;
                                        list = (List)o7;
                                    }
                                    else {
                                        b = true;
                                        list = (List)o4;
                                    }
                                    inf inf10 = inf9;
                                    if (b) {
                                        inf10 = inf9;
                                        if ((((hgf)g3).x & 0x2000) != 0x0) {
                                            inf10 = inf9;
                                            if (g3 instanceof v98) {
                                                hgf hgf5 = ((v98)g3).K;
                                                int n5 = 0;
                                                while (hgf5 != null) {
                                                    v98 v7 = (v98)g3;
                                                    inf inf11 = inf9;
                                                    int n6 = n5;
                                                    if ((hgf5.x & 0x2000) != 0x0) {
                                                        n6 = n5 + 1;
                                                        if (n6 == 1) {
                                                            v7 = (v98)hgf5;
                                                            inf11 = inf9;
                                                        }
                                                        else {
                                                            inf inf12;
                                                            if ((inf12 = inf9) == null) {
                                                                inf12 = new inf(0, new hgf[16]);
                                                            }
                                                            v98 v8;
                                                            if ((v8 = (v98)g3) != null) {
                                                                inf12.b(g3);
                                                                v8 = null;
                                                            }
                                                            inf12.b(hgf5);
                                                            inf11 = inf12;
                                                            v7 = v8;
                                                        }
                                                    }
                                                    hgf5 = hgf5.A;
                                                    g3 = v7;
                                                    inf9 = inf11;
                                                    n5 = n6;
                                                }
                                                inf10 = inf9;
                                                if (n5 == 1) {
                                                    o4 = list;
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    g3 = soh.G(inf10);
                                    o4 = list;
                                    inf9 = inf10;
                                }
                            }
                            z7 = ((hgf)z7).z;
                            o4 = o6;
                        }
                    }
                    layoutNode3 = layoutNode3.G();
                    if (layoutNode3 != null) {
                        final rxf z8 = layoutNode3.Z;
                        if (z8 != null) {
                            z6 = z8.A;
                            o4 = o5;
                            continue;
                        }
                    }
                    z6 = null;
                    o4 = o5;
                }
                if (o4 != null) {
                    int n7 = ((Collection)o4).size() - 1;
                    if (n7 >= 0) {
                        while (true) {
                            final int n8 = n7 - 1;
                            if (((ruc)((List)o4).get(n7)).p(keyEvent)) {
                                return true;
                            }
                            if (n8 < 0) {
                                break;
                            }
                            n7 = n8;
                        }
                    }
                }
                hgf hgf6 = hgf2.v;
                inf inf13 = null;
                while (hgf6 != null) {
                    inf inf14;
                    if (hgf6 instanceof ruc) {
                        final boolean p2 = ((ruc)hgf6).p(keyEvent);
                        inf14 = inf13;
                        if (p2) {
                            return true;
                        }
                    }
                    else {
                        inf14 = inf13;
                        if ((hgf6.x & 0x2000) != 0x0) {
                            inf14 = inf13;
                            if (hgf6 instanceof v98) {
                                hgf hgf7 = ((v98)hgf6).K;
                                int n9 = 0;
                                while (hgf7 != null) {
                                    inf inf15 = inf13;
                                    int n10 = n9;
                                    hgf hgf8 = hgf6;
                                    if ((hgf7.x & 0x2000) != 0x0) {
                                        n10 = n9 + 1;
                                        if (n10 == 1) {
                                            hgf8 = hgf7;
                                            inf15 = inf13;
                                        }
                                        else {
                                            if ((inf15 = inf13) == null) {
                                                inf15 = new inf(0, new hgf[16]);
                                            }
                                            if ((hgf8 = hgf6) != null) {
                                                inf15.b(hgf6);
                                                hgf8 = null;
                                            }
                                            inf15.b(hgf7);
                                        }
                                    }
                                    hgf7 = hgf7.A;
                                    inf13 = inf15;
                                    n9 = n10;
                                    hgf6 = hgf8;
                                }
                                inf14 = inf13;
                                if (n9 == 1) {
                                    continue;
                                }
                            }
                        }
                    }
                    hgf6 = soh.G(inf14);
                    inf13 = inf14;
                }
                if (jta.a()) {
                    return true;
                }
                hgf hgf9 = hgf2.v;
                inf inf16 = null;
                while (hgf9 != null) {
                    inf inf17;
                    if (hgf9 instanceof ruc) {
                        final boolean q = ((ruc)hgf9).Q(keyEvent);
                        inf17 = inf16;
                        if (q) {
                            return true;
                        }
                    }
                    else {
                        inf17 = inf16;
                        if ((hgf9.x & 0x2000) != 0x0) {
                            inf17 = inf16;
                            if (hgf9 instanceof v98) {
                                hgf hgf10 = ((v98)hgf9).K;
                                int n11 = 0;
                                while (hgf10 != null) {
                                    int n12 = n11;
                                    hgf hgf11 = hgf9;
                                    inf inf18 = inf16;
                                    if ((hgf10.x & 0x2000) != 0x0) {
                                        n12 = n11 + 1;
                                        if (n12 == 1) {
                                            hgf11 = hgf10;
                                            inf18 = inf16;
                                        }
                                        else {
                                            inf inf19;
                                            if ((inf19 = inf16) == null) {
                                                inf19 = new inf(0, new hgf[16]);
                                            }
                                            hgf hgf12;
                                            if ((hgf12 = hgf9) != null) {
                                                inf19.b(hgf9);
                                                hgf12 = null;
                                            }
                                            inf19.b(hgf10);
                                            inf18 = inf19;
                                            hgf11 = hgf12;
                                        }
                                    }
                                    hgf10 = hgf10.A;
                                    n11 = n12;
                                    hgf9 = hgf11;
                                    inf16 = inf18;
                                }
                                inf17 = inf16;
                                if (n11 == 1) {
                                    continue;
                                }
                            }
                        }
                    }
                    hgf9 = soh.G(inf17);
                    inf16 = inf17;
                }
                if (o4 != null) {
                    for (int size = ((Collection)o4).size(), k = 0; k < size; ++k) {
                        if (((ruc)((List)o4).get(k)).Q(keyEvent)) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        finally {
            Trace.endSection();
        }
    }
    
    public final Boolean g(int i, final k2j k2j, final lta lta) {
        final gna c = this.c;
        gna f = elq.f(c);
        final AndroidComposeView b = this.b;
        if (f != null) {
            final xma e = elq.e(f, i, ((Owner)b).getLayoutDirection());
            final xma c2 = xma.c;
            if (!mlc.q((Object)e, (Object)c2)) {
                if (mlc.q((Object)e, (Object)xma.d)) {
                    final gna f2 = elq.f(c);
                    if (f2 != null) {
                        return (Boolean)lta.b((Object)f2);
                    }
                }
                else {
                    final xma b2 = xma.b;
                    if (mlc.q((Object)e, (Object)b2)) {
                        return elq.h(c, i, ((Owner)b).getLayoutDirection(), k2j, new z36((byte)21, lta, (Object)f, (Object)this));
                    }
                    if (e == b2) {
                        en9.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                        return null;
                    }
                    if (e != c2) {
                        final inf a = e.a;
                        final int x = a.x;
                        boolean b3 = false;
                        if (x == 0) {
                            System.out.println((Object)"FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        }
                        else {
                            final Object[] v = a.v;
                            i = 0;
                            b3 = false;
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
                                boolean b4 = false;
                            Label_0557:
                                while (true) {
                                    final int x2 = inf.x;
                                    b4 = b3;
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
                                                        if (lta.b((Object)hgf2)) {
                                                            b4 = true;
                                                            break Label_0557;
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
                                b3 = b4;
                            }
                        }
                        return b3;
                    }
                    en9.q("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                    return null;
                }
            }
            return null;
        }
        f = null;
        return elq.h(c, i, ((Owner)b).getLayoutDirection(), k2j, new z36((byte)21, lta, (Object)f, (Object)this));
    }
    
    public final gna h() {
        final gna h = this.h;
        if (h != null && h.I) {
            return h;
        }
        return null;
    }
    
    public final boolean i(final int n, final boolean b) {
        final gna h = this.h();
        final AndroidComposeView a = this.a;
        if (h == null || !h.J || !a.u(n)) {
            final Object o = new Object();
            ((b4j)o).v = Boolean.FALSE;
            final gna h2 = this.h();
            final Boolean g = this.g(n, a.getEmbeddedViewFocusRect(), (lta)new l61(o, n, (byte)5));
            if (!mlc.q((Object)g, (Object)Boolean.TRUE) || h2 == this.h()) {
                if (g != null) {
                    if (((b4j)o).v != null) {
                        if (g && (boolean)((b4j)o).v) {
                            return true;
                        }
                        if (blq.k(n) && b && this.d(n, false, false)) {
                            final Boolean g2 = this.g(n, null, (lta)new q25(n, (byte)4));
                            if (g2 != null && g2) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }
    
    public final boolean j(final int n) {
        boolean booleanValue = false;
        if (!this.d(n, false, false)) {
            return false;
        }
        final Boolean g = this.g(n, null, (lta)new q25(n, (byte)3));
        if (g != null) {
            booleanValue = g;
        }
        if (!booleanValue) {
            this.e();
        }
        return booleanValue;
    }
    
    public final void k(final gna h) {
        final gna h2 = this.h;
        this.h = h;
        final emf g = this.g;
        final Object[] a = g.a;
        for (int b = g.b, i = 0; i < b; ++i) {
            ((lma)a[i]).a(h2, h);
        }
    }
}
