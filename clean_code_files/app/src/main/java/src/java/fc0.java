import java.util.ArrayList;
import android.view.Choreographer$FrameCallback;

public final class fc0 implements Choreographer$FrameCallback, Runnable
{
    public final gc0 v;
    
    public fc0(final gc0 v) {
        this.v = v;
    }
    
    public final void doFrame(final long n) {
        this.v.x.removeCallbacks((Runnable)this);
        this.v.k1();
        final gc0 v = this.v;
        final Object y = v.y;
        synchronized (y) {
            if (!v.D) {
                return;
            }
            int i = 0;
            v.D = false;
            final ArrayList a = v.A;
            v.A = v.B;
            v.B = a;
            monitorexit(y);
            while (i < a.size()) {
                ((Choreographer$FrameCallback)a.get(i)).doFrame(n);
                ++i;
            }
            a.clear();
        }
    }
    
    public final void run() {
        this.v.k1();
        final gc0 v = this.v;
        final Object y;
        monitorenter(y = v.y);
        Label_0054: {
            try {
                if (v.A.isEmpty()) {
                    v.w.removeFrameCallback((Choreographer$FrameCallback)this);
                    v.D = false;
                }
            }
            finally {
                break Label_0054;
            }
            monitorexit(y);
            return;
        }
        monitorexit(y);
    }
}
