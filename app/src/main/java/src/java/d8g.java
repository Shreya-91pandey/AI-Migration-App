import android.window.OnBackInvokedDispatcher;

public final class d8g
{
    public final Runnable a;
    public final l7n b;
    
    public d8g(final Runnable a) {
        this.a = a;
        this.b = new l7n((jta)new lce((Object)this, (byte)9));
    }
    
    public final void a(final gbd gbd, final z7g z7g) {
        final vad d = gbd.d();
        if (d.b() == tad.v) {
            return;
        }
        final y7g y7g = new y7g(z7g, new a8g(gbd, z7g));
        z7g.a.add((Object)y7g);
        y7g.g(false);
        c2l.f(this.b().c, y7g);
        final q58 q58 = new q58(y7g, this, d);
        d.a((fbd)q58);
        z7g.c.add((Object)new o80((Object)d, (Object)q58, (byte)1));
    }
    
    public final b8g b() {
        return (b8g)this.b.getValue();
    }
    
    public final void c(final OnBackInvokedDispatcher onBackInvokedDispatcher) {
        this.b().c.p(new v7g(onBackInvokedDispatcher, 0), 1);
        this.b().c.p(new v7g(onBackInvokedDispatcher, 1000000), 0);
    }
}
