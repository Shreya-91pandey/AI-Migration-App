import android.os.Build$VERSION;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Executor;
import java.util.List;

public abstract class qy1
{
    public static final b09 a;
    public static Boolean b;
    
    static {
        a = new b09((jta)new kh0((byte)25), (byte)1);
    }
    
    public static final void a(final og0 og0, final mnn mnn, final tna tna, final List list, final boolean b, final gva gva) {
        final Executor executor = (Executor)gva.j((sei)qy1.a);
        Label_0100: {
            if (executor == null || !b(og0.w.length())) {
                break Label_0100;
            }
            gva.g0(315439796);
            final qzc qzc = (qzc)gva.j((sei)hm6.n);
            final xc8 xc8 = (xc8)gva.j((sei)hm6.h);
            while (true) {
                try {
                    executor.execute((Runnable)new oy1(mnn, qzc, list, og0, xc8, tna, b));
                    gva.q(false);
                    return;
                    gva.g0(317137883);
                    gva.q(false);
                }
                catch (final RejectedExecutionException ex) {
                    continue;
                }
                break;
            }
        }
    }
    
    public static final boolean b(final int n) {
        if (Build$VERSION.SDK_INT >= 28 && n >= 8 && n < 1000) {
            Boolean b;
            if ((b = qy1.b) == null) {
                b = (qy1.b = (Runtime.getRuntime().availableProcessors() >= 4));
            }
            if (b) {
                return true;
            }
        }
        return false;
    }
}
