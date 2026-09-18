import java.util.List;
import android.graphics.Rect;

public abstract class u1q
{
    public final h2q a;
    public dec[] b;
    public final Rect[][] c;
    public final Rect[][] d;
    
    public u1q() {
        this(new h2q((h2q)null));
    }
    
    public u1q(final h2q a) {
        this.c = new Rect[10][];
        this.d = new Rect[10][];
        this.c(this.a = a);
    }
    
    public final void a() {
        final dec[] b = this.b;
        if (b != null) {
            final dec dec = b[0];
            final dec dec2 = b[1];
            final h2q a = this.a;
            dec i;
            if ((i = dec2) == null) {
                i = a.a.i(2);
            }
            dec j;
            if ((j = dec) == null) {
                j = a.a.i(1);
            }
            this.h(dec.a(j, i));
            final dec dec3 = this.b[ncq.D(16)];
            if (dec3 != null) {
                this.g(dec3);
            }
            final dec dec4 = this.b[ncq.D(32)];
            if (dec4 != null) {
                this.e(dec4);
            }
            final dec dec5 = this.b[ncq.D(64)];
            if (dec5 != null) {
                this.i(dec5);
            }
        }
    }
    
    public abstract h2q b();
    
    public void c(final h2q h2q) {
        for (int i = 1; i <= 512; i <<= 1) {
            final List<Rect> f = h2q.a.f(i);
            final int d = ncq.D(i);
            this.c[d] = (Rect[])f.toArray((Object[])new Rect[f.size()]);
            if (i != 8) {
                final List<Rect> g = h2q.a.g(i);
                this.d[d] = (Rect[])g.toArray((Object[])new Rect[g.size()]);
            }
        }
    }
    
    public void d(final int n, final dec dec) {
        if (this.b == null) {
            this.b = new dec[10];
        }
        for (int i = 1; i <= 512; i <<= 1) {
            if ((n & i) != 0x0) {
                this.b[ncq.D(i)] = dec;
            }
        }
    }
    
    public void e(final dec dec) {
    }
    
    public abstract void f(final dec p0);
    
    public void g(final dec dec) {
    }
    
    public abstract void h(final dec p0);
    
    public void i(final dec dec) {
    }
}
