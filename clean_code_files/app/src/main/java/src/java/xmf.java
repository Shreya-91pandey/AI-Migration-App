import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

public final class xmf implements xtc, Set, stc
{
    public final umf v;
    public final umf w;
    
    public xmf(final umf umf) {
        this.v = umf;
        this.w = umf;
    }
    
    public final boolean add(final Object o) {
        return this.w.a(o);
    }
    
    public final boolean addAll(final Collection collection) {
        final Collection collection2 = collection;
        final umf w = this.w;
        final int d = w.d;
        final Iterator iterator = ((Iterable)collection2).iterator();
        while (iterator.hasNext()) {
            w.k(iterator.next());
        }
        return d != w.d;
    }
    
    public final void clear() {
        this.w.b();
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
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && xmf.class == o.getClass() && this.v.equals(((xmf)o).v));
    }
    
    @Override
    public final int hashCode() {
        return this.v.hashCode();
    }
    
    public final boolean isEmpty() {
        return this.v.g();
    }
    
    public final Iterator iterator() {
        return (Iterator)new hmf(this);
    }
    
    public final boolean remove(final Object o) {
        return this.w.l(o);
    }
    
    public final boolean removeAll(final Collection collection) {
        final Iterable iterable = (Iterable)collection;
        final umf w = this.w;
        final int d = w.d;
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            w.i(iterator.next());
        }
        return d != w.d;
    }
    
    public final boolean retainAll(final Collection collection) {
        final umf w = this.w;
        final Object[] b = w.b;
        final int d = w.d;
        final long[] a = w.a;
        final int n = a.length - 2;
        if (n >= 0) {
            int n2 = 0;
            while (true) {
                long n3 = a[n2];
                if ((~n3 << 7 & n3 & 0x8080808080808080L) != 0x8080808080808080L) {
                    final int n4 = 8 - (~(n2 - n) >>> 31);
                    for (int i = 0; i < n4; ++i) {
                        if ((0xFFL & n3) < 128L) {
                            final int n5 = (n2 << 3) + i;
                            if (!c86.A0((Iterable)collection, b[n5])) {
                                w.m(n5);
                            }
                        }
                        n3 >>= 8;
                    }
                    if (n4 != 8) {
                        break;
                    }
                }
                if (n2 == n) {
                    break;
                }
                ++n2;
            }
        }
        return d != w.d;
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
    
    @Override
    public final String toString() {
        return this.v.toString();
    }
}
