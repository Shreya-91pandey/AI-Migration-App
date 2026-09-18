import java.util.concurrent.locks.ReentrantLock;

public final class g5g
{
    public final ReentrantLock a;
    public final long[] b;
    public final boolean[] c;
    public volatile boolean d;
    public final ReentrantLock e;
    
    public g5g(final int n) {
        this.a = new ReentrantLock();
        this.b = new long[n];
        this.c = new boolean[n];
        this.e = new ReentrantLock();
    }
}
