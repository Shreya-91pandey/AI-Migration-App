import java.lang.ref.Reference;
import android.os.Bundle;
import android.app.Activity;
import java.lang.ref.WeakReference;
import android.app.Application;
import android.content.Context;
import android.app.Application$ActivityLifecycleCallbacks;

public final class fb0 implements Application$ActivityLifecycleCallbacks
{
    public final double v;
    public final gb0 w;
    
    public fb0(final gb0 w, final oti oti) {
        this.w = w;
        final lti a = oti.a;
        final o3a a2 = r2c.a;
        Object o;
        if ((o = a.b.n.a.get((Object)r2c.d)) == null) {
            o = 1.0;
        }
        this.v = ((Number)o).doubleValue();
    }
    
    public final void a(Context applicationContext) {
        final double v = this.v;
        if (v != 1.0) {
            applicationContext = applicationContext.getApplicationContext();
            applicationContext.getClass();
            ((Application)applicationContext).registerActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
            final gb0 w = this.w;
            final oti oti = (oti)((Reference)w.w).get();
            if (oti == null) {
                w.e();
                return;
            }
            final sti c = oti.c();
            if (c != null) {
                final Object c2 = c.c;
                synchronized (c2) {
                    final long a = c.a.a;
                    monitorexit(c2);
                    c.c((long)(v * a));
                }
            }
        }
    }
    
    public final void b(Context applicationContext) {
        if (this.v != 1.0) {
            applicationContext = applicationContext.getApplicationContext();
            applicationContext.getClass();
            ((Application)applicationContext).unregisterActivityLifecycleCallbacks((Application$ActivityLifecycleCallbacks)this);
            final gb0 w = this.w;
            final oti oti = (oti)((Reference)w.w).get();
            if (oti == null) {
                w.e();
                return;
            }
            final sti c = oti.c();
            if (c != null) {
                final Object c2 = c.c;
                synchronized (c2) {
                    final long a = c.a.a;
                    monitorexit(c2);
                    c.c(a);
                }
            }
        }
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        this.b((Context)activity);
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
