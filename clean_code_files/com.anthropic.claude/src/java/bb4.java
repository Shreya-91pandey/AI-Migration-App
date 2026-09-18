public final class bb4 extends h07
{
    public Object v;
    public int w;
    public final ya4 x;
    
    public bb4(final ya4 x, final f07 f07) {
        this.x = x;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.w |= Integer.MIN_VALUE;
        return this.x.l(null, (f07)this);
    }
}
