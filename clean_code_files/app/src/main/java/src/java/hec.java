import android.os.Build$VERSION;
import android.view.View;
import java.util.List;
import android.view.View$OnAttachStateChangeListener;

public final class hec extends g66 implements Runnable, u7g, View$OnAttachStateChangeListener
{
    public h2q A;
    public final l2q x;
    public boolean y;
    public boolean z;
    
    public hec(final l2q x) {
        super((x.u ^ true) ? 1 : 0);
        this.x = x;
    }
    
    @Override
    public final void a(final l1q l1q) {
        this.y = false;
        this.z = false;
        final h2q a = this.A;
        if (l1q.a.b() > 0L && a != null) {
            final e2q a2 = a.a;
            final l2q x = this.x;
            x.t.f(x90.K(a2.i(8)));
            x.s.f(x90.K(a2.i(8)));
            l2q.b(x, a);
        }
        this.A = null;
    }
    
    @Override
    public final void b(final l1q l1q) {
        this.y = true;
        this.z = true;
    }
    
    @Override
    public final h2q c(final h2q h2q, final List list) {
        final l2q x = this.x;
        l2q.b(x, h2q);
        if (x.u) {
            return h2q.b;
        }
        return h2q;
    }
    
    @Override
    public final vhk d(final l1q l1q, final vhk vhk) {
        this.y = false;
        return vhk;
    }
    
    public final h2q j(final View view, final h2q a) {
        this.A = a;
        final l2q x = this.x;
        final b6p s = x.s;
        final e2q a2 = a.a;
        s.f(x90.K(a2.i(8)));
        if (this.y) {
            if (Build$VERSION.SDK_INT == 30) {
                view.post((Runnable)this);
            }
        }
        else if (!this.z) {
            x.t.f(x90.K(a2.i(8)));
            l2q.b(x, a);
        }
        if (x.u) {
            return h2q.b;
        }
        return a;
    }
    
    public final void onViewAttachedToWindow(final View view) {
        view.requestApplyInsets();
    }
    
    public final void onViewDetachedFromWindow(final View view) {
    }
    
    public final void run() {
        if (this.y) {
            this.y = false;
            this.z = false;
            final h2q a = this.A;
            if (a != null) {
                final l2q x = this.x;
                x.t.f(x90.K(a.a.i(8)));
                l2q.b(x, a);
                this.A = null;
            }
        }
    }
}
