import java.util.Map;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map$Entry;
import androidx.datastore.preferences.protobuf.f;
import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.e;

public final class d9a
{
    public static final int c = 0;
    public final h6m a;
    public boolean b;
    
    static {
        new d9a(0);
    }
    
    public d9a() {
        this.a = h6m.j();
    }
    
    public d9a(final int n) {
        final h6m j = h6m.j();
        this.a = j;
        this.a();
        this.a();
    }
    
    public static void b(final e e, final w3q w3q, int n, final Object o) {
        if (w3q == w3q.y) {
            final a a = (a)o;
            e.A(n, 3);
            ((f)a).l(e);
            e.A(n, 4);
            return;
        }
        e.A(n, (int)w3q.w);
        switch (w3q.ordinal()) {
            default: {
                return;
            }
            case 17: {
                final long longValue = (long)o;
                e.E(longValue >> 63 ^ longValue << 1);
                return;
            }
            case 16: {
                n = (int)o;
                e.C(n >> 31 ^ n << 1);
                return;
            }
            case 15: {
                e.u((long)o);
                return;
            }
            case 14: {
                e.s((int)o);
                return;
            }
            case 13: {
                e.w((int)o);
                return;
            }
            case 12: {
                e.C((int)o);
                return;
            }
            case 11: {
                if (o instanceof fs2) {
                    e.q((fs2)o);
                    return;
                }
                final byte[] array = (byte[])o;
                n = array.length;
                e.C(n);
                e.n(array, 0, n);
                return;
            }
            case 10: {
                final a a2 = (a)o;
                e.C(((f)a2).a((bdk)null));
                ((f)a2).l(e);
                return;
            }
            case 9: {
                ((f)o).l(e);
                return;
            }
            case 8: {
                if (o instanceof fs2) {
                    e.q((fs2)o);
                    return;
                }
                e.z((String)o);
                return;
            }
            case 7: {
                e.m((byte)(byte)(((boolean)o) ? 1 : 0));
                return;
            }
            case 6: {
                e.s((int)o);
                return;
            }
            case 5: {
                e.u((long)o);
                return;
            }
            case 4: {
                e.w((int)o);
                return;
            }
            case 3: {
                e.E((long)o);
                return;
            }
            case 2: {
                e.E((long)o);
                return;
            }
            case 1: {
                e.s(Float.floatToRawIntBits((float)o));
                return;
            }
            case 0: {
                e.u(Double.doubleToRawLongBits((double)o));
            }
        }
    }
    
    public final void a() {
        if (this.b) {
            return;
        }
        final h6m a = this.a;
        for (int w = a.w, i = 0; i < w; ++i) {
            final Object value = a.d(i).getValue();
            if (value instanceof f) {
                ((f)value).g();
            }
        }
        final Iterator iterator = ((Iterable)a.f()).iterator();
        while (iterator.hasNext()) {
            final Object value2 = ((Map$Entry)iterator.next()).getValue();
            if (value2 instanceof f) {
                ((f)value2).g();
            }
        }
        if (!a.y) {
            if (a.w > 0) {
                a.d(0).getKey().getClass();
                fvd.c();
                return;
            }
            final Iterator iterator2 = ((Iterable)a.f()).iterator();
            if (iterator2.hasNext()) {
                ((Map$Entry)iterator2.next()).getKey().getClass();
                fvd.c();
                return;
            }
        }
        if (!a.y) {
            Map x;
            if (a.x.isEmpty()) {
                x = Collections.EMPTY_MAP;
            }
            else {
                x = Collections.unmodifiableMap(a.x);
            }
            a.x = x;
            Map a2;
            if (a.A.isEmpty()) {
                a2 = Collections.EMPTY_MAP;
            }
            else {
                a2 = Collections.unmodifiableMap(a.A);
            }
            a.A = a2;
            a.y = true;
        }
        this.b = true;
    }
    
    public final Object clone() {
        final d9a d9a = new d9a();
        final h6m a = this.a;
        if (a.w > 0) {
            ge9.C(a.d(0).getKey());
            throw null;
        }
        final Iterator iterator = ((Iterable)a.f()).iterator();
        if (!iterator.hasNext()) {
            return d9a;
        }
        final Map$Entry map$Entry = (Map$Entry)iterator.next();
        ge9.C(map$Entry.getKey());
        map$Entry.getValue();
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof d9a && this.a.equals(((d9a)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
}
