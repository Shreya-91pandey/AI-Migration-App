import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public final class xn6 implements ThreadFactory
{
    public final AtomicInteger a;
    public final boolean b;
    
    public xn6(final boolean b) {
        this.b = b;
        this.a = new AtomicInteger(0);
    }
    
    public final Thread newThread(final Runnable runnable) {
        String s;
        if (this.b) {
            s = "WM.task-";
        }
        else {
            s = "androidx.work-";
        }
        final StringBuilder sb = new StringBuilder(s);
        sb.append(this.a.incrementAndGet());
        return new Thread(runnable, sb.toString());
    }
}
