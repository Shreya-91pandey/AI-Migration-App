import android.os.Build$VERSION;
import android.view.ViewConfiguration;

public final class mc0 implements jap
{
    public final ViewConfiguration a;
    
    public mc0(final ViewConfiguration a) {
        this.a = a;
    }
    
    @Override
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }
    
    @Override
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }
    
    @Override
    public final float c() {
        return (float)this.a.getScaledMinimumFlingVelocity();
    }
    
    @Override
    public final float d() {
        if (Build$VERSION.SDK_INT >= 34) {
            return o9r.m(this.a);
        }
        return 2.0f;
    }
    
    @Override
    public final float f() {
        return (float)this.a.getScaledMaximumFlingVelocity();
    }
    
    @Override
    public final float g() {
        return (float)this.a.getScaledTouchSlop();
    }
    
    @Override
    public final float h() {
        if (Build$VERSION.SDK_INT >= 34) {
            return o9r.l(this.a);
        }
        return 16.0f;
    }
}
