import android.os.Build$VERSION;
import android.view.View;
import android.view.Window;

public class n19
{
    public void a(final Window window) {
    }
    
    public void b(final w7n w7n, final w7n w7n2, final Window window, final View view, final boolean b, final boolean b2) {
        c5q.L(window, false);
        int statusBarColor;
        if (b) {
            statusBarColor = w7n.b;
        }
        else {
            statusBarColor = w7n.a;
        }
        window.setStatusBarColor(statusBarColor);
        int navigationBarColor;
        if (b2) {
            navigationBarColor = w7n2.b;
        }
        else {
            navigationBarColor = w7n2.a;
        }
        window.setNavigationBarColor(navigationBarColor);
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
