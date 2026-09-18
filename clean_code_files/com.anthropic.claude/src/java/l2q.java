import android.view.View$OnAttachStateChangeListener;
import android.graphics.Path;
import android.os.Build$VERSION;
import android.view.ViewParent;
import android.view.View;
import java.util.WeakHashMap;

public final class l2q
{
    public static final WeakHashMap x;
    public final dd0 a;
    public final dd0 b;
    public final dd0 c;
    public final dd0 d;
    public final dd0 e;
    public final dd0 f;
    public final dd0 g;
    public final dd0 h;
    public final dd0 i;
    public final b6p j;
    public final ksg k;
    public final iqo l;
    public final iqo m;
    public final b6p n;
    public final b6p o;
    public final b6p p;
    public final b6p q;
    public final b6p r;
    public final b6p s;
    public final b6p t;
    public final boolean u;
    public int v;
    public final hec w;
    
    static {
        x = new WeakHashMap();
    }
    
    public l2q(final View view) {
        final dd0 a = new dd0(4, "captionBar");
        this.a = a;
        final dd0 b = new dd0(128, "displayCutout");
        this.b = b;
        final dd0 c = new dd0(8, "ime");
        this.c = c;
        final dd0 d = new dd0(32, "mandatorySystemGestures");
        this.d = d;
        final dd0 e = new dd0(2, "navigationBars");
        this.e = e;
        final dd0 f = new dd0(1, "statusBars");
        this.f = f;
        final dd0 g = new dd0(519, "systemBars");
        this.g = g;
        final dd0 h = new dd0(16, "systemGestures");
        this.h = h;
        final dd0 i = new dd0(64, "tappableElement");
        this.i = i;
        final b6p j = new b6p(new mec(0, 0, 0, 0), "waterfall");
        this.j = j;
        this.k = o50.Q((Object)null);
        final iqo l = new iqo(new iqo(g, c), b);
        this.l = l;
        this.m = new iqo(l, new iqo(new iqo(new iqo(i, d), h), j));
        this.n = o50.d0(4, "captionBarIgnoringVisibility");
        this.o = o50.d0(2, "navigationBarsIgnoringVisibility");
        this.p = o50.d0(1, "statusBarsIgnoringVisibility");
        this.q = o50.d0(519, "systemBarsIgnoringVisibility");
        this.r = o50.d0(64, "tappableElementIgnoringVisibility");
        this.s = new b6p(new mec(0, 0, 0, 0), "imeAnimationTarget");
        this.t = new b6p(new mec(0, 0, 0, 0), "imeAnimationSource");
        final ViewParent parent = view.getParent();
        View view2;
        if (parent instanceof View) {
            view2 = (View)parent;
        }
        else {
            view2 = null;
        }
        Object tag;
        if (view2 != null) {
            tag = view2.getTag(2131296444);
        }
        else {
            tag = null;
        }
        Boolean b2;
        if (tag instanceof Boolean) {
            b2 = (Boolean)tag;
        }
        else {
            b2 = null;
        }
        this.u = (b2 != null && b2);
        this.w = new hec(this);
        final WeakHashMap a2 = gap.a;
        final h2q a3 = x9p.a(view);
        if (a3 != null) {
            final e2q a4 = a3.a;
            a.f(a4.u(4));
            b.f(a4.u(128));
            c.f(a4.u(8));
            d.f(a4.u(32));
            e.f(a4.u(2));
            f.f(a4.u(1));
            g.f(a4.u(519));
            h.f(a4.u(16));
            i.f(a4.u(64));
        }
    }
    
    public static void b(final l2q l2q, final h2q h2q) {
        final dd0 a = l2q.a;
        final boolean b = false;
        a.g(h2q, 0);
        l2q.c.g(h2q, 0);
        l2q.b.g(h2q, 0);
        l2q.e.g(h2q, 0);
        l2q.f.g(h2q, 0);
        l2q.g.g(h2q, 0);
        l2q.h.g(h2q, 0);
        l2q.i.g(h2q, 0);
        l2q.d.g(h2q, 0);
        l2q.n.f(x90.K(h2q.a.j(4)));
        l2q.o.f(x90.K(h2q.a.j(2)));
        l2q.p.f(x90.K(h2q.a.j(1)));
        l2q.q.f(x90.K(h2q.a.j(519)));
        l2q.r.f(x90.K(h2q.a.j(64)));
        final yo8 h = h2q.a.h();
        final b6p j = l2q.j;
        dec dec;
        if (h != null) {
            dec = h.a();
        }
        else {
            dec = dec.e;
        }
        j.f(x90.K(dec));
        Object value = null;
        if (h != null) {
            Path a2;
            if (Build$VERSION.SDK_INT >= 31) {
                a2 = xo8.a(h.a);
            }
            else {
                a2 = null;
            }
            value = value;
            if (a2 != null) {
                value = new g90(a2);
            }
        }
        l2q.k.setValue(value);
        final Object c = g8m.c;
        synchronized (c) {
            final umf h2 = ((zmf)g8m.j).h;
            int n = b ? 1 : 0;
            if (h2 != null) {
                final boolean h3 = h2.h();
                n = (b ? 1 : 0);
                if (h3) {
                    n = 1;
                }
            }
            monitorexit(c);
            if (n != 0) {
                g8m.c();
            }
        }
    }
    
    public final void a(final View view) {
        if (this.v == 0) {
            final hec w = this.w;
            w.y = false;
            w.z = false;
            w.A = null;
            final WeakHashMap a = gap.a;
            w9p.c(view, (u7g)w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)w);
            l1q.a(view, (g66)w);
        }
        ++this.v;
    }
}
