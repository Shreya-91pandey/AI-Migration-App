import android.view.FrameMetrics;
import android.view.Window;
import android.view.View;

public final class ooc extends noc
{
    public final lsa B;
    
    public ooc(final koc koc, final View view, final Window window) {
        super(koc, view, window);
        final ksa b = new ksa(super.u);
        ((lsa)b).f = 0L;
        ((lsa)b).g = 0L;
        this.B = (lsa)b;
    }
    
    @Override
    public final long d0(final FrameMetrics frameMetrics) {
        return frameMetrics.getMetric(13);
    }
    
    @Override
    public final ksa e0(final long b, long metric, final FrameMetrics frameMetrics) {
        boolean d = false;
        final long c = frameMetrics.getMetric(5) + (frameMetrics.getMetric(4) + (frameMetrics.getMetric(3) + (frameMetrics.getMetric(2) + (frameMetrics.getMetric(1) + frameMetrics.getMetric(0)))));
        final long y = b + c;
        super.y = y;
        final re0 a = super.t.a;
        if (a != null) {
            a.o(b, y, super.u);
        }
        if (c > metric) {
            d = true;
        }
        metric = frameMetrics.getMetric(8);
        final long metric2 = frameMetrics.getMetric(12);
        final long metric3 = frameMetrics.getMetric(7);
        final long metric4 = frameMetrics.getMetric(13);
        final lsa b2 = this.B;
        b2.b = b;
        b2.c = c;
        b2.d = d;
        b2.e = metric3 + (metric - metric2);
        b2.f = metric;
        b2.g = metric - metric4;
        return b2;
    }
}
