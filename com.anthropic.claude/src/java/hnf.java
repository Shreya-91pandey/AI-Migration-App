import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

public final class hnf implements List, utc
{
    public final inf v;
    
    public hnf(final inf v) {
        this.v = v;
    }
    
    public final void add(final int n, final Object o) {
        this.v.a(n, o);
    }
    
    public final boolean add(final Object o) {
        this.v.b(o);
        return true;
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        return this.v.f(n, collection);
    }
    
    public final boolean addAll(final Collection collection) {
        final inf v = this.v;
        return v.f(v.x, collection);
    }
    
    public final void clear() {
        this.v.h();
    }
    
    public final boolean contains(final Object o) {
        return this.v.i(o);
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = ((Iterable)collection).iterator();
        while (iterator.hasNext()) {
            if (!this.v.i(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final Object get(final int n) {
        jnf.a(n, (List)this);
        return this.v.v[n];
    }
    
    public final int indexOf(final Object o) {
        return this.v.j(o);
    }
    
    public final boolean isEmpty() {
        return this.v.x == 0;
    }
    
    public final Iterator iterator() {
        return (Iterator)new bmf((List)this, 0, (byte)1);
    }
    
    public final int lastIndexOf(final Object o) {
        final inf v = this.v;
        int i = v.x - 1;
        final Object[] v2 = v.v;
        while (i >= 0) {
            if (mlc.q(o, v2[i])) {
                return i;
            }
            --i;
        }
        return -1;
    }
    
    public final ListIterator listIterator() {
        return (ListIterator)new bmf((List)this, 0, (byte)1);
    }
    
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new bmf((List)this, n, (byte)1);
    }
    
    public final Object remove(final int n) {
        jnf.a(n, (List)this);
        return this.v.l(n);
    }
    
    public final boolean remove(final Object o) {
        return this.v.k(o);
    }
    
    public final boolean removeAll(final Collection collection) {
        if (!collection.isEmpty()) {
            final inf v = this.v;
            final int x = v.x;
            final Iterator iterator = ((Iterable)collection).iterator();
            while (iterator.hasNext()) {
                v.k(iterator.next());
            }
            if (x != v.x) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean retainAll(final Collection collection) {
        final inf v = this.v;
        final int x = v.x;
        for (int n = x - 1; -1 < n; --n) {
            if (!collection.contains(v.v[n])) {
                v.l(n);
            }
        }
        return x != v.x;
    }
    
    public final Object set(final int n, final Object o) {
        jnf.a(n, (List)this);
        final Object[] v = this.v.v;
        final Object o2 = v[n];
        v[n] = o;
        return o2;
    }
    
    public final int size() {
        return this.v.x;
    }
    
    public final List subList(final int n, final int n2) {
        jnf.b(n, n2, (List)this);
        return (List)new dmf((List)this, n, n2, (byte)1);
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
}
