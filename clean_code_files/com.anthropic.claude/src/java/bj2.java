import android.graphics.Rect;

public final class bj2
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    
    static {
        new bj2(0, 0, 0, 0);
    }
    
    public bj2(final int a, final int b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if (a > c) {
            oyl.g((Object)smk.o(a, c, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (b <= d) {
            return;
        }
        oyl.g((Object)smk.o(b, d, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }
    
    public bj2(final Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    public final int a() {
        return this.d - this.b;
    }
    
    public final int b() {
        return this.c - this.a;
    }
    
    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        Class<?> class1;
        if (o != null) {
            class1 = o.getClass();
        }
        else {
            class1 = null;
        }
        if (!bj2.class.equals(class1)) {
            return false;
        }
        o.getClass();
        final bj2 bj2 = (bj2)o;
        return this.a == bj2.a && this.b == bj2.b && this.c == bj2.c && this.d == bj2.d;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(bj2.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return smk.q(this.d, "] }", sb);
    }
}
