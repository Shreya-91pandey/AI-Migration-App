import android.os.Build$VERSION;

public final class u2q implements t2q
{
    public final yc8 b;
    
    public u2q() {
        Object b;
        if (Build$VERSION.SDK_INT >= 34) {
            b = zc8.v;
        }
        else {
            b = ier.C;
        }
        this.b = (yc8)b;
        lq6.g((Object[])new Integer[] { 1, 2, 4, 8, 16, 32, 64, 128 });
    }
}
