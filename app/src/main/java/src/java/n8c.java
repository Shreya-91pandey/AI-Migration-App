import androidx.compose.ui.platform.AndroidComposeView;
import android.view.MotionEvent;
import android.view.GestureDetector$OnGestureListener;

public final class n8c implements GestureDetector$OnGestureListener
{
    public final o8c a;
    
    public n8c(final o8c a) {
        this.a = a;
    }
    
    public final boolean onDown(final MotionEvent motionEvent) {
        return true;
    }
    
    public final boolean onFling(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        final o8c a = this.a;
        final k40 a2 = a.a;
        if (!a.c) {
            final int b = a.b;
            int n3 = 2;
            if (b == 1) {
                if (Math.abs(n) > Math.abs(n2)) {
                    if (n > 0.0f) {
                        n3 = 1;
                    }
                    final AndroidComposeView w = a2.w;
                    final Class d1 = AndroidComposeView.d1;
                    ((pma)w.getFocusOwner()).i(n3, false);
                    return true;
                }
            }
            else if (b == 2 && Math.abs(n2) > Math.abs(n)) {
                if (n2 > 0.0f) {
                    n3 = 1;
                }
                final AndroidComposeView w2 = a2.w;
                final Class d2 = AndroidComposeView.d1;
                ((pma)w2.getFocusOwner()).i(n3, false);
            }
        }
        return true;
    }
    
    public final void onLongPress(final MotionEvent motionEvent) {
    }
    
    public final boolean onScroll(final MotionEvent motionEvent, final MotionEvent motionEvent2, final float n, final float n2) {
        return true;
    }
    
    public final void onShowPress(final MotionEvent motionEvent) {
    }
    
    public final boolean onSingleTapUp(final MotionEvent motionEvent) {
        return true;
    }
}
