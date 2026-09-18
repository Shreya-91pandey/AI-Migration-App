public final class lfk extends m6n implements zta
{
    public Object w;
    public final y3j x;
    public final float y;
    
    public lfk(final y3j x, final float y, final f07 f07) {
        this.x = x;
        this.y = y;
        super(2, f07);
    }
    
    public final f07 create(final Object w, final f07 f07) {
        final lfk lfk = new lfk(this.x, this.y, f07);
        lfk.w = w;
        return (f07)lfk;
    }
    
    public final Object d(final Object o, final Object o2) {
        final lfk lfk = (lfk)this.create(o, (f07)o2);
        final lqo a = lqo.a;
        lfk.invokeSuspend(a);
        return a;
    }
    
    public final Object invokeSuspend(final Object o) {
        vt4.g0(o);
        this.x.v = ((tfk)this.w).b(this.y);
        return lqo.a;
    }
}
