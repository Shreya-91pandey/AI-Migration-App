import android.app.FragmentManager;
import android.app.Fragment;
import android.os.Build$VERSION;
import android.app.Activity;

public abstract class xdj
{
    public static void a(final Activity activity, final rad rad) {
        if (activity instanceof gbd) {
            final vad d = ((gbd)activity).d();
            if (d instanceof jbd) {
                ((jbd)d).g(rad);
            }
        }
    }
    
    public static void b(final Activity activity) {
        if (Build$VERSION.SDK_INT >= 29) {
            zdj.a.Companion.getClass();
            m6b.j(activity, new zdj.a());
        }
        final FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add((Fragment)new zdj(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
