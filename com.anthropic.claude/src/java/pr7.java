import java.util.concurrent.atomic.AtomicReference;

public final class pr7
{
    public final boolean a;
    public final AtomicReference b;
    public final gsg c;
    
    public pr7(final boolean a) {
        this.a = a;
        this.b = new AtomicReference((Object)null);
        this.c = new gsg(0.0f);
    }
}
