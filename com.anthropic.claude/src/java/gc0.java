import android.view.Choreographer$FrameCallback;
import android.os.Handler;
import android.view.Choreographer;
import java.util.ArrayList;

public final class gc0 extends ic7
{
    public static final l7n G;
    public static final ec0 H;
    public ArrayList A;
    public ArrayList B;
    public boolean C;
    public boolean D;
    public final fc0 E;
    public final ic0 F;
    public final Choreographer w;
    public final Handler x;
    public final Object y;
    public final pv0 z;
    
    static {
        G = new l7n((jta)new y5((byte)17));
        H = new ec0((byte)0);
    }
    
    public gc0(final Choreographer w, final Handler x) {
        this.w = w;
        this.x = x;
        this.y = new Object();
        this.z = new pv0();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.E = new fc0(this);
        this.F = new ic0(w, this);
    }
    
    @Override
    public final void g1(final hc7 hc7, final Runnable runnable) {
        final Object y;
        monitorenter(y = this.y);
        Label_0074: {
            try {
                this.z.addLast((Object)runnable);
                if (!this.C) {
                    this.C = true;
                    this.x.post((Runnable)this.E);
                    if (!this.D) {
                        this.D = true;
                        this.w.postFrameCallback((Choreographer$FrameCallback)this.E);
                    }
                }
            }
            finally {
                break Label_0074;
            }
            monitorexit(y);
            return;
        }
        monitorexit(y);
    }
    
    public final void k1() {
        while (true) {
            final Object y = this.y;
            synchronized (y) {
                final pv0 z = this.z;
                Object removeFirst;
                if (z.isEmpty()) {
                    removeFirst = null;
                }
                else {
                    removeFirst = z.removeFirst();
                }
                final Runnable runnable = (Runnable)removeFirst;
                monitorexit(y);
                while (runnable != null) {
                    runnable.run();
                    synchronized (this.y) {
                        final pv0 z2 = this.z;
                        Object removeFirst2;
                        if (z2.isEmpty()) {
                            removeFirst2 = null;
                        }
                        else {
                            removeFirst2 = z2.removeFirst();
                        }
                        final Runnable runnable2 = (Runnable)removeFirst2;
                        continue;
                    }
                    break;
                }
                monitorenter(this.y);
                Label_0143: {
                    boolean b = false;
                    Label_0135: {
                        try {
                            if (this.z.isEmpty()) {
                                b = false;
                                this.C = false;
                                break Label_0135;
                            }
                        }
                        finally {
                            break Label_0143;
                        }
                        b = true;
                    }
                    monitorexit(y);
                    if (!b) {
                        return;
                    }
                    continue;
                }
                monitorexit(y);
            }
        }
    }
}
