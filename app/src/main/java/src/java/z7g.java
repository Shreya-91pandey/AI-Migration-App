import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;

public abstract class z7g
{
    public final ArrayList a;
    public boolean b;
    public final CopyOnWriteArrayList c;
    
    public z7g(final boolean b) {
        this.a = new ArrayList();
        this.b = b;
        this.c = new CopyOnWriteArrayList();
    }
    
    public void a() {
    }
    
    public abstract void b();
    
    public void c(final go1 go1) {
    }
    
    public void d(final go1 go1) {
    }
    
    public final void e() {
        final CopyOnWriteArrayList c = this.c;
        final Iterator iterator = c.iterator();
        iterator.getClass();
        while (iterator.hasNext()) {
            p3g.g((AutoCloseable)iterator.next());
        }
        c.clear();
        final ArrayList a = this.a;
        final Iterator iterator2 = a.iterator();
        while (iterator2.hasNext()) {
            ((y7g)iterator2.next()).e();
        }
        a.clear();
    }
    
    public final void f(final boolean b) {
        this.b = b;
        for (final y7g y7g : this.a) {
            y7g.f(y7g.e && b);
        }
    }
}
