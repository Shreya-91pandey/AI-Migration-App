import java.util.concurrent.ExecutorService;
import android.util.Log;
import java.util.concurrent.Executors;
import com.anthropic.claude.types.environment.AppEnvironment;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

public final class txl implements Application$ActivityLifecycleCallbacks
{
    public final xxl v;
    
    public txl(final xxl v) {
        this.v = v;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        final xxl v = this.v;
        final xxl xxl;
        monitorenter(xxl = v);
        Label_0074: {
            try {
                if (!v.b) {
                    monitorexit(xxl);
                    return;
                }
                final int ordinal = ((Enum)v.a.a()).ordinal();
                if (ordinal == 0) {
                    break Label_0074;
                }
                if (ordinal != 1 && ordinal != 2) {
                    throw new RuntimeException();
                }
                break Label_0074;
            }
            finally {
                monitorexit(xxl);
                Object o = vxl.a;
            Label_0148:
                while (true) {
                    Label_0085: {
                        break Label_0085;
                        sxl.g = Executors.newSingleThreadScheduledExecutor();
                        break Label_0148;
                        o = uxl.a;
                    }
                    sxl.a(activity, new rxl(((wxl)o).a(), ((wxl)o).b(), true));
                    iftrue(Label_0148:)(sxl.g != null && (sxl.g == null || !((ExecutorService)sxl.g).isShutdown()));
                    continue;
                }
                ((ExecutorService)sxl.g).submit((Runnable)new v69((byte)1));
                monitorexit(xxl);
            }
        }
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
        final xxl v = this.v;
        synchronized (v) {
            if (!v.b) {
                return;
            }
            final byl b = sxl.b;
            if (b != null) {
                ((xzj)b.x).g((Runnable)new zxl((Object)b, (byte)0));
            }
            final qr0 d = sxl.d;
            if (d != null) {
                d.a();
            }
        }
    }
    
    public final void onActivityResumed(final Activity activity) {
        final xxl v = this.v;
        synchronized (v) {
            if (!v.b) {
                return;
            }
            final qr0 d = sxl.d;
            if (d != null) {
                try {
                    if (!d.a.j().d && d.f != null && !d.j) {
                        d.c();
                    }
                }
                catch (final Exception ex) {
                    Log.e("qr0", ex.toString());
                }
                d.c = activity.getClass().getSimpleName();
            }
        }
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
