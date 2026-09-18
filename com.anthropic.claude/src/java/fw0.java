import java.util.Iterator;
import java.util.Set;
import java.util.Collection;

public final class fw0 implements Collection, Set, ttc, xtc
{
    public int[] v;
    public Object[] w;
    public int x;
    
    public fw0(final int n) {
        this.v = o50.c;
        this.w = o50.e;
        if (n > 0) {
            this.v = new int[n];
            this.w = new Object[n];
        }
    }
    
    public final Object a(final int n) {
        final int x = this.x;
        final Object[] w = this.w;
        final Object o = w[n];
        if (x <= 1) {
            this.clear();
            return o;
        }
        final int x2 = x - 1;
        final int[] v = this.v;
        final int length = v.length;
        int n2 = 8;
        if (length > 8 && x < v.length / 3) {
            if (x > 8) {
                n2 = x + (x >> 1);
            }
            final int[] v2 = new int[n2];
            this.v = v2;
            this.w = new Object[n2];
            if (n > 0) {
                iw0.N0(0, n, 6, v, v2);
                iw0.O0(0, n, 6, w, this.w);
            }
            if (n < x2) {
                final int[] v3 = this.v;
                final int n3 = n + 1;
                iw0.J0(n, n3, x, v, v3);
                iw0.K0(n, n3, x, w, this.w);
            }
        }
        else {
            if (n < x2) {
                final int n4 = n + 1;
                iw0.J0(n, n4, x, v, v);
                final Object[] w2 = this.w;
                iw0.K0(n, n4, x, w2, w2);
            }
            this.w[x2] = null;
        }
        if (x == this.x) {
            this.x = x2;
            return o;
        }
        en9.c();
        return null;
    }
    
    public final boolean add(final Object o) {
        final int x = this.x;
        int n;
        int hashCode;
        if (o == null) {
            n = eqi.d0(this, null, 0);
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
            n = eqi.d0(this, o, hashCode);
        }
        if (n >= 0) {
            return false;
        }
        final int n2 = ~n;
        final int[] v = this.v;
        if (x >= v.length) {
            int n3 = 8;
            if (x >= 8) {
                n3 = (x >> 1) + x;
            }
            else if (x < 4) {
                n3 = 4;
            }
            final Object[] w = this.w;
            final int[] v2 = new int[n3];
            this.v = v2;
            this.w = new Object[n3];
            if (x != this.x) {
                en9.c();
                return false;
            }
            if (v2.length != 0) {
                iw0.N0(0, v.length, 6, v, v2);
                iw0.O0(0, w.length, 6, w, this.w);
            }
        }
        if (n2 < x) {
            final int[] v3 = this.v;
            final int n4 = n2 + 1;
            iw0.J0(n4, n2, x, v3, v3);
            final Object[] w2 = this.w;
            iw0.K0(n4, n2, x, w2, w2);
        }
        final int x2 = this.x;
        if (x == x2) {
            final int[] v4 = this.v;
            if (n2 < v4.length) {
                v4[n2] = hashCode;
                this.w[n2] = o;
                this.x = x2 + 1;
                return true;
            }
        }
        en9.c();
        return false;
    }
    
    public final boolean addAll(final Collection collection) {
        final int n = collection.size() + this.x;
        final int x = this.x;
        final int[] v = this.v;
        final int length = v.length;
        boolean b = false;
        if (length < n) {
            final Object[] w = this.w;
            final int[] v2 = new int[n];
            this.v = v2;
            this.w = new Object[n];
            if (x > 0) {
                iw0.N0(0, x, 6, v, v2);
                iw0.O0(0, this.x, 6, w, this.w);
            }
        }
        if (this.x == x) {
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                b |= this.add(iterator.next());
            }
            return b;
        }
        en9.c();
        return false;
    }
    
    public final void clear() {
        int x;
        if ((x = this.x) != 0) {
            this.v = o50.c;
            this.w = o50.e;
            x = 0;
            this.x = 0;
        }
        if (x == 0) {
            return;
        }
        en9.c();
    }
    
    public final boolean contains(final Object o) {
        int n;
        if (o == null) {
            n = eqi.d0(this, null, 0);
        }
        else {
            n = eqi.d0(this, o, o.hashCode());
        }
        return n >= 0;
    }
    
    public final boolean containsAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.contains(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        if (this.x != ((Set)o).size()) {
            return false;
        }
        try {
            for (int x = this.x, i = 0; i < x; ++i) {
                if (!((Set)o).contains(this.w[i])) {
                    return false;
                }
            }
            return true;
        }
        catch (final NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    @Override
    public final int hashCode() {
        final int[] v = this.v;
        final int x = this.x;
        int i = 0;
        int n = 0;
        while (i < x) {
            n += v[i];
            ++i;
        }
        return n;
    }
    
    public final boolean isEmpty() {
        return this.x <= 0;
    }
    
    public final Iterator iterator() {
        return (Iterator)new ew0(this);
    }
    
    public final boolean remove(final Object o) {
        int n;
        if (o == null) {
            n = eqi.d0(this, null, 0);
        }
        else {
            n = eqi.d0(this, o, o.hashCode());
        }
        if (n >= 0) {
            this.a(n);
            return true;
        }
        return false;
    }
    
    public final boolean removeAll(final Collection collection) {
        final Iterator iterator = collection.iterator();
        boolean b = false;
        while (iterator.hasNext()) {
            b |= this.remove(iterator.next());
        }
        return b;
    }
    
    public final boolean retainAll(final Collection collection) {
        int n = this.x - 1;
        boolean b = false;
        while (-1 < n) {
            if (!c86.A0((Iterable)collection, this.w[n])) {
                this.a(n);
                b = true;
            }
            --n;
        }
        return b;
    }
    
    public final int size() {
        return this.x;
    }
    
    public final Object[] toArray() {
        return iw0.R0(this.w, 0, this.x);
    }
    
    public final Object[] toArray(Object[] w) {
        final Object[] h = bbr.h(this.x, w);
        w = this.w;
        iw0.K0(0, 0, this.x, w, h);
        return h;
    }
    
    @Override
    public final String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.x * 14);
        sb.append('{');
        for (int x = this.x, i = 0; i < x; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final Object o = this.w[i];
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
