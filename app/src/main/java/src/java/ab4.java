public final class ab4 extends h07
{
    public Object v;
    public int w;
    public final za4 x;
    
    public ab4(final za4 x, final f07 f07) {
        this.x = x;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.w |= Integer.MIN_VALUE;
        return this.x.a(null, (f07)this);
    }
}
