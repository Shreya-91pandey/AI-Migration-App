import java.util.List;

public final class wpg extends m6n implements lta
{
    public final bfa A;
    public final gia B;
    public final ypg w;
    public final zpg x;
    public final List y;
    public final ppg z;
    
    public wpg(final ypg w, final zpg x, final List y, final ppg z, final bfa a, final gia b, final f07 f07) {
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        super(1, f07);
    }
    
    public final Object b(final Object o) {
        final wpg wpg = (wpg)this.create((f07)o);
        final lqo a = lqo.a;
        wpg.invokeSuspend(a);
        return a;
    }
    
    public final f07 create(final f07 f07) {
        return (f07)new wpg(this.w, this.x, this.y, this.z, this.A, this.B, f07);
    }
    
    public final Object invokeSuspend(final Object o) {
        vt4.g0(o);
        final zpg x = this.x;
        final ypg w = this.w;
        w.b.setValue((Object)x);
        final ksg g = w.g;
        final List y = this.y;
        g.setValue((Object)y);
        final xc8 k = w.k;
        if (k != null) {
            w.h = uuj.A0(y, w.e.h(), k, w.l);
        }
        if (!c86.A0((Iterable)y, (Object)w.e().a())) {
            w.e().d.setValue((Object)this.z);
        }
        w.i = this.A;
        w.j = this.B;
        return lqo.a;
    }
}
