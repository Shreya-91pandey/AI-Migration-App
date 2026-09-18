public final class vp extends h07
{
    public Object v;
    public final wp w;
    public int x;
    
    public vp(final wp w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.c(this);
    }
}
