public final class jia implements sia
{
    public final float v;
    public final float w;
    
    public jia() {
        this.v = Math.max(1.0E-7f, Math.abs(0.1f));
        this.w = Math.max(1.0E-4f, 1.0f) * -4.2f;
    }
    
    public jia(float a, final xc8 xc8) {
        this.v = a;
        final float density = xc8.getDensity();
        a = kia.a;
        this.w = density * 386.0878f * 160.0f * 0.84f;
    }
    
    public iia a(final float n) {
        final float[] a = d70.a;
        final float v = this.v;
        final float w = this.w;
        final double a2 = d70.a(n, v * w);
        final double n2 = kia.a;
        final double n3 = n2 - 1.0;
        return new iia((long)(Math.exp(a2 / n3) * 1000.0), n, (float)(Math.exp(n2 / n3 * a2) * (v * w)));
    }
    
    @Override
    public float h() {
        return this.v;
    }
    
    @Override
    public float j(final float n, final long n2) {
        return n * (float)Math.exp((double)(n2 / 1000000L / 1000.0f * this.w));
    }
    
    @Override
    public long o(final float n) {
        return (long)((float)Math.log((double)(this.v / Math.abs(n))) * 1000.0f / this.w) * 1000000L;
    }
    
    @Override
    public float q(final float n, final float n2) {
        final float abs = Math.abs(n2);
        final float v = this.v;
        if (abs <= v) {
            return n;
        }
        final double log = Math.log((double)Math.abs(v / n2));
        final float w = this.w;
        return n2 / w * (float)Math.exp(w * (log / w * 1000.0) / 1000.0) + (n - n2 / w);
    }
    
    @Override
    public float r(long n, final float n2, final float n3) {
        n /= 1000000L;
        final float w = this.w;
        return n3 / w * (float)Math.exp((double)(w * n / 1000.0f)) + (n2 - n3 / w);
    }
}
