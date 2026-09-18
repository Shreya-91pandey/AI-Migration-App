public final class bv7 extends h07
{
    public cof v;
    public Object w;
    public final rv7 x;
    public int y;
    
    public bv7(final rv7 x, final h07 h07) {
        this.x = x;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object w) {
        this.w = w;
        this.y |= Integer.MIN_VALUE;
        return this.x.b(this);
    }
}
