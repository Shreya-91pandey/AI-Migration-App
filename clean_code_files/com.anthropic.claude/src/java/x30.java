import android.content.Context;
import android.view.accessibility.AccessibilityManager;

public final class x30 implements i4
{
    public final AccessibilityManager a;
    
    public x30(final Context context) {
        final Object systemService = context.getSystemService("accessibility");
        systemService.getClass();
        this.a = (AccessibilityManager)systemService;
    }
}
