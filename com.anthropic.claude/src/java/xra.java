import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashMap;

public final class xra extends tcp
{
    public static final a70 h;
    public final HashMap b;
    public final HashMap c;
    public final HashMap d;
    public final boolean e;
    public boolean f;
    public boolean g;
    
    static {
        h = new a70((byte)1);
    }
    
    public xra(final boolean e) {
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = false;
        this.g = false;
        this.e = e;
    }
    
    @Override
    public final void d() {
        if (vra.I(3)) {
            this.toString();
        }
        this.f = true;
    }
    
    public final void e(final String s, final boolean b) {
        final HashMap c = this.c;
        final xra xra = (xra)c.get((Object)s);
        if (xra != null) {
            if (b) {
                final ArrayList list = new ArrayList();
                list.addAll((Collection)xra.c.keySet());
                for (final String s2 : list) {
                    vra.I(3);
                    xra.e(s2, true);
                }
            }
            xra.d();
            c.remove((Object)s);
        }
        final HashMap d = this.d;
        final xcp xcp = (xcp)d.get((Object)s);
        if (xcp != null) {
            xcp.a();
            d.remove((Object)s);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o != null) {
                if (xra.class == o.getClass()) {
                    final xra xra = (xra)o;
                    if (this.b.equals(xra.b) && this.c.equals(xra.c) && this.d.equals(xra.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public final void f(final hra hra) {
        if (this.g) {
            vra.I(2);
            return;
        }
        if (this.b.remove((Object)hra.z) != null && vra.I(2)) {
            hra.toString();
        }
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + this.b.hashCode() * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode((Object)this)));
        sb.append("} Fragments (");
        final Iterator iterator = this.b.values().iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        final Iterator iterator2 = this.c.keySet().iterator();
        while (iterator2.hasNext()) {
            sb.append((String)iterator2.next());
            if (iterator2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        final Iterator iterator3 = this.d.keySet().iterator();
        while (iterator3.hasNext()) {
            sb.append((String)iterator3.next());
            if (iterator3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
