import java.util.Iterator;
import android.view.FrameMetrics;
import android.view.Window;
import java.util.ArrayList;
import android.os.Handler;
import android.view.Window$OnFrameMetricsAvailableListener;

public final class u98 implements Window$OnFrameMetricsAvailableListener
{
    public static Handler b;
    public final ArrayList a;
    
    public u98(final ArrayList a) {
        this.a = a;
    }
    
    public final void onFrameMetricsAvailable(final Window window, final FrameMetrics frameMetrics, final int n) {
        monitorenter(this);
        Label_0053: {
            try {
                final Iterator iterator = this.a.iterator();
                while (iterator.hasNext()) {
                    ((Window$OnFrameMetricsAvailableListener)iterator.next()).onFrameMetricsAvailable(window, frameMetrics, n);
                }
            }
            finally {
                break Label_0053;
            }
            monitorexit(this);
            return;
        }
        monitorexit(this);
    }
}
