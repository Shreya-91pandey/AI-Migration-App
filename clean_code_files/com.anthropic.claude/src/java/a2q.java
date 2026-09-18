import android.view.WindowInsets;
import android.view.View;

public class a2q extends y1q
{
    public static final h2q w;
    
    static {
        w = h2q.c(z1q.c(), null);
    }
    
    public a2q(final h2q h2q, final a2q a2q) {
        super(h2q, a2q);
    }
    
    public a2q(final h2q h2q, final WindowInsets windowInsets) {
        super(h2q, windowInsets);
    }
    
    @Override
    public final void d(final View view) {
    }
    
    @Override
    public dec i(final int n) {
        return dec.d(z1q.h(super.c, f2q.a(n)));
    }
    
    @Override
    public dec j(final int n) {
        return dec.d(z1q.b(super.c, f2q.a(n)));
    }
    
    @Override
    public boolean u(final int n) {
        return z1q.f(super.c, f2q.a(n));
    }
}
