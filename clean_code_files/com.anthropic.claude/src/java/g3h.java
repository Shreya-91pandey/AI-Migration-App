import java.util.Set;
import java.util.Map;

public class g3h extends s1 implements Map, stc
{
    public static final g3h x;
    public final fgo v;
    public final int w;
    
    static {
        x = new g3h(fgo.e, 0);
    }
    
    public g3h(final fgo v, final int w) {
        this.v = v;
        this.w = w;
    }
    
    @Override
    public final Set a() {
        return (Set)new v3h(this);
    }
    
    @Override
    public final Set c() {
        return (Set)new y3h(this);
    }
    
    public boolean containsKey(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.v.d(hashCode, 0, o);
    }
    
    @Override
    public final int d() {
        return this.w;
    }
    
    public k3h g() {
        return new k3h(this);
    }
    
    public Object get(final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.v.g(hashCode, 0, o);
    }
    
    public /* bridge */ k3h j() {
        return this.g();
    }
    
    public final g3h m(final Object o, final pgd pgd) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final ci6 u = this.v.u(hashCode, 0, o, pgd);
        if (u == null) {
            return this;
        }
        return new g3h((fgo)u.b, this.w + (u.a ? 1 : 0));
    }
}
