import android.os.Build$VERSION;
import android.view.View;
import android.view.Window;

public class p19 extends o19
{
    @Override
    public void b(final w7n w7n, final w7n w7n2, final Window window, final View view, final boolean b, final boolean b2) {
        boolean b3 = false;
        c5q.L(window, false);
        window.setStatusBarColor(w7n.a(b));
        window.setNavigationBarColor(w7n2.a(b2));
        zp6.r(window);
        if (w7n2.c == 0) {
            b3 = true;
        }
        d40.o(window, b3);
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o;
        if (sdk_INT >= 35) {
            o = new j2q(window);
        }
        else if (sdk_INT >= 30) {
            o = new j2q(window);
        }
        else {
            o = new i2q(window);
        }
        ((ljq)o).Y(b ^ true);
        ((ljq)o).X(b2 ^ true);
    }
}
