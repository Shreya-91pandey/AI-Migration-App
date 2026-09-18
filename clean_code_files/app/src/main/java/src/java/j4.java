import android.view.accessibility.AccessibilityManager;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;

public abstract class j4
{
    public static AccessibilityNodeInfo$AccessibilityAction a() {
        return AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }
    
    public static void b(final AccessibilityNodeInfo accessibilityNodeInfo, final Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }
    
    public static CharSequence c(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }
    
    public static boolean d(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }
    
    public static boolean e(final AccessibilityManager accessibilityManager) {
        return accessibilityManager.isRequestFromAccessibilityTool();
    }
    
    public static void f(final AccessibilityNodeInfo accessibilityNodeInfo, final boolean accessibilityDataSensitive) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(accessibilityDataSensitive);
    }
}
