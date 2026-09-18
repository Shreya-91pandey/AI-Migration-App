import java.util.Locale;
import java.util.Iterator;
import java.io.Serializable;

public class fs2 implements Iterable, Serializable
{
    public static final fs2 x;
    public static final as2 y;
    public int v;
    public final byte[] w;
    
    static {
        x = new fs2(ejc.b);
        Object y2;
        if (w30.a()) {
            y2 = new def((byte)12);
        }
        else {
            y2 = new hzn((byte)26);
        }
        y = (as2)y2;
    }
    
    public fs2(final byte[] w) {
        this.v = 0;
        w.getClass();
        this.w = w;
    }
    
    public static int b(final int n, final int n2, final int n3) {
        final int n4 = n2 - n;
        if ((n | n2 | n4 | n3 - n2) < 0) {
            if (n >= 0) {
                if (n2 < n) {
                    en9.j(smk.o(n, n2, "Beginning index larger than ending index: ", ", "));
                }
                else {
                    en9.j(smk.o(n2, n3, "End index: ", " >= "));
                }
            }
            else {
                en9.j(oz1.n("Beginning index: ", n, " < 0"));
            }
            return 0;
        }
        return n4;
    }
    
    public static fs2 d(final byte[] array, final int n, final int n2) {
        b(n, n + n2, array.length);
        return new fs2(fs2.y.a(array, n, n2));
    }
    
    public byte a(final int n) {
        return this.w[n];
    }
    
    public void e(final byte[] array, final int n) {
        System.arraycopy((Object)this.w, 0, (Object)array, 0, n);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o != this) {
            if (o instanceof fs2) {
                if (this.size() == ((fs2)o).size()) {
                    if (this.size() == 0) {
                        return true;
                    }
                    if (!(o instanceof fs2)) {
                        return o.equals(this);
                    }
                    final fs2 fs2 = (fs2)o;
                    final int v = this.v;
                    final int v2 = fs2.v;
                    if (v == 0 || v2 == 0 || v == v2) {
                        final int size = this.size();
                        if (size > fs2.size()) {
                            ehq.a(size, this.size());
                            return false;
                        }
                        if (size <= fs2.size()) {
                            final byte[] w = fs2.w;
                            for (int h = this.h(), i = this.h(), h2 = fs2.h(); i < h + size; ++i, ++h2) {
                                if (this.w[i] != w[h2]) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        final StringBuilder p = hia.p(size, "Ran off end of other: 0, ", ", ");
                        p.append(fs2.size());
                        throw new IllegalArgumentException(p.toString());
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public int h() {
        return 0;
    }
    
    @Override
    public final int hashCode() {
        final int v = this.v;
        if (v == 0) {
            final int size = this.size();
            final int h = this.h();
            int n = size;
            for (int i = h; i < h + size; ++i) {
                n = n * 31 + this.w[i];
            }
            int v2;
            if ((v2 = n) == 0) {
                v2 = 1;
            }
            return this.v = v2;
        }
        return v;
    }
    
    public byte i(final int n) {
        return this.w[n];
    }
    
    public final Iterator iterator() {
        return (Iterator)new tr2(this);
    }
    
    public int size() {
        return this.w.length;
    }
    
    @Override
    public final String toString() {
        final Locale root = Locale.ROOT;
        final String hexString = Integer.toHexString(System.identityHashCode((Object)this));
        final int size = this.size();
        String s;
        if (this.size() <= 50) {
            s = ujq.f(this);
        }
        else {
            final int b = b(0, 47, this.size());
            Object x;
            if (b == 0) {
                x = fs2.x;
            }
            else {
                x = new yr2(this.w, this.h(), b);
            }
            s = ujq.f((fs2)x).concat("...");
        }
        return oz1.p(oz1.s(size, "<ByteString@", hexString, " size=", " contents=\""), s, "\">");
    }
}
