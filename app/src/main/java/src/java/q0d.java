import java.util.List;
import androidx.compose.ui.node.LayoutNode;
import java.util.Map;

public final class q0d implements g1n
{
    public qzc v;
    public float w;
    public float x;
    public final v0d y;
    
    public q0d(final v0d y) {
        this.y = y;
        this.v = qzc.w;
    }
    
    public final noe J0(final int n, final int n2, final Map map, final lta lta, final lta lta2) {
        if ((n & 0xFF000000) != 0x0 || (0xFF000000 & n2) != 0x0) {
            final StringBuilder sb = new StringBuilder("Size(");
            sb.append(n);
            sb.append(" x ");
            sb.append(n2);
            sb.append(") is out of range. Each dimension must be between 0 and 16777215.");
            gac.c(sb.toString());
        }
        return (noe)new p0d(n, n2, map, lta, this, this.y, lta2);
    }
    
    public final float getDensity() {
        return this.w;
    }
    
    public final qzc getLayoutDirection() {
        return this.v;
    }
    
    public final float o0() {
        return this.x;
    }
    
    public final boolean r0() {
        final LayoutNode v = this.y.v;
        return v.v() == 4 || v.v() == 2;
    }
    
    @Override
    public final List v(final zta zta, final Object o) {
        final v0d y = this.y;
        y.h();
        final LayoutNode v = y.v;
        final int v2 = v.v();
        if (v2 != 1 && v2 != 3 && v2 != 2) {
            if (v2 != 4) {
                gac.c("subcompose can only be used inside the measure or layout blocks");
            }
        }
        final tmf b = y.B;
        Object o2;
        if ((o2 = b.g(o)) == null) {
            o2 = y.E.k(o);
            if (o2 != null) {
                final o0d o0d = (o0d)y.A.g(o2);
                if (y.J <= 0) {
                    gac.c("Check failed.");
                }
                --y.J;
            }
            else if ((o2 = y.o(o)) == null) {
                final int y2 = y.y;
                o2 = new LayoutNode(2);
                v.M = true;
                v.O(y2, (LayoutNode)o2);
                v.M = false;
            }
            b.m(o, o2);
        }
        final LayoutNode layoutNode = (LayoutNode)o2;
        if (c86.J0(y.y, v.r()) != layoutNode) {
            final int j = ((hnf)v.r()).v.j(layoutNode);
            if (j < y.y) {
                final StringBuilder sb = new StringBuilder("Key \"");
                sb.append(o);
                sb.append("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                gac.a(sb.toString());
            }
            final int y3 = y.y;
            if (y3 != j) {
                y.k(j, y3);
            }
        }
        ++y.y;
        y.n(layoutNode, o, false, zta);
        if (v2 != 1 && v2 != 3) {
            return layoutNode.p();
        }
        return layoutNode.q();
    }
}
