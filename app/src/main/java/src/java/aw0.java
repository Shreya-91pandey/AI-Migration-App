import java.util.Map$Entry;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.util.Set;
import java.util.Map;

public final class aw0 extends myl implements Map
{
    public zv0 A;
    public vv0 y;
    public xv0 z;
    
    public final Set entrySet() {
        vv0 y;
        if ((y = this.y) == null) {
            y = new vv0((Map)this, (byte)0);
            this.y = y;
        }
        return (Set)y;
    }
    
    public final Set keySet() {
        xv0 z;
        if ((z = this.z) == null) {
            z = new xv0(this);
            this.z = z;
        }
        return (Set)z;
    }
    
    public final boolean o(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!super.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public final boolean p(final Collection collection) {
        final int x = super.x;
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            super.remove(iterator.next());
        }
        return x != super.x;
    }
    
    public final void putAll(final Map map) {
        final int n = map.size() + super.x;
        final int x = super.x;
        final int[] v = super.v;
        if (v.length < n) {
            super.v = Arrays.copyOf(v, n);
            super.w = Arrays.copyOf(super.w, n * 2);
        }
        if (super.x != x) {
            en9.c();
        }
        for (final Map$Entry map$Entry : map.entrySet()) {
            this.put(map$Entry.getKey(), map$Entry.getValue());
        }
    }
    
    public final Collection values() {
        zv0 a;
        if ((a = this.A) == null) {
            a = new zv0(this);
            this.A = a;
        }
        return (Collection)a;
    }
}
