import kotlinx.serialization.KSerializer;

public final class rh2
{
    public static final long b;
    public final t2b a;
    
    static {
        final awp w = lz8.w;
        b = ri2.E0(2, pz8.B);
    }
    
    public rh2(final t2b a) {
        this.a = a;
    }
    
    public final long a() {
        final awp w = lz8.w;
        final Double n = (Double)((u2b)this.a).a.i("android_bootstrap_refresh_min_interval_sec", (KSerializer)or8.a, lpl.w);
        double doubleValue;
        if (n != null) {
            doubleValue = n;
        }
        else {
            doubleValue = 0.0;
        }
        final pz8 w2 = pz8.w;
        final pz8 z = pz8.z;
        final double o = yi2.o(doubleValue, z, w2);
        if (!Double.isNaN(o)) {
            final long i = k8e.I(o);
            long n2;
            if (-4611686018426999999L <= i && i < 4611686018427000000L) {
                n2 = ri2.A(i);
            }
            else {
                n2 = ri2.z(k8e.I(yi2.o(doubleValue, z, pz8.y)));
            }
            return ((lz8)ncq.t((Comparable)new lz8(n2), (Comparable)new lz8(0L), (Comparable)new lz8(rh2.b))).v;
        }
        en9.s("Duration value cannot be NaN.");
        return 0L;
    }
}
