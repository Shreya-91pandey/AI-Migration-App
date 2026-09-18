public final class fqo extends m6n implements cua
{
    public boolean w;
    public Throwable x;
    public long y;
    
    public final Object invokeSuspend(Object a) {
        final boolean w = this.w;
        if (w) {
            if (!w) {
                en9.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            vt4.g0(a);
        }
        else {
            vt4.g0(a);
            final Throwable x = this.x;
            final long y = this.y;
            krd.c().b(gqo.a, "Cannot check for unfinished work", x);
            final long min = Math.min(y * 30000L, (long)gqo.b);
            this.w = true;
            a = ach.A(min, (f07)this);
            final pc7 v = pc7.v;
            if (a == v) {
                return v;
            }
        }
        return Boolean.TRUE;
    }
    
    public final Object m(final Object o, final Object o2, final Object o3, final Object o4) {
        final jja jja = (jja)o;
        final Throwable x = (Throwable)o2;
        final long longValue = ((Number)o3).longValue();
        final m6n m6n = new m6n(4, (f07)o4);
        ((fqo)m6n).x = x;
        ((fqo)m6n).y = longValue;
        return ((fqo)m6n).invokeSuspend(lqo.a);
    }
}
