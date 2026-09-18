import java.util.Iterator;
import java.util.Map$Entry;

public final class v3h extends g3 implements v5c
{
    public final g3h v;
    
    public v3h(final g3h v) {
        this.v = v;
    }
    
    @Override
    public final int a() {
        return this.v.w;
    }
    
    @Override
    public final boolean contains(final Object o) {
        if (o instanceof Map$Entry) {
            final Map$Entry map$Entry = (Map$Entry)o;
            final Object key = map$Entry.getKey();
            final g3h v = this.v;
            final Object value = v.get(key);
            if (value != null) {
                return value.equals(map$Entry.getValue());
            }
            if (map$Entry.getValue() == null && v.containsKey(map$Entry.getKey())) {
                return true;
            }
        }
        return false;
    }
    
    public final Iterator iterator() {
        final fgo v = this.v.v;
        final hgo[] array = new hgo[8];
        for (int i = 0; i < 8; ++i) {
            array[i] = new jgo((byte)0);
        }
        return (Iterator)new i3h(v, array);
    }
}
