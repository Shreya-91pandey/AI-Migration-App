import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;

public abstract class p2 extends n1
{
    @Override
    public final boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public final boolean containsAll(final Collection collection) {
        final Iterable iterable = (Iterable)collection;
        if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
            return true;
        }
        final Iterator iterator = iterable.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public abstract p2 d(final int p0, final Object p1);
    
    @Override
    public final Iterator iterator() {
        return (Iterator)this.listIterator(0);
    }
    
    public abstract p2 j(final Object p0);
    
    @Override
    public final ListIterator listIterator() {
        return this.listIterator(0);
    }
    
    public p2 m(final Collection collection) {
        final v4h o = this.o();
        o.addAll(collection);
        return o.j();
    }
    
    public abstract v4h o();
    
    public abstract p2 r(final n2 p0);
    
    public abstract p2 s(final int p0);
    
    @Override
    public final List subList(final int n, final int n2) {
        return (List)new m5c(this, n, n2);
    }
    
    public abstract p2 t(final int p0, final Object p1);
}
