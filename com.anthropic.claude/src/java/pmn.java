public final class pmn
{
    public final omn a;
    public nzc b;
    public nzc c;
    
    public pmn(final omn a, final nzc c) {
        this.a = a;
        this.b = null;
        this.c = c;
    }
    
    public final long a(final long n) {
        final nzc b = this.b;
        k2j k2j2;
        final k2j k2j = k2j2 = k2j.e;
        if (b != null) {
            if (b.p()) {
                final nzc c = this.c;
                if (c != null) {
                    k2j2 = c.L(b, true);
                }
                else {
                    k2j2 = null;
                }
            }
            else {
                k2j2 = k2j;
            }
            if (k2j2 == null) {
                k2j2 = k2j;
            }
        }
        return ekq.g(n, k2j2);
    }
    
    public final int b(long d, final boolean b) {
        long a = d;
        if (b) {
            a = this.a(d);
        }
        d = this.d(a);
        return this.a.b.g(d);
    }
    
    public final boolean c(long d) {
        d = this.d(this.a(d));
        final float intBitsToFloat = Float.intBitsToFloat((int)(0xFFFFFFFFL & d));
        final omn a = this.a;
        final int e = a.b.e(intBitsToFloat);
        final int n = (int)(d >> 32);
        return Float.intBitsToFloat(n) >= a.g(e) && Float.intBitsToFloat(n) <= a.h(e);
    }
    
    public final long d(final long n) {
        nzc b = this.b;
        if (b != null) {
            final boolean p = b.p();
            nzc nzc = null;
            if (!p) {
                b = null;
            }
            if (b != null) {
                final nzc c = this.c;
                if (c != null) {
                    if (c.p()) {
                        nzc = c;
                    }
                    if (nzc != null) {
                        return b.H(nzc, n);
                    }
                }
            }
        }
        return n;
    }
    
    public final long e(final long n) {
        nzc b = this.b;
        if (b != null) {
            final boolean p = b.p();
            nzc nzc = null;
            if (!p) {
                b = null;
            }
            if (b != null) {
                final nzc c = this.c;
                if (c != null) {
                    if (c.p()) {
                        nzc = c;
                    }
                    if (nzc != null) {
                        return nzc.H(b, n);
                    }
                }
            }
        }
        return n;
    }
}
