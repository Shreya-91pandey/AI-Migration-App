public final class cr0 extends h07
{
    public String v;
    public Object w;
    public final er0 x;
    public int y;
    
    public cr0(final er0 x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.g(null, this);
    }
}
