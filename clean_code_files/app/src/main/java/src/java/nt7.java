import java.util.Arrays;
import java.util.Objects;
import java.util.Map$Entry;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.HashMap;

public final class nt7
{
    public static final nt7 b;
    public final HashMap a;
    
    static {
        final nt7 b2 = new nt7(new LinkedHashMap());
        ri2.C0(b2);
        b = b2;
    }
    
    public nt7(final LinkedHashMap linkedHashMap) {
        this.a = new HashMap((Map)linkedHashMap);
    }
    
    public nt7(final nt7 nt7) {
        this.a = new HashMap((Map)nt7.a);
    }
    
    public final int a(final String s, final int n) {
        final Integer value = n;
        final Object value2 = this.a.get((Object)s);
        Object o = value;
        if (value2 instanceof Integer) {
            o = value2;
        }
        return ((Number)o).intValue();
    }
    
    public final String b(final String s) {
        final Object value = this.a.get((Object)s);
        if (value instanceof String) {
            return (String)value;
        }
        return null;
    }
    
    public final boolean c(final String s) {
        final Object value = this.a.get((Object)s);
        return value != null && String.class.isAssignableFrom(value.getClass());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (nt7.class.equals(o.getClass())) {
                    final HashMap a = ((nt7)o).a;
                    final HashMap a2 = this.a;
                    final Set keySet = a2.keySet();
                    if (mlc.q((Object)keySet, (Object)a.keySet())) {
                        for (final String s : keySet) {
                            final Object value = a2.get((Object)s);
                            final Object value2 = a.get((Object)s);
                            boolean b = false;
                            Label_0183: {
                                if (value != null && value2 != null) {
                                    if (value instanceof Object[]) {
                                        final Object[] array = (Object[])value;
                                        if (value2 instanceof Object[]) {
                                            b = iw0.H0(array, (Object[])value2);
                                            break Label_0183;
                                        }
                                    }
                                    b = value.equals(value2);
                                }
                                else {
                                    b = (value == value2);
                                }
                            }
                            if (!b) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = this.a.entrySet().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Map$Entry map$Entry = (Map$Entry)iterator.next();
            final Object value = map$Entry.getValue();
            int hashCode;
            if (value instanceof Object[]) {
                hashCode = (Objects.hashCode(map$Entry.getKey()) ^ Arrays.deepHashCode((Object[])value));
            }
            else {
                hashCode = map$Entry.hashCode();
            }
            n += hashCode;
        }
        return n * 31;
    }
    
    @Override
    public final String toString() {
        return oz1.p(new StringBuilder("Data {"), c86.N0((Iterable)this.a.entrySet(), (CharSequence)null, (String)null, (String)null, (lta)new wg7((byte)7), 31), "}");
    }
}
