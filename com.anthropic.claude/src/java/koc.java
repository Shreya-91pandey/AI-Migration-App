import android.view.View;
import android.os.Build$VERSION;
import android.view.Window;

public final class koc
{
    public final joc a;
    public final noc b;
    public boolean c;
    public final float d;
    
    public koc(final Window window, final joc a) {
        this.a = a;
        final View peekDecorView = window.peekDecorView();
        if (peekDecorView != null) {
            final View rootView = peekDecorView.getRootView();
            Object tag;
            if ((tag = rootView.getTag(2131297007)) == null) {
                tag = new Object();
                rootView.setTag(2131297007, tag);
            }
            final c1h c1h = (c1h)tag;
            if (c1h.a == null) {
                c1h.a = new re0((byte)11);
            }
            noc b;
            if (Build$VERSION.SDK_INT >= 31) {
                b = new ooc(this, peekDecorView, window);
            }
            else {
                b = new noc(this, peekDecorView, window);
            }
            this.b = b;
            b.v.getDecorView().post((Runnable)new loc(true, b));
            this.c = true;
            this.d = 2.0f;
            return;
        }
        en9.q("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        throw null;
    }
    
    public final void a(final boolean c) {
        if (c != this.c) {
            final noc b = this.b;
            b.v.getDecorView().post((Runnable)new loc(c, b));
            this.c = c;
        }
    }
}
