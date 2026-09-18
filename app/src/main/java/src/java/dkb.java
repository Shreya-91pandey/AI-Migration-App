import java.util.Comparator;
import java.util.function.UnaryOperator;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import java.util.List;

public final class dkb implements List, stc
{
    public final emf v;
    public final qlf w;
    public int x;
    
    public dkb() {
        this.v = new emf(16);
        this.w = new qlf(16);
        this.x = -1;
    }
    
    public final long a() {
        final long c = u5r.c(Float.POSITIVE_INFINITY, false);
        int n = this.x + 1;
        final int p = lq6.P((List)this);
        long n2 = c;
        if (n <= p) {
            long n3 = c;
            while (true) {
                final long d = this.w.d(n);
                long n4 = n3;
                if (t8r.k(d, n3) < 0) {
                    n4 = d;
                }
                if (t8r.l(n4) < 0.0f && t8r.p(n4)) {
                    n2 = n4;
                    break;
                }
                n2 = n4;
                if (n == p) {
                    break;
                }
                ++n;
                n3 = n4;
            }
        }
        return n2;
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void clear() {
        this.x = -1;
        this.v.e();
        this.w.b = 0;
    }
    
    public final boolean contains(final Object o) {
        return o instanceof hgf && this.indexOf(o) != -1;
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = ((Iterable)collection).iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final void d(final int n, final int n2) {
        if (n >= n2) {
            return;
        }
        this.v.m(n, n2);
        this.w.e(n, n2);
    }
    
    public final Object get(final int n) {
        final Object g = this.v.g(n);
        g.getClass();
        return g;
    }
    
    public final int indexOf(final Object o) {
        if (o instanceof hgf) {
            final hgf hgf = (hgf)o;
            final int p = lq6.P((List)this);
            if (p >= 0) {
                int n;
                for (n = 0; !mlc.q(this.v.g(n), (Object)hgf); ++n) {
                    if (n == p) {
                        return -1;
                    }
                }
                return n;
            }
        }
        return -1;
    }
    
    public final boolean isEmpty() {
        return this.v.i();
    }
    
    public final Iterator iterator() {
        return (Iterator)new bkb(this, 0, 7);
    }
    
    public final int lastIndexOf(final Object o) {
        if (o instanceof hgf) {
            final hgf hgf = (hgf)o;
            for (int p = lq6.P((List)this); -1 < p; --p) {
                if (mlc.q(this.v.g(p), (Object)hgf)) {
                    return p;
                }
            }
        }
        return -1;
    }
    
    public final ListIterator listIterator() {
        return (ListIterator)new bkb(this, 0, 7);
    }
    
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new bkb(this, n, 6);
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
        return this.v.b;
    }
    
    public final void sort(final Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final List subList(final int n, final int n2) {
        return (List)new ckb(this, n, n2);
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
}
