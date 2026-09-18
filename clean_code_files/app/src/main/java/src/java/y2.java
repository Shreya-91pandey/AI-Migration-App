import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class y2 extends r9n
{
    public final AtomicReferenceFieldUpdater h;
    public final AtomicReferenceFieldUpdater i;
    public final AtomicReferenceFieldUpdater j;
    public final AtomicReferenceFieldUpdater k;
    public final AtomicReferenceFieldUpdater l;
    
    public y2(final AtomicReferenceFieldUpdater h, final AtomicReferenceFieldUpdater i, final AtomicReferenceFieldUpdater j, final AtomicReferenceFieldUpdater k, final AtomicReferenceFieldUpdater l) {
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final void P(final a3 a3, final a3 a4) {
        this.i.lazySet((Object)a3, (Object)a4);
    }
    
    public final void Q(final a3 a3, final Thread thread) {
        this.h.lazySet((Object)a3, (Object)thread);
    }
    
    public final boolean i(final b3 b3, final x2 x2, final x2 x3) {
        AtomicReferenceFieldUpdater k;
        do {
            k = this.k;
            if (k.compareAndSet((Object)b3, (Object)x2, (Object)x3)) {
                return true;
            }
        } while (k.get((Object)b3) == x2);
        return false;
    }
    
    public final boolean j(final b3 b3, final Object o, final Object o2) {
        AtomicReferenceFieldUpdater l;
        do {
            l = this.l;
            if (l.compareAndSet((Object)b3, o, o2)) {
                return true;
            }
        } while (l.get((Object)b3) == o);
        return false;
    }
    
    public final boolean k(final b3 b3, final a3 a3, final a3 a4) {
        AtomicReferenceFieldUpdater j;
        do {
            j = this.j;
            if (j.compareAndSet((Object)b3, (Object)a3, (Object)a4)) {
                return true;
            }
        } while (j.get((Object)b3) == a3);
        return false;
    }
}
