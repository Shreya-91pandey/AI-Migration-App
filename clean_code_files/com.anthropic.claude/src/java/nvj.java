public final class nvj implements aql
{
    public final ec7 a;
    public final ec7 b;
    public final ec7 c;
    public final ec7 d;
    
    public nvj(final ec7 a, final ec7 b, final ec7 c, final ec7 d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static nvj b(final nvj nvj, ec7 a, ec7 b, ec7 c, ec7 d, final int n) {
        if ((n & 0x1) != 0x0) {
            a = nvj.a;
        }
        if ((n & 0x2) != 0x0) {
            b = nvj.b;
        }
        if ((n & 0x4) != 0x0) {
            c = nvj.c;
        }
        if ((n & 0x8) != 0x0) {
            d = nvj.d;
        }
        nvj.getClass();
        return new nvj(a, b, c, d);
    }
    
    public final k8e a(long n, final qzc qzc, final xc8 xc8) {
        final float a = this.a.a(n, xc8);
        final float a2 = this.b.a(n, xc8);
        final float a3 = this.c.a(n, xc8);
        final float a4 = this.d.a(n, xc8);
        final float c = yzl.c(n);
        final float n2 = a + a4;
        float n3 = a4;
        float n4 = a;
        if (n2 > c) {
            final float n5 = c / n2;
            n4 = a * n5;
            n3 = a4 * n5;
        }
        final float n6 = a2 + a3;
        float n7 = a2;
        float n8 = a3;
        if (n6 > c) {
            final float n9 = c / n6;
            n7 = a2 * n9;
            n8 = a3 * n9;
        }
        if (n4 < 0.0f || n7 < 0.0f || n8 < 0.0f || n3 < 0.0f) {
            final StringBuilder r = hia.r("Corner size in Px can't be negative(topStart = ", n4, ", topEnd = ", n7, ", bottomEnd = ");
            r.append(n8);
            r.append(", bottomStart = ");
            r.append(n3);
            r.append(")!");
            jac.a(r.toString());
        }
        if (n4 + n7 + n8 + n3 == 0.0f) {
            return (k8e)new rig(rml.f(0L, n));
        }
        final k2j f = rml.f(0L, n);
        final qzc v = qzc.v;
        float n10;
        if (qzc == v) {
            n10 = n4;
        }
        else {
            n10 = n7;
        }
        final long n11 = Float.floatToRawIntBits(n10);
        final long n12 = Float.floatToRawIntBits(n10);
        if (qzc == v) {
            n4 = n7;
        }
        n = Float.floatToRawIntBits(n4);
        final long n13 = Float.floatToRawIntBits(n4);
        float n14;
        if (qzc == v) {
            n14 = n8;
        }
        else {
            n14 = n3;
        }
        final long n15 = Float.floatToRawIntBits(n14);
        final long n16 = Float.floatToRawIntBits(n14);
        if (qzc != v) {
            n3 = n8;
        }
        return (k8e)new sig(t08.o(f, (n12 & 0xFFFFFFFFL) | n11 << 32, (n13 & 0xFFFFFFFFL) | n << 32, n15 << 32 | (n16 & 0xFFFFFFFFL), (long)Float.floatToRawIntBits(n3) << 32 | ((long)Float.floatToRawIntBits(n3) & 0xFFFFFFFFL)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof nvj)) {
            return false;
        }
        final nvj nvj = (nvj)o;
        return mlc.q((Object)this.a, (Object)nvj.a) && mlc.q((Object)this.b, (Object)nvj.b) && mlc.q((Object)this.c, (Object)nvj.c) && mlc.q((Object)this.d, (Object)nvj.d);
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 31) * 31) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("RoundedCornerShape(topStart = ");
        sb.append((Object)this.a);
        sb.append(", topEnd = ");
        sb.append((Object)this.b);
        sb.append(", bottomEnd = ");
        sb.append((Object)this.c);
        sb.append(", bottomStart = ");
        sb.append((Object)this.d);
        sb.append(")");
        return sb.toString();
    }
}
