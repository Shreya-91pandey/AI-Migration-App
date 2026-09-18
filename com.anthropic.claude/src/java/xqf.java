import java.util.concurrent.CancellationException;

public final class xqf extends m6n implements zta
{
    public final nx8 A;
    public final boolean B;
    public final y3j C;
    public final y3j D;
    public final y3j E;
    public byte w;
    public Object x;
    public final kx8 y;
    public final oc7 z;
    
    public xqf(final kx8 y, final oc7 z, final nx8 a, final boolean b, final y3j c, final y3j d, final y3j e, final f07 f07) {
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        super(2, f07);
    }
    
    public final f07 create(final Object x, final f07 f07) {
        final xqf xqf = new xqf(this.y, this.z, this.A, this.B, this.C, this.D, this.E, f07);
        xqf.x = x;
        return (f07)xqf;
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((xqf)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object a) {
        final byte w = this.w;
        final oc7 z = this.z;
        final nx8 a2 = this.A;
        final kx8 y = this.y;
        final pc7 v = pc7.v;
        Label_0093: {
            if (w == 0) {
                break Label_0093;
            }
            Label_0282: {
                if (w != 1) {
                    if (w == 2 || w == 3) {
                        vt4.g0(a);
                        break Label_0282;
                    }
                    if (w != 4) {
                        en9.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    final Throwable t = (Throwable)this.x;
                    vt4.g0(a);
                    a = t;
                    throw a;
                }
                try {
                    try {
                        vt4.g0(a);
                    }
                    finally {
                        if (y.a()) {
                            rhc.G(z, (hc7)null, 0, (zta)new drd((byte)11, (f07)null, (Object)y), 3);
                        }
                        this.x = a;
                        this.w = 4;
                        if (a2.b(this) != v) {
                            throw a;
                        }
                        return v;
                        Label_0187: {
                            this.w = 2;
                        }
                        iftrue(Label_0282:)(a2.b(this) != v);
                        return v;
                        rhc.G(z, (hc7)null, 0, (zta)new drd((byte)11, (f07)null, (Object)y), 3);
                        this.w = 3;
                        iftrue(Label_0282:)(a2.b(this) != v);
                        return v;
                        return lqo.a;
                        vt4.g0(a);
                        final ija ija = (ija)this.x;
                        a = new wqf(this.y, this.B, this.C, this.D, this.E);
                        this.w = 1;
                        a = ija.a((jja)a, (f07)this);
                        iftrue(Label_0158:)(a != v);
                        return v;
                        Label_0158:
                        iftrue(Label_0187:)(!y.a());
                        rhc.G(z, (hc7)null, 0, (zta)new drd((byte)11, (f07)null, (Object)y), 3);
                    }
                }
                catch (final CancellationException ex) {}
            }
        }
        return v;
    }
}
