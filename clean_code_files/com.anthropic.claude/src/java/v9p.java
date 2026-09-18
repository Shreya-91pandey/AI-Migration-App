import java.util.WeakHashMap;
import android.os.Build$VERSION;
import android.view.WindowInsets;
import android.view.View;
import android.view.View$OnApplyWindowInsetsListener;

public final class v9p implements View$OnApplyWindowInsetsListener
{
    public h2q a;
    public final View b;
    public final u7g c;
    
    public v9p(final View b, final u7g c) {
        this.b = b;
        this.c = c;
        this.a = null;
    }
    
    public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
        final h2q c = h2q.c(windowInsets, view);
        final int sdk_INT = Build$VERSION.SDK_INT;
        final u7g c2 = this.c;
        if (sdk_INT < 30) {
            w9p.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return c2.j(view, c).b();
            }
        }
        this.a = c;
        final h2q j = c2.j(view, c);
        if (sdk_INT >= 30) {
            return j.b();
        }
        final WeakHashMap a = gap.a;
        view.requestApplyInsets();
        return j.b();
    }
}
