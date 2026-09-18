import java.util.concurrent.Executor;

public enum ml8 implements Executor
{
    v("INSTANCE", 0);
    
    public static final ml8[] w;
    
    public final void execute(final Runnable runnable) {
        runnable.run();
    }
    
    public final String toString() {
        return "DirectExecutor";
    }
}
