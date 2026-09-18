import java.util.Iterator;
import java.util.Map$Entry;
import java.util.WeakHashMap;

public final class w6k implements Iterable
{
    public t6k v;
    public t6k w;
    public final WeakHashMap x;
    public int y;
    
    public w6k() {
        this.x = new WeakHashMap();
        this.y = 0;
    }
    
    public final Object a(final j5g obj, final dmd dmd) {
        t6k t6k;
        for (t6k = this.v; t6k != null && !t6k.v.equals(obj); t6k = t6k.x) {}
        if (t6k != null) {
            return t6k.w;
        }
        final t6k t6k2 = new t6k((Object)obj, dmd);
        ++this.y;
        final t6k w = this.w;
        if (w == null) {
            this.v = t6k2;
            this.w = t6k2;
        }
        else {
            w.x = t6k2;
            t6k2.y = w;
            this.w = t6k2;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof w6k)) {
            return false;
        }
        final w6k w6k = (w6k)o;
        if (this.y != w6k.y) {
            return false;
        }
        final Iterator iterator = this.iterator();
        final Iterator iterator2 = w6k.iterator();
        Map$Entry map$Entry;
        Object next;
        do {
            final s6k s6k = (s6k)iterator;
            if (s6k.hasNext()) {
                final s6k s6k2 = (s6k)iterator2;
                if (s6k2.hasNext()) {
                    map$Entry = (Map$Entry)s6k.next();
                    next = s6k2.next();
                    continue;
                }
            }
            return !s6k.hasNext() && !((s6k)iterator2).hasNext();
        } while ((map$Entry != null || next == null) && (map$Entry == null || map$Entry.equals(next)));
        return false;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.iterator();
        int n = 0;
        while (true) {
            final s6k s6k = (s6k)iterator;
            if (!s6k.hasNext()) {
                break;
            }
            n += ((Map$Entry)s6k.next()).hashCode();
        }
        return n;
    }
    
    public final Iterator iterator() {
        final s6k s6k = new s6k(this.v, this.w);
        this.x.put((Object)s6k, (Object)Boolean.FALSE);
        return (Iterator)s6k;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("[");
        final Iterator iterator = this.iterator();
        while (true) {
            final s6k s6k = (s6k)iterator;
            if (!s6k.hasNext()) {
                break;
            }
            sb.append(s6k.next().toString());
            if (!s6k.hasNext()) {
                continue;
            }
            sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
