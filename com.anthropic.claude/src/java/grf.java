import java.util.AbstractCollection;
import java.util.Set;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public final class grf
{
    public final apm a;
    public final apm b;
    public final usi c;
    public final pv0 d;
    public final pv0 e;
    public drf f;
    public int g;
    public frf h;
    public final LinkedHashSet i;
    public final LinkedHashSet j;
    public final LinkedHashSet k;
    public boolean l;
    public boolean m;
    public boolean n;
    
    public grf() {
        this.a = bpm.a((Object)hrf.d);
        final apm a = bpm.a((Object)new erf());
        this.b = a;
        this.c = lq6.i(a);
        this.d = new pv0();
        this.e = new pv0();
        this.i = new LinkedHashSet();
        this.j = new LinkedHashSet();
        this.k = new LinkedHashSet();
    }
    
    public final void a(final c2l a, final frf frf, final int n) {
        if (frf.a == null) {
            LinkedHashSet set;
            if (n != 0) {
                if (n != 1) {
                    set = this.i;
                }
                else {
                    set = this.j;
                }
            }
            else {
                set = this.k;
            }
            ((Collection)set).add((Object)frf);
            frf.a = a;
            final erf erf = (erf)this.c.v.getValue();
            boolean b;
            if (n != 0) {
                if (n != 1) {
                    b = this.n;
                }
                else {
                    b = this.l;
                }
            }
            else {
                b = this.m;
            }
            frf.b(b);
            return;
        }
        final StringBuilder sb = new StringBuilder("Input '");
        sb.append((Object)frf);
        final c2l a2 = frf.a;
        sb.append("' is already added to dispatcher ");
        sb.append((Object)a2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public final void b() {
        final pv0 d = this.d;
        final boolean empty = d.isEmpty();
        boolean b = true;
        boolean m = false;
        Label_0065: {
            if (!empty) {
                final Iterator iterator = ((AbstractList)d).iterator();
                while (iterator.hasNext()) {
                    if (!((drf)iterator.next()).b) {
                        continue;
                    }
                    m = true;
                    break Label_0065;
                }
            }
            m = false;
        }
        final pv0 e = this.e;
        boolean l = false;
        Label_0124: {
            if (!e.isEmpty()) {
                final Iterator iterator2 = ((AbstractList)e).iterator();
                while (iterator2.hasNext()) {
                    if (!((drf)iterator2.next()).b) {
                        continue;
                    }
                    l = true;
                    break Label_0124;
                }
            }
            l = false;
        }
        final boolean n = m || l;
        final boolean b2 = this.m != m;
        final boolean b3 = this.l != l;
        if (this.n == n) {
            b = false;
        }
        final LinkedHashSet k = this.k;
        if (b2) {
            final Iterator iterator3 = ((Set)k).iterator();
            while (iterator3.hasNext()) {
                ((frf)iterator3.next()).b(m);
            }
        }
        final LinkedHashSet j = this.j;
        if (b3) {
            final Iterator iterator4 = ((Set)j).iterator();
            while (iterator4.hasNext()) {
                ((frf)iterator4.next()).b(l);
            }
        }
        final LinkedHashSet i = this.i;
        if (b) {
            final Iterator iterator5 = ((Set)i).iterator();
            while (iterator5.hasNext()) {
                ((frf)iterator5.next()).b(n);
            }
        }
        this.m = m;
        this.l = l;
        this.n = n;
        drf drf;
        if ((drf = this.f) == null) {
            drf = this.c(0);
        }
        drf drf2;
        if ((drf2 = this.f) == null) {
            drf2 = this.c(0);
        }
        if (mlc.q((Object)drf2, (Object)drf)) {
            erf erf;
            if (drf2 == null) {
                erf = new erf();
            }
            else {
                final ArrayList list = new ArrayList();
                final Iterator iterator6 = ((AbstractCollection)d).iterator();
                while (iterator6.hasNext()) {
                    final boolean b4 = ((drf)iterator6.next()).b;
                }
                final Iterator iterator7 = ((AbstractCollection)e).iterator();
                while (iterator7.hasNext()) {
                    final boolean b5 = ((drf)iterator7.next()).b;
                }
                final ncq a = drf2.a;
                final ygd a2 = lq6.A();
                h86.t0((Collection)a2, (Iterable)list);
                a2.add((Object)a);
                h86.t0((Collection)a2, (Iterable)r89.v);
                erf = new erf((List)lq6.n(a2), list.size());
            }
            final apm b6 = this.b;
            if (!mlc.q((Object)b6.getValue(), (Object)erf)) {
                b6.n((Object)null, (Object)erf);
                final Iterator iterator8 = ((Set)k).iterator();
                while (iterator8.hasNext()) {
                    iterator8.next().getClass();
                }
                final Iterator iterator9 = ((Set)j).iterator();
                while (iterator9.hasNext()) {
                    iterator9.next().getClass();
                }
                final Iterator iterator10 = ((Set)i).iterator();
                while (iterator10.hasNext()) {
                    iterator10.next().getClass();
                }
            }
        }
    }
    
    public final drf c(final int n) {
        final pv0 e = this.e;
        final pv0 d = this.d;
        final drf drf = null;
        final drf drf2 = null;
        if (n == -1) {
            while (true) {
                for (final Object next : d) {
                    if (((drf)next).b) {
                        final drf drf3 = (drf)next;
                        if (drf3 == null) {
                            final Iterator iterator2 = ((AbstractList)e).iterator();
                            Object next2;
                            do {
                                next2 = drf;
                                if (!iterator2.hasNext()) {
                                    break;
                                }
                                next2 = iterator2.next();
                            } while (!((drf)next2).b);
                            return (drf)next2;
                        }
                        return drf3;
                    }
                }
                Object next = null;
                continue;
            }
        }
        if (n == 0) {
            final Iterator iterator3 = ((AbstractList)d).iterator();
            while (true) {
                while (iterator3.hasNext()) {
                    final Object next3;
                    if (!((drf)(next3 = iterator3.next())).b) {
                        continue;
                    }
                    final drf drf4 = (drf)next3;
                    if (drf4 == null) {
                        final Iterator iterator4 = ((AbstractList)e).iterator();
                        Object next4;
                        do {
                            next4 = drf2;
                            if (!iterator4.hasNext()) {
                                break;
                            }
                            next4 = iterator4.next();
                        } while (!((drf)next4).b);
                        return (drf)next4;
                    }
                    return drf4;
                }
                Object next3 = null;
                continue;
            }
        }
        if (n == 1) {
            final Iterator iterator5 = ((AbstractList)d).iterator();
            while (iterator5.hasNext()) {
                iterator5.next().getClass();
            }
            final Iterator iterator6 = ((AbstractList)e).iterator();
            while (iterator6.hasNext()) {
                iterator6.next().getClass();
            }
            return null;
        }
        final StringBuilder sb = new StringBuilder("Unsupported direction: '");
        sb.append(n);
        sb.append("'.");
        throw new IllegalStateException(sb.toString().toString());
    }
}
