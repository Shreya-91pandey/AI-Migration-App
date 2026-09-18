import java.util.AbstractSet;
import java.util.AbstractCollection;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Collection;
import android.os.Parcelable$Creator;
import java.util.RandomAccess;
import java.util.Set;
import android.os.Parcelable;

public final class a9m implements Parcelable, jpm, Set, RandomAccess, xtc
{
    public static final Parcelable$Creator<a9m> CREATOR;
    public npm v;
    
    static {
        CREATOR = (Parcelable$Creator)new jsg((byte)1);
    }
    
    public a9m() {
        final n4h y = n4h.y;
        final npm v = new npm(g8m.h().g(), y);
        if (g8m.b.get() != null) {
            v.b = new npm(1L, y);
        }
        this.v = v;
    }
    
    public final lpm a() {
        return this.v;
    }
    
    public final boolean add(final Object o) {
        while (true) {
            final Object c = r9n.c;
            synchronized (c) {
                final npm npm = (npm)g8m.f(this.v);
                final int d = npm.d;
                final n4h c2 = npm.c;
                monitorexit(c);
                c2.getClass();
                final n4h d2 = c2.d(o);
                if (d2.equals(c2)) {
                    return false;
                }
                final npm v = this.v;
                final Object c3 = g8m.c;
                synchronized (c3) {
                    final r7m h = g8m.h();
                    final boolean e = r9n.e((npm)g8m.w(v, (jpm)this, h), d, d2);
                    monitorexit(c3);
                    g8m.l(h, (jpm)this);
                    if (e) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean addAll(final Collection collection) {
        while (true) {
            final Object c = r9n.c;
            synchronized (c) {
                final npm npm = (npm)g8m.f(this.v);
                final int d = npm.d;
                final n4h c2 = npm.c;
                monitorexit(c);
                c2.getClass();
                final p4h p4h = new p4h(c2);
                ((AbstractCollection)p4h).addAll(collection);
                final n4h d2 = p4h.d();
                if (d2.equals(c2)) {
                    return false;
                }
                final npm v = this.v;
                final Object c3 = g8m.c;
                synchronized (c3) {
                    final r7m h = g8m.h();
                    final boolean e = r9n.e((npm)g8m.w(v, (jpm)this, h), d, d2);
                    monitorexit(c3);
                    g8m.l(h, (jpm)this);
                    if (e) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final void clear() {
        final npm v = this.v;
        final Object c;
        monitorenter(c = g8m.c);
        Object c2 = null;
        Label_0080: {
            r7m h;
            npm npm;
            Object o;
            try {
                h = g8m.h();
                npm = (npm)g8m.w(v, (jpm)this, h);
                c2 = r9n.c;
                monitorenter(o = c2);
                final npm npm2 = npm;
                final n4h n4h = n4h.y;
                npm2.c = n4h;
                final npm npm3 = npm;
                final npm npm4 = npm;
                final int n = npm4.d;
                final int n2 = 1;
                final int n3 = n + n2;
                npm3.d = n3;
                final Object o2 = o;
                monitorexit(o2);
                final Object o3 = c;
                monitorexit(o3);
                final r7m r7m = h;
                final a9m a9m = this;
                g8m.l(r7m, (jpm)a9m);
                return;
            }
            finally {
                final Object o4;
                c2 = o4;
                break Label_0080;
            }
            try {
                final npm npm2 = npm;
                final n4h n4h = n4h.y;
                npm2.c = n4h;
                final npm npm3 = npm;
                final npm npm4 = npm;
                final int n = npm4.d;
                final int n2 = 1;
                final int n3 = n + n2;
                npm3.d = n3;
                final Object o2 = o;
                monitorexit(o2);
                final Object o3 = c;
                monitorexit(o3);
                final r7m r7m = h;
                final a9m a9m = this;
                g8m.l(r7m, (jpm)a9m);
                return;
            }
            finally {
                monitorexit(o);
            }
        }
        monitorexit(c);
        throw c2;
    }
    
    public final boolean contains(final Object o) {
        return ((Set)r9n.E(this).c).contains(o);
    }
    
    public final boolean containsAll(final Collection collection) {
        return ((Set)r9n.E(this).c).containsAll(collection);
    }
    
    public final int describeContents() {
        return 0;
    }
    
    public final void f(final lpm lpm) {
        lpm.b = this.v;
        this.v = (npm)lpm;
    }
    
    public final boolean isEmpty() {
        return ((Set)r9n.E(this).c).isEmpty();
    }
    
    public final Iterator iterator() {
        return (Iterator)new mpm(this, ((Set)((npm)g8m.s(this.v, (jpm)this)).c).iterator());
    }
    
    public final boolean remove(final Object o) {
        while (true) {
            final Object c = r9n.c;
            synchronized (c) {
                final npm npm = (npm)g8m.f(this.v);
                final int d = npm.d;
                final n4h c2 = npm.c;
                monitorexit(c);
                c2.getClass();
                final n4h j = c2.j(o);
                if (j.equals(c2)) {
                    return false;
                }
                final npm v = this.v;
                final Object c3 = g8m.c;
                synchronized (c3) {
                    final r7m h = g8m.h();
                    final boolean e = r9n.e((npm)g8m.w(v, (jpm)this, h), d, j);
                    monitorexit(c3);
                    g8m.l(h, (jpm)this);
                    if (e) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean removeAll(final Collection collection) {
        while (true) {
            final Object c = r9n.c;
            synchronized (c) {
                final npm npm = (npm)g8m.f(this.v);
                final int d = npm.d;
                final n4h c2 = npm.c;
                monitorexit(c);
                c2.getClass();
                final p4h p4h = new p4h(c2);
                ((AbstractSet)p4h).removeAll(collection);
                final n4h d2 = p4h.d();
                if (d2.equals(c2)) {
                    return false;
                }
                final npm v = this.v;
                synchronized (g8m.c) {
                    final r7m h = g8m.h();
                    final boolean e = r9n.e((npm)g8m.w(v, (jpm)this, h), d, d2);
                    monitorexit(c);
                    g8m.l(h, (jpm)this);
                    if (e) {
                        return true;
                    }
                    continue;
                }
            }
        }
    }
    
    public final boolean retainAll(final Collection collection) {
        final n2 n2 = new n2(collection, (byte)4);
        while (true) {
            final Object c = r9n.c;
            synchronized (c) {
                final npm npm = (npm)g8m.f(this.v);
                final int d = npm.d;
                final n4h c2 = npm.c;
                monitorexit(c);
                if (c2 != null) {
                    final p4h p4h = new p4h(c2);
                    final Object b = n2.b((Object)p4h);
                    final n4h d2 = p4h.d();
                    if (!d2.equals(c2)) {
                        final npm v = this.v;
                        final Object c3 = g8m.c;
                        synchronized (c3) {
                            final r7m h = g8m.h();
                            final boolean e = r9n.e((npm)g8m.w(v, (jpm)this, h), d, d2);
                            monitorexit(c3);
                            g8m.l(h, (jpm)this);
                            if (!e) {
                                continue;
                            }
                        }
                    }
                    return (boolean)b;
                }
                en9.q("No set to mutate");
                return false;
            }
        }
    }
    
    public final int size() {
        return ((Set)r9n.E(this).c).size();
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
    
    @Override
    public final String toString() {
        final n4h c = ((npm)g8m.f(this.v)).c;
        final int hashCode = this.hashCode();
        final StringBuilder sb = new StringBuilder("SnapshotStateSet(value=");
        sb.append((Object)c);
        sb.append(")@");
        sb.append(hashCode);
        return sb.toString();
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        final n4h c = r9n.E(this).c;
        parcel.writeInt(this.size());
        final Iterator iterator = ((Set)c).iterator();
        if (iterator.hasNext()) {
            parcel.writeValue(iterator.next());
        }
    }
}
