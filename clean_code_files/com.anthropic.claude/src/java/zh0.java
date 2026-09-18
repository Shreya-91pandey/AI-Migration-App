import android.app.Application;
import android.app.job.JobParameters;
import java.util.List;
import android.view.DisplayCutout;
import android.os.Handler;
import android.os.Looper;

public abstract class zh0
{
    public static Handler a(final Looper looper) {
        return Handler.createAsync(looper);
    }
    
    public static Handler b(final Looper looper) {
        return Handler.createAsync(looper);
    }
    
    public static List c(final DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }
    
    public static void d(final JobParameters jobParameters) {
        jobParameters.getNetwork();
    }
    
    public static String e() {
        final String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }
    
    public static int f(final DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }
    
    public static int g(final DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }
    
    public static int h(final DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }
    
    public static int i(final DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
