public final class hrg
{
    public final a90 a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    
    public hrg(final a90 a, final int b, final int c, final int d, final int e, final float f, final float g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final k2j a(final k2j k2j) {
        return k2j.m((long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(this.f) & 0xFFFFFFFFL));
    }
    
    public final long b(final long n, final boolean b) {
        if (b) {
            final long b2 = dnn.b;
            if (dnn.c(n, b2)) {
                return b2;
            }
        }
        final int c = dnn.c;
        final int n2 = (int)(n >> 32);
        final int b3 = this.b;
        return rhc.c(n2 + b3, (int)(n & 0xFFFFFFFFL) + b3);
    }
    
    public final k2j c(final k2j k2j) {
        return k2j.m((long)Float.floatToRawIntBits(0.0f) << 32 | ((long)Float.floatToRawIntBits(-this.f) & 0xFFFFFFFFL));
    }
    
    public final int d(final int n) {
        final int c = this.c;
        final int b = this.b;
        return ncq.o(n, b, c) - b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof hrg) {
                final hrg hrg = (hrg)o;
                if (this.a != hrg.a) {
                    return false;
                }
                if (this.b == hrg.b) {
                    if (this.c == hrg.c) {
                        if (this.d == hrg.d) {
                            if (this.e == hrg.e) {
                                if (Float.compare(this.f, hrg.f) == 0) {
                                    if (Float.compare(this.g, hrg.g) == 0) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.g) + oz1.d(this.f, hia.y(this.e, hia.y(this.d, hia.y(this.c, hia.y(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("ParagraphInfo(paragraph=");
        sb.append((Object)this.a);
        sb.append(", startIndex=");
        sb.append(this.b);
        sb.append(", endIndex=");
        xc2.m(this.c, this.d, ", startLineIndex=", ", endLineIndex=", sb);
        sb.append(this.e);
        sb.append(", top=");
        sb.append(this.f);
        sb.append(", bottom=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
