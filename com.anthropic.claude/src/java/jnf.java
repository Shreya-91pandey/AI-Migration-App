import java.util.List;

public abstract class jnf
{
    public static final void a(final int n, final List list) {
        final int size = list.size();
        if (n >= 0 && n < size) {
            return;
        }
        c(n, size);
    }
    
    public static final void b(final int n, final int n2, final List list) {
        if (n > n2) {
            f(n, n2);
        }
        if (n < 0) {
            d(n);
        }
        if (n2 > list.size()) {
            e(n2, list.size());
        }
    }
    
    private static final void c(final int n, final int n2) {
        throw new IndexOutOfBoundsException(hia.g(n, n2, "Index ", " is out of bounds. The list has ", " elements."));
    }
    
    private static final void d(final int n) {
        throw new IndexOutOfBoundsException(oz1.n("fromIndex (", n, ") is less than 0."));
    }
    
    private static final void e(final int n, final int n2) {
        throw new IndexOutOfBoundsException(hia.g(n, n2, "toIndex (", ") is more than than the list size (", ")"));
    }
    
    private static final void f(final int n, final int n2) {
        throw new IllegalArgumentException(hia.g(n, n2, "Indices are out of order. fromIndex (", ") is greater than toIndex (", ")."));
    }
}
