import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class hta
{
    public final Executor a;
    public final wd6 b;
    public final Object c;
    public int d;
    public boolean e;
    public boolean f;
    public final ArrayList g;
    public final m0 h;
    
    public hta(final Executor a, final wd6 b) {
        this.a = a;
        this.b = b;
        this.c = new Object();
        this.g = new ArrayList();
        this.h = new m0((Object)this, (byte)7);
    }
    
    public final void a() {
        final Object c;
        monitorenter(c = this.c);
        Label_0063: {
            try {
                this.f = true;
                final Iterator iterator = this.g.iterator();
                while (iterator.hasNext()) {
                    ((jta)iterator.next()).a();
                }
            }
            finally {
                break Label_0063;
            }
            this.g.clear();
            monitorexit(c);
            return;
        }
        monitorexit(c);
    }
}
