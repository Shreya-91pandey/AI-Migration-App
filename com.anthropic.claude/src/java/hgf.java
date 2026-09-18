import java.util.concurrent.CancellationException;
import androidx.compose.ui.ModifierNodeDetachedCancellationException;

public abstract class hgf implements t98
{
    public hgf A;
    public l5g B;
    public yxf C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public u78 H;
    public boolean I;
    public hgf v;
    public fz6 w;
    public int x;
    public int y;
    public hgf z;
    
    public hgf() {
        this.v = this;
        this.y = -1;
    }
    
    public final oc7 c1() {
        fz6 w;
        if ((w = this.w) == null) {
            w = ien.a(soh.M(this).getCoroutineContext().F0((hc7)new ppc((opc)soh.M(this).getCoroutineContext().M0((gc7)o55.z))));
            this.w = w;
        }
        return (oc7)w;
    }
    
    public boolean d1() {
        return this instanceof yp1 ^ true;
    }
    
    public void e1() {
        if (this.I) {
            gac.c("node attached multiple times");
        }
        if (this.C == null) {
            gac.c("attach invoked on a node without a coordinator");
        }
        this.I = true;
        this.F = true;
    }
    
    public void f1() {
        if (!this.I) {
            gac.c("Cannot detach a node that is not attached");
        }
        if (this.F) {
            gac.c("Must run runAttachLifecycle() before markAsDetached()");
        }
        if (this.G) {
            gac.c("Must run runDetachLifecycle() before markAsDetached()");
        }
        this.I = false;
        final fz6 w = this.w;
        if (w != null) {
            ien.i((oc7)w, (CancellationException)new ModifierNodeDetachedCancellationException());
            this.w = null;
        }
    }
    
    public void g1() {
    }
    
    public void h1() {
    }
    
    public void i1() {
    }
    
    public void j1() {
        if (!this.I) {
            gac.c("reset() called on an unattached node");
        }
        this.i1();
    }
    
    public void k1() {
        if (!this.I) {
            gac.c("Must run markAsAttached() prior to runAttachLifecycle");
        }
        if (!this.F) {
            gac.c("Must run runAttachLifecycle() only once after markAsAttached()");
        }
        this.F = false;
        this.g1();
        this.G = true;
    }
    
    public void l1() {
        if (!this.I) {
            gac.c("node detached multiple times");
        }
        if (this.C == null) {
            gac.c("detach invoked on a node without a coordinator");
        }
        if (!this.G) {
            gac.c("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()");
        }
        this.G = false;
        final u78 h = this.H;
        if (h != null) {
            h.a();
        }
        this.h1();
    }
    
    public void m1(final hgf v) {
        this.v = v;
    }
    
    public void n1(final yxf c) {
        this.C = c;
    }
    
    @Override
    public final hgf z0() {
        return this.v;
    }
}
