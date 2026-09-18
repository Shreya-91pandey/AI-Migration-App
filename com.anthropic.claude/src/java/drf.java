import java.util.Set;
import java.util.LinkedHashSet;

public abstract class drf
{
    public final ncq a;
    public boolean b;
    public c2l c;
    
    public drf(final ncq a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    public abstract void a();
    
    public abstract void b();
    
    public abstract void c(final brf p0);
    
    public abstract void d(final brf p0);
    
    public final void e() {
        final c2l c = this.c;
        if (c != null && ((Set)c.y).remove((Object)this)) {
            final grf grf = (grf)c.x;
            if (this.equals(grf.f)) {
                if (grf.g == -1) {
                    this.a();
                }
                grf.f = null;
                grf.g = 0;
                grf.h = null;
            }
            grf.d.remove((Object)this);
            grf.e.remove((Object)this);
            this.c = null;
            grf.b();
        }
    }
    
    public final void f(final boolean b) {
        if (this.b != b) {
            this.b = b;
            final c2l c = this.c;
            if (c != null) {
                ((grf)c.x).b();
            }
        }
    }
}
