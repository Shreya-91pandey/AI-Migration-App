import java.util.Objects;
import java.util.WeakHashMap;
import android.view.View;
import android.view.WindowInsets;
import android.os.Build$VERSION;

public final class h2q
{
    public static final h2q b;
    public final e2q a;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 34) {
            b = c2q.x;
            return;
        }
        if (sdk_INT >= 30) {
            b = a2q.w;
            return;
        }
        b = e2q.b;
    }
    
    public h2q(final WindowInsets windowInsets) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 35) {
            this.a = new d2q(this, windowInsets);
            return;
        }
        if (sdk_INT >= 34) {
            this.a = new c2q(this, windowInsets);
            return;
        }
        if (sdk_INT >= 31) {
            this.a = new b2q(this, windowInsets);
            return;
        }
        if (sdk_INT >= 30) {
            this.a = new a2q(this, windowInsets);
            return;
        }
        if (sdk_INT >= 29) {
            this.a = new y1q(this, windowInsets);
            return;
        }
        if (sdk_INT >= 28) {
            this.a = new x1q(this, windowInsets);
            return;
        }
        this.a = new w1q(this, windowInsets);
    }
    
    public h2q(final h2q h2q) {
        if (h2q != null) {
            final e2q a = h2q.a;
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 35 && a instanceof d2q) {
                this.a = new d2q(this, (d2q)a);
            }
            else if (sdk_INT >= 34 && a instanceof c2q) {
                this.a = new c2q(this, (c2q)a);
            }
            else if (sdk_INT >= 31 && a instanceof b2q) {
                this.a = new b2q(this, (b2q)a);
            }
            else if (sdk_INT >= 30 && a instanceof a2q) {
                this.a = new a2q(this, (a2q)a);
            }
            else if (sdk_INT >= 29 && a instanceof y1q) {
                this.a = new y1q(this, (y1q)a);
            }
            else if (sdk_INT >= 28 && a instanceof x1q) {
                this.a = new x1q(this, (x1q)a);
            }
            else if (a instanceof w1q) {
                this.a = new w1q(this, (w1q)a);
            }
            else if (a instanceof v1q) {
                this.a = new v1q(this, (v1q)a);
            }
            else {
                this.a = new e2q(this);
            }
            a.e(this);
            return;
        }
        this.a = new e2q(this);
    }
    
    public static dec a(final dec dec, final int n, final int n2, final int n3, final int n4) {
        final int max = Math.max(0, dec.a - n);
        final int max2 = Math.max(0, dec.b - n2);
        final int max3 = Math.max(0, dec.c - n3);
        final int max4 = Math.max(0, dec.d - n4);
        if (max == n && max2 == n2 && max3 == n3 && max4 == n4) {
            return dec;
        }
        return dec.c(max, max2, max3, max4);
    }
    
    public static h2q c(final WindowInsets windowInsets, final View view) {
        windowInsets.getClass();
        final h2q h2q = new h2q(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            final WeakHashMap a = gap.a;
            final h2q a2 = x9p.a(view);
            final e2q a3 = h2q.a;
            a3.y(a2);
            final View rootView = view.getRootView();
            a3.d(rootView);
            a3.p(rootView);
            a3.q();
            a3.A(view.getWindowSystemUiVisibility());
        }
        return h2q;
    }
    
    public final WindowInsets b() {
        final e2q a = this.a;
        if (a instanceof v1q) {
            return ((v1q)a).c;
        }
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof h2q && Objects.equals((Object)this.a, (Object)((h2q)o).a));
    }
    
    @Override
    public final int hashCode() {
        final e2q a = this.a;
        if (a == null) {
            return 0;
        }
        return a.hashCode();
    }
}
