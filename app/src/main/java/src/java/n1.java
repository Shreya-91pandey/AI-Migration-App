import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

public abstract class n1 extends j0 implements List
{
    public final void add(final int n, final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        final Collection collection = (Collection)o;
        if (((Collection)this).size() == collection.size()) {
            final Iterator iterator = collection.iterator();
            final Iterator iterator2 = ((Collection)this).iterator();
            while (iterator2.hasNext()) {
                if (!mlc.q(iterator2.next(), iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        final Iterator iterator = ((Collection)this).iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n = n * 31 + hashCode;
        }
        return n;
    }
    
    public int indexOf(final Object o) {
        final Iterator iterator = ((List)this).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (mlc.q(iterator.next(), o)) {
                return n;
            }
            ++n;
        }
        return -1;
    }
    
    public Iterator iterator() {
        return (Iterator)new k1((Object)this, (byte)0);
    }
    
    public int lastIndexOf(final Object o) {
        final ListIterator listIterator = ((List)this).listIterator(((List)this).size());
        while (listIterator.hasPrevious()) {
            if (mlc.q(listIterator.previous(), o)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
    
    public ListIterator listIterator() {
        return (ListIterator)new l1(this, 0);
    }
    
    public ListIterator listIterator(final int n) {
        return (ListIterator)new l1(this, n);
    }
    
    public final Object remove(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object set(final int n, final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public List subList(final int n, final int n2) {
        return (List)new m1(this, n, n2);
    }
}
