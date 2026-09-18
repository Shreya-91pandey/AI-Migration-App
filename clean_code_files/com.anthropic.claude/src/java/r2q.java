import android.graphics.Rect;

public final class r2q
{
    public final bj2 a;
    public final float b;
    
    public r2q(final Rect rect, final float n) {
        this(new bj2(rect), n);
    }
    
    public r2q(final bj2 a, final float b) {
        this.a = a;
        this.b = b;
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
        if (!r2q.class.equals(class1)) {
            return false;
        }
        o.getClass();
        final r2q r2q = (r2q)o;
        return mlc.q((Object)this.a, (Object)r2q.a) && this.b == r2q.b;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.b) + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WindowMetrics(_bounds=");
        sb.append((Object)this.a);
        sb.append(", density=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
