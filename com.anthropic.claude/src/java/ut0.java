import androidx.compose.ui.node.LayoutNode;
import java.util.Map;

public final class ut0 implements st0, ooe, cyd
{
    public final d0d v;
    public rt0 w;
    public boolean x;
    
    public ut0(final d0d v, final rt0 w) {
        this.v = v;
        this.w = w;
    }
    
    public final int E0(final long n) {
        return ((xc8)this.v).E0(n);
    }
    
    public final float I(final long n) {
        return ((xc8)this.v).I(n);
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
        return (noe)new tt0(n, n2, map, lta, lta2, this);
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
    
    public final nzc d(final nzc nzc) {
        if (nzc instanceof zxd) {
            return nzc;
        }
        if (nzc instanceof yxf) {
            final yxd f1 = ((yxf)nzc).f1();
            if (f1 != null) {
                final zxd s = f1.S;
                if (s != null) {
                    return s;
                }
            }
            return nzc;
        }
        gac.b("Unsupported LayoutCoordinates");
        ebq.a();
        return null;
    }
    
    public final float e0(final int n) {
        return ((xc8)this.v).e0(n);
    }
    
    public final float getDensity() {
        return this.v.getDensity();
    }
    
    public final qzc getLayoutDirection() {
        return this.v.P.V;
    }
    
    public final float i0(final float n) {
        return n / this.v.getDensity();
    }
    
    public final nzc j(final n8h n8h) {
        final LayoutNode d = this.v.P.D;
        if (d == null) {
            gac.b("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            ebq.a();
            return null;
        }
        if (!d.C) {
            return d.getOuterCoordinator$ui();
        }
        final LayoutNode g = d.G();
        if (g != null) {
            return (lcc)g.Z.y;
        }
        return ((LayoutNode)d.getChildren$ui().get(0)).getOuterCoordinator$ui();
    }
    
    public final float o0() {
        return this.v.o0();
    }
    
    public final boolean r0() {
        return false;
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
