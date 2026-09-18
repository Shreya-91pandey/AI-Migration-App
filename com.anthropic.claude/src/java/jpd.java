import java.util.function.Predicate;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;

public final class jpd implements Collection, stc
{
    public static final jpd x;
    public final List v;
    public final int w;
    
    static {
        x = new jpd((List)r89.v);
    }
    
    public jpd(final List v) {
        this.v = v;
        this.w = v.size();
    }
    
    public final hpd a() {
        return (hpd)this.v.get(0);
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean contains(final Object o) {
        return o instanceof hpd && this.v.contains((Object)o);
    }
    
    public final boolean containsAll(final Collection collection) {
        return this.v.containsAll(collection);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof jpd) {
                if (this.v.equals(((jpd)o).v)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final boolean isEmpty() {
        return this.v.isEmpty();
    }
    
    public final Iterator iterator() {
        return this.v.iterator();
    }
    
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean removeIf(final Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final int size() {
        return this.w;
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
    
    @Override
    public final String toString() {
        return hia.l("LocaleList(localeList=", ")", this.v);
    }
}
