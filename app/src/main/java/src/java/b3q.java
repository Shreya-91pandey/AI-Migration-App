import android.os.Handler;
import android.view.ViewParent;
import android.view.View$OnAttachStateChangeListener;
import android.os.Looper;
import android.view.View;

public abstract class b3q
{
    public static final tmf a;
    
    static {
        final long[] a2 = jak.a;
        a = new tmf();
    }
    
    public static final tl6 a(final View view) {
        final Object tag = view.getTag(2131296323);
        if (tag instanceof tl6) {
            return (tl6)tag;
        }
        return null;
    }
    
    public static final j0j b(View view) {
        if (!view.isAttachedToWindow()) {
            final StringBuilder sb = new StringBuilder("Cannot locate windowRecomposer; View ");
            sb.append((Object)view);
            sb.append(" is not attached to a window");
            gac.c(sb.toString());
        }
        final ViewParent z = soh.z(view);
        View view2 = view;
        ViewParent parent;
        for (ViewParent viewParent = z; viewParent instanceof View; viewParent = parent) {
            view = (View)viewParent;
            if (view.getId() == 16908290) {
                break;
            }
            parent = view.getParent();
            view2 = view;
        }
        final tl6 a = a(view2);
        if (a == null) {
            x2q.a.get().getClass();
            Object v = o89.v;
            final l7n g = gc0.G;
            Label_0504: {
                hc7 hc7;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    hc7 = (hc7)gc0.G.getValue();
                }
                else {
                    hc7 = (hc7)gc0.H.get();
                    if (hc7 == null) {
                        break Label_0504;
                    }
                }
                final hc7 f0 = hc7.F0((hc7)v);
                final ahf ahf = (ahf)f0.M0((gc7)wab.R);
                final ic0 ic0;
                Label_0226: {
                    if (ahf != null) {
                        final rfa rfa = (rfa)new ic0(ahf).x;
                        final Object b = rfa.b;
                        synchronized (b) {
                            rfa.a = false;
                            break Label_0226;
                        }
                    }
                    ic0 = null;
                }
                final Object o = new Object();
                Object v2;
                if ((v2 = f0.M0((gc7)y7j.A)) == null) {
                    v2 = new qhf(view2.getContext().getApplicationContext());
                    ((b4j)o).v = v2;
                }
                if (ic0 != null) {
                    v = ic0;
                }
                final hc7 f2 = f0.F0((hc7)v).F0((hc7)v2);
                final j0j j0j = new j0j(f2);
                final Object d = j0j.d;
                synchronized (d) {
                    j0j.v = true;
                    monitorexit(d);
                    final fz6 a2 = ien.a(f2);
                    final gbd y = eqi.Y(view2);
                    vad d2;
                    if (y != null) {
                        d2 = y.d();
                    }
                    else {
                        d2 = null;
                    }
                    if (d2 != null) {
                        view2.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new y2q(view2, j0j));
                        d2.a((fbd)new a3q(a2, ic0, j0j, (b4j)o));
                        view2.setTag(2131296323, (Object)j0j);
                        final a3b v3 = a3b.v;
                        final Handler handler = view2.getHandler();
                        final int a3 = xbb.a;
                        view2.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new j70((Object)rhc.G((oc7)v3, (hc7)new vbb(handler, "windowRecomposer cleanup", false).z, 0, (zta)new frd((Object)j0j, (Object)view2, (f07)null, (byte)29), 2), (byte)2));
                        return j0j;
                    }
                    final StringBuilder sb2 = new StringBuilder("ViewTreeLifecycleOwner not found from ");
                    sb2.append((Object)view2);
                    gac.d(sb2.toString());
                    ebq.a();
                    return null;
                }
            }
            en9.q("no AndroidUiDispatcher for this thread");
            return null;
        }
        if (a instanceof j0j) {
            return (j0j)a;
        }
        en9.q("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    }
}
