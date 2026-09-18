import android.view.View;

public final class n50
{
    public static final n50 a;
    
    static {
        a = (n50)new Object();
    }
    
    public final void a(final View view, final int focusable, final boolean defaultFocusHighlightEnabled) {
        view.setFocusable(focusable);
        view.setDefaultFocusHighlightEnabled(defaultFocusHighlightEnabled);
    }
}
