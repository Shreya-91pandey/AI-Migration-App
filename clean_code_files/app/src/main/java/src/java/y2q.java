import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class y2q implements View$OnAttachStateChangeListener
{
    public final View v;
    public final j0j w;
    
    public y2q(final View v, final j0j w) {
        this.v = v;
        this.w = w;
    }
    
    public final void onViewAttachedToWindow(final View view) {
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.v.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        this.w.A();
    }
}
