import java.util.concurrent.Executor;

public final class x2
{
    public static final x2 d;
    public final Runnable a;
    public final Executor b;
    public x2 c;
    
    static {
        d = new x2(null, null);
    }
    
    public x2(final Runnable a, final Executor b) {
        this.a = a;
        this.b = b;
    }
}
