import java.util.Set;

public final class vq0 extends m6n implements zta
{
    public byte w;
    public final er0 x;
    public final String y;
    public final boolean z;
    
    public vq0(final er0 x, final String y, final boolean z, final f07 f07) {
        this.x = x;
        this.y = y;
        this.z = z;
        super(2, f07);
    }
    
    public final f07 create(final Object o, final f07 f07) {
        return (f07)new vq0(this.x, this.y, this.z, f07);
    }
    
    public final Object d(final Object o, final Object o2) {
        return ((vq0)this.create(o, (f07)o2)).invokeSuspend(lqo.a);
    }
    
    public final Object invokeSuspend(Object o) {
        final byte w = this.w;
        final er0 x = this.x;
        final pc7 v = pc7.v;
        if (w != 0) {
            if (w != 1) {
                if (w == 2) {
                    vt4.g0(o);
                    return o;
                }
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            else {
                vt4.g0(o);
            }
        }
        else {
            vt4.g0(o);
            this.w = 1;
            final Set r = er0.r;
            if ((o = x.a((h07)this)) == v) {
                return v;
            }
        }
        if (!(boolean)o) {
            return null;
        }
        final rp0 a = x.a;
        this.w = 2;
        if ((o = a.b(this.y).c(this.z, (h07)this)) != v) {
            return o;
        }
        return v;
    }
}
