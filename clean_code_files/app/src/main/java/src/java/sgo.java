public final class sgo extends h07
{
    public c2l v;
    public Object w;
    public final cho x;
    public int y;
    
    public sgo(final cho x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.c(this);
    }
}
