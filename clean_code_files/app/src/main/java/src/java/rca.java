import java.util.concurrent.atomic.AtomicBoolean;
import java.io.File;

public class rca implements r55
{
    public final File a;
    public final wzk b;
    public final AtomicBoolean c;
    
    public rca(final File a, final wzk b) {
        this.a = a;
        this.b = b;
        this.c = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        this.c.set(true);
    }
}
