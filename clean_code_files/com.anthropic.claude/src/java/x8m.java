import java.util.Collection;
import java.util.Set;
import java.util.Map;

public final class x8m implements jpm, Map, wtc
{
    public w8m v;
    public final h8m w;
    public final h8m x;
    public final h8m y;
    
    public x8m() {
        final g3h x = g3h.x;
        final r7m h = g8m.h();
        final w8m v = new w8m(h.g(), x);
        if (!(h instanceof b3b)) {
            v.b = new w8m(1L, x);
        }
        this.v = v;
        this.w = new h8m(this, (byte)0);
        this.x = new h8m(this, (byte)1);
        this.y = new h8m(this, (byte)2);
    }
    
    public static boolean c(final w8m w8m, final int n, final g3h c) {
        final Object b;
        monitorenter(b = twl.B);
        Label_0052: {
            boolean b2 = false;
            Label_0046: {
                try {
                    final int d = w8m.d;
                    if (d == n) {
                        w8m.c = c;
                        b2 = true;
                        w8m.d = d + 1;
                        break Label_0046;
                    }
                }
                finally {
                    break Label_0052;
                }
                b2 = false;
            }
            monitorexit(b);
            return b2;
        }
        monitorexit(b);
    }
    
    public final lpm a() {
        return this.v;
    }
    
    public final void clear() {
        final g3h c = ((w8m)g8m.f(this.v)).c;
        final g3h x = g3h.x;
        if (x != c) {
            final w8m v = this.v;
            final Object c2 = g8m.c;
            synchronized (c2) {
                final r7m h = g8m.h();
                final w8m w8m = (w8m)g8m.w(v, (jpm)this, h);
                final Object b = twl.B;
                synchronized (b) {
                    w8m.c = x;
                    ++w8m.d;
                    monitorexit(b);
                    monitorexit(c2);
                    g8m.l(h, (jpm)this);
                }
            }
        }
    }
    
    public final boolean containsKey(final Object o) {
        return ((Map)this.g().c).containsKey(o);
    }
    
    public final boolean containsValue(final Object o) {
        return ((Map)this.g().c).containsValue(o);
    }
    
    public final Set entrySet() {
        return (Set)this.w;
    }
    
    public final void f(final lpm lpm) {
        this.v = (w8m)lpm;
    }
    
    public final w8m g() {
        return (w8m)g8m.s(this.v, (jpm)this);
    }
    
    public final Object get(final Object o) {
        return ((Map)this.g().c).get(o);
    }
    
    public final boolean isEmpty() {
        return ((Map)this.g().c).isEmpty();
    }
    
    public final Set keySet() {
        return (Set)this.x;
    }
    
    public final Object put(final Object o, final Object o2) {
        while (true) {
            final Object b = twl.B;
            synchronized (b) {
                final w8m w8m = (w8m)g8m.f(this.v);
                final g3h c = w8m.c;
                final int d = w8m.d;
                monitorexit(b);
                c.getClass();
                final k3h j = c.j();
                final Object put = j.put(o, o2);
                final g3h i = j.j();
                if (!mlc.q((Object)i, (Object)c)) {
                    final w8m v = this.v;
                    final Object c2 = g8m.c;
                    synchronized (c2) {
                        final r7m h = g8m.h();
                        final boolean c3 = c((w8m)g8m.w(v, (jpm)this, h), d, i);
                        monitorexit(c2);
                        g8m.l(h, (jpm)this);
                        if (!c3) {
                            continue;
                        }
                    }
                }
                return put;
            }
        }
    }
    
    public final void putAll(final Map map) {
        while (true) {
            final Object b = twl.B;
            synchronized (b) {
                final w8m w8m = (w8m)g8m.f(this.v);
                final g3h c = w8m.c;
                final int d = w8m.d;
                monitorexit(b);
                c.getClass();
                final k3h j = c.j();
                j.putAll(map);
                final g3h i = j.j();
                if (!mlc.q((Object)i, (Object)c)) {
                    final w8m v = this.v;
                    final Object c2;
                    monitorenter(c2 = g8m.c);
                    try {
                        final r7m h = g8m.h();
                        final boolean c3 = c((w8m)g8m.w(v, (jpm)this, h), d, i);
                        monitorexit(c2);
                        g8m.l(h, (jpm)this);
                        if (!c3) {
                            continue;
                        }
                    }
                    finally {}
                }
            }
        }
    }
    
    public final Object remove(final Object o) {
        while (true) {
            final Object b = twl.B;
            synchronized (b) {
                final w8m w8m = (w8m)g8m.f(this.v);
                final g3h c = w8m.c;
                final int d = w8m.d;
                monitorexit(b);
                c.getClass();
                final k3h j = c.j();
                final Object remove = ((Map)j).remove(o);
                final g3h i = j.j();
                if (!mlc.q((Object)i, (Object)c)) {
                    final w8m v = this.v;
                    final Object c2 = g8m.c;
                    synchronized (c2) {
                        final r7m h = g8m.h();
                        final boolean c3 = c((w8m)g8m.w(v, (jpm)this, h), d, i);
                        monitorexit(c2);
                        g8m.l(h, (jpm)this);
                        if (!c3) {
                            continue;
                        }
                    }
                }
                return remove;
            }
        }
    }
    
    public final int size() {
        return ((Map)this.g().c).size();
    }
    
    @Override
    public final String toString() {
        final g3h c = ((w8m)g8m.f(this.v)).c;
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("SnapshotStateMap(value=");
        sb.append((Object)c);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final Collection values() {
        return (Collection)this.y;
    }
}
