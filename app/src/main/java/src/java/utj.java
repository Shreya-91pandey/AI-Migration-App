import androidx.compose.material3.c;

public abstract class utj
{
    public static final b09 a;
    public static final jm6 b;
    public static final c c;
    public static final c d;
    
    static {
        a = new b09((jta)new lih((byte)28), (byte)0);
        b = new jm6((lta)new drj((byte)2));
        final long h = j86.h;
        c = new c(true, Float.NaN, h, (aql)null, true);
        d = new c(false, Float.NaN, h, (aql)null, true);
    }
    
    public static c a(boolean b, float n, long h, aql aql, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            b = true;
        }
        if ((n2 & 0x2) != 0x0) {
            n = Float.NaN;
        }
        if ((n2 & 0x4) != 0x0) {
            h = j86.h;
        }
        if ((n2 & 0x8) != 0x0) {
            aql = null;
        }
        if (!qs8.e(n, Float.NaN) || !foo.a(h, j86.h) || aql != null) {
            return new c(b, n, h, aql, true);
        }
        if (b) {
            return utj.c;
        }
        return utj.d;
    }
}
