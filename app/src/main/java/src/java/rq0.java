public final class rq0 extends h07
{
    public Object v;
    public final er0 w;
    public int x;
    
    public rq0(final er0 w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(this);
    }
}
