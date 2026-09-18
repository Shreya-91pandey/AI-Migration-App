import android.os.Looper;
import android.view.View;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import android.view.ViewTreeObserver$OnDrawListener;

public final class ce6 implements ViewTreeObserver$OnDrawListener, Runnable, Executor
{
    public final long v;
    public Runnable w;
    public boolean x;
    public final ge6 y;
    
    public ce6(final ge6 y) {
        this.y = y;
        this.v = SystemClock.uptimeMillis() + 10000L;
    }
    
    public final void a(final View view) {
        if (!this.x) {
            this.x = true;
            view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver$OnDrawListener)this);
        }
    }
    
    public final void execute(final Runnable w) {
        this.w = w;
        final View decorView = this.y.getWindow().getDecorView();
        decorView.getClass();
        if (!this.x) {
            decorView.postOnAnimation((Runnable)new m0((Object)this, (byte)3));
            return;
        }
        if (mlc.q(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
            return;
        }
        decorView.postInvalidate();
    }
    
    public final void onDraw() {
        final ge6 y = this.y;
        final Runnable w = this.w;
        if (w != null) {
            w.run();
            this.w = null;
            final hta hta = (hta)y.B.getValue();
            final Object c = hta.c;
            synchronized (c) {
                final boolean f = hta.f;
                monitorexit(c);
                if (f) {
                    this.x = false;
                    y.getWindow().getDecorView().post((Runnable)this);
                }
                return;
            }
        }
        if (SystemClock.uptimeMillis() > this.v) {
            this.x = false;
            y.getWindow().getDecorView().post((Runnable)this);
        }
    }
    
    public final void run() {
        this.y.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver$OnDrawListener)this);
    }
}
