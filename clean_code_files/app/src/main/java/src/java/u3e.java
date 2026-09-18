import java.util.HashMap;
import java.util.AbstractMap;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Arrays;
import java.util.Map$Entry;
import java.util.Collections;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;

public final class u3e extends LinkedHashMap
{
    public static final u3e w;
    public boolean v;
    
    static {
        (w = new u3e()).v = false;
    }
    
    public u3e() {
        this.v = true;
    }
    
    public final void a() {
        if (this.v) {
            return;
        }
        fvd.q();
    }
    
    public final u3e c() {
        if (((AbstractMap)this).isEmpty()) {
            return new u3e();
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap((Map)this);
        ((u3e)linkedHashMap).v = true;
        return (u3e)linkedHashMap;
    }
    
    public final void clear() {
        this.a();
        super.clear();
    }
    
    public final Set entrySet() {
        if (((AbstractMap)this).isEmpty()) {
            return Collections.EMPTY_SET;
        }
        return super.entrySet();
    }
    
    public final boolean equals(Object value) {
        if (value instanceof Map) {
            final Map map = (Map)value;
            if (this != map) {
                if (((HashMap)this).size() != map.size()) {
                    return false;
                }
                for (final Map$Entry map$Entry : this.entrySet()) {
                    if (!map.containsKey(map$Entry.getKey())) {
                        return false;
                    }
                    value = map$Entry.getValue();
                    final Object value2 = map.get(map$Entry.getKey());
                    boolean b;
                    if (value instanceof byte[] && value2 instanceof byte[]) {
                        b = Arrays.equals((byte[])value, (byte[])value2);
                    }
                    else {
                        b = value.equals(value2);
                    }
                    if (!b) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final int hashCode() {
        final Iterator iterator = this.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)iterator.next();
            final Object key = map$Entry.getKey();
            final boolean b = key instanceof byte[];
            final int n2 = 1;
            int hashCode;
            if (b) {
                final byte[] array = (byte[])key;
                final int length = array.length;
                final Charset a = ejc.a;
                int i = 0;
                int n3 = length;
                while (i < length) {
                    n3 = n3 * 31 + array[i];
                    ++i;
                }
                if ((hashCode = n3) == 0) {
                    hashCode = 1;
                }
            }
            else {
                hashCode = key.hashCode();
            }
            final Object value = map$Entry.getValue();
            int hashCode2;
            if (value instanceof byte[]) {
                final byte[] array2 = (byte[])value;
                final int length2 = array2.length;
                final Charset a2 = ejc.a;
                int j = 0;
                hashCode2 = length2;
                while (j < length2) {
                    hashCode2 = hashCode2 * 31 + array2[j];
                    ++j;
                }
                if (hashCode2 == 0) {
                    hashCode2 = n2;
                }
            }
            else {
                hashCode2 = value.hashCode();
            }
            n += (hashCode ^ hashCode2);
        }
        return n;
    }
    
    public final Object put(final Object o, final Object o2) {
        this.a();
        final Charset a = ejc.a;
        o.getClass();
        o2.getClass();
        return super.put(o, o2);
    }
    
    public final void putAll(final Map map) {
        this.a();
        for (final Object next : map.keySet()) {
            final Charset a = ejc.a;
            next.getClass();
            map.get(next).getClass();
        }
        super.putAll(map);
    }
    
    public final Object remove(final Object o) {
        this.a();
        return super.remove(o);
    }
}
