import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class y6k implements Executor
{
    public final byte v;
    public final Object w;
    
    public y6k() {
        this.v = 2;
        final Handler w = new Handler(Looper.getMainLooper());
        Looper.getMainLooper();
        this.w = w;
    }
    
    public final void execute(final Runnable runnable) {
        final byte v = this.v;
        final Object w = this.w;
        switch (v) {
            default: {
                ((Handler)w).post(runnable);
                return;
            }
            case 1: {
                ((f5q)w).c.post(runnable);
                return;
            }
            case 0: {
                ((Executor)w).execute((Runnable)new x6k(runnable, (byte)0));
            }
        }
    }
}
