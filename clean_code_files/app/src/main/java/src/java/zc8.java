import android.graphics.Rect;
import android.view.WindowManager;
import android.content.Context;
import android.app.Activity;

public final class zc8 implements yc8, v2q
{
    public static final zc8 v;
    public static final zc8 w;
    
    @Override
    public r2q a(final Activity activity, final yc8 yc8) {
        return jj2.w.a(activity, yc8);
    }
    
    @Override
    public r2q c(final Context context, final yc8 yc8) {
        WindowManager windowManager;
        if (context.isUiContext()) {
            windowManager = (WindowManager)context.getSystemService((Class)WindowManager.class);
        }
        else {
            windowManager = (WindowManager)context.getApplicationContext().getSystemService((Class)WindowManager.class);
        }
        final Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        bounds.getClass();
        return new r2q(bounds, windowManager.getCurrentWindowMetrics().getDensity());
    }
    
    @Override
    public float l(final Context context) {
        return ((WindowManager)context.getSystemService((Class)WindowManager.class)).getCurrentWindowMetrics().getDensity();
    }
}
