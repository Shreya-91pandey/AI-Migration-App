import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public final class r78 implements ThreadFactory
{
    public final AtomicInteger a;
    
    public r78() {
        this.a = new AtomicInteger(0);
    }
    
    public final Thread newThread(final Runnable runnable) {
        final Thread thread = new Thread(runnable);
        final StringBuilder sb = new StringBuilder("arch_disk_io_");
        sb.append(this.a.getAndIncrement());
        thread.setName(sb.toString());
        return thread;
    }
}
