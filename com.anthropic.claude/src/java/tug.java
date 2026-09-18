public final class tug extends h07
{
    public boolean v;
    public Object w;
    public final xug x;
    public int y;
    
    public tug(final xug x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.e(null, null, this);
    }
}
