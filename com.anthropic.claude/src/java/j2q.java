import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public class j2q extends ljq
{
    public final WindowInsetsController d;
    public final Window e;
    
    public j2q(final Window e) {
        final WindowInsetsController d = z1q.d(e);
        this.d = d;
        this.e = e;
    }
    
    public boolean L() {
        final Window e = this.e;
        if (e != null) {
            if ((e.getDecorView().getSystemUiVisibility() & 0x2000) == 0x0) {
                return false;
            }
        }
        else {
            gsp.f(this.d);
            if ((gsp.b(this.d) & 0x8) == 0x0) {
                return false;
            }
        }
        return true;
    }
    
    public void X(final boolean b) {
        this.d0(16, 16, b);
    }
    
    public void Y(final boolean b) {
        this.d0(8192, 8, b);
    }
    
    public final void d0(final int n, final int n2, final boolean b) {
        final Window e = this.e;
        if (e != null) {
            if (b) {
                final View decorView = e.getDecorView();
                decorView.setSystemUiVisibility(n | decorView.getSystemUiVisibility());
                return;
            }
            final View decorView2 = e.getDecorView();
            decorView2.setSystemUiVisibility(~n & decorView2.getSystemUiVisibility());
        }
        else {
            final WindowInsetsController d = this.d;
            if (b) {
                gsp.h(d, n2, n2);
                return;
            }
            gsp.g(d, n2);
        }
    }
}
