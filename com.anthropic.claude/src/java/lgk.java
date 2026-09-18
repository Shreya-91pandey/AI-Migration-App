import java.util.Collection;
import android.view.KeyEvent;
import java.util.List;

public final class lgk extends vu8 implements ruc, xsk
{
    public final asf e0;
    public l0 f0;
    public e3 g0;
    public boolean h0;
    public boolean i0;
    public fif j0;
    public jdo k0;
    public final p48 l0;
    public final chk m0;
    public final igk n0;
    public final gna o0;
    public final px6 p0;
    
    public lgk(final w60 w60, final yl2 yl2, gia gia, final llf llf, final zhg zhg, final mgk mgk, final boolean b, final boolean b2) {
        super((lta)xp7.d, b, llf, zhg);
        this.e0 = new asf();
        final Object l0 = new p48(new v08(new xzj((xc8)dgk.c)));
        this.l0 = (p48)l0;
        if (gia == null) {
            gia = (gia)l0;
        }
        final chk m0 = new chk(mgk, w60, gia, zhg, b2, this.e0, this, new jgk(this, (byte)0));
        this.m0 = m0;
        final igk n0 = new igk(m0, b);
        this.n0 = n0;
        final gna o0 = new gna(2, (zta)null, 10);
        this.o1((t98)o0);
        this.o0 = o0;
        final px6 px6 = new px6(zhg, m0, b2, yl2, new jgk(this, (byte)1));
        this.o1(px6);
        this.p0 = px6;
        this.o1((t98)new fsf((xrf)n0, this.e0));
        final hgf hgf = new hgf();
        ((vl2)hgf).J = px6;
        this.o1(hgf);
    }
    
    @Override
    public final void G(final jeh jeh, final keh keh, final long n) {
        final List a = jeh.a;
        for (int size = ((Collection)a).size(), i = 0; i < size; ++i) {
            if (super.M.b(xeh.a(((peh)a.get(i)).j()))) {
                super.G(jeh, keh, n);
                break;
            }
        }
        if (super.N) {
            if (super.V == null) {
                final jxa e = o1r.e((ixa)this);
                this.o1((t98)e);
                super.V = e;
            }
            final keh v = keh.v;
            if (keh == v && jeh.f == 6) {
                if (!this.h0) {
                    this.j0 = new fif(this.m0, e9r.l(this), new zg8(this, (byte)2), soh.L(this).U);
                    this.h0 = true;
                }
                final fif j0 = this.j0;
                if (j0 != null) {
                    j0.i(this.c1());
                }
            }
            final fif j2 = this.j0;
            if (j2 != null) {
                j2.h(jeh, keh, n);
            }
            Label_0342: {
                if (keh == v) {
                    final int f = jeh.f;
                    if (f != 10) {
                        if (f != 11) {
                            if (f != 12) {
                                break Label_0342;
                            }
                        }
                    }
                    if (!this.i0) {
                        this.k0 = new jdo(this.m0, new zg8(this, (byte)3), soh.L(this).U);
                        this.i0 = true;
                    }
                    final jdo k0 = this.k0;
                    if (k0 != null) {
                        k0.g(this.c1());
                    }
                }
            }
            final jdo k2 = this.k0;
            if (k2 != null) {
                k2.f(jeh, keh, n);
            }
        }
    }
    
    public final void J1(final w60 b, final yl2 m, final gia gia, final llf llf, final zhg zhg, final mgk a, final boolean w, final boolean b2) {
        if (super.N != w) {
            this.n0.w = w;
            this.f0 = null;
            this.g0 = null;
            soh.L(this).T();
        }
        Object l0;
        if ((l0 = gia) == null) {
            l0 = this.l0;
        }
        final chk m2 = this.m0;
        final boolean q = mlc.q(m2.a, a);
        final boolean b3 = true;
        boolean b4;
        if (!q) {
            m2.a = a;
            b4 = true;
        }
        else {
            b4 = false;
        }
        m2.b = b;
        zhg d;
        if ((d = m2.d) != zhg) {
            m2.d = zhg;
            d = zhg;
            b4 = true;
        }
        if (m2.e != b2) {
            m2.e = b2;
            b4 = b3;
        }
        m2.c = (gia)l0;
        m2.f = this.e0;
        final px6 p8 = this.p0;
        p8.J = zhg;
        p8.L = b2;
        p8.M = m;
        final f3 d2 = xp7.d;
        final zhg v = zhg.v;
        zhg w2;
        if (d == v) {
            w2 = v;
        }
        else {
            w2 = zhg.w;
        }
        this.I1((lta)d2, w, llf, w2, b4);
    }
    
    @Override
    public final boolean Q(final KeyEvent keyEvent) {
        if (super.N) {
            final long i = ibr.i(keyEvent);
            final int o = huc.O;
            if ((huc.a(i, cbr.s()) || huc.a(ibr.i(keyEvent), cbr.t())) && hbr.c(ibr.j(keyEvent), 2) && !ibr.k(keyEvent)) {
                final boolean b = this.m0.d == zhg.v;
                final px6 p = this.p0;
                long n3;
                int n4;
                if (b) {
                    final int n = (int)(p.p1() & 0xFFFFFFFFL);
                    float n2;
                    if (huc.a(ibr.i(keyEvent), cbr.t())) {
                        n2 = (float)n;
                    }
                    else {
                        n2 = -(float)n;
                    }
                    n3 = Float.floatToRawIntBits(0.0f);
                    n4 = Float.floatToRawIntBits(n2);
                }
                else {
                    final int n5 = (int)(p.p1() >> 32);
                    float n6;
                    if (huc.a(ibr.i(keyEvent), cbr.t())) {
                        n6 = (float)n5;
                    }
                    else {
                        n6 = -(float)n5;
                    }
                    n3 = Float.floatToRawIntBits(n6);
                    n4 = Float.floatToRawIntBits(0.0f);
                }
                rhc.G(this.c1(), null, 0, (zta)new kgk(this, ((long)n4 & 0xFFFFFFFFL) | n3 << 32, (f07)null, (byte)0), 3);
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final boolean d1() {
        return false;
    }
    
    @Override
    public final void f() {
        this.V();
        final fif j0 = this.j0;
        if (j0 != null) {
            ((lyf)j0).b(soh.L(this).U);
        }
        final jdo k0 = this.k0;
        if (k0 != null) {
            ((lyf)k0).b(soh.L(this).U);
        }
        this.V();
        if (!super.I) {
            return;
        }
        final xc8 u = soh.L(this).U;
        final p48 l0 = this.l0;
        l0.getClass();
        l0.a = new v08(new xzj(u));
    }
    
    @Override
    public final void g1() {
        final fif j0 = this.j0;
        if (j0 != null) {
            ((lyf)j0).b(soh.L(this).U);
        }
        final jdo k0 = this.k0;
        if (k0 != null) {
            ((lyf)k0).b(soh.L(this).U);
        }
        if (!super.I) {
            return;
        }
        final xc8 u = soh.L(this).U;
        final p48 l0 = this.l0;
        l0.getClass();
        l0.a = new v08(new xzj(u));
    }
    
    @Override
    public final void j(final itk itk) {
        if (super.N && (this.f0 == null || this.g0 == null)) {
            this.f0 = new l0((Object)this, (byte)1);
            this.g0 = new e3(this, null);
        }
        final l0 f0 = this.f0;
        if (f0 != null) {
            final auc[] a = ftk.a;
            itk.a(rsk.d, (Object)new t3((String)null, (aua)f0));
        }
        final e3 g0 = this.g0;
        if (g0 != null) {
            final auc[] a2 = ftk.a;
            itk.a(rsk.e, (Object)g0);
        }
    }
    
    @Override
    public final boolean p(final KeyEvent keyEvent) {
        return false;
    }
    
    @Override
    public final Object s1(final nh6 nh6, final fh fh) {
        final chk m0 = this.m0;
        final Object g = m0.g(lnf.w, (zta)new jzg((Object)nh6, (Object)m0, (f07)null, (byte)20), (h07)fh);
        if (g == pc7.v) {
            return g;
        }
        return lqo.a;
    }
    
    @Override
    public final void x1(final long n) {
    }
    
    @Override
    public final void y1(final fu8 fu8) {
        if (!super.I) {
            return;
        }
        rhc.G(this.e0.c(), null, 0, (zta)new xti((Object)fu8, (Object)this, (f07)null, (byte)21), 3);
    }
}
