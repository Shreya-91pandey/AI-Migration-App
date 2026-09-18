import java.lang.ref.Reference;
import android.os.BaseBundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import java.util.Collections;
import java.util.List;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

public class w3
{
    public static final View$AccessibilityDelegate x;
    public final View$AccessibilityDelegate v;
    public final v3 w;
    
    static {
        x = new View$AccessibilityDelegate();
    }
    
    public w3() {
        this(w3.x);
    }
    
    public w3(final View$AccessibilityDelegate v) {
        this.v = v;
        this.w = new v3(this);
    }
    
    public boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.v.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public jy7 b(final View view) {
        final AccessibilityNodeProvider accessibilityNodeProvider = this.v.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new jy7((Object)accessibilityNodeProvider, (byte)3);
        }
        return null;
    }
    
    public void c(final View view, final AccessibilityEvent accessibilityEvent) {
        this.v.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
    
    public void d(final View view, final x4 x4) {
        this.v.onInitializeAccessibilityNodeInfo(view, x4.a);
    }
    
    public void e(final View view, final AccessibilityEvent accessibilityEvent) {
        this.v.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }
    
    public boolean f(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.v.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }
    
    public boolean g(final View view, int int1, final Bundle bundle) {
        List empty_LIST;
        if ((empty_LIST = (List)view.getTag(2131297090)) == null) {
            empty_LIST = Collections.EMPTY_LIST;
        }
        for (int n = 0; n < empty_LIST.size() && ((AccessibilityNodeInfo$AccessibilityAction)((q4)empty_LIST.get(n)).a).getId() != int1; ++n) {}
        final boolean performAccessibilityAction = this.v.performAccessibilityAction(view, int1, bundle);
        if (!performAccessibilityAction && int1 == 2131296262 && bundle != null) {
            int1 = ((BaseBundle)bundle).getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            final SparseArray sparseArray = (SparseArray)view.getTag(2131297091);
            if (sparseArray != null) {
                final WeakReference weakReference = (WeakReference)sparseArray.get(int1);
                if (weakReference != null) {
                    final ClickableSpan clickableSpan = (ClickableSpan)((Reference)weakReference).get();
                    if (clickableSpan != null) {
                        final CharSequence text = view.createAccessibilityNodeInfo().getText();
                        ClickableSpan[] array;
                        if (text instanceof Spanned) {
                            array = (ClickableSpan[])((Spanned)text).getSpans(0, text.length(), (Class)ClickableSpan.class);
                        }
                        else {
                            array = null;
                        }
                        for (int1 = 0; array != null && int1 < array.length; ++int1) {
                            if (clickableSpan.equals(array[int1])) {
                                clickableSpan.onClick(view);
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return performAccessibilityAction;
    }
    
    public void h(final View view, final int n) {
        this.v.sendAccessibilityEvent(view, n);
    }
    
    public void i(final View view, final AccessibilityEvent accessibilityEvent) {
        this.v.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
