import java.util.Map;
import java.util.Iterator;
import java.util.Collection;

public final class n4h extends g3 implements v5c, Collection, stc
{
    public static final n4h y;
    public final Object v;
    public final Object w;
    public final g3h x;
    
    static {
        final wab p = wab.P;
        y = new n4h(p, p, g3h.x);
    }
    
    public n4h(final Object v, final Object w, final g3h x) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final int a() {
        return this.x.d();
    }
    
    public final boolean contains(final Object o) {
        return this.x.containsKey(o);
    }
    
    public final n4h d(final Object o) {
        final g3h x = this.x;
        if (x.containsKey(o)) {
            return this;
        }
        if (this.isEmpty()) {
            return new n4h(o, o, x.m(o, new pgd()));
        }
        final Object w = this.w;
        final Object value = x.get(w);
        value.getClass();
        return new n4h(this.v, o, x.m(w, new pgd(((pgd)value).a, o)).m(o, new pgd(w)));
    }
    
    public final Iterator iterator() {
        return (Iterator)new k4h(this.v, (Map)this.x, (byte)2);
    }
    
    public final n4h j(Object o) {
        final g3h x = this.x;
        final pgd pgd = (pgd)x.get(o);
        if (pgd == null) {
            return this;
        }
        Object o2 = pgd.a;
        final Object b = pgd.b;
        final fgo v = x.v;
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        final fgo v2 = v.v(hashCode, 0, o);
        if (v == v2) {
            o = x;
        }
        else if (v2 == null) {
            o = g3h.x;
        }
        else {
            o = new g3h(v2, x.w - 1);
        }
        final wab p = wab.P;
        Object m = o;
        if (o2 != p) {
            final Object value = ((Map)o).get(o2);
            value.getClass();
            m = ((g3h)o).m(o2, new pgd(((pgd)value).a, b));
        }
        o = m;
        if (b != p) {
            o = ((Map)m).get(b);
            o.getClass();
            o = ((g3h)m).m(b, new pgd(o2, ((pgd)o).b));
        }
        Object v3;
        if (o2 != p) {
            v3 = this.v;
        }
        else {
            v3 = b;
        }
        if (b != p) {
            o2 = this.w;
        }
        return new n4h(v3, o2, (g3h)o);
    }
}
