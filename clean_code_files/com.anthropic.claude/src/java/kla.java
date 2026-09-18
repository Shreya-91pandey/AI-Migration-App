public final class kla extends h07
{
    public Object v;
    public int w;
    public jja x;
    public final lla y;
    
    public kla(final lla y, final f07 f07) {
        this.y = y;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.w |= Integer.MIN_VALUE;
        return this.y.l(null, (f07)this);
    }
}
