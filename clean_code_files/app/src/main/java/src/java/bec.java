import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Activity;
import android.graphics.Insets;
import android.view.contentcapture.ContentCaptureSession;
import android.view.View;
import android.os.Trace;

public abstract class bec
{
    public static void a(final int n, final String s) {
        Trace.beginAsyncSection(s, n);
    }
    
    public static void b(final int n, final String s) {
        Trace.endAsyncSection(s, n);
    }
    
    public static ContentCaptureSession c(final View view) {
        return view.getContentCaptureSession();
    }
    
    public static boolean d() {
        return Trace.isEnabled();
    }
    
    public static Insets e(final int n, final int n2, final int n3, final int n4) {
        return Insets.of(n, n2, n3, n4);
    }
    
    public static final void f(final Activity activity, final lqh.lqh$a l89) {
        activity.registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)l89);
    }
}
