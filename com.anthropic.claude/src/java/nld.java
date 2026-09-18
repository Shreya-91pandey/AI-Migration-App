import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import androidx.work.WorkerParameters;
import android.content.Context;

public abstract class nld
{
    public final Context a;
    public final WorkerParameters b;
    public final AtomicInteger c;
    public boolean d;
    
    public nld(final Context a, final WorkerParameters b) {
        this.c = new AtomicInteger(-256);
        this.a = a;
        this.b = b;
    }
    
    public t03 a() {
        final ExecutorService e = this.b.e;
        e.getClass();
        return uoo.K((r03)new pm7((Object)e, (Object)new xxp((Object)this, (byte)6), (byte)21));
    }
    
    public final boolean b() {
        return this.c.get() != -256;
    }
    
    public t03 c() {
        final ExecutorService e = this.b.e;
        e.getClass();
        return uoo.K((r03)new pm7((Object)e, (Object)new rwp((Object)this, (byte)1), (byte)21));
    }
}
