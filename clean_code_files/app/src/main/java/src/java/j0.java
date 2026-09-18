import java.util.Iterator;
import java.util.Collection;

public abstract class j0 implements Collection, stc
{
    public abstract int a();
    
    public final boolean add(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean contains(final Object o) {
        if (((Collection)this).isEmpty()) {
            return false;
        }
        final Iterator iterator = ((Iterable)this).iterator();
        while (iterator.hasNext()) {
            if (mlc.q(iterator.next(), o)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsAll(final Collection collection) {
        final Iterable iterable = (Iterable)collection;
        if (!((Collection)iterable).isEmpty()) {
            final Iterator iterator = iterable.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isEmpty() {
        return this.a() == 0;
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
    
    public final /* bridge */ int size() {
        return this.a();
    }
    
    public Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
    
    @Override
    public final String toString() {
        return c86.N0((Iterable)this, (CharSequence)", ", "[", "]", (lta)new i0((Object)this, (byte)0), 24);
    }
}
