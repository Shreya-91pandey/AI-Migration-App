import java.util.Collection;
import java.util.AbstractCollection;
import android.os.Trace;
import java.util.concurrent.TimeUnit;
import android.view.Display;
import java.util.Comparator;
import android.view.Choreographer;
import java.util.PriorityQueue;
import android.view.View;
import android.view.Choreographer$FrameCallback;
import android.view.View$OnAttachStateChangeListener;

public final class ia0 implements ikh, View$OnAttachStateChangeListener, Runnable, Choreographer$FrameCallback
{
    public static long C;
    public boolean A;
    public long B;
    public final View v;
    public final PriorityQueue w;
    public boolean x;
    public final Choreographer y;
    public final ha0 z;
    
    public ia0(final View v) {
        this.v = v;
        this.w = new PriorityQueue(11, (Comparator)new ga0((byte)0));
        this.y = Choreographer.getInstance();
        this.z = (ha0)new Object();
        if (ia0.C == 0L) {
            final Display display = v.getDisplay();
            float refreshRate = 0.0f;
            Label_0090: {
                if (!v.isInEditMode() && display != null) {
                    refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        break Label_0090;
                    }
                }
                refreshRate = 60.0f;
            }
            ia0.C = (long)(1.0E9f / refreshRate);
        }
        v.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
        if (v.isAttachedToWindow()) {
            this.A = true;
        }
    }
    
    @Override
    public final void a(final yjh yjh) {
        this.w.add((Object)new yoh(1, yjh));
        if (!this.x) {
            this.x = true;
            this.v.post((Runnable)this);
        }
    }
    
    public final boolean b() {
        final ha0 z = this.z;
        final long a = z.a();
        ncq.S(a, "compose:lazy:prefetch:available_time_nanos");
        boolean b = true;
        final boolean b2 = true;
        if (a > 0L) {
            final PriorityQueue w = this.w;
            final Object peek = w.peek();
            peek.getClass();
            if (((yoh)peek).b().c(z)) {
                b = b2;
            }
            else {
                w.poll();
                b = false;
            }
            z.a = false;
        }
        return b;
    }
    
    public final void doFrame(final long b) {
        if (this.A) {
            this.B = b;
            this.v.post((Runnable)this);
        }
    }
    
    public final void onViewAttachedToWindow(final View view) {
        this.A = true;
    }
    
    public final void onViewDetachedFromWindow(final View view) {
        this.A = false;
        this.v.removeCallbacks((Runnable)this);
        this.y.removeFrameCallback((Choreographer$FrameCallback)this);
    }
    
    public final void run() {
        final PriorityQueue w = this.w;
        if (!((AbstractCollection)w).isEmpty() && this.x && this.A) {
            final View v = this.v;
            if (v.getWindowVisibility() == 0) {
                final long nanos = TimeUnit.MILLISECONDS.toNanos(v.getDrawingTime());
                final boolean a = System.nanoTime() > 2L * ia0.C + nanos;
                final ha0 z = this.z;
                z.a = a;
                z.b = Math.max(this.B, nanos) + ia0.C;
                boolean b = false;
                while (!((Collection)w).isEmpty() && !b) {
                    if (z.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            b = this.b();
                            continue;
                        }
                        finally {
                            Trace.endSection();
                        }
                    }
                    b = this.b();
                }
                if (b) {
                    this.y.postFrameCallback((Choreographer$FrameCallback)this);
                }
                else {
                    this.x = false;
                }
                ncq.S(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.x = false;
    }
}
