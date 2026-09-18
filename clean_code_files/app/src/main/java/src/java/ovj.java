public abstract class ovj
{
    public static final nvj a;
    
    static {
        a = a(50);
    }
    
    public static final nvj a(final int n) {
        final i0h i0h = new i0h((float)n);
        return new nvj(i0h, i0h, i0h, i0h);
    }
    
    public static final nvj b(final float n) {
        final rs8 rs8 = new rs8(n);
        return new nvj(rs8, rs8, rs8, rs8);
    }
    
    public static final nvj c(final float n, final float n2, final float n3, final float n4) {
        return new nvj(new rs8(n), new rs8(n2), new rs8(n3), new rs8(n4));
    }
    
    public static nvj d(float n, float n2, float n3, float n4, final int n5) {
        if ((n5 & 0x1) != 0x0) {
            n = 0.0f;
        }
        if ((n5 & 0x2) != 0x0) {
            n2 = 0.0f;
        }
        if ((n5 & 0x4) != 0x0) {
            n3 = 0.0f;
        }
        if ((n5 & 0x8) != 0x0) {
            n4 = 0.0f;
        }
        return c(n, n2, n3, n4);
    }
}
