public abstract class jak
{
    public static final long[] a;
    public static final tmf b;
    
    static {
        a = new long[] { -9187201950435737345L, -1L };
        b = new tmf(0);
    }
    
    public static final int a(final int n) {
        if (n == 7) {
            return 6;
        }
        return n - n / 8;
    }
    
    public static final int b(final int n) {
        if (n == 0) {
            return 6;
        }
        return n * 2 + 1;
    }
    
    public static final int c(final int n) {
        if (n > 0) {
            return -1 >>> Integer.numberOfLeadingZeros(n);
        }
        return 0;
    }
    
    public static final int d(final int n) {
        if (n == 7) {
            return 8;
        }
        return (n - 1) / 7 + n;
    }
}
