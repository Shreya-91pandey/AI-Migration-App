import android.graphics.Insets;

public final class dec
{
    public static final dec e;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        e = new dec(0, 0, 0, 0);
    }
    
    public dec(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static dec a(final dec dec, final dec dec2) {
        return c(Math.max(dec.a, dec2.a), Math.max(dec.b, dec2.b), Math.max(dec.c, dec2.c), Math.max(dec.d, dec2.d));
    }
    
    public static dec b(final dec dec, final dec dec2) {
        return c(Math.min(dec.a, dec2.a), Math.min(dec.b, dec2.b), Math.min(dec.c, dec2.c), Math.min(dec.d, dec2.d));
    }
    
    public static dec c(final int n, final int n2, final int n3, final int n4) {
        if (n == 0 && n2 == 0 && n3 == 0 && n4 == 0) {
            return dec.e;
        }
        return new dec(n, n2, n3, n4);
    }
    
    public static dec d(final Insets insets) {
        return c(m6b.a(insets), m6b.s(insets), m6b.w(insets), m6b.x(insets));
    }
    
    public final Insets e() {
        return bec.e(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && dec.class == o.getClass()) {
            final dec dec = (dec)o;
            return this.d == dec.d && this.a == dec.a && this.c == dec.c && this.b == dec.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return hia.m(sb, this.d, '}');
    }
}
