import android.view.ActionMode;
import androidx.compose.ui.platform.AndroidComposeView;

public final class cc0 implements qnn
{
    public final AndroidComposeView a;
    public ActionMode b;
    public final ve6 c;
    public int d;
    
    public cc0(final AndroidComposeView a) {
        this.a = a;
        this.c = new ve6(new p1((Object)this, (byte)4));
        this.d = 2;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final void b(final k2j k2j, final jta jta, final jta jta2, final jta jta3, final jta jta4) {
        this.c(k2j, jta, jta2, jta3, jta4, null);
    }
    
    public final void c(final k2j w, final jta x, final jta y, final jta z, final jta a, final jta b) {
        final ve6 c = this.c;
        c.w = w;
        c.x = x;
        c.z = z;
        c.y = y;
        c.A = a;
        c.B = b;
        final ActionMode b2 = this.b;
        if (b2 == null) {
            this.d = 1;
            this.b = okq.l(this.a, new eja(c));
            return;
        }
        b2.invalidate();
    }
    
    public final void d() {
        this.d = 2;
        final ActionMode b = this.b;
        if (b != null) {
            b.finish();
        }
        this.b = null;
    }
}
