import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Iterator;
import java.util.Collections;
import java.util.Arrays;
import java.util.Map$Entry;
import java.util.Map;
import java.util.LinkedHashMap;

public final class mmf
{
    public final LinkedHashMap a;
    public final jy7 b;
    
    public mmf(final LinkedHashMap a, final boolean b) {
        this.a = a;
        this.b = new jy7(b);
    }
    
    public final Map a() {
        final Iterable iterable = (Iterable)this.a.entrySet();
        int v;
        if ((v = z5e.V(d86.p0(iterable, 10))) < 16) {
            v = 16;
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap(v);
        for (final Map$Entry map$Entry : iterable) {
            final Object value = map$Entry.getValue();
            yog yog;
            if (value instanceof byte[]) {
                final Object key = map$Entry.getKey();
                final byte[] array = (byte[])value;
                yog = new yog(key, (Object)Arrays.copyOf(array, array.length));
            }
            else {
                yog = new yog(map$Entry.getKey(), map$Entry.getValue());
            }
            ((Map)linkedHashMap).put(yog.v, yog.w);
        }
        final Map unmodifiableMap = Collections.unmodifiableMap((Map)linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }
    
    public final void b() {
        if (!((AtomicBoolean)this.b.w).get()) {
            return;
        }
        en9.q("Do mutate preferences once returned to DataStore.");
    }
    
    public final Object c(final kjh kjh) {
        Object o2;
        final Object o = o2 = this.a.get((Object)kjh);
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            o2 = Arrays.copyOf(array, array.length);
        }
        return o2;
    }
    
    public final void d(final kjh kjh) {
        this.b();
        ((Map)this.a).remove((Object)kjh);
    }
    
    public final void e(final kjh kjh, final Object o) {
        this.b();
        if (o == null) {
            this.d(kjh);
            return;
        }
        final boolean b = o instanceof Set;
        final LinkedHashMap a = this.a;
        if (b) {
            final Set unmodifiableSet = Collections.unmodifiableSet(c86.w1((Iterable)o));
            unmodifiableSet.getClass();
            ((Map)a).put((Object)kjh, (Object)unmodifiableSet);
            return;
        }
        if (o instanceof byte[]) {
            final byte[] array = (byte[])o;
            ((Map)a).put((Object)kjh, (Object)Arrays.copyOf(array, array.length));
            return;
        }
        ((Map)a).put((Object)kjh, o);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof mmf) {
            final LinkedHashMap a = ((mmf)o).a;
            final LinkedHashMap a2 = this.a;
            if (a != a2) {
                if (((Map)a).size() != ((Map)a2).size()) {
                    return false;
                }
                if (!((Map)a).isEmpty()) {
                    for (final Map$Entry map$Entry : a.entrySet()) {
                        final Object value = a2.get(map$Entry.getKey());
                        boolean q = false;
                        Label_0168: {
                            if (value != null) {
                                final Object value2 = map$Entry.getValue();
                                if (!(value2 instanceof byte[])) {
                                    q = mlc.q(value2, value);
                                    break Label_0168;
                                }
                                if (value instanceof byte[] && Arrays.equals((byte[])value2, (byte[])value)) {
                                    q = true;
                                    break Label_0168;
                                }
                            }
                            q = false;
                        }
                        if (!q) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public final mmf f() {
        return new mmf(new LinkedHashMap(this.a()), false);
    }
    
    public final mmf g() {
        return new mmf(new LinkedHashMap(this.a()), true);
    }
    
    @Override
    public final int hashCode() {
        final Iterator iterator = ((Iterable)this.a.entrySet()).iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object value = ((Map$Entry)iterator.next()).getValue();
            int n2;
            if (value instanceof byte[]) {
                n2 = Arrays.hashCode((byte[])value);
            }
            else {
                n2 = value.hashCode();
            }
            n += n2;
        }
        return n;
    }
    
    @Override
    public final String toString() {
        return c86.N0((Iterable)this.a.entrySet(), (CharSequence)",\n", "{\n", "\n}", (lta)new xre((byte)22), 24);
    }
}
