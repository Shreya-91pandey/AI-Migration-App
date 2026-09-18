import android.widget.EdgeEffect;
import android.content.Context;

public final class k19
{
    public final Context a;
    public final int b;
    public long c;
    public EdgeEffect d;
    public EdgeEffect e;
    public EdgeEffect f;
    public EdgeEffect g;
    public EdgeEffect h;
    public EdgeEffect i;
    public EdgeEffect j;
    public EdgeEffect k;
    
    public k19(final Context a, final int b) {
        this.a = a;
        this.b = b;
        this.c = 0L;
    }
    
    public static boolean f(final EdgeEffect edgeEffect) {
        return edgeEffect != null && (edgeEffect.isFinished() ^ true);
    }
    
    public static boolean g(final EdgeEffect edgeEffect) {
        boolean b = false;
        if (edgeEffect == null) {
            return false;
        }
        if (y9r.f(edgeEffect) == 0.0f) {
            b = true;
        }
        return b ^ true;
    }
    
    public final EdgeEffect a(final zhg zhg) {
        final EdgeEffect c = y9r.c(this.a);
        c.setColor(this.b);
        if (!chc.b(this.c, 0L)) {
            final long c2 = this.c;
            if (zhg == zhg.v) {
                c.setSize((int)(c2 >> 32), (int)(c2 & 0xFFFFFFFFL));
                return c;
            }
            c.setSize((int)(0xFFFFFFFFL & c2), (int)(c2 >> 32));
        }
        return c;
    }
    
    public final EdgeEffect b() {
        EdgeEffect e;
        if ((e = this.e) == null) {
            e = this.a(zhg.v);
            this.e = e;
        }
        return e;
    }
    
    public final EdgeEffect c() {
        EdgeEffect f;
        if ((f = this.f) == null) {
            f = this.a(zhg.w);
            this.f = f;
        }
        return f;
    }
    
    public final EdgeEffect d() {
        EdgeEffect g;
        if ((g = this.g) == null) {
            g = this.a(zhg.w);
            this.g = g;
        }
        return g;
    }
    
    public final EdgeEffect e() {
        EdgeEffect d;
        if ((d = this.d) == null) {
            d = this.a(zhg.v);
            this.d = d;
        }
        return d;
    }
}
