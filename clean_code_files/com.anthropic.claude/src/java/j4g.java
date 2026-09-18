import java.util.List;

public abstract class j4g
{
    public static final Object[] a;
    public static final emf b;
    
    static {
        a = new Object[0];
        b = new emf(0);
    }
    
    public static final void a(final int n, final List list) {
        final int size = list.size();
        if (n >= 0 && n < size) {
            return;
        }
        final StringBuilder sb = new StringBuilder("Index ");
        sb.append(n);
        sb.append(" is out of bounds. The list has ");
        sb.append(size);
        sb.append(" elements.");
        qiq.t(sb.toString());
        throw null;
    }
    
    public static final void b(final int n, final int n2, final List list) {
        final int size = list.size();
        if (n > n2) {
            final StringBuilder sb = new StringBuilder("Indices are out of order. fromIndex (");
            sb.append(n);
            sb.append(") is greater than toIndex (");
            sb.append(n2);
            sb.append(").");
            qiq.r(sb.toString());
            throw null;
        }
        if (n < 0) {
            final StringBuilder sb2 = new StringBuilder("fromIndex (");
            sb2.append(n);
            sb2.append(") is less than 0.");
            qiq.t(sb2.toString());
            throw null;
        }
        if (n2 <= size) {
            return;
        }
        final StringBuilder sb3 = new StringBuilder("toIndex (");
        sb3.append(n2);
        sb3.append(") is more than than the list size (");
        sb3.append(size);
        sb3.append(')');
        qiq.t(sb3.toString());
        throw null;
    }
}
