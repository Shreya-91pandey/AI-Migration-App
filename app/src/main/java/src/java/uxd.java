import java.util.Arrays;

public final class uxd implements xc8
{
    public boolean v;
    public long w;
    public long x;
    public final wxd y;
    
    public uxd(final wxd y) {
        this.y = y;
        this.w = 9223372034707292159L;
        this.x = 0L;
    }
    
    public final void a(final wlb wlb, final float n) {
        final wxd y = this.y;
        kob l;
        if ((l = y.L) == null) {
            l = new kob();
            y.L = l;
        }
        final int b1 = iw0.b1((Object[])l.b, (Object)wlb);
        if (b1 < 0) {
            final int a = l.a;
            final wlb[] array = (wlb[])l.b;
            if (a == array.length) {
                final int n2 = a * 2;
                l.b = Arrays.copyOf((Object[])array, n2);
                l.c = Arrays.copyOf((float[])l.c, n2);
                l.d = Arrays.copyOf((byte[])(Object)l.d, n2);
            }
            ((wlb[])l.b)[a] = wlb;
            ((byte[])(Object)l.d)[a] = 3;
            ((float[])l.c)[a] = n;
            ++l.a;
            return;
        }
        final float[] array2 = (float[])l.c;
        if (array2[b1] == n) {
            final byte[] array3 = (Object)l.d;
            if (array3[b1] == 2) {
                array3[b1] = 0;
            }
            return;
        }
        array2[b1] = n;
        ((byte[])(Object)l.d)[b1] = 1;
    }
    
    public final float getDensity() {
        return ((xc8)this.y).getDensity();
    }
    
    public final float o0() {
        return ((xc8)this.y).o0();
    }
}
