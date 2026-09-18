import android.graphics.PorterDuffColorFilter;
import android.os.Build$VERSION;
import android.graphics.ColorFilter;

public final class he2
{
    public final ColorFilter a;
    public final long b;
    public final int c;
    
    public he2(final long b, final int c) {
        Object d;
        if (Build$VERSION.SDK_INT >= 29) {
            d40.f();
            d = d40.d(t08.o0(b), soh.X(c));
        }
        else {
            d = new PorterDuffColorFilter(t08.o0(b), soh.a0(c));
        }
        this.a = (ColorFilter)d;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof he2) {
                final he2 he2 = (he2)o;
                final long b = he2.b;
                final int i = j86.i;
                if (foo.a(this.b, b)) {
                    if (this.c == he2.c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int i = j86.i;
        return Integer.hashCode(this.c) + Long.hashCode(this.b) * 31;
    }
    
    @Override
    public final String toString() {
        return lmf.t("BlendModeColorFilter(color=", j86.h(this.b), ", blendMode=", x90.L(this.c), ")");
    }
}
