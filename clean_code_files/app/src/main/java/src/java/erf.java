import java.util.Collection;
import java.util.List;

public final class erf
{
    public final List a;
    public final int b;
    
    public erf() {
        this((List)r89.v, -1);
    }
    
    public erf(final List a, final int b) {
        this.a = a;
        this.b = b;
        if (!a.isEmpty() || b != -1) {
            if (!((Collection)a).isEmpty()) {
                final int size = ((Collection)a).size();
                if (b >= 0 && b < size) {
                    return;
                }
            }
            fvd.p(hia.p(b, "Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", "', bounds = '"), (Object)lq6.O((Collection)a), (Object)"'.");
            throw null;
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && erf.class == o.getClass()) {
            final erf erf = (erf)o;
            return this.b == erf.b && mlc.q((Object)this.a, (Object)erf.a);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() + this.b * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb.append(this.b);
        sb.append(", mergedHistory=");
        sb.append((Object)this.a);
        sb.append(')');
        return sb.toString();
    }
}
