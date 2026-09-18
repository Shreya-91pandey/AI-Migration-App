import android.os.Build$VERSION;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

public final class v7g extends frf
{
    public final OnBackInvokedDispatcher c;
    public final int d;
    public final OnBackInvokedCallback e;
    public boolean f;
    
    public v7g(final OnBackInvokedDispatcher c, final int d) {
        this.c = c;
        this.d = d;
        Object e;
        if (Build$VERSION.SDK_INT == 33) {
            e = new w7g(this);
        }
        else {
            e = new x7g(this);
        }
        this.e = (OnBackInvokedCallback)e;
    }
    
    public final void b(final boolean b) {
        final OnBackInvokedCallback e = this.e;
        if (b && !this.f) {
            o4.i(this.c, this.d, e);
            this.f = true;
            return;
        }
        if (!b && this.f) {
            o4.j(this.c, e);
            this.f = false;
        }
    }
}
