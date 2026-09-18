import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import java.util.Map;

public final class n0d implements g1n, ooe
{
    public final q0d v;
    public final v0d w;
    
    public n0d(final v0d w) {
        this.w = w;
        this.v = w.C;
    }
    
    public final int E0(final long n) {
        return ((xc8)this.v).E0(n);
    }
    
    public final float I(final long n) {
        return ((xc8)this.v).I(n);
    }
    
    public final noe J0(final int n, final int n2, final Map map, final lta lta, final lta lta2) {
        return this.v.J0(n, n2, map, lta, lta2);
    }
    
    public final int L0(final float n) {
        return ((xc8)this.v).L0(n);
    }
    
    public final long T0(final long n) {
        return ((xc8)this.v).T0(n);
    }
    
    public final float W0(final long n) {
        return ((xc8)this.v).W0(n);
    }
    
    public final long X(final int n) {
        return ((xc8)this.v).X(n);
    }
    
    public final noe Y(final int n, final int n2, final Map map, final lta lta) {
        return this.v.J0(n, n2, map, null, lta);
    }
    
    public final long Z(final float n) {
        return ((xc8)this.v).Z(n);
    }
    
    public final float e0(final int n) {
        return ((xc8)this.v).e0(n);
    }
    
    public final float getDensity() {
        return this.v.w;
    }
    
    public final qzc getLayoutDirection() {
        return this.v.v;
    }
    
    public final float i0(final float n) {
        return n / this.v.getDensity();
    }
    
    public final float o0() {
        return this.v.x;
    }
    
    public final boolean r0() {
        return this.v.r0();
    }
    
    @Override
    public final List v(final zta zta, final Object o) {
        final v0d w = this.w;
        final LayoutNode v = w.v;
        final tmf b = w.B;
        final LayoutNode layoutNode = (LayoutNode)b.g(o);
        if (layoutNode != null && ((hnf)v.r()).v.j(layoutNode) < w.y) {
            return layoutNode.q();
        }
        final tmf g = w.G;
        final tmf e = w.E;
        final inf h = w.H;
        if (h.x < w.z) {
            gac.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        final LayoutNode layoutNode2 = (LayoutNode)b.g(o);
        final int x = h.x;
        final int z = w.z;
        if (x == z) {
            h.b(o);
        }
        else {
            final Object[] v2 = h.v;
            final Object o2 = v2[z];
            v2[z] = o;
        }
        ++w.z;
        final boolean b2 = e.b(o);
        int i = 0;
        if (!b2 && layoutNode2 == null) {
            w.l(o, zta, false);
            g.m(o, (Object)w.e(o));
        }
        else {
            if (!b2 && layoutNode2 != null) {
                w.k(((hnf)v.r()).v.j(layoutNode2), ((hnf)v.r()).v.x);
                ++w.J;
                b.k(o);
                e.m(o, (Object)layoutNode2);
                g.m(o, (Object)w.e(o));
                if (v.V()) {
                    w.h();
                }
            }
            final LayoutNode layoutNode3 = (LayoutNode)e.g(o);
            final iwg iwg = null;
            o0d o0d;
            if (layoutNode3 != null) {
                o0d = (o0d)w.A.g((Object)layoutNode3);
            }
            else {
                o0d = null;
            }
            if (o0d != null && o0d.d) {
                w.n(layoutNode3, o, false, zta);
            }
            iwg f = iwg;
            if (o0d != null) {
                f = o0d.f;
            }
            if (f != null) {
                w.c(o0d, true);
            }
        }
        final LayoutNode layoutNode4 = (LayoutNode)e.g(o);
        if (layoutNode4 != null) {
            final List f2 = layoutNode4.z().f0();
            for (hnf hnf = (hnf)f2; i < hnf.v.x; ++i) {
                ((loe)hnf.get(i)).A.b = true;
            }
            return f2;
        }
        return (List)r89.v;
    }
    
    public final float w0(final float n) {
        return this.v.getDensity() * n;
    }
    
    public final long x(final float n) {
        return ((xc8)this.v).x(n);
    }
    
    public final long y(final long n) {
        return ((xc8)this.v).y(n);
    }
}
