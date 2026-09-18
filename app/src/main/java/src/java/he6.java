import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;

public abstract class he6
{
    public static final ViewGroup$LayoutParams a;
    
    static {
        a = new ViewGroup$LayoutParams(-2, -2);
    }
    
    public static void a(final ge6 ge6, final ye6 ye6) {
        final View child = ((ViewGroup)ge6.getWindow().getDecorView().findViewById(16908290)).getChildAt(0);
        wh6 wh6;
        if (child instanceof wh6) {
            wh6 = (wh6)child;
        }
        else {
            wh6 = null;
        }
        if (wh6 != null) {
            ((n0)wh6).setParentCompositionContext((tl6)null);
            wh6.setContent((zta)ye6);
            return;
        }
        final wh6 wh7 = new wh6((Context)ge6);
        ((n0)wh7).setParentCompositionContext((tl6)null);
        wh7.setContent((zta)ye6);
        final View decorView = ge6.getWindow().getDecorView();
        if (eqi.Y(decorView) == null) {
            decorView.setTag(2131297128, (Object)ge6);
        }
        if (r6k.t(decorView) == null) {
            decorView.setTag(2131297132, (Object)ge6);
        }
        if (uuj.h0(decorView) == null) {
            decorView.setTag(2131297131, (Object)ge6);
        }
        ge6.setContentView((View)wh7, he6.a);
    }
}
