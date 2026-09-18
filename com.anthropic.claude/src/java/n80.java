import java.util.concurrent.RejectedExecutionException;
import android.os.Looper;
import android.os.Handler;
import java.util.concurrent.Executor;

public final class n80 implements Executor
{
    public final byte v;
    public final Handler w;
    
    public n80() {
        this.v = 0;
        this.w = new Handler(Looper.getMainLooper());
    }
    
    public n80(final Handler w) {
        this.v = 1;
        this.w = w;
    }
    
    public final void execute(final Runnable runnable) {
        final byte v = this.v;
        final Handler w = this.w;
        switch (v) {
            default: {
                runnable.getClass();
                if (w.post(runnable)) {
                    return;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append((Object)w);
                sb.append(" is shutting down");
                throw new RejectedExecutionException(sb.toString());
            }
            case 0: {
                w.post(runnable);
            }
        }
    }
}
