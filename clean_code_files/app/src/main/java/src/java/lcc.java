import androidx.compose.ui.node.LayoutNode;

public final class lcc extends yxf
{
    public static final y80 B0;
    public kcc A0;
    public final obn z0;
    
    static {
        final y80 d = uoo.d();
        final int i = j86.i;
        d.f(j86.e);
        d.m(1.0f);
        d.n(1);
        B0 = d;
    }
    
    public lcc(final LayoutNode layoutNode) {
        super(layoutNode);
        final hgf z0 = new hgf();
        z0.y = 0;
        this.z0 = (obn)z0;
        z0.C = this;
        yxd a0;
        if (layoutNode.D != null) {
            a0 = new yxd(this);
        }
        else {
            a0 = null;
        }
        this.A0 = (kcc)a0;
    }
    
    @Override
    public final int Q(final int n) {
        final e3a f = super.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.e((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.q(), n);
    }
    
    @Override
    public final int a(final int n) {
        final e3a f = super.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.d((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.q(), n);
    }
    
    @Override
    public final void a0(final long n, final float n2, final lta lta) {
        if (super.Q) {
            final yxd f1 = this.f1();
            f1.getClass();
            this.y1(f1.Q, n2, lta, null);
        }
        else {
            this.y1(n, n2, lta, null);
        }
        if (super.I) {
            return;
        }
        super.P.z().q0();
    }
    
    @Override
    public final void b0(final long n, final float n2, final g6b g6b) {
        if (super.Q) {
            final yxd f1 = this.f1();
            f1.getClass();
            this.y1(f1.Q, n2, null, g6b);
        }
        else {
            this.y1(n, n2, null, g6b);
        }
        if (super.I) {
            return;
        }
        super.P.z().q0();
    }
    
    @Override
    public final void c1() {
        if (this.A0 == null) {
            this.A0 = (kcc)new yxd(this);
        }
    }
    
    @Override
    public final yxd f1() {
        return this.A0;
    }
    
    @Override
    public final int h0(final hx hx) {
        final kcc a0 = this.A0;
        if (a0 != null) {
            return a0.h0(hx);
        }
        final loe p = super.P.t().p;
        final j0d s = p.S;
        if (!p.G) {
            if (p.A.d == 1) {
                s.f = true;
                if (s.b) {
                    p.Q = true;
                    p.R = true;
                }
            }
            else {
                s.g = true;
            }
        }
        final lcc d = p.d();
        final boolean j = d.J;
        d.J = true;
        p.G();
        d.J = j;
        final Integer n = (Integer)s.i.get((Object)hx);
        if (n != null) {
            return n;
        }
        return Integer.MIN_VALUE;
    }
    
    @Override
    public final hgf h1() {
        return (hgf)this.z0;
    }
    
    @Override
    public final int n(final int n) {
        final e3a f = super.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.c((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.q(), n);
    }
    
    @Override
    public final void o1(final xxf xxf, final long n, final dkb dkb, final int n2, boolean b) {
        final LayoutNode p4 = super.P;
        final boolean j = xxf.j(p4);
        boolean b2 = false;
        Label_0073: {
            if (j) {
                if (!this.J1(n)) {
                    if (!xeh.b(n2, 1) || (Float.floatToRawIntBits(this.X0(n, this.g1())) & Integer.MAX_VALUE) >= 2139095040) {
                        break Label_0073;
                    }
                    b = false;
                }
                b2 = true;
            }
        }
        if (b2) {
            final int x = dkb.x;
            final inf l = p4.L();
            final Object[] v = l.v;
            for (int i = l.x - 1; i >= 0; --i) {
                final LayoutNode layoutNode = (LayoutNode)v[i];
                if (layoutNode.W()) {
                    xxf.g(layoutNode, n, dkb, n2, b);
                    final long a = dkb.a();
                    if (t8r.l(a) < 0.0f && t8r.p(a) && !t8r.o(a) && !xxf.i(dkb, layoutNode)) {
                        break;
                    }
                }
            }
            dkb.x = x;
        }
    }
    
    @Override
    public final int s(final int n) {
        final e3a f = super.P.F();
        final moe b = f.B();
        final LayoutNode layoutNode = (LayoutNode)f.w;
        return b.a((flc)layoutNode.getOuterCoordinator$ui(), layoutNode.q(), n);
    }
    
    @Override
    public final o8h u(long y) {
        if (super.R) {
            final kcc a0 = this.A0;
            a0.getClass();
            y = a0.y;
        }
        this.d0(y);
        final LayoutNode p = super.P;
        final inf m = p.M();
        final Object[] v = m.v;
        for (int x = m.x, i = 0; i < x; ++i) {
            ((LayoutNode)v[i]).z().h0 = 3;
        }
        this.B1(p.S.b((ooe)this, p.q(), y));
        this.s1();
        return this;
    }
}
