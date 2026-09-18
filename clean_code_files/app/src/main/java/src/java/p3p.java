public final class p3p extends h07
{
    public Object v;
    public int w;
    public final a14 x;
    
    public p3p(final a14 x, final f07 f07) {
        this.x = x;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.w |= Integer.MIN_VALUE;
        return this.x.a(null, (f07)this);
    }
}
