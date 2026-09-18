import android.view.View;

public final class c0e extends hgf implements x2b, bw8, xsk, k5g
{
    public lta J;
    public lta K;
    public float L;
    public boolean M;
    public long N;
    public float O;
    public float P;
    public boolean Q;
    public bbh R;
    public View S;
    public xc8 T;
    public abh U;
    public final ksg V;
    public sd8 W;
    public long X;
    public chc Y;
    public mn2 Z;
    
    public c0e(final lta j, final lta k, final bbh r) {
        this.J = j;
        this.K = k;
        this.L = Float.NaN;
        this.M = true;
        this.N = 9205357640488583168L;
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = true;
        this.R = r;
        this.V = new ksg((Object)null, (q8m)cib.A);
        this.X = 9205357640488583168L;
    }
    
    @Override
    public final void F0() {
        yi2.I(this, (jta)new b0e(this, (byte)0));
    }
    
    @Override
    public final void I0(final k0d k0d) {
        k0d.a();
        final mn2 z = this.Z;
        if (z != null) {
            ((stk)z).e((Object)lqo.a);
        }
    }
    
    @Override
    public final void g1() {
        this.F0();
        this.Z = ao2.c(0, 0, 7);
        rhc.G(this.c1(), null, 4, new m33((byte)7, null, this), 1);
    }
    
    @Override
    public final void h1() {
        final abh u = this.U;
        if (u != null) {
            ((cbh)u).b();
        }
        this.U = null;
    }
    
    @Override
    public final void j(final itk itk) {
        itk.a(d0e.a, (Object)new b0e(this, (byte)1));
    }
    
    public final long o1() {
        sd8 w;
        if ((w = this.W) == null) {
            w = r8m.b((jta)new pyd((Object)this, (byte)2));
            this.W = w;
        }
        return ((l6g)w.getValue()).a;
    }
    
    public final void p1() {
        final abh u = this.U;
        if (u != null) {
            ((cbh)u).b();
        }
        View s;
        if ((s = this.S) == null) {
            s = eqi.m0(this);
        }
        this.S = s;
        xc8 t;
        if ((t = this.T) == null) {
            t = soh.L(this).U;
        }
        this.T = t;
        this.U = this.R.b(s, this.M, this.N, this.O, this.P, this.Q, t, this.L);
        this.r1();
    }
    
    public final void q1() {
        xc8 t;
        if ((t = this.T) == null) {
            t = soh.L(this).U;
            this.T = t;
        }
        final long a = ((l6g)this.J.b(t)).a;
        if ((a & 0x7FFFFFFF7FFFFFFFL) != 0x7FC000007FC00000L && (0x7FFFFFFF7FFFFFFFL & this.o1()) != 0x7FC000007FC00000L) {
            this.X = l6g.i(this.o1(), a);
            if (this.U == null) {
                this.p1();
            }
            final abh u = this.U;
            if (u != null) {
                u.a(this.L, this.X, 9205357640488583168L);
            }
            this.r1();
            return;
        }
        this.X = 9205357640488583168L;
        final abh u2 = this.U;
        if (u2 != null) {
            ((cbh)u2).b();
        }
    }
    
    public final void r1() {
        final abh u = this.U;
        if (u != null) {
            final xc8 t = this.T;
            if (t != null) {
                final cbh cbh = (cbh)u;
                if (!chc.a(cbh.c(), (Object)this.Y)) {
                    final lta k = this.K;
                    if (k != null) {
                        k.b(new us8(t.y(uoo.Z(cbh.c()))));
                    }
                    this.Y = new chc(cbh.c());
                }
            }
        }
    }
    
    @Override
    public final void u0(final yxf value) {
        this.V.setValue((Object)value);
    }
}
