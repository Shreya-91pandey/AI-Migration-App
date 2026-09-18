public final class pf0 extends m6n implements lta
{
    public final byte w;
    public final Object x;
    
    public final Object b(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final f07 f07 = (f07)o;
        switch (w) {
            default: {
                ((pf0)this.create(f07)).invokeSuspend(a);
                return a;
            }
            case 0: {
                ((pf0)this.create(f07)).invokeSuspend(a);
                return a;
            }
        }
    }
    
    public final f07 create(final f07 f07) {
        final byte w = this.w;
        final Object x = this.x;
        switch (w) {
            default: {
                return (f07)new pf0((byte)1, f07, x);
            }
            case 0: {
                return (f07)new pf0((byte)0, f07, x);
            }
        }
    }
    
    public final Object invokeSuspend(final Object o) {
        final byte w = this.w;
        final lqo a = lqo.a;
        final Object x = this.x;
        switch (w) {
            default: {
                vt4.g0(o);
                ((mhn)x).P.v.setValue((Object)Boolean.FALSE);
                return a;
            }
            case 0: {
                vt4.g0(o);
                ((st4)x).c(7);
                return a;
            }
        }
    }
}
