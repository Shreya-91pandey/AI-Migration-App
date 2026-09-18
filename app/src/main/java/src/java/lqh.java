import android.os.Handler;
import android.app.Fragment;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.Activity;
import androidx.lifecycle.ProcessLifecycleOwner;

public final class lqh extends l89
{
    final ProcessLifecycleOwner this$0;
    
    public lqh(final ProcessLifecycleOwner this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onActivityCreated(final Activity activity, final Bundle bundle) {
        if (Build$VERSION.SDK_INT < 29) {
            final int w = zdj.w;
            final Fragment fragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            fragmentByTag.getClass();
            ((zdj)fragmentByTag).v = this.this$0.C;
        }
    }
    
    @Override
    public void onActivityPaused(final Activity activity) {
        final ProcessLifecycleOwner this$0 = this.this$0;
        final int w = this$0.w - 1;
        this$0.w = w;
        if (w == 0) {
            final Handler z = this$0.z;
            z.getClass();
            z.postDelayed((Runnable)this$0.B, 700L);
        }
    }
    
    public void onActivityPreCreated(final Activity activity, final Bundle bundle) {
        bec.f(activity, new l89(this.this$0) {
            final ProcessLifecycleOwner this$0;
            
            public void onActivityPostResumed(final Activity activity) {
                this.this$0.a();
            }
            
            public void onActivityPostStarted(final Activity activity) {
                final ProcessLifecycleOwner this$0 = this.this$0;
                final int v = this$0.v + 1;
                this$0.v = v;
                if (v == 1 && this$0.y) {
                    this$0.A.g(rad.ON_START);
                    this$0.y = false;
                }
            }
        });
    }
    
    @Override
    public void onActivityStopped(final Activity activity) {
        final ProcessLifecycleOwner this$0 = this.this$0;
        final int v = this$0.v - 1;
        this$0.v = v;
        if (v == 0 && this$0.x) {
            this$0.A.g(rad.ON_STOP);
            this$0.y = true;
        }
    }
}
