public final class e3 extends m6n implements zta
{
    public boolean w;
    public long x;
    public final lgk y;
    
    public e3(final lgk y, final f07 f07) {
        this.y = y;
        super(2, f07);
    }
    
    @Override
    public final f07 create(final Object o, final f07 f07) {
        final e3 e3 = new e3(this.y, f07);
        e3.x = ((l6g)o).a;
        return e3;
    }
    
    @Override
    public final Object d(final Object o, final Object o2) {
        final long a = ((l6g)o).a;
        final e3 e3 = new e3(this.y, (f07)o2);
        e3.x = a;
        return e3.invokeSuspend(lqo.a);
    }
    
    @Override
    public final Object invokeSuspend(Object c) {
        final boolean w = this.w;
        if (w) {
            if (w) {
                vt4.g0(c);
                return c;
            }
            en9.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        else {
            vt4.g0(c);
            final long x = this.x;
            this.w = true;
            c = dgk.c(this.y.m0, x, (h07)this);
            final pc7 v = pc7.v;
            if (c == v) {
                return v;
            }
            return c;
        }
    }
}
