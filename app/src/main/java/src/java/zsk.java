import java.util.ArrayList;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;

public final class zsk
{
    public final hgf a;
    public final boolean b;
    public final LayoutNode c;
    public final tsk d;
    public zsk e;
    public final int f;
    
    public zsk(final hgf a, final boolean b, final LayoutNode c, final tsk d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.f = c.w;
    }
    
    public final k2j a(final yxf yxf) {
        final zsk l = this.l();
        if (l == null) {
            return k2j.e;
        }
        hgf a = (hgf)l.c.Z.B;
        final int y = a.y;
        final yxf yxf2 = null;
        Object g = null;
        Label_0316: {
            if ((y & 0x8) != 0x0) {
                while (a != null) {
                    if ((a.x & 0x8) != 0x0) {
                        g = a;
                        inf inf = null;
                        while (g != null) {
                            inf inf2;
                            if (g instanceof xsk) {
                                inf2 = inf;
                                if (((xsk)g).o()) {
                                    break Label_0316;
                                }
                            }
                            else {
                                inf2 = inf;
                                if ((((hgf)g).x & 0x8) != 0x0) {
                                    inf2 = inf;
                                    if (g instanceof v98) {
                                        hgf hgf = ((v98)g).K;
                                        int n = 0;
                                        while (hgf != null) {
                                            Object o = g;
                                            inf inf3 = inf;
                                            int n2 = n;
                                            if ((hgf.x & 0x8) != 0x0) {
                                                n2 = n + 1;
                                                if (n2 == 1) {
                                                    o = hgf;
                                                    inf3 = inf;
                                                }
                                                else {
                                                    inf inf4;
                                                    if ((inf4 = inf) == null) {
                                                        inf4 = new inf(0, (Object[])new hgf[16]);
                                                    }
                                                    v98 v98;
                                                    if ((v98 = (v98)g) != null) {
                                                        inf4.b(g);
                                                        v98 = null;
                                                    }
                                                    inf4.b((Object)hgf);
                                                    inf3 = inf4;
                                                    o = v98;
                                                }
                                            }
                                            hgf = hgf.A;
                                            g = o;
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
                    if ((a.y & 0x8) == 0x0) {
                        break;
                    }
                    a = a.A;
                }
            }
            g = null;
        }
        final xsk xsk = (xsk)g;
        yxf j = yxf2;
        if (xsk != null) {
            j = soh.J((t98)xsk, 8);
        }
        if (j == null) {
            return l.a(yxf);
        }
        return j.L((nzc)yxf, true);
    }
    
    public final zsk b(final iuj iuj, final lta lta) {
        final tsk tsk = new tsk();
        tsk.x = false;
        tsk.y = false;
        lta.b((Object)tsk);
        final ysk ysk = new ysk(lta);
        final int f = this.f;
        int n;
        if (iuj != null) {
            n = 1000000000;
        }
        else {
            n = 2000000000;
        }
        final zsk zsk = new zsk(ysk, false, new LayoutNode(f + n, true), tsk);
        zsk.e = this;
        return zsk;
    }
    
    public final void c(final LayoutNode layoutNode, final ArrayList list) {
        final inf l = layoutNode.L();
        final Object[] v = l.v;
        for (int x = l.x, i = 0; i < x; ++i) {
            final LayoutNode layoutNode2 = (LayoutNode)v[i];
            if (layoutNode2.V() && !layoutNode2.j0) {
                if (layoutNode2.Z.l(8)) {
                    list.add((Object)ien.g(layoutNode2, this.b));
                }
                else {
                    this.c(layoutNode2, list);
                }
            }
        }
    }
    
    public final yxf d() {
        if (this.n()) {
            final zsk l = this.l();
            if (l != null) {
                return l.d();
            }
            return null;
        }
        else {
            final xsk f = this.f();
            if (f != null) {
                return soh.J((t98)f, 8);
            }
            return (yxf)this.c.Z.y;
        }
    }
    
    public final void e(final ArrayList list, final ArrayList list2) {
        int i = list.size();
        this.q(list, false);
        while (i < list.size()) {
            final zsk zsk = (zsk)list.get(i);
            if (zsk.o()) {
                list2.add((Object)zsk);
            }
            else if (!zsk.d.y) {
                zsk.e(list, list2);
            }
            ++i;
        }
    }
    
    public final xsk f() {
        final boolean x = this.d.x;
        final xsk xsk = null;
        final LayoutNode c = this.c;
        xsk xsk2 = null;
        Label_0396: {
            if (x) {
                hgf a = (hgf)c.Z.B;
                xsk2 = xsk;
                if ((a.y & 0x8) != 0x0) {
                    xsk xsk3 = null;
                    while (true) {
                        xsk2 = xsk3;
                        if (a == null) {
                            break;
                        }
                        xsk xsk4 = xsk3;
                        if ((a.x & 0x8) != 0x0) {
                            hgf g = a;
                            inf inf = null;
                            while (true) {
                                xsk4 = xsk3;
                                if (g == null) {
                                    break;
                                }
                                boolean b;
                                xsk xsk7;
                                if (g instanceof xsk) {
                                    final xsk xsk5 = (xsk)g;
                                    xsk xsk6 = xsk3;
                                    if (xsk5.o()) {
                                        if (xsk5.X0()) {
                                            return xsk5;
                                        }
                                        if ((xsk6 = xsk3) == null) {
                                            xsk6 = xsk5;
                                        }
                                    }
                                    b = false;
                                    xsk7 = xsk6;
                                }
                                else {
                                    b = true;
                                    xsk7 = xsk3;
                                }
                                inf inf2 = inf;
                                if (b) {
                                    inf2 = inf;
                                    if ((g.x & 0x8) != 0x0) {
                                        inf2 = inf;
                                        if (g instanceof v98) {
                                            hgf hgf = ((v98)g).K;
                                            int n = 0;
                                            while (hgf != null) {
                                                hgf hgf2 = g;
                                                inf inf3 = inf;
                                                int n2 = n;
                                                if ((hgf.x & 0x8) != 0x0) {
                                                    n2 = n + 1;
                                                    if (n2 == 1) {
                                                        hgf2 = hgf;
                                                        inf3 = inf;
                                                    }
                                                    else {
                                                        inf inf4;
                                                        if ((inf4 = inf) == null) {
                                                            inf4 = new inf(0, (Object[])new hgf[16]);
                                                        }
                                                        hgf hgf3;
                                                        if ((hgf3 = g) != null) {
                                                            inf4.b((Object)g);
                                                            hgf3 = null;
                                                        }
                                                        inf4.b((Object)hgf);
                                                        inf3 = inf4;
                                                        hgf2 = hgf3;
                                                    }
                                                }
                                                hgf = hgf.A;
                                                g = hgf2;
                                                inf = inf3;
                                                n = n2;
                                            }
                                            inf2 = inf;
                                            if (n == 1) {
                                                xsk3 = xsk7;
                                                continue;
                                            }
                                        }
                                    }
                                }
                                g = soh.G(inf2);
                                xsk3 = xsk7;
                                inf = inf2;
                            }
                        }
                        xsk2 = xsk4;
                        if ((a.y & 0x8) == 0x0) {
                            break;
                        }
                        a = a.A;
                        xsk3 = xsk4;
                    }
                }
            }
            else {
                hgf a2 = (hgf)c.Z.B;
                xsk2 = xsk;
                if ((a2.y & 0x8) != 0x0) {
                    while (true) {
                        xsk2 = xsk;
                        if (a2 == null) {
                            break;
                        }
                        if ((a2.x & 0x8) != 0x0) {
                            hgf g2 = a2;
                            inf inf5 = null;
                            while (g2 != null) {
                                inf inf6;
                                if (g2 instanceof xsk) {
                                    inf6 = inf5;
                                    if (((xsk)g2).o()) {
                                        xsk2 = (xsk)g2;
                                        break Label_0396;
                                    }
                                }
                                else {
                                    inf6 = inf5;
                                    if ((g2.x & 0x8) != 0x0) {
                                        inf6 = inf5;
                                        if (g2 instanceof v98) {
                                            hgf hgf4 = ((v98)g2).K;
                                            int n3 = 0;
                                            while (hgf4 != null) {
                                                hgf hgf5 = g2;
                                                inf inf7 = inf5;
                                                int n4 = n3;
                                                if ((hgf4.x & 0x8) != 0x0) {
                                                    n4 = n3 + 1;
                                                    if (n4 == 1) {
                                                        hgf5 = hgf4;
                                                        inf7 = inf5;
                                                    }
                                                    else {
                                                        inf inf8;
                                                        if ((inf8 = inf5) == null) {
                                                            inf8 = new inf(0, (Object[])new hgf[16]);
                                                        }
                                                        hgf hgf6;
                                                        if ((hgf6 = g2) != null) {
                                                            inf8.b((Object)g2);
                                                            hgf6 = null;
                                                        }
                                                        inf8.b((Object)hgf4);
                                                        inf7 = inf8;
                                                        hgf5 = hgf6;
                                                    }
                                                }
                                                hgf4 = hgf4.A;
                                                g2 = hgf5;
                                                inf5 = inf7;
                                                n3 = n4;
                                            }
                                            inf6 = inf5;
                                            if (n3 == 1) {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                g2 = soh.G(inf6);
                                inf5 = inf6;
                            }
                        }
                        xsk2 = xsk;
                        if ((a2.y & 0x8) == 0x0) {
                            break;
                        }
                        a2 = a2.A;
                    }
                }
            }
        }
        return xsk2;
    }
    
    public final k2j g() {
        Object d = this.d();
        if (d != null) {
            if (!((yxf)d).h1().I) {
                d = null;
            }
            if (d != null) {
                return r9n.t((nzc)d).L((nzc)d, true);
            }
        }
        return k2j.e;
    }
    
    public final k2j h() {
        Object d = this.d();
        if (d != null) {
            if (!((yxf)d).h1().I) {
                d = null;
            }
            if (d != null) {
                return r9n.g((nzc)d, true);
            }
        }
        return k2j.e;
    }
    
    public final List i(final boolean b, final boolean b2) {
        if (!b && this.d.y) {
            return (List)r89.v;
        }
        final ArrayList list = new ArrayList();
        if (this.o()) {
            final ArrayList list2 = new ArrayList();
            this.e(list, list2);
            return (List)list2;
        }
        return this.q(list, b2);
    }
    
    public final tsk k() {
        final boolean o = this.o();
        final tsk d = this.d;
        if (o) {
            final tsk d2 = d.d();
            this.p(new ArrayList(), d2);
            return d2;
        }
        return d;
    }
    
    public final zsk l() {
        final zsk e = this.e;
        if (e != null) {
            return e;
        }
        final LayoutNode c = this.c;
        final boolean b = this.b;
        LayoutNode layoutNode = null;
        Label_0066: {
            if (b) {
                for (LayoutNode layoutNode = c.G(); layoutNode != null; layoutNode = layoutNode.G()) {
                    final tsk i = layoutNode.I();
                    if (i != null && i.x) {
                        break Label_0066;
                    }
                }
            }
            layoutNode = null;
        }
        LayoutNode layoutNode2 = layoutNode;
        Label_0109: {
            if (layoutNode == null) {
                for (LayoutNode layoutNode3 = c.G(); layoutNode3 != null; layoutNode3 = layoutNode3.G()) {
                    if (layoutNode3.Z.l(8)) {
                        layoutNode2 = layoutNode3;
                        break Label_0109;
                    }
                }
                layoutNode2 = null;
            }
        }
        if (layoutNode2 == null) {
            return null;
        }
        return ien.g(layoutNode2, b);
    }
    
    public final k2j m() {
        final xsk f = this.f();
        if (f == null) {
            return ((yxf)this.c.Z.y).E1();
        }
        final hgf v = ((hgf)f).v;
        Object g;
        if ((g = this.d.v.g((Object)rsk.b)) == null) {
            g = null;
        }
        return r9n.q(v, g != null, true);
    }
    
    public final boolean n() {
        return this.e != null;
    }
    
    public final boolean o() {
        return this.b && this.d.x;
    }
    
    public final void p(final ArrayList list, final tsk tsk) {
        if (!this.d.y) {
            int i = list.size();
            this.q(list, false);
            while (i < list.size()) {
                final zsk zsk = (zsk)list.get(i);
                if (!zsk.o()) {
                    tsk.j(zsk.d);
                    zsk.p(list, tsk);
                }
                ++i;
            }
        }
    }
    
    public final List q(final ArrayList list, final boolean b) {
        if (this.n()) {
            return (List)r89.v;
        }
        this.c(this.c, list);
        if (b) {
            final tsk d = this.d;
            final tmf v = d.v;
            Object g;
            if ((g = v.g((Object)etk.z)) == null) {
                g = null;
            }
            final iuj iuj = (iuj)g;
            if (iuj != null && d.x && !list.isEmpty()) {
                list.add((Object)this.b(iuj, (lta)new e0j((Object)iuj, (byte)6)));
            }
            final htk a = etk.a;
            if (v.c((Object)a) && !list.isEmpty() && d.x) {
                Object g2;
                if ((g2 = v.g((Object)a)) == null) {
                    g2 = null;
                }
                final List list2 = (List)g2;
                String s;
                if (list2 != null) {
                    s = (String)c86.I0(list2);
                }
                else {
                    s = null;
                }
                if (s != null) {
                    list.add(0, (Object)this.b(null, (lta)new jy4(s, (byte)13)));
                }
            }
        }
        return (List)list;
    }
}
