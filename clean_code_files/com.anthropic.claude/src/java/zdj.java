import android.app.Application$ActivityLifecycleCallbacks;
import androidx.lifecycle.ProcessLifecycleOwner;
import android.os.Bundle;
import android.app.Activity;
import android.os.Build$VERSION;
import android.app.Fragment;

public class zdj extends Fragment
{
    public static final int w = 0;
    public jy7 v;
    
    public final void a(final rad rad) {
        if (Build$VERSION.SDK_INT < 29) {
            final Activity activity = this.getActivity();
            activity.getClass();
            xdj.a(activity, rad);
        }
    }
    
    public final void onActivityCreated(final Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a(rad.ON_CREATE);
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.a(rad.ON_DESTROY);
        this.v = null;
    }
    
    public final void onPause() {
        super.onPause();
        this.a(rad.ON_PAUSE);
    }
    
    public final void onResume() {
        super.onResume();
        final jy7 v = this.v;
        if (v != null) {
            ((ProcessLifecycleOwner)v.w).a();
        }
        this.a(rad.ON_RESUME);
    }
    
    public final void onStart() {
        super.onStart();
        final jy7 v = this.v;
        if (v != null) {
            final ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner)v.w;
            if (++processLifecycleOwner.v == 1 && processLifecycleOwner.y) {
                processLifecycleOwner.A.g(rad.ON_START);
                processLifecycleOwner.y = false;
            }
        }
        this.a(rad.ON_START);
    }
    
    public final void onStop() {
        super.onStop();
        this.a(rad.ON_STOP);
    }
    
    public static final class a implements Application$ActivityLifecycleCallbacks
    {
        public static final ydj Companion;
        
        static {
            Companion = (ydj)new Object();
        }
        
        public static final void registerIn(final Activity activity) {
            a.Companion.getClass();
            m6b.j(activity, new a());
        }
        
        public void onActivityCreated(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityDestroyed(final Activity activity) {
        }
        
        public void onActivityPaused(final Activity activity) {
        }
        
        public void onActivityPostCreated(final Activity activity, final Bundle bundle) {
            final int w = zdj.w;
            xdj.a(activity, rad.ON_CREATE);
        }
        
        public void onActivityPostResumed(final Activity activity) {
            final int w = zdj.w;
            xdj.a(activity, rad.ON_RESUME);
        }
        
        public void onActivityPostStarted(final Activity activity) {
            final int w = zdj.w;
            xdj.a(activity, rad.ON_START);
        }
        
        public void onActivityPreDestroyed(final Activity activity) {
            final int w = zdj.w;
            xdj.a(activity, rad.ON_DESTROY);
        }
        
        public void onActivityPrePaused(final Activity activity) {
            final int w = zdj.w;
            xdj.a(activity, rad.ON_PAUSE);
        }
        
        public void onActivityPreStopped(final Activity activity) {
            final int w = zdj.w;
            xdj.a(activity, rad.ON_STOP);
        }
        
        public void onActivityResumed(final Activity activity) {
        }
        
        public void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        }
        
        public void onActivityStarted(final Activity activity) {
        }
        
        public void onActivityStopped(final Activity activity) {
        }
    }
}
