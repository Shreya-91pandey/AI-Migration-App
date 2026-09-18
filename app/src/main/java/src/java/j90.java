import android.graphics.Path$Direction;
import android.graphics.Path;

public abstract class j90
{
    public static final g90 a() {
        return new g90(new Path());
    }
    
    public static final void b(final String s) {
        throw new IllegalStateException(s);
    }
    
    public static final Path$Direction c(int d) {
        d = ge9.D(d);
        if (d == 0) {
            return Path$Direction.CCW;
        }
        if (d == 1) {
            return Path$Direction.CW;
        }
        en9.r();
        return null;
    }
}
