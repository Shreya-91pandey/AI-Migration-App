import java.util.concurrent.CancellationException;

public final class s55 implements AutoCloseable, oc7
{
    public final hc7 v;
    
    public s55(final hc7 v) {
        this.v = v;
    }
    
    public final void close() {
        x90.o(this.v, (CancellationException)null);
    }
    
    public final hc7 getCoroutineContext() {
        return this.v;
    }
}
