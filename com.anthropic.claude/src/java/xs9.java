import java.io.IOException;
import android.content.Context;

public final class xs9
{
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    
    public xs9(final Context c, final String d, final qd6 e, final boolean a, final boolean b) {
        this.c = c;
        this.d = d;
        this.e = e;
        this.a = a;
        this.b = b;
    }
    
    public xs9(final dti c, final at9 d, final zs9 e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static IOException a(final xs9 xs9, final long n, final boolean b, final boolean b2, final IOException ex, final int n2) {
        final boolean b3 = (n2 & 0x4) == 0x0;
        boolean b4 = b2;
        if ((n2 & 0x8) != 0x0) {
            b4 = false;
        }
        if (ex != null) {
            xs9.f(ex);
        }
        if (b4) {
            final gn9 z = ((dti)xs9.c).z;
            if (ex != null) {
                z.o((dti)xs9.c, ex);
            }
            else {
                z.m((dti)xs9.c, n);
            }
        }
        if (b3) {
            final gn9 z2 = ((dti)xs9.c).z;
            if (ex != null) {
                z2.t((dti)xs9.c, ex);
            }
            else {
                z2.r((dti)xs9.c, n);
            }
        }
        return ((dti)xs9.c).g(xs9, b4 && !b, b3 && !b, b3 && b, b4 && b, ex);
    }
    
    public vs9 b(final sej sej, final boolean a) {
        this.a = a;
        final xej d = sej.d;
        d.getClass();
        final long a2 = d.a();
        ((dti)this.c).z.n((dti)this.c);
        return new vs9(this, ((zs9)this.e).f(sej, a2), a2, false);
    }
    
    public eti c() {
        final ys9 k = ((zs9)this.e).k();
        eti eti;
        if (k instanceof eti) {
            eti = (eti)k;
        }
        else {
            eti = null;
        }
        if (eti != null) {
            return eti;
        }
        en9.q("no connection for CONNECT tunnels");
        return null;
    }
    
    public bui d(snj ex) {
        try {
            String a;
            if ((a = ((snj)ex).A.a("Content-Type")) == null) {
                a = null;
            }
            final long e = ((zs9)this.e).e((snj)ex);
            final nam a2 = ((zs9)this.e).a((snj)ex);
            ex = new(ws9.class)();
            try {
                new ws9(this, a2, e, false);
                ex = (IOException)new bui(a, e, new zsi((nam)ex));
                return (bui)ex;
            }
            catch (final IOException ex2) {}
        }
        catch (final IOException ex) {}
        ((dti)this.c).z.t((dti)this.c, ex);
        this.f(ex);
        throw ex;
    }
    
    public qnj e(final boolean b) {
        Label_0031: {
            qnj g;
            try {
                g = ((zs9)this.e).g(b);
                if (g != null) {
                    g.n = this;
                    return g;
                }
            }
            catch (final IOException ex) {
                break Label_0031;
            }
            return g;
        }
        final IOException ex;
        ((dti)this.c).z.t((dti)this.c, ex);
        this.f(ex);
        throw ex;
    }
    
    public void f(final IOException ex) {
        this.b = true;
        ((zs9)this.e).k().g((dti)this.c, ex);
    }
    
    public pp7 g() {
        final dti dti = (dti)this.c;
        if (dti.F) {
            en9.q("Check failed.");
            return null;
        }
        dti.F = true;
        ((pb1)dti.A).l();
        final dti dti2;
        monitorenter(dti2 = dti);
        Label_0180: {
            try {
                if (dti.N == null) {
                    throw new IllegalStateException("Check failed.");
                }
                if (dti.J || dti.K) {
                    throw new IllegalStateException("Check failed.");
                }
                if (dti.H) {
                    throw new IllegalStateException("Check failed.");
                }
                if (dti.I) {
                    dti.I = false;
                    dti.J = true;
                    dti.K = true;
                    monitorexit(dti2);
                    final ys9 k = ((zs9)this.e).k();
                    k.getClass();
                    final eti eti = (eti)k;
                    eti.e.setSoTimeout(0);
                    eti.f();
                    return new pp7(this);
                }
            }
            finally {
                break Label_0180;
            }
            throw new IllegalStateException("Check failed.");
        }
        monitorexit(dti2);
    }
    
    public void h(final sej sej) {
        try {
            ((dti)this.c).z.q((dti)this.c);
            ((zs9)this.e).b(sej);
            ((dti)this.c).z.p((dti)this.c);
        }
        catch (final IOException ex) {
            ((dti)this.c).z.o((dti)this.c, ex);
            this.f(ex);
            throw ex;
        }
    }
}
