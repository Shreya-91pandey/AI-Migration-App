import java.util.Map;
import java.util.LinkedHashMap;

public final class n3a
{
    public final LinkedHashMap a;
    
    public n3a() {
        this.a = new LinkedHashMap();
    }
    
    public n3a(final p3a p3a) {
        this.a = new LinkedHashMap(p3a.a);
    }
    
    public final void a(final o3a o3a, final Object o) {
        ((Map)this.a).put((Object)o3a, o);
    }
}
