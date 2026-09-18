import com.anthropic.claude.api.chat.messages.ComposerNotice;
import java.util.concurrent.CancellationException;

public final class xj6
{
    public static final long h;
    public final fz6 a;
    public final jta b;
    public final lta c;
    public final lta d;
    public up8 e;
    public wmm f;
    public up8 g;
    
    static {
        final awp w = lz8.w;
        h = ri2.E0(1, pz8.A);
    }
    
    public xj6(final fz6 a, final jta b, final lta c, final lta d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final up8 e) {
        if (e != this.e) {
            final wmm f = this.f;
            if (f != null) {
                ((bqc)f).g((CancellationException)null);
            }
            this.f = null;
            this.g = null;
            if ((this.e = e) != null) {
                final ComposerNotice a = e.a();
                if (a != null) {
                    Long h = a.h;
                    if (h != null) {
                        if (((Number)h).longValue() <= 0L) {
                            h = null;
                        }
                        if (h != null) {
                            final awp w = lz8.w;
                            this.f = rhc.G((oc7)this.a, (hc7)null, 0, (zta)new ry0((byte)5, lz8.r(((lz8)this.b.a()).v, ri2.F0((long)h, pz8.z)), (f07)null, (Object)this, (Object)e), 3);
                        }
                    }
                }
            }
        }
    }
    
    public final void b(final String s) {
        final up8 g = this.g;
        if (g != null) {
            up8 up8;
            if (mlc.q((Object)g.a().a, (Object)s)) {
                up8 = g;
            }
            else {
                up8 = null;
            }
            if (up8 != null) {
                this.g = null;
                this.d.b((Object)up8);
            }
        }
    }
}
