import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.List;

public abstract class ald
{
    public static String a(final List list, String s, lta lta, int i) {
        if ((i & 0x1) != 0x0) {
            s = ", ";
        }
        String s2 = "";
        String s3;
        if ((i & 0x2) != 0x0) {
            s3 = "";
        }
        else {
            s3 = "[\n\t";
        }
        if ((i & 0x4) == 0x0) {
            s2 = "\n]";
        }
        if ((i & 0x20) != 0x0) {
            lta = null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append((CharSequence)s3);
        final int size = ((Collection)list).size();
        i = 0;
        int n = 0;
        while (i < size) {
            final Object value = list.get(i);
            boolean b = true;
            if (++n > 1) {
                sb.append((CharSequence)s);
            }
            if (lta != null) {
                sb.append((CharSequence)lta.b(value));
            }
            else {
                if (value != null) {
                    b = (value instanceof CharSequence);
                }
                if (b) {
                    sb.append((CharSequence)value);
                }
                else if (value instanceof Character) {
                    sb.append((char)value);
                }
                else {
                    sb.append((CharSequence)value.toString());
                }
            }
            ++i;
        }
        sb.append((CharSequence)s2);
        return sb.toString();
    }
    
    public static final Void b(final String s) {
        throw new NoSuchElementException(s);
    }
    
    public static final void c(final String s) {
        throw new UnsupportedOperationException(s);
    }
}
