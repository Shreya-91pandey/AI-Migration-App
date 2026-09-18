import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;

public class o1q extends u1q
{
    public final WindowInsets$Builder e;
    
    public o1q() {
        this.e = m6b.f();
    }
    
    public o1q(final h2q h2q) {
        super(h2q);
        final WindowInsets b = h2q.b();
        WindowInsets$Builder e;
        if (b != null) {
            e = n1q.c(b);
        }
        else {
            e = m6b.f();
        }
        this.e = e;
    }
    
    @Override
    public h2q b() {
        this.a();
        final h2q c = h2q.c(m6b.g(this.e), null);
        final dec[] b = super.b;
        final e2q a = c.a;
        a.w(b);
        a.v(null);
        a.B(super.c);
        a.C(super.d);
        return c;
    }
    
    @Override
    public void e(final dec dec) {
        ipe.z(this.e, dec.e());
    }
    
    @Override
    public void f(final dec dec) {
        ipe.l(this.e, dec.e());
    }
    
    @Override
    public void g(final dec dec) {
        ipe.w(this.e, dec.e());
    }
    
    @Override
    public void h(final dec dec) {
        ipe.s(this.e, dec.e());
    }
    
    @Override
    public void i(final dec dec) {
        n1q.j(this.e, dec.e());
    }
}
