import android.content.Intent;
import androidx.work.impl.WorkerStoppedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import androidx.work.impl.WorkDatabase;
import android.content.Context;
import android.os.PowerManager$WakeLock;

public final class frh
{
    public static final String l;
    public PowerManager$WakeLock a;
    public final Context b;
    public final wn6 c;
    public final f5q d;
    public final WorkDatabase e;
    public final HashMap f;
    public final HashMap g;
    public final HashMap h;
    public final HashSet i;
    public final ArrayList j;
    public final Object k;
    
    static {
        l = krd.e("Processor");
    }
    
    public frh(final Context b, final wn6 c, final f5q d, final WorkDatabase e) {
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.g = new HashMap();
        this.f = new HashMap();
        this.i = new HashSet();
        this.j = new ArrayList();
        this.a = null;
        this.k = new Object();
        this.h = new HashMap();
    }
    
    public static boolean d(final r6q r6q, final int n) {
        if (r6q != null) {
            ((bqc)r6q.l).v((Object)new WorkerStoppedException(n));
            krd.c().getClass();
            return true;
        }
        krd.c().getClass();
        return false;
    }
    
    public final void a(final nt9 nt9) {
        final Object k = this.k;
        synchronized (k) {
            this.j.add((Object)nt9);
        }
    }
    
    public final r6q b(final String s) {
        Object o = this.f.remove((Object)s);
        final boolean b = o != null;
        if (!b) {
            o = this.g.remove((Object)s);
        }
        this.h.remove((Object)s);
        if (b) {
            final Object k;
            monitorenter(k = this.k);
            Label_0137: {
                try {
                    if (!this.f.isEmpty()) {
                        break Label_0137;
                    }
                    final Intent d = z7n.d(this.b);
                    try {
                        this.b.startService(d);
                    }
                    finally {
                        final Throwable t;
                        krd.c().b(frh.l, "Unable to stop foreground service", t);
                    }
                    final PowerManager$WakeLock a = this.a;
                    if (a != null) {
                        a.release();
                        this.a = null;
                    }
                    break Label_0137;
                }
                finally {
                    monitorexit(k);
                    monitorexit(k);
                }
            }
        }
        return (r6q)o;
    }
    
    public final r6q c(final String s) {
        final r6q r6q = (r6q)this.f.get((Object)s);
        if (r6q == null) {
            return (r6q)this.g.get((Object)s);
        }
        return r6q;
    }
}
