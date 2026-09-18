public final class ad0 extends h07
{
    public Object v;
    public int w;
    public final bd0 x;
    
    public ad0(final bd0 x, final f07 f07) {
        this.x = x;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.w |= Integer.MIN_VALUE;
        return this.x.l(null, (f07)this);
    }
}
