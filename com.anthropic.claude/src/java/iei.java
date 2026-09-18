import java.util.AbstractCollection;
import java.util.List;
import java.util.Collection;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class iei extends AbstractList implements RandomAccess, zic
{
    public static final Object[] y;
    public static final iei z;
    public boolean v;
    public Object[] w;
    public int x;
    
    static {
        z = new iei(y = new Object[0], 0, false);
    }
    
    public iei(final Object[] w, final int x, final boolean v) {
        this.v = v;
        this.w = w;
        this.x = x;
    }
    
    public final void a(final int n) {
        if (n >= 0 && n < this.x) {
            return;
        }
        fvd.g(this.x, hia.p(n, "Index:", ", Size:"));
    }
    
    public final void add(final int n, final Object o) {
        this.b();
        if (n >= 0) {
            final int x = this.x;
            if (n <= x) {
                final Object[] w = this.w;
                if (x < w.length) {
                    System.arraycopy((Object)w, n, (Object)w, n + 1, x - n);
                }
                else {
                    final Object[] w2 = new Object[Math.max(w.length * 3 / 2 + 1, 10)];
                    System.arraycopy((Object)this.w, 0, (Object)w2, 0, n);
                    System.arraycopy((Object)this.w, n, (Object)w2, n + 1, this.x - n);
                    this.w = w2;
                }
                this.w[n] = o;
                ++this.x;
                ++super.modCount;
                return;
            }
        }
        fvd.g(this.x, hia.p(n, "Index:", ", Size:"));
    }
    
    public final boolean add(final Object o) {
        this.b();
        final int x = this.x;
        Object[] w;
        final Object[] array = w = this.w;
        if (x == array.length) {
            w = Arrays.copyOf(this.w, Math.max(array.length * 3 / 2 + 1, 10));
            this.w = w;
        }
        w[this.x++] = o;
        ++super.modCount;
        return true;
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        this.b();
        return super.addAll(n, collection);
    }
    
    public final boolean addAll(final Collection collection) {
        this.b();
        return super.addAll(collection);
    }
    
    public final void b() {
        if (this.v) {
            return;
        }
        fvd.q();
    }
    
    public final void clear() {
        this.b();
        super.clear();
    }
    
    public final iei d(final int n) {
        if (n >= this.x) {
            Object[] array;
            if (n == 0) {
                array = iei.y;
            }
            else {
                array = Arrays.copyOf(this.w, n);
            }
            return new iei(array, this.x, true);
        }
        fvd.w();
        return null;
    }
    
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        if (!(o instanceof RandomAccess)) {
            return super.equals(o);
        }
        final List list = (List)o;
        final int size = ((AbstractCollection)this).size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; ++i) {
            if (!this.get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }
    
    public final Object get(final int n) {
        this.a(n);
        return this.w[n];
    }
    
    public final int hashCode() {
        final int size = ((AbstractCollection)this).size();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            n = n * 31 + this.get(i).hashCode();
        }
        return n;
    }
    
    public final Object remove(final int n) {
        this.b();
        this.a(n);
        final Object[] w = this.w;
        final Object o = w[n];
        final int x = this.x;
        if (n < x - 1) {
            System.arraycopy((Object)w, n + 1, (Object)w, n, x - n - 1);
        }
        --this.x;
        ++super.modCount;
        return o;
    }
    
    public final boolean remove(final Object o) {
        this.b();
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    public final boolean removeAll(final Collection collection) {
        this.b();
        return super.removeAll(collection);
    }
    
    public final boolean retainAll(final Collection collection) {
        this.b();
        return super.retainAll(collection);
    }
    
    public final Object set(final int n, final Object o) {
        this.b();
        this.a(n);
        final Object[] w = this.w;
        final Object o2 = w[n];
        w[n] = o;
        ++super.modCount;
        return o2;
    }
    
    public final int size() {
        return this.x;
    }
}
