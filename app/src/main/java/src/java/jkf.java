import java.util.Set;
import java.util.Iterator;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import android.content.Context;
import androidx.window.reflection.Consumer2;

public final class jkf implements yv6, Consumer2
{
    public final Context a;
    public final ReentrantLock b;
    public q2q c;
    public final LinkedHashSet d;
    
    public jkf(final Context a) {
        this.a = a;
        this.b = new ReentrantLock();
        this.d = new LinkedHashSet();
    }
    
    public final void a(final ira ira) {
        final ReentrantLock b = this.b;
        b.lock();
        Label_0046: {
            try {
                final q2q c = this.c;
                if (c != null) {
                    ira.accept((Object)c);
                }
            }
            finally {
                break Label_0046;
            }
            final Throwable t;
            ((Set)this.d).add((Object)t);
            b.unlock();
            return;
        }
        b.unlock();
    }
    
    public final void accept(Object b) {
        final WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo)b;
        b = this.b;
        ((ReentrantLock)b).lock();
        Label_0074: {
            try {
                final q2q c = v2a.c(this.a, windowLayoutInfo);
                this.c = c;
                final Iterator iterator = ((Iterable)this.d).iterator();
                while (iterator.hasNext()) {
                    ((yv6)iterator.next()).accept((Object)c);
                }
            }
            finally {
                break Label_0074;
            }
            ((ReentrantLock)b).unlock();
            return;
        }
        ((ReentrantLock)b).unlock();
    }
}
