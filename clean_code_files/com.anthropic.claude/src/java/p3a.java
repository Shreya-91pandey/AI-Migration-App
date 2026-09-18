import java.util.LinkedHashMap;
import java.util.Map;

public final class p3a
{
    public static final p3a b;
    public final Map a;
    
    static {
        b = new p3a(qt7.S((Map)new LinkedHashMap()));
    }
    
    public p3a(final Map a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof p3a && mlc.q((Object)this.a, (Object)((p3a)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Extras(data=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
