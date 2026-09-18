import java.util.AbstractList;
import android.os.Parcel;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Collection;
import android.os.Parcelable$Creator;
import java.util.RandomAccess;
import java.util.List;
import android.os.Parcelable;

public final class v8m implements Parcelable, jpm, List, RandomAccess, utc
{
    public static final Parcelable$Creator<v8m> CREATOR;
    public epm v;
    
    static {
        CREATOR = (Parcelable$Creator)new Object();
    }
    
    public v8m() {
        this(f6m.w);
    }
    
    public v8m(final p2 p) {
        final r7m h = g8m.h();
        final epm v = new epm(h.g(), p);
        if (!(h instanceof b3b)) {
            v.b = new epm(1L, p);
        }
        this.v = v;
    }
    
    public final lpm a() {
        return this.v;
    }
    
    public final void add(final int n, final Object o) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final p2 d2 = c.d(n, o);
                if (d2.equals(c)) {
                    return;
                }
                final epm v2 = this.v;
                v2.getClass();
                synchronized (g8m.c) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, d2, true);
                    monitorexit(f);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean add(final Object o) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final p2 j = c.j(o);
                if (j.equals(c)) {
                    return false;
                }
                final epm v2 = this.v;
                v2.getClass();
                synchronized (g8m.c) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, j, true);
                    monitorexit(f);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        return r6k.K(this, (lta)new l61(n, (Object)collection, (byte)9));
    }
    
    public final boolean addAll(final Collection collection) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final p2 m = c.m(collection);
                if (mlc.q((Object)m, (Object)c)) {
                    return false;
                }
                final epm v2 = this.v;
                v2.getClass();
                synchronized (g8m.c) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, m, true);
                    monitorexit(f);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final void clear() {
        final epm v = this.v;
        v.getClass();
        final Object c;
        monitorenter(c = g8m.c);
        Object f = null;
        Label_0097: {
            r7m h;
            epm epm;
            Object o;
            try {
                h = g8m.h();
                epm = (epm)g8m.w(v, (jpm)this, h);
                f = r6k.f;
                monitorenter(o = f);
                final epm epm2 = epm;
                final f6m f6m = f6m.w;
                epm2.c = f6m;
                final epm epm3 = epm;
                final epm epm4 = epm;
                final int n = epm4.d;
                final int n2 = 1;
                final int n3 = n + n2;
                epm3.d = n3;
                final epm epm5 = epm;
                final epm epm6 = epm;
                final int n4 = epm6.e;
                final int n5 = 1;
                final int n6 = n4 + n5;
                epm5.e = n6;
                final Object o2 = o;
                monitorexit(o2);
                final Object o3 = c;
                monitorexit(o3);
                final r7m r7m = h;
                final v8m v8m = this;
                g8m.l(r7m, (jpm)v8m);
                return;
            }
            finally {
                final Object o4;
                f = o4;
                break Label_0097;
            }
            try {
                final epm epm2 = epm;
                final f6m f6m = f6m.w;
                epm2.c = f6m;
                final epm epm3 = epm;
                final epm epm4 = epm;
                final int n = epm4.d;
                final int n2 = 1;
                final int n3 = n + n2;
                epm3.d = n3;
                final epm epm5 = epm;
                final epm epm6 = epm;
                final int n4 = epm6.e;
                final int n5 = 1;
                final int n6 = n4 + n5;
                epm5.e = n6;
                final Object o2 = o;
                monitorexit(o2);
                final Object o3 = c;
                monitorexit(o3);
                final r7m r7m = h;
                final v8m v8m = this;
                g8m.l(r7m, (jpm)v8m);
                return;
            }
            finally {
                monitorexit(o);
            }
        }
        monitorexit(c);
        throw f;
    }
    
    public final boolean contains(final Object o) {
        return r6k.w(this).c.contains(o);
    }
    
    public final boolean containsAll(final Collection collection) {
        return r6k.w(this).c.containsAll(collection);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void f(final lpm lpm) {
        lpm.b = this.v;
        this.v = (epm)lpm;
    }
    
    public final Object get(final int n) {
        return ((List)r6k.w(this).c).get(n);
    }
    
    public final int indexOf(final Object o) {
        return ((List)r6k.w(this).c).indexOf(o);
    }
    
    public final boolean isEmpty() {
        return r6k.w(this).c.isEmpty();
    }
    
    public final Iterator iterator() {
        return (Iterator)this.listIterator();
    }
    
    public final void j(final int n, final int n2) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final v4h o = c.o();
                ((AbstractList)o).subList(n, n2).clear();
                final p2 j = o.j();
                if (!mlc.q((Object)j, (Object)c)) {
                    final epm v2 = this.v;
                    v2.getClass();
                    monitorenter(g8m.c);
                    try {
                        final r7m h = g8m.h();
                        final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, j, true);
                        monitorexit(f);
                        g8m.l(h, (jpm)this);
                        if (!h2) {
                            continue;
                        }
                    }
                    finally {}
                }
            }
        }
    }
    
    public final int lastIndexOf(final Object o) {
        return ((List)r6k.w(this).c).lastIndexOf(o);
    }
    
    public final ListIterator listIterator() {
        return (ListIterator)new xgd(this, 0);
    }
    
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new xgd(this, n);
    }
    
    public final Object remove(final int n) {
        final Object value = this.get(n);
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final p2 s = c.s(n);
                if (s.equals(c)) {
                    return value;
                }
                final epm v2 = this.v;
                v2.getClass();
                final Object c2 = g8m.c;
                synchronized (c2) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, s, true);
                    monitorexit(c2);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return value;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean remove(final Object o) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final int index = c.indexOf(o);
                p2 s;
                if (index != -1) {
                    s = c.s(index);
                }
                else {
                    s = c;
                }
                if (s.equals(c)) {
                    return false;
                }
                final epm v2 = this.v;
                v2.getClass();
                final Object c2 = g8m.c;
                synchronized (c2) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, s, true);
                    monitorexit(c2);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean removeAll(final Collection collection) {
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final p2 r = c.r(new n2(collection, (byte)0));
                if (mlc.q((Object)r, (Object)c)) {
                    return false;
                }
                final epm v2 = this.v;
                v2.getClass();
                synchronized (g8m.c) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, r, true);
                    monitorexit(f);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean retainAll(final Collection collection) {
        return r6k.K(this, (lta)new n2(collection, (byte)3));
    }
    
    public final Object set(final int n, final Object o) {
        final Object value = this.get(n);
        while (true) {
            final Object f = r6k.f;
            synchronized (f) {
                final epm v = this.v;
                v.getClass();
                final epm epm = (epm)g8m.f(v);
                final int d = epm.d;
                final p2 c = epm.c;
                monitorexit(f);
                c.getClass();
                final p2 t = c.t(n, o);
                if (t.equals(c)) {
                    return value;
                }
                final epm v2 = this.v;
                v2.getClass();
                synchronized (g8m.c) {
                    final r7m h = g8m.h();
                    final boolean h2 = r6k.h((epm)g8m.w(v2, (jpm)this, h), d, t, false);
                    monitorexit(f);
                    g8m.l(h, (jpm)this);
                    if (h2) {
                        return value;
                    }
                    continue;
                }
            }
        }
    }
    
    public final int size() {
        return r6k.w(this).c.a();
    }
    
    public final List subList(final int n, final int n2) {
        if (n < 0 || n > n2 || n2 > this.size()) {
            pih.a("fromIndex or toIndex are out of bounds");
        }
        return (List)new z0n(this, n, n2);
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
    
    @Override
    public final String toString() {
        final epm v = this.v;
        v.getClass();
        final p2 c = ((epm)g8m.f(v)).c;
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("SnapshotStateList(value=");
        sb.append((Object)c);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, int i) {
        final p2 c = r6k.w(this).c;
        final int a = c.a();
        parcel.writeInt(a);
        for (i = 0; i < a; ++i) {
            parcel.writeValue(((List)c).get(i));
        }
    }
}
