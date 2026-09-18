public final class bw4 extends h07
{
    public Object v;
    public int w;
    public final jn3 x;
    
    public bw4(final jn3 x, final f07 f07) {
        this.x = x;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.w |= Integer.MIN_VALUE;
        return this.x.a(null, (f07)this);
    }
}
