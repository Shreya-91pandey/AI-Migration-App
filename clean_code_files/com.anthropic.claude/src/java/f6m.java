import java.util.Iterator;
import java.util.Collection;
import java.util.ListIterator;
import java.util.Arrays;

public final class f6m extends p2
{
    public static final f6m w;
    public final Object[] v;
    
    static {
        w = new f6m(new Object[0]);
    }
    
    public f6m(final Object[] v) {
        this.v = v;
    }
    
    @Override
    public final int a() {
        return this.v.length;
    }
    
    @Override
    public final p2 d(final int n, final Object o) {
        final Object[] v = this.v;
        uuj.X(n, v.length);
        if (n == v.length) {
            return this.j(o);
        }
        if (v.length < 32) {
            final Object[] array = new Object[v.length + 1];
            iw0.O0(0, n, 6, v, array);
            iw0.K0(n + 1, n, v.length, v, array);
            array[n] = o;
            return new f6m(array);
        }
        final Object[] copy = Arrays.copyOf(v, v.length);
        iw0.K0(n + 1, n, v.length - 1, v, copy);
        copy[n] = o;
        final Object o2 = v[31];
        final Object[] array2 = new Object[32];
        array2[0] = o2;
        return (p2)new t4h(copy, array2, v.length + 1, 0);
    }
    
    public final Object get(final int n) {
        final Object[] v = this.v;
        uuj.W(n, v.length);
        return v[n];
    }
    
    @Override
    public final int indexOf(final Object o) {
        return iw0.b1(this.v, o);
    }
    
    @Override
    public final p2 j(final Object o) {
        final Object[] v = this.v;
        if (v.length < 32) {
            final Object[] copy = Arrays.copyOf(v, v.length + 1);
            copy[v.length] = o;
            return new f6m(copy);
        }
        final Object[] array = new Object[32];
        array[0] = o;
        return (p2)new t4h(v, array, v.length + 1, 0);
    }
    
    @Override
    public final int lastIndexOf(final Object o) {
        return iw0.f1(this.v, o);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        final Object[] v = this.v;
        uuj.X(n, v.length);
        return (ListIterator)new dn2(v, n, v.length);
    }
    
    @Override
    public final p2 m(final Collection collection) {
        final Object[] v = this.v;
        if (collection.size() + v.length <= 32) {
            final Object[] copy = Arrays.copyOf(v, collection.size() + v.length);
            int length = v.length;
            final Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                copy[length] = iterator.next();
                ++length;
            }
            return new f6m(copy);
        }
        final v4h o = this.o();
        o.addAll(collection);
        return o.j();
    }
    
    @Override
    public final v4h o() {
        return new v4h((p2)this, (Object[])null, this.v, 0);
    }
    
    @Override
    public final p2 r(final n2 n2) {
        final Object[] v = this.v;
        int length = v.length;
        final int length2 = v.length;
        Object[] array = v;
        int i = 0;
        int n3 = 0;
        while (i < length2) {
            final Object o = v[i];
            int n4;
            int n5;
            Object[] copy;
            if (n2.b(o)) {
                n4 = length;
                n5 = n3;
                copy = array;
                if (n3 == 0) {
                    copy = Arrays.copyOf(v, v.length);
                    n5 = 1;
                    n4 = i;
                }
            }
            else {
                n4 = length;
                n5 = n3;
                copy = array;
                if (n3 != 0) {
                    array[length] = o;
                    n4 = length + 1;
                    copy = array;
                    n5 = n3;
                }
            }
            ++i;
            length = n4;
            n3 = n5;
            array = copy;
        }
        if (length == v.length) {
            return this;
        }
        if (length == 0) {
            return f6m.w;
        }
        return new f6m(iw0.R0(array, 0, length));
    }
    
    @Override
    public final p2 s(final int n) {
        final Object[] v = this.v;
        uuj.W(n, v.length);
        if (v.length == 1) {
            return f6m.w;
        }
        final Object[] copy = Arrays.copyOf(v, v.length - 1);
        iw0.K0(n, n + 1, v.length, v, copy);
        return new f6m(copy);
    }
    
    @Override
    public final p2 t(final int n, final Object o) {
        final Object[] v = this.v;
        uuj.W(n, v.length);
        final Object[] copy = Arrays.copyOf(v, v.length);
        copy[n] = o;
        return new f6m(copy);
    }
}
