import java.util.Iterator;
import android.view.ViewParent;
import java.util.concurrent.CancellationException;
import android.content.Context;
import android.content.ComponentCallbacks;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;

public final class j70 implements View$OnAttachStateChangeListener
{
    public final byte v;
    public final Object w;
    
    private final void a(final View view) {
    }
    
    private final void b(final View view) {
    }
    
    public final void onViewAttachedToWindow(final View view) {
        switch (this.v) {
            default: {
                return;
            }
            case 0: {
                final k70 k70 = (k70)this.w;
                final Context context = view.getContext();
                if (!k70.d) {
                    context.getApplicationContext().registerComponentCallbacks((ComponentCallbacks)k70.f);
                    k70.d = true;
                }
            }
        }
    }
    
    public final void onViewDetachedFromWindow(View e) {
        switch (this.v) {
            default: {
                e.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
                ((bqc)this.w).g((CancellationException)null);
                return;
            }
            case 1: {
                final n0 n0 = (n0)this.w;
                for (final ViewParent viewParent : rcr.h((View)n0)) {
                    if (viewParent instanceof View) {
                        final Object tag = ((View)viewParent).getTag(2131296993);
                        Boolean b;
                        if (tag instanceof Boolean) {
                            b = (Boolean)tag;
                        }
                        else {
                            b = null;
                        }
                        if (b != null && b) {
                            return;
                        }
                        continue;
                    }
                }
                n0.e();
                return;
            }
            case 0: {
                final Object o = this.w;
                final Context context = e.getContext();
                if (((k70)o).d) {
                    context.getApplicationContext().unregisterComponentCallbacks((ComponentCallbacks)((k70)o).f);
                    ((k70)o).d = false;
                }
                e = (View)((k70)o).e;
                Label_0237: {
                    if (e != null) {
                        final View view;
                        monitorenter(view = e);
                        Label_0232: {
                            try {
                                final tmf tmf = (tmf)((jmq)e).w;
                                if (tmf != null) {
                                    tmf.a();
                                }
                            }
                            finally {
                                break Label_0232;
                            }
                            ((jmq)e).x = null;
                            monitorexit(view);
                            break Label_0237;
                        }
                        monitorexit(view);
                    }
                }
                ((k70)o).e = null;
            }
        }
    }
}
