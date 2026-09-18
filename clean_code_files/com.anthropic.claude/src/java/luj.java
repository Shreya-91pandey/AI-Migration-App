public final class luj extends h07
{
    public Object v;
    public final muj w;
    public int x;
    
    public luj(final muj w, final h07 h07) {
        this.w = w;
        super((f07)h07);
    }
    
    public final Object invokeSuspend(final Object v) {
        this.v = v;
        this.x |= Integer.MIN_VALUE;
        return this.w.n(false, null, this);
    }
}
