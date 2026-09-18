import java.lang.ref.Reference;
import android.view.FrameMetrics;
import android.view.Choreographer;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

public class noc extends xp7
{
    public final moc A;
    public final WeakReference s;
    public final c1h t;
    public final ArrayList u;
    public final Window v;
    public long w;
    public long x;
    public long y;
    public final ksa z;
    
    public noc(final koc koc, final View view, final Window v) {
        this.s = new WeakReference((Object)view);
        Choreographer.getInstance().getClass();
        final View rootView = view.getRootView();
        Object tag;
        if ((tag = rootView.getTag(2131297007)) == null) {
            tag = new Object();
            rootView.setTag(2131297007, tag);
        }
        this.t = (c1h)tag;
        final ArrayList u = new ArrayList();
        this.u = u;
        this.v = v;
        this.z = new ksa(u);
        this.A = new moc((Object)this, (Object)koc, (byte)0);
    }
    
    public long d0(final FrameMetrics frameMetrics) {
        final View view = (View)((Reference)this.s).get();
        final int v = w98.v;
        return j6r.f(view);
    }
    
    public ksa e0(final long b, long metric, final FrameMetrics frameMetrics) {
        boolean d = false;
        final long c = frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))));
        final long y = b + c;
        this.y = y;
        final re0 a = this.t.a;
        if (a != null) {
            a.o(b, y, this.u);
        }
        if (c > metric) {
            d = true;
        }
        metric = frameMetrics.getMetric(8);
        final ksa z = this.z;
        z.b = b;
        z.c = c;
        z.d = d;
        z.e = metric;
        return z;
    }
}
