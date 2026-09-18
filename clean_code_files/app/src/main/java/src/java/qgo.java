public final class qgo extends h07
{
    public t2k v;
    public Object w;
    public final cho x;
    public int y;
    
    public qgo(final cho x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.b(null, this);
    }
}
