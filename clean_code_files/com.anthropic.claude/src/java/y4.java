import java.util.List;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;

public final class y4 extends AccessibilityNodeProvider
{
    public final jy7 a;
    
    public y4(final jy7 a) {
        this.a = a;
    }
    
    public final void addExtraDataToAccessibilityNodeInfo(final int n, final AccessibilityNodeInfo accessibilityNodeInfo, final String s, final Bundle bundle) {
        this.a.j(n, new x4(accessibilityNodeInfo), s, bundle);
    }
    
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(final int n) {
        final x4 o = this.a.o(n);
        if (o == null) {
            return null;
        }
        return o.a;
    }
    
    public final List findAccessibilityNodeInfosByText(final String s, final int n) {
        return null;
    }
    
    public final AccessibilityNodeInfo findFocus(final int n) {
        final x4 r = this.a.r(n);
        if (r == null) {
            return null;
        }
        return r.a;
    }
    
    public final boolean performAction(final int n, final int n2, final Bundle bundle) {
        return this.a.y(n, n2, bundle);
    }
}
