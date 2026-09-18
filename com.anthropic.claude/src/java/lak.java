import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

public final class lak implements Set, stc
{
    public final umf v;
    
    public lak(final umf v) {
        this.v = v;
    }
    
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean contains(final Object o) {
        return this.v.c(o);
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterable iterable = (Iterable)collection;
        if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
            return true;
        }
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (!this.v.c(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean isEmpty() {
        return this.v.g();
    }
    
    public final Iterator iterator() {
        return (Iterator)ncq.E((zta)new nd9((byte)2, (f07)null, (Object)this));
    }
    
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final int size() {
        return this.v.d;
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
}
