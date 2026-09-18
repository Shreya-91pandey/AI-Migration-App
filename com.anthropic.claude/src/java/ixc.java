public final class ixc extends u86
{
    public final byte d;
    
    @Override
    public final float a(final int n) {
        switch (this.d) {
            default: {
                return 2.0f;
            }
            case 0: {
                float n2;
                if (n == 0) {
                    n2 = 100.0f;
                }
                else {
                    n2 = 128.0f;
                }
                return n2;
            }
        }
    }
    
    @Override
    public final float b(final int n) {
        switch (this.d) {
            default: {
                return -2.0f;
            }
            case 0: {
                float n2;
                if (n == 0) {
                    n2 = 0.0f;
                }
                else {
                    n2 = -128.0f;
                }
                return n2;
            }
        }
    }
    
    @Override
    public final long d(float n, float n2, float n3) {
        long n7 = 0L;
        long n8 = 0L;
        switch (this.d) {
            default: {
                n3 = n;
                if (n < -2.0f) {
                    n3 = -2.0f;
                }
                final float n4 = 2.0f;
                float n5 = n3;
                if (n3 > 2.0f) {
                    n5 = 2.0f;
                }
                n = n2;
                if (n2 < -2.0f) {
                    n = -2.0f;
                }
                if (n > 2.0f) {
                    n = n4;
                }
                final long n6 = Float.floatToRawIntBits(n5);
                n7 = Float.floatToRawIntBits(n);
                n8 = n6 << 32;
                break;
            }
            case 0: {
                n3 = n;
                if (n < 0.0f) {
                    n3 = 0.0f;
                }
                float n9 = n3;
                if (n3 > 100.0f) {
                    n9 = 100.0f;
                }
                n = n2;
                if (n2 < -128.0f) {
                    n = -128.0f;
                }
                n2 = n;
                if (n > 128.0f) {
                    n2 = 128.0f;
                }
                n3 = (n9 + 16.0f) / 116.0f;
                n = n2 * 0.002f + n3;
                if (n > 0.20689656f) {
                    n *= n * n;
                }
                else {
                    n = (n - 0.13793103f) * 0.12841855f;
                }
                if (n3 > 0.20689656f) {
                    n2 = n3 * n3 * n3;
                }
                else {
                    n2 = (n3 - 0.13793103f) * 0.12841855f;
                }
                final float[] i = xp7.i;
                n3 = i[0];
                final float n10 = i[1];
                final long n11 = Float.floatToRawIntBits(n * n3);
                n7 = Float.floatToRawIntBits(n2 * n10);
                n8 = n11 << 32;
                break;
            }
        }
        return n8 | (n7 & 0xFFFFFFFFL);
    }
    
    @Override
    public final float e(float n, float n2, final float n3) {
        switch (this.d) {
            default: {
                n = n3;
                if (n3 < -2.0f) {
                    n = -2.0f;
                }
                n2 = n;
                if (n > 2.0f) {
                    n2 = 2.0f;
                }
                return n2;
            }
            case 0: {
                n2 = n;
                if (n < 0.0f) {
                    n2 = 0.0f;
                }
                float n4 = n2;
                if (n2 > 100.0f) {
                    n4 = 100.0f;
                }
                n = n3;
                if (n3 < -128.0f) {
                    n = -128.0f;
                }
                n2 = n;
                if (n > 128.0f) {
                    n2 = 128.0f;
                }
                n = (n4 + 16.0f) / 116.0f - n2 * 0.005f;
                if (n > 0.20689656f) {
                    n *= n * n;
                }
                else {
                    n = 0.12841855f * (n - 0.13793103f);
                }
                return n * xp7.i[2];
            }
        }
    }
    
    @Override
    public final long f(float n, float n2, float n3, final float n4, final u86 u86) {
        switch (this.d) {
            default: {
                float n5 = n;
                if (n < -2.0f) {
                    n5 = -2.0f;
                }
                final float n6 = 2.0f;
                float n7 = n5;
                if (n5 > 2.0f) {
                    n7 = 2.0f;
                }
                n = n2;
                if (n2 < -2.0f) {
                    n = -2.0f;
                }
                n2 = n;
                if (n > 2.0f) {
                    n2 = 2.0f;
                }
                n = n3;
                if (n3 < -2.0f) {
                    n = -2.0f;
                }
                if (n > 2.0f) {
                    n = n6;
                }
                return t08.b(n7, n2, n, n4, u86);
            }
            case 0: {
                final float[] i = xp7.i;
                n /= i[0];
                n2 /= i[1];
                n3 /= i[2];
                if (n > 0.008856452f) {
                    n = (float)Math.cbrt((double)n);
                }
                else {
                    n = n * 7.787037f + 0.13793103f;
                }
                if (n2 > 0.008856452f) {
                    n2 = (float)Math.cbrt((double)n2);
                }
                else {
                    n2 = n2 * 7.787037f + 0.13793103f;
                }
                if (n3 > 0.008856452f) {
                    n3 = (float)Math.cbrt((double)n3);
                }
                else {
                    n3 = n3 * 7.787037f + 0.13793103f;
                }
                final float n8 = 116.0f * n2 - 16.0f;
                final float n9 = (n - n2) * 500.0f;
                final float n10 = (n2 - n3) * 200.0f;
                n = n8;
                if (n8 < 0.0f) {
                    n = 0.0f;
                }
                n2 = n;
                if (n > 100.0f) {
                    n2 = 100.0f;
                }
                n = n9;
                if (n9 < -128.0f) {
                    n = -128.0f;
                }
                final float n11 = 128.0f;
                n3 = n;
                if (n > 128.0f) {
                    n3 = 128.0f;
                }
                n = n10;
                if (n10 < -128.0f) {
                    n = -128.0f;
                }
                if (n > 128.0f) {
                    n = n11;
                }
                return t08.b(n2, n3, n, n4, u86);
            }
        }
    }
}
