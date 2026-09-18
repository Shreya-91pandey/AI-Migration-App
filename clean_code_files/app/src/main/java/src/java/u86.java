public abstract class u86
{
    public final String a;
    public final long b;
    public final int c;
    
    public u86(final String a, final long b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a.length() == 0) {
            en9.s("The name of a color space cannot be null and must contain at least 1 character");
            throw null;
        }
        if (c >= -1 && c <= 63) {
            return;
        }
        en9.s("The id must be between -1 and 63");
        throw null;
    }
    
    public float a(final int n) {
        if (n == 0) {
            return 1.0f;
        }
        return 0.5f;
    }
    
    public float b(final int n) {
        if (n == 0) {
            return 0.0f;
        }
        return -0.5f;
    }
    
    public boolean c() {
        return false;
    }
    
    public long d(float n, float n2, float n3) {
        float n4 = n;
        if (n < 0.0f) {
            n4 = 0.0f;
        }
        float n5 = n4;
        if (n4 > 1.0f) {
            n5 = 1.0f;
        }
        n = n2;
        if (n2 < -0.5f) {
            n = -0.5f;
        }
        final float n6 = 0.5f;
        n2 = n;
        if (n > 0.5f) {
            n2 = 0.5f;
        }
        n = n3;
        if (n3 < -0.5f) {
            n = -0.5f;
        }
        if (n > 0.5f) {
            n = n6;
        }
        final float[] g = s7g.g;
        final float n7 = g[0];
        n3 = g[3];
        n3 = g[6] * n + (n3 * n2 + n7 * n5);
        final float n8 = g[7] * n + (g[4] * n2 + g[1] * n5);
        final float n9 = g[8] * n + (g[5] * n2 + g[2] * n5);
        n = n3 * n3 * n3;
        n2 = n8 * n8 * n8;
        final float n10 = n9 * n9 * n9;
        final float[] f = s7g.f;
        n3 = f[0];
        return (long)Float.floatToRawIntBits(f[6] * n10 + (f[3] * n2 + n3 * n)) << 32 | (0xFFFFFFFFL & (long)Float.floatToRawIntBits(f[7] * n10 + (f[4] * n2 + f[1] * n)));
    }
    
    public float e(float n, float n2, float n3) {
        float n4 = n;
        if (n < 0.0f) {
            n4 = 0.0f;
        }
        float n5 = n4;
        if (n4 > 1.0f) {
            n5 = 1.0f;
        }
        n = n2;
        if (n2 < -0.5f) {
            n = -0.5f;
        }
        final float n6 = 0.5f;
        n2 = n;
        if (n > 0.5f) {
            n2 = 0.5f;
        }
        n = n3;
        if (n3 < -0.5f) {
            n = -0.5f;
        }
        if (n > 0.5f) {
            n = n6;
        }
        final float[] g = s7g.g;
        final float n7 = g[0];
        n3 = g[3];
        n3 = g[6] * n + (n3 * n2 + n7 * n5);
        final float n8 = g[7] * n + (g[4] * n2 + g[1] * n5);
        n = g[8] * n + (g[5] * n2 + g[2] * n5);
        final float[] f = s7g.f;
        n2 = f[2];
        return f[8] * (n * n * n) + (f[5] * (n8 * n8 * n8) + n2 * (n3 * n3 * n3));
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null) {
            if (this.getClass() == o.getClass()) {
                final u86 u86 = (u86)o;
                if (this.c == u86.c) {
                    if (this.a.equals(u86.a)) {
                        return rhc.p(this.b, u86.b);
                    }
                }
            }
        }
        return false;
    }
    
    public long f(float n, float n2, float n3, final float n4, final u86 u86) {
        final float[] d = s7g.d;
        final float n5 = d[0];
        final float n6 = d[3];
        final float n7 = d[6];
        final float n8 = d[1];
        final float n9 = d[4];
        final float n10 = d[7];
        final float n11 = d[2];
        final float n12 = d[5];
        final float n13 = d[8];
        final float y = vt4.y(n7 * n3 + (n6 * n2 + n5 * n));
        final float y2 = vt4.y(n10 * n3 + (n9 * n2 + n8 * n));
        final float y3 = vt4.y(n13 * n3 + (n12 * n2 + n11 * n));
        final float[] e = s7g.e;
        final float n14 = e[0];
        final float n15 = e[3];
        final float n16 = e[6];
        n2 = e[1];
        final float n17 = e[4];
        n3 = e[7];
        n = e[2];
        return t08.b(n16 * y3 + (n15 * y2 + n14 * y), n3 * y3 + (n17 * y2 + n2 * y), e[8] * y3 + (e[5] * y2 + n * y), n4, u86);
    }
    
    @Override
    public int hashCode() {
        return hia.d(this.a.hashCode() * 31, this.b, 31) + this.c;
    }
    
    @Override
    public final String toString() {
        final String d0 = rhc.d0(this.b);
        final StringBuilder sb = new StringBuilder(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        sb.append(d0);
        sb.append(")");
        return sb.toString();
    }
}
