import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public final class c3q
{
    public static final int c = 0;
    public final int a;
    public final int b;
    
    static {
        final Integer value = 0;
        final List y = lq6.Y((Object[])new Integer[] { value, 600, 840 });
        final ArrayList z0 = c86.Z0((Collection)y, (Iterable)lq6.Y((Object[])new Integer[] { 1200, 1600 }));
        final List y2 = lq6.Y((Object[])new Integer[] { value, 480, 900 });
        y7j.J(y, y2);
        y7j.J((List)z0, y2);
    }
    
    public c3q(final int a, final int b) {
        this.a = a;
        this.b = b;
        if (a < 0) {
            uy8.c(a, "Expected minWidthDp to be at least 0, minWidthDp: ");
            throw null;
        }
        if (b >= 0) {
            return;
        }
        uy8.c(b, "Expected minHeightDp to be at least 0, minHeightDp: ");
        throw null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && c3q.class == o.getClass()) {
            final c3q c3q = (c3q)o;
            return this.a == c3q.a && this.b == c3q.b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb.append(this.a);
        sb.append(", minHeightDp=");
        return hia.m(sb, this.b, ')');
    }
}
