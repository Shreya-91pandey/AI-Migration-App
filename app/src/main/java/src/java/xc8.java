public interface xc8
{
    default int E0(final long n) {
        return Math.round(this.W0(n));
    }
    
    default float I(final long n) {
        if (!wnn.a(vnn.b(n), 4294967296L)) {
            iac.b("Only Sp can convert to Px");
        }
        final float[] a = qoa.a;
        if (this.o0() < 1.03f) {
            return this.o0() * vnn.c(n);
        }
        final poa a2 = qoa.a(this.o0());
        if (a2 == null) {
            return this.o0() * vnn.c(n);
        }
        return a2.b(vnn.c(n));
    }
    
    default int L0(float w0) {
        w0 = this.w0(w0);
        if (Float.isInfinite(w0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(w0);
    }
    
    default long T0(final long n) {
        if (n != 9205357640488583168L) {
            return (long)Float.floatToRawIntBits(this.w0(us8.d(n))) << 32 | ((long)Float.floatToRawIntBits(this.w0(us8.c(n))) & 0xFFFFFFFFL);
        }
        return 9205357640488583168L;
    }
    
    default float W0(final long n) {
        if (!wnn.a(vnn.b(n), 4294967296L)) {
            iac.b("Only Sp can convert to Px");
        }
        return this.w0(this.I(n));
    }
    
    default long X(final int n) {
        return this.x(this.e0(n));
    }
    
    default long Z(final float n) {
        return this.x(this.i0(n));
    }
    
    default float e0(final int n) {
        return n / this.getDensity();
    }
    
    float getDensity();
    
    default float i0(final float n) {
        return n / this.getDensity();
    }
    
    float o0();
    
    default float w0(final float n) {
        return this.getDensity() * n;
    }
    
    default long x(float a) {
        final float[] a2 = qoa.a;
        if (this.o0() >= 1.03f) {
            final poa a3 = qoa.a(this.o0());
            if (a3 != null) {
                a = a3.a(a);
            }
            else {
                a /= this.o0();
            }
            return tsf.Q(a, 4294967296L);
        }
        return tsf.Q(a / this.o0(), 4294967296L);
    }
    
    default long y(final long n) {
        if (n != 9205357640488583168L) {
            return ncq.b(this.i0(Float.intBitsToFloat((int)(n >> 32))), this.i0(Float.intBitsToFloat((int)(n & 0xFFFFFFFFL))));
        }
        return 9205357640488583168L;
    }
}
