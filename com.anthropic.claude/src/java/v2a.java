import android.app.Activity;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import androidx.window.extensions.layout.DisplayFeature;
import java.util.ArrayList;
import androidx.window.extensions.layout.WindowLayoutInfo;
import android.graphics.Rect;
import androidx.window.extensions.layout.FoldingFeature;

public abstract class v2a
{
    public static kcb a(final r2q r2q, final FoldingFeature foldingFeature) {
        final int type = foldingFeature.getType();
        pk pk;
        if (type != 1) {
            if (type != 2) {
                return null;
            }
            pk = pk.H;
        }
        else {
            pk = pk.G;
        }
        final int state = foldingFeature.getState();
        xl xl;
        if (state != 1) {
            if (state != 2) {
                return null;
            }
            xl = xl.j;
        }
        else {
            xl = xl.i;
        }
        final Rect bounds = foldingFeature.getBounds();
        bounds.getClass();
        final bj2 bj2 = new bj2(bounds);
        final Rect c = r2q.a.c();
        if (bj2.a() != 0 || bj2.b() != 0) {
            if (bj2.b() == c.width() || bj2.a() == c.height()) {
                if (bj2.b() >= c.width() || bj2.a() >= c.height()) {
                    if (bj2.b() != c.width() || bj2.a() != c.height()) {
                        final Rect bounds2 = foldingFeature.getBounds();
                        bounds2.getClass();
                        return new kcb(new bj2(bounds2), pk, xl);
                    }
                }
            }
        }
        return null;
    }
    
    public static q2q b(final r2q r2q, final WindowLayoutInfo windowLayoutInfo) {
        final List displayFeatures = windowLayoutInfo.getDisplayFeatures();
        displayFeatures.getClass();
        final ArrayList list = new ArrayList();
        for (final DisplayFeature displayFeature : displayFeatures) {
            kcb a;
            if (displayFeature instanceof FoldingFeature) {
                a = a(r2q, (FoldingFeature)displayFeature);
            }
            else {
                a = null;
            }
            if (a != null) {
                list.add((Object)a);
            }
        }
        return new q2q((List)list);
    }
    
    public static q2q c(final Context context, final WindowLayoutInfo windowLayoutInfo) {
        final sdr q = sdr.Q;
        final jj2 w = jj2.w;
        Object w2 = zc8.w;
        final int sdk_INT = Build$VERSION.SDK_INT;
        Object o;
        if (sdk_INT >= 34) {
            o = zc8.v;
        }
        else {
            o = ier.C;
        }
        lq6.g((Object[])new Integer[] { 1, 2, 4, 8, 16, 32, 64, 128 });
        if (sdk_INT >= 30) {
            if (sdk_INT < 34) {
                w2 = q;
                if (sdk_INT >= 30) {
                    w2 = w;
                }
            }
            return b(((v2q)w2).c(context, (yc8)o), windowLayoutInfo);
        }
        if (sdk_INT >= 29 && context instanceof Activity) {
            final Activity activity = (Activity)context;
            v2q v2q;
            if (sdk_INT >= 34) {
                v2q = (v2q)w2;
            }
            else {
                v2q = (v2q)q;
                if (sdk_INT >= 30) {
                    v2q = (v2q)w;
                }
            }
            return b(v2q.a(activity, (yc8)o), windowLayoutInfo);
        }
        oyl.s("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
        return null;
    }
}
