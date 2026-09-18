import java.util.Set;

public final class nn extends m6n implements zta
{
    public final int A;
    public sn w;
    public int x;
    public byte y;
    public final sn z;
    
    public nn(final sn z, final int a, final f07 f07) {
        this.z = z;
        this.A = a;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new nn(this.z, this.A, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((nn)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object e) {
        sn w = this.z;
        final apm h = w.h;
        final byte y = this.y;
        final lqo a = lqo.a;
        final pc7 v = pc7.v;
        int x = 0;
        Label_0185: {
            if (y != 0) {
                if (y != 1) {
                    if (y == 2) {
                        x = this.x;
                        w = this.w;
                        vt4.g0(e);
                        break Label_0185;
                    }
                    en9.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                else {
                    vt4.g0(e);
                }
            }
            else {
                vt4.g0(e);
                final n2b c = w.c;
                this.y = 1;
                if (c.a((h07)this) == v) {
                    return v;
                }
            }
            final int a2 = ((jn)h.getValue()).a;
            x = this.A;
            if (a2 == x) {
                if (((jn)h.getValue()).b == wn.v) {
                    this.w = w;
                    this.x = x;
                    this.y = 2;
                    if ((e = w.e(true, (h07)this)) == v) {
                        return v;
                    }
                    break Label_0185;
                }
            }
            return a;
        }
        final wn wn = (wn)e;
        final Set i = sn.i;
        w.g(x, wn);
        return a;
    }
}
