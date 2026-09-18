import android.view.WindowInsets;
import android.view.View;

public abstract class x9p
{
    public static h2q a(View rootView) {
        final WindowInsets rootWindowInsets = rootView.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        final h2q c = h2q.c(rootWindowInsets, null);
        final e2q a = c.a;
        a.y(c);
        rootView = rootView.getRootView();
        a.d(rootView);
        a.p(rootView);
        a.q();
        return c;
    }
}
