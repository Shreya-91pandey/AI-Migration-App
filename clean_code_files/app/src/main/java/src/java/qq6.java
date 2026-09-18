public class qq6
{
    public final u86 a;
    public final u86 b;
    public final u86 c;
    public final float[] d;
    
    public qq6(u86 u86, final u86 u87, final int n) {
        u86 m;
        if (rhc.p(u86.b, 12884901888L)) {
            m = mlc.m(u86);
        }
        else {
            m = u86;
        }
        u86 i;
        if (rhc.p(u87.b, 12884901888L)) {
            i = mlc.m(u87);
        }
        else {
            i = u87;
        }
        float[] array = xp7.i;
        float[] array3;
        final float[] array2 = array3 = null;
        Label_0208: {
            if (n == 3) {
                final boolean p3 = rhc.p(u86.b, 12884901888L);
                final boolean p4 = rhc.p(u87.b, 12884901888L);
                if (p3 && p4) {
                    array3 = array2;
                }
                else {
                    if (!p3) {
                        array3 = array2;
                        if (!p4) {
                            break Label_0208;
                        }
                    }
                    if (!p3) {
                        u86 = u87;
                    }
                    final jvp d = ((yrj)u86).d;
                    float[] a;
                    if (p3) {
                        a = d.a();
                    }
                    else {
                        a = array;
                    }
                    if (p4) {
                        array = d.a();
                    }
                    array3 = new float[] { a[0] / array[0], a[1] / array[1], a[2] / array[2] };
                }
            }
        }
        this(u87, m, i, array3);
    }
    
    public qq6(final u86 a, final u86 b, final u86 c, final float[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public long a(long d) {
        final float g = j86.g(d);
        final float f = j86.f(d);
        final float d2 = j86.d(d);
        final float c = j86.c(d);
        final u86 b = this.b;
        d = b.d(g, f, d2);
        final float intBitsToFloat = Float.intBitsToFloat((int)(d >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int)(d & 0xFFFFFFFFL));
        final float e = b.e(g, f, d2);
        final float[] d3 = this.d;
        float n = intBitsToFloat2;
        float n2 = e;
        float n3 = intBitsToFloat;
        if (d3 != null) {
            n3 = intBitsToFloat * d3[0];
            n = intBitsToFloat2 * d3[1];
            n2 = e * d3[2];
        }
        return this.c.f(n3, n, n2, c, this.a);
    }
}
