import androidx.compose.ui.node.LayoutNode;

public final class kcc extends yxd
{
    @Override
    public final int Q(final int n) {
        final e3a f = super.P.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.e((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.p(), n);
    }
    
    @Override
    public final void R0() {
        final byd y = super.P.P.y();
        y.getClass();
        y.u0();
    }
    
    @Override
    public final int a(final int n) {
        final e3a f = super.P.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.d((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.p(), n);
    }
    
    @Override
    public final int h0(final hx hx) {
        final byd q = super.P.P.t().q;
        q.getClass();
        final j0d n = q.N;
        if (!q.F) {
            final m0d a = q.A;
            if (a.d == 2) {
                n.f = true;
                if (n.b) {
                    a.f = true;
                    a.g = true;
                }
            }
            else {
                n.g = true;
            }
        }
        final kcc a2 = q.d().A0;
        Boolean value;
        if (a2 != null) {
            value = a2.J;
        }
        else {
            value = null;
        }
        final kcc a3 = q.d().A0;
        if (a3 != null) {
            a3.J = true;
        }
        q.G();
        final kcc a4 = q.d().A0;
        if (a4 != null) {
            a4.J = (value != null && value);
        }
        final Integer n2 = (Integer)n.i.get((Object)hx);
        int intValue;
        if (n2 != null) {
            intValue = n2;
        }
        else {
            intValue = Integer.MIN_VALUE;
        }
        super.U.g(intValue, (Object)hx);
        return intValue;
    }
    
    @Override
    public final int n(final int n) {
        final e3a f = super.P.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.c((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.p(), n);
    }
    
    @Override
    public final int s(final int n) {
        final e3a f = super.P.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.a((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.p(), n);
    }
    
    @Override
    public final o8h u(final long n) {
        this.d0(n);
        final yxf p = super.P;
        final inf m = p.P.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            final byd y = ((LayoutNode)v[i]).y();
            y.getClass();
            y.E = 3;
        }
        final LayoutNode p2 = p.P;
        this.Y0(p2.S.b((ooe)this, p2.p(), n));
        return this;
    }
}
