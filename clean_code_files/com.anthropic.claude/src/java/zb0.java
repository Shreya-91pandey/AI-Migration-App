public final class zb0 extends m6n implements zta
{
    public final qmn A;
    public final ko1 B;
    public final ubh C;
    public final y4c D;
    public final d09 E;
    public final lta F;
    public final jta G;
    public final jap H;
    public final lta I;
    public boolean w;
    public Object x;
    public final ymf y;
    public final peo z;
    
    public zb0(final ymf y, final peo z, final qmn a, final ko1 b, final ubh c, final y4c d, final d09 e, final lta f, final jta g, final jap h, final lta i, final f07 f2) {
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        this.C = c;
        this.D = d;
        this.E = e;
        this.F = f;
        this.G = g;
        this.H = h;
        this.I = i;
        super(2, f2);
    }
    
    public final f07 create(final Object x, final f07 f07) {
        final zb0 zb0 = new zb0(this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, f07);
        zb0.x = x;
        return (f07)zb0;
    }
    
    public final Object d(final Object o, final Object o2) {
        ((zb0)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
        return pc7.v;
    }
    
    public final Object invokeSuspend(final Object o) {
        final boolean w = this.w;
        if (!w) {
            vt4.g0(o);
            final oc7 oc7 = (oc7)this.x;
            final peo z = this.z;
            final ko1 b = this.B;
            rhc.G(oc7, (hc7)null, 4, (zta)new p10(z, b, null, (byte)3), 1);
            final ymf y = this.y;
            if (y != null) {
                rhc.G(oc7, (hc7)null, 0, (zta)new xb0(y, b, null, (byte)0), 3);
            }
            final ub0 ub0 = new ub0(this.z, this.D, this.E, this.B, this.F, new nr7(z, this.A, b, oc7), this.A, this.G, this.H, this.I);
            this.w = true;
            this.C.Y((obh)ub0, (h07)this);
            return pc7.v;
        }
        if (!w) {
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        throw ge9.w(o);
    }
}
