import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

public abstract class s6q
{
    public static final String a;
    
    static {
        a = krd.e("WorkerWrapper");
    }
    
    public static final Object a(final fld fld, final nld nld, final m6n m6n) {
        try {
            final boolean done = ((Future)fld).isDone();
            boolean b = false;
            if (done) {
                try {
                    return ((Future)fld).get();
                }
                catch (final InterruptedException ex) {
                    b = true;
                    return ((Future)fld).get();
                }
                finally {
                    if (b) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            final l13 l13 = new l13(1, ljq.K((f07)m6n));
            l13.r();
            fld.a((Runnable)new o98(fld, l13, false, (byte)5), (Executor)ml8.v);
            l13.v((lta)new n90((Object)nld, (Object)fld, (byte)11));
            return l13.p();
        }
        catch (final ExecutionException ex2) {
            final Throwable cause = ((Throwable)ex2).getCause();
            cause.getClass();
            throw cause;
        }
    }
}
