import android.view.inputmethod.EditorInfo;
import android.view.View;
import android.view.Window;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.accessibility.AccessibilityNodeInfo;
import android.os.ext.SdkExtensions;
import android.content.Context;

public abstract class r4
{
    public static String a(final Context context) {
        return context.getAttributionTag();
    }
    
    public static void b(final int n) {
        SdkExtensions.getExtensionVersion(n);
    }
    
    public static CharSequence c(final AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }
    
    public static Insets d(final DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }
    
    public static void e(final Window window, final boolean decorFitsSystemWindows) {
        window.setDecorFitsSystemWindows(decorFitsSystemWindows);
    }
    
    public static void f(final View view) {
        view.setImportantForContentCapture(1);
    }
    
    public static void g(final EditorInfo editorInfo, final CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
    
    public static void h(final AccessibilityNodeInfo accessibilityNodeInfo, final CharSequence stateDescription) {
        accessibilityNodeInfo.setStateDescription(stateDescription);
    }
}
