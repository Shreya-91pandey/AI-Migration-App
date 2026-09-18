import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import android.view.KeyEvent;

public final class ea6 extends h0
{
    public String f0;
    public jta g0;
    public boolean h0;
    public final rlf i0;
    public final rlf j0;
    public peh k0;
    public wmm l0;
    public wmm m0;
    public boolean n0;
    public boolean o0;
    public long p0;
    public boolean q0;
    public f8c r0;
    public wmm s0;
    public wmm t0;
    public boolean u0;
    public boolean v0;
    public long w0;
    public boolean x0;
    
    public ea6(final jta jta, final jta g0, final llf llf, final iuj iuj, final String f0, final String s, final boolean b, final boolean b2) {
        super(llf, null, b, b2, s, iuj, jta);
        this.f0 = f0;
        this.g0 = g0;
        this.h0 = true;
        final rlf a = xvd.a;
        this.i0 = new rlf();
        this.j0 = new rlf();
        this.p0 = -1L;
        this.w0 = -1L;
    }
    
    @Override
    public final boolean A1(final KeyEvent keyEvent) {
        final long i = ibr.i(keyEvent);
        final jta g0 = this.g0;
        boolean b = false;
        if (g0 != null) {
            final rlf i2 = this.i0;
            b = b;
            if (i2.e(i) == null) {
                i2.i(i, rhc.G(this.c1(), null, 0, (zta)new da6(this, (f07)null, (byte)2), 3));
                b = true;
            }
        }
        final ca6 ca6 = (ca6)this.j0.e(i);
        return b;
    }
    
    @Override
    public final void B1(final KeyEvent keyEvent) {
        final long i = ibr.i(keyEvent);
        final rlf i2 = this.i0;
        final Object e = i2.e(i);
        int n = 0;
        final boolean b = false;
        if (e != null) {
            final opc opc = (opc)i2.e(i);
            n = (b ? 1 : 0);
            if (opc != null) {
                if (opc.c()) {
                    opc.g((CancellationException)null);
                    n = (b ? 1 : 0);
                }
                else {
                    n = 1;
                }
            }
            i2.g(i);
        }
        if (n == 0) {
            this.C1();
        }
    }
    
    @Override
    public final void D(final o70 o70, final keh keh) {
        this.y1();
        if (super.Q && super.U == null) {
            final jxa e = o1r.e((ixa)this);
            this.o1((t98)e);
            super.U = e;
        }
        final keh w = keh.w;
        int i = 0;
        final int n = 0;
        if (keh == w) {
            if (this.r0 == null) {
                final ArrayList list = (ArrayList)o70.f();
                final int size = list.size();
                int j = 0;
                while (j < size) {
                    if (b9r.i((f8c)list.get(j))) {
                        final f8c r0 = (f8c)((ArrayList)o70.f()).get(0);
                        r0.a();
                        this.r0 = r0;
                        if (!super.Q) {
                            break;
                        }
                        final wmm t0 = this.t0;
                        if (t0 != null && ((bqc)t0).c()) {
                            uoo.z(this, (sei)hm6.u).getClass();
                            if (r0.e() - this.w0 < 40L) {
                                this.x0 = true;
                                return;
                            }
                            this.u0 = true;
                            final wmm t2 = this.t0;
                            if (t2 != null) {
                                ((bqc)t2).g((CancellationException)null);
                            }
                            this.t0 = null;
                        }
                        this.v0 = false;
                        this.w1(r0);
                        if (this.g0 != null) {
                            this.s0 = rhc.G(this.c1(), null, 0, (zta)new da6(this, (f07)null, (byte)1), 3);
                            return;
                        }
                        break;
                    }
                    else {
                        ++j;
                    }
                }
            }
            else {
                if (this.v0) {
                    final ArrayList list2 = (ArrayList)o70.f();
                    for (int size2 = list2.size(), k = 0; k < size2; ++k) {
                        final f8c f8c = (f8c)list2.get(k);
                        if (!f8c.d() || f8c.c()) {
                            final ArrayList list3 = (ArrayList)o70.f();
                            for (int size3 = list3.size(), l = n; l < size3; ++l) {
                                ((f8c)list3.get(l)).a();
                            }
                            return;
                        }
                    }
                    final f8c f8c2 = (f8c)((ArrayList)o70.f()).get(0);
                    f8c2.a();
                    final long e2 = f8c2.e();
                    final f8c r2 = this.r0;
                    r2.getClass();
                    this.F1(e2, r2);
                    return;
                }
                final ArrayList list4 = (ArrayList)o70.f();
                for (int size4 = list4.size(), n2 = 0; n2 < size4; ++n2) {
                    final f8c f8c3 = (f8c)list4.get(n2);
                    if (f8c3.f() || !f8c3.d() || f8c3.c()) {
                        final float g = ((jap)uoo.z(this, (sei)hm6.u)).g();
                        final ArrayList list5 = (ArrayList)o70.f();
                        for (int size5 = list5.size(), n3 = 0; n3 < size5; ++n3) {
                            final f8c f8c4 = (f8c)list5.get(n3);
                            final long b = f8c4.b();
                            final f8c r3 = this.r0;
                            r3.getClass();
                            final boolean b2 = Math.abs(l6g.d(l6g.h(b, r3.b()))) > g;
                            if (f8c4.f() || b2) {
                                this.E1(true);
                                return;
                            }
                        }
                        return;
                    }
                }
                final f8c f8c5 = (f8c)((ArrayList)o70.f()).get(0);
                f8c5.a();
                final long e3 = f8c5.e();
                final f8c r4 = this.r0;
                r4.getClass();
                this.F1(e3, r4);
            }
        }
        else if (keh == keh.x && this.r0 != null && !this.v0) {
            for (ArrayList list6 = (ArrayList)o70.f(); i < list6.size(); ++i) {
                final f8c f8c6 = (f8c)list6.get(i);
                if (f8c6.f() && f8c6 != this.r0) {
                    this.E1(true);
                    return;
                }
            }
        }
    }
    
    public final void E1(final boolean b) {
        if (b) {
            this.r0 = null;
            final wmm s0 = this.s0;
            if (s0 != null) {
                ((bqc)s0).g((CancellationException)null);
            }
            this.s0 = null;
            final wmm t0 = this.t0;
            if (t0 != null) {
                ((bqc)t0).g((CancellationException)null);
            }
            this.t0 = null;
            this.u0 = false;
            this.v0 = false;
            this.w0 = -1L;
            this.x0 = false;
        }
        else {
            this.k0 = null;
            final wmm l0 = this.l0;
            if (l0 != null) {
                ((bqc)l0).g((CancellationException)null);
            }
            this.l0 = null;
            final wmm m0 = this.m0;
            if (m0 != null) {
                ((bqc)m0).g((CancellationException)null);
            }
            this.m0 = null;
            this.n0 = false;
            this.o0 = false;
            this.p0 = -1L;
            this.q0 = false;
        }
        this.u1(b);
    }
    
    public final void F1(final long w0, final f8c f8c) {
        if (super.Q && !this.x0) {
            this.v1(f8c.b(), true);
            this.w0 = w0;
            if (!this.v0) {
                if (!this.u0) {
                    this.C1();
                }
            }
        }
        this.r0 = null;
        this.x0 = false;
        this.u0 = false;
        final wmm s0 = this.s0;
        if (s0 != null) {
            ((bqc)s0).g((CancellationException)null);
        }
        this.s0 = null;
        this.v0 = false;
    }
    
    @Override
    public final void G(final jeh jeh, final keh keh, long n) {
        super.G(jeh, keh, n);
        final keh w = keh.w;
        final int n2 = 0;
        if (keh == w) {
            if (this.k0 == null) {
                if (ccn.h(jeh, true)) {
                    final peh k0 = (peh)jeh.a.get(0);
                    k0.a();
                    this.k0 = k0;
                    if (super.Q) {
                        final wmm m0 = this.m0;
                        if (m0 != null && ((bqc)m0).c()) {
                            uoo.z(this, (sei)hm6.u).getClass();
                            if (k0.k() - this.p0 < 40L) {
                                this.q0 = true;
                                return;
                            }
                            this.n0 = true;
                            final wmm m2 = this.m0;
                            if (m2 != null) {
                                ((bqc)m2).g((CancellationException)null);
                            }
                            this.m0 = null;
                        }
                        this.o0 = false;
                        this.x1(k0);
                        if (this.g0 != null) {
                            this.l0 = rhc.G(this.c1(), null, 0, (zta)new da6(this, (f07)null, (byte)0), 3);
                        }
                    }
                }
            }
            else {
                final boolean i = qbr.i(jeh);
                final List a = jeh.a;
                if (i && !this.o0 && super.Q && this.g0 != null) {
                    final wmm l0 = this.l0;
                    if (l0 != null) {
                        ((bqc)l0).g((CancellationException)null);
                    }
                    this.l0 = null;
                    final jta g0 = this.g0;
                    if (g0 != null) {
                        g0.a();
                    }
                    if (this.h0) {
                        ((ccb)uoo.z(this, (sei)hm6.l)).a(0);
                    }
                    this.o0 = true;
                }
                if (this.o0) {
                    for (int size = ((Collection)a).size(), j = 0; j < size; ++j) {
                        if (!i1r.h((peh)a.get(j))) {
                            for (int size2 = ((Collection)a).size(), n3 = n2; n3 < size2; ++n3) {
                                ((peh)a.get(n3)).a();
                            }
                            return;
                        }
                    }
                    final peh peh = (peh)a.get(0);
                    peh.a();
                    n = peh.k();
                    final peh k2 = this.k0;
                    k2.getClass();
                    this.G1(n, k2);
                    return;
                }
                for (int size3 = ((Collection)a).size(), n4 = 0; n4 < size3; ++n4) {
                    if (!i1r.g((peh)a.get(n4))) {
                        final long t1 = this.t1(n);
                        for (int size4 = ((Collection)a).size(), n5 = 0; n5 < size4; ++n5) {
                            final peh peh2 = (peh)a.get(n5);
                            if (peh2.l() || i1r.n(peh2, n, t1)) {
                                this.E1(false);
                                return;
                            }
                        }
                        return;
                    }
                }
                final peh peh3 = (peh)a.get(0);
                peh3.a();
                n = peh3.k();
                final peh k3 = this.k0;
                k3.getClass();
                this.G1(n, k3);
            }
        }
        else if (keh == keh.x && this.k0 != null && !this.o0) {
            final List a2 = jeh.a;
            for (int size5 = ((Collection)a2).size(), n6 = 0; n6 < size5; ++n6) {
                final peh peh4 = (peh)a2.get(n6);
                if (peh4.l() && peh4 != this.k0) {
                    this.E1(false);
                    return;
                }
            }
        }
    }
    
    public final void G1(final long p2, final peh peh) {
        if (super.Q && !this.q0) {
            this.v1(peh.e(), false);
            this.p0 = p2;
            if (!this.o0) {
                if (!this.n0) {
                    this.C1();
                }
            }
        }
        this.k0 = null;
        this.q0 = false;
        this.n0 = false;
        final wmm l0 = this.l0;
        if (l0 != null) {
            ((bqc)l0).g((CancellationException)null);
        }
        this.l0 = null;
        this.o0 = false;
    }
    
    public final void H1() {
        final rlf i0 = this.i0;
        final Object[] c = i0.c;
        final long[] a = i0.a;
        final int n = a.length - 2;
        final int n2 = 7;
        int n6;
        if (n >= 0) {
            int n3 = 0;
            while (true) {
                long n4 = a[n3];
                if ((~n4 << n2 & n4 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n5 = 8 - (~(n3 - n) >>> 31);
                    for (int j = 0; j < n5; ++j) {
                        if ((n4 & 0xFFL) < 128L) {
                            ((opc)c[(n3 << 3) + j]).g((CancellationException)null);
                        }
                        n4 >>= 8;
                    }
                    n6 = n2;
                    if (n5 != 8) {
                        break;
                    }
                }
                n6 = n2;
                if (n3 == n) {
                    break;
                }
                ++n3;
            }
        }
        else {
            n6 = 7;
        }
        i0.a();
        final rlf j2 = this.j0;
        final Object[] c2 = j2.c;
        final long[] a2 = j2.a;
        final int n7 = a2.length - 2;
        if (n7 >= 0) {
            int n8 = 0;
            while (true) {
                long n9 = a2[n8];
                if ((~n9 << n6 & n9 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n10 = 8 - (~(n8 - n7) >>> 31);
                    for (int k = 0; k < n10; ++k) {
                        if ((n9 & 0xFFL) < 128L) {
                            ((bqc)((ca6)c2[(n8 << 3) + k]).b()).g((CancellationException)null);
                        }
                        n9 >>= 8;
                    }
                    if (n10 != 8) {
                        break;
                    }
                }
                if (n8 == n7) {
                    break;
                }
                ++n8;
            }
        }
        j2.a();
    }
    
    @Override
    public final void V() {
        final llf l = super.L;
        if (l != null) {
            final wmb y = super.Y;
            if (y != null) {
                l.b((eic)new xmb(y));
            }
        }
        super.Y = null;
        this.E1(false);
    }
    
    @Override
    public final void i1() {
        this.H1();
    }
    
    @Override
    public final void r1(final itk itk) {
        if (this.g0 != null) {
            ftk.h(itk, this.f0, (jta)new p1((Object)this, (byte)24));
        }
    }
    
    @Override
    public final void y0() {
        this.E1(true);
    }
    
    @Override
    public final void z1() {
        this.H1();
    }
}
