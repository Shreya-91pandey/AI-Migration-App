import android.os.Bundle;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import java.util.Collections;
import java.util.List;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.View$AccessibilityDelegate;

public final class v3 extends View$AccessibilityDelegate
{
    public final w3 a;
    
    public v3(final w3 a) {
        this.a = a;
    }
    
    public final boolean dispatchPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.a(view, accessibilityEvent);
    }
    
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(final View view) {
        final jy7 b = this.a.b(view);
        if (b != null) {
            return (AccessibilityNodeProvider)b.w;
        }
        return null;
    }
    
    public final void onInitializeAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }
    
    public final void onInitializeAccessibilityNodeInfo(final View view, final AccessibilityNodeInfo accessibilityNodeInfo) {
        final x4 x4 = new x4(accessibilityNodeInfo);
        final WeakHashMap a = gap.a;
        final int n = 0;
        final Boolean b = (Boolean)new s9p((byte)0).a(view);
        final boolean b2 = b != null && b;
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            k4.n(accessibilityNodeInfo, b2);
        }
        else {
            x4.g(1, b2);
        }
        final Boolean b3 = (Boolean)new s9p((byte)3).a(view);
        final boolean b4 = b3 != null && b3;
        if (sdk_INT >= 28) {
            l4.r(accessibilityNodeInfo, b4);
        }
        else {
            x4.g(2, b4);
        }
        final CharSequence charSequence = (CharSequence)new s9p((byte)1).a(view);
        if (sdk_INT >= 28) {
            k4.m(accessibilityNodeInfo, charSequence);
        }
        else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        final CharSequence charSequence2 = (CharSequence)new s9p((byte)2).a(view);
        if (sdk_INT >= 30) {
            r4.h(accessibilityNodeInfo, charSequence2);
        }
        else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.a.d(view, x4);
        accessibilityNodeInfo.getText();
        final List list = (List)view.getTag(2131297090);
        int i = n;
        List empty_LIST = list;
        if (list == null) {
            empty_LIST = Collections.EMPTY_LIST;
            i = n;
        }
        while (i < empty_LIST.size()) {
            x4.b((q4)empty_LIST.get(i));
            ++i;
        }
    }
    
    public final void onPopulateAccessibilityEvent(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.e(view, accessibilityEvent);
    }
    
    public final boolean onRequestSendAccessibilityEvent(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
        return this.a.f(viewGroup, view, accessibilityEvent);
    }
    
    public final boolean performAccessibilityAction(final View view, final int n, final Bundle bundle) {
        return this.a.g(view, n, bundle);
    }
    
    public final void sendAccessibilityEvent(final View view, final int n) {
        this.a.h(view, n);
    }
    
    public final void sendAccessibilityEventUnchecked(final View view, final AccessibilityEvent accessibilityEvent) {
        this.a.i(view, accessibilityEvent);
    }
}
