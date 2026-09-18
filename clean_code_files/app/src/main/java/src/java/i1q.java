import android.view.WindowInsetsAnimation$Bounds;
import android.view.View;
import java.util.Collections;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import android.view.WindowInsetsAnimation;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import android.view.WindowInsetsAnimation$Callback;

public final class i1q extends WindowInsetsAnimation$Callback
{
    public final g66 a;
    public List b;
    public ArrayList c;
    public final HashMap d;
    
    public i1q(final g66 a) {
        super(a.v);
        this.d = new HashMap();
        this.a = a;
    }
    
    public final l1q a(final WindowInsetsAnimation windowInsetsAnimation) {
        final HashMap d = this.d;
        l1q l1q;
        if ((l1q = (l1q)d.get((Object)windowInsetsAnimation)) == null) {
            l1q = new l1q(0, null, 0L);
            l1q.a = new j1q(windowInsetsAnimation);
            d.put((Object)windowInsetsAnimation, (Object)l1q);
        }
        return l1q;
    }
    
    public final void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(this.a(windowInsetsAnimation));
        this.d.remove((Object)windowInsetsAnimation);
    }
    
    public final void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
        this.a.b(this.a(windowInsetsAnimation));
    }
    
    public final WindowInsets onProgress(final WindowInsets windowInsets, List b) {
        final ArrayList c = this.c;
        if (c == null) {
            final ArrayList c2 = new ArrayList(b.size());
            this.c = c2;
            this.b = Collections.unmodifiableList((List)c2);
        }
        else {
            c.clear();
        }
        for (int i = b.size() - 1; i >= 0; --i) {
            final WindowInsetsAnimation m = p4.m(b.get(i));
            final l1q a = this.a(m);
            a.a.e(p4.C(m));
            this.c.add((Object)a);
        }
        final h2q c3 = h2q.c(windowInsets, null);
        b = this.b;
        return this.a.c(c3, b).b();
    }
    
    public final WindowInsetsAnimation$Bounds onStart(final WindowInsetsAnimation windowInsetsAnimation, final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
        final vhk d = this.a.d(this.a(windowInsetsAnimation), new vhk(windowInsetsAnimation$Bounds));
        d.getClass();
        p4.r();
        return p4.k(((dec)d.w).e(), ((dec)d.x).e());
    }
}
