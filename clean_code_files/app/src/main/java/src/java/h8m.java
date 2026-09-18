import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Iterator;
import java.util.Map$Entry;
import java.util.Collection;
import java.util.Set;

public final class h8m implements Set, xtc
{
    public final x8m v;
    public final byte w;
    
    public h8m(final x8m v, final byte w) {
        this.w = w;
        this.v = v;
    }
    
    private final boolean a(final Collection collection) {
        final Set w1 = c86.w1((Iterable)collection);
        final x8m v = this.v;
        boolean b = false;
        while (true) {
            final Object b2 = twl.B;
            synchronized (b2) {
                final w8m w8m = (w8m)g8m.f(v.v);
                final g3h c = w8m.c;
                final int d = w8m.d;
                monitorexit(b2);
                c.getClass();
                final k3h j = c.j();
                final Iterator iterator = v.w.iterator();
                boolean b3 = b;
                while (((g1)iterator).hasNext()) {
                    final Map$Entry map$Entry = (Map$Entry)((hpm)iterator).next();
                    if (!w1.contains(map$Entry.getKey())) {
                        ((Map)j).remove(map$Entry.getKey());
                        b3 = true;
                    }
                }
                final g3h i = j.j();
                if (!mlc.q((Object)i, (Object)c)) {
                    final w8m v2 = v.v;
                    final Object c2 = g8m.c;
                    synchronized (c2) {
                        final r7m h = g8m.h();
                        final boolean c3 = x8m.c((w8m)g8m.w(v2, (jpm)v, h), d, i);
                        monitorexit(c2);
                        g8m.l(h, (jpm)v);
                        b = b3;
                        if (!c3) {
                            continue;
                        }
                    }
                }
                return b3;
            }
        }
    }
    
    public final boolean add(final Object o) {
        switch (this.w) {
            default: {
                twl.Z();
                throw null;
            }
            case 1: {
                twl.Z();
                throw null;
            }
            case 0: {
                final Map$Entry map$Entry = (Map$Entry)o;
                twl.Z();
                throw null;
            }
        }
    }
    
    public final boolean addAll(final Collection collection) {
        switch (this.w) {
            default: {
                twl.Z();
                throw null;
            }
            case 1: {
                twl.Z();
                throw null;
            }
            case 0: {
                twl.Z();
                throw null;
            }
        }
    }
    
    public final void clear() {
        this.v.clear();
    }
    
    public final boolean contains(final Object o) {
        final byte w = this.w;
        final x8m v = this.v;
        switch (w) {
            default: {
                return v.containsValue(o);
            }
            case 1: {
                return v.containsKey(o);
            }
            case 0: {
                boolean q;
                if (o instanceof Map$Entry && (!(o instanceof stc) || o instanceof vtc)) {
                    final Map$Entry map$Entry = (Map$Entry)o;
                    q = mlc.q(v.get(map$Entry.getKey()), map$Entry.getValue());
                }
                else {
                    q = false;
                }
                return q;
            }
        }
    }
    
    public final boolean containsAll(final Collection collection) {
        final byte w = this.w;
        final x8m v = this.v;
        final boolean b = false;
        boolean b2 = false;
        final boolean b3 = false;
        switch (w) {
            default: {
                final Iterable iterable = (Iterable)collection;
                if (!(iterable instanceof Collection) || !((Collection)iterable).isEmpty()) {
                    final Iterator iterator = iterable.iterator();
                    while (iterator.hasNext()) {
                        if (!v.containsValue(iterator.next())) {
                            return b3;
                        }
                    }
                }
                return true;
            }
            case 1: {
                final Iterable iterable2 = (Iterable)collection;
                if (!(iterable2 instanceof Collection) || !((Collection)iterable2).isEmpty()) {
                    final Iterator iterator2 = iterable2.iterator();
                    while (iterator2.hasNext()) {
                        if (!v.containsKey(iterator2.next())) {
                            return b;
                        }
                    }
                }
                return true;
            }
            case 0: {
                final Iterable iterable3 = (Iterable)collection;
                if (!(iterable3 instanceof Collection) || !((Collection)iterable3).isEmpty()) {
                    final Iterator iterator3 = iterable3.iterator();
                    while (iterator3.hasNext()) {
                        if (!this.contains(iterator3.next())) {
                            return b2;
                        }
                    }
                }
                b2 = true;
                return b2;
            }
        }
    }
    
    public final boolean isEmpty() {
        return this.v.isEmpty();
    }
    
    public final Iterator iterator() {
        final byte w = this.w;
        final x8m v = this.v;
        switch (w) {
            default: {
                return (Iterator)new hpm(v, ((Set)((Map)v.g().c).entrySet()).iterator(), (byte)1);
            }
            case 1: {
                return (Iterator)new ipm(v, ((Set)((Map)v.g().c).entrySet()).iterator());
            }
            case 0: {
                return (Iterator)new hpm(v, ((Set)((Map)v.g().c).entrySet()).iterator(), (byte)0);
            }
        }
    }
    
    public final boolean remove(Object o) {
        final byte w = this.w;
        final boolean b = false;
        final boolean b2 = false;
        boolean b3 = false;
        final x8m v = this.v;
        switch (w) {
            default: {
                final Iterator iterator = v.w.iterator();
                while (true) {
                    while (((g1)iterator).hasNext()) {
                        final Object next = ((hpm)iterator).next();
                        if (mlc.q(((Map$Entry)next).getValue(), o)) {
                            o = next;
                            final Map$Entry map$Entry = (Map$Entry)o;
                            if (map$Entry != null) {
                                v.remove(map$Entry.getKey());
                                b3 = true;
                            }
                            return b3;
                        }
                    }
                    o = null;
                    continue;
                }
            }
            case 1: {
                boolean b4 = b;
                if (v.remove(o) != null) {
                    b4 = true;
                }
                return b4;
            }
            case 0: {
                boolean b5 = b2;
                if (o instanceof Map$Entry) {
                    if (o instanceof stc) {
                        b5 = b2;
                        if (!(o instanceof vtc)) {
                            return b5;
                        }
                    }
                    b5 = b2;
                    if (v.remove(((Map$Entry)o).getKey()) != null) {
                        b5 = true;
                    }
                }
                return b5;
            }
        }
    }
    
    public final boolean removeAll(final Collection collection) {
        final byte w = this.w;
        boolean b = false;
        switch (w) {
            default: {
                final Set w2 = c86.w1((Iterable)collection);
                final x8m v = this.v;
                while (true) {
                    final Object b2 = twl.B;
                    synchronized (b2) {
                        final w8m w8m = (w8m)g8m.f(v.v);
                        final g3h c = w8m.c;
                        final int d = w8m.d;
                        monitorexit(b2);
                        c.getClass();
                        final k3h j = c.j();
                        final Iterator iterator = v.w.iterator();
                        boolean b3 = b;
                        while (((g1)iterator).hasNext()) {
                            final Map$Entry map$Entry = (Map$Entry)((hpm)iterator).next();
                            if (w2.contains(map$Entry.getValue())) {
                                ((Map)j).remove(map$Entry.getKey());
                                b3 = true;
                            }
                        }
                        final g3h i = j.j();
                        if (!mlc.q((Object)i, (Object)c)) {
                            final w8m v2 = v.v;
                            final Object c2 = g8m.c;
                            synchronized (c2) {
                                final r7m h = g8m.h();
                                final boolean c3 = x8m.c((w8m)g8m.w(v2, (jpm)v, h), d, i);
                                monitorexit(c2);
                                g8m.l(h, (jpm)v);
                                b = b3;
                                if (!c3) {
                                    continue;
                                }
                            }
                        }
                        return b3;
                    }
                }
                break;
            }
            case 1: {
                final Iterator iterator2 = ((Iterable)collection).iterator();
                boolean b4 = false;
            Label_0273:
                while (true) {
                    b4 = false;
                    while (iterator2.hasNext()) {
                        if (this.v.remove(iterator2.next()) == null && !b4) {
                            continue Label_0273;
                        }
                        b4 = true;
                    }
                    break;
                }
                return b4;
            }
            case 0: {
                final Iterator iterator3 = collection.iterator();
                boolean b5 = false;
            Label_0322:
                while (true) {
                    b5 = false;
                    while (iterator3.hasNext()) {
                        if (this.v.remove(((Map$Entry)iterator3.next()).getKey()) == null && !b5) {
                            continue Label_0322;
                        }
                        b5 = true;
                    }
                    break;
                }
                return b5;
            }
        }
    }
    
    public final boolean retainAll(final Collection collection) {
        final byte w = this.w;
        boolean b = false;
        boolean b2 = false;
        switch (w) {
            default: {
                final Set w2 = c86.w1((Iterable)collection);
                final x8m v = this.v;
                while (true) {
                    final Object b3 = twl.B;
                    synchronized (b3) {
                        final w8m w8m = (w8m)g8m.f(v.v);
                        final g3h c = w8m.c;
                        final int d = w8m.d;
                        monitorexit(b3);
                        c.getClass();
                        final k3h j = c.j();
                        final Iterator iterator = v.w.iterator();
                        boolean b4 = b2;
                        while (((g1)iterator).hasNext()) {
                            final Map$Entry map$Entry = (Map$Entry)((hpm)iterator).next();
                            if (!w2.contains(map$Entry.getValue())) {
                                ((Map)j).remove(map$Entry.getKey());
                                b4 = true;
                            }
                        }
                        final g3h i = j.j();
                        if (!mlc.q((Object)i, (Object)c)) {
                            final w8m v2 = v.v;
                            final Object c2 = g8m.c;
                            synchronized (c2) {
                                final r7m h = g8m.h();
                                final boolean c3 = x8m.c((w8m)g8m.w(v2, (jpm)v, h), d, i);
                                monitorexit(c2);
                                g8m.l(h, (jpm)v);
                                b2 = b4;
                                if (!c3) {
                                    continue;
                                }
                            }
                        }
                        return b4;
                    }
                    return this.a(collection);
                }
                break;
            }
            case 1: {
                return this.a(collection);
            }
            case 0: {
                final Iterable iterable = (Iterable)collection;
                int v3;
                if ((v3 = z5e.V(d86.p0(iterable, 10))) < 16) {
                    v3 = 16;
                }
                final LinkedHashMap linkedHashMap = new LinkedHashMap(v3);
                for (final Map$Entry map$Entry2 : iterable) {
                    ((Map)linkedHashMap).put(map$Entry2.getKey(), map$Entry2.getValue());
                }
                final x8m v4 = this.v;
                while (true) {
                    final Object b5 = twl.B;
                    synchronized (b5) {
                        final w8m w8m2 = (w8m)g8m.f(v4.v);
                        final g3h c4 = w8m2.c;
                        final int d2 = w8m2.d;
                        monitorexit(b5);
                        c4.getClass();
                        final k3h k = c4.j();
                        final Iterator iterator3 = v4.w.iterator();
                        boolean b6 = b;
                        while (((g1)iterator3).hasNext()) {
                            final Map$Entry map$Entry3 = (Map$Entry)((hpm)iterator3).next();
                            if (!((Map)linkedHashMap).containsKey(map$Entry3.getKey()) || !mlc.q(linkedHashMap.get(map$Entry3.getKey()), map$Entry3.getValue())) {
                                ((Map)k).remove(map$Entry3.getKey());
                                b6 = true;
                            }
                        }
                        final g3h l = k.j();
                        if (!mlc.q((Object)l, (Object)c4)) {
                            final w8m v5 = v4.v;
                            final Object c5 = g8m.c;
                            synchronized (c5) {
                                final r7m h2 = g8m.h();
                                final boolean c6 = x8m.c((w8m)g8m.w(v5, (jpm)v4, h2), d2, l);
                                monitorexit(c5);
                                g8m.l(h2, (jpm)v4);
                                b = b6;
                                if (!c6) {
                                    continue;
                                }
                            }
                        }
                        return b6;
                    }
                }
                break;
            }
        }
    }
    
    public final int size() {
        return this.v.size();
    }
    
    public final Object[] toArray() {
        return ach.g0((Collection)this);
    }
    
    public final Object[] toArray(final Object[] array) {
        return ach.h0((Collection)this, array);
    }
}
