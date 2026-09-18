import androidx.work.impl.WorkDatabase;

public final class bt7 extends m6n implements zta
{
    public final boolean A;
    public final lta B;
    public boolean w;
    public final hc7 x;
    public final WorkDatabase y;
    public final boolean z;
    
    public bt7(final hc7 x, final WorkDatabase y, final boolean z, final boolean a, final lta b, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.A = a;
        this.B = b;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new bt7(this.x, this.y, this.z, this.A, this.B, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((bt7)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final boolean w = this.w;
        if (w) {
            if (w) {
                vt4.g0(o);
                return o;
            }
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        else {
            vt4.g0(o);
            final at7 at7 = new at7(this.y, this.z, this.A, (aua)this.B, null, (byte)0);
            this.w = true;
            final Object f0 = rhc.f0(this.x, (zta)at7, (f07)this);
            final pc7 v = pc7.v;
            if (f0 == v) {
                return v;
            }
            return f0;
        }
    }
}
