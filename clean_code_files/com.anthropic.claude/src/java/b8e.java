import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;

public final class b8e extends j0
{
    public final byte v;
    public final Object w;
    
    @Override
    public final int a() {
        final byte v = this.v;
        final Object w = this.w;
        switch (v) {
            default: {
                return ((g3h)w).w;
            }
            case 0: {
                return ((c8e)w).a.groupCount() + 1;
            }
        }
    }
    
    @Override
    public final boolean contains(final Object o) {
        switch (this.v) {
            default: {
                return ((g3h)this.w).containsValue(o);
            }
            case 0: {
                return (o == null || o instanceof s7e) && super.contains(o);
            }
        }
    }
    
    public s7e d(final int n) {
        final Matcher a = ((c8e)this.w).a;
        final xgc t = ncq.T(a.start(n), a.end(n));
        if (((vgc)t).v >= 0) {
            final String group = a.group(n);
            group.getClass();
            return new s7e(group, t);
        }
        return null;
    }
    
    @Override
    public boolean isEmpty() {
        switch (this.v) {
            default: {
                return super.isEmpty();
            }
            case 0: {
                return false;
            }
        }
    }
    
    public final Iterator iterator() {
        final byte v = this.v;
        int i = 0;
        switch (v) {
            default: {
                final fgo v2 = ((g3h)this.w).v;
                final hgo[] array = new hgo[8];
                while (i < 8) {
                    array[i] = new jgo((byte)1);
                    ++i;
                }
                return (Iterator)new i3h(v2, array);
            }
            case 0: {
                return (Iterator)new reo(new lq8((uyk)new i86((Object)lq6.O((Collection)this), (byte)0), (lta)new tqb((Object)this, (byte)17), (byte)1));
            }
        }
    }
}
