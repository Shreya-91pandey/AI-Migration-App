import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public final class inf implements RandomAccess
{
    public Object[] v;
    public hnf w;
    public int x;
    
    public inf(final int x, final Object[] v) {
        this.v = v;
        this.x = x;
    }
    
    public final void a(final int n, final Object o) {
        final int n2 = this.x + 1;
        if (this.v.length < n2) {
            this.n(n2);
        }
        final Object[] v = this.v;
        final int x = this.x;
        if (n != x) {
            System.arraycopy((Object)v, n, (Object)v, n + 1, x - n);
        }
        v[n] = o;
        ++this.x;
    }
    
    public final void b(final Object o) {
        final int n = this.x + 1;
        if (this.v.length < n) {
            this.n(n);
        }
        final Object[] v = this.v;
        final int x = this.x;
        v[x] = o;
        this.x = x + 1;
    }
    
    public final void d(final int n, final inf inf) {
        final int x = inf.x;
        if (x == 0) {
            return;
        }
        final int n2 = this.x + x;
        if (this.v.length < n2) {
            this.n(n2);
        }
        final Object[] v = this.v;
        final int x2 = this.x;
        if (n != x2) {
            System.arraycopy((Object)v, n, (Object)v, n + x, x2 - n);
        }
        System.arraycopy((Object)inf.v, 0, (Object)v, n, x);
        this.x += x;
    }
    
    public final void e(final int n, final List list) {
        if (list.isEmpty()) {
            return;
        }
        final int size = list.size();
        final int n2 = this.x + size;
        if (this.v.length < n2) {
            this.n(n2);
        }
        final Object[] v = this.v;
        final int x = this.x;
        if (n != x) {
            System.arraycopy((Object)v, n, (Object)v, n + size, x - n);
        }
        for (int size2 = ((Collection)list).size(), i = 0; i < size2; ++i) {
            v[n + i] = list.get(i);
        }
        this.x += size;
    }
    
    public final boolean f(final int n, final Collection collection) {
        final boolean empty = collection.isEmpty();
        int n2 = 0;
        if (empty) {
            return false;
        }
        final int size = collection.size();
        final int n3 = this.x + size;
        if (this.v.length < n3) {
            this.n(n3);
        }
        final Object[] v = this.v;
        final int x = this.x;
        if (n != x) {
            System.arraycopy((Object)v, n, (Object)v, n + size, x - n);
        }
        for (final Object next : (Iterable)collection) {
            if (n2 < 0) {
                lq6.n0();
                throw null;
            }
            v[n2 + n] = next;
            ++n2;
        }
        this.x += size;
        return true;
    }
    
    public final List g() {
        hnf w;
        if ((w = this.w) == null) {
            w = new hnf(this);
            this.w = w;
        }
        return (List)w;
    }
    
    public final void h() {
        final Object[] v = this.v;
        for (int x = this.x, i = 0; i < x; ++i) {
            v[i] = null;
        }
        this.x = 0;
    }
    
    public final boolean i(final Object o) {
        final int n = this.x - 1;
        if (n >= 0) {
            for (int n2 = 0; !mlc.q(this.v[n2], o); ++n2) {
                if (n2 == n) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public final int j(final Object o) {
        final Object[] v = this.v;
        for (int x = this.x, i = 0; i < x; ++i) {
            if (mlc.q(o, v[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public final boolean k(final Object o) {
        final int j = this.j(o);
        if (j >= 0) {
            this.l(j);
            return true;
        }
        return false;
    }
    
    public final Object l(int x) {
        final Object[] v = this.v;
        final Object o = v[x];
        final int x2 = this.x;
        if (x != x2 - 1) {
            final int n = x + 1;
            System.arraycopy((Object)v, n, (Object)v, x, x2 - n);
        }
        x = this.x - 1;
        v[this.x = x] = null;
        return o;
    }
    
    public final void m(int n, int x) {
        if (x > n) {
            final int x2 = this.x;
            if (x < x2) {
                final Object[] v = this.v;
                System.arraycopy((Object)v, x, (Object)v, n, x2 - x);
            }
            int x3 = this.x;
            x = x3 - (x - n);
            --x3;
            if (x <= x3) {
                n = x;
                while (true) {
                    this.v[n] = null;
                    if (n == x3) {
                        break;
                    }
                    ++n;
                }
            }
            this.x = x;
        }
    }
    
    public final void n(final int n) {
        final Object[] v = this.v;
        final int length = v.length;
        final Object[] v2 = new Object[Math.max(n, length * 2)];
        System.arraycopy((Object)v, 0, (Object)v2, 0, length);
        this.v = v2;
    }
}
