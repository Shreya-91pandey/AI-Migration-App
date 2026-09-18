import java.util.concurrent.CancellationException;

public final class gd0 extends m6n implements lta
{
    public final Object A;
    public final xf0 B;
    public final long C;
    public final lta D;
    public dg0 w;
    public x3j x;
    public boolean y;
    public final id0 z;
    
    public gd0(final id0 z, final Object a, final xf0 b, final long c, final lta d, final f07 f07) {
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        super(1, f07);
    }
    
    @Override
    public final Object b(final Object o) {
        return ((gd0)this.create((f07)o)).invokeSuspend(lqo.a);
    }
    
    @Override
    public final f07 create(final f07 f07) {
        return new gd0(this.z, this.A, this.B, this.C, this.D, f07);
    }
    
    @Override
    public final Object invokeSuspend(Object o) {
        final xf0 b = this.B;
        final id0 z = this.z;
        final dg0 c = z.c;
        final boolean y = this.y;
        int n = 1;
        dg0 w = null;
        Label_0267: {
            if (y) {
                Label_0064: {
                    if (y) {
                        final x3j x = this.x;
                        w = this.w;
                        Label_0297: {
                            try {
                                vt4.g0(o);
                                o = x;
                                break Label_0267;
                            }
                            catch (final CancellationException ex) {
                                break Label_0297;
                            }
                            break Label_0064;
                        }
                        z.d();
                        throw;
                    }
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(o);
            c.x = (ig0)z.a.a().b(this.A);
            o = b.g();
            z.e.setValue(o);
            z.d.setValue((Object)Boolean.TRUE);
            o = c.w.getValue();
            w = new dg0(c.v, o, rml.n(c.x), c.y, Long.MIN_VALUE, c.A);
            o = new Object();
            final long c2 = this.C;
            final fd0 fd0 = new fd0((Object)z, (Object)w, (Object)this.D, o, (byte)0);
            this.w = w;
            this.x = (x3j)o;
            this.y = true;
            final Object l = uoo.l(w, b, c2, (lta)fd0, this);
            final pc7 v = pc7.v;
            if (l == v) {
                return v;
            }
        }
        if (!((x3j)o).v) {
            n = 2;
        }
        z.d();
        o = new ag0(n, w);
        return o;
    }
}
