public final class dmc extends h07
{
    public Object v;
    public final emc w;
    public int x;
    
    public dmc(final emc w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.a(null, this);
    }
}
