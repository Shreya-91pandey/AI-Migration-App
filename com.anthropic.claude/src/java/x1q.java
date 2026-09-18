import android.view.DisplayCutout;
import java.util.Objects;
import android.view.View;
import android.view.WindowInsets;

public class x1q extends w1q
{
    public x1q(final h2q h2q, final WindowInsets windowInsets) {
        super(h2q, windowInsets);
    }
    
    public x1q(final h2q h2q, final x1q x1q) {
        super(h2q, x1q);
    }
    
    @Override
    public h2q a() {
        return h2q.c(k4.d(super.c), null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof x1q)) {
            return false;
        }
        final x1q x1q = (x1q)o;
        return Objects.equals((Object)super.c, (Object)x1q.c) && Objects.equals((Object)super.g, (Object)x1q.g) && v1q.M(super.h, x1q.h);
    }
    
    @Override
    public yo8 h() {
        final DisplayCutout c = k4.c(super.c);
        if (c == null) {
            return null;
        }
        return new yo8(c);
    }
    
    @Override
    public int hashCode() {
        return super.c.hashCode();
    }
}
