import java.util.Iterator;
import java.util.Collection;
import java.util.Set;

public abstract class g3 extends j0 implements Set
{
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set = (Set)o;
        return ((Set)this).size() == set.size() && ((Set)this).containsAll((Collection)set);
    }
    
    public int hashCode() {
        final Iterator iterator = ((Collection)this).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            int hashCode;
            if (next != null) {
                hashCode = next.hashCode();
            }
            else {
                hashCode = 0;
            }
            n += hashCode;
        }
        return n;
    }
}
