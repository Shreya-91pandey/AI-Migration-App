import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.LinkedHashMap;

public final class xcp
{
    public final LinkedHashMap a;
    
    public xcp() {
        this.a = new LinkedHashMap();
    }
    
    public final void a() {
        final LinkedHashMap a = this.a;
        final Map l0 = y5e.l0((Map)a);
        a.clear();
        final Iterator iterator = l0.values().iterator();
        while (iterator.hasNext()) {
            ((tcp)iterator.next()).b();
        }
    }
    
    @Override
    public final String toString() {
        String c;
        if ((c = v4j.a((Class)xcp.class).c()) == null) {
            c = "ViewModelStore";
        }
        final int hashCode = this.hashCode();
        lq6.u(16);
        final String string = Integer.toString(hashCode, 16);
        string.getClass();
        final Set w1 = c86.w1((Iterable)this.a.keySet());
        final StringBuilder sb = new StringBuilder(c);
        sb.append("@");
        sb.append(string);
        sb.append("(keys=");
        sb.append((Object)w1);
        sb.append(")");
        return sb.toString();
    }
}
