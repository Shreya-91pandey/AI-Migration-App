import java.util.Collection;
import java.util.Set;
import java.util.Map;
import java.util.AbstractMap;

public abstract class l2 extends AbstractMap implements Map, wtc
{
    public Set a() {
        return (Set)new n3h(this, (byte)0);
    }
    
    public Set c() {
        return (Set)new q3h(this, (byte)0);
    }
    
    public abstract /* bridge */ int d();
    
    public final /* bridge */ Set entrySet() {
        return this.a();
    }
    
    public Collection f() {
        return (Collection)new t3h(this, (byte)0);
    }
    
    public final /* bridge */ Set keySet() {
        return this.c();
    }
    
    public final /* bridge */ int size() {
        return this.d();
    }
    
    public final /* bridge */ Collection values() {
        return this.f();
    }
}
