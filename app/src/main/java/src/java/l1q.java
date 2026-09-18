import android.view.View;
import android.os.Build$VERSION;
import android.view.animation.Interpolator;

public final class l1q
{
    public k1q a;
    
    public l1q(final int n, final Interpolator interpolator, final long n2) {
        if (Build$VERSION.SDK_INT >= 30) {
            this.a = new j1q(p4.l(n, interpolator, n2));
            return;
        }
        this.a = (k1q)new h1q(n, interpolator, n2);
    }
    
    public static void a(final View view, final g66 g66) {
        if (Build$VERSION.SDK_INT >= 30) {
            i1q i1q;
            if (g66 != null) {
                i1q = new i1q(g66);
            }
            else {
                i1q = null;
            }
            p4.u(view, i1q);
            return;
        }
        h1q.k(view, g66);
    }
}
