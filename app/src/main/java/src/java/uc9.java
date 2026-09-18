import java.util.Map;

public final class uc9 extends e0d implements jzc
{
    public efo J;
    public veo K;
    public veo L;
    public veo M;
    public id9 N;
    public ev9 O;
    public hsl P;
    public jta Q;
    public gc9 R;
    public long S;
    public gx T;
    public final tc9 U;
    public final tc9 V;
    
    public uc9(final efo j, final veo k, final veo l, final veo m, final id9 n, final ev9 o, final hsl p9, final jta q, final gc9 r) {
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p9;
        this.Q = q;
        this.R = r;
        this.S = -9223372034707292160L;
        hv6.b(0, 0, 0, 0, 15);
        this.U = new tc9(this, (byte)0);
        this.V = new tc9(this, (byte)1);
    }
    
    @Override
    public final noe b(final ooe ooe, final goe goe, long a) {
        if (this.J.a.i() == this.J.d.getValue()) {
            this.T = null;
        }
        else if (this.T == null) {
            Object t;
            if ((t = this.o1()) == null) {
                t = wab.x;
            }
            this.T = (gx)t;
        }
        final boolean r0 = ((flc)ooe).r0();
        final s89 v = s89.v;
        if (r0) {
            final o8h u = goe.u(a);
            a = ((long)u.v << 32 | ((long)u.w & 0xFFFFFFFFL));
            this.S = a;
            return ooe.Y((int)(a >> 32), (int)(a & 0xFFFFFFFFL), (Map)v, (lta)new ye0(u, (byte)1));
        }
        if (this.Q.a()) {
            final gc9 r2 = this.R;
            final veo a2 = r2.a;
            final hsl b = r2.b;
            final veo c = r2.c;
            final efo d = r2.d;
            final id9 e = r2.e;
            final ev9 f = r2.f;
            final veo g = r2.g;
            ueo a3;
            if (a2 != null) {
                final ic9 ic9 = new ic9(e, f, (byte)0);
                Float value;
                if (b.c()) {
                    value = b.g;
                }
                else {
                    value = null;
                }
                a3 = a2.a(ic9, value, null, new xd0(e, f, b, (byte)2));
            }
            else {
                a3 = null;
            }
            ueo a4;
            if (c != null) {
                final q79 q79 = new q79((Object)e, (Object)f, (byte)1);
                Float value2;
                if (b.c()) {
                    value2 = b.h;
                }
                else {
                    value2 = null;
                }
                a4 = c.a((lta)q79, value2, b.a(), (lta)new kc9((Object)e, (Object)f, (Object)b, (byte)0));
            }
            else {
                a4 = null;
            }
            Object o = null;
            Label_0526: {
                Label_0456: {
                    if (d.a.i() == ec9.v) {
                        final aak d2 = e.a.d;
                        if (d2 != null) {
                            o = new jeo(d2.b);
                        }
                        else {
                            final aak d3 = f.a.d;
                            if (d3 == null) {
                                break Label_0456;
                            }
                            o = new jeo(d3.b);
                        }
                    }
                    else {
                        final aak d4 = f.a.d;
                        if (d4 != null) {
                            o = new jeo(d4.b);
                        }
                        else {
                            final aak d5 = e.a.d;
                            if (d5 == null) {
                                break Label_0456;
                            }
                            o = new jeo(d5.b);
                        }
                    }
                    break Label_0526;
                }
                o = null;
            }
            ueo a5;
            if (g != null) {
                final q10 d6 = q10.D;
                Object o2;
                if (b.c()) {
                    o2 = new jeo(b.i);
                }
                else {
                    o2 = null;
                }
                a5 = g.a((lta)d6, o2, null, (lta)new vx7(o, (Object)e, (Object)f, (Object)b, (byte)3));
            }
            else {
                a5 = null;
            }
            final jc9 jc9 = new jc9(b, a3, a4, a5);
            final o8h u2 = goe.u(a);
            final long n = (long)u2.v << 32 | ((long)u2.w & 0xFFFFFFFFL);
            long s;
            if (qt7.G(this.S)) {
                s = this.S;
            }
            else {
                s = n;
            }
            final veo k = this.K;
            ueo a6;
            if (k != null) {
                a6 = k.a(this.U, null, null, (lta)new sc9(this, s, (byte)0));
            }
            else {
                a6 = null;
            }
            long a7;
            if (a6 != null) {
                a7 = ((chc)a6.getValue()).a;
            }
            else {
                a7 = n;
            }
            final long d7 = hv6.d(a, a7);
            final veo l = this.L;
            if (l != null) {
                a = ((ugc)l.a((lta)q10.I, null, null, (lta)new sc9(this, s, (byte)2)).getValue()).a;
            }
            else {
                a = 0L;
            }
            Object o3 = null;
            final veo m = this.M;
            ueo a8;
            if (m != null) {
                final hsl p3 = this.P;
                if (p3.c()) {
                    o3 = new ugc(p3.j);
                }
                a8 = m.a(this.V, o3, this.P.b(), (lta)new sc9(this, s, (byte)1));
            }
            else {
                a8 = null;
            }
            return ooe.Y((int)(d7 >> 32), (int)(d7 & 0xFFFFFFFFL), (Map)v, (lta)new qc9(this, a8, n, s, d7, u2, a, jc9));
        }
        final o8h u3 = goe.u(a);
        return ooe.Y(u3.v, u3.w, (Map)v, (lta)new rc9(u3, (byte)0));
    }
    
    @Override
    public final void g1() {
        this.S = -9223372034707292160L;
    }
    
    public final gx o1() {
        if (this.J.f().e(ec9.v, ec9.w)) {
            final rd3 c = this.N.a.c;
            if (c != null) {
                final gx a = c.a;
                if (a != null) {
                    return a;
                }
            }
            final rd3 c2 = this.O.a.c;
            if (c2 != null) {
                return c2.a;
            }
        }
        else {
            final rd3 c3 = this.O.a.c;
            if (c3 != null) {
                final gx a2 = c3.a;
                if (a2 != null) {
                    return a2;
                }
            }
            final rd3 c4 = this.N.a.c;
            if (c4 != null) {
                return c4.a;
            }
        }
        return null;
    }
    
    @Override
    public final void t(final nzc e) {
        this.P.e = e;
    }
}
