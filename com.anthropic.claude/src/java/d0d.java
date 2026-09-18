import androidx.compose.ui.node.LayoutNode;

public final class d0d extends yxf
{
    public static final y80 D0;
    public gv6 A0;
    public b0d B0;
    public ut0 C0;
    public a0d z0;
    
    static {
        final y80 d = uoo.d();
        final int i = j86.i;
        d.f(j86.f);
        d.m(1.0f);
        d.n(1);
        D0 = d;
    }
    
    public d0d(LayoutNode d, final a0d z0) {
        super(d);
        this.z0 = z0;
        d = d.D;
        final ut0 ut0 = null;
        b0d b0;
        if (d != null) {
            b0 = new b0d(this);
        }
        else {
            b0 = null;
        }
        this.B0 = b0;
        ut0 c0 = ut0;
        if ((((hgf)z0).v.x & 0x200) != 0x0) {
            c0 = new ut0(this, (rt0)z0);
        }
        this.C0 = c0;
    }
    
    public final void K1() {
        if (super.I) {
            return;
        }
        this.t1();
        final yxf s = super.S;
        s.getClass();
        final ut0 c0 = this.C0;
        if (c0 != null) {
            final rt0 w = c0.w;
            this.B0.getClass();
            boolean q = false;
            Label_0172: {
                if (!w.v0(super.K) && !c0.x) {
                    final long x = super.x;
                    final b0d b0 = this.B0;
                    final Object o = null;
                    chc chc;
                    if (b0 != null) {
                        chc = new chc(((yxd)b0).O0());
                    }
                    else {
                        chc = null;
                    }
                    if (chc.a(x, (Object)chc)) {
                        final long x2 = s.x;
                        final yxd f1 = s.f1();
                        Object o2 = o;
                        if (f1 != null) {
                            o2 = new chc(f1.O0());
                        }
                        if (chc.a(x2, o2)) {
                            q = true;
                            break Label_0172;
                        }
                    }
                }
                q = false;
            }
            s.Q = q;
        }
        final boolean j = s.J;
        s.J = super.J;
        this.y0().d();
        s.J = j;
        s.Q = false;
    }
    
    public final void L1(final a0d z0) {
        if (!z0.equals(this.z0)) {
            if ((((hgf)z0).v.x & 0x200) != 0x0) {
                final rt0 w = (rt0)z0;
                ut0 c0 = this.C0;
                if (c0 != null) {
                    c0.w = w;
                }
                else {
                    c0 = new ut0(this, w);
                }
                this.C0 = c0;
            }
            else {
                this.C0 = null;
            }
        }
        this.z0 = z0;
    }
    
    @Override
    public final int Q(final int n) {
        final ut0 c0 = this.C0;
        if (c0 == null) {
            final a0d z0 = this.z0;
            final yxf s = super.S;
            s.getClass();
            return z0.h((wxd)this, (goe)s, n);
        }
        final rt0 w = c0.w;
        final yxf s2 = super.S;
        s2.getClass();
        final yxf c2 = ((hgf)w).v.C;
        c2.getClass();
        final yxd f1 = c2.f1();
        f1.getClass();
        if (f1.v0()) {
            return new cvj((Object)w, (byte)6).F(new pt0((nt0)c0, c0.getLayoutDirection()), new c58(s2, 1, 2, (byte)1), hv6.b(0, n, 0, 0, 13)).a();
        }
        return s2.Q(n);
    }
    
    @Override
    public final int a(final int n) {
        final ut0 c0 = this.C0;
        if (c0 == null) {
            final a0d z0 = this.z0;
            final yxf s = super.S;
            s.getClass();
            return z0.g((wxd)this, (goe)s, n);
        }
        final rt0 w = c0.w;
        final yxf s2 = super.S;
        s2.getClass();
        final yxf c2 = ((hgf)w).v.C;
        c2.getClass();
        final yxd f1 = c2.f1();
        f1.getClass();
        if (f1.v0()) {
            return new qt0(w, (byte)0).a(new pt0((nt0)c0, c0.getLayoutDirection()), new c58(s2, 2, 2, (byte)1), hv6.b(0, n, 0, 0, 13)).a();
        }
        return s2.a(n);
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
        this.K1();
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
        this.K1();
    }
    
    @Override
    public final void c1() {
        if (this.B0 == null) {
            this.B0 = new b0d(this);
        }
    }
    
    @Override
    public final yxd f1() {
        return (yxd)this.B0;
    }
    
    @Override
    public final int h0(final hx hx) {
        final b0d b0 = this.B0;
        if (b0 == null) {
            return zrn.y((wxd)this, hx);
        }
        final amf u = ((yxd)b0).U;
        final int d = u.d((Object)hx);
        if (d >= 0) {
            return u.c[d];
        }
        return Integer.MIN_VALUE;
    }
    
    @Override
    public final hgf h1() {
        return ((hgf)this.z0).v;
    }
    
    @Override
    public final int n(final int n) {
        final ut0 c0 = this.C0;
        if (c0 == null) {
            final a0d z0 = this.z0;
            final yxf s = super.S;
            s.getClass();
            return z0.M0((wxd)this, (goe)s, n);
        }
        final rt0 w = c0.w;
        final yxf s2 = super.S;
        s2.getClass();
        final yxf c2 = ((hgf)w).v.C;
        c2.getClass();
        final yxd f1 = c2.f1();
        f1.getClass();
        if (f1.v0()) {
            return new qt0(w, (byte)1).a(new pt0((nt0)c0, c0.getLayoutDirection()), new c58(s2, 1, 1, (byte)1), hv6.b(0, 0, 0, n, 7)).b();
        }
        return s2.n(n);
    }
    
    @Override
    public final int s(final int n) {
        final ut0 c0 = this.C0;
        if (c0 == null) {
            final a0d z0 = this.z0;
            final yxf s = super.S;
            s.getClass();
            return z0.k((wxd)this, (goe)s, n);
        }
        final rt0 w = c0.w;
        final yxf s2 = super.S;
        s2.getClass();
        final yxf c2 = ((hgf)w).v.C;
        c2.getClass();
        final yxd f1 = c2.f1();
        f1.getClass();
        if (f1.v0()) {
            return new bgq((Object)w).D(new pt0((nt0)c0, c0.getLayoutDirection()), new c58(s2, 2, 1, (byte)1), hv6.b(0, 0, 0, n, 7)).b();
        }
        return s2.s(n);
    }
    
    @Override
    public final o8h u(long n) {
        final boolean r = super.R;
        Object o = null;
        if (r) {
            final gv6 a0 = this.A0;
            if (a0 == null) {
                en9.s("Lookahead constraints cannot be null in approach pass.");
                return null;
            }
            n = a0.a;
        }
        this.d0(n);
        final ut0 c0 = this.C0;
        Object b6;
        if (c0 != null) {
            final rt0 w = c0.w;
            final b0d b0 = c0.v.B0;
            b0.getClass();
            final noe y0 = ((yxd)b0).y0();
            y0.b();
            y0.a();
            final boolean t = w.T();
            boolean b2 = true;
            boolean x = false;
            Label_0156: {
                if (!t) {
                    final gv6 a2 = this.A0;
                    if (a2 != null) {
                        if (n == a2.a) {
                            x = false;
                            break Label_0156;
                        }
                    }
                }
                x = true;
            }
            if (!(c0.x = x)) {
                final yxf s = super.S;
                s.getClass();
                s.R = true;
            }
            final yxf s2 = super.S;
            s2.getClass();
            final noe d0 = w.D0((st0)c0, (goe)s2, n);
            final yxf s3 = super.S;
            s3.getClass();
            s3.R = false;
            final int b3 = d0.b();
            final b0d b4 = this.B0;
            b4.getClass();
            Label_0297: {
                if (b3 == ((o8h)b4).v) {
                    final int a3 = d0.a();
                    final b0d b5 = this.B0;
                    b5.getClass();
                    if (a3 == ((o8h)b5).w) {
                        break Label_0297;
                    }
                }
                b2 = false;
            }
            b6 = d0;
            if (!c0.x) {
                final yxf s4 = super.S;
                s4.getClass();
                n = s4.x;
                final yxf s5 = super.S;
                s5.getClass();
                final yxd f1 = s5.f1();
                if (f1 != null) {
                    o = new chc(f1.O0());
                }
                b6 = d0;
                if (chc.a(n, o)) {
                    b6 = d0;
                    if (!b2) {
                        b6 = new c0d(d0, this);
                    }
                }
            }
        }
        else {
            final a0d z0 = this.z0;
            final yxf s6 = super.S;
            s6.getClass();
            b6 = z0.b((ooe)this, (goe)s6, n);
        }
        this.B1((noe)b6);
        this.s1();
        return this;
    }
    
    @Override
    public final void x1(final x13 x13, final g6b g6b) {
        final yxf s = super.S;
        s.getClass();
        s.Y0(x13, g6b);
        if (l0d.a(super.P).getShowLayoutBounds()) {
            final yxf s2 = super.S;
            if (s2 != null && (!chc.b(super.x, s2.x) || !ugc.b(s2.c0, 0L))) {
                final long x14 = super.x;
                x13.j(0.5f, 0.5f, (int)(x14 >> 32) - 0.5f, (int)(x14 & 0xFFFFFFFFL) - 0.5f, d0d.D0);
            }
        }
    }
}
