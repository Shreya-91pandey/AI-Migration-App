import android.view.WindowInsets;
import android.view.View;

public class c2q extends b2q
{
    public static final h2q x;
    
    static {
        x = h2q.c(z1q.c(), null);
    }
    
    public c2q(final h2q h2q, final WindowInsets windowInsets) {
        super(h2q, windowInsets);
    }
    
    public c2q(final h2q h2q, final c2q c2q) {
        super(h2q, c2q);
    }
    
    @Override
    public dec i(final int n) {
        return dec.d(z1q.h(super.c, g2q.a(n)));
    }
    
    @Override
    public dec j(final int n) {
        return dec.d(z1q.b(super.c, g2q.a(n)));
    }
    
    @Override
    public void p(final View view) {
    }
    
    @Override
    public boolean u(final int n) {
        return z1q.f(super.c, g2q.a(n));
    }
}
