import java.util.Collection;
import java.util.Set;
import java.util.Map;

public class k3h extends l2 implements Map, wtc
{
    public int A;
    public g3h v;
    public eup w;
    public fgo x;
    public Object y;
    public int z;
    
    public k3h(final g3h v) {
        this.v = v;
        this.w = new eup((byte)18);
        this.x = v.v;
        this.A = v.w;
    }
    
    @Override
    public final Set a() {
        return (Set)new o3h(this, (byte)0);
    }
    
    @Override
    public final Set c() {
        return (Set)new o3h(this, (byte)1);
    }
    
    public final void clear() {
        this.x = fgo.e;
        this.m(0);
    }
    
    public boolean containsKey(final Object o) {
        final fgo x = this.x;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return x.d(hashCode, 0, o);
    }
    
    public final int d() {
        return this.A;
    }
    
    @Override
    public final Collection f() {
        return (Collection)new t3h((l2)this, (byte)1);
    }
    
    public g3h g() {
        final fgo x = this.x;
        g3h v = this.v;
        if (x != v.v) {
            this.w = new eup((byte)18);
            v = new g3h(this.x, this.A);
        }
        return this.v = v;
    }
    
    public Object get(final Object o) {
        final fgo x = this.x;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return x.g(hashCode, 0, o);
    }
    
    public /* bridge */ g3h j() {
        return this.g();
    }
    
    public final void m(final int a) {
        this.A = a;
        ++this.z;
    }
    
    public final Object put(final Object o, final Object o2) {
        this.y = null;
        final fgo x = this.x;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        this.x = x.l(hashCode, o, o2, 0, this);
        return this.y;
    }
    
    public final void putAll(final Map map) {
        final boolean b = map instanceof g3h;
        final g3h g3h = null;
        g3h g;
        if (b) {
            g = (g3h)map;
        }
        else {
            g = null;
        }
        if (g == null) {
            k3h k3h;
            if (map instanceof k3h) {
                k3h = (k3h)map;
            }
            else {
                k3h = null;
            }
            g = g3h;
            if (k3h != null) {
                g = k3h.g();
            }
        }
        if (g != null) {
            final Object o = new Object();
            ((uc8)o).a = 0;
            final int a = this.A;
            this.x = this.x.m(g.v, 0, (uc8)o, this);
            final int n = g.w + a - ((uc8)o).a;
            if (a != n) {
                this.m(n);
            }
            return;
        }
        super.putAll(map);
    }
    
    public Object remove(final Object o) {
        this.y = null;
        final fgo x = this.x;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        fgo x2;
        if ((x2 = x.n(hashCode, o, 0, this)) == null) {
            x2 = fgo.e;
        }
        this.x = x2;
        return this.y;
    }
    
    public final boolean remove(final Object o, final Object o2) {
        final int a = this.A;
        final fgo x = this.x;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        fgo x2;
        if ((x2 = x.o(hashCode, o, o2, 0, this)) == null) {
            x2 = fgo.e;
        }
        this.x = x2;
        return a != this.A;
    }
}
