import android.os.Build$VERSION;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;
import android.view.View;

public final class bam extends hdk
{
    public View w;
    
    public final void g() {
        final View w = this.w;
        WindowInsetsController n;
        if (w != null) {
            n = p4.n(w);
        }
        else {
            n = null;
        }
        if (n != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final aam aam = new aam(atomicBoolean);
            fe.t(n, aam);
            if (!atomicBoolean.get() && w != null) {
                ((InputMethodManager)w.getContext().getSystemService("input_method")).hideSoftInputFromWindow(w.getWindowToken(), 0);
            }
            fe.B(n, aam);
            fe.s(n, p4.b());
            return;
        }
        super.g();
    }
    
    public final void i() {
        final View w = this.w;
        if (w != null && Build$VERSION.SDK_INT < 33) {
            ((InputMethodManager)w.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController n;
        if (w != null) {
            n = p4.n(w);
        }
        else {
            n = null;
        }
        if (n != null) {
            p4.w(n, p4.b());
        }
        super.i();
    }
}
