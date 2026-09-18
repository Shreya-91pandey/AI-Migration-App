public interface yl2
{
    public static final xl2 a = xl2.a;
    
    default float a(final float n, float abs, float n2) {
        yl2.a.getClass();
        final float n3 = abs + n;
        if (n < 0.0f || n3 > n2) {
            if (n >= 0.0f || n3 <= n2) {
                abs = Math.abs(n);
                n2 = n3 - n2;
                if (abs < Math.abs(n2)) {
                    return n;
                }
                return n2;
            }
        }
        return 0.0f;
    }
}
