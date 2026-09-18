import java.util.Iterator;
import android.view.View;
import java.util.Map$Entry;
import android.os.Build$VERSION;
import java.util.WeakHashMap;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public final class t9p implements ViewTreeObserver$OnGlobalLayoutListener, View$OnAttachStateChangeListener
{
    public final WeakHashMap v;
    
    public t9p() {
        this.v = new WeakHashMap();
    }
    
    public final void onGlobalLayout() {
        if (Build$VERSION.SDK_INT < 28) {
            for (final Map$Entry map$Entry : this.v.entrySet()) {
                final View view = (View)map$Entry.getKey();
                final boolean booleanValue = (boolean)map$Entry.getValue();
                int n;
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if ((booleanValue ? 1 : 0) != n) {
                    int n2;
                    if (n != 0) {
                        n2 = 16;
                    }
                    else {
                        n2 = 32;
                    }
                    gap.e(view, n2);
                    map$Entry.setValue((Object)(boolean)(n != 0));
                }
            }
        }
    }
    
    public final void onViewAttachedToWindow(final View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
}
