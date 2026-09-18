import java.util.Map$Entry;

public class i3e implements Map$Entry, stc
{
    public final Object v;
    public final Object w;
    
    public i3e(final Object v, final Object w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final boolean equals(final Object o) {
        Map$Entry map$Entry;
        if (o instanceof Map$Entry) {
            map$Entry = (Map$Entry)o;
        }
        else {
            map$Entry = null;
        }
        return map$Entry != null && mlc.q(map$Entry.getKey(), this.v) && mlc.q(map$Entry.getValue(), this.getValue());
    }
    
    public final Object getKey() {
        return this.v;
    }
    
    public Object getValue() {
        return this.w;
    }
    
    @Override
    public final int hashCode() {
        int hashCode = 0;
        final Object v = this.v;
        int hashCode2;
        if (v != null) {
            hashCode2 = v.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Object value = this.getValue();
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    public Object setValue(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final String toString() {
        final Object value = this.getValue();
        final StringBuilder sb = new StringBuilder();
        sb.append(this.v);
        sb.append("=");
        sb.append(value);
        return sb.toString();
    }
}
