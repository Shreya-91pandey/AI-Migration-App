import android.view.View$OnAttachStateChangeListener;
import java.util.WeakHashMap;
import android.view.View;

public final class j8n extends kec
{
    public lta M;
    public l2q N;
    
    @Override
    public final void g1() {
        final View m0 = eqi.m0((t98)this);
        final WeakHashMap x = l2q.x;
        final l2q d = o50.D(m0);
        d.a(m0);
        final d1q l = (d1q)this.M.b((Object)d);
        if (!mlc.q((Object)l, (Object)super.L)) {
            super.L = l;
            this.p1();
        }
        this.N = d;
        super.g1();
    }
    
    @Override
    public final void h1() {
        final View m0 = eqi.m0((t98)this);
        final l2q n = this.N;
        if (n != null && --n.v == 0) {
            final WeakHashMap a = gap.a;
            w9p.c(m0, (u7g)null);
            l1q.a(m0, (g66)null);
            m0.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)n.w);
        }
        super.h1();
    }
}
