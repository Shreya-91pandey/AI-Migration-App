public final class k2j
{
    public static final k2j e;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    
    static {
        e = new k2j(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public k2j(final float a, final float b, final float c, final float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static k2j b(final k2j k2j, float a, float c, float d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = k2j.a;
        }
        float b;
        if ((n & 0x2) != 0x0) {
            b = k2j.b;
        }
        else {
            b = Float.NEGATIVE_INFINITY;
        }
        if ((n & 0x4) != 0x0) {
            c = k2j.c;
        }
        if ((n & 0x8) != 0x0) {
            d = k2j.d;
        }
        k2j.getClass();
        return new k2j(a, b, c, d);
    }
    
    public final boolean a(final long n) {
        final float intBitsToFloat = Float.intBitsToFloat((int)(n >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(n & 0xFFFFFFFFL));
        final float a = this.a;
        boolean b = false;
        final boolean b2 = intBitsToFloat >= a;
        final boolean b3 = intBitsToFloat < this.c;
        final boolean b4 = intBitsToFloat2 >= this.b;
        if (intBitsToFloat2 < this.d) {
            b = true;
        }
        return b2 & b3 & b4 & b;
    }
    
    public final long c() {
        final float c = this.c;
        final float a = this.a;
        return (long)Float.floatToRawIntBits((c - a) / 2.0f + a) << 32 | ((long)Float.floatToRawIntBits(this.d) & 0xFFFFFFFFL);
    }
    
    public final long d() {
        return (long)Float.floatToRawIntBits(this.a) << 32 | ((long)Float.floatToRawIntBits(this.d) & 0xFFFFFFFFL);
    }
    
    public final long e() {
        return (long)Float.floatToRawIntBits(this.c) << 32 | ((long)Float.floatToRawIntBits(this.d) & 0xFFFFFFFFL);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof k2j)) {
            return false;
        }
        final k2j k2j = (k2j)o;
        return Float.compare(this.a, k2j.a) == 0 && Float.compare(this.b, k2j.b) == 0 && Float.compare(this.c, k2j.c) == 0 && Float.compare(this.d, k2j.d) == 0;
    }
    
    public final long f() {
        final float c = this.c;
        final float a = this.a;
        final float n = (c - a) / 2.0f;
        final float d = this.d;
        final float b = this.b;
        return ((long)Float.floatToRawIntBits((d - b) / 2.0f + b) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(n + a) << 32;
    }
    
    public final long g() {
        return ((long)Float.floatToRawIntBits(this.d - this.b) & 0xFFFFFFFFL) | (long)Float.floatToRawIntBits(this.c - this.a) << 32;
    }
    
    public final long h() {
        return (long)Float.floatToRawIntBits(this.a) << 32 | ((long)Float.floatToRawIntBits(this.b) & 0xFFFFFFFFL);
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.d) + oz1.d(this.c, oz1.d(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }
    
    public final k2j i(final k2j k2j) {
        return new k2j(Math.max(this.a, k2j.a), Math.max(this.b, k2j.b), Math.min(this.c, k2j.c), Math.min(this.d, k2j.d));
    }
    
    public final boolean j() {
        final float a = this.a;
        final float c = this.c;
        boolean b = false;
        final boolean b2 = a >= c;
        if (this.b >= this.d) {
            b = true;
        }
        return b2 | b;
    }
    
    public final boolean k(final k2j k2j) {
        final float a = this.a;
        final float c = k2j.c;
        boolean b = false;
        final boolean b2 = a < c;
        final boolean b3 = k2j.a < this.c;
        final boolean b4 = this.b < k2j.d;
        if (k2j.b < this.d) {
            b = true;
        }
        return b2 & b3 & b4 & b;
    }
    
    public final k2j l(final float n, final float n2) {
        return new k2j(this.a + n, this.b + n2, this.c + n, this.d + n2);
    }
    
    public final k2j m(final long n) {
        final int n2 = (int)(n >> 32);
        final float intBitsToFloat = Float.intBitsToFloat(n2);
        final float a = this.a;
        final int n3 = (int)(n & 0xFFFFFFFFL);
        return new k2j(intBitsToFloat + a, Float.intBitsToFloat(n3) + this.b, Float.intBitsToFloat(n2) + this.c, Float.intBitsToFloat(n3) + this.d);
    }
    
    @Override
    public final String toString() {
        return oz1.q(oz1.t("Rect.fromLTRB(", n1r.l(this.a), ", ", n1r.l(this.b), ", "), n1r.l(this.c), ", ", n1r.l(this.d), ")");
    }
}
