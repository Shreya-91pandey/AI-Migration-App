public final class kbg extends h07
{
    public int v;
    public Object w;
    public final lbg x;
    public int y;
    
    public kbg(final lbg x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(null, this);
    }
}
