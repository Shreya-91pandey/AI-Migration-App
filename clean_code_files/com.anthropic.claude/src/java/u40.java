import java.util.Map;
import android.view.View;
import android.view.ViewGroup;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.graphics.Rect;
import androidx.compose.ui.platform.AndroidComposeView;

public final class u40 extends hgf implements nl2, xsk, ruc, a0d, wfo
{
    public final i1 J;
    public final AndroidComposeView K;
    
    public u40(final AndroidComposeView k) {
        this.K = k;
        this.J = new i1((Object)this, (byte)3);
    }
    
    public final Object H(final yxf yxf, final jd0 jd0, final h07 h07) {
        final long n = yxf.N(0L);
        final k2j k2j = (k2j)jd0.a();
        k2j m;
        if (k2j != null) {
            m = k2j.m(n);
        }
        else {
            m = null;
        }
        if (m != null) {
            ((View)this.K).requestRectangleOnScreen(new Rect((int)m.a, (int)m.b, (int)m.c, (int)m.d), false);
        }
        return lqo.a;
    }
    
    public final boolean Q(final KeyEvent keyEvent) {
        final int[] a = jma.a;
        final long i = ibr.i(keyEvent);
        final int o = huc.O;
        final boolean a2 = huc.a(i, cbr.q());
        final int n = 2;
        sla sla;
        if (a2) {
            sla = new sla(2);
        }
        else if (huc.a(i, cbr.p())) {
            sla = new sla(1);
        }
        else if (huc.a(i, cbr.v())) {
            int n2;
            if (ibr.l(keyEvent)) {
                n2 = 2;
            }
            else {
                n2 = 1;
            }
            sla = new sla(n2);
        }
        else if (huc.a(i, cbr.l())) {
            sla = new sla(4);
        }
        else if (huc.a(i, cbr.k())) {
            sla = new sla(3);
        }
        else if (!huc.a(i, cbr.m()) && !huc.a(i, cbr.t())) {
            if (!huc.a(i, cbr.j()) && !huc.a(i, cbr.s())) {
                if (!huc.a(i, cbr.i()) && !huc.a(i, cbr.n()) && !huc.a(i, cbr.r())) {
                    if (!huc.a(i, cbr.h()) && !huc.a(i, cbr.o())) {
                        sla = null;
                    }
                    else {
                        sla = new sla(8);
                    }
                }
                else {
                    sla = new sla(7);
                }
            }
            else {
                sla = new sla(6);
            }
        }
        else {
            sla = new sla(5);
        }
        boolean b = false;
        final boolean b2 = false;
        if (sla != null) {
            final int a3 = sla.a;
            if (hbr.c(ibr.j(keyEvent), 2)) {
                final AndroidComposeView k = this.K;
                final gna h = ((pma)k.getFocusOwner()).h();
                if (h != null && h.J && k.u(a3)) {
                    final zta playNavigationSoundEffect$ui = k.getPlayNavigationSoundEffect$ui();
                    boolean b3 = b2;
                    if (keyEvent.getRepeatCount() > 0) {
                        b3 = true;
                    }
                    playNavigationSoundEffect$ui.d((Object)sla, (Object)b3);
                    return true;
                }
                final Boolean g = ((pma)k.getFocusOwner()).g(a3, k.getEmbeddedViewFocusRect(), (lta)new i0((Object)sla, (byte)6));
                if (g == null) {
                    return true;
                }
                if (g) {
                    final zta playNavigationSoundEffect$ui2 = k.getPlayNavigationSoundEffect$ui();
                    if (keyEvent.getRepeatCount() > 0) {
                        b = true;
                    }
                    playNavigationSoundEffect$ui2.d((Object)sla, (Object)b);
                    return true;
                }
                if (blq.k(a3)) {
                    final Integer c = jma.c(a3);
                    int intValue = n;
                    if (c != null) {
                        intValue = c;
                    }
                    final FocusFinder instance = FocusFinder.getInstance();
                    final View rootView = ((View)k).getRootView();
                    rootView.getClass();
                    final View nextFocus = instance.findNextFocus((ViewGroup)rootView, k.getView(), intValue);
                    if (nextFocus == null || nextFocus.equals(k)) {
                        return ((pma)k.getFocusOwner()).j(a3);
                    }
                }
            }
        }
        return false;
    }
    
    public final noe b(final ooe ooe, final goe goe, final long n) {
        final o8h u = goe.u(n);
        return ooe.J0(u.v, u.w, (Map)s89.v, (lta)this.J, (lta)new t40(u, (byte)0));
    }
    
    public final void j(final itk itk) {
    }
    
    public final boolean p(final KeyEvent keyEvent) {
        return false;
    }
    
    public final Object u() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
