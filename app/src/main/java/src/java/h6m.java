import java.util.Iterator;
import java.util.Map$Entry;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.AbstractSet;
import java.util.Set;
import java.util.Collections;
import java.util.Map;
import java.util.AbstractMap;

public final class h6m extends AbstractMap
{
    public static final int B = 0;
    public Map A;
    public Object[] v;
    public int w;
    public Map x;
    public boolean y;
    public volatile vv0 z;
    
    public static h6m j() {
        final AbstractMap abstractMap = new AbstractMap();
        final Map empty_MAP = Collections.EMPTY_MAP;
        ((h6m)abstractMap).x = empty_MAP;
        ((h6m)abstractMap).A = empty_MAP;
        return (h6m)abstractMap;
    }
    
    public final int a(final Comparable comparable) {
        final int w = this.w;
        int n = w - 1;
        Label_0052: {
            if (n < 0) {
                break Label_0052;
            }
            final int compareTo = comparable.compareTo((Object)((j6m)this.v[n]).a());
            int n2;
            if (compareTo > 0) {
                n2 = w + 1;
            }
            else {
                if (compareTo == 0) {
                    return n;
                }
                break Label_0052;
            }
            return -n2;
        }
        int i = 0;
        while (i <= n) {
            final int n3 = (i + n) / 2;
            final int compareTo2 = comparable.compareTo((Object)((j6m)this.v[n3]).a());
            if (compareTo2 < 0) {
                n = n3 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n3;
                }
                i = n3 + 1;
            }
        }
        int n2 = i + 1;
        return -n2;
    }
    
    public final void c() {
        if (!this.y) {
            return;
        }
        fvd.q();
    }
    
    public final void clear() {
        this.c();
        if (this.w != 0) {
            this.v = null;
            this.w = 0;
        }
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
    }
    
    public final boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.a(comparable) >= 0 || this.x.containsKey((Object)comparable);
    }
    
    public final j6m d(final int n) {
        if (n < this.w) {
            return (j6m)this.v[n];
        }
        throw new ArrayIndexOutOfBoundsException(n);
    }
    
    public final Set entrySet() {
        if (this.z == null) {
            this.z = new vv0(this, 0);
        }
        return (Set)this.z;
    }
    
    public final boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof h6m)) {
                return super.equals(o);
            }
            final h6m h6m = (h6m)o;
            final int size = this.size();
            if (size == h6m.size()) {
                final int w = this.w;
                if (w != h6m.w) {
                    return ((AbstractSet)this.entrySet()).equals((Object)h6m.entrySet());
                }
                for (int i = 0; i < w; ++i) {
                    if (!this.d(i).equals((Object)h6m.d(i))) {
                        return false;
                    }
                }
                if (w != size) {
                    return this.x.equals((Object)h6m.x);
                }
                return true;
            }
            return false;
        }
        return true;
    }
    
    public final Set f() {
        Set set;
        if (this.x.isEmpty()) {
            set = Collections.EMPTY_SET;
        }
        else {
            set = this.x.entrySet();
        }
        return set;
    }
    
    public final SortedMap g() {
        this.c();
        if (this.x.isEmpty() && !(this.x instanceof TreeMap)) {
            final TreeMap x = new TreeMap();
            this.x = (Map)x;
            this.A = (Map)x.descendingMap();
        }
        return (SortedMap)this.x;
    }
    
    public final Object get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int a = this.a(comparable);
        if (a >= 0) {
            return ((j6m)this.v[a]).getValue();
        }
        return this.x.get((Object)comparable);
    }
    
    public final int hashCode() {
        final int w = this.w;
        int i = 0;
        int n = 0;
        while (i < w) {
            n += this.v[i].hashCode();
            ++i;
        }
        if (this.x.size() > 0) {
            return this.x.hashCode() + n;
        }
        return n;
    }
    
    public final Object m(final Comparable comparable, final Object value) {
        this.c();
        final int a = this.a(comparable);
        if (a >= 0) {
            return ((j6m)this.v[a]).setValue(value);
        }
        this.c();
        Object[] v;
        if ((v = this.v) == null) {
            v = new Object[16];
            this.v = v;
        }
        final int n = -(a + 1);
        if (n >= 16) {
            return ((Map)this.g()).put((Object)comparable, value);
        }
        final int w = this.w;
        if (w == 16) {
            final j6m j6m = (j6m)v[15];
            this.w = w - 1;
            ((Map)this.g()).put((Object)j6m.a(), j6m.getValue());
        }
        final Object[] v2 = this.v;
        System.arraycopy((Object)v2, n, (Object)v2, n + 1, v2.length - n - 1);
        this.v[n] = new j6m(this, comparable, value);
        ++this.w;
        return null;
    }
    
    public final Object n(final int n) {
        this.c();
        final Object value = ((j6m)this.v[n]).getValue();
        final Object[] v = this.v;
        System.arraycopy((Object)v, n + 1, (Object)v, n, this.w - n - 1);
        --this.w;
        if (!this.x.isEmpty()) {
            final Iterator iterator = this.g().entrySet().iterator();
            this.v[this.w] = new j6m(this, (Map$Entry)iterator.next());
            ++this.w;
            iterator.remove();
        }
        return value;
    }
    
    public final Object remove(final Object o) {
        this.c();
        final Comparable comparable = (Comparable)o;
        final int a = this.a(comparable);
        if (a >= 0) {
            return this.n(a);
        }
        if (this.x.isEmpty()) {
            return null;
        }
        return this.x.remove((Object)comparable);
    }
    
    public final int size() {
        return this.x.size() + this.w;
    }
}
