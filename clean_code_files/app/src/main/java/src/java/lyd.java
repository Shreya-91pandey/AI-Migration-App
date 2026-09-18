import java.util.AbstractMap;
import java.util.Set;
import java.util.Map$Entry;

public class lyd
{
    public final int a;
    public final myd b;
    public final wab c;
    public int d;
    public int e;
    public int f;
    
    public lyd(final int a) {
        this.a = a;
        if (a > 0) {
            this.b = new myd((byte)0);
            this.c = new wab((byte)18);
            return;
        }
        qiq.r("maxSize <= 0");
        throw null;
    }
    
    public Object a(final Object o) {
        return null;
    }
    
    public void b(final Object o, final Object o2, final Object o3) {
    }
    
    public final Object c(final Object o) {
        final wab c;
        monitorenter(c = this.c);
        Label_0169: {
            try {
                final Object value = this.b.a.get(o);
                if (value != null) {
                    ++this.e;
                    monitorexit(c);
                    return value;
                }
            }
            finally {
                break Label_0169;
            }
            ++this.f;
            monitorexit(c);
            final Throwable t;
            final Object a = this.a(t);
            if (a == null) {
                return null;
            }
            final wab c2;
            monitorenter(c2 = this.c);
            Label_0164: {
                Object put = null;
                final Throwable t2;
                Label_0135: {
                    try {
                        put = ((AbstractMap)this.b.a).put((Object)t, a);
                        if (put != null) {
                            ((AbstractMap)this.b.a).put((Object)t, put);
                            break Label_0135;
                        }
                    }
                    finally {
                        break Label_0164;
                    }
                    this.d += this.f(t2, a);
                }
                monitorexit(c2);
                if (put != null) {
                    this.b(t2, a, put);
                    return put;
                }
                this.h(this.a);
                return a;
            }
            monitorexit(c2);
        }
        monitorexit(c);
    }
    
    public final Object d(final Object o, final Object o2) {
        final wab c;
        monitorenter(c = this.c);
        Label_0094: {
            Object put;
            try {
                this.d += this.f(o, o2);
                put = ((AbstractMap)this.b.a).put(o, o2);
                if (put != null) {
                    this.d -= this.f(o, put);
                }
            }
            finally {
                break Label_0094;
            }
            monitorexit(c);
            if (put != null) {
                final Throwable t;
                this.b(t, put, o2);
            }
            this.h(this.a);
            return put;
        }
        monitorexit(c);
    }
    
    public final Object e(final Object o) {
        final wab c;
        monitorenter(c = this.c);
        Label_0064: {
            Object remove;
            try {
                remove = ((AbstractMap)this.b.a).remove(o);
                if (remove != null) {
                    this.d -= this.f(o, remove);
                }
            }
            finally {
                break Label_0064;
            }
            monitorexit(c);
            if (remove != null) {
                final Throwable t;
                this.b(t, remove, null);
            }
            return remove;
        }
        monitorexit(c);
    }
    
    public final int f(final Object o, final Object o2) {
        final int g = this.g(o, o2);
        if (g >= 0) {
            return g;
        }
        final StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(o);
        sb.append('=');
        sb.append(o2);
        qiq.s(sb.toString());
        throw null;
    }
    
    public int g(final Object o, final Object o2) {
        return 1;
    }
    
    public final void h(final int n) {
        while (true) {
            final wab c;
            monitorenter(c = this.c);
            Label_0175: {
                Label_0168: {
                    try {
                        if (this.d < 0) {
                            break Label_0168;
                        }
                        if (((AbstractMap)this.b.a).isEmpty()) {
                            if (this.d != 0) {
                                break Label_0168;
                            }
                        }
                    }
                    finally {
                        break Label_0175;
                    }
                    if (this.d <= n || ((AbstractMap)this.b.a).isEmpty()) {
                        monitorexit(c);
                        return;
                    }
                    final Set entrySet = this.b.a.entrySet();
                    entrySet.getClass();
                    final Map$Entry map$Entry = (Map$Entry)c86.H0((Iterable)entrySet);
                    if (map$Entry == null) {
                        monitorexit(c);
                        return;
                    }
                    final Object key = map$Entry.getKey();
                    final Object value = map$Entry.getValue();
                    ((AbstractMap)this.b.a).remove(key);
                    this.d -= this.f(key, value);
                    monitorexit(c);
                    this.b(key, value, null);
                    continue;
                }
                qiq.s("LruCache.sizeOf() is reporting inconsistent results!");
                throw null;
            }
            monitorexit(c);
        }
    }
    
    @Override
    public final String toString() {
        final wab c;
        monitorenter(c = this.c);
        Label_0137: {
            int e = 0;
            Label_0043: {
                try {
                    e = this.e;
                    final int n = this.f + e;
                    if (n != 0) {
                        e = e * 100 / n;
                        break Label_0043;
                    }
                }
                finally {
                    break Label_0137;
                }
                e = 0;
            }
            final StringBuilder sb = new StringBuilder("LruCache[maxSize=");
            sb.append(this.a);
            sb.append(",hits=");
            sb.append(this.e);
            sb.append(",misses=");
            sb.append(this.f);
            sb.append(",hitRate=");
            sb.append(e);
            sb.append("%]");
            final String string = sb.toString();
            monitorexit(c);
            return string;
        }
        monitorexit(c);
    }
}
