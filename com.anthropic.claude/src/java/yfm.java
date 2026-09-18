import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class yfm implements ViewTreeObserver$OnPreDrawListener
{
    public final zfm v;
    public final View w;
    
    public yfm(final zfm v, final View w) {
        this.v = v;
        this.w = w;
    }
    
    public final boolean onPreDraw() {
        if (((agm)this.v.f).a()) {
            return false;
        }
        this.w.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        return true;
    }
}
