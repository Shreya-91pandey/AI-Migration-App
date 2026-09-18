import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

public abstract class k1q
{
    public final int a;
    public float b;
    public final Interpolator c;
    public final long d;
    
    public k1q(final int a, final Interpolator c, final long d) {
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public float a() {
        return 1.0f;
    }
    
    public long b() {
        return this.d;
    }
    
    public float c() {
        final float b = this.b;
        final Interpolator c = this.c;
        if (c != null) {
            return ((TimeInterpolator)c).getInterpolation(b);
        }
        return b;
    }
    
    public int d() {
        return this.a;
    }
    
    public void e(final float b) {
        this.b = b;
    }
}
