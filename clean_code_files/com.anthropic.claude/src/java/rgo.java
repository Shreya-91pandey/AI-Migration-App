public final class rgo extends h07
{
    public int[] v;
    public Object w;
    public final l33 x;
    public int y;
    
    public rgo(final l33 x, final f07 f07) {
        this.x = x;
        super(f07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.a((int[])null, (f07)this);
    }
}
