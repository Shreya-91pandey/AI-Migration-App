import android.util.Log;

public final class krd
{
    public static final Object b;
    public static volatile krd c;
    public final byte a;
    
    static {
        b = new Object();
    }
    
    public krd(final int a) {
        this.a = (byte)a;
    }
    
    public static krd c() {
        final Object b;
        monitorenter(b = krd.b);
        Label_0034: {
            try {
                if (krd.c == null) {
                    krd.c = new krd(3);
                }
                break Label_0034;
            }
            finally {
                monitorexit(b);
                final krd c = krd.c;
                monitorexit(b);
                return c;
            }
        }
    }
    
    public static String e(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(s.substring(0, 20));
        }
        else {
            sb.append(s);
        }
        return sb.toString();
    }
    
    public final void a(final String s, final String s2) {
        if (this.a <= 6) {
            Log.e(s, s2);
        }
    }
    
    public final void b(final String s, final String s2, final Throwable t) {
        if (this.a <= 6) {
            Log.e(s, s2, t);
        }
    }
    
    public final void d(final String s, final String s2) {
        if (this.a <= 4) {
            Log.i(s, s2);
        }
    }
    
    public final void f(final String s, final String s2) {
        if (this.a <= 5) {
            Log.w(s, s2);
        }
    }
}
