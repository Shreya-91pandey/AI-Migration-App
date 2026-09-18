import java.util.concurrent.CancellationException;

public final class mh6 extends ko1
{
    public final oc7 c;
    public zta d;
    public mn2 e;
    public wmm f;
    public boolean g;
    
    public mh6(final oc7 c, final zih zih) {
        super(zih);
        this.c = c;
        this.d = new sq0(2, null, (byte)1);
    }
    
    @Override
    public final void c() {
        final mn2 e = this.e;
        if (e != null) {
            e.f((Throwable)new CancellationException("onBack cancelled"), true);
        }
        final wmm f = this.f;
        if (f != null) {
            ((bqc)f).g((CancellationException)null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }
    
    @Override
    public final void d() {
        if (this.e != null && !this.g) {
            this.c();
        }
        if (this.e == null) {
            this.g = false;
            this.e = ao2.c(-2, 1, 4);
            this.f = rhc.G(this.c, null, 0, (zta)new mu5(this, (f07)null), 3);
        }
        final mn2 e = this.e;
        if (e != null) {
            o1r.b((stk)e);
        }
        this.g = false;
    }
    
    @Override
    public final void e(final go1 go1) {
        final mn2 e = this.e;
        if (e != null) {
            ((stk)e).e((Object)go1);
        }
    }
    
    @Override
    public final void f() {
        this.c();
        if (super.b()) {
            this.g = true;
            this.e = ao2.c(-2, 1, 4);
            this.f = rhc.G(this.c, null, 0, (zta)new mu5(this, (f07)null), 3);
        }
    }
    
    public final void l(final boolean b) {
        if (!b && super.b()) {
            final wmm f = this.f;
            if (f != null && !((bqc)f).c()) {
                this.c();
            }
        }
        ((jo1)super.a).f(b);
        ((io1)super.b).f(b);
    }
}
