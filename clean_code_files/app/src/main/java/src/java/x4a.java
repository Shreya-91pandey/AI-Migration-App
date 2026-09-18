import java.util.Map$Entry;

public final class x4a implements Map$Entry, stc
{
    public final fbd v;
    public final ibd w;
    public x4a x;
    public x4a y;
    public boolean z;
    
    public x4a(final fbd v, final ibd w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof x4a) {
            final x4a x4a = (x4a)o;
            if (this.v.equals(x4a.v)) {
                return this.w == x4a.w;
            }
        }
        return false;
    }
    
    public final Object getKey() {
        return this.v;
    }
    
    public final Object getValue() {
        return this.w;
    }
    
    @Override
    public final int hashCode() {
        return this.w.hashCode() + this.v.hashCode() * 31;
    }
    
    public final Object setValue(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Entry(key=");
        sb.append((Object)this.v);
        sb.append(", value=");
        sb.append((Object)this.w);
        sb.append(")");
        return sb.toString();
    }
}
