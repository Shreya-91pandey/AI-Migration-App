import java.lang.ref.Reference;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import androidx.concurrent.futures.b;
import java.lang.ref.WeakReference;

public final class t03 implements fld
{
    public final WeakReference v;
    public final s03 w;
    
    public t03(final b b) {
        this.w = new s03(this);
        this.v = new WeakReference((Object)b);
    }
    
    @Override
    public final void a(final Runnable runnable, final Executor executor) {
        this.w.a(runnable, executor);
    }
    
    public final boolean cancel(final boolean b) {
        final b b2 = (b)((Reference)this.v).get();
        final boolean cancel = this.w.cancel(b);
        if (cancel && b2 != null) {
            b2.a = null;
            b2.b = null;
            b2.c.n(null);
        }
        return cancel;
    }
    
    public final Object get() {
        return this.w.get();
    }
    
    public final Object get(final long n, final TimeUnit timeUnit) {
        return this.w.get(n, timeUnit);
    }
    
    public final boolean isCancelled() {
        return this.w.v instanceof w2;
    }
    
    public final boolean isDone() {
        return this.w.isDone();
    }
    
    @Override
    public final String toString() {
        return this.w.toString();
    }
}
