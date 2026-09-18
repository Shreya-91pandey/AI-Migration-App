import java.util.concurrent.CancellationException;

public final class zmk extends r1
{
    public static final eg0 O;
    public static final eg0 P;
    public efo A;
    public long B;
    public final wfk C;
    public z8m D;
    public final gsg E;
    public l13 F;
    public final cof G;
    public final znf H;
    public long I;
    public final emf J;
    public tmk K;
    public final rmk L;
    public float M;
    public final rmk N;
    public final ksg x;
    public final ksg y;
    public Object z;
    
    static {
        O = new eg0(0.0f);
        P = new eg0(1.0f);
    }
    
    public zmk(final Object z) {
        super((byte)5);
        this.x = o50.Q(z);
        this.y = o50.Q(z);
        this.z = z;
        this.C = new wfk((Object)this, (byte)1);
        this.E = new gsg(0.0f);
        this.G = new cof();
        this.H = new znf();
        this.I = Long.MIN_VALUE;
        this.J = new emf();
        this.L = new rmk(this, (byte)0);
        this.N = new rmk(this, (byte)1);
    }
    
    public static void u(final tmk tmk, long b) {
        final long n = tmk.e() + b;
        tmk.n(n);
        b = tmk.b();
        if (n >= b) {
            tmk.o(1.0f);
            return;
        }
        final o6p a = tmk.a();
        if (a != null) {
            final eg0 f = tmk.f();
            eg0 eg0;
            if ((eg0 = tmk.d()) == null) {
                eg0 = zmk.O;
            }
            tmk.o(ncq.n(((eg0)a.i(n, f, zmk.P, eg0)).a(0), 0.0f, 1.0f));
            return;
        }
        final float a2 = tmk.f().a(0);
        final float n2 = n / (float)b;
        tmk.o(n2 * 1.0f + (1.0f - n2) * a2);
    }
    
    public final Object A(Object a, final m6n m6n) {
        final efo a2 = this.A;
        if (a2 != null) {
            if (!mlc.q(this.y.getValue(), a) || !mlc.q(this.x.getValue(), a)) {
                a = znf.a(this.H, (lta)new k00((Object)this, a, (Object)a2, (f07)null, (byte)19), m6n);
                if (a == pc7.v) {
                    return a;
                }
            }
        }
        return lqo.a;
    }
    
    public final Object B(final h07 h07) {
        xmk xmk = null;
        Label_0045: {
            if (h07 instanceof xmk) {
                xmk = (xmk)h07;
                final int y = xmk.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    xmk.y = y + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            xmk = new xmk(this, h07);
        }
        final Object w = xmk.w;
        final int y2 = xmk.y;
        final cof g = this.G;
        final pc7 v = pc7.v;
        Object o = null;
        Object p = null;
        Label_0206: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        o = xmk.v;
                        vt4.g0(w);
                        p = w;
                        break Label_0206;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    o = xmk.v;
                    vt4.g0(w);
                }
            }
            else {
                vt4.g0(w);
                o = this.x.getValue();
                xmk.v = o;
                xmk.y = 1;
                if (g.c((f07)xmk) == v) {
                    return v;
                }
            }
            xmk.v = o;
            xmk.y = 2;
            final l13 f = new l13(1, ljq.K((f07)xmk));
            f.r();
            this.F = f;
            g.g((Object)null);
            p = f.p();
            if (p != v) {
                break Label_0206;
            }
            return v;
        }
        if (mlc.q(p, o)) {
            return lqo.a;
        }
        this.I = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
    }
    
    public final Object C(final h07 h07) {
        ymk ymk = null;
        Label_0045: {
            if (h07 instanceof ymk) {
                ymk = (ymk)h07;
                final int y = ymk.y;
                if ((y & Integer.MIN_VALUE) != 0x0) {
                    ymk.y = y + Integer.MIN_VALUE;
                    break Label_0045;
                }
            }
            ymk = new ymk(this, h07);
        }
        final Object w = ymk.w;
        final int y2 = ymk.y;
        final cof g = this.G;
        final pc7 v = pc7.v;
        Object o = null;
        Object p = null;
        Label_0226: {
            if (y2 != 0) {
                if (y2 != 1) {
                    if (y2 == 2) {
                        o = ymk.v;
                        vt4.g0(w);
                        p = w;
                        break Label_0226;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    o = ymk.v;
                    vt4.g0(w);
                }
            }
            else {
                vt4.g0(w);
                o = this.x.getValue();
                ymk.v = o;
                ymk.y = 1;
                if (g.c((f07)ymk) == v) {
                    return v;
                }
            }
            if (mlc.q(o, this.z)) {
                g.g((Object)null);
                return lqo.a;
            }
            ymk.v = o;
            ymk.y = 2;
            final l13 f = new l13(1, ljq.K((f07)ymk));
            f.r();
            this.F = f;
            g.g((Object)null);
            p = f.p();
            if (p != v) {
                break Label_0226;
            }
            return v;
        }
        if (!mlc.q(p, o)) {
            this.I = Long.MIN_VALUE;
            final StringBuilder sb = new StringBuilder("snapTo() was canceled because state was changed to ");
            sb.append(p);
            sb.append(" instead of ");
            sb.append(o);
            throw new CancellationException(sb.toString());
        }
        return lqo.a;
    }
    
    @Override
    public final Object i() {
        return this.y.getValue();
    }
    
    @Override
    public final Object k() {
        return this.x.getValue();
    }
    
    @Override
    public final void o(final Object value) {
        this.y.setValue(value);
    }
    
    @Override
    public final void p(final efo a) {
        final efo a2 = this.A;
        if (a2 != null) {
            if (!a.equals(a2)) {
                final efo a3 = this.A;
                final StringBuilder sb = new StringBuilder("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: ");
                sb.append((Object)a3);
                sb.append(", new instance: ");
                sb.append((Object)a);
                rih.b(sb.toString());
            }
        }
        this.A = a;
    }
    
    @Override
    public final void q() {
        this.A = null;
        final z8m d = this.D;
        if (d != null) {
            d.b((Object)this);
        }
    }
    
    public final Object r(final h07 h07) {
        final float j = uoo.J(h07.getContext());
        final lqo a = lqo.a;
        if (j <= 0.0f) {
            this.s();
            return a;
        }
        this.M = j;
        final Object p = ien.v(h07.getContext()).p0((f07)h07, (lta)this.N);
        if (p == pc7.v) {
            return p;
        }
        return a;
    }
    
    public final void s() {
        final efo a = this.A;
        if (a != null) {
            a.c();
        }
        this.J.e();
        if (this.K != null) {
            this.K = null;
            this.y(1.0f);
            this.x();
        }
    }
    
    public final void t() {
        final efo a = this.A;
        if (a == null) {
            return;
        }
        tmk k = null;
        Label_0149: {
            if ((k = this.K) == null) {
                if (this.B > 0L) {
                    final gsg e = this.E;
                    if (e.h() != 1.0f) {
                        if (!mlc.q(this.y.getValue(), this.x.getValue())) {
                            k = new tmk();
                            k.o(e.h());
                            final long b = this.B;
                            k.l(b);
                            k.j(k8e.I((1.0 - e.h()) * b));
                            k.f().e(0, e.h());
                            break Label_0149;
                        }
                    }
                }
                k = null;
            }
        }
        if (k != null) {
            k.l(this.B);
            this.J.b(k);
            a.n(k);
        }
        this.K = null;
    }
    
    public final Object v(final h07 h07) {
        umk umk2 = null;
        Label_0047: {
            if (h07 instanceof umk) {
                final umk umk = (umk)h07;
                final int x = umk.x;
                if ((x & Integer.MIN_VALUE) != 0x0) {
                    umk.x = x + Integer.MIN_VALUE;
                    umk2 = umk;
                    break Label_0047;
                }
            }
            umk2 = new umk(this, h07);
        }
        final Object v = umk2.v;
        final int x2 = umk2.x;
        final emf j = this.J;
        final lqo a = lqo.a;
        final pc7 v2 = pc7.v;
        if (x2 != 0) {
            if (x2 != 1 && x2 != 2) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(v);
        }
        else {
            vt4.g0(v);
            if (j.i() && this.K == null) {
                return a;
            }
            if (uoo.J(((f07)umk2).getContext()) == 0.0f) {
                this.s();
                this.I = Long.MIN_VALUE;
                return a;
            }
            if (this.I == Long.MIN_VALUE) {
                umk2.x = 1;
                if (ien.v(((f07)umk2).getContext()).p0((f07)umk2, (lta)this.L) == v2) {
                    return v2;
                }
            }
        }
        while (j.j() || this.K != null) {
            umk2.x = 2;
            if (this.r((h07)umk2) == v2) {
                return v2;
            }
        }
        this.I = Long.MIN_VALUE;
        return a;
    }
    
    public final Object w(final float n, Object a, final m6n m6n) {
        if (0.0f > n || n > 1.0f) {
            final StringBuilder sb = new StringBuilder("Expecting fraction between 0 and 1. Got ");
            sb.append(n);
            rih.a(sb.toString());
        }
        final efo a2 = this.A;
        if (a2 != null) {
            a = znf.a(this.H, (lta)new wmk(a, this.x.getValue(), this, a2, n, (f07)null), m6n);
            if (a == pc7.v) {
                return a;
            }
        }
        return lqo.a;
    }
    
    public final void x() {
        final efo a = this.A;
        if (a == null) {
            return;
        }
        a.m(k8e.I(this.E.h() * (double)((Number)a.m.getValue()).longValue()));
    }
    
    public final void y(final float n) {
        this.E.i(n);
    }
    
    public final void z(z8m d) {
        if (!mlc.q(this.D, d)) {
            final z8m d2 = this.D;
            if (d2 != null) {
                d2.b((Object)this);
            }
            final z8m d3 = this.D;
            if (d3 != null) {
                final re h = d3.h;
                if (h != null) {
                    h.i();
                }
            }
            if ((this.D = d) != null) {
                d.e();
            }
            d = this.D;
            if (d != null) {
                d.d((Object)this, (lta)xp7.k, (jta)this.C);
            }
        }
    }
}
