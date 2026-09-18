import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.AbstractList;
import java.util.List;

public final class zna extends una implements List, stc
{
    public final List A;
    
    public zna(final AbstractList a) {
        this.A = (List)a;
        if (((Collection)a).isEmpty()) {
            hac.c("At least one font should be passed to FontFamily");
        }
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
        return o instanceof f70 && this.A.contains((Object)o);
    }
    
    public final boolean containsAll(final Collection collection) {
        return this.A.containsAll(collection);
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o instanceof zna && mlc.q((Object)this.A, (Object)((zna)o).A));
    }
    
    public final Object get(final int n) {
        return this.A.get(n);
    }
    
    public final int hashCode() {
        return this.A.hashCode();
    }
    
    public final int indexOf(final Object o) {
        if (!(o instanceof f70)) {
            return -1;
        }
        return this.A.indexOf((Object)o);
    }
    
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }
    
    public final Iterator iterator() {
        return this.A.iterator();
    }
    
    public final int lastIndexOf(final Object o) {
        if (!(o instanceof f70)) {
            return -1;
        }
        return this.A.lastIndexOf((Object)o);
    }
    
    public final ListIterator listIterator() {
        return this.A.listIterator();
    }
    
    public final ListIterator listIterator(final int n) {
        return this.A.listIterator(n);
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
        return this.A.size();
    }
    
    public final void sort(final Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final List subList(final int n, final int n2) {
        return this.A.subList(n, n2);
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
    
    public final String toString() {
        return hia.l("FontListFontFamily(fonts=", ")", this.A);
    }
}
