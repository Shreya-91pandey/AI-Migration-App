import android.view.FocusFinder;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;

public abstract class jma
{
    public static final int[] a;
    public static final Rect b;
    
    static {
        a = new int[2];
        b = new Rect();
    }
    
    public static final k2j a(final View view, final View view2) {
        final int[] a = jma.a;
        view.getLocationInWindow(a);
        final int n = a[0];
        final int n2 = a[1];
        view2.getLocationInWindow(a);
        final int n3 = a[0];
        final int n4 = a[1];
        final float n5 = (float)(n - n3);
        final float n6 = (float)(n2 - n4);
        final Rect b = jma.b;
        view.getFocusedRect(b);
        final float n7 = n5 + b.left;
        return new k2j(n7, b.top + n6, b.width() + n7, n6 + b.top + b.height());
    }
    
    public static final boolean b(View nextFocusFromRect, final Integer n, final Rect rect) {
        if (n == null) {
            return nextFocusFromRect.requestFocus();
        }
        if (!(nextFocusFromRect instanceof ViewGroup)) {
            return nextFocusFromRect.requestFocus((int)n, rect);
        }
        final ViewGroup viewGroup = (ViewGroup)nextFocusFromRect;
        if (((View)viewGroup).isFocused()) {
            return true;
        }
        if (((View)viewGroup).isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus((int)n, rect);
        }
        if (nextFocusFromRect instanceof AndroidComposeView) {
            return ((AndroidComposeView)nextFocusFromRect).requestFocus((int)n, rect);
        }
        if (rect != null) {
            nextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, (int)n);
            if (nextFocusFromRect != null) {
                return nextFocusFromRect.requestFocus((int)n, rect);
            }
            return viewGroup.requestFocus((int)n, rect);
        }
        else {
            View focus;
            if (viewGroup.hasFocus()) {
                focus = viewGroup.findFocus();
            }
            else {
                focus = null;
            }
            final View nextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, focus, (int)n);
            if (nextFocus != null) {
                return nextFocus.requestFocus((int)n);
            }
            return nextFocusFromRect.requestFocus((int)n);
        }
    }
    
    public static final Integer c(final int n) {
        if (n == 5) {
            return 33;
        }
        if (n == 6) {
            return 130;
        }
        if (n == 3) {
            return 17;
        }
        if (n == 4) {
            return 66;
        }
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 1;
        }
        return null;
    }
    
    public static final sla d(final int n) {
        if (n == 1) {
            return new sla(2);
        }
        if (n == 2) {
            return new sla(1);
        }
        if (n == 17) {
            return new sla(3);
        }
        if (n == 33) {
            return new sla(5);
        }
        if (n == 66) {
            return new sla(4);
        }
        if (n != 130) {
            return null;
        }
        return new sla(6);
    }
}
