import android.app.Activity;
import android.content.Context;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.View;
import android.content.res.Resources$Theme;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import android.util.TypedValue;
import com.anthropic.claude.mainactivity.MainActivity;

public final class zfm extends kce
{
    public yfm i;
    public boolean j;
    public final xfm k;
    
    public zfm(final MainActivity mainActivity) {
        super(mainActivity);
        this.j = true;
        this.k = new xfm(this, mainActivity);
    }
    
    public final void c() {
        final MainActivity mainActivity = (MainActivity)super.b;
        final Resources$Theme theme = ((Context)mainActivity).getTheme();
        theme.getClass();
        final TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(2130968947, typedValue, true)) {
            final int resourceId = typedValue.resourceId;
            if (resourceId != 0) {
                ((Activity)mainActivity).setTheme(resourceId);
            }
        }
        if (Build$VERSION.SDK_INT < 33) {
            final View decorView = ((Activity)mainActivity).getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup)decorView).setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)this.k);
        }
    }
    
    public final void f(final e0e f) {
        super.f = f;
        final View viewById = ((Activity)super.b).findViewById(16908290);
        final ViewTreeObserver viewTreeObserver = viewById.getViewTreeObserver();
        if (this.i != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.i);
        }
        viewTreeObserver.addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)(this.i = new yfm(this, viewById)));
    }
    
    public final void g(final e0e e0e) {
        j50.h(j50.c((MainActivity)super.b), new wfm(this, e0e));
    }
}
