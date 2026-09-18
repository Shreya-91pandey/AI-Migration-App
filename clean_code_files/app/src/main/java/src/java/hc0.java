import android.view.Choreographer$FrameCallback;

public final class hc0 implements Choreographer$FrameCallback
{
    public final l13 v;
    public final lta w;
    
    public hc0(final l13 v, final ic0 ic0, final lta w) {
        this.v = v;
        this.w = w;
    }
    
    public final void doFrame(final long n) {
        final lta w = this.w;
        jpj jpj = null;
        try {
            w.b((Object)n);
        }
        finally {
            final Throwable t;
            jpj = new jpj(t);
        }
        this.v.resumeWith((Object)jpj);
    }
}
