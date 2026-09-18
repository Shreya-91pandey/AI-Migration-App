import androidx.compose.ui.node.LayoutNode;
import android.view.View;
import androidx.compose.ui.platform.AndroidComposeView;
import android.view.autofill.AutofillId;
import android.graphics.Rect;

public final class c40 extends dm1 implements lma
{
    public final Rect A;
    public final AutofillId B;
    public final klf C;
    public boolean D;
    public final e3a v;
    public final ctk w;
    public final AndroidComposeView x;
    public final m2j y;
    public final String z;
    
    public c40(final e3a v, final ctk w, final AndroidComposeView x, final m2j y, final String z) {
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = new Rect();
        ((View)x).setImportantForAutofill(1);
        final AutofillId autofillId = ((View)x).getAutofillId();
        if (autofillId != null) {
            this.B = autofillId;
            this.C = new klf();
            return;
        }
        throw ge9.x("Required value was null.");
    }
    
    @Override
    public final void a(final gna gna, final gna gna2) {
        final AndroidComposeView x = this.x;
        final e3a v = this.v;
        if (gna != null) {
            final LayoutNode l = soh.L((t98)gna);
            if (l != null) {
                final tsk i = l.I();
                if (i != null && ach.P(i)) {
                    v.C().notifyViewExited((View)x, l.w);
                }
            }
        }
        if (gna2 != null) {
            final LayoutNode j = soh.L((t98)gna2);
            if (j != null) {
                final tsk k = j.I();
                if (k != null && ach.P(k)) {
                    final int w = j.w;
                    final m2j y = this.y;
                    final LayoutNode layoutNode = (LayoutNode)y.a.b(w);
                    if (layoutNode != null && layoutNode.B != -4) {
                        final mlf c = y.c;
                        final int d = y.d(layoutNode);
                        final long[] array = (long[])c.c;
                        final long n = array[d];
                        final long n2 = array[d + 1];
                        v.C().notifyViewEntered((View)x, w, new Rect((int)(n >> 32), (int)n, (int)(n2 >> 32), (int)n2));
                    }
                }
            }
        }
    }
}
