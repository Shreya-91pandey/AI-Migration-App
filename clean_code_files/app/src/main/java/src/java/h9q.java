import java.util.List;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Collection;
import android.view.ViewGroup$LayoutParams;

public abstract class h9q
{
    public static final ViewGroup$LayoutParams a;
    
    static {
        a = new ViewGroup$LayoutParams(-2, -2);
    }
    
    public static final b9q a(final n0 n0, final zh6 zh6, final ye6 ye6) {
        final boolean compareAndSet = d3b.a.compareAndSet(false, true);
        final b9q b9q = null;
        if (compareAndSet) {
            final mn2 c = ao2.c(1, 0, 6);
            rhc.G((oc7)ien.a((hc7)gc0.G.getValue()), (hc7)null, 0, (zta)new o10((byte)24, (f07)null, (Object)c), 3);
            final c3b c3b = new c3b(c, (byte)0);
            final Object c2 = g8m.c;
            synchronized (c2) {
                g8m.i = (List)c86.a1((Collection)g8m.i, (Object)c3b);
                monitorexit(c2);
                g8m.c();
            }
        }
        Object o = null;
        Label_0167: {
            if (n0.getChildCount() > 0) {
                final View child = n0.getChildAt(0);
                if (child instanceof AndroidComposeView) {
                    o = child;
                }
                else {
                    o = null;
                }
                if (o != null) {
                    ((AndroidComposeView)o).setComposeViewContext(zh6);
                    break Label_0167;
                }
            }
            else {
                n0.removeAllViews();
            }
            o = null;
        }
        AndroidComposeView androidComposeView = (AndroidComposeView)o;
        if (o == null) {
            androidComposeView = new AndroidComposeView(((View)n0).getContext(), zh6);
            n0.addView(androidComposeView.getView(), h9q.a);
        }
        androidComposeView.setComposeViewContext(zh6);
        if (n0.getComposeViewContext$ui() != null) {
            zh6.e();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        final Object tag = ((View)androidComposeView).getTag(2131297137);
        b9q b9q2 = b9q;
        if (tag instanceof b9q) {
            b9q2 = (b9q)tag;
        }
        b9q b9q3;
        if ((b9q3 = b9q2) == null) {
            b9q3 = new b9q(androidComposeView, new yl6(zh6.c(), new v((Object)androidComposeView.getRoot())));
            ((View)androidComposeView).setTag(2131297137, (Object)b9q3);
        }
        b9q3.b((zta)ye6);
        androidComposeView.setFrameEndScheduler$ui((nbd)new g9q(zh6.c()));
        return b9q3;
    }
}
