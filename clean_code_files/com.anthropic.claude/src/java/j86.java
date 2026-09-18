public final class j86
{
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final int i = 0;
    public final long a = a;
    
    static {
        b = t08.e(4278190080L);
        t08.e(4282664004L);
        t08.e(4287137928L);
        c = t08.e(4291611852L);
        d = t08.e(4294967295L);
        e = t08.e(4294901760L);
        t08.e(4278255360L);
        f = t08.e(4278190335L);
        t08.e(4294967040L);
        t08.e(4278255615L);
        t08.e(4294902015L);
        g = t08.c(0);
        final float[] a = x86.a;
        h = t08.b(0.0f, 0.0f, 0.0f, 0.0f, (u86)x86.u);
    }
    
    public static final long a(final long n, final u86 u86) {
        final u86 e = e(n);
        final int c = e.c;
        final int c2 = u86.c;
        qq6 a;
        if ((c | c2) < 0) {
            a = mlc.A(e, u86);
        }
        else {
            final jlf a2 = bt6.a;
            final int n2 = c | c2 << 6;
            Object o;
            if ((o = ((sgc)a2).b(n2)) == null) {
                o = mlc.A(e, u86);
                a2.i(n2, o);
            }
            a = (qq6)o;
        }
        return a.a(n);
    }
    
    public static long b(final float n, final long n2) {
        return t08.b(g(n2), f(n2), d(n2), n, e(n2));
    }
    
    public static final float c(final long n) {
        float n2;
        float n3;
        if ((0x3FL & n) == 0x0L) {
            n2 = (float)mlc.l0(n >>> 56 & 0xFFL);
            n3 = 255.0f;
        }
        else {
            n2 = (float)mlc.l0(n >>> 6 & 0x3FFL);
            n3 = 1023.0f;
        }
        return n2 / n3;
    }
    
    public static final float d(final long n) {
        if ((0x3FL & n) == 0x0L) {
            return (float)mlc.l0(n >>> 32 & 0xFFL) / 255.0f;
        }
        final short n2 = (short)(n >>> 16 & 0xFFFFL);
        final int n3 = 0x8000 & n2;
        int n4 = (0xFFFF & n2) >>> 10 & 0x1F;
        final int n5 = n2 & 0x3FF;
        int n7;
        if (n4 == 0) {
            if (n5 != 0) {
                final float n6 = Float.intBitsToFloat(n5 + 1056964608) - lia.a;
                if (n3 == 0) {
                    return n6;
                }
                return -n6;
            }
            else {
                n4 = 0;
                n7 = 0;
            }
        }
        else {
            final int n8 = n5 << 13;
            if (n4 == 31) {
                final int n9 = 255;
                n7 = n8;
                n4 = n9;
                if (n8 != 0) {
                    n7 = (n8 | 0x400000);
                    n4 = n9;
                }
            }
            else {
                n4 += 112;
                n7 = n8;
            }
        }
        return Float.intBitsToFloat(n4 << 23 | n3 << 16 | n7);
    }
    
    public static final u86 e(final long n) {
        final float[] a = x86.a;
        return x86.y[(int)(n & 0x3FL)];
    }
    
    public static final float f(final long n) {
        if ((0x3FL & n) == 0x0L) {
            return (float)mlc.l0(n >>> 40 & 0xFFL) / 255.0f;
        }
        final short n2 = (short)(n >>> 32 & 0xFFFFL);
        final int n3 = 0x8000 & n2;
        int n4 = (0xFFFF & n2) >>> 10 & 0x1F;
        final int n5 = n2 & 0x3FF;
        int n7;
        if (n4 == 0) {
            if (n5 != 0) {
                final float n6 = Float.intBitsToFloat(n5 + 1056964608) - lia.a;
                if (n3 == 0) {
                    return n6;
                }
                return -n6;
            }
            else {
                n4 = 0;
                n7 = 0;
            }
        }
        else {
            final int n8 = n5 << 13;
            if (n4 == 31) {
                final int n9 = 255;
                n7 = n8;
                n4 = n9;
                if (n8 != 0) {
                    n7 = (n8 | 0x400000);
                    n4 = n9;
                }
            }
            else {
                n4 += 112;
                n7 = n8;
            }
        }
        return Float.intBitsToFloat(n4 << 23 | n3 << 16 | n7);
    }
    
    public static final float g(final long n) {
        if ((0x3FL & n) == 0x0L) {
            return (float)mlc.l0(n >>> 48 & 0xFFL) / 255.0f;
        }
        final short n2 = (short)(n >>> 48 & 0xFFFFL);
        final int n3 = 0x8000 & n2;
        int n4 = (0xFFFF & n2) >>> 10 & 0x1F;
        final int n5 = n2 & 0x3FF;
        int n7;
        if (n4 == 0) {
            if (n5 != 0) {
                final float n6 = Float.intBitsToFloat(n5 + 1056964608) - lia.a;
                if (n3 == 0) {
                    return n6;
                }
                return -n6;
            }
            else {
                n4 = 0;
                n7 = 0;
            }
        }
        else {
            final int n8 = n5 << 13;
            if (n4 == 31) {
                final int n9 = 255;
                n7 = n8;
                n4 = n9;
                if (n8 != 0) {
                    n7 = (n8 | 0x400000);
                    n4 = n9;
                }
            }
            else {
                n4 += 112;
                n7 = n8;
            }
        }
        return Float.intBitsToFloat(n4 << 23 | n3 << 16 | n7);
    }
    
    public static String h(final long n) {
        final float g = g(n);
        final float f = f(n);
        final float d = d(n);
        final float c = c(n);
        final String a = e(n).a;
        final StringBuilder r = hia.r("Color(", g, ", ", f, ", ");
        oz1.z(r, d, ", ", c, ", ");
        return oz1.p(r, a, ")");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof j86) {
            if (this.a == ((j86)o).a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Long.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        return h(this.a);
    }
}
