import com.anthropic.claude.mainactivity.MainActivity;
import android.view.Window;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build$VERSION;
import android.graphics.Color;

public abstract class m19
{
    public static n19 a;
    
    static {
        Color.argb(230, 255, 255, 255);
        Color.argb(128, 27, 27, 27);
    }
    
    public static final void a(final ge6 ge6, final w7n w7n, final w7n w7n2) {
        final View decorView = ge6.getWindow().getDecorView();
        decorView.getClass();
        Object a;
        if ((a = m19.a) == null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 35) {
                a = new Object();
            }
            else if (sdk_INT >= 30) {
                a = new Object();
            }
            else if (sdk_INT >= 29) {
                a = new Object();
            }
            else if (sdk_INT >= 28) {
                a = new Object();
            }
            else {
                a = new Object();
            }
            m19.a = (n19)a;
        }
        final cu6 cu6 = new cu6((n19)a, w7n, w7n2, ge6, decorView);
        final ViewGroup viewGroup = (ViewGroup)decorView;
        while (true) {
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View child = viewGroup.getChildAt(i);
                if (child == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (child.getTag() instanceof n19) {
                    cu6.run();
                    final Window window = ge6.getWindow();
                    window.getClass();
                    ((n19)a).a(window);
                    return;
                }
            }
            final l19 l19 = new l19(cu6, ((View)viewGroup).getContext());
            l19.setTag(a);
            l19.setVisibility(8);
            l19.setWillNotDraw(true);
            viewGroup.addView((View)l19);
            continue;
        }
    }
    
    public static void b(final MainActivity mainActivity, final w7n w7n) {
        a((ge6)mainActivity, new w7n(0, 0, 0, (lta)new cyl((byte)24)), w7n);
    }
}
