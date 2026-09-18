import android.app.Activity;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import android.view.ViewGroup;
import android.graphics.Rect;
import android.view.View;
import com.anthropic.claude.mainactivity.MainActivity;
import android.view.ViewGroup$OnHierarchyChangeListener;

public final class xfm implements ViewGroup$OnHierarchyChangeListener
{
    public final zfm v;
    public final MainActivity w;
    
    public xfm(final zfm v, final MainActivity w) {
        this.v = v;
        this.w = w;
    }
    
    public final void onChildViewAdded(View decorView, final View view) {
        if (ldh.A(view)) {
            final SplashScreenView r = ldh.r(view);
            final WindowInsets f = ipe.f(m6b.f());
            f.getClass();
            final Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            this.v.j = (f != ldh.q(r).computeSystemWindowInsets(f, rect) || !rect.isEmpty());
            decorView = ((Activity)this.w).getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup)decorView).setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)null);
        }
    }
    
    public final void onChildViewRemoved(final View view, final View view2) {
    }
}
