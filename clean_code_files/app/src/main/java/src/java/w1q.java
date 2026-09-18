import android.view.View;
import android.view.WindowInsets;

public class w1q extends v1q
{
    public dec s;
    
    public w1q(final h2q h2q, final WindowInsets windowInsets) {
        super(h2q, windowInsets);
        this.s = null;
    }
    
    public w1q(final h2q h2q, final w1q w1q) {
        super(h2q, w1q);
        this.s = null;
        this.s = w1q.s;
    }
    
    @Override
    public h2q b() {
        return h2q.c(super.c.consumeStableInsets(), null);
    }
    
    @Override
    public h2q c() {
        return h2q.c(super.c.consumeSystemWindowInsets(), null);
    }
    
    @Override
    public final dec l() {
        dec s;
        if ((s = this.s) == null) {
            final WindowInsets c = super.c;
            s = dec.c(c.getStableInsetLeft(), c.getStableInsetTop(), c.getStableInsetRight(), c.getStableInsetBottom());
            this.s = s;
        }
        return s;
    }
    
    @Override
    public boolean s() {
        return super.c.isConsumed();
    }
    
    @Override
    public void z(final dec s) {
        this.s = s;
    }
}
