import android.view.ViewParent;
import android.graphics.Matrix;
import android.view.View;

public final class ox2
{
    public static final ox2 a;
    
    static {
        a = (ox2)new Object();
    }
    
    public final void a(final View view, final float[] array, final Matrix matrix, final int[] array2) {
        matrix.reset();
        d40.n(view, matrix);
        final ViewParent parent = view.getParent();
        View view2 = view;
        for (ViewParent parent2 = parent; parent2 instanceof View; parent2 = view2.getParent()) {
            view2 = (View)parent2;
        }
        view2.getLocationOnScreen(array2);
        final int n = array2[0];
        final int n2 = array2[1];
        view2.getLocationInWindow(array2);
        matrix.postTranslate((float)(array2[0] - n), (float)(array2[1] - n2));
        zrn.U(matrix, array);
    }
}
