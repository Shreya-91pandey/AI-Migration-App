import java.util.ConcurrentModificationException;
import java.util.ArrayList;

public abstract class x5m
{
    public static final v5m a(v5m v5m) {
        if (!(v5m instanceof v5m)) {
            v5m = null;
        }
        if (v5m != null) {
            return v5m;
        }
        ti6.b("Inconsistent composition");
        ebq.a();
        return null;
    }
    
    public static final int b(final ArrayList list, int c, final int n) {
        c = c(list, c, n);
        if (c >= 0) {
            return c;
        }
        return -(c + 1);
    }
    
    public static final int c(final ArrayList list, final int n, final int n2) {
        int n3 = list.size() - 1;
        int i = 0;
        while (i <= n3) {
            final int n4 = i + n3 >>> 1;
            final int a = ((bva)list.get(n4)).a;
            int n5;
            if ((n5 = a) < 0) {
                n5 = a + n2;
            }
            final int u = mlc.u(n5, n);
            if (u < 0) {
                i = n4 + 1;
            }
            else {
                if (u <= 0) {
                    return n4;
                }
                n3 = n4 - 1;
            }
        }
        return -(i + 1);
    }
    
    public static final int d(final int[] array, int n) {
        final int n2 = n * 5;
        n = array[n2 + 4];
        return Integer.bitCount(array[n2 + 1] >> 28) + n;
    }
    
    public static final void e() {
        throw new ConcurrentModificationException();
    }
    
    public static final void f(int n, final int n2, final int[] array) {
        if (n2 >= 0) {}
        n = n * 5 + 1;
        array[n] = (n2 | (array[n] & 0xFC000000));
    }
}
