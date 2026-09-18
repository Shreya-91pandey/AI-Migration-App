public final class mv7 extends h07
{
    public Object v;
    public final rv7 w;
    public int x;
    
    public mv7(final rv7 w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.g(null, this);
    }
}
