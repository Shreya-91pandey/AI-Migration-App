import java.util.Collection;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Set;
import java.util.Map;

public abstract class s1 implements Map, stc
{
    public abstract Set a();
    
    public abstract Set c();
    
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean containsValue(final Object o) {
        final Set a = this.a();
        if (!((Collection)a).isEmpty()) {
            final Iterator iterator = ((Iterable)a).iterator();
            while (iterator.hasNext()) {
                if (mlc.q(((Map$Entry)iterator.next()).getValue(), o)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public abstract int d();
    
    public final /* bridge */ Set entrySet() {
        return this.a();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof Map) {
                final int d = this.d();
                final Map map = (Map)o;
                if (d == map.size()) {
                    final Iterable iterable = (Iterable)map.entrySet();
                    if (iterable instanceof Collection && ((Collection)iterable).isEmpty()) {
                        return true;
                    }
                    for (final Map$Entry map$Entry : iterable) {
                        if (map$Entry == null) {
                            return false;
                        }
                        final Object key = map$Entry.getKey();
                        final Object value = map$Entry.getValue();
                        final Object value2 = ((Map)this).get(key);
                        if (!mlc.q(value, value2)) {
                            return false;
                        }
                        if (value2 == null && !((Map)this).containsKey(key)) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public Collection f() {
        return (Collection)new b8e(this, (byte)1);
    }
    
    @Override
    public int hashCode() {
        return this.a().hashCode();
    }
    
    public final boolean isEmpty() {
        return this.d() == 0;
    }
    
    public final /* bridge */ Set keySet() {
        return this.c();
    }
    
    public final Object put(final Object o, final Object o2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final void putAll(final Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final Object remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public final /* bridge */ int size() {
        return this.d();
    }
    
    @Override
    public final String toString() {
        return c86.N0((Iterable)this.a(), (CharSequence)", ", "{", "}", (lta)new i0((Object)this, (byte)1), 24);
    }
    
    public final /* bridge */ Collection values() {
        return this.f();
    }
}
