import java.util.concurrent.Executor;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import android.os.Handler;

public final class f5q
{
    public final gzk a;
    public final ic7 b;
    public final Handler c;
    public final y6k d;
    
    public f5q(final ExecutorService executorService) {
        this.c = new Handler(Looper.getMainLooper());
        this.d = new y6k(this, (byte)1);
        final gzk a = new gzk(executorService);
        this.a = a;
        this.b = eqi.W((Executor)a);
    }
}
