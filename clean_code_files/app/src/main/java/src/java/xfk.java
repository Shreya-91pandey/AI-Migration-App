public final class xfk extends v98 implements zl6, k5g
{
    public mgk L;
    public zhg M;
    public boolean N;
    public boolean O;
    public gia P;
    public llf Q;
    public yl2 R;
    public boolean S;
    public w60 T;
    public lgk U;
    public t98 V;
    public x60 W;
    public w60 X;
    public boolean Y;
    
    @Override
    public final void F0() {
        final x60 w = (x60)uoo.z(this, (sei)hkg.a);
        if (!mlc.q(w, this.W)) {
            this.W = w;
            this.X = null;
            final t98 v = this.V;
            if (v != null) {
                this.p1(v);
            }
            this.V = null;
            this.r1();
            final lgk u = this.U;
            if (u != null) {
                final mgk l = this.L;
                final zhg m = this.M;
                w60 w2;
                if (this.S) {
                    w2 = this.X;
                }
                else {
                    w2 = this.T;
                }
                u.J1(w2, this.R, this.P, this.Q, m, l, this.N, this.Y);
            }
        }
    }
    
    @Override
    public final boolean d1() {
        return false;
    }
    
    @Override
    public final void g1() {
        this.Y = this.s1();
        this.r1();
        if (this.U == null) {
            final mgk l = this.L;
            w60 w60;
            if (this.S) {
                w60 = this.X;
            }
            else {
                w60 = this.T;
            }
            final lgk u = new lgk(w60, this.R, this.P, this.Q, this.M, l, this.N, this.Y);
            this.o1(u);
            this.U = u;
        }
    }
    
    @Override
    public final void h0() {
        final boolean s1 = this.s1();
        if (this.Y != s1) {
            this.Y = s1;
            final mgk l = this.L;
            final zhg m = this.M;
            final boolean s2 = this.S;
            w60 w60;
            if (s2) {
                w60 = this.X;
            }
            else {
                w60 = this.T;
            }
            this.t1(w60, this.R, this.P, this.Q, m, l, s2, this.N, this.O);
        }
    }
    
    @Override
    public final void h1() {
        final t98 v = this.V;
        if (v != null) {
            this.p1(v);
        }
    }
    
    public final void r1() {
        final t98 v = this.V;
        if (v == null) {
            if (this.S) {
                yi2.I(this, (jta)new wfk((Object)this, (byte)0));
            }
            w60 w60;
            if (this.S) {
                w60 = this.X;
            }
            else {
                w60 = this.T;
            }
            if (w60 != null) {
                final v98 i = w60.i;
                if (!i.v.I) {
                    this.o1(i);
                    this.V = i;
                }
            }
        }
        else if (!v.z0().I) {
            this.o1(v);
        }
    }
    
    public final boolean s1() {
        qzc qzc;
        if (super.I) {
            qzc = soh.L(this).V;
        }
        else {
            qzc = qzc.v;
        }
        final zhg m = this.M;
        final boolean o = this.O;
        if (qzc == qzc.w && m != zhg.v) {
            return o;
        }
        return o ^ true;
    }
    
    public final void t1(w60 t, final yl2 r, final gia p9, final llf q, final zhg m, final mgk l, final boolean s, final boolean n, final boolean o) {
        this.L = l;
        this.M = m;
        final boolean s2 = this.S;
        boolean b = true;
        boolean b2;
        if (s2 != s) {
            this.S = s;
            b2 = true;
        }
        else {
            b2 = false;
        }
        if (!mlc.q(this.T, t)) {
            this.T = t;
        }
        else {
            b = false;
        }
        if (b2 || (b && !s)) {
            final t98 v = this.V;
            if (v != null) {
                this.p1(v);
            }
            this.V = null;
            this.r1();
        }
        this.N = n;
        this.O = o;
        this.P = p9;
        this.Q = q;
        this.R = r;
        final boolean s3 = this.s1();
        this.Y = s3;
        final lgk u = this.U;
        if (u != null) {
            if (this.S) {
                t = this.X;
            }
            else {
                t = this.T;
            }
            u.J1(t, r, p9, q, m, l, n, s3);
        }
    }
}
