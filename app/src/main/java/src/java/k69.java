import java.util.List;
import java.util.Collection;
import java.util.ArrayList;

public final class k69 extends jar
{
    public final l69 e;
    
    public k69(final l69 e) {
        this.e = e;
    }
    
    public final void r(final Throwable t) {
        this.e.a.g(t);
    }
    
    public final void s(th1 c) {
        final l69 e = this.e;
        e.c = (th1)c;
        c = e.c;
        final q69 a = e.a;
        e.b = new pp7((th1)c, a.g, a.i, lar.k());
        c = e.a;
        final ArrayList list = new ArrayList();
        ((q69)c).a.writeLock().lock();
        try {
            ((q69)c).c = 1;
            list.addAll((Collection)((q69)c).b);
            ((q69)c).b.clear();
            ((q69)c).a.writeLock().unlock();
            ((q69)c).d.post((Runnable)new o69((List)list, ((q69)c).c, null));
        }
        finally {
            ((q69)c).a.writeLock().unlock();
        }
    }
}
