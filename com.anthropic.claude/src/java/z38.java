import android.net.Uri;
import android.os.Handler;
import android.database.ContentObserver;

public final class z38 extends ContentObserver
{
    public final byte a;
    public final Object b;
    
    public void onChange(final boolean b) {
        switch (this.a) {
            default: {
                super.onChange(b);
                return;
            }
            case 0: {
                final int l = ((a48)this.b).v.l();
                if (l != Integer.MIN_VALUE) {
                    final float n = k8e.H(l / 255.0f * 10.0f) / 10.0f;
                    final a48 a48 = (a48)this.b;
                    a48.x.getClass();
                    a48.x = new hp8(Float.valueOf(n));
                }
            }
        }
    }
    
    public void onChange(final boolean b, final Uri uri) {
        switch (this.a) {
            default: {
                super.onChange(b, uri);
                return;
            }
            case 1: {
                ((stk)this.b).e((Object)lqo.a);
            }
        }
    }
}
