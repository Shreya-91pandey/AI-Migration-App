import java.util.Set;
import java.util.Map;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;

public abstract class tcp
{
    public final iti a;
    
    public tcp() {
        this.a = new iti();
    }
    
    public final void a(final String s, final AutoCloseable autoCloseable) {
        final iti a = this.a;
        if (a.v) {
            iti.b(autoCloseable);
            return;
        }
        final awp awp = (awp)a.w;
        synchronized (awp) {
            final AutoCloseable autoCloseable2 = (AutoCloseable)((Map)a.x).put((Object)s, (Object)autoCloseable);
            monitorexit(awp);
            iti.b(autoCloseable2);
        }
    }
    
    public final void b() {
        final iti a = this.a;
        Label_0129: {
            if (!a.v) {
                a.v = true;
                final awp awp;
                monitorenter(awp = (awp)a.w);
                Label_0134: {
                    try {
                        final Iterator iterator = ((LinkedHashMap)a.x).values().iterator();
                        while (iterator.hasNext()) {
                            iti.b((AutoCloseable)iterator.next());
                        }
                    }
                    finally {
                        break Label_0134;
                    }
                    final iti iti;
                    final Iterator iterator2 = ((Set)iti.y).iterator();
                    while (iterator2.hasNext()) {
                        iti.b((AutoCloseable)iterator2.next());
                    }
                    ((Set)iti.y).clear();
                    monitorexit(awp);
                    break Label_0129;
                }
                monitorexit(awp);
            }
        }
        this.d();
    }
    
    public final AutoCloseable c(final String s) {
        final iti a = this.a;
        final awp awp = (awp)a.w;
        synchronized (awp) {
            return (AutoCloseable)((LinkedHashMap)a.x).get((Object)s);
        }
    }
    
    public void d() {
    }
}
