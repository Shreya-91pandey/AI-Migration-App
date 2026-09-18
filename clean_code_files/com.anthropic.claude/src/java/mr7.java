import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.graphics.Matrix;
import android.view.inputmethod.CursorAnchorInfo$Builder;
import androidx.compose.ui.platform.AndroidComposeView;

public final class mr7
{
    public final AndroidComposeView a;
    public final zn0 b;
    public final Object c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public mln j;
    public omn k;
    public o6g l;
    public lta m;
    public k2j n;
    public k2j o;
    public final CursorAnchorInfo$Builder p;
    public final float[] q;
    public final Matrix r;
    
    public mr7(final AndroidComposeView a, final zn0 b) {
        this.a = a;
        this.b = b;
        this.c = new Object();
        this.m = (lta)hr0.C;
        this.p = new CursorAnchorInfo$Builder();
        this.q = l8e.a();
        this.r = new Matrix();
    }
    
    public final void a() {
        final zn0 b = this.b;
        final d2d d2d = (d2d)b.w;
        final InputMethodManager inputMethodManager = (InputMethodManager)d2d.getValue();
        final View view = (View)b.v;
        if (!inputMethodManager.isActive(view)) {
            return;
        }
        final lta m = this.m;
        final float[] q = this.q;
        m.b((Object)new l8e(q));
        this.a.q(q);
        final Matrix r = this.r;
        zrn.T(r, q);
        final mln j = this.j;
        j.getClass();
        final o6g l = this.l;
        l.getClass();
        final omn k = this.k;
        k.getClass();
        final k2j n = this.n;
        n.getClass();
        final k2j o = this.o;
        o.getClass();
        ((InputMethodManager)d2d.getValue()).updateCursorAnchorInfo(view, a5r.i(this.p, j, l, k, r, n, o, this.f, this.g, this.h, this.i));
        this.e = false;
    }
}
