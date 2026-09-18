import android.view.animation.Interpolator;
import android.view.WindowInsetsAnimation;

public final class j1q extends k1q
{
    public final WindowInsetsAnimation e;
    
    public j1q(final WindowInsetsAnimation e) {
        super(0, null, 0L);
        this.e = e;
    }
    
    @Override
    public final float a() {
        return p4.a(this.e);
    }
    
    @Override
    public final long b() {
        return p4.f(this.e);
    }
    
    @Override
    public final float c() {
        return p4.y(this.e);
    }
    
    @Override
    public final int d() {
        return p4.d(this.e);
    }
    
    @Override
    public final void e(final float n) {
        p4.v(this.e, n);
    }
}
