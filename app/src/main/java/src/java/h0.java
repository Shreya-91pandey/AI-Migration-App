import java.util.concurrent.CancellationException;
import androidx.compose.foundation.b;
import android.view.KeyEvent;

public abstract class h0 extends v98 implements teh, ruc, xsk, zl6, k5g, m8c, ixa
{
    public llf L;
    public a8c M;
    public boolean N;
    public String O;
    public iuj P;
    public boolean Q;
    public jta R;
    public final lna S;
    public a8c T;
    public jxa U;
    public String V;
    public t98 W;
    public vlh X;
    public wmb Y;
    public final rlf Z;
    public long a0;
    public vlh b0;
    public llf c0;
    public boolean d0;
    public wmm e0;
    
    public h0(llf l, final a8c m, final boolean n, final boolean q, final String o, final iuj p7, final jta r) {
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p7;
        this.Q = q;
        this.R = r;
        final a0 a0 = new a0(1, this, h0.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte)0);
        boolean d0 = false;
        this.S = new lna(l, 0, a0);
        this.V = "idle";
        final rlf a2 = xvd.a;
        this.Z = new rlf();
        this.a0 = 0L;
        l = this.L;
        this.c0 = l;
        if (l == null) {
            d0 = true;
        }
        this.d0 = d0;
    }
    
    public boolean A1(final KeyEvent keyEvent) {
        return false;
    }
    
    public void B1(final KeyEvent keyEvent) {
        this.C1();
    }
    
    public final void C1() {
        final jam jam = (jam)uoo.z(this, (sei)hm6.w);
        if (jam != null) {
            jam.a();
        }
        this.R.a();
    }
    
    public final void D1(final llf llf, final a8c m, final boolean n, final boolean q, final String o, final iuj p7, final jta r) {
        final boolean q2 = mlc.q(this.c0, llf);
        final int n2 = 1;
        final boolean b = false;
        int n3;
        if (!q2) {
            this.s1();
            this.c0 = llf;
            this.L = llf;
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        if (!mlc.q(this.M, m)) {
            this.M = m;
            n3 = 1;
        }
        if (this.N != n) {
            this.N = n;
            if (n) {
                this.F0();
            }
            n3 = 1;
        }
        final boolean q3 = this.Q;
        final lna s = this.S;
        if (q3 != q) {
            if (q) {
                this.o1(s);
            }
            else {
                this.p1(s);
                this.s1();
            }
            soh.L(this).T();
            if (!q) {
                final jxa u = this.U;
                if (u != null) {
                    this.p1((t98)u);
                }
                this.U = null;
                this.V = "idle";
            }
            this.Q = q;
        }
        if (!mlc.q(this.O, o)) {
            this.O = o;
            soh.L(this).T();
        }
        if (!mlc.q(this.P, p7)) {
            this.P = p7;
            soh.L(this).T();
        }
        this.R = r;
        final boolean d0 = this.d0;
        final llf c0 = this.c0;
        boolean d2;
        if ((d2 = d0) != (c0 == null)) {
            d2 = b;
            if (c0 == null) {
                d2 = true;
            }
            this.d0 = d2;
            if (!d2 && this.W == null) {
                n3 = n2;
            }
        }
        if (n3 != 0) {
            final t98 w = this.W;
            if (w != null || !d2) {
                if (w != null) {
                    this.p1(w);
                }
                this.W = null;
                this.y1();
            }
        }
        s.t1(this.L);
    }
    
    @Override
    public final void F0() {
        if (this.N) {
            yi2.I(this, (jta)new x(this, (byte)0));
        }
    }
    
    @Override
    public void G(final jeh jeh, final keh keh, long i) {
        i = uoo.I(i);
        final float n = (float)(int)(i >> 32);
        final float n2 = (float)(int)(i & 0xFFFFFFFFL);
        i = Float.floatToRawIntBits(n);
        this.a0 = (((long)Float.floatToRawIntBits(n2) & 0xFFFFFFFFL) | i << 32);
        this.y1();
        if (this.Q) {
            if (this.U == null) {
                final jxa e = o1r.e((ixa)this);
                this.o1((t98)e);
                this.U = e;
            }
            if (keh == keh.w) {
                final int f = jeh.f;
                if (f == 4) {
                    rhc.G(this.c1(), null, 0, (zta)new g0(this, (f07)null, (byte)0), 3);
                    return;
                }
                if (f == 5) {
                    rhc.G(this.c1(), null, 0, (zta)new g0(this, (f07)null, (byte)1), 3);
                }
            }
        }
    }
    
    @Override
    public final boolean Q(final KeyEvent keyEvent) {
        this.y1();
        final long i = ibr.i(keyEvent);
        final boolean q = this.Q;
        final rlf z = this.Z;
        if (q && hbr.c(ibr.j(keyEvent), 2) && b.f(keyEvent)) {
            boolean b;
            if (!z.b(i)) {
                final vlh vlh = new vlh(this.a0);
                z.i(i, vlh);
                if (this.L != null) {
                    rhc.G(this.c1(), null, 0, (zta)new f0(this, vlh, (f07)null, (byte)2), 3);
                }
                b = true;
            }
            else {
                b = false;
            }
            if (!this.A1(keyEvent)) {
                if (!b) {
                    return false;
                }
            }
        }
        else {
            if (!this.Q || !hbr.c(ibr.j(keyEvent), 1) || !b.f(keyEvent)) {
                return false;
            }
            final vlh vlh2 = (vlh)z.g(i);
            if (vlh2 != null) {
                if (this.L != null) {
                    rhc.G(this.c1(), null, 0, (zta)new f0(this, vlh2, (f07)null, (byte)3), 3);
                }
                this.B1(keyEvent);
            }
            if (vlh2 == null) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean X0() {
        return true;
    }
    
    @Override
    public final String d0() {
        return this.V;
    }
    
    @Override
    public final boolean d1() {
        return false;
    }
    
    @Override
    public final void g1() {
        this.F0();
        if (!this.d0) {
            this.y1();
        }
        if (this.Q) {
            this.o1(this.S);
        }
    }
    
    @Override
    public final void h1() {
        this.s1();
        if (this.c0 == null) {
            this.L = null;
        }
        final t98 w = this.W;
        if (w != null) {
            this.p1(w);
        }
        this.W = null;
        final jxa u = this.U;
        if (u != null) {
            this.p1((t98)u);
        }
        this.U = null;
    }
    
    @Override
    public final void j(final itk itk) {
        final iuj p = this.P;
        if (p != null) {
            ftk.s(itk, (int)p.a);
        }
        ftk.e(itk, this.O, (jta)new x(this, (byte)1));
        if (this.Q) {
            this.S.j(itk);
        }
        else {
            ftk.a(itk);
        }
        this.r1(itk);
    }
    
    @Override
    public final boolean p(final KeyEvent keyEvent) {
        return false;
    }
    
    public void r1(final itk itk) {
    }
    
    public final void s1() {
        final llf l = this.L;
        final rlf z = this.Z;
        if (l != null) {
            final vlh x = this.X;
            if (x != null) {
                l.b((eic)new ulh(x));
            }
            final vlh b0 = this.b0;
            if (b0 != null) {
                l.b((eic)new ulh(b0));
            }
            final wmb y = this.Y;
            if (y != null) {
                l.b((eic)new xmb(y));
            }
            final Object[] c = z.c;
            final long[] a = z.a;
            final int n = a.length - 2;
            if (n >= 0) {
                int n2 = 0;
                while (true) {
                    long n3 = a[n2];
                    if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                        final int n4 = 8 - (~(n2 - n) >>> 31);
                        for (int i = 0; i < n4; ++i) {
                            if ((0xFFL & n3) < 128L) {
                                l.b((eic)new ulh((vlh)c[(n2 << 3) + i]));
                            }
                            n3 >>= 8;
                        }
                        if (n4 != 8) {
                            break;
                        }
                    }
                    if (n2 == n) {
                        break;
                    }
                    ++n2;
                }
            }
        }
        this.X = null;
        this.b0 = null;
        this.Y = null;
        z.a();
    }
    
    public final long t1(long n) {
        final long t0 = soh.L(this).U.T0(((jap)uoo.z(this, (sei)hm6.u)).e());
        final float n2 = Math.max(0.0f, Float.intBitsToFloat((int)(t0 >> 32)) - (int)(n >> 32)) / 2.0f;
        final float n3 = Math.max(0.0f, Float.intBitsToFloat((int)(t0 & 0xFFFFFFFFL)) - (int)(n & 0xFFFFFFFFL)) / 2.0f;
        n = Float.floatToRawIntBits(n2);
        return ((long)Float.floatToRawIntBits(n3) & 0xFFFFFFFFL) | n << 32;
    }
    
    public final void u1(final boolean b) {
        final llf l = this.L;
        if (l != null) {
            final wmm e0 = this.e0;
            if (e0 != null && ((bqc)e0).c()) {
                final wmm e2 = this.e0;
                if (e2 != null) {
                    ((bqc)e2).g((CancellationException)null);
                }
            }
            else {
                vlh vlh;
                if (b) {
                    vlh = this.b0;
                }
                else {
                    vlh = this.X;
                }
                if (vlh != null) {
                    final ulh ulh = new ulh(vlh);
                    final opc opc = (opc)((fz6)this.c1()).v.M0((gc7)o55.z);
                    dq8 u0;
                    if (opc != null) {
                        u0 = opc.U0((lta)new y((Object)l, (Object)ulh, (byte)0));
                    }
                    else {
                        u0 = null;
                    }
                    rhc.G(this.c1(), null, 0, (zta)new b0((Object)l, (Object)ulh, (Object)u0, (f07)null, (byte)0), 3);
                }
            }
            if (b) {
                this.b0 = null;
                return;
            }
            this.X = null;
        }
    }
    
    public final void v1(final long n, final boolean b) {
        final llf l = this.L;
        if (l != null) {
            final wmm e0 = this.e0;
            if (e0 != null && ((bqc)e0).c()) {
                ((bqc)e0).g((CancellationException)null);
                rhc.G(this.c1(), null, 0, (zta)new c0((Object)e0, n, l, (f07)null, (byte)0), 3);
            }
            else {
                vlh vlh;
                if (b) {
                    vlh = this.b0;
                }
                else {
                    vlh = this.X;
                }
                if (vlh != null) {
                    rhc.G(this.c1(), null, 0, (zta)new d0(vlh, l, (f07)null), 3);
                }
            }
            if (b) {
                this.b0 = null;
                return;
            }
            this.X = null;
        }
    }
    
    public final void w1(final f8c f8c) {
        final llf l = this.L;
        if (l != null) {
            final vlh b0 = new vlh(f8c.b());
            final Object o = new Object();
            o1r.i((v98)this, (lta)new m40((b4j)o, (byte)3));
            if (((b4j)o).v == null) {
                if (!o35.a(this)) {
                    this.b0 = b0;
                    rhc.G(this.c1(), null, 0, (zta)new d0(l, b0, (f07)null, (byte)1), 3);
                    return;
                }
            }
            this.e0 = rhc.G(this.c1(), null, 0, (zta)new e0(l, b0, this, (f07)null, (byte)0), 3);
        }
    }
    
    public final void x1(final peh peh) {
        final llf l = this.L;
        if (l != null) {
            final vlh x = new vlh(peh.e());
            final Object o = new Object();
            o1r.i((v98)this, (lta)new m40((b4j)o, (byte)3));
            if (((b4j)o).v == null) {
                if (!o35.a(this)) {
                    this.X = x;
                    rhc.G(this.c1(), null, 0, (zta)new d0(l, x, (f07)null, (byte)2), 3);
                    return;
                }
            }
            this.e0 = rhc.G(this.c1(), null, 0, (zta)new e0(l, x, this, (f07)null, (byte)1), 3);
        }
    }
    
    public final void y1() {
        if (this.W == null) {
            a8c a8c;
            if (this.N) {
                a8c = this.T;
            }
            else {
                a8c = this.M;
            }
            if (a8c != null) {
                llf l;
                if ((l = this.L) == null) {
                    l = new llf();
                    this.L = l;
                }
                this.S.t1(l);
                final llf i = this.L;
                i.getClass();
                final t98 a = a8c.a(i);
                this.o1(a);
                this.W = a;
            }
        }
    }
    
    public void z1() {
    }
}
