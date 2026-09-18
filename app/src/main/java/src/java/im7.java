import java.util.LinkedHashMap;

public abstract class im7
{
    public final LinkedHashMap a;
    
    public im7() {
        this.a = new LinkedHashMap();
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof im7 && this.a.equals(((im7)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CreationExtras(extras=");
        sb.append((Object)this.a);
        sb.append(")");
        return sb.toString();
    }
}
