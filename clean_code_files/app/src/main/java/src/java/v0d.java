import android.view.ViewGroup$LayoutParams;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.List;
import androidx.compose.ui.node.LayoutNode;

public final class v0d implements kh6
{
    public final tmf A;
    public final tmf B;
    public final q0d C;
    public final n0d D;
    public final tmf E;
    public final h1n F;
    public final tmf G;
    public final inf H;
    public int I;
    public int J;
    public final String K;
    public final LayoutNode v;
    public tl6 w;
    public i1n x;
    public int y;
    public int z;
    
    public v0d(final LayoutNode v, final i1n x) {
        this.v = v;
        this.x = x;
        final long[] a = jak.a;
        this.A = new tmf();
        this.B = new tmf();
        this.C = new q0d(this);
        this.D = new n0d(this);
        this.E = new tmf();
        this.F = new h1n();
        this.G = new tmf();
        this.H = new inf(0, new Object[16]);
        this.K = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";
    }
    
    public static void d(final o0d o0d) {
        final iwg f = o0d.f;
        if (f != null) {
            f.c();
            o0d.f = null;
            final yl6 c = o0d.c;
            if (c != null) {
                c.a();
            }
            o0d.c = null;
        }
    }
    
    @Override
    public final void a() {
        final LayoutNode v = this.v;
        v.M = true;
        final tmf a = this.A;
        final Object[] c = a.c;
        final long[] a2 = a.a;
        final int n = a2.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a2[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final yl6 c2 = ((o0d)c[(n2 << 3) + i]).c;
                            if (c2 != null) {
                                c2.a();
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        v.n0();
        v.M = false;
        a.a();
        this.B.a();
        this.J = 0;
        this.I = 0;
        this.E.a();
        this.h();
    }
    
    @Override
    public final void b() {
        this.j(true);
    }
    
    public final void c(final o0d o0d, final boolean b) {
        final iwg f = o0d.f;
        if (f == null) {
            return;
        }
        final r7m a = q7m.a();
        lta e;
        if (a != null) {
            e = a.e();
        }
        else {
            e = null;
        }
        final r7m b2 = q7m.b(a);
        Label_0121: {
            final Throwable t;
            try {
                final LayoutNode v = this.v;
                v.M = true;
                if (b) {
                    try {
                        while (!f.f()) {
                            f.j((vwl)new pv9((byte)18));
                        }
                    }
                    finally {
                        throw t;
                    }
                }
                f.a();
                o0d.f = null;
                v.M = false;
                q7m.d(a, b2, e);
                return;
            }
            finally {
                break Label_0121;
            }
            throw t;
        }
        q7m.d(a, b2, e);
    }
    
    public final e1n e(final Object o) {
        if (!this.v.V()) {
            return (e1n)new t0d();
        }
        return (e1n)new u0d(this, o);
    }
    
    public final void f(int n) {
        final int n2 = 0;
        this.I = 0;
        final List r = this.v.r();
        final hnf hnf = (hnf)r;
        int i = hnf.v.x - this.J - 1;
        int n4;
        if (n <= i) {
            this.F.clear();
            if (n <= i) {
                int n3 = n;
                while (true) {
                    final Object g = this.A.g((Object)hnf.get(n3));
                    g.getClass();
                    this.F.v.a(((o0d)g).a);
                    if (n3 == i) {
                        break;
                    }
                    ++n3;
                }
            }
            this.x.b(this.F);
            final r7m a = q7m.a();
            lta e;
            if (a != null) {
                e = a.e();
            }
            else {
                e = null;
            }
            final r7m b = q7m.b(a);
            n4 = 0;
            while (i >= n) {
                Label_0395: {
                    Object o = null;
                    int n5 = 0;
                    Label_0377: {
                        LayoutNode layoutNode;
                        Object c;
                        try {
                            layoutNode = (LayoutNode)((hnf)r).get(i);
                            o = this.A.g((Object)layoutNode);
                            o.getClass();
                            c = o;
                            o = ((o0d)c).a;
                            if (this.F.v.c(o)) {
                                ++this.I;
                                n5 = n4;
                                if (!(boolean)((o0d)c).g.getValue()) {
                                    break Label_0377;
                                }
                                layoutNode.z().h0 = 3;
                                final byd y = layoutNode.y();
                                if (y != null) {
                                    y.E = 3;
                                }
                                this.m((o0d)c, false);
                                n5 = n4;
                                if (((o0d)c).h) {
                                    n5 = 1;
                                }
                                break Label_0377;
                            }
                        }
                        finally {
                            break Label_0395;
                        }
                        final LayoutNode v = this.v;
                        v.M = true;
                        this.A.k((Object)layoutNode);
                        c = ((o0d)c).c;
                        if (c != null) {
                            ((yl6)c).a();
                        }
                        this.v.o0(i, 1);
                        v.M = false;
                        n5 = n4;
                    }
                    this.B.k(o);
                    --i;
                    n4 = n5;
                    continue;
                }
                q7m.d(a, b, e);
            }
            q7m.d(a, b, e);
        }
        else {
            n4 = 0;
        }
        if (n4 != 0) {
            final Object c2 = g8m.c;
            synchronized (c2) {
                final umf h = g8m.j.h;
                n = n2;
                if (h != null) {
                    final boolean h2 = h.h();
                    n = n2;
                    if (h2) {
                        n = 1;
                    }
                }
                monitorexit(c2);
                if (n != 0) {
                    g8m.c();
                }
            }
        }
        this.h();
    }
    
    public final void g(final Object o) {
        this.h();
        final LayoutNode layoutNode = (LayoutNode)this.E.k(o);
        final LayoutNode v = this.v;
        if (layoutNode != null) {
            if (this.J <= 0) {
                gac.c("No pre-composed items to dispose");
            }
            final int j = ((hnf)v.r()).v.j(layoutNode);
            if (j < ((hnf)v.r()).v.x - this.J) {
                gac.c("Item is not in pre-composed item range");
            }
            ++this.I;
            --this.J;
            final o0d o0d = (o0d)this.A.g((Object)layoutNode);
            if (o0d != null) {
                d(o0d);
            }
            final int n = ((hnf)v.r()).v.x - this.J - this.I;
            this.k(j, n);
            this.f(n);
        }
        if (this.H.i(o)) {
            LayoutNode.t0(v, true, 6);
        }
    }
    
    public final void h() {
        final int x = ((hnf)this.v.r()).v.x;
        final int e = this.A.e;
        if (e != x) {
            final StringBuilder sb = new StringBuilder("Inconsistency between the count of nodes tracked by the state (");
            sb.append(e);
            sb.append(") and the children count on the SubcomposeLayout (");
            sb.append(x);
            sb.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
            gac.a(sb.toString());
        }
        final int i = this.I;
        final int j = this.J;
        if (x - i - j < 0) {
            final StringBuilder o = hia.o(x, i, "Incorrect state. Total children ", ". Reusable children ", ". Precomposed children ");
            o.append(j);
            gac.a(o.toString());
        }
        final int e2 = this.E.e;
        final int k = this.J;
        if (e2 == k) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder("Incorrect state. Precomposed children ");
        sb2.append(k);
        sb2.append(". Map size ");
        sb2.append(e2);
        gac.a(sb2.toString());
    }
    
    @Override
    public final void i() {
        this.j(false);
    }
    
    public final void j(final boolean b) {
        int i = 0;
        this.J = 0;
        this.E.a();
        final List r = this.v.r();
        final int x = ((hnf)r).v.x;
        if (this.I != x) {
            this.I = x;
            final r7m a = q7m.a();
            lta e;
            if (a != null) {
                e = a.e();
            }
            else {
                e = null;
            }
            final r7m b2 = q7m.b(a);
            while (i < x) {
                Label_0189: {
                    try {
                        final LayoutNode layoutNode = (LayoutNode)((hnf)r).get(i);
                        final o0d o0d = (o0d)this.A.g((Object)layoutNode);
                        if (o0d != null && (boolean)o0d.g.getValue()) {
                            layoutNode.z().h0 = 3;
                            final byd y = layoutNode.y();
                            if (y != null) {
                                y.E = 3;
                            }
                            this.m(o0d, b);
                            o0d.a = c5q.b;
                        }
                    }
                    finally {
                        break Label_0189;
                    }
                    ++i;
                    continue;
                }
                q7m.d(a, b2, e);
            }
            q7m.d(a, b2, e);
            this.B.a();
        }
        this.h();
    }
    
    public final void k(final int n, final int n2) {
        final LayoutNode v = this.v;
        v.M = true;
        v.g0(n, n2, 1);
        v.M = false;
    }
    
    public final void l(final Object o, final zta zta, final boolean b) {
        final LayoutNode v = this.v;
        if (v.V()) {
            this.h();
            if (!this.B.c(o)) {
                this.G.k(o);
                final tmf e = this.E;
                Object o2;
                if ((o2 = e.g(o)) == null) {
                    o2 = this.o(o);
                    if (o2 != null) {
                        this.k(((hnf)v.r()).v.j(o2), ((hnf)v.r()).v.x);
                        ++this.J;
                    }
                    else {
                        final int x = ((hnf)v.r()).v.x;
                        o2 = new LayoutNode(2);
                        v.M = true;
                        v.O(x, (LayoutNode)o2);
                        v.M = false;
                        ++this.J;
                    }
                    e.m(o, o2);
                }
                this.n((LayoutNode)o2, o, b, zta);
            }
        }
    }
    
    public final void m(final o0d o0d, final boolean b) {
        if (!b && o0d.h) {
            o0d.g.setValue(Boolean.FALSE);
        }
        else {
            o0d.g = o50.Q((Object)Boolean.FALSE);
        }
        if (o0d.f != null) {
            d(o0d);
            return;
        }
        if (b) {
            final yl6 c = o0d.c;
            if (c != null) {
                c.p();
            }
        }
        else {
            final hig outOfFrameExecutor = l0d.a(this.v).getOutOfFrameExecutor();
            if (outOfFrameExecutor != null) {
                ((AndroidComposeView)outOfFrameExecutor).F((jta)new kca((Object)o0d, (byte)23));
                return;
            }
            if (!o0d.h) {
                final yl6 c2 = o0d.c;
                if (c2 != null) {
                    c2.p();
                }
            }
        }
    }
    
    public final void n(final LayoutNode layoutNode, Object o, final boolean b, zta e) {
        Object o2 = this.A;
        final Object g = ((tmf)o2).g((Object)layoutNode);
        final zta zta = null;
        Object o3 = g;
        if (g == null) {
            final ye6 a = uoo.a;
            o3 = new Object();
            ((o0d)o3).a = o;
            ((o0d)o3).b = (zta)a;
            ((o0d)o3).c = null;
            ((o0d)o3).g = o50.Q((Object)Boolean.TRUE);
            ((tmf)o2).m((Object)layoutNode, o3);
        }
        final o0d o0d = (o0d)o3;
        final boolean b2 = o0d.b != e;
        if (o0d.f != null) {
            if (b2) {
                d(o0d);
            }
            else {
                if (b) {
                    return;
                }
                this.c(o0d, true);
            }
        }
        final yl6 c = o0d.c;
        int e2 = 0;
        Label_0201: {
            if (c != null) {
                o = c.y;
                synchronized (o) {
                    e2 = c.I.e;
                    if (e2 > 0) {
                        e2 = 1;
                    }
                    else {
                        e2 = 0;
                    }
                    break Label_0201;
                }
            }
            e2 = 1;
        }
        if (b2 || e2 != 0 || o0d.d) {
            o0d.b = e;
            if (o0d.f != null) {
                gac.a("new subcompose call while paused composition is still active");
            }
            final r7m a2 = q7m.a();
            e = zta;
            if (a2 != null) {
                e = (zta)a2.e();
            }
            final r7m b3 = q7m.b(a2);
            Label_0645: {
                Label_0628: {
                    Label_0388: {
                        tl6 w;
                        try {
                            o2 = this.v;
                            ((LayoutNode)o2).M = true;
                            o = o0d.c;
                            w = this.w;
                            if (w == null) {
                                break Label_0628;
                            }
                            if (o != null) {
                                if (((yl6)o).R != 3) {
                                    break Label_0388;
                                }
                            }
                        }
                        finally {
                            break Label_0645;
                        }
                        if (b) {
                            final ViewGroup$LayoutParams a3 = h9q.a;
                            final Throwable t;
                            o = new v((Object)t);
                            o = ckq.a((roo)o, w);
                        }
                        else {
                            final ViewGroup$LayoutParams a4 = h9q.a;
                            final Throwable t;
                            o = new v((Object)t);
                            o = new yl6(w, (v)o);
                        }
                    }
                    o0d.c = (yl6)o;
                    Object b4 = o0d.b;
                    if (l0d.a(this.v).getOutOfFrameExecutor() != null) {
                        o0d.h = false;
                    }
                    else {
                        o0d.h = true;
                        b4 = new ye6(1524156494, true, new ah0((Object)o0d, b4, (byte)21));
                    }
                    if (b) {
                        if (o0d.e) {
                            ((yl6)o).m();
                            ((yl6)o).t();
                            o0d.f = ((yl6)o).o(true, (zta)b4);
                        }
                        else {
                            o0d.f = ((yl6)o).o(((yl6)o).m(), (zta)b4);
                        }
                    }
                    else if (o0d.e) {
                        ((yl6)o).m();
                        ((yl6)o).t();
                        final gva q = ((yl6)o).Q;
                        q.z = 0;
                        q.y = true;
                        ((yl6)o).v.a((yl6)o, (zta)b4);
                        if (q.F || q.z != 0) {
                            pih.a("Cannot disable reuse from root if it was caused by other groups");
                        }
                        q.z = -1;
                        q.y = false;
                    }
                    else {
                        ((yl6)o).B((zta)b4);
                    }
                    o0d.e = false;
                    ((LayoutNode)o2).M = false;
                    q7m.d(a2, b3, (lta)e);
                    o0d.d = false;
                    return;
                }
                gac.d("parent composition reference not set");
                throw new RuntimeException();
            }
            q7m.d(a2, b3, (lta)e);
        }
    }
    
    public final LayoutNode o(final Object a) {
        if (this.I != 0) {
            final hnf hnf = (hnf)this.v.r();
            final int n = hnf.v.x - this.J;
            final int n2 = n - this.I;
            int i;
            final int n3 = i = n - 1;
            tmf a2;
            int n4;
            while (true) {
                a2 = this.A;
                if (i < n2) {
                    n4 = -1;
                    break;
                }
                final Object g = a2.g((Object)hnf.get(i));
                g.getClass();
                if (mlc.q(((o0d)g).a, a)) {
                    n4 = i;
                    break;
                }
                --i;
            }
            int n5 = n4;
            Label_0214: {
                if (n4 == -1) {
                    for (i = n3; i >= n2; --i) {
                        final Object g2 = a2.g((Object)hnf.get(i));
                        g2.getClass();
                        final o0d o0d = (o0d)g2;
                        final Object a3 = o0d.a;
                        if (a3 == c5q.b || this.x.i(a, a3)) {
                            o0d.a = a;
                            n5 = i;
                            break Label_0214;
                        }
                    }
                    n5 = n4;
                }
            }
            if (n5 != -1) {
                if (i != n2) {
                    this.k(i, n2);
                }
                --this.I;
                final LayoutNode layoutNode = (LayoutNode)hnf.get(n2);
                final Object g3 = a2.g((Object)layoutNode);
                g3.getClass();
                final o0d o0d2 = (o0d)g3;
                o0d2.g = o50.Q((Object)Boolean.TRUE);
                o0d2.e = true;
                o0d2.d = true;
                return layoutNode;
            }
        }
        return null;
    }
}
