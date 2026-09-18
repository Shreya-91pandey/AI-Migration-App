import android.content.SharedPreferences$Editor;
import androidx.lifecycle.DefaultLifecycleObserver;

public final class dy4 implements DefaultLifecycleObserver
{
    public final rr0 v;
    public final m5b w;
    
    public dy4(final f60 f60, final rr0 v, final m5b w) {
        this.v = v;
        this.w = w;
    }
    
    public final void onCreate(final gbd gbd) {
        final rr0 v = this.v;
        final hsg b = v.b;
        final int n = b.h() + 1;
        b.i(n);
        final SharedPreferences$Editor edit = v.a.edit();
        edit.getClass();
        edit.putInt("creation_count", n);
        edit.apply();
    }
    
    public final void onResume(final gbd gbd) {
        final long currentTimeMillis = System.currentTimeMillis();
        final rr0 v = this.v;
        v.c.setValue((Object)currentTimeMillis);
        final SharedPreferences$Editor edit = v.a.edit();
        edit.getClass();
        edit.putLong("last_resumed_at", currentTimeMillis);
        edit.apply();
        final m5b w = this.w;
        if (w.c) {
            final et0 a = w.a;
            final o68 a2 = vo8.a;
            rhc.G((oc7)a, (hc7)d58.w, 0, (zta)new pn((byte)18, (f07)null, (Object)w), 2);
        }
    }
}
