import android.view.View;
import android.view.WindowInsets;

public class y1q extends x1q
{
    public dec t;
    public dec u;
    public dec v;
    
    public y1q(final h2q h2q, final WindowInsets windowInsets) {
        super(h2q, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }
    
    public y1q(final h2q h2q, final y1q y1q) {
        super(h2q, y1q);
        this.t = null;
        this.u = null;
        this.v = null;
    }
    
    @Override
    public dec k() {
        dec u;
        if ((u = this.u) == null) {
            u = dec.d(n1q.k(super.c));
            this.u = u;
        }
        return u;
    }
    
    @Override
    public dec m() {
        dec t;
        if ((t = this.t) == null) {
            t = dec.d(n1q.l(super.c));
            this.t = t;
        }
        return t;
    }
    
    @Override
    public dec o() {
        dec v;
        if ((v = this.v) == null) {
            v = dec.d(n1q.b(super.c));
            this.v = v;
        }
        return v;
    }
    
    @Override
    public h2q r(final int n, final int n2, final int n3, final int n4) {
        return h2q.c(n1q.d(super.c, n, n2, n3, n4), null);
    }
    
    @Override
    public void z(final dec dec) {
    }
}
