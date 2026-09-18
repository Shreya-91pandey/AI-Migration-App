import java.util.Map;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.LinkedHashMap;

public final class fui
{
    public final LinkedHashMap a;
    public long b;
    public long c;
    public final gui d;
    
    public fui(final gui d, final long b) {
        this.d = d;
        this.a = new LinkedHashMap(0, 0.75f, true);
        this.b = b;
        if (b > 0L) {
            return;
        }
        en9.s("maxSize <= 0");
        throw null;
    }
    
    public final void a(final Object o, final Object o2, final eui eui) {
        final vse vse = (vse)o;
        final eui eui2 = (eui)o2;
        ((qd6)this.d.b).x(vse, eui2.b(), eui2.a(), eui2.c());
    }
    
    public final long b() {
        final long c = this.c;
        if (c == -1L) {
            final Iterator iterator = ((Iterable)this.a.entrySet()).iterator();
            long c2 = 0L;
            while (iterator.hasNext()) {
                final Map$Entry map$Entry = (Map$Entry)iterator.next();
                c2 += this.c(map$Entry.getKey(), map$Entry.getValue());
            }
            return this.c = c2;
        }
        return c;
    }
    
    public final long c(final Object o, Object o2) {
        try {
            final vse vse = (vse)o;
            final long c = ((eui)o2).c();
            if (c >= 0L) {
                return c;
            }
            final StringBuilder sb = new StringBuilder("sizeOf(");
            sb.append(o);
            sb.append(", ");
            sb.append(o2);
            sb.append(") returned a negative value: ");
            sb.append(c);
            o2 = new IllegalStateException(sb.toString().toString());
            throw o2;
        }
        catch (final Exception ex) {
            this.c = -1L;
            throw ex;
        }
    }
    
    public final void d(final long n) {
        while (this.b() > n) {
            final LinkedHashMap a = this.a;
            if (((Map)a).isEmpty()) {
                if (this.b() == 0L) {
                    break;
                }
                en9.q("sizeOf() is returning inconsistent values");
            }
            else {
                final Map$Entry map$Entry = (Map$Entry)c86.F0((Iterable)a.entrySet());
                final Object key = map$Entry.getKey();
                final Object value = map$Entry.getValue();
                ((Map)a).remove(key);
                this.c = this.b() - this.c(key, value);
                this.a(key, value, null);
            }
        }
    }
}
