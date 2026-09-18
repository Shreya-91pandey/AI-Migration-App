import android.os.Build$VERSION;
import android.graphics.Rect;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import android.view.WindowInsets;

public abstract class w9p
{
    public static void a(final WindowInsets windowInsets, final View view) {
        final View$OnApplyWindowInsetsListener view$OnApplyWindowInsetsListener = (View$OnApplyWindowInsetsListener)view.getTag(2131297104);
        if (view$OnApplyWindowInsetsListener != null) {
            view$OnApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }
    
    public static h2q b(final View view, final h2q h2q, final Rect rect) {
        final WindowInsets b = h2q.b();
        if (b != null) {
            return h2q.c(view.computeSystemWindowInsets(b, rect), view);
        }
        rect.setEmpty();
        return h2q;
    }
    
    public static void c(final View view, final u7g u7g) {
        Object onApplyWindowInsetsListener;
        if (u7g != null) {
            onApplyWindowInsetsListener = new v9p();
        }
        else {
            onApplyWindowInsetsListener = null;
        }
        if (Build$VERSION.SDK_INT < 30) {
            view.setTag(2131297095, onApplyWindowInsetsListener);
        }
        if (view.getTag(2131297094) != null) {
            return;
        }
        if (onApplyWindowInsetsListener != null) {
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)onApplyWindowInsetsListener);
            return;
        }
        view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)view.getTag(2131297104));
    }
}
