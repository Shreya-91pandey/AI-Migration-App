import android.graphics.Paint;

public final class f9q
{
    public static final f9q a;
    
    static {
        a = (f9q)new Object();
    }
    
    public final long a(final Paint paint) {
        final int i = j86.i;
        final long c = m6b.c(paint);
        final long n = 0x3FL & c;
        if (n < 16L) {
            return c;
        }
        return (c & 0xFFFFFFFFFFFFFFC0L) | n + 1L;
    }
    
    public final void b(final Paint paint, final int n) {
        m6b.n(paint, soh.X(n));
    }
    
    public final void c(final Paint paint, final long n) {
        m6b.m(paint, eqi.r0(n));
    }
}
