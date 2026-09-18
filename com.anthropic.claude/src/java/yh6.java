import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnWindowFocusChangeListener;
import android.content.ComponentCallbacks2;

public final class yh6 implements ComponentCallbacks2, ViewTreeObserver$OnWindowFocusChangeListener
{
    public final zh6 v;
    
    public yh6(final zh6 v) {
        this.v = v;
    }
    
    public final void onConfigurationChanged(final Configuration configuration) {
        this.v.f(configuration);
    }
    
    public final void onLowMemory() {
        final zh6 v = this.v;
        v.g.a.clear();
        final umj h = v.h;
        synchronized (h) {
            h.a.c();
        }
    }
    
    public final void onTrimMemory(final int n) {
        final zh6 v = this.v;
        v.g.a.clear();
        final umj h = v.h;
        synchronized (h) {
            h.a.c();
        }
    }
    
    public final void onWindowFocusChanged(final boolean b) {
        this.v.t.c.setValue((Object)b);
    }
}
