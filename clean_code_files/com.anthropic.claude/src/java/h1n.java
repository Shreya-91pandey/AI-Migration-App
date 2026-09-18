import java.util.function.Predicate;
import java.util.Iterator;
import java.util.Collection;

public final class h1n implements Collection, stc
{
    public final fmf v;
    
    public h1n() {
        final int a = ufg.a;
        final fmf v = new fmf(6);
        this.v = v;
    }
    
    public final boolean add(final Object o) {
        return this.v.a(o);
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        this.v.b();
    }
    
    public final boolean contains(final Object o) {
        return this.v.c(o);
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = ((Iterable)collection).iterator();
        while (iterator.hasNext()) {
            if (!this.v.c(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean isEmpty() {
        return this.v.g == 0;
    }
    
    public final Iterator iterator() {
        return new imf(this.v).iterator();
    }
    
    public final boolean remove(final Object o) {
        return this.v.g(o);
    }
    
    public final boolean removeAll(final Collection collection) {
        return this.v.g((Object)collection);
    }
    
    public final boolean removeIf(final Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean retainAll(final Collection collection) {
        return this.v.i(collection);
    }
    
    public final int size() {
        return this.v.g;
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
}
