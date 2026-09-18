import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Looper;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import android.os.Handler;
import java.util.concurrent.ExecutorService;

public final class s78 extends x90
{
    public final Object i;
    public final ExecutorService j;
    public volatile Handler k;
    
    public s78() {
        this.i = new Object();
        this.j = Executors.newFixedThreadPool(4, (ThreadFactory)new r78());
    }
    
    public static Handler O(final Looper looper) {
        if (Build$VERSION.SDK_INT >= 28) {
            return zh0.a(looper);
        }
        try {
            return (Handler)Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(new Object[] { looper, null, Boolean.TRUE });
        }
        catch (final InvocationTargetException ex) {
            return new Handler(looper);
        }
        catch (final IllegalAccessException | InstantiationException | NoSuchMethodException ex2) {
            return new Handler(looper);
        }
    }
}
