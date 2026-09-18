import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

public final class m4d implements List, stc
{
    public final v8m v;
    
    public m4d() {
        final v8m v = new v8m();
        this.v = v;
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean contains(final Object o) {
        return o instanceof k4d && this.v.contains((Object)o);
    }
    
    public final boolean containsAll(final Collection collection) {
        return this.v.containsAll(collection);
    }
    
    public final Object get(final int n) {
        return this.v.get(n);
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof k4d)) {
            return -1;
        }
        return this.v.indexOf((Object)o);
    }
    
    public final boolean isEmpty() {
        return this.v.isEmpty();
    }
    
    public final Iterator iterator() {
        return (Iterator)this.v.listIterator();
    }
    
    public final int lastIndexOf(final Object o) {
        if (!(o instanceof k4d)) {
            return -1;
        }
        return this.v.lastIndexOf((Object)o);
    }
    
    public final ListIterator listIterator() {
        return this.v.listIterator();
    }
    
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new xgd(this.v, n);
    }
    
    public final boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void replaceAll(final UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final int size() {
        return this.v.size();
    }
    
    public final void sort(final Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final List subList(final int n, final int n2) {
        return this.v.subList(n, n2);
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
}
